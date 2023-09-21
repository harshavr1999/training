REM -- PART 1

REM -- QUESTION 1
REM -- D

REM -- QUESTION 2
REM -- C

REM -- QUESTION 3
REM -- C,D,E

REM -- QUESTION 4
REM -- B

REM -- QUESTION 5
REM -- A

REM -- QUESTION 6
REM -- D

REM -- QUESTION 7
REM -- B

REM -- QUESTION 8
REM -- A

REM -- QUESTION 9
REM -- A,C,D

REM -- QUESTION 10
REM -- B,C

REM -- PART 2

REM -- QUESTION 1
DESC DEPARTMENTS;

SELECT * FROM DEPARTMENTS;
REM -- QUESTION 2
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;

REM -- QUESTION 3
SELECT EMPLOYEE_ID || ' ,'|| FIRST_NAME || ','||LAST_NAME || ',' ||EMAIL || ',' || PHONE_NUMBER || ',' ||JOB_ID || ','||MANAGER_ID || ','||
       HIRE_DATE || ','||SALARY|| ' ,'||COMMISSION_PCT || ' ,' || DEPARTMENT_ID
FROM EMPLOYEES;

REM -- QUESTION 4
SELECT LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY>12000;

REM -- QUESTION 5
SELECT LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY NOT BETWEEN 5000 AND 12000;

REM -- QUESTION 6
SELECT LAST_NAME,JOB_ID,HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME IN('Matos','Taylor')
ORDER BY HIRE_DATE;

REM -- QUESTION 7
SELECT LAST_NAME "Employee" ,SALARY "Monthly Salary"
FROM EMPLOYEES
WHERE SALARY BETWEEN 5000 AND 12000
AND DEPARTMENT_ID IN (20,50);

REM -- QUESTION 8
SELECT LAST_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY SALARY DESC,COMMISSION_PCT DESC;

REM -- QUESTION 9
SELECT EMPLOYEE_ID,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID= &GIVEN_ID
ORDER BY &COL_NAME;

REM -- QUESTION 10
SELECT EMPLOYEE_ID,LAST_NAME,SALARY,
ROUND(SALARY*1.155,0) "New Salary"
FROM EMPLOYEES;

REM -- QUESTION 11
SELECT RPAD(LAST_NAME, 8)||' '|| RPAD(' ', SALARY/1000+1,'*') AS "EMPLOYEES_AND_THEIR_SALARIES"
FROM EMPLOYEES
ORDER BY SALARY DESC;

REM -- QUESTION 12
SELECT JOB_ID,DECODE(JOB_ID, 'AD_PRES', 'A',
                              'ST_MAN', 'B',
                              'IT_PROG', 'C',
                              'SA_REP', 'D',
                              'ST_CLERK','E',
                              '0') GRADE
FROM EMPLOYEES;

SELECT JOB_ID, CASE JOB_ID
               WHEN 'AD_PRES' THEN 'A'
               WHEN 'ST_MAN' THEN 'B
               WHEN 'IT_PROG' THEN 'C
               WHEN 'SA_REP' THEN 'D
               WHEN 'ST_CLERK' THEN 'E'
               ELSE '0' 
               END GRADE
FROM EMPLOYEES;

REM -- QUESTION 13
SELECT E.LAST_NAME, E.JOB_ID, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E 
JOIN DEPARTMENTS D
ON (E.DEPARTMENT_ID = D.DEPARTMENT_ID)
JOIN LOCATIONS L
ON(D.LOCATION_ID=L.LOCATION_ID)
WHERE LOWER(L.CITY)='toronto';

REM -- QUESTION 14
SELECT W.LAST_NAME "EMPLOYEE", W.EMPLOYEE_ID "EMP#", M.LAST_NAME "MANAGER", M.EMPLOYEE_ID "Mgr#"
FROM EMPLOYEES W, EMPLOYEES M
WHERE W.MANAGER_ID = M.EMPLOYEE_ID;

