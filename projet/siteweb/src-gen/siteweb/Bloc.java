/**
 */
package siteweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Bloc#getName <em>Name</em>}</li>
 *   <li>{@link siteweb.Bloc#getActions <em>Actions</em>}</li>
 *   <li>{@link siteweb.Bloc#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getBloc()
 * @model abstract="true"
 * @generated
 */
public interface Bloc extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see siteweb.SitewebPackage#getBloc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link siteweb.Bloc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link siteweb.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see siteweb.SitewebPackage#getBloc_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see siteweb.SitewebPackage#getBloc_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link siteweb.Bloc#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

} // Bloc
