REM -- QUERY 1
DECLARE
    TYPE t_rec IS RECORD
        (v_countryid COUNTRIES.COUNTRY_ID%TYPE:='CA',
         v_country_record COUNTRIES%ROWTYPE);
    v_myRec t_rec;
BEGIN
    SELECT * INTO v_myRec.v_country_record
    FROM COUNTRIES C
    WHERE C.COUNTRY_ID= v_myRec.v_countryid;
    DBMS_OUTPUT.PUT_LINE('Country Id: '|| v_myRec.v_countryid || ' Country Name: '||v_myRec.v_country_record.country_name||' Region: '||v_myRec.v_country_record.REGION_ID);
END;
/
REM -- QUERY 1.e
DECLARE
    TYPE t_rec IS RECORD
        (v_countryid COUNTRIES.COUNTRY_ID%TYPE:=UPPER('&COUNTRY_ID'),
         v_country_record COUNTRIES%ROWTYPE);
    v_myRec t_rec;
BEGIN
    SELECT * INTO v_myRec.v_country_record
    FROM COUNTRIES C
    WHERE C.COUNTRY_ID= v_myRec.v_countryid;
    DBMS_OUTPUT.PUT_LINE('Country Id: '|| v_myRec.v_countryid || ' Country Name: '||v_myRec.v_country_record.country_name||' Region: '||v_myRec.v_country_record.REGION_ID);
END;
/

REM -- QUERY 2
DECLARE
    TYPE dept_table_type IS TABLE OF 
    departments.DEPARTMENT_NAME%TYPE 
    INDEX BY PLS_INTEGER;
    my_dept_table dept_table_type;
    f_loop_count NUMBER(3) :=10;
    v_deptno NUMBER(3):=0;
BEGIN
    WHILE f_loop_count<=100 LOOP
        SELECT DEPARTMENT_NAME INTO my_dept_table(f_loop_count)
        FROM departments
        WHERE department_id = f_loop_count;
        v_deptno:=v_deptno+10;
        f_loop_count:= v_deptno;
        END LOOP;
        FOR i IN 10..f_loop_count
        LOOP
            DBMS_OUTPUT.PUT_LINE(my_dept_table(i));
        END LOOP;
END;
/

REM -- QUERY 3
DECLARE
    TYPE dept_table_type IS TABLE OF
    departments%ROWTYPE
    INDEX BY PLS_INTEGER;
    my_dept_table dept_table_type;
    f_loop_count number :=10;
    v_deptno number := 0;
BEGIN
    FOR i IN 1..f_loop_count LOOP
    v_deptno:= v_deptno + f_loop_count;
    SELECT * INTO my_dept_table(i)
    FROM departments
    WHERE department_id = v_deptno;
    END LOOP;
    FOR i IN 1..f_loop_count 
    LOOP
    DBMS_OUTPUT.PUT_LINE('Department Number: '||my_dept_table(i).department_id || ' '||'Department Name: '||my_dept_table(i).department_name || ' '||
                         'Manager Id: '||my_dept_table(i).MANAGER_ID || ' '||'Location Id: '||my_dept_table(i).location_id);
    END LOOP;
END;
/
