CREATE SCHEMA switchtothesun;

SET search_path TO switchtothesun;

create table CONTINENT
(
    ID   integer       not null,
    NAME varchar2(256) NOT NULL UNIQUE,
    CONSTRAINT PK_CONTINENT primary key (ID)
);
create sequence continent_seq start with 1 increment by 1;

create table COUNTRY
(
    ID              integer       NOT NULL,
    NAME            varchar2(256) NOT NULL UNIQUE,
    FK_CONTINENT_ID integer,
    CONSTRAINT FK_COUNTRY_CONTINENT foreign key (FK_CONTINENT_ID) references CONTINENT (ID),
    CONSTRAINT PK_COUNTRY primary key (ID)
);
create sequence country_seq start with 1 increment by 1;

create table ATTRACTION
(
    ID            integer       NOT NULL,
    NAME          varchar2(256) NOT NULL,
    TYPE          varchar2(256) NOT NULL,
    FK_COUNTRY_ID integer       NOT NULL,
    CONSTRAINT FK_ATTRACTION_COUNTRY foreign key (FK_COUNTRY_ID) references COUNTRY (ID),
    CONSTRAINT PK_ATTRACTION primary key (ID)

);
create sequence attraction_seq start with 1 increment by 1;

create table TOURIST
(
    ID   integer       NOT NULL,
    NAME varchar2(256) NOT NULL,
    CONSTRAINT PK_TOURIST primary key (ID)
);
create sequence tourist_seq start with 1 increment by 1;

create table metadata
(
    ID               integer not null,
    NUMBER_OF_VISITS integer not null,
    CONSTRAINT PK_METADATA PRIMARY KEY (ID)
);
