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

package com.workflow.demo.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.workflow.demo.model.Feedback;

import java.util.List;

/**
 * The persistence utility for the feedback service. This utility wraps {@link FeedbackPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author shatrusudan
 * @see FeedbackPersistence
 * @see FeedbackPersistenceImpl
 * @generated
 */
public class FeedbackUtil {
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
	public static void clearCache(Feedback feedback) {
		getPersistence().clearCache(feedback);
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
	public static List<Feedback> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Feedback> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Feedback> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Feedback update(Feedback feedback) throws SystemException {
		return getPersistence().update(feedback);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Feedback update(Feedback feedback,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(feedback, serviceContext);
	}

	/**
	* Returns all the feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByUuid_PrevAndNext(
		long feedbackId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_PrevAndNext(feedbackId, uuid, orderByComparator);
	}

	/**
	* Removes all the feedbacks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or throws a {@link com.workflow.demo.NoSuchFeedbackException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the feedback where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the feedback that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByUuid_C_PrevAndNext(
		long feedbackId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(feedbackId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the feedbacks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByGroupId_PrevAndNext(
		long feedbackId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(feedbackId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the feedbacks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByCompanyId_PrevAndNext(
		long feedbackId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(feedbackId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByfeedbackText(
		java.lang.String feedbackText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfeedbackText(feedbackText);
	}

	/**
	* Returns a range of all the feedbacks where feedbackText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param feedbackText the feedback text
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfeedbackText(feedbackText, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param feedbackText the feedback text
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfeedbackText(feedbackText, start, end,
			orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByfeedbackText_First(
		java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_First(feedbackText, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByfeedbackText_First(
		java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfeedbackText_First(feedbackText, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByfeedbackText_Last(
		java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_Last(feedbackText, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByfeedbackText_Last(
		java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfeedbackText_Last(feedbackText, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByfeedbackText_PrevAndNext(
		long feedbackId, java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_PrevAndNext(feedbackId, feedbackText,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where feedbackText = &#63; from the database.
	*
	* @param feedbackText the feedback text
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfeedbackText(java.lang.String feedbackText)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfeedbackText(feedbackText);
	}

	/**
	* Returns the number of feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfeedbackText(java.lang.String feedbackText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfeedbackText(feedbackText);
	}

	/**
	* Returns all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByG_S(
		long groupId, int feedBackStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, feedBackStatus);
	}

	/**
	* Returns a range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByG_S(
		long groupId, int feedBackStatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, feedBackStatus, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findByG_S(
		long groupId, int feedBackStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, feedBackStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByG_S_First(
		long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_First(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByG_S_First(
		long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_First(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByG_S_Last(
		long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_Last(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByG_S_Last(
		long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_S_Last(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback[] findByG_S_PrevAndNext(
		long feedbackId, long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_PrevAndNext(feedbackId, groupId, feedBackStatus,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where groupId = &#63; and feedBackStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int feedBackStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, feedBackStatus);
	}

	/**
	* Returns the number of feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the number of matching feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int feedBackStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, feedBackStatus);
	}

	/**
	* Caches the feedback in the entity cache if it is enabled.
	*
	* @param feedback the feedback
	*/
	public static void cacheResult(com.workflow.demo.model.Feedback feedback) {
		getPersistence().cacheResult(feedback);
	}

	/**
	* Caches the feedbacks in the entity cache if it is enabled.
	*
	* @param feedbacks the feedbacks
	*/
	public static void cacheResult(
		java.util.List<com.workflow.demo.model.Feedback> feedbacks) {
		getPersistence().cacheResult(feedbacks);
	}

	/**
	* Creates a new feedback with the primary key. Does not add the feedback to the database.
	*
	* @param feedbackId the primary key for the new feedback
	* @return the new feedback
	*/
	public static com.workflow.demo.model.Feedback create(long feedbackId) {
		return getPersistence().create(feedbackId);
	}

	/**
	* Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback that was removed
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback remove(long feedbackId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().remove(feedbackId);
	}

	public static com.workflow.demo.model.Feedback updateImpl(
		com.workflow.demo.model.Feedback feedback)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(feedback);
	}

	/**
	* Returns the feedback with the primary key or throws a {@link com.workflow.demo.NoSuchFeedbackException} if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback
	* @throws com.workflow.demo.NoSuchFeedbackException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback findByPrimaryKey(
		long feedbackId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.workflow.demo.NoSuchFeedbackException {
		return getPersistence().findByPrimaryKey(feedbackId);
	}

	/**
	* Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchByPrimaryKey(
		long feedbackId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(feedbackId);
	}

	/**
	* Returns all the feedbacks.
	*
	* @return the feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.workflow.demo.model.Feedback> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the feedbacks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of feedbacks.
	*
	* @return the number of feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FeedbackPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FeedbackPersistence)PortletBeanLocatorUtil.locate(com.workflow.demo.service.ClpSerializer.getServletContextName(),
					FeedbackPersistence.class.getName());

			ReferenceRegistry.registerReference(FeedbackUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FeedbackPersistence persistence) {
	}

	private static FeedbackPersistence _persistence;
}