package com.test.api.internal.resource.v1_0;

import com.liferay.revisited.employee.service.EmployeeLocalService;
import com.test.api.dto.v1_0.Employee;
import com.test.api.dto.v1_0.EmployeePost;
import com.test.api.resource.v1_0.EmployeeResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/employee.properties",
	scope = ServiceScope.PROTOTYPE, service = EmployeeResource.class
)
public class EmployeeResourceImpl extends BaseEmployeeResourceImpl {
	
	public Employee getStudent(Long employeeId)
			throws Exception {
		
		System.out.println(employeeId);

		com.liferay.revisited.employee.model.Employee employee=employeeLocalService.getEmployee(employeeId);
		
		System.out.println(employee);
		
		
		return toGet(employee);
	}
	protected Employee toGet (com.liferay.revisited.employee.model.Employee employee) {
		
		
		
		return new Employee() {{
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