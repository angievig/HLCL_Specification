package com.coffee.generator
import com.coffee.pLEC.Model
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.ConsExpression
import com.coffee.pLEC.Rule
import com.coffee.pLEC.Structural
import com.coffee.pLEC.FodaBin
import com.coffee.pLEC.FodaUN
import com.coffee.pLEC.Attributes
import java.util.Map

/**
 * Interface to define the methods a code generator for the PLEC language
 * should implement, all generators implementation implement this interface
 * implemented by (THLCLGenerator, XCSP3Generator)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */

interface Generator {

	def  CharSequence parseModel(Model model);
	def  CharSequence parseVariables(Model model);
	
	def  CharSequence parseConstraints(Model model);
	def  CharSequence parseConstraint(String id, ConsExpression exp);
	def  CharSequence parseExpression(ConsExpression exp);
	def  CharSequence parseRule(Rule rule);
	def  CharSequence parseStructuralNoCard(Structural exp);
	def  CharSequence parseStructuralCard(Structural exp);
	def  CharSequence parseFodaBinary(FodaBin exp);
	def  CharSequence parseFodaUnary(FodaUN exp);
	def  CharSequence parseAttributes(Attributes exp);

	
	def  String getModelName();
	def  TypeOfProblem getTypeOfProblem();
	def  void addParents(Structural exp);
	def  Map <String, VarDeclaration> getParents();
	def  CharSequence putAutogeneratedVars();
	def  CharSequence putAutogeneratedCons();
	def void setFactory( CodeFactory factory)
	
	
	
	
}