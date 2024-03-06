/**
 */
package siteweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Page#getCorps <em>Corps</em>}</li>
 *   <li>{@link siteweb.Page#getEntête <em>Entête</em>}</li>
 *   <li>{@link siteweb.Page#getTitre <em>Titre</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Corps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corps</em>' containment reference.
	 * @see #setCorps(Corps)
	 * @see siteweb.SitewebPackage#getPage_Corps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Corps getCorps();

	/**
	 * Sets the value of the '{@link siteweb.Page#getCorps <em>Corps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corps</em>' containment reference.
	 * @see #getCorps()
	 * @generated
	 */
	void setCorps(Corps value);

	/**
	 * Returns the value of the '<em><b>Entête</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entête</em>' containment reference.
	 * @see #setEntête(Entête)
	 * @see siteweb.SitewebPackage#getPage_Entête()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entête getEntête();

	/**
	 * Sets the value of the '{@link siteweb.Page#getEntête <em>Entête</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entête</em>' containment reference.
	 * @see #getEntête()
	 * @generated
	 */
	void setEntête(Entête value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see siteweb.SitewebPackage#getPage_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link siteweb.Page#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

} // Page
