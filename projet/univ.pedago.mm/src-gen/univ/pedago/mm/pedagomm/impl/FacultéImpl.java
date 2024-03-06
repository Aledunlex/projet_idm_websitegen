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

import univ.pedago.mm.pedagomm.Faculté;
import univ.pedago.mm.pedagomm.Formation;
import univ.pedago.mm.pedagomm.PedagommPackage;
import univ.pedago.mm.pedagomm.Personne;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculté</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FacultéImpl#getFormations <em>Formations</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FacultéImpl#getPersonnes <em>Personnes</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FacultéImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultéImpl extends MinimalEObjectImpl.Container implements Faculté {
	/**
	 * The cached value of the '{@link #getFormations() <em>Formations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> formations;

	/**
	 * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personnes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacultéImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedagommPackage.Literals.FACULTÉ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getFormations() {
		if (formations == null) {
			formations = new EObjectContainmentEList<Formation>(Formation.class, this,
					PedagommPackage.FACULTÉ__FORMATIONS);
		}
		return formations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, PedagommPackage.FACULTÉ__PERSONNES);
		}
		return personnes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedagommPackage.FACULTÉ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PedagommPackage.FACULTÉ__FORMATIONS:
			return ((InternalEList<?>) getFormations()).basicRemove(otherEnd, msgs);
		case PedagommPackage.FACULTÉ__PERSONNES:
			return ((InternalEList<?>) getPersonnes()).basicRemove(otherEnd, msgs);
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
		case PedagommPackage.FACULTÉ__FORMATIONS:
			return getFormations();
		case PedagommPackage.FACULTÉ__PERSONNES:
			return getPersonnes();
		case PedagommPackage.FACULTÉ__NAME:
			return getName();
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
		case PedagommPackage.FACULTÉ__FORMATIONS:
			getFormations().clear();
			getFormations().addAll((Collection<? extends Formation>) newValue);
			return;
		case PedagommPackage.FACULTÉ__PERSONNES:
			getPersonnes().clear();
			getPersonnes().addAll((Collection<? extends Personne>) newValue);
			return;
		case PedagommPackage.FACULTÉ__NAME:
			setName((String) newValue);
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
		case PedagommPackage.FACULTÉ__FORMATIONS:
			getFormations().clear();
			return;
		case PedagommPackage.FACULTÉ__PERSONNES:
			getPersonnes().clear();
			return;
		case PedagommPackage.FACULTÉ__NAME:
			setName(NAME_EDEFAULT);
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
		case PedagommPackage.FACULTÉ__FORMATIONS:
			return formations != null && !formations.isEmpty();
		case PedagommPackage.FACULTÉ__PERSONNES:
			return personnes != null && !personnes.isEmpty();
		case PedagommPackage.FACULTÉ__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //FacultéImpl
