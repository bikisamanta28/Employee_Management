package com.test.api.internal.resource.v1_0;

import com.ctc.wstx.shaded.msv_core.datatype.xsd.DateType;
import com.ctc.wstx.shaded.msv_core.datatype.xsd.datetime.DateTimeFactory;

import com.liferay.revisited.employee.service.EmployeeLocalService;
import com.liferay.revisited.employee.service.EmployeeServiceUtil;
import com.test.api.dto.v1_0.Employee;
import com.test.api.dto.v1_0.EmployeePost;
import com.test.api.resource.v1_0.EmployeesResource;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/employees.properties",
	scope = ServiceScope.PROTOTYPE, service = EmployeesResource.class
)
public class EmployeesResourceImpl extends BaseEmployeesResourceImpl {
	
	@Override
	public EmployeePost postSiteEmployeePosting(String siteId,EmployeePost employeePost)
		throws Exception {
		
		long employeeId=employeePost.getEmployeeId();
		long salary=employeePost.getSalary();
		String adress=employeePost.getAdress();
		long phoneNo=employeePost.getPhoneNo();
		String emailAdress=employeePost.getEmailAdress();
		Date doj= employeePost.getDoj();
		Date dol=(Date)employeePost.getDol();
		
		com.liferay.revisited.employee.model.Employee employee=employeeLocalService.createEmployee(employeeId);
		employee.setAdress(adress);
		employee.setPhoneNo(phoneNo);
		employee.setEmailAdress(emailAdress);
		employee.setDoj(doj);
		employee.setDol(dol);
		employee.setSalary(salary);
		employee.setGroupId(20119);
		employeeLocalService.addEmployee(employee);
		return toPost(employee);
	}
	
protected EmployeePost toPost (com.liferay.revisited.employee.model.Employee employee) {
		
		
		
		return new EmployeePost() {{
			name=employee.getName();
			adress=employee.getAdress();
			phoneNo=employee.getPhoneNo();
			salary=employee.getSalary();
			emailAdress=employee.getEmailAdress();
			doj=employee.getDoj();
			dol=employee.getDol();
			
		}};
		
	}
	@Reference
	protected EmployeeLocalService employeeLocalService;
}