REM -- QUESTION 15
SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM EMPLOYEES
                       WHERE LAST_NAME = '&&ENTER_NAME')
AND LAST_NAME <>'&ENTER_NAME';

REM -- QUESTION 16

SET SERVEROUTPUT ON

DECLARE 
v_max_dept_no NUMBER(8,2);
BEGIN
    SELECT MAX(DEPARTMENT_ID) INTO v_max_dept_no
    FROM DEPARTMENTS;
    DBMS_OUTPUT.PUT_LINE('The maximum department_id is : '||v_max_dept_no);
END;
/

REM -- QUESTION 17

CREATE TABLE MESSAGES (RESULTS NUMBER);

BEGIN
    FOR i IN 1..10 LOOP
        IF i IN (6,8) THEN
        CONTINUE;
        END IF;
        INSERT INTO MESSAGES(RESULTS)
        VALUES (i);
    END LOOP;
    COMMIT;
END;
/ 

SELECT *
FROM MESSAGES;

REM -- QUESTION 18
DECLARE
    TYPE t_rec IS RECORD 
    (v_countryid COUNTRIES.COUNTRY_ID%TYPE,
    v_rec1 COUNTRIES%ROWTYPE);
    v_country_record t_rec; 
BEGIN
    v_country_record.v_countryid := 'CA';
    SELECT * INTO v_country_record.v_rec1
    FROM COUNTRIES
    WHERE COUNTRY_ID = v_country_record.v_countryid;
    DBMS_OUTPUT.PUT_LINE('Country Id: ' || v_country_record.v_rec1.COUNTRY_ID ||
                         ' Country Name: ' || v_country_record.v_rec1.COUNTRY_NAME ||
                         ' Region: ' || v_country_record.v_rec1.REGION_ID);                       
END;
/

REM -- QUESTION 19
DECLARE
    v_deptno NUMBER := 50;
    CURSOR c_emp_cursor IS
    SELECT LAST_NAME, SALARY, MANAGER_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = v_deptno;
    
BEGIN
    FOR emp_record IN c_emp_cursor
    LOOP
        IF emp_record.SALARY < 5000 AND emp_record.MANAGER_ID IN (101,124) THEN
        DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME ||' Due for a raise');
        ELSE
        DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME ||' Not Due for a raise');
        END IF;
    END LOOP;
END;
/

REM -- QUESTION 20
DECLARE
    CURSOR c_dept_cursor IS
    SELECT DEPARTMENT_ID, DEPARTMENT_NAME
    FROM DEPARTMENTS
    WHERE DEPARTMENT_ID < 100
    ORDER BY DEPARTMENT_ID;
    
    CURSOR c_emp_cursor (deptno NUMBER) IS
    SELECT LAST_NAME, JOB_ID, HIRE_DATE, SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = deptno AND EMPLOYEE_ID < 120;
    
    v_deptId DEPARTMENTS.DEPARTMENT_ID%TYPE;
    v_deptName DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    
    v_lname EMPLOYEES.LAST_NAME%TYPE;
    v_jobId EMPLOYEES.JOB_ID%TYPE;
    v_hireDate EMPLOYEES.HIRE_DATE%TYPE;
    v_sal EMPLOYEES.SALARY%TYPE;

BEGIN
    OPEN c_dept_cursor;
    LOOP
        FETCH c_dept_cursor INTO v_deptId, v_deptName;
        EXIT WHEN c_dept_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Department Number : ' || v_deptId || ' Department Name : ' || v_deptName );
        IF c_emp_cursor%ISOPEN THEN 
            CLOSE c_emp_cursor;
        END IF;
        OPEN c_emp_cursor(v_deptId);
        LOOP
            FETCH c_emp_cursor INTO v_lname, v_jobId, v_hireDate, v_sal;
            EXIT WHEN c_emp_cursor%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE(v_lname ||'  '|| v_jobId||'  '|| 
                                v_hireDate||'  ' || v_sal );
        END LOOP;
        CLOSE c_emp_cursor;
    END LOOP;
    CLOSE c_dept_cursor;
END;
/
