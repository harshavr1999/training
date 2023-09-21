REM -- EXPLICIT CURSORS
DECLARE
    CURSOR c_emp_cursor IS
    SELECT EMPLOYEE_ID, LAST_NAME
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=30;
    
    v_empNo EMPLOYEES.EMPLOYEE_ID%TYPE;
    v_lname EMPLOYEES.LAST_NAME%TYPE;
BEGIN
    OPEN c_emp_cursor;
    FETCH c_emp_cursor INTO v_empNo, v_lname;
    DBMS_OUTPUT.PUT_LINE(v_empNo || ' '|| v_lname);
END;
/

DECLARE
    CURSOR c_emp_cursor IS
    SELECT EMPLOYEE_ID, LAST_NAME
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=30;
    
    v_empNo EMPLOYEES.EMPLOYEE_ID%TYPE;
    v_lname EMPLOYEES.LAST_NAME%TYPE;
BEGIN
    OPEN c_emp_cursor;
    LOOP
        FETCH c_emp_cursor INTO v_empNo, v_lname;
        EXIT WHEN c_emp_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(v_empNo || ' '|| v_lname);
    END LOOP;
    CLOSE c_emp_cursor;
END;
/

REM -- EXPLICIT CURSORS WITH RECORDS
DECLARE
    CURSOR c_emp_cursor IS
    SELECT EMPLOYEE_ID, LAST_NAME
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=30;
    
    v_emp_record c_emp_cursor%ROWTYPE;
BEGIN
    OPEN c_emp_cursor;
    LOOP
        FETCH c_emp_cursor INTO v_emp_record;
        EXIT WHEN c_emp_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(v_emp_record.EMPLOYEE_ID || ' '|| v_emp_record.LAST_NAME);
    END LOOP;
    CLOSE c_emp_cursor;
END;
/

REM -- EXPLICIT CURSORS WITH FOR LOOP
DECLARE
    CURSOR c_emp_cursor IS
    SELECT EMPLOYEE_ID, LAST_NAME
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=30;
BEGIN
    FOR emp_record IN c_emp_cursor
    LOOP
        DBMS_OUTPUT.PUT_LINE(emp_record.EMPLOYEE_ID || ' '|| emp_record.LAST_NAME);
    END LOOP;
END;
/

