/**
 */
package siteweb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entête</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Entête#getTitre <em>Titre</em>}</li>
 *   <li>{@link siteweb.Entête#getContenu <em>Contenu</em>}</li>
 *   <li>{@link siteweb.Entête#getHyperlien <em>Hyperlien</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getEntête()
 * @model
 * @generated
 */
public interface Entête extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see siteweb.SitewebPackage#getEntête_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link siteweb.Entête#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see siteweb.SitewebPackage#getEntête_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link siteweb.Entête#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlien</b></em>' containment reference list.
	 * The list contents are of type {@link siteweb.HyperLien}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlien</em>' containment reference list.
	 * @see siteweb.SitewebPackage#getEntête_Hyperlien()
	 * @model containment="true"
	 * @generated
	 */
	EList<HyperLien> getHyperlien();

} // Entête
