package com.coffee.generator.XCSP3


import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.VarDeclaration
import com.coffee.pLEC.Structural
import java.util.Map
import java.util.ArrayList

class CSPFactory  extends XCSP3Factory{
	/**
	 * List with the constraints autogenerated for dealing with feature instances
	 */
	private ArrayList <String> clonConstraints;

	
	new(TypeOfProblem type) {
		super(type)
		//initializing the list of autogenerated constraints
		clonConstraints= new ArrayList<String>;	
	}
	
	override getVariable(VarDeclaration variable) {
		'''
		<var id="«variable.name»">«valuesDeclaration(variable, variable.variants)»</var>
		«IF  (!(variable.min===null && variable.max===null)) »
					«parseCloneVariables(variable)»	
				«ENDIF»
		'''
	}
	def parseCloneVariables(VarDeclaration variable) {
		var String declaration=""
		var String left= ""
		var String right= ""
		var String sum= "add("
		
		for ( var i=1; i<= variable.max.value; i= i+1) {
			declaration+='''<var id= "«variable.name+i»">" 0 1 </var>''' 
			sum+= ''' «variable.name+i», '''
			var  implies=  '''imp(«variable.name+i», «variable.name»)'''
			clonConstraints.add(implies)
		}
		left = '''le(«variable.min.value», «sum.substring(0, sum.length() - 2)»)''' 
		right ='''ge(«variable.max.value»,«sum.substring(0, sum.length() - 2)»)''' 
		var String constraint='''imp(«variable.name», and(«left», «right»))'''
		clonConstraints.add(constraint)
		declaration
	}
	
	override getOptional(VarDeclaration parent, VarDeclaration child) {
		'''ge(«parent.name», «child.name»)'''
	}
	
	override getMandatory(VarDeclaration parent, VarDeclaration child) {
		'''eq(«parent.name», «child.name»)'''
	}
	
	override getExcludes(VarDeclaration left, VarDeclaration right) {
		'''le(add(«left.name», «right.name»), 1) '''
	}
	
	override getRequires(VarDeclaration left, VarDeclaration right) {
		'''imp(«left.name»,gt(«right.name»,1) )'''
	}
	
	override getGroupCardinality(Structural exp, Map<String, VarDeclaration> parents) {
		var idsSum="add("
		var implies=""
		var output ='''and('''
		for (child : exp.group.ids) {
			implies += '''imp(«child.name», «exp.parent.name»),'''
			idsSum+= child.name +", "
			parents.put(child.name, exp.parent)
		}
		val sumLessThan = '''le(«idsSum.substring(0, idsSum.length() - 2)»), «exp.min.value»)''' 
		val sumGreaterThan ='''ge(«idsSum.substring(0, idsSum.length() - 2)»), «exp.max.value»)'''
		output+= '''«implies» imp(ge(«exp.parent.name», 1), and(«sumLessThan», «sumGreaterThan»)) )'''

	}
	
	
	
}