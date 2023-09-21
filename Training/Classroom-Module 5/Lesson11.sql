REM -- OTHER SCHEMA OBJECTS
CREATE VIEW EMPVU80
    AS SELECT EMPLOYEE_ID, LAST_NAME, SALARY
       FROM EMPLOYEES
       WHERE DEPARTMENT_ID = 80;

DESC EMPVU80;

REM -- IF WE CHANGE DATA IN VIEW IT WILL ALSO GET UPDATED IN BASE TABLE AND VISE VERSA

REM -- CREATING VIEW BY USING COLUMN ALIAS
CREATE VIEW SALVU50
    AS SELECT EMPLOYEE_ID "ID_NUMBER", LAST_NAME "NAME", SALARY*12 "ANNUAL_SALARY"
       FROM EMPLOYEES
       WHERE DEPARTMENT_ID = 50;

DESC SALVU50;

REM -- SELECTING DATA FROM VIEW
SELECT *
FROM SALVU50;

REM -- MODIFING THE VIEW
CREATE OR REPLACE VIEW EMPVU80
    (ID_NUMBER, NAME, SAL, DEPARTMENT_ID) AS
    SELECT EMPLOYEE_ID, FIRST_NAME ||' '|| LAST_NAME, SALARY, DEPARTMENT_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=80;

DESC EMPVU80;

REM -- COMPLEX VIEWS
CREATE OR REPLACE VIEW DEPT_SUM_VU
    (NAME, MINSAL, MAXSAL, AVGSAL)
AS SELECT D.DEPARTMENT_NAME, MIN(E.SALARY), MAX(E.SALARY), AVG(E.SALARY)
   FROM EMPLOYEES E JOIN DEPARTMENTS D
   ON (E.DEPARTMENT_ID = D.DEPARTMENT_ID)
   GROUP BY D.DEPARTMENT_NAME;

DESC DEPT_SUM_VU;

REM -- CHECK CONSTARINT OPTION ON VIEW
CREATE OR REPLACE VIEW EMPVU20
AS SELECT *
   FROM EMPLOYEES
   WHERE DEPARTMENT_ID = 20
   WITH CHECK OPTION CONSTRAINT EMPVU20_CK;
REM -- IT WILL NOT ALLOW TO CHANGE DEPARTMENT_ID

REM -- READ ONLY OPTION
CREATE OR REPLACE VIEW EMPVU10
    (EMPLOYEE_NUMBER, EMPLOYEE_NAME, JOB_TITLE)
AS SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID
   FROM EMPLOYEES
   WHERE DEPARTMENT_ID=10
   WITH READ ONLY;
   
REM -- SEQUENCES
CREATE SEQUENCE DEPT_DEPTID_SEQ
                INCREMENT BY 10
                START WITH 320
                MAXVALUE 9999
                NOCACHE
                NOCYCLE;

INSERT INTO DEPARTMENTS(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
            VALUES (DEPT_DEPTID_SEQ.NEXTVAL, 'Support', 1700);

SELECT DEPT_DEPTID_SEQ.CURRVAL 
FROM DUAL;