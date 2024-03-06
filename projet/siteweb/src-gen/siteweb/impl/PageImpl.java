/**
 */
package siteweb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteweb.Corps;
import siteweb.Entête;
import siteweb.Page;
import siteweb.SitewebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteweb.impl.PageImpl#getCorps <em>Corps</em>}</li>
 *   <li>{@link siteweb.impl.PageImpl#getEntête <em>Entête</em>}</li>
 *   <li>{@link siteweb.impl.PageImpl#getTitre <em>Titre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getCorps() <em>Corps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorps()
	 * @generated
	 * @ordered
	 */
	protected Corps corps;

	/**
	 * The cached value of the '{@link #getEntête() <em>Entête</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntête()
	 * @generated
	 * @ordered
	 */
	protected Entête entête;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitewebPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corps getCorps() {
		return corps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorps(Corps newCorps, NotificationChain msgs) {
		Corps oldCorps = corps;
		corps = newCorps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitewebPackage.PAGE__CORPS,
					oldCorps, newCorps);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorps(Corps newCorps) {
		if (newCorps != corps) {
			NotificationChain msgs = null;
			if (corps != null)
				msgs = ((InternalEObject) corps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SitewebPackage.PAGE__CORPS, null, msgs);
			if (newCorps != null)
				msgs = ((InternalEObject) newCorps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SitewebPackage.PAGE__CORPS, null, msgs);
			msgs = basicSetCorps(newCorps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.PAGE__CORPS, newCorps, newCorps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entête getEntête() {
		return entête;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntête(Entête newEntête, NotificationChain msgs) {
		Entête oldEntête = entête;
		entête = newEntête;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitewebPackage.PAGE__ENTÊTE,
					oldEntête, newEntête);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntête(Entête newEntête) {
		if (newEntête != entête) {
			NotificationChain msgs = null;
			if (entête != null)
				msgs = ((InternalEObject) entête).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SitewebPackage.PAGE__ENTÊTE, null, msgs);
			if (newEntête != null)
				msgs = ((InternalEObject) newEntête).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SitewebPackage.PAGE__ENTÊTE, null, msgs);
			msgs = basicSetEntête(newEntête, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.PAGE__ENTÊTE, newEntête, newEntête));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.PAGE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitewebPackage.PAGE__CORPS:
			return basicSetCorps(null, msgs);
		case SitewebPackage.PAGE__ENTÊTE:
			return basicSetEntête(null, msgs);
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
		case SitewebPackage.PAGE__CORPS:
			return getCorps();
		case SitewebPackage.PAGE__ENTÊTE:
			return getEntête();
		case SitewebPackage.PAGE__TITRE:
			return getTitre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SitewebPackage.PAGE__CORPS:
			setCorps((Corps) newValue);
			return;
		case SitewebPackage.PAGE__ENTÊTE:
			setEntête((Entête) newValue);
			return;
		case SitewebPackage.PAGE__TITRE:
			setTitre((String) newValue);
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
		case SitewebPackage.PAGE__CORPS:
			setCorps((Corps) null);
			return;
		case SitewebPackage.PAGE__ENTÊTE:
			setEntête((Entête) null);
			return;
		case SitewebPackage.PAGE__TITRE:
			setTitre(TITRE_EDEFAULT);
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
		case SitewebPackage.PAGE__CORPS:
			return corps != null;
		case SitewebPackage.PAGE__ENTÊTE:
			return entête != null;
		case SitewebPackage.PAGE__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
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
		result.append(')');
		return result.toString();
	}

} //PageImpl
