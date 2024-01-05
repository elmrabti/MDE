/**
 */
package userStories.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import userStories.Activity;
import userStories.UserStoriesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStories.impl.ActivityImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link userStories.impl.ActivityImpl#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link userStories.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link userStories.impl.ActivityImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getPreconditions() <em>Preconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected String preconditions = PRECONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostconditions() <em>Postconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected String postconditions = POSTCONDITIONS_EDEFAULT;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStoriesPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreconditions() {
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreconditions(String newPreconditions) {
		String oldPreconditions = preconditions;
		preconditions = newPreconditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.ACTIVITY__PRECONDITIONS,
					oldPreconditions, preconditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostconditions() {
		return postconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostconditions(String newPostconditions) {
		String oldPostconditions = postconditions;
		postconditions = newPostconditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.ACTIVITY__POSTCONDITIONS,
					oldPostconditions, postconditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.ACTIVITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UserStoriesPackage.ACTIVITY__PRECONDITIONS:
			return getPreconditions();
		case UserStoriesPackage.ACTIVITY__POSTCONDITIONS:
			return getPostconditions();
		case UserStoriesPackage.ACTIVITY__NAME:
			return getName();
		case UserStoriesPackage.ACTIVITY__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UserStoriesPackage.ACTIVITY__PRECONDITIONS:
			setPreconditions((String) newValue);
			return;
		case UserStoriesPackage.ACTIVITY__POSTCONDITIONS:
			setPostconditions((String) newValue);
			return;
		case UserStoriesPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case UserStoriesPackage.ACTIVITY__ID:
			setId((String) newValue);
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
		case UserStoriesPackage.ACTIVITY__PRECONDITIONS:
			setPreconditions(PRECONDITIONS_EDEFAULT);
			return;
		case UserStoriesPackage.ACTIVITY__POSTCONDITIONS:
			setPostconditions(POSTCONDITIONS_EDEFAULT);
			return;
		case UserStoriesPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UserStoriesPackage.ACTIVITY__ID:
			setId(ID_EDEFAULT);
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
		case UserStoriesPackage.ACTIVITY__PRECONDITIONS:
			return PRECONDITIONS_EDEFAULT == null ? preconditions != null
					: !PRECONDITIONS_EDEFAULT.equals(preconditions);
		case UserStoriesPackage.ACTIVITY__POSTCONDITIONS:
			return POSTCONDITIONS_EDEFAULT == null ? postconditions != null
					: !POSTCONDITIONS_EDEFAULT.equals(postconditions);
		case UserStoriesPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UserStoriesPackage.ACTIVITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (preconditions: ");
		result.append(preconditions);
		result.append(", postconditions: ");
		result.append(postconditions);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
