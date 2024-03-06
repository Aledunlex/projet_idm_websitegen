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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import univ.pedago.mm.pedagomm.FeuilleContenu;
import univ.pedago.mm.pedagomm.Mention;
import univ.pedago.mm.pedagomm.Parcours;
import univ.pedago.mm.pedagomm.PedagommPackage;
import univ.pedago.mm.pedagomm.Responsable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.MentionImpl#getParcours <em>Parcours</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.MentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.MentionImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.MentionImpl#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MentionImpl extends MinimalEObjectImpl.Container implements Mention {
	/**
	 * The cached value of the '{@link #getParcours() <em>Parcours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcours()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcours> parcours;

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
	 * The cached value of the '{@link #getResponsables() <em>Responsables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsables()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsable> responsables;

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
	protected MentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedagommPackage.Literals.MENTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parcours> getParcours() {
		if (parcours == null) {
			parcours = new EObjectContainmentEList<Parcours>(Parcours.class, this, PedagommPackage.MENTION__PARCOURS);
		}
		return parcours;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedagommPackage.MENTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsable> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectResolvingEList<Responsable>(Responsable.class, this,
					PedagommPackage.MENTION__RESPONSABLES);
		}
		return responsables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeuilleContenu> getFeuilleContenus() {
		if (feuilleContenus == null) {
			feuilleContenus = new EObjectContainmentEList<FeuilleContenu>(FeuilleContenu.class, this,
					PedagommPackage.MENTION__FEUILLE_CONTENUS);
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
		case PedagommPackage.MENTION__PARCOURS:
			return ((InternalEList<?>) getParcours()).basicRemove(otherEnd, msgs);
		case PedagommPackage.MENTION__FEUILLE_CONTENUS:
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
		case PedagommPackage.MENTION__PARCOURS:
			return getParcours();
		case PedagommPackage.MENTION__NAME:
			return getName();
		case PedagommPackage.MENTION__RESPONSABLES:
			return getResponsables();
		case PedagommPackage.MENTION__FEUILLE_CONTENUS:
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
		case PedagommPackage.MENTION__PARCOURS:
			getParcours().clear();
			getParcours().addAll((Collection<? extends Parcours>) newValue);
			return;
		case PedagommPackage.MENTION__NAME:
			setName((String) newValue);
			return;
		case PedagommPackage.MENTION__RESPONSABLES:
			getResponsables().clear();
			getResponsables().addAll((Collection<? extends Responsable>) newValue);
			return;
		case PedagommPackage.MENTION__FEUILLE_CONTENUS:
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
		case PedagommPackage.MENTION__PARCOURS:
			getParcours().clear();
			return;
		case PedagommPackage.MENTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PedagommPackage.MENTION__RESPONSABLES:
			getResponsables().clear();
			return;
		case PedagommPackage.MENTION__FEUILLE_CONTENUS:
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
		case PedagommPackage.MENTION__PARCOURS:
			return parcours != null && !parcours.isEmpty();
		case PedagommPackage.MENTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PedagommPackage.MENTION__RESPONSABLES:
			return responsables != null && !responsables.isEmpty();
		case PedagommPackage.MENTION__FEUILLE_CONTENUS:
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

} //MentionImpl
