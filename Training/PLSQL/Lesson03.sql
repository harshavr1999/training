REM -- DECLARING PLSQL VARIABLES
DECLARE
    v_myName VARCHAR2(30);
BEGIN
    DBMS_OUTPUT.PUT_LINE('My Name is : '|| v_myName);
    v_myName := 'Harsha';
    DBMS_OUTPUT.PUT_LINE('My Name is : '|| v_myName);
END;
/

REM -- DECLARING PLSQL VARIABLES AND INITIALIZING
DECLARE
    v_myName VARCHAR2(30) := 'Chinna';
BEGIN
    DBMS_OUTPUT.PUT_LINE('My Name is : '|| v_myName);
    v_myName := 'Harsha';
    DBMS_OUTPUT.PUT_LINE('My Name is : '|| v_myName);
END;
/

REM -- USAGE WITH CONSTANT TYPE MODIFICATION
DECLARE
    c_sal CONSTANT NUMBER(8,2) := 3000;
BEGIN
    DBMS_OUTPUT.PUT_LINE('My Salary is : '|| c_sal);
END;
/

REM -- DELIMITERS
SET SERVEROUTPUT ON;
DECLARE
    v_event VARCHAR2(30);
BEGIN
    v_event := q'$Father's day$';
    DBMS_OUTPUT.PUT_LINE('3rd Sunday in June is '|| v_event);
    v_event := q'!Mother's day!';
    DBMS_OUTPUT.PUT_LINE('3rd Sunday in May is '|| v_event);
END;
/

REM -- BIND VARIABLES
VARIABLE b_result NUMBER;
BEGIN
    SELECT (SALARY*12) + NVL(COMMISSION_PCT,0) INTO :b_result
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 144;
END;
/
PRINT b_result;

