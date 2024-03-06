/**
 */
package siteweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Action#getPage <em>Page</em>}</li>
 *   <li>{@link siteweb.Action#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see siteweb.SitewebPackage#getAction_Page()
	 * @model
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link siteweb.Action#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see siteweb.SitewebPackage#getAction_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link siteweb.Action#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

} // Action
