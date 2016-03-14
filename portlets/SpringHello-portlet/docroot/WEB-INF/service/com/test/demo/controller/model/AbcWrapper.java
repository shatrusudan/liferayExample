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

package com.test.demo.controller.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Abc}.
 * </p>
 *
 * @author shatrusudan.sharma
 * @see Abc
 * @generated
 */
public class AbcWrapper implements Abc, ModelWrapper<Abc> {
	public AbcWrapper(Abc abc) {
		_abc = abc;
	}

	@Override
	public Class<?> getModelClass() {
		return Abc.class;
	}

	@Override
	public String getModelClassName() {
		return Abc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fooId", getFooId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	* Returns the primary key of this abc.
	*
	* @return the primary key of this abc
	*/
	@Override
	public long getPrimaryKey() {
		return _abc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this abc.
	*
	* @param primaryKey the primary key of this abc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_abc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the foo ID of this abc.
	*
	* @return the foo ID of this abc
	*/
	@Override
	public long getFooId() {
		return _abc.getFooId();
	}

	/**
	* Sets the foo ID of this abc.
	*
	* @param fooId the foo ID of this abc
	*/
	@Override
	public void setFooId(long fooId) {
		_abc.setFooId(fooId);
	}

	/**
	* Returns the company ID of this abc.
	*
	* @return the company ID of this abc
	*/
	@Override
	public long getCompanyId() {
		return _abc.getCompanyId();
	}

	/**
	* Sets the company ID of this abc.
	*
	* @param companyId the company ID of this abc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_abc.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this abc.
	*
	* @return the user ID of this abc
	*/
	@Override
	public long getUserId() {
		return _abc.getUserId();
	}

	/**
	* Sets the user ID of this abc.
	*
	* @param userId the user ID of this abc
	*/
	@Override
	public void setUserId(long userId) {
		_abc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this abc.
	*
	* @return the user uuid of this abc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _abc.getUserUuid();
	}

	/**
	* Sets the user uuid of this abc.
	*
	* @param userUuid the user uuid of this abc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_abc.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this abc.
	*
	* @return the user name of this abc
	*/
	@Override
	public java.lang.String getUserName() {
		return _abc.getUserName();
	}

	/**
	* Sets the user name of this abc.
	*
	* @param userName the user name of this abc
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_abc.setUserName(userName);
	}

	/**
	* Returns the create date of this abc.
	*
	* @return the create date of this abc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _abc.getCreateDate();
	}

	/**
	* Sets the create date of this abc.
	*
	* @param createDate the create date of this abc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_abc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this abc.
	*
	* @return the modified date of this abc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _abc.getModifiedDate();
	}

	/**
	* Sets the modified date of this abc.
	*
	* @param modifiedDate the modified date of this abc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_abc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the field1 of this abc.
	*
	* @return the field1 of this abc
	*/
	@Override
	public java.lang.String getField1() {
		return _abc.getField1();
	}

	/**
	* Sets the field1 of this abc.
	*
	* @param field1 the field1 of this abc
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_abc.setField1(field1);
	}

	/**
	* Returns the field2 of this abc.
	*
	* @return the field2 of this abc
	*/
	@Override
	public boolean getField2() {
		return _abc.getField2();
	}

	/**
	* Returns <code>true</code> if this abc is field2.
	*
	* @return <code>true</code> if this abc is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _abc.isField2();
	}

	/**
	* Sets whether this abc is field2.
	*
	* @param field2 the field2 of this abc
	*/
	@Override
	public void setField2(boolean field2) {
		_abc.setField2(field2);
	}

	/**
	* Returns the field3 of this abc.
	*
	* @return the field3 of this abc
	*/
	@Override
	public int getField3() {
		return _abc.getField3();
	}

	/**
	* Sets the field3 of this abc.
	*
	* @param field3 the field3 of this abc
	*/
	@Override
	public void setField3(int field3) {
		_abc.setField3(field3);
	}

	/**
	* Returns the field4 of this abc.
	*
	* @return the field4 of this abc
	*/
	@Override
	public java.util.Date getField4() {
		return _abc.getField4();
	}

	/**
	* Sets the field4 of this abc.
	*
	* @param field4 the field4 of this abc
	*/
	@Override
	public void setField4(java.util.Date field4) {
		_abc.setField4(field4);
	}

	/**
	* Returns the field5 of this abc.
	*
	* @return the field5 of this abc
	*/
	@Override
	public java.lang.String getField5() {
		return _abc.getField5();
	}

	/**
	* Sets the field5 of this abc.
	*
	* @param field5 the field5 of this abc
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_abc.setField5(field5);
	}

	@Override
	public boolean isNew() {
		return _abc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_abc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _abc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_abc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _abc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _abc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_abc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _abc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_abc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_abc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_abc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AbcWrapper((Abc)_abc.clone());
	}

	@Override
	public int compareTo(Abc abc) {
		return _abc.compareTo(abc);
	}

	@Override
	public int hashCode() {
		return _abc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Abc> toCacheModel() {
		return _abc.toCacheModel();
	}

	@Override
	public Abc toEscapedModel() {
		return new AbcWrapper(_abc.toEscapedModel());
	}

	@Override
	public Abc toUnescapedModel() {
		return new AbcWrapper(_abc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _abc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _abc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_abc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AbcWrapper)) {
			return false;
		}

		AbcWrapper abcWrapper = (AbcWrapper)obj;

		if (Validator.equals(_abc, abcWrapper._abc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Abc getWrappedAbc() {
		return _abc;
	}

	@Override
	public Abc getWrappedModel() {
		return _abc;
	}

	@Override
	public void resetOriginalValues() {
		_abc.resetOriginalValues();
	}

	private Abc _abc;
}