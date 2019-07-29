/**
 * generated by Xtext 2.18.0
 */
package com.coffee.hlvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.NamedItem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getNamedItem()
 * @model
 * @generated
 */
public interface NamedItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.coffee.hlvl.HlvlPackage#getNamedItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.NamedItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NamedItem
