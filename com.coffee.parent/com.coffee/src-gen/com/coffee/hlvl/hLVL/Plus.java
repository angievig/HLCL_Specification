/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.Plus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Relational
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Relational)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Relational getLeft();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Relational value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Relational)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Relational getRight();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Relational value);

} // Plus
