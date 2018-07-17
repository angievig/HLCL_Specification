/**
 * generated by Xtext 2.12.0
 */
package org.xtext.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.pLhlcl.Model;
import org.xtext.tests.PLhlclInjectorProvider;

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version CP-HLCL V2
 * July 2018
 */
@RunWith(XtextRunner.class)
@InjectWith(PLhlclInjectorProvider.class)
@SuppressWarnings("all")
public class TransformationTests {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ParseHelper _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  /**
   * Method to test the interpretation of an empty program
   */
  @Test
  public void FODA() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model GPL");
      _builder.newLine();
      _builder.append("variables:");
      _builder.newLine();
      _builder.append("boolean GType");
      _builder.newLine();
      _builder.append("boolean Weight");
      _builder.newLine();
      _builder.append("boolean Search");
      _builder.newLine();
      _builder.append("boolean Algorithms");
      _builder.newLine();
      _builder.append("boolean Directed");
      _builder.newLine();
      _builder.append("boolean Undirected");
      _builder.newLine();
      _builder.append("boolean Weighted");
      _builder.newLine();
      _builder.append("boolean Unweighted");
      _builder.newLine();
      _builder.append("boolean BFS");
      _builder.newLine();
      _builder.append("boolean DFS");
      _builder.newLine();
      _builder.append("boolean Kruskal");
      _builder.newLine();
      _builder.append("boolean CycleCheck");
      _builder.newLine();
      _builder.append("boolean StronglyCon");
      _builder.newLine();
      _builder.append("boolean VertexNum");
      _builder.newLine();
      _builder.append("boolean ConnComp");
      _builder.newLine();
      _builder.append("boolean SSP");
      _builder.newLine();
      _builder.append("boolean Prim");
      _builder.newLine();
      _builder.append("constraints:");
      _builder.newLine();
      _builder.append("//Hierarchical constraints");
      _builder.newLine();
      _builder.append("c1: structural: GPL variants: [GType, Weight, Search, Algorithms]");
      _builder.newLine();
      _builder.append("c2: GType is mandatory");
      _builder.newLine();
      _builder.append("c3: Algorithms is mandatory");
      _builder.newLine();
      _builder.append("c4: Weight is optional");
      _builder.newLine();
      _builder.append("c5: Search is optional");
      _builder.newLine();
      _builder.append("// Alternative");
      _builder.newLine();
      _builder.append("c6: structural: GType variants: [Directed, Undirected] card: [1,1]");
      _builder.newLine();
      _builder.append("c7: structural: Weight variants: [Weighted, Unweighted] card: [1,1]");
      _builder.newLine();
      _builder.append("c8: structural: Search variants: [BFS, DFS] card: [1,1]");
      _builder.newLine();
      _builder.append("// Or");
      _builder.newLine();
      _builder.append("c9: structural: Algorithms variants: [Kruskal, CycleCheck, StronglyCon, VertexNum, ConnComp, SSP, Prim] card: [0,7] ");
      _builder.newLine();
      _builder.append("// Traversal constraints");
      _builder.newLine();
      _builder.append("//requieres");
      _builder.newLine();
      _builder.append("c10: CycleCheck requires DFS");
      _builder.newLine();
      _builder.append("C11: StronglyCon requires Directed");
      _builder.newLine();
      _builder.append("C12: StronglyCon requires DFS");
      _builder.newLine();
      _builder.append("C13: VertexNum requires Search");
      _builder.newLine();
      _builder.append("C14: ConnComp requires Undirected");
      _builder.newLine();
      _builder.append("C15: Kruskal requires Undirected");
      _builder.newLine();
      _builder.append("C16: Kruskal requires Weighted");
      _builder.newLine();
      _builder.append("C17: Prim requires  Undirected");
      _builder.newLine();
      _builder.append("C18: Prim requires Weighted");
      _builder.newLine();
      _builder.append("C19: SSP requires Directed");
      _builder.newLine();
      _builder.append("C20: SSP requires Weighted ");
      _builder.newLine();
      _builder.append("//excludes");
      _builder.newLine();
      _builder.append("C21: StronglyCon excludes ConnComp");
      _builder.newLine();
      _builder.append("C22: StronglyCon excludes Kruskal");
      _builder.newLine();
      _builder.append("C23: StronglyCon excludes Prim");
      _builder.newLine();
      _builder.append("C24: SSP excludes ConnComp");
      _builder.newLine();
      _builder.append("C25: SSP excludes Kruskal");
      _builder.newLine();
      _builder.append("C26: SSP excludes Prim ");
      _builder.newLine();
      final String program = _builder.toString();
      final Model model = this.parseHelper.parse(program);
      Assert.assertNotNull(model);
      Assert.assertTrue(model.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * to print the parsing errors
   */
  public void printErrors(final Model model) {
    boolean _isEmpty = model.eResource().getErrors().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Resource.Diagnostic> _errors = model.eResource().getErrors();
      for (final Resource.Diagnostic element : _errors) {
        InputOutput.<String>println(element.getMessage());
      }
    }
  }
}
