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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.demo.controller.model.Abc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Abc in entity cache.
 *
 * @author shatrusudan.sharma
 * @see Abc
 * @generated
 */
public class AbcCacheModel implements CacheModel<Abc>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{fooId=");
		sb.append(fooId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Abc toEntityModel() {
		AbcImpl abcImpl = new AbcImpl();

		abcImpl.setFooId(fooId);
		abcImpl.setCompanyId(companyId);
		abcImpl.setUserId(userId);

		if (userName == null) {
			abcImpl.setUserName(StringPool.BLANK);
		}
		else {
			abcImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			abcImpl.setCreateDate(null);
		}
		else {
			abcImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			abcImpl.setModifiedDate(null);
		}
		else {
			abcImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (field1 == null) {
			abcImpl.setField1(StringPool.BLANK);
		}
		else {
			abcImpl.setField1(field1);
		}

		abcImpl.setField2(field2);
		abcImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			abcImpl.setField4(null);
		}
		else {
			abcImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			abcImpl.setField5(StringPool.BLANK);
		}
		else {
			abcImpl.setField5(field5);
		}

		abcImpl.resetOriginalValues();

		return abcImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fooId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		field1 = objectInput.readUTF();
		field2 = objectInput.readBoolean();
		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fooId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (field1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);
		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public long fooId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;
}