<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.revisited.employee.model.Employee" %>
<%@ page import ="com.liferay.revisited.employee.service.EmployeeLocalService" %>
<%@ page import ="com.liferay.revisited.employee.service.EmployeeLocalServiceUtil" %>

<p>
	<b><liferay-ui:message key="employeecontroller.caption"/></b>
</p>
<%
long employeeId = Long.valueOf((Long) renderRequest
        .getAttribute("employeeId"));
int employeeCount=(int)renderRequest.getAttribute("totalEmployee");
%>
<p><%=employeeCount %></p>

<portlet:renderURL var="createEditRender">
 <portlet:param name="mvcRenderCommandName" value="/create/edit"/>
</portlet:renderURL>
<a href="${ createEditRender}">Create Employee</a>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-entries-were-found" total="<%= EmployeeLocalServiceUtil.getEmployeesCount() %>">
        <liferay-ui:search-container-results results="<%=EmployeeLocalServiceUtil.getEmployees(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
  <liferay-ui:search-container-row className="com.liferay.revisited.employee.model.Employee" keyProperty="employeeId" modelVar="entry" escapedModel="<%=true%>">
        

    <liferay-ui:search-container-column-text property="name" />
    <liferay-ui:search-container-column-text property="adress" />
    <liferay-ui:search-container-column-text property="salary" />
    <liferay-ui:search-container-column-text property="emailAdress" />
    <liferay-ui:search-container-column-text property="doj" />
    <liferay-ui:search-container-column-text property="dol" />
    <liferay-ui:search-container-column-text name="Action">
    <liferay-ui:icon-menu>
    <portlet:renderURL var="editRender">
    <portlet:param name="mvcRenderCommandName" value="/create/edit"/>
    <portlet:param name="employeeId" value="${entry.employeeId}"/>
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit"
            url="<%=editRender.toString() %>" />
    </liferay-ui:icon-menu>
    </liferay-ui:search-container-column-text>
    
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />

</liferay-ui:search-container>