REM -- QUERY 1
DECLARE
    v_deptno NUMBER:=&DEPT_NO;
    CURSOR c_emp_cursor IS
    SELECT LAST_NAME, SALARY, MANAGER_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = v_deptno;
BEGIN
    FOR emp_record IN c_emp_cursor
    LOOP
        IF (emp_record.SALARY < 5000 AND emp_record.MANAGER_ID IN (101,124)) 
        THEN
            DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME || ' Due for a raise');
        ELSE
            DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME || ' Not Due for a raise');
        END IF;
    END LOOP;
END;
/

REM -- QUERY 2
DECLARE
    CURSOR c_dept_cursor IS
    SELECT DEPARTMENT_ID, DEPARTMENT_NAME
    FROM DEPARTMENTS
    WHERE DEPARTMENT_ID<100
    ORDER BY DEPARTMENT_ID;
    
    CURSOR c_emp_cursor(dept_no NUMBER) IS
    SELECT LAST_NAME, JOB_ID, HIRE_DATE, SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=dept_no AND EMPLOYEE_ID<120;
    
    v_deptNo DEPARTMENTS.DEPARTMENT_ID%TYPE;
    v_dept_name DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    v_lname EMPLOYEES.LAST_NAME%TYPE;
    v_job_id EMPLOYEES.JOB_ID%TYPE;
    v_hire_date EMPLOYEES.HIRE_DATE%TYPE;
    v_salary EMPLOYEES.SALARY%TYPE;
BEGIN
    OPEN c_dept_cursor;
    LOOP
        FETCH c_dept_cursor INTO v_deptNo, v_dept_name;
        EXIT WHEN c_dept_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Department Number: '|| v_deptNo ||' Department Name: '|| v_dept_name);
        IF NOT c_emp_cursor%ISOPEN THEN
            OPEN c_emp_cursor(v_deptNo);
        END IF;
        LOOP
            FETCH c_emp_cursor INTO v_lname, v_job_id, v_hire_date, v_salary;
            EXIT WHEN c_emp_cursor%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE(v_lname || ' '|| v_job_id || ' ' || v_hire_date || ' ' ||v_salary);
        END LOOP;
        CLOSE c_emp_cursor;
    END LOOP;
    CLOSE c_dept_cursor;
END;
/

REM -- PRACTICE 8.2
REM -- QUERY 1
CREATE TABLE TOP_SALARIES(SALARY NUMBER);

DECLARE
    v_num NUMBER:=&n;
    sal EMPLOYEES.SALARY%TYPE;
    CURSOR c_emp_cursor IS
    SELECT * FROM (SELECT DISTINCT SALARY FROM EMPLOYEES ORDER BY SALARY DESC) WHERE ROWNUM<=v_num;
BEGIN
    OPEN c_emp_cursor;
    LOOP
        FETCH c_emp_cursor INTO sal;
        EXIT WHEN c_emp_cursor%ROWCOUNT = v_num OR NOT c_emp_cursor%FOUND;
        INSERT INTO TOP_SALARIES(SALARY)
        VALUES (sal);
    END LOOP;
    CLOSE c_emp_cursor;       
END;
/

SELECT *
FROM TOP_SALARIES;

DELETE FROM TOP_SALARIES;
