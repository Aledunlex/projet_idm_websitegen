/**
 */
package siteweb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Titre#getNiveau <em>Niveau</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getTitre()
 * @model
 * @generated
 */
public interface Titre extends Bloc {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(int)
	 * @see siteweb.SitewebPackage#getTitre_Niveau()
	 * @model
	 * @generated
	 */
	int getNiveau();

	/**
	 * Sets the value of the '{@link siteweb.Titre#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(int value);

} // Titre
