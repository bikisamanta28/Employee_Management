create index IX_16F5B78B on ls_Employee (name[$COLUMN_LENGTH:75$]);
create index IX_CA5C97C0 on ls_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CDA80E42 on ls_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);