/**
 * generated by Xtext 2.12.0
 */
package org.xtext.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.generator.CPCode;
import org.xtext.pLhlcl.ConsExpression;
import org.xtext.pLhlcl.Constraint;
import org.xtext.pLhlcl.Expression;
import org.xtext.pLhlcl.FodaBin;
import org.xtext.pLhlcl.FodaNary;
import org.xtext.pLhlcl.FodaUN;
import org.xtext.pLhlcl.IDCons;
import org.xtext.pLhlcl.Model;
import org.xtext.pLhlcl.Rule;
import org.xtext.pLhlcl.VarDeclaration;
import org.xtext.pLhlcl.VariantDeclaration;
import org.xtext.pLhlcl.VariantsEnumeration;
import org.xtext.pLhlcl.VariantsInterval;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PLhlclGenerator extends AbstractGenerator implements CPCode {
  /**
   * Name of the PL model
   */
  private String modelName;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    this.modelName = this.modelName(((Model) _head));
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile((this.modelName + ".cp"), this.toCPHLCL(((Model) _head_1)));
  }
  
  public String modelName(final Model model) {
    String name = StringExtensions.toFirstUpper(model.getName());
    return name;
  }
  
  public CharSequence toCPHLCL(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CPCode.HEADER);
    _builder.append(" ");
    _builder.append(this.modelName);
    _builder.newLineIfNotEmpty();
    _builder.append(CPCode.VARIABLES);
    _builder.newLineIfNotEmpty();
    _builder.append("boolean ");
    _builder.append(this.modelName);
    _builder.newLineIfNotEmpty();
    {
      EList<VarDeclaration> _vars = model.getVars();
      for(final VarDeclaration v : _vars) {
        CharSequence _declareVariable = this.declareVariable(v);
        _builder.append(_declareVariable);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(CPCode.CONSTRAINTS);
    _builder.newLineIfNotEmpty();
    _builder.append("C_");
    _builder.append(this.modelName);
    _builder.append(" : ");
    _builder.append(this.modelName);
    _builder.append(" = 1");
    _builder.newLineIfNotEmpty();
    {
      EList<Constraint> _constraints = model.getConstraints();
      for(final Constraint c : _constraints) {
        String _name = c.getName();
        _builder.append(_name);
        _builder.append(": ");
        CharSequence _expression = this.getExpression(c.getExp());
        _builder.append(_expression);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence declareVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append(" ");
    CharSequence _declareVariants = this.declareVariants(variable, variable.getVariants());
    _builder.append(_declareVariants);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Method for declare variants
   */
  public CharSequence declareVariants(final VarDeclaration variable, final VariantDeclaration variant) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _type = variable.getType();
      boolean _equals = Objects.equal(_type, "boolean");
      if (_equals) {
      } else {
        {
          if ((variant instanceof VariantsInterval)) {
            _builder.append("domain: ");
            String _start = ((VariantsInterval)variant).getStart();
            _builder.append(_start);
            _builder.append("..");
            String _end = ((VariantsInterval)variant).getEnd();
            _builder.append(_end);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((variant instanceof VariantsEnumeration)) {
                _builder.append("domain: [");
                Object _list = this.getList(((VariantsEnumeration)variant).getList().getValues().getValues());
                _builder.append(_list);
                _builder.append("]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public Object getList(final EList l) {
    Object out = l.get(0);
    for (int i = 1; (i < l.size()); i = (i + 1)) {
      String _plus = (out + ", ");
      Object _get = l.get(i);
      String _plus_1 = (_plus + _get);
      out = _plus_1;
    }
    return out;
  }
  
  public CharSequence getExpression(final ConsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((exp instanceof IDCons)) {
        String _name = ((IDCons)exp).getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((exp instanceof FodaBin)) {
            CharSequence _declareFodaBin = this.declareFodaBin(((FodaBin)exp));
            _builder.append(_declareFodaBin);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((exp instanceof Rule)) {
                CharSequence _declareRule = this.declareRule(((Rule)exp));
                _builder.append(_declareRule);
                _builder.newLineIfNotEmpty();
              } else {
                {
                  if ((exp instanceof FodaNary)) {
                    CharSequence _declareNary = this.declareNary(((FodaNary)exp));
                    _builder.append(_declareNary);
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      if ((exp instanceof FodaUN)) {
                        CharSequence _declareFodaUnary = this.declareFodaUnary(((FodaUN)exp));
                        _builder.append(_declareFodaUnary);
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence declareRule(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _condition = rule.getCondition();
    final Object left = this.getExpression(((ConsExpression) _condition));
    _builder.newLineIfNotEmpty();
    Expression _consequence = rule.getConsequence();
    final Object right = this.getExpression(((ConsExpression) _consequence));
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.append(left);
    _builder.append(") => (");
    _builder.append(right);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence declareFodaBin(final FodaBin exp) {
    StringConcatenation _builder = new StringConcatenation();
    final String left = exp.getVar1().getName();
    _builder.newLineIfNotEmpty();
    final String right = exp.getVar2().getName();
    _builder.newLineIfNotEmpty();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "requires");
      if (_equals) {
        _builder.append(left);
        _builder.append(" => ");
        _builder.append(right);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "excludes");
          if (_equals_1) {
            _builder.append(left);
            _builder.append(" + ");
            _builder.append(right);
            _builder.append("<= 1");
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _op_2 = exp.getOp();
              boolean _equals_2 = Objects.equal(_op_2, "mandatory");
              if (_equals_2) {
                _builder.append(left);
                _builder.append(" = ");
                _builder.append(right);
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append(left);
                _builder.append(" >= ");
                _builder.append(right);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence declareNary(final FodaNary exp) {
    StringConcatenation _builder = new StringConcatenation();
    String idsSum = "";
    _builder.newLineIfNotEmpty();
    {
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for(final VarDeclaration child : _ids) {
        _builder.append("(");
        String _name = child.getName();
        _builder.append(_name);
        _builder.append(" => ");
        String _parent = exp.getParent();
        _builder.append(_parent);
        _builder.append(") AND");
        _builder.newLineIfNotEmpty();
        String _xblockexpression = null;
        {
          String _idsSum = idsSum;
          String _name_1 = child.getName();
          String _plus = (_name_1 + "+");
          idsSum = (_idsSum + _plus);
          _xblockexpression = "";
        }
        _builder.append(_xblockexpression);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("(");
    String _parent_1 = exp.getParent();
    _builder.append(_parent_1);
    _builder.append(">= 1) => (");
    int _length = idsSum.length();
    int _minus = (_length - 1);
    String _substring = idsSum.substring(0, _minus);
    _builder.append(_substring);
    _builder.append(" >= ");
    int _min = exp.getMin();
    _builder.append(_min);
    _builder.append(") AND");
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    String _parent_2 = exp.getParent();
    _builder.append(_parent_2);
    _builder.append(">= 1) => (");
    int _length_1 = idsSum.length();
    int _minus_1 = (_length_1 - 1);
    String _substring_1 = idsSum.substring(0, _minus_1);
    _builder.append(_substring_1);
    _builder.append(" <= ");
    int _max = exp.getMax();
    _builder.append(_max);
    _builder.append(") ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence declareFodaUnary(final FodaUN exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "optional");
      if (_equals) {
        _builder.append(this.modelName);
        _builder.append(" >= ");
        String _name = exp.getVar1().getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "mandatory");
          if (_equals_1) {
            _builder.append(this.modelName);
            _builder.append(" = ");
            String _name_1 = exp.getVar1().getName();
            _builder.append(_name_1);
            _builder.newLineIfNotEmpty();
          } else {
          }
        }
      }
    }
    return _builder;
  }
}