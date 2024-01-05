/**
 */
package userStories;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStories.Activity#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link userStories.Activity#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link userStories.Activity#getName <em>Name</em>}</li>
 *   <li>{@link userStories.Activity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see userStories.UserStoriesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' attribute.
	 * @see #setPreconditions(String)
	 * @see userStories.UserStoriesPackage#getActivity_Preconditions()
	 * @model
	 * @generated
	 */
	String getPreconditions();

	/**
	 * Sets the value of the '{@link userStories.Activity#getPreconditions <em>Preconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preconditions</em>' attribute.
	 * @see #getPreconditions()
	 * @generated
	 */
	void setPreconditions(String value);

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions</em>' attribute.
	 * @see #setPostconditions(String)
	 * @see userStories.UserStoriesPackage#getActivity_Postconditions()
	 * @model
	 * @generated
	 */
	String getPostconditions();

	/**
	 * Sets the value of the '{@link userStories.Activity#getPostconditions <em>Postconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postconditions</em>' attribute.
	 * @see #getPostconditions()
	 * @generated
	 */
	void setPostconditions(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see userStories.UserStoriesPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link userStories.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see userStories.UserStoriesPackage#getActivity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link userStories.Activity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Activity
