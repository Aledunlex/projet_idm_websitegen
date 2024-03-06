/**
 */
package univ.pedago.mm.pedagomm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import univ.pedago.mm.pedagomm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see univ.pedago.mm.pedagomm.PedagommPackage
 * @generated
 */
public class PedagommAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PedagommPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedagommAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PedagommPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedagommSwitch<Adapter> modelSwitch = new PedagommSwitch<Adapter>() {
		@Override
		public Adapter caseMention(Mention object) {
			return createMentionAdapter();
		}

		@Override
		public Adapter caseIntervenant(Intervenant object) {
			return createIntervenantAdapter();
		}

		@Override
		public Adapter caseParcours(Parcours object) {
			return createParcoursAdapter();
		}

		@Override
		public Adapter caseResponsable(Responsable object) {
			return createResponsableAdapter();
		}

		@Override
		public Adapter casePersonne(Personne object) {
			return createPersonneAdapter();
		}

		@Override
		public Adapter caseSemestre(Semestre object) {
			return createSemestreAdapter();
		}

		@Override
		public Adapter caseFormation(Formation object) {
			return createFormationAdapter();
		}

		@Override
		public Adapter caseFaculté(Faculté object) {
			return createFacultéAdapter();
		}

		@Override
		public Adapter caseFeuilleFormation(FeuilleFormation object) {
			return createFeuilleFormationAdapter();
		}

		@Override
		public Adapter caseUE(UE object) {
			return createUEAdapter();
		}

		@Override
		public Adapter caseFeuilleContenu(FeuilleContenu object) {
			return createFeuilleContenuAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Mention <em>Mention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Mention
	 * @generated
	 */
	public Adapter createMentionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Intervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Intervenant
	 * @generated
	 */
	public Adapter createIntervenantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Parcours
	 * @generated
	 */
	public Adapter createParcoursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Responsable
	 * @generated
	 */
	public Adapter createResponsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Semestre
	 * @generated
	 */
	public Adapter createSemestreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Formation
	 * @generated
	 */
	public Adapter createFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.Faculté <em>Faculté</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.Faculté
	 * @generated
	 */
	public Adapter createFacultéAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.FeuilleFormation <em>Feuille Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.FeuilleFormation
	 * @generated
	 */
	public Adapter createFeuilleFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.UE
	 * @generated
	 */
	public Adapter createUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link univ.pedago.mm.pedagomm.FeuilleContenu <em>Feuille Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see univ.pedago.mm.pedagomm.FeuilleContenu
	 * @generated
	 */
	public Adapter createFeuilleContenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PedagommAdapterFactory
