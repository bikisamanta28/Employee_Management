package com.test.api.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author me
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Contains all of the data for a single student.",
	value = "Employee"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Employee")
public class Employee implements Serializable {

	public static Employee toDTO(String json) {
		return ObjectMapperUtil.readValue(Employee.class, json);
	}

	public static Employee unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Employee.class, json);
	}

	@Schema(description = "Employee adress.")
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@JsonIgnore
	public void setAdress(
		UnsafeSupplier<String, Exception> adressUnsafeSupplier) {

		try {
			adress = adressUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Employee adress.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String adress;

	@Schema(description = "The date the wiki page,")
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@JsonIgnore
	public void setDoj(UnsafeSupplier<Date, Exception> dojUnsafeSupplier) {
		try {
			doj = dojUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The date the wiki page,")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date doj;

	@Schema(description = "The date the wiki page,")
	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

	@JsonIgnore
	public void setDol(UnsafeSupplier<Date, Exception> dolUnsafeSupplier) {
		try {
			dol = dolUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The date the wiki page,")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date dol;

	@Schema(description = "Student Email Id.")
	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	@JsonIgnore
	public void setEmailAdress(
		UnsafeSupplier<String, Exception> emailAdressUnsafeSupplier) {

		try {
			emailAdress = emailAdressUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Student Email Id.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String emailAdress;

	@Schema
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@JsonIgnore
	public void setEmployeeId(
		UnsafeSupplier<Long, Exception> employeeIdUnsafeSupplier) {

		try {
			employeeId = employeeIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long employeeId;

	@Schema(description = "Name.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Name.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String name;

	@Schema(description = "Employee Phoen no.")
	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@JsonIgnore
	public void setPhoneNo(
		UnsafeSupplier<Long, Exception> phoneNoUnsafeSupplier) {

		try {
			phoneNo = phoneNoUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Employee Phoen no.")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Long phoneNo;

	@Schema(description = "enter employee salary")
	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@JsonIgnore
	public void setSalary(
		UnsafeSupplier<Long, Exception> salaryUnsafeSupplier) {

		try {
			salary = salaryUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "enter employee salary")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long salary;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)object;

		return Objects.equals(toString(), employee.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (adress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"adress\": ");

			sb.append("\"");

			sb.append(_escape(adress));

			sb.append("\"");
		}

		if (doj != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"doj\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(doj));

			sb.append("\"");
		}

		if (dol != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dol\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dol));

			sb.append("\"");
		}

		if (emailAdress != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAdress\": ");

			sb.append("\"");

			sb.append(_escape(emailAdress));

			sb.append("\"");
		}

		if (employeeId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"employeeId\": ");

			sb.append(employeeId);
		}

		if (name != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(name));

			sb.append("\"");
		}

		if (phoneNo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"phoneNo\": ");

			sb.append(phoneNo);
		}

		if (salary != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"salary\": ");

			sb.append(salary);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.test.api.dto.v1_0.Employee", name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}