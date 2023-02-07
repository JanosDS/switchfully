-- solution
----------------------------------
CREATE SCHEMA APP;
GO

-- ZIPCODES

CREATE TABLE APP.ZIPCODES ( 
             ZIPCODE INT NOT NULL , 
             CITY    VARCHAR(50) NOT NULL , 
             COUNTY  VARCHAR(50) NOT NULL , 
             STATE   VARCHAR(50) NOT NULL , 
             CONSTRAINT ZIPCODES_PK PRIMARY KEY(ZIPCODE)
                          );

-- FREELANCERS
-- Note: ID's are generated upfront, can be done making use of sequence as well
-- Note: best practice to split NAME into FIRST_NAME and LAST_NAME

CREATE TABLE APP.FREELANCERS ( 
             FREELANCER_ID INT NOT NULL , 
             NAME          VARCHAR(50) NOT NULL , 
             ADDRESS       VARCHAR(200) NOT NULL , 
             ZIPCODE       INT NOT NULL , 
             PRICE         FLOAT NOT NULL , 
             CONSTRAINT FREELANCERS_PK PRIMARY KEY(FREELANCER_ID) , 
             CONSTRAINT FREELANCERS_ZIPCODES_FK FOREIGN KEY(ZIPCODE) REFERENCES APP.ZIPCODES(
                                                                                ZIPCODE)
                             );

-- CUSTOMERS
-- Note: ID's are generated upfront, can be done making use of sequence as well

CREATE TABLE APP.CUSTOMERS ( 
             CUSTOMER_ID   INT NOT NULL , 
             CUSTOMER_NAME VARCHAR(200) NOT NULL , 
             ADDRESS       VARCHAR(200) NOT NULL , 
             ZIPCODE       INT NOT NULL , 
             CONSTRAINT CUSTOMERS_PK PRIMARY KEY(CUSTOMER_ID) , 
             CONSTRAINT CUSTOMERS_ZIPCODES_FK FOREIGN KEY(ZIPCODE) REFERENCES APP.ZIPCODES(
                                                                              ZIPCODE)
                           );

-- PROJECTS
-- Note: ID's are generated upfront, can be done making use of sequence as well

CREATE TABLE APP.PROJECTS ( 
             PROJECT_ID   INT NOT NULL , 
             PROJECT_NAME VARCHAR(200) NOT NULL , 
             ESTIMATION   INT NOT NULL , 
             CUSTOMER_ID  INT NOT NULL , 
             CONSTRAINT PROJECT_PK PRIMARY KEY(PROJECT_ID) , 
             CONSTRAINT PROJECTS_CUSTOMERS_FK FOREIGN KEY(CUSTOMER_ID) REFERENCES APP.CUSTOMERS(
                                                                                  CUSTOMER_ID)
                          );

-- WORKLOGS

CREATE TABLE APP.WORKLOGS ( 
             FREELANCER_ID INT NOT NULL , 
             PROJECT_ID    INT NOT NULL , 
             WORKDAY       DATE NOT NULL , 
             HOURS         INT NOT NULL , 
             CONSTRAINT WORKLOGS_PROJECTS_FK FOREIGN KEY(PROJECT_ID) REFERENCES APP.PROJECTS(
                                                                                PROJECT_ID) , 
             CONSTRAINT WORKLOGS_FREELANCERS_FK FOREIGN KEY(FREELANCER_ID) REFERENCES APP.FREELANCERS(
                                                                                      FREELANCER_ID)
                          );

DROP TABLE APP.WORKLOGS;

DROP TABLE APP.projects;

DROP TABLE APP.customers;

DROP TABLE APP.freelancers;

DROP TABLE APP.zipcodes;

-- Populate zipcodes




INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('70116', 'New Orleans', 'Orleans', 'LA');


INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('8014', 'Bridgeport', 'Gloucester', 'NJ');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('45011', 'Hamilton', 'Butler', 'OH');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('48116', 'Brighton', 'Livingston', 'MI');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('19443', 'Kulpsville', 'Montgomery', 'PA');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('11953', 'Middle Island', 'Suffolk', 'NY');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('90034', 'Los Angeles', 'Los Angeles', 'CA');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('44023', 'Chagrin Falls', 'Geauga', 'OH');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('78045', 'Laredo', 'Webb', 'TX');

INSERT INTO APP.zipcodes(zipcode, CITY, COUNTY, STATE)
VALUES('85013', 'Phoenix', 'Maricopa', 'AZ');


-- populate freelancers


INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('1', 'Tamar Hoogland', 54.375, '2371 Jerrold Ave', '19443');

INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('2', 'Moon Parlato', 64, '37275 St  Rt 17m M', '11953');

INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('3', 'Laurel Reitler', 57.5, '25 E 75th St #69', '90034');

INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('4', 'Delisa Crupi', 43.75, '98 Connecticut Ave Nw', '44023');

INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('5', 'Viva Toelkes', 90.75, '56 E Morehead St', '78045');

INSERT INTO APP.freelancers(FREELANCER_ID, NAME, PRICE, ADDRESS, ZIPCODE)
VALUES('6', 'Elza Lipke', 53.75, '73 State Road 434 E', '85013');

-- populate customers


INSERT INTO APP.CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES('1', 'Hotel coorporation UK', '6649 N Blue Gum St', '70116');

INSERT INTO APP.CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES('2', 'Great University', '8 W Cerritos Ave #54', '8014');

INSERT INTO APP.CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES('3', 'Visits.com', '34 Center St', '45011');

INSERT INTO APP.CUSTOMERS(CUSTOMER_ID, CUSTOMER_NAME, ADDRESS, ZIPCODE)
VALUES('4', 'eHealth', '4 B Blue Ridge Blvd', '48116');

-- populate projects


INSERT INTO APP.PROJECTS(PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES('1', 'Hotel Recommendation System Based on Hybrid Recommendation Model', '25', '1');

INSERT INTO APP.PROJECTS(PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES('4', 'Advanced Intelligent Tourist Guide', '12', '1');

INSERT INTO APP.PROJECTS(PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES('3', 'College Forums with Alumni With Content Filtering', '10', '2');

INSERT INTO APP.PROJECTS(PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES('5', 'Industrial Visit Planning & Booking System', '13', '3');

INSERT INTO APP.PROJECTS(PROJECT_ID, PROJECT_NAME, ESTIMATION, CUSTOMER_ID)
VALUES('2', 'Online Health Shopping Portal With Product Recommendation', '6', '4');

-- populate worklogs


INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'2/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'5/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'18/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'2/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'4/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'12/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '1', convert(date,'21/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'2/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'3/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'4/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'5/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'9/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'12/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'16/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'18/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'1/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'3/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'5/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('2', '1', convert(date,'12/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '1', convert(date,'1/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '1', convert(date,'3/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '1', convert(date,'12/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '1', convert(date,'13/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '1', convert(date,'14/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'1/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'3/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'4/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'5/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'9/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'1/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'3/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'4/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'5/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'9/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'12/08/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('4', '4', convert(date,'13/08/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '3', convert(date,'4/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '3', convert(date,'5/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '3', convert(date,'6/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('1', '3', convert(date,'7/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'5/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'6/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'7/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'8/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'9/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '3', convert(date,'10/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('6', '3', convert(date,'16/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('6', '3', convert(date,'17/07/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '5', convert(date,'15/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '5', convert(date,'16/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '5', convert(date,'17/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'6/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'7/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'8/04/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'19/05/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'20/05/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'21/05/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'23/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'24/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('5', '5', convert(date,'25/06/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'21/01/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'22/01/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'3/02/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'4/02/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'19/03/2017',103), '8');

INSERT INTO APP.WORKLOGS(FREELANCER_ID, PROJECT_ID, WORKDAY, HOURS)
VALUES('3', '2', convert(date,'20/03/2017',103), '8');

select *
from APP.worklogs;

-- SQL to construct Excel (samle_data.xlsx)

SELECT 
       PROJECTS.PROJECT_NAME , 
       PROJECTS.ESTIMATION , 
       CUSTOMERS.CUSTOMER_NAME , 
       CUSTOMERS.ADDRESS , 
       ZIPCODES.ZIPCODE , 
       ZIPCODES.STATE , 
       ZIPCODES.COUNTY , 
       ZIPCODES.CITY
FROM 
     APP.PROJECTS
     JOIN APP.CUSTOMERS ON PROJECTS.CUSTOMER_ID = CUSTOMERS.CUSTOMER_ID
     JOIN APP.ZIPCODES ON CUSTOMERS.ZIPCODE = ZIPCODES.ZIPCODE
ORDER BY 
         PROJECT_ID ASC;

SELECT 
       FREELANCERS.NAME , 
       FREELANCERS.PRICE , 
       FREELANCERS.ADDRESS , 
       FREELANCERS.ZIPCODE , 
       ZIPCODES.CITY , 
       ZIPCODES.STATE , 
       ZIPCODES.COUNTY , 
       WORKLOGS.WORKDAY , 
       WORKLOGS.HOURS , 
       PROJECTS.PROJECT_NAME
FROM 
     APP.FREELANCERS
     JOIN APP.WORKLOGS ON FREELANCERS.FREELANCER_ID = WORKLOGS.FREELANCER_ID
     JOIN APP.PROJECTS ON WORKLOGS.PROJECT_ID = PROJECTS.PROJECT_ID
     JOIN APP.ZIPCODES ON FREELANCERS.ZIPCODE = ZIPCODES.ZIPCODE;


