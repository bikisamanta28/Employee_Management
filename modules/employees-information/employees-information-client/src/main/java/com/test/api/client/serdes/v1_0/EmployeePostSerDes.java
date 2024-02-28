package com.test.api.client.serdes.v1_0;

import com.test.api.client.dto.v1_0.EmployeePost;
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
public class EmployeePostSerDes {

	public static EmployeePost toDTO(String json) {
		EmployeePostJSONParser employeePostJSONParser =
			new EmployeePostJSONParser();

		return employeePostJSONParser.parseToDTO(json);
	}

	public static EmployeePost[] toDTOs(String json) {
		EmployeePostJSONParser employeePostJSONParser =
			new EmployeePostJSONParser();

		return employeePostJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EmployeePost employeePost) {
		if (employeePost == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (employeePost.getAdress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"adress\": ");

			sb.append("\"");

			sb.append(_escape(employeePost.getAdress()));

			sb.append("\"");
		}

		if (employeePost.getDoj() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"doj\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(employeePost.getDoj()));

			sb.append("\"");
		}

		if (employeePost.getDol() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dol\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(employeePost.getDol()));

			sb.append("\"");
		}

		if (employeePost.getEmailAdress() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"emailAdress\": ");

			sb.append("\"");

			sb.append(_escape(employeePost.getEmailAdress()));

			sb.append("\"");
		}

		if (employeePost.getEmployeeId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"employeeId\": ");

			sb.append(employeePost.getEmployeeId());
		}

		if (employeePost.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(employeePost.getName()));

			sb.append("\"");
		}

		if (employeePost.getPhoneNo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"phoneNo\": ");

			sb.append(employeePost.getPhoneNo());
		}

		if (employeePost.getSalary() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"salary\": ");

			sb.append(employeePost.getSalary());
		}

		if (employeePost.getSiteId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append("\"");

			sb.append(_escape(employeePost.getSiteId()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EmployeePostJSONParser employeePostJSONParser =
			new EmployeePostJSONParser();

		return employeePostJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EmployeePost employeePost) {
		if (employeePost == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (employeePost.getAdress() == null) {
			map.put("adress", null);
		}
		else {
			map.put("adress", String.valueOf(employeePost.getAdress()));
		}

		if (employeePost.getDoj() == null) {
			map.put("doj", null);
		}
		else {
			map.put(
				"doj", liferayToJSONDateFormat.format(employeePost.getDoj()));
		}

		if (employeePost.getDol() == null) {
			map.put("dol", null);
		}
		else {
			map.put(
				"dol", liferayToJSONDateFormat.format(employeePost.getDol()));
		}

		if (employeePost.getEmailAdress() == null) {
			map.put("emailAdress", null);
		}
		else {
			map.put(
				"emailAdress", String.valueOf(employeePost.getEmailAdress()));
		}

		if (employeePost.getEmployeeId() == null) {
			map.put("employeeId", null);
		}
		else {
			map.put("employeeId", String.valueOf(employeePost.getEmployeeId()));
		}

		if (employeePost.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(employeePost.getName()));
		}

		if (employeePost.getPhoneNo() == null) {
			map.put("phoneNo", null);
		}
		else {
			map.put("phoneNo", String.valueOf(employeePost.getPhoneNo()));
		}

		if (employeePost.getSalary() == null) {
			map.put("salary", null);
		}
		else {
			map.put("salary", String.valueOf(employeePost.getSalary()));
		}

		if (employeePost.getSiteId() == null) {
			map.put("siteId", null);
		}
		else {
			map.put("siteId", String.valueOf(employeePost.getSiteId()));
		}

		return map;
	}

	public static class EmployeePostJSONParser
		extends BaseJSONParser<EmployeePost> {

		@Override
		protected EmployeePost createDTO() {
			return new EmployeePost();
		}

		@Override
		protected EmployeePost[] createDTOArray(int size) {
			return new EmployeePost[size];
		}

		@Override
		protected void setField(
			EmployeePost employeePost, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "adress")) {
				if (jsonParserFieldValue != null) {
					employeePost.setAdress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "doj")) {
				if (jsonParserFieldValue != null) {
					employeePost.setDoj(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dol")) {
				if (jsonParserFieldValue != null) {
					employeePost.setDol(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "emailAdress")) {
				if (jsonParserFieldValue != null) {
					employeePost.setEmailAdress((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "employeeId")) {
				if (jsonParserFieldValue != null) {
					employeePost.setEmployeeId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					employeePost.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "phoneNo")) {
				if (jsonParserFieldValue != null) {
					employeePost.setPhoneNo(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "salary")) {
				if (jsonParserFieldValue != null) {
					employeePost.setSalary(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "siteId")) {
				if (jsonParserFieldValue != null) {
					employeePost.setSiteId((String)jsonParserFieldValue);
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