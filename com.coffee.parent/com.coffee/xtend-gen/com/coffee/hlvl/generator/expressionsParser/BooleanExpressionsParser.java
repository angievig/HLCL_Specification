package com.coffee.hlvl.generator.expressionsParser;

import com.coffee.hlvl.generator.Dialect;
import com.coffee.hlvl.generator.expressionsParser.IBooleanExpressionsRules;
import com.coffee.hlvl.generator.expressionsParser.IExpressionsParser;
import com.coffee.hlvl.hLVL.And;
import com.coffee.hlvl.hLVL.BoolConstant;
import com.coffee.hlvl.hLVL.Iff;
import com.coffee.hlvl.hLVL.Implies;
import com.coffee.hlvl.hLVL.Negation;
import com.coffee.hlvl.hLVL.Or;
import com.coffee.hlvl.hLVL.Relational;
import com.coffee.hlvl.hLVL.VariableRef;

/**
 * Parser for boolean expressions
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
@SuppressWarnings("all")
public class BooleanExpressionsParser implements IExpressionsParser {
  /**
   * Tranformation rules
   */
  private IBooleanExpressionsRules rules;
  
  private Dialect dialect;
  
  @Override
  public void setDialect(final Dialect dialect) {
    this.dialect = dialect;
  }
  
  @Override
  public CharSequence parse(final Relational exp) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (exp instanceof BoolConstant) {
      _matched=true;
      _switchResult = ((BoolConstant)exp).getValue();
    }
    if (!_matched) {
      if (exp instanceof VariableRef) {
        _matched=true;
        _switchResult = this.rules.getVariable(((VariableRef)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Negation) {
        _matched=true;
        _switchResult = this.rules.getNegation(((Negation)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Iff) {
        _matched=true;
        _switchResult = this.rules.getIff(((Iff)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Implies) {
        _matched=true;
        _switchResult = this.rules.getImplies(((Implies)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        _switchResult = this.rules.getOr(((Or)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        _switchResult = this.rules.getAnd(((And)exp));
      }
    }
    return _switchResult;
  }
}
