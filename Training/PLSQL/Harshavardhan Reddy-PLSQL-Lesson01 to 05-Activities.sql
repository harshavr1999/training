
REM -- LESSON 2

REM -- QUERY 1
REM -- ANS -> d

REM -- QUERY 2

SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello World');
END;
/

REM -- LESSON 3

REM - QUERY 1

REM -- VALID IDENTIFIERS: last_name, Isleap$year, NUMBER#, number1to7

REM -- INVALID IDENTIFIERS:
REM -- today, today's_date, Number_of_days_in_February_this_year, #number

REM -- QUERY 2

REM -- VALID VARIABLE DECLARATION AND INITIALIZATION:
REM -- a, d

REM -- INVALID VARIABLE DECLARATION AND INITIALIZATION:
REM -- b, c

REM -- QUERY 3
REM -- ANS -> a

REM -- QUERY 4

DECLARE
    v_today DATE := SYSDATE;
    v_tomorrow v_today%TYPE;
BEGIN
    v_tomorrow := v_today + 1;
    DBMS_OUTPUT.PUT_LINE('Hello World');
    DBMS_OUTPUT.PUT_LINE('Today : ' || v_today);
    DBMS_OUTPUT.PUT_LINE('Tomorrow : ' || v_tomorrow);
END;
/

REM -- QUERY 5

VARIABLE b_basic_percent NUMBER
VARIABLE b_pf_percent NUMBER

DECLARE
    v_today DATE := SYSDATE;
    v_tomorrow v_today%TYPE;
BEGIN
    v_tomorrow := v_today + 1;
    DBMS_OUTPUT.PUT_LINE('Hello World');
    DBMS_OUTPUT.PUT_LINE('TODAY IS : ' || v_today);
    DBMS_OUTPUT.PUT_LINE('TOMORROW IS : ' || v_tomorrow);
    
    :b_basic_percent := 45;
    :b_pf_percent := 12;
    
    DBMS_OUTPUT.PUT_LINE('b_basic_percent');
    DBMS_OUTPUT.PUT_LINE('--');
    DBMS_OUTPUT.PUT_LINE(:b_basic_percent);
    DBMS_OUTPUT.PUT_LINE('b_pf_percent');
    DBMS_OUTPUT.PUT_LINE('--');
    DBMS_OUTPUT.PUT_LINE(:b_pf_percent);
END;
/

PRINT b_basic_percent;
PRINT b_pf_percent;

REM -- LESSON 4

DROP SEQUENCE my_seq;

REM -- QUERY 1
REM -- a. The value of v_weight at position 1 is: 2
REM -- b. The value of v_new_lovn at position 1 is: Western Europe
REM -- c. The value of v_weight at position 2 is: 601
REM -- d. The value of v_message at position 2 is: Product 10012 is in stock
REM -- e. The value of v_new_locn at position 2 is: ERROR as identifier 'V_NEW_LOCN' must be declared

REM -- QUERY 2
REM -- a. The value of v_customer in the nested block is: 201
REM -- b. The value of v_name in the nested block is: Unisports
REM -- c. The value of v_credit_rating in the nested block is: GOOD
REM -- d. The value of v_customer in the main block is: Womansport
REM -- e. The value of v_name in the main block is: ERROR as identifier 'V_NAME' must be declared
REM -- f. The value of v_credit_rating in the main block is: EXCELLENT 

REM -- QUERY 3
SET SERVEROUTPUT ON;
VARIABLE b_basic_percent NUMBER -- CREATES BIND VARIABLE b_basic_percent
VARIABLE b_pf_percent NUMBER -- CREATES BIND VARIABLE b_pf_percent

DECLARE
    v_today DATE := SYSDATE;
    v_tomorrow v_today%TYPE;
    
    v_basic_percent NUMBER := 45;
    v_pf_percent NUMBER := 12;
    
    v_fname VARCHAR2(15);
    v_emp_sal NUMBER(10);
BEGIN
    SELECT FIRST_NAME, SALARY INTO v_fname, v_emp_sal
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 110;

    v_tomorrow := v_today + 1;
    
    DBMS_OUTPUT.PUT_LINE('Hello' || v_fname);
    
