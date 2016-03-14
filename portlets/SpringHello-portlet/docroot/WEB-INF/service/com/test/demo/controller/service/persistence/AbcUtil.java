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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.demo.controller.model.Abc;

import java.util.List;

/**
 * The persistence utility for the abc service. This utility wraps {@link AbcPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author shatrusudan.sharma
 * @see AbcPersistence
 * @see AbcPersistenceImpl
 * @generated
 */
public class AbcUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Abc abc) {
		getPersistence().clearCache(abc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Abc> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Abc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Abc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Abc update(Abc abc) throws SystemException {
		return getPersistence().update(abc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Abc update(Abc abc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(abc, serviceContext);
	}

	/**
	* Returns all the abcs where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField2(field2);
	}

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
	public static java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField2(field2, start, end);
	}

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
	public static java.util.List<com.test.demo.controller.model.Abc> findByField2(
		boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator);
	}

	/**
	* Returns the first abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching abc
	* @throws com.test.demo.controller.NoSuchAbcException if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc findByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException {
		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the first abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching abc, or <code>null</code> if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc fetchByField2_First(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the last abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching abc
	* @throws com.test.demo.controller.NoSuchAbcException if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc findByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException {
		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the last abc in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching abc, or <code>null</code> if a matching abc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc fetchByField2_Last(
		boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

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
	public static com.test.demo.controller.model.Abc[] findByField2_PrevAndNext(
		long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException {
		return getPersistence()
				   .findByField2_PrevAndNext(fooId, field2, orderByComparator);
	}

	/**
	* Removes all the abcs where field2 = &#63; from the database.
	*
	* @param field2 the field2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByField2(boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByField2(field2);
	}

	/**
	* Returns the number of abcs where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching abcs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByField2(boolean field2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByField2(field2);
	}

	/**
	* Caches the abc in the entity cache if it is enabled.
	*
	* @param abc the abc
	*/
	public static void cacheResult(com.test.demo.controller.model.Abc abc) {
		getPersistence().cacheResult(abc);
	}

	/**
	* Caches the abcs in the entity cache if it is enabled.
	*
	* @param abcs the abcs
	*/
	public static void cacheResult(
		java.util.List<com.test.demo.controller.model.Abc> abcs) {
		getPersistence().cacheResult(abcs);
	}

	/**
	* Creates a new abc with the primary key. Does not add the abc to the database.
	*
	* @param fooId the primary key for the new abc
	* @return the new abc
	*/
	public static com.test.demo.controller.model.Abc create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	* Removes the abc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the abc
	* @return the abc that was removed
	* @throws com.test.demo.controller.NoSuchAbcException if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc remove(long fooId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException {
		return getPersistence().remove(fooId);
	}

	public static com.test.demo.controller.model.Abc updateImpl(
		com.test.demo.controller.model.Abc abc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(abc);
	}

	/**
	* Returns the abc with the primary key or throws a {@link com.test.demo.controller.NoSuchAbcException} if it could not be found.
	*
	* @param fooId the primary key of the abc
	* @return the abc
	* @throws com.test.demo.controller.NoSuchAbcException if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc findByPrimaryKey(
		long fooId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.demo.controller.NoSuchAbcException {
		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	* Returns the abc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the abc
	* @return the abc, or <code>null</code> if a abc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.demo.controller.model.Abc fetchByPrimaryKey(
		long fooId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	/**
	* Returns all the abcs.
	*
	* @return the abcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.demo.controller.model.Abc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.demo.controller.model.Abc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.demo.controller.model.Abc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the abcs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of abcs.
	*
	* @return the number of abcs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AbcPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AbcPersistence)PortletBeanLocatorUtil.locate(com.test.demo.controller.service.ClpSerializer.getServletContextName(),
					AbcPersistence.class.getName());

			ReferenceRegistry.registerReference(AbcUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AbcPersistence persistence) {
	}

	private static AbcPersistence _persistence;
}