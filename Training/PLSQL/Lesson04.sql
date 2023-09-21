REM -- WRITING EXCECUTABLE STATEMENTS

CREATE SEQUENCE my_seq
INCREMENT BY 1
START WITH 1
NOMAXVALUE;

DECLARE
    v_new_id NUMBER;
BEGIN
    v_new_id := my_Seq.NEXTVAL;
    DBMS_OUTPUT.PUT_LINE(v_new_id);
    DBMS_OUTPUT.PUT_LINE(my_seq.NEXTVAL);
END;
/

REM -- NESTED BLOCKS
DECLARE
    v_outer_variable VARCHAR2(20) := 'GLOBAL VARIABLE';
BEGIN
    DECLARE
        v_inner_variable VARCHAR2(20) := 'INNER VARIABLE';
    BEGIN
        DBMS_OUTPUT.PUT_LINE(v_outer_variable);
        DBMS_OUTPUT.PUT_LINE(v_inner_variable);
    END;
    DBMS_OUTPUT.PUT_LINE(v_outer_variable);
END;
/

REM --CODE FOR VARIABLE SCOPE AND VISIBILITY
DECLARE
    v_father_name VARCHAR2(20):='Patrick';
    v_date_of_birth DATE:='20-Apr-1972';
BEGIN
    DECLARE
        v_child_name VARCHAR2(20):='Mike';
        v_date_of_birth DATE:='12-Dec-2002';
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Father''s Name: '||v_father_name);
        DBMS_OUTPUT.PUT_LINE('Date of Birth: '||v_date_of_birth);
        DBMS_OUTPUT.PUT_LINE('Child''s Name: '||v_child_name);
    END;
    DBMS_OUTPUT.PUT_LINE('Date of Birth: '||v_date_of_birth);
END;
/


BEGIN <<outer>>
DECLARE
    v_sal NUMBER(7,2) := 60000;
    v_comm NUMBER(7,2) := v_sal * 0.20;
    v_message VARCHAR(255) := 
BEGIN

END;
/