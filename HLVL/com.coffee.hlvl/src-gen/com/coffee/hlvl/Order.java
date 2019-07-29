/**
 * generated by Xtext 2.18.0
 */
package com.coffee.hlvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Order#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.Order#getLeft <em>Left</em>}</li>
 *   <li>{@link com.coffee.hlvl.Order#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends Relation
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see com.coffee.hlvl.HlvlPackage#getOrder_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Order#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getOrder_Left()
   * @model
   * @generated
   */
  ElmDeclaration getLeft();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Order#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ElmDeclaration value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link com.coffee.hlvl.ListOfIDs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see com.coffee.hlvl.HlvlPackage#getOrder_Right()
   * @model containment="true"
   * @generated
   */
  EList<ListOfIDs> getRight();

} // Order
