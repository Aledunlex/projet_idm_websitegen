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
import univ.pedago.mm.pedagomm.Formation;
import univ.pedago.mm.pedagomm.Mention;
import univ.pedago.mm.pedagomm.PedagommPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FormationImpl#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FormationImpl#getMentions <em>Mentions</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.FormationImpl#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
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
	 * The cached value of the '{@link #getMentions() <em>Mentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mention> mentions;

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
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedagommPackage.Literals.FORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedagommPackage.FORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mention> getMentions() {
		if (mentions == null) {
			mentions = new EObjectContainmentEList<Mention>(Mention.class, this, PedagommPackage.FORMATION__MENTIONS);
		}
		return mentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeuilleContenu> getFeuilleContenus() {
		if (feuilleContenus == null) {
			feuilleContenus = new EObjectContainmentEList<FeuilleContenu>(FeuilleContenu.class, this,
					PedagommPackage.FORMATION__FEUILLE_CONTENUS);
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
		case PedagommPackage.FORMATION__MENTIONS:
			return ((InternalEList<?>) getMentions()).basicRemove(otherEnd, msgs);
		case PedagommPackage.FORMATION__FEUILLE_CONTENUS:
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
		case PedagommPackage.FORMATION__NAME:
			return getName();
		case PedagommPackage.FORMATION__MENTIONS:
			return getMentions();
		case PedagommPackage.FORMATION__FEUILLE_CONTENUS:
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
		case PedagommPackage.FORMATION__NAME:
			setName((String) newValue);
			return;
		case PedagommPackage.FORMATION__MENTIONS:
			getMentions().clear();
			getMentions().addAll((Collection<? extends Mention>) newValue);
			return;
		case PedagommPackage.FORMATION__FEUILLE_CONTENUS:
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
		case PedagommPackage.FORMATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PedagommPackage.FORMATION__MENTIONS:
			getMentions().clear();
			return;
		case PedagommPackage.FORMATION__FEUILLE_CONTENUS:
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
		case PedagommPackage.FORMATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PedagommPackage.FORMATION__MENTIONS:
			return mentions != null && !mentions.isEmpty();
		case PedagommPackage.FORMATION__FEUILLE_CONTENUS:
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

} //FormationImpl
