package com.liferay.revisited.portlet;

import com.liferay.revisited.constants.EmployeeControllerPortletKeys;
import com.liferay.revisited.employee.model.Employee;
import com.liferay.revisited.employee.service.EmployeeLocalService;

import java.io.IOException;
import java.util.List;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=EmployeeController",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeeControllerPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		int delta=ParamUtil.getInteger(renderRequest,"delta");
		int cur=ParamUtil.getInteger(renderRequest, "cur");
		int from=delta*(cur-1)+1;
		int to =delta==0?10:delta*cur;
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
		    Employee.class.getName(), renderRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId=serviceContext.getCompanyId();
			String uuid=serviceContext.getUuid();
			long employeeId=ParamUtil.getLong(renderRequest, "employeeId");
			List<Employee>employees=_employeeLocalService.getEmployeesByUuidAndCompanyId(uuid, companyId);
			
			renderRequest.setAttribute("employeeId", employeeId);
			renderRequest.setAttribute("totalEmployee", _employeeLocalService.getEmployeesCount());
			
			
			 renderRequest.setAttribute("entries",_employeeLocalService.getEmployees(from,to));
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			throw new PortletException(e);
			
		}
		
		System.out.println(" doview ");
		super.doView(renderRequest, renderResponse);
	}
	@Reference(unbind="")
	protected void setEmployeeService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService=employeeLocalService;
	}
	private EmployeeLocalService _employeeLocalService;
	
	
}