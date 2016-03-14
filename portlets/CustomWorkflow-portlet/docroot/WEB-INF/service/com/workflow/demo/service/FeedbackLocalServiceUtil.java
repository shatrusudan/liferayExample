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

package com.workflow.demo.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Feedback. This utility wraps
 * {@link com.workflow.demo.service.impl.FeedbackLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author shatrusudan
 * @see FeedbackLocalService
 * @see com.workflow.demo.service.base.FeedbackLocalServiceBaseImpl
 * @see com.workflow.demo.service.impl.FeedbackLocalServiceImpl
 * @generated
 */
public class FeedbackLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.workflow.demo.service.impl.FeedbackLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the feedback to the database. Also notifies the appropriate model listeners.
	*
	* @param feedback the feedback
	* @return the feedback that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback addFeedback(
		com.workflow.demo.model.Feedback feedback)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFeedback(feedback);
	}

	/**
	* Creates a new feedback with the primary key. Does not add the feedback to the database.
	*
	* @param feedbackId the primary key for the new feedback
	* @return the new feedback
	*/
	public static com.workflow.demo.model.Feedback createFeedback(
		long feedbackId) {
		return getService().createFeedback(feedbackId);
	}

	/**
	* Deletes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback that was removed
	* @throws PortalException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback deleteFeedback(
		long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFeedback(feedbackId);
	}

	/**
	* Deletes the feedback from the database. Also notifies the appropriate model listeners.
	*
	* @param feedback the feedback
	* @return the feedback that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback deleteFeedback(
		com.workflow.demo.model.Feedback feedback)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFeedback(feedback);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.workflow.demo.model.impl.FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.workflow.demo.model.Feedback fetchFeedback(
		long feedbackId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFeedback(feedbackId);
	}

	/**
	* Returns the feedback with the matching UUID and company.
	*
	* @param uuid the feedback's UUID
	* @param companyId the primary key of the company
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchFeedbackByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFeedbackByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the feedback matching the UUID and group.
	*
	* @param uuid the feedback's UUID
	* @param groupId the primary key of the group
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback fetchFeedbackByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFeedbackByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the feedback with the primary key.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback
	* @throws PortalException if a feedback with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback getFeedback(long feedbackId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFeedback(feedbackId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the feedback with the matching UUID and company.
	*
	* @param uuid the feedback's UUID
	* @param companyId the primary key of the company
	* @return the matching feedback
	* @throws PortalException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback getFeedbackByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFeedbackByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the feedback matching the UUID and group.
	*
	* @param uuid the feedback's UUID
	* @param groupId the primary key of the group
	* @return the matching feedback
	* @throws PortalException if a matching feedback could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback getFeedbackByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFeedbackByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.workflow.demo.model.Feedback> getFeedbacks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFeedbacks(start, end);
	}

	/**
	* Returns the number of feedbacks.
	*
	* @return the number of feedbacks
	* @throws SystemException if a system exception occurred
	*/
	public static int getFeedbacksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFeedbacksCount();
	}

	/**
	* Updates the feedback in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param feedback the feedback
	* @return the feedback that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.workflow.demo.model.Feedback updateFeedback(
		com.workflow.demo.model.Feedback feedback)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFeedback(feedback);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.workflow.demo.model.Feedback> findG_s(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findG_s(groupId, status);
	}

	public static void clearService() {
		_service = null;
	}

	public static FeedbackLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FeedbackLocalService.class.getName());

			if (invokableLocalService instanceof FeedbackLocalService) {
				_service = (FeedbackLocalService)invokableLocalService;
			}
			else {
				_service = new FeedbackLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FeedbackLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(FeedbackLocalService service) {
	}

	private static FeedbackLocalService _service;
}