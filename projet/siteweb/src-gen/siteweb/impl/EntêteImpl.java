/**
 */
package siteweb.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import siteweb.Entête;
import siteweb.HyperLien;
import siteweb.SitewebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entête</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteweb.impl.EntêteImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link siteweb.impl.EntêteImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link siteweb.impl.EntêteImpl#getHyperlien <em>Hyperlien</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntêteImpl extends MinimalEObjectImpl.Container implements Entête {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHyperlien() <em>Hyperlien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlien()
	 * @generated
	 * @ordered
	 */
	protected EList<HyperLien> hyperlien;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntêteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitewebPackage.Literals.ENTÊTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.ENTÊTE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.ENTÊTE__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HyperLien> getHyperlien() {
		if (hyperlien == null) {
			hyperlien = new EObjectContainmentEList<HyperLien>(HyperLien.class, this, SitewebPackage.ENTÊTE__HYPERLIEN);
		}
		return hyperlien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitewebPackage.ENTÊTE__HYPERLIEN:
			return ((InternalEList<?>) getHyperlien()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SitewebPackage.ENTÊTE__TITRE:
			return getTitre();
		case SitewebPackage.ENTÊTE__CONTENU:
			return getContenu();
		case SitewebPackage.ENTÊTE__HYPERLIEN:
			return getHyperlien();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SitewebPackage.ENTÊTE__TITRE:
			setTitre((String) newValue);
			return;
		case SitewebPackage.ENTÊTE__CONTENU:
			setContenu((String) newValue);
			return;
		case SitewebPackage.ENTÊTE__HYPERLIEN:
			getHyperlien().clear();
			getHyperlien().addAll((Collection<? extends HyperLien>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SitewebPackage.ENTÊTE__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case SitewebPackage.ENTÊTE__CONTENU:
			setContenu(CONTENU_EDEFAULT);
			return;
		case SitewebPackage.ENTÊTE__HYPERLIEN:
			getHyperlien().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SitewebPackage.ENTÊTE__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case SitewebPackage.ENTÊTE__CONTENU:
			return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
		case SitewebPackage.ENTÊTE__HYPERLIEN:
			return hyperlien != null && !hyperlien.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (titre: ");
		result.append(titre);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //EntêteImpl
