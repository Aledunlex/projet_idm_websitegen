/**
 */
package univ.pedago.mm.pedagomm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import univ.pedago.mm.pedagomm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see univ.pedago.mm.pedagomm.PedagommPackage
 * @generated
 */
public class PedagommSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PedagommPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedagommSwitch() {
		if (modelPackage == null) {
			modelPackage = PedagommPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PedagommPackage.MENTION: {
			Mention mention = (Mention) theEObject;
			T result = caseMention(mention);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.INTERVENANT: {
			Intervenant intervenant = (Intervenant) theEObject;
			T result = caseIntervenant(intervenant);
			if (result == null)
				result = casePersonne(intervenant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.PARCOURS: {
			Parcours parcours = (Parcours) theEObject;
			T result = caseParcours(parcours);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.RESPONSABLE: {
			Responsable responsable = (Responsable) theEObject;
			T result = caseResponsable(responsable);
			if (result == null)
				result = casePersonne(responsable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.PERSONNE: {
			Personne personne = (Personne) theEObject;
			T result = casePersonne(personne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.SEMESTRE: {
			Semestre semestre = (Semestre) theEObject;
			T result = caseSemestre(semestre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.FORMATION: {
			Formation formation = (Formation) theEObject;
			T result = caseFormation(formation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.FACULTÉ: {
			Faculté faculté = (Faculté) theEObject;
			T result = caseFaculté(faculté);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.FEUILLE_FORMATION: {
			FeuilleFormation feuilleFormation = (FeuilleFormation) theEObject;
			T result = caseFeuilleFormation(feuilleFormation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.UE: {
			UE ue = (UE) theEObject;
			T result = caseUE(ue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PedagommPackage.FEUILLE_CONTENU: {
			FeuilleContenu feuilleContenu = (FeuilleContenu) theEObject;
			T result = caseFeuilleContenu(feuilleContenu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMention(Mention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervenant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervenant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervenant(Intervenant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParcours(Parcours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsable(Responsable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonne(Personne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemestre(Semestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormation(Formation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Faculté</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Faculté</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaculté(Faculté object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feuille Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feuille Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeuilleFormation(FeuilleFormation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUE(UE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feuille Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feuille Contenu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeuilleContenu(FeuilleContenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PedagommSwitch
