/**
 */
package userStories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backlog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStories.Backlog#getUserstory <em>Userstory</em>}</li>
 * </ul>
 *
 * @see userStories.UserStoriesPackage#getBacklog()
 * @model
 * @generated
 */
public interface Backlog extends EObject {
	/**
	 * Returns the value of the '<em><b>Userstory</b></em>' containment reference list.
	 * The list contents are of type {@link userStories.UserStory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstory</em>' containment reference list.
	 * @see userStories.UserStoriesPackage#getBacklog_Userstory()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserstory();

} // Backlog
