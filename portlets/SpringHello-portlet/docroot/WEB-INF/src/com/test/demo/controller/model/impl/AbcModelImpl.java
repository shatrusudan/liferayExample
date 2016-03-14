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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.demo.controller.model.Abc;
import com.test.demo.controller.model.AbcModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Abc service. Represents a row in the &quot;xyz&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.demo.controller.model.AbcModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AbcImpl}.
 * </p>
 *
 * @author shatrusudan.sharma
 * @see AbcImpl
 * @see com.test.demo.controller.model.Abc
 * @see com.test.demo.controller.model.AbcModel
 * @generated
 */
public class AbcModelImpl extends BaseModelImpl<Abc> implements AbcModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a abc model instance should use the {@link com.test.demo.controller.model.Abc} interface instead.
	 */
	public static final String TABLE_NAME = "xyz";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fooId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "field1", Types.VARCHAR },
			{ "field2", Types.BOOLEAN },
			{ "field3", Types.INTEGER },
			{ "field4", Types.TIMESTAMP },
			{ "field5", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table xyz (fooId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,field1 VARCHAR(75) null,field2 BOOLEAN,field3 INTEGER,field4 DATE null,field5 VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table xyz";
	public static final String ORDER_BY_JPQL = " ORDER BY abc.field1 ASC";
	public static final String ORDER_BY_SQL = " ORDER BY xyz.field1 ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.demo.controller.model.Abc"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.demo.controller.model.Abc"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.test.demo.controller.model.Abc"),
			true);
	public static long FIELD2_COLUMN_BITMASK = 1L;
	public static long FIELD1_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.demo.controller.model.Abc"));

	public AbcModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fooId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFooId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fooId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getFooId() {
		return _fooId;
	}

	@Override
	public void setFooId(long fooId) {
		_fooId = fooId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getField1() {
		if (_field1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _field1;
		}
	}

	@Override
	public void setField1(String field1) {
		_columnBitmask = -1L;

		_field1 = field1;
	}

	@Override
	public boolean getField2() {
		return _field2;
	}

	@Override
	public boolean isField2() {
		return _field2;
	}

	@Override
	public void setField2(boolean field2) {
		_columnBitmask |= FIELD2_COLUMN_BITMASK;

		if (!_setOriginalField2) {
			_setOriginalField2 = true;

			_originalField2 = _field2;
		}

		_field2 = field2;
	}

	public boolean getOriginalField2() {
		return _originalField2;
	}

	@Override
	public int getField3() {
		return _field3;
	}

	@Override
	public void setField3(int field3) {
		_field3 = field3;
	}

	@Override
	public Date getField4() {
		return _field4;
	}

	@Override
	public void setField4(Date field4) {
		_field4 = field4;
	}

	@Override
	public String getField5() {
		if (_field5 == null) {
			return StringPool.BLANK;
		}
		else {
			return _field5;
		}
	}

	@Override
	public void setField5(String field5) {
		_field5 = field5;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Abc.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Abc toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Abc)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AbcImpl abcImpl = new AbcImpl();

		abcImpl.setFooId(getFooId());
		abcImpl.setCompanyId(getCompanyId());
		abcImpl.setUserId(getUserId());
		abcImpl.setUserName(getUserName());
		abcImpl.setCreateDate(getCreateDate());
		abcImpl.setModifiedDate(getModifiedDate());
		abcImpl.setField1(getField1());
		abcImpl.setField2(getField2());
		abcImpl.setField3(getField3());
		abcImpl.setField4(getField4());
		abcImpl.setField5(getField5());

		abcImpl.resetOriginalValues();

		return abcImpl;
	}

	@Override
	public int compareTo(Abc abc) {
		int value = 0;

		value = getField1().compareTo(abc.getField1());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Abc)) {
			return false;
		}

		Abc abc = (Abc)obj;

		long primaryKey = abc.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		AbcModelImpl abcModelImpl = this;

		abcModelImpl._originalField2 = abcModelImpl._field2;

		abcModelImpl._setOriginalField2 = false;

		abcModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Abc> toCacheModel() {
		AbcCacheModel abcCacheModel = new AbcCacheModel();

		abcCacheModel.fooId = getFooId();

		abcCacheModel.companyId = getCompanyId();

		abcCacheModel.userId = getUserId();

		abcCacheModel.userName = getUserName();

		String userName = abcCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			abcCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			abcCacheModel.createDate = createDate.getTime();
		}
		else {
			abcCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			abcCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			abcCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		abcCacheModel.field1 = getField1();

		String field1 = abcCacheModel.field1;

		if ((field1 != null) && (field1.length() == 0)) {
			abcCacheModel.field1 = null;
		}

		abcCacheModel.field2 = getField2();

		abcCacheModel.field3 = getField3();

		Date field4 = getField4();

		if (field4 != null) {
			abcCacheModel.field4 = field4.getTime();
		}
		else {
			abcCacheModel.field4 = Long.MIN_VALUE;
		}

		abcCacheModel.field5 = getField5();

		String field5 = abcCacheModel.field5;

		if ((field5 != null) && (field5.length() == 0)) {
			abcCacheModel.field5 = null;
		}

		return abcCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{fooId=");
		sb.append(getFooId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", field1=");
		sb.append(getField1());
		sb.append(", field2=");
		sb.append(getField2());
		sb.append(", field3=");
		sb.append(getField3());
		sb.append(", field4=");
		sb.append(getField4());
		sb.append(", field5=");
		sb.append(getField5());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.test.demo.controller.model.Abc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fooId</column-name><column-value><![CDATA[");
		sb.append(getFooId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field1</column-name><column-value><![CDATA[");
		sb.append(getField1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field2</column-name><column-value><![CDATA[");
		sb.append(getField2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field3</column-name><column-value><![CDATA[");
		sb.append(getField3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field4</column-name><column-value><![CDATA[");
		sb.append(getField4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>field5</column-name><column-value><![CDATA[");
		sb.append(getField5());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Abc.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Abc.class };
	private long _fooId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _field1;
	private boolean _field2;
	private boolean _originalField2;
	private boolean _setOriginalField2;
	private int _field3;
	private Date _field4;
	private String _field5;
	private long _columnBitmask;
	private Abc _escapedModel;
}