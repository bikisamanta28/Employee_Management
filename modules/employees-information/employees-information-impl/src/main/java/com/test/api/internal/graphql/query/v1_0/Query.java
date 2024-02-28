package com.test.api.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLTypeExtension;
import com.liferay.portal.vulcan.pagination.Page;

import com.test.api.dto.v1_0.Employee;
import com.test.api.dto.v1_0.EmployeePost;
import com.test.api.resource.v1_0.EmployeeResource;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Query {

	public static void setEmployeeResourceComponentServiceObjects(
		ComponentServiceObjects<EmployeeResource>
			employeeResourceComponentServiceObjects) {

		_employeeResourceComponentServiceObjects =
			employeeResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {student(employeeId: ___){employeeId, name, adress, phoneNo, salary, emailAdress, doj, dol}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves the list of student of that rollNo.")
	public Employee student(@GraphQLName("employeeId") Long employeeId)
		throws Exception {

		return _applyComponentServiceObjects(
			_employeeResourceComponentServiceObjects,
			this::_populateResourceContext,
			employeeResource -> employeeResource.getStudent(employeeId));
	}

	@GraphQLTypeExtension(EmployeePost.class)
	public class GetStudentTypeExtension {

		public GetStudentTypeExtension(EmployeePost employeePost) {
			_employeePost = employeePost;
		}

		@GraphQLField(
			description = "Retrieves the list of student of that rollNo."
		)
		public Employee student() throws Exception {
			return _applyComponentServiceObjects(
				_employeeResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				employeeResource -> employeeResource.getStudent(
					_employeePost.getEmployeeId()));
		}

		private EmployeePost _employeePost;

	}

	@GraphQLName("EmployeePage")
	public class EmployeePage {

		public EmployeePage(Page employeePage) {
			actions = employeePage.getActions();

			items = employeePage.getItems();
			lastPage = employeePage.getLastPage();
			page = employeePage.getPage();
			pageSize = employeePage.getPageSize();
			totalCount = employeePage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Employee> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(EmployeeResource employeeResource)
		throws Exception {

		employeeResource.setContextAcceptLanguage(_acceptLanguage);
		employeeResource.setContextCompany(_company);
		employeeResource.setContextHttpServletRequest(_httpServletRequest);
		employeeResource.setContextHttpServletResponse(_httpServletResponse);
		employeeResource.setContextUriInfo(_uriInfo);
		employeeResource.setContextUser(_user);
		employeeResource.setGroupLocalService(_groupLocalService);
		employeeResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<EmployeeResource>
		_employeeResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}