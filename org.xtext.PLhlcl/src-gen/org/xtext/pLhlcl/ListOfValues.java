/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pLhlcl.ListOfValues#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.pLhlcl.PLhlclPackage#getListOfValues()
 * @model
 * @generated
 */
public interface ListOfValues extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pLhlcl.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.pLhlcl.PLhlclPackage#getListOfValues_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // ListOfValues
