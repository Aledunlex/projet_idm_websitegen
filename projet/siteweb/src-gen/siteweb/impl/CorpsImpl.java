/**
 */
package siteweb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import siteweb.Bloc;
import siteweb.Corps;
import siteweb.SitewebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link siteweb.impl.CorpsImpl#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorpsImpl extends MinimalEObjectImpl.Container implements Corps {
	/**
	 * The cached value of the '{@link #getBlocs() <em>Blocs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloc> blocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorpsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitewebPackage.Literals.CORPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bloc> getBlocs() {
		if (blocs == null) {
			blocs = new EObjectContainmentEList<Bloc>(Bloc.class, this, SitewebPackage.CORPS__BLOCS);
		}
		return blocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitewebPackage.CORPS__BLOCS:
			return ((InternalEList<?>) getBlocs()).basicRemove(otherEnd, msgs);
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
		case SitewebPackage.CORPS__BLOCS:
			return getBlocs();
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
		case SitewebPackage.CORPS__BLOCS:
			getBlocs().clear();
			getBlocs().addAll((Collection<? extends Bloc>) newValue);
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
		case SitewebPackage.CORPS__BLOCS:
			getBlocs().clear();
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
		case SitewebPackage.CORPS__BLOCS:
			return blocs != null && !blocs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorpsImpl
