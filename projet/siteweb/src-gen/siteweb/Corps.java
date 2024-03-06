/**
 */
package siteweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link siteweb.Corps#getBlocs <em>Blocs</em>}</li>
 * </ul>
 *
 * @see siteweb.SitewebPackage#getCorps()
 * @model
 * @generated
 */
public interface Corps extends EObject {
	/**
	 * Returns the value of the '<em><b>Blocs</b></em>' containment reference list.
	 * The list contents are of type {@link siteweb.Bloc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocs</em>' containment reference list.
	 * @see siteweb.SitewebPackage#getCorps_Blocs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bloc> getBlocs();

} // Corps
