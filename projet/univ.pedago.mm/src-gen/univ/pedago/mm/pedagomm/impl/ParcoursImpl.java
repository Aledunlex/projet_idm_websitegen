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
import univ.pedago.mm.pedagomm.Parcours;
import univ.pedago.mm.pedagomm.PedagommPackage;
import univ.pedago.mm.pedagomm.Responsable;
import univ.pedago.mm.pedagomm.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl#getName <em>Name</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link univ.pedago.mm.pedagomm.impl.ParcoursImpl#getFeuilleContenus <em>Feuille Contenus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParcoursImpl extends MinimalEObjectImpl.Container implements Parcours {
	/**
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

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
	protected ParcoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedagommPackage.Literals.PARCOURS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectContainmentEList<Semestre>(Semestre.class, this,
					PedagommPackage.PARCOURS__SEMESTRES);
		}
		return semestres;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedagommPackage.PARCOURS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsable> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectResolvingEList<Responsable>(Responsable.class, this,
					PedagommPackage.PARCOURS__RESPONSABLES);
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
					PedagommPackage.PARCOURS__FEUILLE_CONTENUS);
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
		case PedagommPackage.PARCOURS__SEMESTRES:
			return ((InternalEList<?>) getSemestres()).basicRemove(otherEnd, msgs);
		case PedagommPackage.PARCOURS__FEUILLE_CONTENUS:
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
		case PedagommPackage.PARCOURS__SEMESTRES:
			return getSemestres();
		case PedagommPackage.PARCOURS__NAME:
			return getName();
		case PedagommPackage.PARCOURS__RESPONSABLES:
			return getResponsables();
		case PedagommPackage.PARCOURS__FEUILLE_CONTENUS:
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
		case PedagommPackage.PARCOURS__SEMESTRES:
			getSemestres().clear();
			getSemestres().addAll((Collection<? extends Semestre>) newValue);
			return;
		case PedagommPackage.PARCOURS__NAME:
			setName((String) newValue);
			return;
		case PedagommPackage.PARCOURS__RESPONSABLES:
			getResponsables().clear();
			getResponsables().addAll((Collection<? extends Responsable>) newValue);
			return;
		case PedagommPackage.PARCOURS__FEUILLE_CONTENUS:
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
		case PedagommPackage.PARCOURS__SEMESTRES:
			getSemestres().clear();
			return;
		case PedagommPackage.PARCOURS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PedagommPackage.PARCOURS__RESPONSABLES:
			getResponsables().clear();
			return;
		case PedagommPackage.PARCOURS__FEUILLE_CONTENUS:
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
		case PedagommPackage.PARCOURS__SEMESTRES:
			return semestres != null && !semestres.isEmpty();
		case PedagommPackage.PARCOURS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PedagommPackage.PARCOURS__RESPONSABLES:
			return responsables != null && !responsables.isEmpty();
		case PedagommPackage.PARCOURS__FEUILLE_CONTENUS:
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

} //ParcoursImpl
