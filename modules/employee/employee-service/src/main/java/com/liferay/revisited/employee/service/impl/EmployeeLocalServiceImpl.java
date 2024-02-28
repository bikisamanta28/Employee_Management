/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.revisited.employee.service.impl;

//import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.revisited.employee.model.Employee;
import com.liferay.revisited.employee.model.impl.EmployeeImpl;
import com.liferay.revisited.employee.service.EmployeeLocalService;
//import com.liferay.revisited.employee.model.impl.EmployeeImpl;
import com.liferay.revisited.employee.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.revisited.employee.service.persistence.EmployeePersistence;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.revisited.employee.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	
	public Employee addEmployee(long userId,String name,String adress,long phoneNo,long salary,String emailAdress,Date doj,Date dol,ServiceContext serviceContext) throws PortalException
	{
		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date now = new Date();
		
		long employeeId=counterLocalService.increment(Employee.class.getName());
		//Employee employee=new EmployeeImpl();
		Employee employee=employeePersistence.create(employeeId);
		
		employee.setGroupId(groupId);
		employee.setUserId(userId);
		employee.setCompanyId(user.getCompanyId());
		employee.setUserName(user.getFullName());
		employee.setUuid(serviceContext.getUuid());
		employee.setCreateDate(serviceContext.getCreateDate(now));
		employee.setModifiedDate(serviceContext.getModifiedDate(now));
		
		employee.setName(name);
		employee.setAdress(adress);
		employee.setEmailAdress(emailAdress);
		employee.setDoj(doj);
		employee.setDol(dol);
		employee.setPhoneNo(phoneNo);
		employee.setSalary(salary);
		super.addEmployee(employee);
		return employee;
	}
	public List<Employee>getEmployees(int start ,int end){
		
		return super.getEmployees(0, 10);
		
	}
	public Employee getEmployee(long employeeId ) throws PortalException {
		
		return super.getEmployee(employeeId);
	}
	@Override
	public List<Employee> getEmployeesByUuidAndCompanyId(
		String uuid, long companyId) {
		

		return employeePersistence.findByUuid_C(uuid, companyId);
	}
	
	
	
	public int getEmployeesCount() throws NullPointerException {
		//System.out.println("getEmployeesCount");
		
			return super.getEmployeesCount();
			}
	@Override
	public List<Employee> getEmployees(long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public Employee updateEmployee(long userId,String name,String adress,long phoneNo,long salary,String emailAdress,Date doj,Date dol,long employeeId,ServiceContext serviceContext) throws PortalException {
		
		Employee employee=super.getEmployee(employeeId);
		User user = userLocalService.getUserById(userId);
		Date now = new Date();
		employee.setName(name);
		employee.setAdress(adress);
		employee.setEmailAdress(emailAdress);
		employee.setModifiedDate(serviceContext.getModifiedDate(now));
		employee.setDoj(doj);
		employee.setDol(dol);
		employee.setPhoneNo(phoneNo);
		employee.setSalary(salary);
		
		return super.updateEmployee(employee);
	}
}