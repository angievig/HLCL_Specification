/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.Number#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.coffee.pLEC.PLECPackage#getNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Number#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Number