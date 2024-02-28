package com.liferay.revisited.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.revisited.constants.EmployeeControllerPortletKeys;
import com.liferay.revisited.employee.model.Employee;
import com.liferay.revisited.employee.service.EmployeeLocalService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
		immediate=true,
		property= {
				"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
				"mvc.command.name=saveEmployee"},
		service =MVCActionCommand.class
		)

public class SaveActionMvcCommand extends BaseMVCActionCommand {

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
	    Employee.class.getName(), actionRequest);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	//	System.out.println("this is doprocessAction");
		long employeeId=ParamUtil.getLong(actionRequest, "employeeId");
		String name= ParamUtil.get(actionRequest, "name", "");
		String adress= ParamUtil.get(actionRequest, "adress", "");
		long phoneNo= ParamUtil.get(actionRequest, "phoneNo", 0);
		long salary=ParamUtil.get(actionRequest, "salary",0);
		String emailAdress= ParamUtil.get(actionRequest, "emailAdress", "");
		Date doj=ParamUtil.getDate(actionRequest,"doj",df );
		Date dol=ParamUtil.getDate(actionRequest, "dol", df);
		System.out.println(name+" "+adress+" "+phoneNo+" "+salary+" "+emailAdress+" "+doj+" "+dol+" "+employeeId);
     
		if(employeeId>0) {
			try {
				_employeeLocalService.updateEmployee(serviceContext.getUserId(), name, adress, phoneNo, salary, emailAdress, doj, dol, employeeId, serviceContext);
				
			}catch(Exception e) {
				
				  System.out.println("error in save action mvc portlet");
		    	  SessionErrors.add(actionRequest, e.getClass().getName());
		    	  PortalUtil.copyRequestParameters(actionRequest, actionResponse);
			}
		}
		else {
		try {
    	 
    	 
    	  _employeeLocalService.addEmployee( serviceContext.getUserId(), name, adress, phoneNo, salary, emailAdress, doj, dol, serviceContext);
      }catch(Exception e) {
    	  System.out.println("error in save action mvc portlet");
    	  SessionErrors.add(actionRequest, e.getClass().getName());
    	  PortalUtil.copyRequestParameters(actionRequest, actionResponse);
      }
		}
   }
	
	@Reference(unbind="")
	protected void setEmployeeService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService=employeeLocalService;
	}
	private EmployeeLocalService _employeeLocalService;

}
