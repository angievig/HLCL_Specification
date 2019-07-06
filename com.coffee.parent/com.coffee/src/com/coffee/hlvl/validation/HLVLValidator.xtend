/*
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.validation

import org.eclipse.xtext.validation.Check
import com.coffee.hlvl.hLVL.HLVLPackage
import com.coffee.hlvl.hLVL.ElmDeclaration

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class HLVLValidator extends AbstractHLVLValidator {
	
		static val packageInstance = HLVLPackage.eINSTANCE
		/**
	 * Method for checking that non boolean domains are correctly declarated 
	 */
	 //private String root="";
	@Check
	def checkTypeForNonBooleanDomain(ElmDeclaration decl){
		if (decl.dataType=="boolean"){
			return
		}else{
			if (decl.declaration === null){
				error("A variants declaration is required for variable '"+decl.name+"'",
					packageInstance.elmDeclaration_Declaration)
				return
			}
		}
	}
	
}
