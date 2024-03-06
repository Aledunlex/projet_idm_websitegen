/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see univ.pedago.mm.pedagomm.PedagommPackage
 * @generated
 */
public interface PedagommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PedagommFactory eINSTANCE = univ.pedago.mm.pedagomm.impl.PedagommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mention</em>'.
	 * @generated
	 */
	Mention createMention();

	/**
	 * Returns a new object of class '<em>Intervenant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervenant</em>'.
	 * @generated
	 */
	Intervenant createIntervenant();

	/**
	 * Returns a new object of class '<em>Parcours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parcours</em>'.
	 * @generated
	 */
	Parcours createParcours();

	/**
	 * Returns a new object of class '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsable</em>'.
	 * @generated
	 */
	Responsable createResponsable();

	/**
	 * Returns a new object of class '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semestre</em>'.
	 * @generated
	 */
	Semestre createSemestre();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>Faculté</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Faculté</em>'.
	 * @generated
	 */
	Faculté createFaculté();

	/**
	 * Returns a new object of class '<em>Feuille Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feuille Formation</em>'.
	 * @generated
	 */
	FeuilleFormation createFeuilleFormation();

	/**
	 * Returns a new object of class '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UE</em>'.
	 * @generated
	 */
	UE createUE();

	/**
	 * Returns a new object of class '<em>Feuille Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feuille Contenu</em>'.
	 * @generated
	 */
	FeuilleContenu createFeuilleContenu();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PedagommPackage getPedagommPackage();

} //PedagommFactory
