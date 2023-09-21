REM -- 9.1
CREATE TABLE MESSAGES AS (SELECT LAST_NAME, SALARY
                  FROM EMPLOYEES);
SET SERVEROUTPUT ON;
DECLARE
    v_ename EMPLOYEES.LAST_NAME%TYPE;
    v_emp_sal EMPLOYEES.SALARY%TYPE:=&SALARY;
BEGIN
    SELECT LAST_NAME INTO v_ename
    FROM EMPLOYEES
    WHERE SALARY = v_emp_sal;
    INSERT INTO MESSAGES(LAST_NAME, SALARY)
    VALUES (v_ename, v_emp_sal);
EXCEPTION
    WHEN TOO_MANY_ROWS THEN
        DBMS_OUTPUT.PUT_LINE('More than one employee with a salary of '|| v_emp_sal);
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No employee with a salary of ' || v_emp_sal);
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Some other error occured');
END;
/

REM -- 9.2
DECLARE
 e_childrecord_exits EXCEPTION;
 PRAGMA EXCEPTION_INIT(e_childrecord_exits, -02292);
BEGIN
    DBMS_OUTPUT.PUT_LINE('Deleting department 40..........');
    DELETE FROM DEPARTMENTS
    WHERE DEPARTMENT_ID=40;
EXCEPTION
    WHEN e_childrecord_exits THEN
    DBMS_OUTPUT.PUT_LINE('Cannot delete this department. There are employees in this department(child records exist.)');
END;
/
