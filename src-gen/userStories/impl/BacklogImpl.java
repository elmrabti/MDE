/**
 */
package userStories.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import userStories.Backlog;
import userStories.UserStoriesPackage;
import userStories.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backlog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStories.impl.BacklogImpl#getUserstory <em>Userstory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BacklogImpl extends MinimalEObjectImpl.Container implements Backlog {
	/**
	 * The cached value of the '{@link #getUserstory() <em>Userstory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserstory()
	 * @generated
	 * @ordered
	 */
	protected EList<UserStory> userstory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BacklogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStoriesPackage.Literals.BACKLOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserStory> getUserstory() {
		if (userstory == null) {
			userstory = new EObjectContainmentEList<UserStory>(UserStory.class, this,
					UserStoriesPackage.BACKLOG__USERSTORY);
		}
		return userstory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UserStoriesPackage.BACKLOG__USERSTORY:
			return ((InternalEList<?>) getUserstory()).basicRemove(otherEnd, msgs);
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
		case UserStoriesPackage.BACKLOG__USERSTORY:
			return getUserstory();
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
		case UserStoriesPackage.BACKLOG__USERSTORY:
			getUserstory().clear();
			getUserstory().addAll((Collection<? extends UserStory>) newValue);
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
		case UserStoriesPackage.BACKLOG__USERSTORY:
			getUserstory().clear();
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
		case UserStoriesPackage.BACKLOG__USERSTORY:
			return userstory != null && !userstory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BacklogImpl
