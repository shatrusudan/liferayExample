<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />
This is the
<b>Spring Hello World</b>
portlet.
<br />

<portlet:renderURL var="renderURL">
	<portlet:param name="action" value="renderOne" />
</portlet:renderURL>

<portlet:renderURL var="renderURL1">
	<portlet:param name="action" value="renderTwo" />
</portlet:renderURL>

<portlet:renderURL var="roleURL">
	<portlet:param name="action" value="renderRole" />
</portlet:renderURL>
<portlet:renderURL var="orgURL">
	<portlet:param name="action" value="renderOrg" />
</portlet:renderURL>

<portlet:actionURL var="add">
	<portlet:param name="createUser" value="add" />
</portlet:actionURL>
<portlet:actionURL var="addRole">
	<portlet:param name="createRole" value="add" />
</portlet:actionURL>
<portlet:actionURL var="addOrg">
	<portlet:param name="createOrg" value="add" />
</portlet:actionURL>
<portlet:actionURL var="assignRole">
	<portlet:param name="assignRole" value="assign" />
</portlet:actionURL>
<portlet:actionURL var="assignOrg">
	<portlet:param name="assignOrg" value="assign" />
</portlet:actionURL>


<%
boolean cPer=PortletPermissionUtil.contains(permissionChecker,"SpringHello_WAR_SpringHelloportlet", "TEST_PERMISSION");
System.out.println("this is testing of permission in jsp: "+cPer);
%>
<aui:form name="create" method="post" action="${add}">
	<aui:input name="screenName" type="text" label="Screen Name"/>
	<aui:input name="email" type="text" label="Email Id" />
	<aui:input name="title" type="text" label="Title" />
	<aui:input name="firstName" type="text" label="First Name" />
	<aui:input name="middleName" type="text" label="Middle Name" />
	<aui:input name="lastName" type="text" label="Last Name" />
	<aui:select name="suffix" label="Suffix" inlineLabel="true">
		<aui:option label="Jr." value="Jr." selected="true"></aui:option>
		<aui:option label="Phd." value="Phd."></aui:option>
		<aui:option label="Sir." value="Sir."></aui:option>
	</aui:select>
	<aui:input name="dob" type="text" label="Birthday" />
	<aui:select name="gender" label="Gender" inlineLabel="true">
		<aui:option label="Male" value="male" selected="true"></aui:option>
		<aui:option label="Female" value="female"></aui:option>
	</aui:select>
	<aui:input name="jobTitle" type="text" label="Job Title" />
	<aui:input name="password" type="text" label="Password" />
	<aui:input name="sQuestion" type="text" label="Security Question" />
	<aui:input name="sAnswer" type="text" label="Security Answer" />
	<aui:button type="submit" value="Create User" />
</aui:form>


<a href="${roleURL}"> Create & Assign Role</a>

<a href="${orgURL}"> Create & Assign Organization</a>