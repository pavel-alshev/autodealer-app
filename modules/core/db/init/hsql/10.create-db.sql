-- begin AUTODEALER_COUNTRY
create table AUTODEALER_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    DEFCOUNTRY varchar(255),
    --
    primary key (ID)
)^
-- end AUTODEALER_COUNTRY

-- add country on initialization
insert into AUTODEALER_COUNTRY
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, CODE, DEFCOUNTRY)
values ('c44049ef-7245-e885-7be7-52cc35bd5fda', 1, '2018-01-24 12:13:15', 'admin', '2018-01-24 14:11:17', null, null, null, 'Russia', 'RUS', 'def')


-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'autodealer_ExtUser' where DTYPE is null ^
-- end SEC_USER

-- begin AUTODEALER_MANUFACTURER
create table AUTODEALER_MANUFACTURER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36),
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end AUTODEALER_MANUFACTURER
-- begin AUTODEALER_COLOUR
create table AUTODEALER_COLOUR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end AUTODEALER_COLOUR

-- add colors on initialization
insert into AUTODEALER_COLOR
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, CODE)
values ('c44049ef-7245-e885-7be7-52cc35bd5fda', 1, '2018-01-24 12:13:15', 'admin', '2018-01-24 14:11:17', null, null, null, 'true black', 'C75 M68 Y67 K90')
insert into AUTODEALER_COLOR
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, CODE)
values ('c44049ef-7245-e885-7be7-52cc35bd5fdb', 1, '2018-01-24 12:13:15', 'admin', '2018-01-24 14:11:17', null, null, null, 'red', 'C0 M100 Y100 K0')
insert into AUTODEALER_COLOR
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NAME, CODE)
values ('c44049ef-7245-e885-7be7-52cc35bd5fdc', 1, '2018-01-24 12:13:15', 'admin', '2018-01-24 14:11:17', null, null, null, 'white', 'C0 M0 Y0 K0')