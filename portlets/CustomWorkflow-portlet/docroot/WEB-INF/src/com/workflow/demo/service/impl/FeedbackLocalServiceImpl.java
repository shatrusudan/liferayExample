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

package com.workflow.demo.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.workflow.demo.model.Feedback;
import com.workflow.demo.service.base.FeedbackLocalServiceBaseImpl;
import com.workflow.demo.service.persistence.FeedbackUtil;

import java.util.List;

/**
 * The implementation of the feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.workflow.demo.service.FeedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author shatrusudan
 * @see com.workflow.demo.service.base.FeedbackLocalServiceBaseImpl
 * @see com.workflow.demo.service.FeedbackLocalServiceUtil
 */
public class FeedbackLocalServiceImpl extends FeedbackLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.workflow.demo.service.FeedbackLocalServiceUtil} to access the feedback local service.
	 */
	public List<Feedback> findG_s(long groupId,int status) throws SystemException{
		
		return FeedbackUtil.findByG_S(groupId, status);
	}
}