--    DBMS_OUTPUT.PUT_LINE('TODAY IS : ' || v_today);
--    DBMS_OUTPUT.PUT_LINE('TOMORROW IS : ' || v_tomorrow);
    
    /*:b_basic_percent := 45;
    :b_pf_percent := 12;*/
    
--    DBMS_OUTPUT.PUT_LINE('b_basic_percent');
--    DBMS_OUTPUT.PUT_LINE('--');
--    DBMS_OUTPUT.PUT_LINE(b_basic_percent);
--    DBMS_OUTPUT.PUT_LINE('b_pf_percent');
--    DBMS_OUTPUT.PUT_LINE('--');
--    DBMS_OUTPUT.PUT_LINE(b_pf_percent);

    
    
    DBMS_OUTPUT.PUT_LINE('YOUR SALARY IS : ' || v_emp_sal);
    DBMS_OUTPUT.PUT_LINE('YOUR CONTRIBUTION TOWARDS PF: ');
    DBMS_OUTPUT.PUT_LINE(0.12*(0.45*v_emp_sal));
END;
/

REM -- LESSON 5

DROP TABLE employees2;
DROP TABLE copy_emp;

REM -- QUERY 1
DECLARE
    v_max_deptno NUMBER;
BEGIN
    SELECT MAX(DEPARTMENT_ID) INTO v_max_deptno
    FROM DEPARTMENTS;
    
    DBMS_OUTPUT.PUT_LINE('The maximum department_id is : ' || v_max_deptno);
END;
/

REM -- QUERY 2
DECLARE
    v_max_deptno NUMBER;
    v_dept_name DEPARTMENTS.DEPARTMENT_NAME%TYPE := 'Education';
    v_dept_id NUMBER;
BEGIN
    SELECT MAX(DEPARTMENT_ID) INTO v_max_deptno
    FROM DEPARTMENTS;
    
    DBMS_OUTPUT.PUT_LINE('The maximum department_id is : ' || v_max_deptno);
    
    v_dept_id := v_max_deptno + 10;
    
    INSERT INTO DEPARTMENTS (DEPARTMENT_NAME, DEPARTMENT_ID, LOCATION_ID)
    VALUES (v_dept_name, v_dept_id, NULL);
    
    DBMS_OUTPUT.PUT_LINE('SQL%ROWCOUNT gives ' || SQL%ROWCOUNT);
END;
/

SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID = 280;

REM -- QUERY 3
BEGIN
    UPDATE DEPARTMENTS
    SET LOCATION_ID = 3000
    WHERE DEPARTMENT_ID = 330;
END;
/

SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID = 280;

DELETE FROM DEPARTMENTS
WHERE DEPARTMENT_ID = 280;


REM--LESSON 06
REM -- QYERY 1
CREATE TABLE MESSAGES (RESULTS NUMBER);
   
BEGIN
    FOR i IN 1..10 LOOP
        IF i=6 OR i=8 THEN CONTINUE;
        END IF;
        INSERT INTO MESSAGES(RESULTS)
        VALUES(i);
    END LOOP;
    COMMIT;
END;
/

SELECT * 
FROM MESSAGES;

REM -- QYERY 2
CREATE TABLE EMP2 AS (SELECT EMPLOYEE_ID, SALARY
                  FROM EMPLOYEES);

ALTER TABLE EMP2
ADD STARS VARCHAR2(50);

DECLARE
    v_empno EMP2.EMPLOYEE_ID%TYPE :=176;
    v_asterisk EMP2.STARS%TYPE := NULL;
    v_salary EMP2.SALARY%TYPE
BEGIN
    SELECT EMP2.SALARY INTO v_salary
    FROM EMP2 
    WHERE EMP.EMPLOYEE_ID = v_empno;
    FOR COUNTER IN 1..TRUNC(v_salary /1000)
    LOOP
        v_asterisk := v_asterisk || '*';
    END LOOP;
    UPDATE EMP2
    SET STARS = v_asterisk
    WHERE EMPLOYEE_ID =v_empno;
    COMMIT;
END;
/

SELECT EMPLOYEE_ID, SALARY, STARS
FROM EMP2
WHERE EMPLOYEE_ID=176;
