/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL.impl;

import com.coffee.hlvl.hLVL.ElmDeclaration;
import com.coffee.hlvl.hLVL.HLVLPackage;
import com.coffee.hlvl.hLVL.Pair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.PairImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.PairImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.PairImpl#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PairImpl extends RelationImpl implements Pair
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected ElmDeclaration var1;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected ElmDeclaration var2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PairImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HLVLPackage.Literals.PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.PAIR__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration getVar1()
  {
    if (var1 != null && var1.eIsProxy())
    {
      InternalEObject oldVar1 = (InternalEObject)var1;
      var1 = (ElmDeclaration)eResolveProxy(oldVar1);
      if (var1 != oldVar1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLVLPackage.PAIR__VAR1, oldVar1, var1));
      }
    }
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration basicGetVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(ElmDeclaration newVar1)
  {
    ElmDeclaration oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.PAIR__VAR1, oldVar1, var1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration getVar2()
  {
    if (var2 != null && var2.eIsProxy())
    {
      InternalEObject oldVar2 = (InternalEObject)var2;
      var2 = (ElmDeclaration)eResolveProxy(oldVar2);
      if (var2 != oldVar2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLVLPackage.PAIR__VAR2, oldVar2, var2));
      }
    }
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration basicGetVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(ElmDeclaration newVar2)
  {
    ElmDeclaration oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.PAIR__VAR2, oldVar2, var2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HLVLPackage.PAIR__OPERATOR:
        return getOperator();
      case HLVLPackage.PAIR__VAR1:
        if (resolve) return getVar1();
        return basicGetVar1();
      case HLVLPackage.PAIR__VAR2:
        if (resolve) return getVar2();
        return basicGetVar2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HLVLPackage.PAIR__OPERATOR:
        setOperator((String)newValue);
        return;
      case HLVLPackage.PAIR__VAR1:
        setVar1((ElmDeclaration)newValue);
        return;
      case HLVLPackage.PAIR__VAR2:
        setVar2((ElmDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HLVLPackage.PAIR__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case HLVLPackage.PAIR__VAR1:
        setVar1((ElmDeclaration)null);
        return;
      case HLVLPackage.PAIR__VAR2:
        setVar2((ElmDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HLVLPackage.PAIR__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case HLVLPackage.PAIR__VAR1:
        return var1 != null;
      case HLVLPackage.PAIR__VAR2:
        return var2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PairImpl
