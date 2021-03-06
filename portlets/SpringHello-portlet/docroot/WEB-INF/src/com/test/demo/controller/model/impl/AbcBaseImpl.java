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

package com.test.demo.controller.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.test.demo.controller.model.Abc;
import com.test.demo.controller.service.AbcLocalServiceUtil;

/**
 * The extended model base implementation for the Abc service. Represents a row in the &quot;xyz&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AbcImpl}.
 * </p>
 *
 * @author shatrusudan.sharma
 * @see AbcImpl
 * @see com.test.demo.controller.model.Abc
 * @generated
 */
public abstract class AbcBaseImpl extends AbcModelImpl implements Abc {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a abc model instance should use the {@link Abc} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AbcLocalServiceUtil.addAbc(this);
		}
		else {
			AbcLocalServiceUtil.updateAbc(this);
		}
	}
}