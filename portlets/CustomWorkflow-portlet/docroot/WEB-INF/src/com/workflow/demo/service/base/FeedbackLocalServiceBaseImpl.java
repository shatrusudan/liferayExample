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

package com.workflow.demo.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.WorkflowDefinitionLinkPersistence;
import com.liferay.portal.service.persistence.WorkflowInstanceLinkPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;

import com.workflow.demo.model.Feedback;
import com.workflow.demo.service.FeedbackLocalService;
import com.workflow.demo.service.persistence.FeedbackPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the feedback local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.workflow.demo.service.impl.FeedbackLocalServiceImpl}.
 * </p>
 *
 * @author shatrusudan
 * @see com.workflow.demo.service.impl.FeedbackLocalServiceImpl
 * @see com.workflow.demo.service.FeedbackLocalServiceUtil
 * @generated
 */
public abstract class FeedbackLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements FeedbackLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.workflow.demo.service.FeedbackLocalServiceUtil} to access the feedback local service.
	 */

	/**
	 * Adds the feedback to the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedback the feedback
	 * @return the feedback that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Feedback addFeedback(Feedback feedback) throws SystemException {
		feedback.setNew(true);

		return feedbackPersistence.update(feedback);
	}

	/**
	 * Creates a new feedback with the primary key. Does not add the feedback to the database.
	 *
	 * @param feedbackId the primary key for the new feedback
	 * @return the new feedback
	 */
	@Override
	public Feedback createFeedback(long feedbackId) {
		return feedbackPersistence.create(feedbackId);
	}

	/**
	 * Deletes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback that was removed
	 * @throws PortalException if a feedback with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Feedback deleteFeedback(long feedbackId)
		throws PortalException, SystemException {
		return feedbackPersistence.remove(feedbackId);
	}

	/**
	 * Deletes the feedback from the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedback the feedback
	 * @return the feedback that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Feedback deleteFeedback(Feedback feedback) throws SystemException {
		return feedbackPersistence.remove(feedback);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Feedback.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return feedbackPersistence.findWithDynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return feedbackPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return feedbackPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return feedbackPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return feedbackPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Feedback fetchFeedback(long feedbackId) throws SystemException {
		return feedbackPersistence.fetchByPrimaryKey(feedbackId);
	}

	/**
	 * Returns the feedback with the matching UUID and company.
	 *
	 * @param uuid the feedback's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Feedback fetchFeedbackByUuidAndCompanyId(String uuid, long companyId)
		throws SystemException {
		return feedbackPersistence.fetchByUuid_C_First(uuid, companyId, null);
	}

	/**
	 * Returns the feedback matching the UUID and group.
	 *
	 * @param uuid the feedback's UUID
	 * @param groupId the primary key of the group
	 * @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Feedback fetchFeedbackByUuidAndGroupId(String uuid, long groupId)
		throws SystemException {
		return feedbackPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the feedback with the primary key.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback
	 * @throws PortalException if a feedback with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Feedback getFeedback(long feedbackId)
		throws PortalException, SystemException {
		return feedbackPersistence.findByPrimaryKey(feedbackId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return feedbackPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the feedback with the matching UUID and company.
	 *
	 * @param uuid the feedback's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching feedback
	 * @throws PortalException if a matching feedback could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Feedback getFeedbackByUuidAndCompanyId(String uuid, long companyId)
		throws PortalException, SystemException {
		return feedbackPersistence.findByUuid_C_First(uuid, companyId, null);
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
	@Override
	public Feedback getFeedbackByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return feedbackPersistence.findByUUID_G(uuid, groupId);
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
	@Override
	public List<Feedback> getFeedbacks(int start, int end)
		throws SystemException {
		return feedbackPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of feedbacks.
	 *
	 * @return the number of feedbacks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getFeedbacksCount() throws SystemException {
		return feedbackPersistence.countAll();
	}

	/**
	 * Updates the feedback in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param feedback the feedback
	 * @return the feedback that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Feedback updateFeedback(Feedback feedback) throws SystemException {
		return feedbackPersistence.update(feedback);
	}

	/**
	 * Returns the feedback local service.
	 *
	 * @return the feedback local service
	 */
	public com.workflow.demo.service.FeedbackLocalService getFeedbackLocalService() {
		return feedbackLocalService;
	}

	/**
	 * Sets the feedback local service.
	 *
	 * @param feedbackLocalService the feedback local service
	 */
	public void setFeedbackLocalService(
		com.workflow.demo.service.FeedbackLocalService feedbackLocalService) {
		this.feedbackLocalService = feedbackLocalService;
	}

	/**
	 * Returns the feedback persistence.
	 *
	 * @return the feedback persistence
	 */
	public FeedbackPersistence getFeedbackPersistence() {
		return feedbackPersistence;
	}

	/**
	 * Sets the feedback persistence.
	 *
	 * @param feedbackPersistence the feedback persistence
	 */
	public void setFeedbackPersistence(FeedbackPersistence feedbackPersistence) {
		this.feedbackPersistence = feedbackPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the workflow definition link local service.
	 *
	 * @return the workflow definition link local service
	 */
	public com.liferay.portal.service.WorkflowDefinitionLinkLocalService getWorkflowDefinitionLinkLocalService() {
		return workflowDefinitionLinkLocalService;
	}

	/**
	 * Sets the workflow definition link local service.
	 *
	 * @param workflowDefinitionLinkLocalService the workflow definition link local service
	 */
	public void setWorkflowDefinitionLinkLocalService(
		com.liferay.portal.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService) {
		this.workflowDefinitionLinkLocalService = workflowDefinitionLinkLocalService;
	}

	/**
	 * Returns the workflow definition link persistence.
	 *
	 * @return the workflow definition link persistence
	 */
	public WorkflowDefinitionLinkPersistence getWorkflowDefinitionLinkPersistence() {
		return workflowDefinitionLinkPersistence;
	}

	/**
	 * Sets the workflow definition link persistence.
	 *
	 * @param workflowDefinitionLinkPersistence the workflow definition link persistence
	 */
	public void setWorkflowDefinitionLinkPersistence(
		WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence) {
		this.workflowDefinitionLinkPersistence = workflowDefinitionLinkPersistence;
	}

	/**
	 * Returns the workflow instance link local service.
	 *
	 * @return the workflow instance link local service
	 */
	public com.liferay.portal.service.WorkflowInstanceLinkLocalService getWorkflowInstanceLinkLocalService() {
		return workflowInstanceLinkLocalService;
	}

	/**
	 * Sets the workflow instance link local service.
	 *
	 * @param workflowInstanceLinkLocalService the workflow instance link local service
	 */
	public void setWorkflowInstanceLinkLocalService(
		com.liferay.portal.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService) {
		this.workflowInstanceLinkLocalService = workflowInstanceLinkLocalService;
	}

	/**
	 * Returns the workflow instance link persistence.
	 *
	 * @return the workflow instance link persistence
	 */
	public WorkflowInstanceLinkPersistence getWorkflowInstanceLinkPersistence() {
		return workflowInstanceLinkPersistence;
	}

	/**
	 * Sets the workflow instance link persistence.
	 *
	 * @param workflowInstanceLinkPersistence the workflow instance link persistence
	 */
	public void setWorkflowInstanceLinkPersistence(
		WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence) {
		this.workflowInstanceLinkPersistence = workflowInstanceLinkPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.workflow.demo.model.Feedback",
			feedbackLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.workflow.demo.model.Feedback");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Feedback.class;
	}

	protected String getModelClassName() {
		return Feedback.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = feedbackPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.workflow.demo.service.FeedbackLocalService.class)
	protected com.workflow.demo.service.FeedbackLocalService feedbackLocalService;
	@BeanReference(type = FeedbackPersistence.class)
	protected FeedbackPersistence feedbackPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = com.liferay.portal.service.WorkflowDefinitionLinkLocalService.class)
	protected com.liferay.portal.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService;
	@BeanReference(type = WorkflowDefinitionLinkPersistence.class)
	protected WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence;
	@BeanReference(type = com.liferay.portal.service.WorkflowInstanceLinkLocalService.class)
	protected com.liferay.portal.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService;
	@BeanReference(type = WorkflowInstanceLinkPersistence.class)
	protected WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
	protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
	@BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
	protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private FeedbackLocalServiceClpInvoker _clpInvoker = new FeedbackLocalServiceClpInvoker();
}