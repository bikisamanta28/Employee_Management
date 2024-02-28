package com.test.api.resource.v1_0.test;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import com.test.api.client.dto.v1_0.Employee;
import com.test.api.client.dto.v1_0.EmployeePost;
import com.test.api.client.http.HttpInvoker;
import com.test.api.client.pagination.Page;
import com.test.api.client.resource.v1_0.EmployeesResource;

import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author me
 * @generated
 */
@Generated("")
public abstract class BaseEmployeesResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_employeesResource.setContextCompany(testCompany);

		EmployeesResource.Builder builder = EmployeesResource.builder();

		employeesResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testGetEmployees() throws Exception {
		Employees postEmployees = testGetEmployees_addEmployees();

		Employee postEmployee = testGetEmployees_addEmployee(
			postEmployees.getId(), randomEmployee());

		Employee getEmployee = employeesResource.getEmployees(
			postEmployees.getId());

		assertEquals(postEmployee, getEmployee);
		assertValid(getEmployee);
	}

	protected Employee testGetEmployees_addEmployee(
			long employeesId, Employee employee)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPostSiteEmployeePosting() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertContains(Object employees, List<Object> employeeses) {
		boolean contains = false;

		for (Object item : employeeses) {
			if (equals(employees, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			employeeses + " does not contain " + employees, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(Object employees1, Object employees2) {
		Assert.assertTrue(
			employees1 + " does not equal " + employees2,
			equals(employees1, employees2));
	}

	protected void assertEquals(
		List<Object> employeeses1, List<Object> employeeses2) {

		Assert.assertEquals(employeeses1.size(), employeeses2.size());

		for (int i = 0; i < employeeses1.size(); i++) {
			Object employees1 = employeeses1.get(i);
			Object employees2 = employeeses2.get(i);

			assertEquals(employees1, employees2);
		}
	}

	protected void assertEquals(Employee employee1, Employee employee2) {
		Assert.assertTrue(
			employee1 + " does not equal " + employee2,
			equals(employee1, employee2));
	}

	protected void assertEquals(
		EmployeePost employeePost1, EmployeePost employeePost2) {

		Assert.assertTrue(
			employeePost1 + " does not equal " + employeePost2,
			equals(employeePost1, employeePost2));
	}

	protected void assertEqualsIgnoringOrder(
		List<Object> employeeses1, List<Object> employeeses2) {

		Assert.assertEquals(employeeses1.size(), employeeses2.size());

		for (Object employees1 : employeeses1) {
			boolean contains = false;

			for (Object employees2 : employeeses2) {
				if (equals(employees1, employees2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				employeeses2 + " does not contain " + employees1, contains);
		}
	}

	protected void assertValid(Object employees) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<Object> page) {
		boolean valid = false;

		java.util.Collection<Object> employeeses = page.getItems();

		int size = employeeses.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Employee employee) {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalEmployeeAssertFieldNames()) {

			if (Objects.equals("adress", additionalAssertFieldName)) {
				if (employee.getAdress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("doj", additionalAssertFieldName)) {
				if (employee.getDoj() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("dol", additionalAssertFieldName)) {
				if (employee.getDol() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("emailAdress", additionalAssertFieldName)) {
				if (employee.getEmailAdress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("employeeId", additionalAssertFieldName)) {
				if (employee.getEmployeeId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (employee.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("phoneNo", additionalAssertFieldName)) {
				if (employee.getPhoneNo() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("salary", additionalAssertFieldName)) {
				if (employee.getSalary() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(EmployeePost employeePost) {
		boolean valid = true;

		if (!Objects.equals(employeePost.getSiteId(), testGroup.getGroupId())) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalEmployeePostAssertFieldNames()) {

			if (Objects.equals("adress", additionalAssertFieldName)) {
				if (employeePost.getAdress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("doj", additionalAssertFieldName)) {
				if (employeePost.getDoj() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("dol", additionalAssertFieldName)) {
				if (employeePost.getDol() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("emailAdress", additionalAssertFieldName)) {
				if (employeePost.getEmailAdress() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("employeeId", additionalAssertFieldName)) {
				if (employeePost.getEmployeeId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (employeePost.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("phoneNo", additionalAssertFieldName)) {
				if (employeePost.getPhoneNo() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("salary", additionalAssertFieldName)) {
				if (employeePost.getSalary() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalEmployeeAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalEmployeePostAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(Object employees1, Object employees2) {
		if (employees1 == employees2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected boolean equals(Employee employee1, Employee employee2) {
		if (employee1 == employee2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalEmployeeAssertFieldNames()) {

			if (Objects.equals("adress", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getAdress(), employee2.getAdress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("doj", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getDoj(), employee2.getDoj())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dol", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getDol(), employee2.getDol())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("emailAdress", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getEmailAdress(),
						employee2.getEmailAdress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("employeeId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getEmployeeId(), employee2.getEmployeeId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getName(), employee2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("phoneNo", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getPhoneNo(), employee2.getPhoneNo())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("salary", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employee1.getSalary(), employee2.getSalary())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		EmployeePost employeePost1, EmployeePost employeePost2) {

		if (employeePost1 == employeePost2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalEmployeePostAssertFieldNames()) {

			if (Objects.equals("adress", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getAdress(), employeePost2.getAdress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("doj", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getDoj(), employeePost2.getDoj())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dol", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getDol(), employeePost2.getDol())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("emailAdress", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getEmailAdress(),
						employeePost2.getEmailAdress())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("employeeId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getEmployeeId(),
						employeePost2.getEmployeeId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getName(), employeePost2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("phoneNo", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getPhoneNo(),
						employeePost2.getPhoneNo())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("salary", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getSalary(), employeePost2.getSalary())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("siteId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						employeePost1.getSiteId(), employeePost2.getSiteId())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_employeesResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_employeesResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator, Object employees) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected Employee randomEmployee() throws Exception {
		return new Employee() {
			{
				adress = RandomTestUtil.randomString();
				doj = RandomTestUtil.nextDate();
				dol = RandomTestUtil.nextDate();
				emailAdress = RandomTestUtil.randomString();
				employeeId = RandomTestUtil.randomLong();
				name = RandomTestUtil.randomString();
				phoneNo = RandomTestUtil.randomLong();
				salary = RandomTestUtil.randomLong();
			}
		};
	}

	protected EmployeePost randomEmployeePost() throws Exception {
		return new EmployeePost() {
			{
				adress = RandomTestUtil.randomString();
				doj = RandomTestUtil.nextDate();
				dol = RandomTestUtil.nextDate();
				emailAdress = RandomTestUtil.randomString();
				employeeId = RandomTestUtil.randomLong();
				name = RandomTestUtil.randomString();
				phoneNo = RandomTestUtil.randomLong();
				salary = RandomTestUtil.randomLong();
				siteId = RandomTestUtil.randomString();
			}
		};
	}

	protected EmployeesResource employeesResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = _getSuperClass(source.getClass());

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					sourceClass.getDeclaredFields()) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				Method setMethod = _getMethod(
					targetClass, field.getName(), "set",
					getMethod.getReturnType());

				setMethod.invoke(target, getMethod.invoke(source));
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Class<?> _getSuperClass(Class<?> clazz) {
			Class<?> superClass = clazz.getSuperclass();

			if ((superClass == null) || (superClass == Object.class)) {
				return clazz;
			}

			return superClass;
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseEmployeesResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private com.test.api.resource.v1_0.EmployeesResource _employeesResource;

}