package com.test.api.client.serdes.v1_0;

import com.test.api.client.dto.v1_0.Employee;
import com.test.api.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author me
 * @generated
 */
@Generated("")
public class EmployeeSerDes {

	public static Employee toDTO(String json) {
		EmployeeJSONParser employeeJSONParser = new EmployeeJSONParser();

		return employeeJSONParser.parseToDTO(json);
	}

	public static Employee[] toDTOs(String json) {
		EmployeeJSONParser employeeJSONParser = new EmployeeJSONParser();

		return employeeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Employee employee) {
		if (employee == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (employee.getAdress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"adress\": ");

			sb.append("\"");

			sb.append(_escape(employee.getAdress()));

			sb.append("\"");
		}

		if (employee.getDoj() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"doj\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(employee.getDoj()));

			sb.append("\"");
		}

		if (employee.getDol() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dol\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(employee.getDol()));

			sb.append("\"");
		}

		if (employee.getEmailAdress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAdress\": ");

			sb.append("\"");

			sb.append(_escape(employee.getEmailAdress()));

			sb.append("\"");
		}

		if (employee.getEmployeeId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"employeeId\": ");

			sb.append(employee.getEmployeeId());
		}

		if (employee.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(employee.getName()));

			sb.append("\"");
		}

		if (employee.getPhoneNo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"phoneNo\": ");

			sb.append(employee.getPhoneNo());
		}

		if (employee.getSalary() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"salary\": ");

			sb.append(employee.getSalary());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EmployeeJSONParser employeeJSONParser = new EmployeeJSONParser();

		return employeeJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Employee employee) {
		if (employee == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (employee.getAdress() == null) {
			map.put("adress", null);
		}
		else {
			map.put("adress", String.valueOf(employee.getAdress()));
		}

		if (employee.getDoj() == null) {
			map.put("doj", null);
		}
		else {
			map.put("doj", liferayToJSONDateFormat.format(employee.getDoj()));
		}

		if (employee.getDol() == null) {
			map.put("dol", null);
		}
		else {
			map.put("dol", liferayToJSONDateFormat.format(employee.getDol()));
		}

		if (employee.getEmailAdress() == null) {
			map.put("emailAdress", null);
		}
		else {
			map.put("emailAdress", String.valueOf(employee.getEmailAdress()));
		}

		if (employee.getEmployeeId() == null) {
			map.put("employeeId", null);
		}
		else {
			map.put("employeeId", String.valueOf(employee.getEmployeeId()));
		}

		if (employee.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(employee.getName()));
		}

		if (employee.getPhoneNo() == null) {
			map.put("phoneNo", null);
		}
		else {
			map.put("phoneNo", String.valueOf(employee.getPhoneNo()));
		}

		if (employee.getSalary() == null) {
			map.put("salary", null);
		}
		else {
			map.put("salary", String.valueOf(employee.getSalary()));
		}

		return map;
	}

	public static class EmployeeJSONParser extends BaseJSONParser<Employee> {

		@Override
		protected Employee createDTO() {
			return new Employee();
		}

		@Override
		protected Employee[] createDTOArray(int size) {
			return new Employee[size];
		}

		@Override
		protected void setField(
			Employee employee, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "adress")) {
				if (jsonParserFieldValue != null) {
					employee.setAdress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "doj")) {
				if (jsonParserFieldValue != null) {
					employee.setDoj(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dol")) {
				if (jsonParserFieldValue != null) {
					employee.setDol(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "emailAdress")) {
				if (jsonParserFieldValue != null) {
					employee.setEmailAdress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "employeeId")) {
				if (jsonParserFieldValue != null) {
					employee.setEmployeeId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					employee.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "phoneNo")) {
				if (jsonParserFieldValue != null) {
					employee.setPhoneNo(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "salary")) {
				if (jsonParserFieldValue != null) {
					employee.setSalary(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}