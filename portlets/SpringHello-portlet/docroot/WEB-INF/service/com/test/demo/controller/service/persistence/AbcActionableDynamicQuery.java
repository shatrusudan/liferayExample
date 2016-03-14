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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.test.demo.controller.model.Abc;
import com.test.demo.controller.service.AbcLocalServiceUtil;

/**
 * @author shatrusudan.sharma
 * @generated
 */
public abstract class AbcActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AbcActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AbcLocalServiceUtil.getService());
		setClass(Abc.class);

		setClassLoader(com.test.demo.controller.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("fooId");
	}
}