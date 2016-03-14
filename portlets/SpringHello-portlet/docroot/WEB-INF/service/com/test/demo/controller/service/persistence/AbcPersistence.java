/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.test.demo.controller.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.demo.controller.model.Abc;

/**
 * The persistence interface for the abc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author shatrusudan.sharma
 * @see AbcPersistenceImpl
 * @see AbcUtil
 * @generated
 */
public interface AbcPersistence extends BasePersistence<Abc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AbcUtil} to access the abc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the abcs where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the abcs where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.demo.controller.model.impl.AbcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of abcs
	* @param end the upper bound of the range of abcs (not inclusive)
	* @return the range of matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the abcs where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.demo.controller.model.impl.AbcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of abcs
	* @param end the upper bound of the range of abcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching abc
	* @throws com.test.demo.controller.NoSuchAbcException if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc findByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException;

	/**
	* Returns the first abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching abc, or <code>null</code> if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching abc
	* @throws com.test.demo.controller.NoSuchAbcException if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc findByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException;

	/**
	* Returns the last abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching abc, or <code>null</code> if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the abcs before and after the current abc in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current abc
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next abc
	* @throws com.test.demo.controller.NoSuchAbcException if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc[] findByField2_PrevAndNext(
		long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException;

	/**
	* Removes all the abcs where field2 = &#63; from the database.
	*
	* @param field2 the field2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByField2(boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of abcs where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public int countByField2(boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the abc in the entity cache if it is enabled.
	*
	* @param abc the abc
	*/
	public void cacheResult(com.test.demo.controller.model.Abc abc);

	/**
	* Caches the abcs in the entity cache if it is enabled.
	*
	* @param abcs the abcs
	*/
	public void cacheResult(
		java.util.List<com.test.demo.controller.model.Abc> abcs);

	/**
	* Creates a new abc with the primary key. Does not add the abc to the database.
	*
	* @param fooId the primary key for the new abc
	* @return the new abc
	*/
	public com.test.demo.controller.model.Abc create(long fooId);

	/**
	* Removes the abc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the abc
	* @return the abc that was removed
	* @throws com.test.demo.controller.NoSuchAbcException if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc remove(long fooId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException;

	public com.test.demo.controller.model.Abc updateImpl(
		com.test.demo.controller.model.Abc abc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the abc with the primary key or throws a {@link com.test.demo.controller.NoSuchAbcException} if it could not be found.
	*
	* @param fooId the primary key of the abc
	* @return the abc
	* @throws com.test.demo.controller.NoSuchAbcException if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc findByPrimaryKey(long fooId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException;

	/**
	* Returns the abc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the abc
	* @return the abc, or <code>null</code> if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.demo.controller.model.Abc fetchByPrimaryKey(long fooId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the abcs.
	*
	* @return the abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the abcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.demo.controller.model.impl.AbcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of abcs
	* @param end the upper bound of the range of abcs (not inclusive)
	* @return the range of abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the abcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.demo.controller.model.impl.AbcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of abcs
	* @param end the upper bound of the range of abcs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of abcs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.demo.controller.model.Abc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the abcs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of abcs.
	*
	* @return the number of abcs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}