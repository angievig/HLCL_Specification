/**
 * generated by Xtext 2.22.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Instances#getElement <em>Element</em>}</li>
 *   <li>{@link com.coffee.hlvl.Instances#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getInstances()
 * @model
 * @generated
 */
public interface Instances extends Relational
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getInstances_Element()
   * @model
   * @generated
   */
  ElmDeclaration getElement();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Instances#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElmDeclaration value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see com.coffee.hlvl.HlvlPackage#getInstances_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Instances#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

} // Instances