/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feuille Contenu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.FeuilleContenu#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.FeuilleContenu#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFeuilleContenu()
 * @model
 * @generated
 */
public interface FeuilleContenu extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFeuilleContenu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.FeuilleContenu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFeuilleContenu_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.FeuilleContenu#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // FeuilleContenu
