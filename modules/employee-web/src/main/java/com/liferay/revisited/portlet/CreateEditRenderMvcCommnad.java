package com.liferay.revisited.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.revisited.constants.EmployeeControllerPortletKeys;
import com.liferay.revisited.employee.service.EmployeeLocalService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property= {
				"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
				"mvc.command.name=/create/edit"
		})

public class CreateEditRenderMvcCommnad implements MVCRenderCommand  {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		System.out.println("go to create edit employee");
		long employeeId=ParamUtil.getLong(renderRequest, "employeeId",0);
		
			
			try {
				renderRequest.setAttribute("employeeId",employeeId);
				renderRequest.setAttribute("employee", _employeeLocalService.getEmployee(employeeId));
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		
		
		System.out.println("employeeId is "+employeeId);
		return "/edit.jsp";
	}
	@Reference(unbind="")
	protected void setEmployeeService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService=employeeLocalService;
	}
	private EmployeeLocalService _employeeLocalService;

}
