/**
 */
package univ.pedago.mm.pedagomm.impl;

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
import univ.pedago.mm.pedagomm.FeuilleContenu;
import univ.pedago.mm.pedagomm.PedagommPackage;
import univ.pedago.mm.pedagomm.Semestre;
import univ.pedago.mm.pedagomm.UE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.SemestreImpl#getUes <em>Ues</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.SemestreImpl#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.SemestreImpl#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre {
	/**
	 * The cached value of the '{@link #getUes() <em>Ues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUes()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ues;

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
	 * The cached value of the '{@link #getFeuilleContenus() <em>Feuille Contenus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeuilleContenus()
	 * @generated
	 * @ordered
	 */
	protected EList<FeuilleContenu> feuilleContenus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedagommPackage.Literals.SEMESTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<UE>(UE.class, this, PedagommPackage.SEMESTRE__UES);
		}
		return ues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedagommPackage.SEMESTRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeuilleContenu> getFeuilleContenus() {
		if (feuilleContenus == null) {
			feuilleContenus = new EObjectContainmentEList<FeuilleContenu>(FeuilleContenu.class, this,
					PedagommPackage.SEMESTRE__FEUILLE_CONTENUS);
		}
		return feuilleContenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PedagommPackage.SEMESTRE__UES:
			return ((InternalEList<?>) getUes()).basicRemove(otherEnd, msgs);
		case PedagommPackage.SEMESTRE__FEUILLE_CONTENUS:
			return ((InternalEList<?>) getFeuilleContenus()).basicRemove(otherEnd, msgs);
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
		case PedagommPackage.SEMESTRE__UES:
			return getUes();
		case PedagommPackage.SEMESTRE__NAME:
			return getName();
		case PedagommPackage.SEMESTRE__FEUILLE_CONTENUS:
			return getFeuilleContenus();
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
		case PedagommPackage.SEMESTRE__UES:
			getUes().clear();
			getUes().addAll((Collection<? extends UE>) newValue);
			return;
		case PedagommPackage.SEMESTRE__NAME:
			setName((String) newValue);
			return;
		case PedagommPackage.SEMESTRE__FEUILLE_CONTENUS:
			getFeuilleContenus().clear();
			getFeuilleContenus().addAll((Collection<? extends FeuilleContenu>) newValue);
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
		case PedagommPackage.SEMESTRE__UES:
			getUes().clear();
			return;
		case PedagommPackage.SEMESTRE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PedagommPackage.SEMESTRE__FEUILLE_CONTENUS:
			getFeuilleContenus().clear();
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
		case PedagommPackage.SEMESTRE__UES:
			return ues != null && !ues.isEmpty();
		case PedagommPackage.SEMESTRE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PedagommPackage.SEMESTRE__FEUILLE_CONTENUS:
			return feuilleContenus != null && !feuilleContenus.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SemestreImpl
