REM --EXCEPTION HANDLING
DECLARE
    v_lname VARCHAR2(30);
BEGIN
    SELECT LAST_NAME INTO v_lname
    FROM EMPLOYEES
    WHERE FIRST_NAME = 'John';
    DBMS_OUTPUT.PUT_LINE('John''s Last Name is '||v_lname);
EXCEPTION
    WHEN TOO_MANY_ROWS THEN
        DBMS_OUTPUT.PUT_LINE('Select statement retrieved more rows, use cursor');
END;
/

DECLARE
 e_insert_excep EXCEPTION;
 PRAGMA EXCEPTION_INIT(e_insert_excep, -01400);
BEGIN
 INSERT INTO departments (department_id, department_name) VALUES (280, NULL);
EXCEPTION
 WHEN e_insert_excep THEN
   DBMS_OUTPUT.PUT_LINE('INSERT OPERATION FAILED');
   DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

REM -- USER DEFIEND EXCEPTION
DECLARE 
  v_deptno NUMBER := 500;
  v_name VARCHAR2(20) := 'Testing';
  e_invalid_department EXCEPTION;
BEGIN
  UPDATE departments
  SET department_name = v_name
  WHERE department_id = v_deptno;
  IF SQL%NOTFOUND THEN
    RAISE e_invalid_department;
  END IF;
  COMMIT;
EXCEPTION
WHEN e_invalid_department THEN
  DBMS_OUTPUT.PUT_LINE('No such department id.');
END;
/
