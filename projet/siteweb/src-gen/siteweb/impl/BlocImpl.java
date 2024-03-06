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

import siteweb.Action;
import siteweb.Bloc;
import siteweb.SitewebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteweb.impl.BlocImpl#getName <em>Name</em>}</li>
 *   <li>{@link siteweb.impl.BlocImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link siteweb.impl.BlocImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlocImpl extends MinimalEObjectImpl.Container implements Bloc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitewebPackage.Literals.BLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.BLOC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, SitewebPackage.BLOC__ACTIONS);
		}
		return actions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitewebPackage.BLOC__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitewebPackage.BLOC__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
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
		case SitewebPackage.BLOC__NAME:
			return getName();
		case SitewebPackage.BLOC__ACTIONS:
			return getActions();
		case SitewebPackage.BLOC__CONTENU:
			return getContenu();
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
		case SitewebPackage.BLOC__NAME:
			setName((String) newValue);
			return;
		case SitewebPackage.BLOC__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case SitewebPackage.BLOC__CONTENU:
			setContenu((String) newValue);
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
		case SitewebPackage.BLOC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SitewebPackage.BLOC__ACTIONS:
			getActions().clear();
			return;
		case SitewebPackage.BLOC__CONTENU:
			setContenu(CONTENU_EDEFAULT);
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
		case SitewebPackage.BLOC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SitewebPackage.BLOC__ACTIONS:
			return actions != null && !actions.isEmpty();
		case SitewebPackage.BLOC__CONTENU:
			return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //BlocImpl
