REM -- QUERY 1
REM -- TRUE

REM -- QUERY 2
REM -- TRUE

REM -- QUERY 3
REM -- , AFTER LAST_NAME
REM -- * SYMBOL AFTER SAL
REM -- "ANNUAL SALARY"

SELECT EMPLOYEE_ID, LAST_NAME,SALARY*12 "ANNUAL SALARY"
FROM EMPLOYEES;

REM -- QUERY 6
DESCRIBE DEPAARTMENTS;

SELECT DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID
FROM DEPARTMENTS;

REM -- QUERY 7
DESCRIBE EMPLOYEES;

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE AS "STARTDATE"
FROM EMPLOYEES;

REM -- QUERY 9
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

REM -- QUERY 10
SELECT EMPLOYEE_ID AS "Emp#", LAST_NAME AS "Employee", JOB_ID AS "Job", HIRE_DATE AS "Hire Date"
FROM EMPLOYEES;

REM -- QUERY 11
SELECT LAST_NAME || ', ' || JOB_ID AS "Employee and Title"
FROM EMPLOYEES;

REM -- QUERY 12
SELECT EMPLOYEE_ID || ',' || FIRST_NAME || ',' || LAST_NAME || ',' || EMAIL ||  ',' || PHONE_NUMBER || ',' || HIRE_DATE || ',' || JOB_ID || ',' || SALARY || ',' || COMMISSION_PCT || ',' || MANAGER_ID || ',' || DEPARTMENT_ID
FROM EMPLOYEES;