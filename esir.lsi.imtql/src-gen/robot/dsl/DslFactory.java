/**
 */
package robot.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robot.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = robot.dsl.impl.DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Fonctionnalite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fonctionnalite</em>'.
   * @generated
   */
  Fonctionnalite createFonctionnalite();

  /**
   * Returns a new object of class '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device</em>'.
   * @generated
   */
  Device createDevice();

  /**
   * Returns a new object of class '<em>IDevice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IDevice</em>'.
   * @generated
   */
  IDevice createIDevice();

  /**
   * Returns a new object of class '<em>EJava Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EJava Object</em>'.
   * @generated
   */
  EJavaObject createEJavaObject();

  /**
   * Returns a new object of class '<em>Parametre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parametre</em>'.
   * @generated
   */
  Parametre createParametre();

  /**
   * Returns a new object of class '<em>Capture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capture</em>'.
   * @generated
   */
  Capture createCapture();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object</em>'.
   * @generated
   */
  Object createObject();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory
