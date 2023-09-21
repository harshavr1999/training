REM -- QUERY 1
SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID =
                      ( SELECT DEPARTMENT_ID
                        FROM EMPLOYEES
                        WHERE LAST_NAME='&GIVEN_NAME');

REM -- QUERY 2
SELECT EMPLOYEE_ID, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > 
                ( SELECT AVG(SALARY)
                  FROM EMPLOYEES)
ORDER BY SALARY;

REM -- QUERY 3
SELECT EMPLOYEE_ID, LAST_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID = ANY
                          (SELECT DEPARTMENT_ID
                           FROM EMPLOYEES
                           WHERE LAST_NAME LIKE '%u%');

REM -- QUERY 4
SELECT LAST_NAME, DEPARTMENT_ID, JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = ANY
                         (SELECT DEPARTMENT_ID
                          FROM DEPARTMENTS
                          WHERE LOCATION_ID=&GIVEN_LOCATION);

REM -- QUERY 5
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE MANAGER_ID = ANY
                    (SELECT EMPLOYEE_ID
                     FROM EMPLOYEES
                     WHERE LAST_NAME='King');
                     
REM -- QUERY 6
SELECT DEPARTMENT_ID, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID =
                      (SELECT DEPARTMENT_ID
                       FROM DEPARTMENTS
                       WHERE DEPARTMENT_NAME='Executive');

REM -- QUERY 7
SELECT EMPLOYEE_ID, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >
                (SELECT AVG(SALARY)
                 FROM EMPLOYEES)
AND DEPARTMENT_ID = ANY
                        (SELECT DEPARTMENT_ID
                         FROM EMPLOYEES
                         WHERE LAST_NAME LIKE'%u%');
