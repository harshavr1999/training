REM -- QUERY 1
SELECT SYSDATE AS "Date"
FROM DUAL;

REM -- QUERY 2
SELECT EMPLOYEE_ID, LAST_NAME, SALARY,ROUND(SALARY+(SALARY*0.155)) AS "NewSalary"
FROM EMPLOYEES;

REM -- QUERY 4
SELECT EMPLOYEE_ID, LAST_NAME, SALARY,ROUND(SALARY+(SALARY*0.155)) AS "NewSalary", (ROUND(SALARY+(SALARY*0.155))-SALARY) AS "Increase" 
FROM EMPLOYEES;

REM -- QUERY 5
SELECT INITCAP(LAST_NAME) "Name", LENGTH(LAST_NAME) "Length"
FROM EMPLOYEES
WHERE UPPER(SUBSTR(LAST_NAME,1,1)) IN ('J','K','M');

SELECT INITCAP(LAST_NAME) "Name", LENGTH(LAST_NAME) "Length"
FROM EMPLOYEES
WHERE UPPER(SUBSTR(LAST_NAME,1,1)) = UPPER('&GIVEN_LETTER');

REM -- QUERY 6
SELECT LAST_NAME, ROUND(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)) "MONTHS_WORKED"
FROM EMPLOYEES
ORDER BY MONTHS_WORKED;

