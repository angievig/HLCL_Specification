/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.Interval#getStart <em>Start</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.Interval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends OptionsDeclaration
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getInterval_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Interval#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(int)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getInterval_End()
   * @model
   * @generated
   */
  int getEnd();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Interval#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(int value);

} // Interval
