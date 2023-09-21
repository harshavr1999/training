REM -- WORKING WITH COMPOSITE DATA TYPES
SET SERVEROUTPUT ON;
DECLARE
    TYPE t_rec IS RECORD -- Declaration of Record
        (v_sal NUMBER(8), --Declaration of fields in the record
         v_minsal NUMBER(8) DEFAULT 1000,
         v_hire_date EMPLOYEES.HIRE_DATE%TYPE,
         v_rec1 EMPLOYEES%ROWTYPE);
    v_myRec t_rec; -- Declaration of Identifier with the type created
BEGIN
    v_myRec.v_sal := v_myRec.v_minsal + 500;
    v_myRec.v_hire_date := SYSDATE;
    
    SELECT * INTO v_myrec.v_rec1
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID=100;
    
    DBMS_OUTPUT.PUT_LINE(v_myRec.v_rec1.LAST_NAME || ' '|| TO_CHAR(v_myRec.v_hire_date||' '|| TO_CHAR(v_myRec.v_sal)));
END;
/

REM -- ASSOCIATIVE ARRAYS
DECLARE
    TYPE ename_table_type IS TABLE OF
    EMPLOYEES.LAST_NAME%TYPE
    INDEX BY PLS_INTEGER;
    
    TYPE hiredate_table_type IS TABLE OF DATE
    INDEX BY PLS_INTEGER;
    
    ename_table ename_table_type;
    hiredate_table hiredate_table_type;
    
BEGIN
    ename_table(1) := 'Harsha';
    ename_table(2) := 'Korrapati';
    hiredate_table(8) := SYSDATE + 7;
    DBMS_OUTPUT.PUT_LINE(ename_table(2));
    DBMS_OUTPUT.PUT_LINE(hiredate_table(8));
END;
/

DECLARE
    TYPE dept_table_type IS TABLE OF 
    departments%ROWTYPE 
    INDEX BY VARCHAR2(20);
    dept_table dept_table_type;
  -- Each element of dept_table is a record

BEGIN
    SELECT * INTO dept_table('a')
    FROM departments
    WHERE department_id = 10;
    DBMS_OUTPUT.PUT_LINE(dept_table('a').department_id ||' '
                        ||dept_table('a').department_name ||' '
                        ||dept_table('a').manager_id);
END;
/

REM -- INDEX BY TABLE OF RECORDS
DECLARE
    TYPE emp_table_type IS TABLE OF
    EMPLOYEES%ROWTYPE 
    INDEX BY PLS_INTEGER;
    my_emp_table emp_table_type;
    max_count NUMBER(3):= 104;
BEGIN
    FOR i IN 100..max_count
    LOOP
        SELECT * INTO my_emp_table(i)
        FROM employees
        WHERE employee_id = i;
    END LOOP;
    
    FOR i IN my_emp_table.FIRST..my_emp_table.LAST
    LOOP
        DBMS_OUTPUT.PUT_LINE(my_emp_table(i).last_name);
    END LOOP;
END;
/