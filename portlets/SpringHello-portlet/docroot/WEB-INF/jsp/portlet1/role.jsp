<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="roleURL">
	<portlet:param name="action" value="renderRole" />
</portlet:renderURL>
<portlet:actionURL var="addRole">
	<portlet:param name="createRole" value="add" />
</portlet:actionURL>
<portlet:actionURL var="assignRole">
	<portlet:param name="assignRole" value="assign" />
</portlet:actionURL>


<aui:form name="create" method="post" action="${addRole}">
	<aui:input name="roleName" type="text" label="Role Name"/>
	
	<aui:button type="submit" value="Create Role" />
</aui:form>

<%
List<Role> allRole = RoleLocalServiceUtil.getRoles(themeDisplay.getLayout().getCompanyId());
//System.out.println("view all roles. "+Arrays.asList(allRole));

int userCount = UserLocalServiceUtil.getUsersCount();
List<User> allUser = UserLocalServiceUtil.getUsers(1, userCount);
System.out.println("view all roles. "+Arrays.asList(allUser));
%>

<aui:form name="create" method="post" action="${assignRole}">
	<aui:select name="rId" label="Roles">
               
<%
     for (Role roles : allRole) {
%>
            <aui:option value="<%= roles.getRoleId() %>" >
            <%= roles.getName() %>
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
	
	<aui:button type="submit" value="Assign Role" />
</aui:form>



<a href="${roleURL}"> Assign Role</a>
