/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.Parcours#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Parcours#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Parcours#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Parcours#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @see univ.pedago.mm.pedagomm.PedagommPackage#getParcours()
 * @model
 * @generated
 */
public interface Parcours extends EObject {
	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getParcours_Semestres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getParcours_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.Parcours#getName <em>Name</em>}' attribute.
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
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getParcours_Responsables()
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
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getParcours_FeuilleContenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeuilleContenu> getFeuilleContenus();

} // Parcours
