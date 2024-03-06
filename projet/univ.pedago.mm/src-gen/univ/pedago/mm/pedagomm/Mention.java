/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.Mention#getParcours <em>Parcours</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Mention#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Mention#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Mention#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @see univ.pedago.mm.pedagomm.PedagommPackage#getMention()
 * @model
 * @generated
 */
public interface Mention extends EObject {
	/**
	 * Returns the value of the '<em><b>Parcours</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Parcours}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcours</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getMention_Parcours()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parcours> getParcours();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getMention_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.Mention#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsables</b></em>' reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Responsable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsables</em>' reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getMention_Responsables()
	 * @model
	 * @generated
	 */
	EList<Responsable> getResponsables();

	/**
	 * Returns the value of the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.FeuilleContenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feuille Contenus</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getMention_FeuilleContenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeuilleContenu> getFeuilleContenus();

} // Mention
