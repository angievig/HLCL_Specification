/**
 * generated by Xtext 2.22.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entailed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Entailed#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getEntailed()
 * @model
 * @generated
 */
public interface Entailed extends Relational
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getEntailed_Element()
   * @model
   * @generated
   */
  ElmDeclaration getElement();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Entailed#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElmDeclaration value);

} // Entailed