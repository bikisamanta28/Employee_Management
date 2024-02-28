create table ls_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	adress VARCHAR(75) null,
	phoneNo LONG,
	salary LONG,
	emailAdress VARCHAR(75) null,
	doj DATE null,
	dol DATE null
);