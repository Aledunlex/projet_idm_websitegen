/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.UE#getPersonnes <em>Personnes</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.UE#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.UE#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @see univ.pedago.mm.pedagomm.PedagommPackage#getUE()
 * @model
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Personnes</b></em>' reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.Personne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getUE_Personnes()
	 * @model
	 * @generated
	 */
	EList<Personne> getPersonnes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getUE_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link univ.pedago.mm.pedagomm.UE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * The list contents are of type {@link univ.pedago.mm.pedagomm.FeuilleContenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feuille Contenus</em>' containment reference list.
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#getUE_FeuilleContenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeuilleContenu> getFeuilleContenus();

} // UE
