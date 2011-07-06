/**
 * <copyright>
 * </copyright>
 *

 */
package org.wesnoth.wml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WML Preproc IF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wesnoth.wml.WMLPreprocIF#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLPreprocIF#getElses <em>Elses</em>}</li>
 *   <li>{@link org.wesnoth.wml.WMLPreprocIF#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wesnoth.wml.WmlPackage#getWMLPreprocIF()
 * @model
 * @generated
 */
public interface WMLPreprocIF extends WMLRootExpression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.wesnoth.wml.WMLValuedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.wesnoth.wml.WmlPackage#getWMLPreprocIF_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<WMLValuedExpression> getExpressions();

  /**
   * Returns the value of the '<em><b>Elses</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elses</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elses</em>' attribute list.
   * @see org.wesnoth.wml.WmlPackage#getWMLPreprocIF_Elses()
   * @model unique="false"
   * @generated
   */
  EList<String> getElses();

  /**
   * Returns the value of the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Name</em>' attribute.
   * @see #setEndName(String)
   * @see org.wesnoth.wml.WmlPackage#getWMLPreprocIF_EndName()
   * @model
   * @generated
   */
  String getEndName();

  /**
   * Sets the value of the '{@link org.wesnoth.wml.WMLPreprocIF#getEndName <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Name</em>' attribute.
   * @see #getEndName()
   * @generated
   */
  void setEndName(String value);

} // WMLPreprocIF
