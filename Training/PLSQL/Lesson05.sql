REM -- USING SQL STATEMENTS WITHIN PLSQL
DECLARE
    v_fname VARCHAR2(30);
BEGIN
    SELECT FIRST_NAME INTO v_fname
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID =100;
    DBMS_OUTPUT.PUT_LINE('First Name is : '|| v_fname);
END;
/


DECLARE
    v_emp_hiredate employees.hire_date%TYPE;
    v_emp_salary employees.salary%TYPE;
BEGIN
    SELECT HIRE_DATE, SALARY INTO v_emp_hiredate, v_emp_salary
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID = 100;
    DBMS_OUTPUT.PUT_LINE ('Hire date is :'|| v_emp_hiredate);
    DBMS_OUTPUT.PUT_LINE ('Salary is :'|| v_emp_salary);
END;
/

REM -- PREDEFINED CURSORS
DECLARE

  v_rows_deleted VARCHAR2(30);

  v_empno employees.employee_id%TYPE := 165;

BEGIN

  DELETE FROM  employees

  WHERE employee_id = v_empno;

  v_rows_deleted := (SQL%ROWCOUNT ||

                       ' row deleted.');

  DBMS_OUTPUT.PUT_LINE (v_rows_deleted);

 

END;
REM -- ROLLBACK


