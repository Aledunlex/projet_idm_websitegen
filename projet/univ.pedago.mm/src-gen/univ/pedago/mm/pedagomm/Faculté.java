/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculté</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.Faculté#getFormations <em>Formations</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Faculté#getPersonnes <em>Personnes</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.Faculté#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFaculté()
 * @model
 * @generated
 */
public interface Faculté extends EObject {
	/**
	 * Returns the value of the '<em><b>Formations</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formations</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFaculté_Formations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormations();

	/**
	 * Returns the value of the '<em><b>Personnes</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFaculté_Personnes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Personne> getPersonnes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getFaculté_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.Faculté#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Faculté
