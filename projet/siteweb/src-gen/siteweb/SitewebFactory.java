/**
 */
package siteweb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see siteweb.SitewebPackage
 * @generated
 */
public interface SitewebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitewebFactory eINSTANCE = siteweb.impl.SitewebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Entête</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entête</em>'.
	 * @generated
	 */
	Entête createEntête();

	/**
	 * Returns a new object of class '<em>Corps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corps</em>'.
	 * @generated
	 */
	Corps createCorps();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Titre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titre</em>'.
	 * @generated
	 */
	Titre createTitre();

	/**
	 * Returns a new object of class '<em>Paragraphe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraphe</em>'.
	 * @generated
	 */
	Paragraphe createParagraphe();

	/**
	 * Returns a new object of class '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site</em>'.
	 * @generated
	 */
	Site createSite();

	/**
	 * Returns a new object of class '<em>Hyper Lien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Lien</em>'.
	 * @generated
	 */
	HyperLien createHyperLien();

	/**
	 * Returns a new object of class '<em>Boutton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boutton</em>'.
	 * @generated
	 */
	Boutton createBoutton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SitewebPackage getSitewebPackage();

} //SitewebFactory
