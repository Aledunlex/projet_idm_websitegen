/**
 */
package siteweb;

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
 * @see siteweb.SitewebFactory
 * @model kind="package"
 * @generated
 */
public interface SitewebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "siteweb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/siteweb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "siteweb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitewebPackage eINSTANCE = siteweb.impl.SitewebPackageImpl.init();

	/**
	 * The meta object id for the '{@link siteweb.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.PageImpl
	 * @see siteweb.impl.SitewebPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Corps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CORPS = 0;

	/**
	 * The feature id for the '<em><b>Entête</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ENTÊTE = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITRE = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.EntêteImpl <em>Entête</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.EntêteImpl
	 * @see siteweb.impl.SitewebPackageImpl#getEntête()
	 * @generated
	 */
	int ENTÊTE = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTÊTE__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTÊTE__CONTENU = 1;

	/**
	 * The feature id for the '<em><b>Hyperlien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTÊTE__HYPERLIEN = 2;

	/**
	 * The number of structural features of the '<em>Entête</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTÊTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entête</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTÊTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.CorpsImpl <em>Corps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.CorpsImpl
	 * @see siteweb.impl.SitewebPackageImpl#getCorps()
	 * @generated
	 */
	int CORPS = 2;

	/**
	 * The feature id for the '<em><b>Blocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPS__BLOCS = 0;

	/**
	 * The number of structural features of the '<em>Corps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Corps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.BlocImpl <em>Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.BlocImpl
	 * @see siteweb.impl.SitewebPackageImpl#getBloc()
	 * @generated
	 */
	int BLOC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC__CONTENU = 2;

	/**
	 * The number of structural features of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.SectionImpl
	 * @see siteweb.impl.SitewebPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = BLOC__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ACTIONS = BLOC__ACTIONS;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENU = BLOC__CONTENU;

	/**
	 * The feature id for the '<em><b>Blocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BLOCS = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.TitreImpl <em>Titre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.TitreImpl
	 * @see siteweb.impl.SitewebPackageImpl#getTitre()
	 * @generated
	 */
	int TITRE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__NAME = BLOC__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__ACTIONS = BLOC__ACTIONS;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__CONTENU = BLOC__CONTENU;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__NIVEAU = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.ParagrapheImpl
	 * @see siteweb.impl.SitewebPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__NAME = BLOC__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__ACTIONS = BLOC__ACTIONS;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__CONTENU = BLOC__CONTENU;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.ActionImpl
	 * @see siteweb.impl.SitewebPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTENU = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.SiteImpl
	 * @see siteweb.impl.SitewebPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 8;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.HyperLienImpl <em>Hyper Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.HyperLienImpl
	 * @see siteweb.impl.SitewebPackageImpl#getHyperLien()
	 * @generated
	 */
	int HYPER_LIEN = 9;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LIEN__PAGE = ACTION__PAGE;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LIEN__CONTENU = ACTION__CONTENU;

	/**
	 * The number of structural features of the '<em>Hyper Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LIEN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hyper Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LIEN_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link siteweb.impl.BouttonImpl <em>Boutton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteweb.impl.BouttonImpl
	 * @see siteweb.impl.SitewebPackageImpl#getBoutton()
	 * @generated
	 */
	int BOUTTON = 10;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTTON__PAGE = ACTION__PAGE;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTTON__CONTENU = ACTION__CONTENU;

	/**
	 * The number of structural features of the '<em>Boutton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTTON_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boutton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTTON_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link siteweb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see siteweb.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link siteweb.Page#getCorps <em>Corps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corps</em>'.
	 * @see siteweb.Page#getCorps()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Corps();

	/**
	 * Returns the meta object for the containment reference '{@link siteweb.Page#getEntête <em>Entête</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entête</em>'.
	 * @see siteweb.Page#getEntête()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Entête();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Page#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see siteweb.Page#getTitre()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Titre();

	/**
	 * Returns the meta object for class '{@link siteweb.Entête <em>Entête</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entête</em>'.
	 * @see siteweb.Entête
	 * @generated
	 */
	EClass getEntête();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Entête#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see siteweb.Entête#getTitre()
	 * @see #getEntête()
	 * @generated
	 */
	EAttribute getEntête_Titre();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Entête#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see siteweb.Entête#getContenu()
	 * @see #getEntête()
	 * @generated
	 */
	EAttribute getEntête_Contenu();

	/**
	 * Returns the meta object for the containment reference list '{@link siteweb.Entête#getHyperlien <em>Hyperlien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyperlien</em>'.
	 * @see siteweb.Entête#getHyperlien()
	 * @see #getEntête()
	 * @generated
	 */
	EReference getEntête_Hyperlien();

	/**
	 * Returns the meta object for class '{@link siteweb.Corps <em>Corps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corps</em>'.
	 * @see siteweb.Corps
	 * @generated
	 */
	EClass getCorps();

	/**
	 * Returns the meta object for the containment reference list '{@link siteweb.Corps#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocs</em>'.
	 * @see siteweb.Corps#getBlocs()
	 * @see #getCorps()
	 * @generated
	 */
	EReference getCorps_Blocs();

	/**
	 * Returns the meta object for class '{@link siteweb.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see siteweb.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link siteweb.Section#getBlocs <em>Blocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocs</em>'.
	 * @see siteweb.Section#getBlocs()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Blocs();

	/**
	 * Returns the meta object for class '{@link siteweb.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc</em>'.
	 * @see siteweb.Bloc
	 * @generated
	 */
	EClass getBloc();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Bloc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see siteweb.Bloc#getName()
	 * @see #getBloc()
	 * @generated
	 */
	EAttribute getBloc_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link siteweb.Bloc#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see siteweb.Bloc#getActions()
	 * @see #getBloc()
	 * @generated
	 */
	EReference getBloc_Actions();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Bloc#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see siteweb.Bloc#getContenu()
	 * @see #getBloc()
	 * @generated
	 */
	EAttribute getBloc_Contenu();

	/**
	 * Returns the meta object for class '{@link siteweb.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titre</em>'.
	 * @see siteweb.Titre
	 * @generated
	 */
	EClass getTitre();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Titre#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see siteweb.Titre#getNiveau()
	 * @see #getTitre()
	 * @generated
	 */
	EAttribute getTitre_Niveau();

	/**
	 * Returns the meta object for class '{@link siteweb.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see siteweb.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link siteweb.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see siteweb.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link siteweb.Action#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see siteweb.Action#getPage()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Page();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Action#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see siteweb.Action#getContenu()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Contenu();

	/**
	 * Returns the meta object for class '{@link siteweb.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see siteweb.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link siteweb.Site#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see siteweb.Site#getPages()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Pages();

	/**
	 * Returns the meta object for the attribute '{@link siteweb.Site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see siteweb.Site#getName()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Name();

	/**
	 * Returns the meta object for class '{@link siteweb.HyperLien <em>Hyper Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Lien</em>'.
	 * @see siteweb.HyperLien
	 * @generated
	 */
	EClass getHyperLien();

	/**
	 * Returns the meta object for class '{@link siteweb.Boutton <em>Boutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boutton</em>'.
	 * @see siteweb.Boutton
	 * @generated
	 */
	EClass getBoutton();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SitewebFactory getSitewebFactory();

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
		 * The meta object literal for the '{@link siteweb.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.PageImpl
		 * @see siteweb.impl.SitewebPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Corps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CORPS = eINSTANCE.getPage_Corps();

		/**
		 * The meta object literal for the '<em><b>Entête</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ENTÊTE = eINSTANCE.getPage_Entête();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITRE = eINSTANCE.getPage_Titre();

		/**
		 * The meta object literal for the '{@link siteweb.impl.EntêteImpl <em>Entête</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.EntêteImpl
		 * @see siteweb.impl.SitewebPackageImpl#getEntête()
		 * @generated
		 */
		EClass ENTÊTE = eINSTANCE.getEntête();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTÊTE__TITRE = eINSTANCE.getEntête_Titre();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTÊTE__CONTENU = eINSTANCE.getEntête_Contenu();

		/**
		 * The meta object literal for the '<em><b>Hyperlien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTÊTE__HYPERLIEN = eINSTANCE.getEntête_Hyperlien();

		/**
		 * The meta object literal for the '{@link siteweb.impl.CorpsImpl <em>Corps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.CorpsImpl
		 * @see siteweb.impl.SitewebPackageImpl#getCorps()
		 * @generated
		 */
		EClass CORPS = eINSTANCE.getCorps();

		/**
		 * The meta object literal for the '<em><b>Blocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORPS__BLOCS = eINSTANCE.getCorps_Blocs();

		/**
		 * The meta object literal for the '{@link siteweb.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.SectionImpl
		 * @see siteweb.impl.SitewebPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Blocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__BLOCS = eINSTANCE.getSection_Blocs();

		/**
		 * The meta object literal for the '{@link siteweb.impl.BlocImpl <em>Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.BlocImpl
		 * @see siteweb.impl.SitewebPackageImpl#getBloc()
		 * @generated
		 */
		EClass BLOC = eINSTANCE.getBloc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOC__NAME = eINSTANCE.getBloc_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC__ACTIONS = eINSTANCE.getBloc_Actions();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOC__CONTENU = eINSTANCE.getBloc_Contenu();

		/**
		 * The meta object literal for the '{@link siteweb.impl.TitreImpl <em>Titre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.TitreImpl
		 * @see siteweb.impl.SitewebPackageImpl#getTitre()
		 * @generated
		 */
		EClass TITRE = eINSTANCE.getTitre();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITRE__NIVEAU = eINSTANCE.getTitre_Niveau();

		/**
		 * The meta object literal for the '{@link siteweb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.ParagrapheImpl
		 * @see siteweb.impl.SitewebPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link siteweb.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.ActionImpl
		 * @see siteweb.impl.SitewebPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PAGE = eINSTANCE.getAction_Page();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONTENU = eINSTANCE.getAction_Contenu();

		/**
		 * The meta object literal for the '{@link siteweb.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.SiteImpl
		 * @see siteweb.impl.SitewebPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__PAGES = eINSTANCE.getSite_Pages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getSite_Name();

		/**
		 * The meta object literal for the '{@link siteweb.impl.HyperLienImpl <em>Hyper Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.HyperLienImpl
		 * @see siteweb.impl.SitewebPackageImpl#getHyperLien()
		 * @generated
		 */
		EClass HYPER_LIEN = eINSTANCE.getHyperLien();

		/**
		 * The meta object literal for the '{@link siteweb.impl.BouttonImpl <em>Boutton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteweb.impl.BouttonImpl
		 * @see siteweb.impl.SitewebPackageImpl#getBoutton()
		 * @generated
		 */
		EClass BOUTTON = eINSTANCE.getBoutton();

	}

} //SitewebPackage
