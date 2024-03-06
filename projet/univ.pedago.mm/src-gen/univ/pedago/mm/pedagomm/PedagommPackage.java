/**
 */
package univ.pedago.mm.pedagomm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see univ.pedago.mm.pedagomm.PedagommFactory
 * @model kind="package"
 * @generated
 */
public interface PedagommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pedagomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pedagomm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pedagomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PedagommPackage eINSTANCE = univ.pedago.mm.pedagomm.impl.PedagommPackageImpl.init();

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.MentionImpl <em>Mention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.MentionImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getMention()
	 * @generated
	 */
	int MENTION = 0;

	/**
	 * The feature id for the '<em><b>Parcours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__PARCOURS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Responsables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__RESPONSABLES = 2;

	/**
	 * The feature id for the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__FEUILLE_CONTENUS = 3;

	/**
	 * The number of structural features of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.PersonneImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.IntervenantImpl <em>Intervenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.IntervenantImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getIntervenant()
	 * @generated
	 */
	int INTERVENANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__NAME = PERSONNE__NAME;

	/**
	 * The number of structural features of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl <em>Parcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.ParcoursImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getParcours()
	 * @generated
	 */
	int PARCOURS = 2;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__SEMESTRES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Responsables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__RESPONSABLES = 2;

	/**
	 * The feature id for the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__FEUILLE_CONTENUS = 3;

	/**
	 * The number of structural features of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.ResponsableImpl <em>Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.ResponsableImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getResponsable()
	 * @generated
	 */
	int RESPONSABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__NAME = PERSONNE__NAME;

	/**
	 * The number of structural features of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.SemestreImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 5;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__FEUILLE_CONTENUS = 2;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.FormationImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mentions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__MENTIONS = 1;

	/**
	 * The feature id for the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__FEUILLE_CONTENUS = 2;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.FacultéImpl <em>Faculté</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.FacultéImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFaculté()
	 * @generated
	 */
	int FACULTÉ = 7;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTÉ__FORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTÉ__PERSONNES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTÉ__NAME = 2;

	/**
	 * The number of structural features of the '<em>Faculté</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTÉ_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Faculté</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTÉ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.FeuilleFormationImpl <em>Feuille Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.FeuilleFormationImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFeuilleFormation()
	 * @generated
	 */
	int FEUILLE_FORMATION = 8;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_FORMATION__CONTENU = 0;

	/**
	 * The number of structural features of the '<em>Feuille Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_FORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feuille Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.UEImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getUE()
	 * @generated
	 */
	int UE = 9;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PERSONNES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Feuille Contenus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__FEUILLE_CONTENUS = 2;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link univ.pedago.mm.pedagomm.impl.FeuilleContenuImpl <em>Feuille Contenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see univ.pedago.mm.pedagomm.impl.FeuilleContenuImpl
	 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFeuilleContenu()
	 * @generated
	 */
	int FEUILLE_CONTENU = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_CONTENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_CONTENU__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Feuille Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_CONTENU_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feuille Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEUILLE_CONTENU_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Mention <em>Mention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mention</em>'.
	 * @see univ.pedago.mm.pedagomm.Mention
	 * @generated
	 */
	EClass getMention();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Mention#getParcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcours</em>'.
	 * @see univ.pedago.mm.pedagomm.Mention#getParcours()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_Parcours();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Mention#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Mention#getName()
	 * @see #getMention()
	 * @generated
	 */
	EAttribute getMention_Name();

	/**
	 * Returns the meta object for the reference list '{@link univ.pedago.mm.pedagomm.Mention#getResponsables <em>Responsables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsables</em>'.
	 * @see univ.pedago.mm.pedagomm.Mention#getResponsables()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_Responsables();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Mention#getFeuilleContenus <em>Feuille Contenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feuille Contenus</em>'.
	 * @see univ.pedago.mm.pedagomm.Mention#getFeuilleContenus()
	 * @see #getMention()
	 * @generated
	 */
	EReference getMention_FeuilleContenus();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Intervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervenant</em>'.
	 * @see univ.pedago.mm.pedagomm.Intervenant
	 * @generated
	 */
	EClass getIntervenant();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcours</em>'.
	 * @see univ.pedago.mm.pedagomm.Parcours
	 * @generated
	 */
	EClass getParcours();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Parcours#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestres</em>'.
	 * @see univ.pedago.mm.pedagomm.Parcours#getSemestres()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_Semestres();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Parcours#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Parcours#getName()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Name();

	/**
	 * Returns the meta object for the reference list '{@link univ.pedago.mm.pedagomm.Parcours#getResponsables <em>Responsables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsables</em>'.
	 * @see univ.pedago.mm.pedagomm.Parcours#getResponsables()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_Responsables();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Parcours#getFeuilleContenus <em>Feuille Contenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feuille Contenus</em>'.
	 * @see univ.pedago.mm.pedagomm.Parcours#getFeuilleContenus()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_FeuilleContenus();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsable</em>'.
	 * @see univ.pedago.mm.pedagomm.Responsable
	 * @generated
	 */
	EClass getResponsable();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see univ.pedago.mm.pedagomm.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Personne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Personne#getName()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Name();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see univ.pedago.mm.pedagomm.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Semestre#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ues</em>'.
	 * @see univ.pedago.mm.pedagomm.Semestre#getUes()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ues();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Semestre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Semestre#getName()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Semestre#getFeuilleContenus <em>Feuille Contenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feuille Contenus</em>'.
	 * @see univ.pedago.mm.pedagomm.Semestre#getFeuilleContenus()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_FeuilleContenus();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see univ.pedago.mm.pedagomm.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Formation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Formation#getName()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Formation#getMentions <em>Mentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mentions</em>'.
	 * @see univ.pedago.mm.pedagomm.Formation#getMentions()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Mentions();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Formation#getFeuilleContenus <em>Feuille Contenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feuille Contenus</em>'.
	 * @see univ.pedago.mm.pedagomm.Formation#getFeuilleContenus()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_FeuilleContenus();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.Faculté <em>Faculté</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculté</em>'.
	 * @see univ.pedago.mm.pedagomm.Faculté
	 * @generated
	 */
	EClass getFaculté();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Faculté#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formations</em>'.
	 * @see univ.pedago.mm.pedagomm.Faculté#getFormations()
	 * @see #getFaculté()
	 * @generated
	 */
	EReference getFaculté_Formations();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.Faculté#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnes</em>'.
	 * @see univ.pedago.mm.pedagomm.Faculté#getPersonnes()
	 * @see #getFaculté()
	 * @generated
	 */
	EReference getFaculté_Personnes();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.Faculté#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.Faculté#getName()
	 * @see #getFaculté()
	 * @generated
	 */
	EAttribute getFaculté_Name();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.FeuilleFormation <em>Feuille Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feuille Formation</em>'.
	 * @see univ.pedago.mm.pedagomm.FeuilleFormation
	 * @generated
	 */
	EClass getFeuilleFormation();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.FeuilleFormation#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see univ.pedago.mm.pedagomm.FeuilleFormation#getContenu()
	 * @see #getFeuilleFormation()
	 * @generated
	 */
	EAttribute getFeuilleFormation_Contenu();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see univ.pedago.mm.pedagomm.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the reference list '{@link univ.pedago.mm.pedagomm.UE#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personnes</em>'.
	 * @see univ.pedago.mm.pedagomm.UE#getPersonnes()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Personnes();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.UE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.UE#getName()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link univ.pedago.mm.pedagomm.UE#getFeuilleContenus <em>Feuille Contenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feuille Contenus</em>'.
	 * @see univ.pedago.mm.pedagomm.UE#getFeuilleContenus()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_FeuilleContenus();

	/**
	 * Returns the meta object for class '{@link univ.pedago.mm.pedagomm.FeuilleContenu <em>Feuille Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feuille Contenu</em>'.
	 * @see univ.pedago.mm.pedagomm.FeuilleContenu
	 * @generated
	 */
	EClass getFeuilleContenu();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.FeuilleContenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see univ.pedago.mm.pedagomm.FeuilleContenu#getName()
	 * @see #getFeuilleContenu()
	 * @generated
	 */
	EAttribute getFeuilleContenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link univ.pedago.mm.pedagomm.FeuilleContenu#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see univ.pedago.mm.pedagomm.FeuilleContenu#getContent()
	 * @see #getFeuilleContenu()
	 * @generated
	 */
	EAttribute getFeuilleContenu_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PedagommFactory getPedagommFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.MentionImpl <em>Mention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.MentionImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getMention()
		 * @generated
		 */
		EClass MENTION = eINSTANCE.getMention();

		/**
		 * The meta object literal for the '<em><b>Parcours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__PARCOURS = eINSTANCE.getMention_Parcours();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENTION__NAME = eINSTANCE.getMention_Name();

		/**
		 * The meta object literal for the '<em><b>Responsables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__RESPONSABLES = eINSTANCE.getMention_Responsables();

		/**
		 * The meta object literal for the '<em><b>Feuille Contenus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENTION__FEUILLE_CONTENUS = eINSTANCE.getMention_FeuilleContenus();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.IntervenantImpl <em>Intervenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.IntervenantImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getIntervenant()
		 * @generated
		 */
		EClass INTERVENANT = eINSTANCE.getIntervenant();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl <em>Parcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.ParcoursImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getParcours()
		 * @generated
		 */
		EClass PARCOURS = eINSTANCE.getParcours();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__SEMESTRES = eINSTANCE.getParcours_Semestres();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__NAME = eINSTANCE.getParcours_Name();

		/**
		 * The meta object literal for the '<em><b>Responsables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__RESPONSABLES = eINSTANCE.getParcours_Responsables();

		/**
		 * The meta object literal for the '<em><b>Feuille Contenus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__FEUILLE_CONTENUS = eINSTANCE.getParcours_FeuilleContenus();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.ResponsableImpl <em>Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.ResponsableImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getResponsable()
		 * @generated
		 */
		EClass RESPONSABLE = eINSTANCE.getResponsable();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.PersonneImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NAME = eINSTANCE.getPersonne_Name();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.SemestreImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UES = eINSTANCE.getSemestre_Ues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NAME = eINSTANCE.getSemestre_Name();

		/**
		 * The meta object literal for the '<em><b>Feuille Contenus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__FEUILLE_CONTENUS = eINSTANCE.getSemestre_FeuilleContenus();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.FormationImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NAME = eINSTANCE.getFormation_Name();

		/**
		 * The meta object literal for the '<em><b>Mentions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__MENTIONS = eINSTANCE.getFormation_Mentions();

		/**
		 * The meta object literal for the '<em><b>Feuille Contenus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__FEUILLE_CONTENUS = eINSTANCE.getFormation_FeuilleContenus();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.FacultéImpl <em>Faculté</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.FacultéImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFaculté()
		 * @generated
		 */
		EClass FACULTÉ = eINSTANCE.getFaculté();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTÉ__FORMATIONS = eINSTANCE.getFaculté_Formations();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTÉ__PERSONNES = eINSTANCE.getFaculté_Personnes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTÉ__NAME = eINSTANCE.getFaculté_Name();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.FeuilleFormationImpl <em>Feuille Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.FeuilleFormationImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFeuilleFormation()
		 * @generated
		 */
		EClass FEUILLE_FORMATION = eINSTANCE.getFeuilleFormation();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEUILLE_FORMATION__CONTENU = eINSTANCE.getFeuilleFormation_Contenu();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.UEImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PERSONNES = eINSTANCE.getUE_Personnes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NAME = eINSTANCE.getUE_Name();

		/**
		 * The meta object literal for the '<em><b>Feuille Contenus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__FEUILLE_CONTENUS = eINSTANCE.getUE_FeuilleContenus();

		/**
		 * The meta object literal for the '{@link univ.pedago.mm.pedagomm.impl.FeuilleContenuImpl <em>Feuille Contenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see univ.pedago.mm.pedagomm.impl.FeuilleContenuImpl
		 * @see univ.pedago.mm.pedagomm.impl.PedagommPackageImpl#getFeuilleContenu()
		 * @generated
		 */
		EClass FEUILLE_CONTENU = eINSTANCE.getFeuilleContenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEUILLE_CONTENU__NAME = eINSTANCE.getFeuilleContenu_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEUILLE_CONTENU__CONTENT = eINSTANCE.getFeuilleContenu_Content();

	}

} //PedagommPackage
