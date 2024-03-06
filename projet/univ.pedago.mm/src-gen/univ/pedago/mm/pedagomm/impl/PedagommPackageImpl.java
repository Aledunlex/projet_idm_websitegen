/**
 */
package univ.pedago.mm.pedagomm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import univ.pedago.mm.pedagomm.Faculté;
import univ.pedago.mm.pedagomm.FeuilleContenu;
import univ.pedago.mm.pedagomm.FeuilleFormation;
import univ.pedago.mm.pedagomm.Formation;
import univ.pedago.mm.pedagomm.Intervenant;
import univ.pedago.mm.pedagomm.Mention;
import univ.pedago.mm.pedagomm.Parcours;
import univ.pedago.mm.pedagomm.PedagommFactory;
import univ.pedago.mm.pedagomm.PedagommPackage;
import univ.pedago.mm.pedagomm.Personne;
import univ.pedago.mm.pedagomm.Responsable;
import univ.pedago.mm.pedagomm.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PedagommPackageImpl extends EPackageImpl implements PedagommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervenantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcoursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facultéEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feuilleFormationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feuilleContenuEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see univ.pedago.mm.pedagomm.PedagommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PedagommPackageImpl() {
		super(eNS_URI, PedagommFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PedagommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PedagommPackage init() {
		if (isInited)
			return (PedagommPackage) EPackage.Registry.INSTANCE.getEPackage(PedagommPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPedagommPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PedagommPackageImpl thePedagommPackage = registeredPedagommPackage instanceof PedagommPackageImpl
				? (PedagommPackageImpl) registeredPedagommPackage
				: new PedagommPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePedagommPackage.createPackageContents();

		// Initialize created meta-data
		thePedagommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePedagommPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PedagommPackage.eNS_URI, thePedagommPackage);
		return thePedagommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMention() {
		return mentionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_Parcours() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMention_Name() {
		return (EAttribute) mentionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_Responsables() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMention_FeuilleContenus() {
		return (EReference) mentionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervenant() {
		return intervenantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcours() {
		return parcoursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_Semestres() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcours_Name() {
		return (EAttribute) parcoursEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_Responsables() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcours_FeuilleContenus() {
		return (EReference) parcoursEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsable() {
		return responsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Name() {
		return (EAttribute) personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemestre() {
		return semestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Ues() {
		return (EReference) semestreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemestre_Name() {
		return (EAttribute) semestreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_FeuilleContenus() {
		return (EReference) semestreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Name() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Mentions() {
		return (EReference) formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_FeuilleContenus() {
		return (EReference) formationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaculté() {
		return facultéEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaculté_Formations() {
		return (EReference) facultéEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaculté_Personnes() {
		return (EReference) facultéEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaculté_Name() {
		return (EAttribute) facultéEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeuilleFormation() {
		return feuilleFormationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeuilleFormation_Contenu() {
		return (EAttribute) feuilleFormationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUE() {
		return ueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Personnes() {
		return (EReference) ueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Name() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_FeuilleContenus() {
		return (EReference) ueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeuilleContenu() {
		return feuilleContenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeuilleContenu_Name() {
		return (EAttribute) feuilleContenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeuilleContenu_Content() {
		return (EAttribute) feuilleContenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedagommFactory getPedagommFactory() {
		return (PedagommFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		mentionEClass = createEClass(MENTION);
		createEReference(mentionEClass, MENTION__PARCOURS);
		createEAttribute(mentionEClass, MENTION__NAME);
		createEReference(mentionEClass, MENTION__RESPONSABLES);
		createEReference(mentionEClass, MENTION__FEUILLE_CONTENUS);

		intervenantEClass = createEClass(INTERVENANT);

		parcoursEClass = createEClass(PARCOURS);
		createEReference(parcoursEClass, PARCOURS__SEMESTRES);
		createEAttribute(parcoursEClass, PARCOURS__NAME);
		createEReference(parcoursEClass, PARCOURS__RESPONSABLES);
		createEReference(parcoursEClass, PARCOURS__FEUILLE_CONTENUS);

		responsableEClass = createEClass(RESPONSABLE);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NAME);

		semestreEClass = createEClass(SEMESTRE);
		createEReference(semestreEClass, SEMESTRE__UES);
		createEAttribute(semestreEClass, SEMESTRE__NAME);
		createEReference(semestreEClass, SEMESTRE__FEUILLE_CONTENUS);

		formationEClass = createEClass(FORMATION);
		createEAttribute(formationEClass, FORMATION__NAME);
		createEReference(formationEClass, FORMATION__MENTIONS);
		createEReference(formationEClass, FORMATION__FEUILLE_CONTENUS);

		facultéEClass = createEClass(FACULTÉ);
		createEReference(facultéEClass, FACULTÉ__FORMATIONS);
		createEReference(facultéEClass, FACULTÉ__PERSONNES);
		createEAttribute(facultéEClass, FACULTÉ__NAME);

		feuilleFormationEClass = createEClass(FEUILLE_FORMATION);
		createEAttribute(feuilleFormationEClass, FEUILLE_FORMATION__CONTENU);

		ueEClass = createEClass(UE);
		createEReference(ueEClass, UE__PERSONNES);
		createEAttribute(ueEClass, UE__NAME);
		createEReference(ueEClass, UE__FEUILLE_CONTENUS);

		feuilleContenuEClass = createEClass(FEUILLE_CONTENU);
		createEAttribute(feuilleContenuEClass, FEUILLE_CONTENU__NAME);
		createEAttribute(feuilleContenuEClass, FEUILLE_CONTENU__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intervenantEClass.getESuperTypes().add(this.getPersonne());
		responsableEClass.getESuperTypes().add(this.getPersonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(mentionEClass, Mention.class, "Mention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMention_Parcours(), this.getParcours(), null, "parcours", null, 0, -1, Mention.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMention_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mention.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_Responsables(), this.getResponsable(), null, "responsables", null, 0, -1,
				Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMention_FeuilleContenus(), this.getFeuilleContenu(), null, "feuilleContenus", null, 0, -1,
				Mention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervenantEClass, Intervenant.class, "Intervenant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parcoursEClass, Parcours.class, "Parcours", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParcours_Semestres(), this.getSemestre(), null, "semestres", null, 0, -1, Parcours.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcours_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parcours.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcours_Responsables(), this.getResponsable(), null, "responsables", null, 0, -1,
				Parcours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcours_FeuilleContenus(), this.getFeuilleContenu(), null, "feuilleContenus", null, 0, -1,
				Parcours.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsableEClass, Responsable.class, "Responsable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(personneEClass, Personne.class, "Personne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Name(), ecorePackage.getEString(), "name", null, 0, 1, Personne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semestreEClass, Semestre.class, "Semestre", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemestre_Ues(), this.getUE(), null, "ues", null, 0, -1, Semestre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSemestre_Name(), ecorePackage.getEString(), "name", null, 0, 1, Semestre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_FeuilleContenus(), this.getFeuilleContenu(), null, "feuilleContenus", null, 0, -1,
				Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Mentions(), this.getMention(), null, "mentions", null, 1, -1, Formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_FeuilleContenus(), this.getFeuilleContenu(), null, "feuilleContenus", null, 0, -1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facultéEClass, Faculté.class, "Faculté", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaculté_Formations(), this.getFormation(), null, "formations", null, 1, -1, Faculté.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaculté_Personnes(), this.getPersonne(), null, "personnes", null, 1, -1, Faculté.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaculté_Name(), ecorePackage.getEString(), "name", null, 0, 1, Faculté.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feuilleFormationEClass, FeuilleFormation.class, "FeuilleFormation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeuilleFormation_Contenu(), ecorePackage.getEString(), "contenu", null, 0, 1,
				FeuilleFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ueEClass, univ.pedago.mm.pedagomm.UE.class, "UE", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUE_Personnes(), this.getPersonne(), null, "personnes", null, 0, -1,
				univ.pedago.mm.pedagomm.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Name(), ecorePackage.getEString(), "name", null, 0, 1, univ.pedago.mm.pedagomm.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_FeuilleContenus(), this.getFeuilleContenu(), null, "feuilleContenus", null, 0, -1,
				univ.pedago.mm.pedagomm.UE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feuilleContenuEClass, FeuilleContenu.class, "FeuilleContenu", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeuilleContenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeuilleContenu.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeuilleContenu_Content(), ecorePackage.getEString(), "content", null, 0, 1,
				FeuilleContenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PedagommPackageImpl
