/**
 */
package univ.pedago.mm.pedagomm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import univ.pedago.mm.pedagomm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PedagommFactoryImpl extends EFactoryImpl implements PedagommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PedagommFactory init() {
		try {
			PedagommFactory thePedagommFactory = (PedagommFactory) EPackage.Registry.INSTANCE
					.getEFactory(PedagommPackage.eNS_URI);
			if (thePedagommFactory != null) {
				return thePedagommFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PedagommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedagommFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PedagommPackage.MENTION:
			return createMention();
		case PedagommPackage.INTERVENANT:
			return createIntervenant();
		case PedagommPackage.PARCOURS:
			return createParcours();
		case PedagommPackage.RESPONSABLE:
			return createResponsable();
		case PedagommPackage.SEMESTRE:
			return createSemestre();
		case PedagommPackage.FORMATION:
			return createFormation();
		case PedagommPackage.FACULTÉ:
			return createFaculté();
		case PedagommPackage.FEUILLE_FORMATION:
			return createFeuilleFormation();
		case PedagommPackage.UE:
			return createUE();
		case PedagommPackage.FEUILLE_CONTENU:
			return createFeuilleContenu();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mention createMention() {
		MentionImpl mention = new MentionImpl();
		return mention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant createIntervenant() {
		IntervenantImpl intervenant = new IntervenantImpl();
		return intervenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parcours createParcours() {
		ParcoursImpl parcours = new ParcoursImpl();
		return parcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable createResponsable() {
		ResponsableImpl responsable = new ResponsableImpl();
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semestre createSemestre() {
		SemestreImpl semestre = new SemestreImpl();
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculté createFaculté() {
		FacultéImpl faculté = new FacultéImpl();
		return faculté;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeuilleFormation createFeuilleFormation() {
		FeuilleFormationImpl feuilleFormation = new FeuilleFormationImpl();
		return feuilleFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UE createUE() {
		UEImpl ue = new UEImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeuilleContenu createFeuilleContenu() {
		FeuilleContenuImpl feuilleContenu = new FeuilleContenuImpl();
		return feuilleContenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedagommPackage getPedagommPackage() {
		return (PedagommPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PedagommPackage getPackage() {
		return PedagommPackage.eINSTANCE;
	}

} //PedagommFactoryImpl
