<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="orgURL">
	<portlet:param name="action" value="renderOrg" />
</portlet:renderURL>
<portlet:actionURL var="addOrg">
	<portlet:param name="createOrg" value="add" />
</portlet:actionURL>
<portlet:actionURL var="assignOrg">
	<portlet:param name="assignOrg" value="assign" />
</portlet:actionURL>


<aui:form name="create" method="post" action="${addOrg}">
	<aui:input name="orgName" type="text" label="Organization Name"/>
	
	<aui:button type="submit" value="Create Organization" />
</aui:form>

<%
int orgCount = OrganizationLocalServiceUtil.getOrganizationsCount();
List<Organization> allOrg = OrganizationLocalServiceUtil.getOrganizations(1, orgCount);

int userCount = UserLocalServiceUtil.getUsersCount();
List<User> allUser = UserLocalServiceUtil.getUsers(1, userCount);
%>

<aui:form name="create" method="post" action="${assignOrg}">
	<aui:select name="oId" label="Organization">
               
<%
     for (Organization orgs : allOrg) {
%>
            <aui:option value="<%= orgs.getOrganizationId() %>" >
            <%= orgs.getName() %>
            </aui:option>
<%
    }
%>                     
    </aui:select>
    
    <aui:select name="uId" label="Users">
               
<%
     for (User users : allUser) {
%>
            <aui:option value="<%= users.getUserId() %>" >
            <%= users.getFullName() %> 
            </aui:option>
<%
    }
%>                     
    </aui:select>
	
	<aui:button type="submit" value="Assign Organization" />
</aui:form>


<a href="${orgURL}"> Assign Organization</a>