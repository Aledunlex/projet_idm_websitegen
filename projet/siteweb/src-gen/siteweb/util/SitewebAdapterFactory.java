/**
 */
package siteweb.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import siteweb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see siteweb.SitewebPackage
 * @generated
 */
public class SitewebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitewebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitewebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SitewebPackage.eINSTANCE;
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
	protected SitewebSwitch<Adapter> modelSwitch = new SitewebSwitch<Adapter>() {
		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseEntête(Entête object) {
			return createEntêteAdapter();
		}

		@Override
		public Adapter caseCorps(Corps object) {
			return createCorpsAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseBloc(Bloc object) {
			return createBlocAdapter();
		}

		@Override
		public Adapter caseTitre(Titre object) {
			return createTitreAdapter();
		}

		@Override
		public Adapter caseParagraphe(Paragraphe object) {
			return createParagrapheAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseSite(Site object) {
			return createSiteAdapter();
		}

		@Override
		public Adapter caseHyperLien(HyperLien object) {
			return createHyperLienAdapter();
		}

		@Override
		public Adapter caseBoutton(Boutton object) {
			return createBouttonAdapter();
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
	 * Creates a new adapter for an object of class '{@link siteweb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Entête <em>Entête</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Entête
	 * @generated
	 */
	public Adapter createEntêteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Corps <em>Corps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Corps
	 * @generated
	 */
	public Adapter createCorpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Bloc
	 * @generated
	 */
	public Adapter createBlocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Titre
	 * @generated
	 */
	public Adapter createTitreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Paragraphe
	 * @generated
	 */
	public Adapter createParagrapheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.HyperLien <em>Hyper Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.HyperLien
	 * @generated
	 */
	public Adapter createHyperLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteweb.Boutton <em>Boutton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteweb.Boutton
	 * @generated
	 */
	public Adapter createBouttonAdapter() {
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

} //SitewebAdapterFactory
