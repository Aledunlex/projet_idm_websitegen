/**
 */
package siteweb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import siteweb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitewebFactoryImpl extends EFactoryImpl implements SitewebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SitewebFactory init() {
		try {
			SitewebFactory theSitewebFactory = (SitewebFactory) EPackage.Registry.INSTANCE
					.getEFactory(SitewebPackage.eNS_URI);
			if (theSitewebFactory != null) {
				return theSitewebFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SitewebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitewebFactoryImpl() {
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
		case SitewebPackage.PAGE:
			return createPage();
		case SitewebPackage.ENTÊTE:
			return createEntête();
		case SitewebPackage.CORPS:
			return createCorps();
		case SitewebPackage.SECTION:
			return createSection();
		case SitewebPackage.TITRE:
			return createTitre();
		case SitewebPackage.PARAGRAPHE:
			return createParagraphe();
		case SitewebPackage.SITE:
			return createSite();
		case SitewebPackage.HYPER_LIEN:
			return createHyperLien();
		case SitewebPackage.BOUTTON:
			return createBoutton();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entête createEntête() {
		EntêteImpl entête = new EntêteImpl();
		return entête;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corps createCorps() {
		CorpsImpl corps = new CorpsImpl();
		return corps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre createTitre() {
		TitreImpl titre = new TitreImpl();
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperLien createHyperLien() {
		HyperLienImpl hyperLien = new HyperLienImpl();
		return hyperLien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boutton createBoutton() {
		BouttonImpl boutton = new BouttonImpl();
		return boutton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitewebPackage getSitewebPackage() {
		return (SitewebPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SitewebPackage getPackage() {
		return SitewebPackage.eINSTANCE;
	}

} //SitewebFactoryImpl
