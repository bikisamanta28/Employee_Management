<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.revisited.employee.model.Employee" %>

<%
long employeeId = Long.valueOf((Long) renderRequest
        .getAttribute("employeeId"));
  Employee employees=(Employee)renderRequest.getAttribute("employee");
%>
<p><%=employeeId %></p>

<portlet:actionURL name="saveEmployee" var="saveEmployeeURL">
</portlet:actionURL>
<a href="${saveEmployeeURL }">Save</a>
<aui:form name="fm" action="${ saveEmployeeURL}">
 <aui:model-context bean="<%=employees %>" model="<%= Employee.class %>" />
<aui:input name="name" ></aui:input>
<aui:input name="adress" ></aui:input>
<aui:input name="phoneNo" ></aui:input>
<aui:input name="salary" label="Salary" ></aui:input>
<aui:input name="emailAdress" label="Email-Adress" placeHolder="user@gmail.com"></aui:input>
<aui:input name="doj" inlineField="true" label="Date Entry :" placeholder="dd/mm/yyyy"></aui:input>
<aui:input name="dol" inlineField="true" label="Date leaving :" placeholder="dd/mm/yyyy"></aui:input>
<aui:input name="employeeId" type="hidden" value='<%= employees == null ? 0 : employeeId %>'/>
<aui:button-row>
<aui:button cssClass="btn btn-primary" type="submit"></aui:button>
</aui:button-row>
</aui:form>