/**
 * generated by Xtext 2.18.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.AttributeRef#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getAttributeRef()
 * @model
 * @generated
 */
public interface AttributeRef extends Relational
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(QualifiedName)
   * @see com.coffee.hlvl.HlvlPackage#getAttributeRef_Attribute()
   * @model containment="true"
   * @generated
   */
  QualifiedName getAttribute();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.AttributeRef#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(QualifiedName value);

} // AttributeRef
