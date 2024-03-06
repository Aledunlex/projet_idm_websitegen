/**
 */
package siteweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Section#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Bloc {
	/**
	 * Returns the value of the '<em><b>Blocs</b></em>' containment reference list.
	 * The list contents are of type {@link siteweb.Bloc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocs</em>' containment reference list.
	 * @see siteweb.SitewebPackage#getSection_Blocs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bloc> getBlocs();

} // Section
