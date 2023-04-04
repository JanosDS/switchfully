insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'Europe');
insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'Asia');
insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'Africa');
insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'North America');
insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'South America');
insert into CONTINENT(ID, NAME)
VALUES (nextval('continent_seq'), 'Australia');

insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'France', (select id from CONTINENT where NAME = 'Europe'));
insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'Italy', (select id from CONTINENT where NAME = 'Europe'));
insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'Spain', (select id from CONTINENT where NAME = 'Europe'));
insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'Kenya', (select id from CONTINENT where NAME = 'Africa'));
insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'India', (select id from CONTINENT where NAME = 'Asia'));
insert into COUNTRY(ID, NAME, FK_CONTINENT_ID)
values (nextval('country_seq'), 'United States', (select id from CONTINENT where NAME = 'North America'));

insert into ATTRACTION(id, name, type, fk_country_id)
values (nextval('attraction_seq'), 'The Eifel Tower', 'MONUMENT', (select id from COUNTRY where NAME = 'France'));
insert into ATTRACTION(id, name, type, fk_country_id)
values (nextval('attraction_seq'), 'Côte d''azur', 'BEACH', (select id from COUNTRY where NAME = 'France'));
insert into ATTRACTION(id, name, type, fk_country_id)
values (nextval('attraction_seq'), 'The Colosseum', 'MONUMENT', (select id from COUNTRY where NAME = 'Italy'));
insert into ATTRACTION(id, name, type, fk_country_id)
values (nextval('attraction_seq'), 'Venice', 'CITY', (select id from COUNTRY where NAME = 'Italy'));
insert into ATTRACTION(id, name, type, fk_country_id)
values (nextval('attraction_seq'), 'Seville', 'CITY', (select id from COUNTRY where NAME = 'Spain'));

insert into metadata(ID, NUMBER_OF_VISITS)
values (0, 0);

-- drop table TOURIST;
-- drop sequence tourist_seq;
-- drop table ATTRACTION;
-- drop sequence attraction_seq;
-- drop table COUNTRY;
-- drop sequence country_seq;
-- drop TABLE CONTINENT;
-- drop sequence continent_seq;
-- drop table metadata;
