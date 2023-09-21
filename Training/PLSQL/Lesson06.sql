REM -- WRITING CONTROL STATEMENTS
SET SERVEROUTPUT ON;

REM -- Simple IF
DECLARE
    v_myAge NUMBER:= 3;
BEGIN
    IF v_myAge < 11
    THEN 
        DBMS_OUTPUT.PUT_LINE('I am a kid');
    END IF;
END;
/

REM -- IF THEN ELSE
DECLARE
    v_myAge NUMBER:= 32;
BEGIN
    IF v_myAge < 11
    THEN 
        DBMS_OUTPUT.PUT_LINE('I am a kid');
    ELSE
        DBMS_OUTPUT.PUT_LINE('I am not a kid');
    END IF;
END;
/

REM -- IF THEN ELSIF
DECLARE
    v_myAge NUMBER:= 32;
BEGIN
    IF v_myAge < 11 THEN 
        DBMS_OUTPUT.PUT_LINE('I am a kid');
    ELSIF v_myAge < 20 THEN
        DBMS_OUTPUT.PUT_LINE('I am young');
    ELSIF v_myAge < 30 THEN
        DBMS_OUTPUT.PUT_LINE('I am in my twenties');
    ELSIF v_myAge < 40 THEN
        DBMS_OUTPUT.PUT_LINE('I am in my thirties');
    ELSE
        DBMS_OUTPUT.PUT_LINE('I am always young');
    END IF;
END;
/

REM -- USING AND
DECLARE
    v_myAge NUMBER:= 3;
BEGIN
    IF (v_myAge > 1 AND v_myAge <10)
    THEN 
        DBMS_OUTPUT.PUT_LINE('I am a kid');
    END IF;
END;
/

REM -- USING CASE EXPRESSION
DECLARE
    v_grade CHAR(1) := UPPER('&grade');
    v_appraisal VARCHAR2(20);
BEGIN
    v_appraisal := CASE v_grade
        WHEN 'A' THEN 'EXCELLENT'
        WHEN 'B' THEN 'VERY GOOD'
        WHEN 'C' THEN 'GOOD'
        ELSE 'No such Grade'
    END;
    DBMS_OUTPUT.PUT_LINE('Grade : '|| v_grade || ' Appraisal : ' || v_appraisal);
END;
/

REM -- SEARCHED CASE
DECLARE
    v_grade CHAR(1) := UPPER('&grade');
    v_appraisal VARCHAR2(20);
BEGIN
    v_appraisal := CASE
        WHEN v_grade='A' THEN 'EXCELLENT'
        WHEN v_grade IN ('B','C') THEN 'VERY GOOD'
        ELSE 'No such Grade'
    END;
    DBMS_OUTPUT.PUT_LINE('Grade : '|| v_grade || ' Appraisal : ' || v_appraisal);
END;
/

REM -- BASIC LOOPS
DECLARE
    v_countryId LOCATIONS.COUNTRY_ID%TYPE := 'CA';
    v_loc_id LOCATIONS.LOCATION_ID%TYPE;
    v_counter NUMBER(2):= 1;
    v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
    SELECT MAX(LOCATION_ID) INTO v_loc_id
    FROM LOCATIONS
    WHERE COUNTRY_ID = v_countryId;
    LOOP
        INSERT INTO LOCATIONS(LOCATION_ID, CITY, COUNTRY_ID)
        VALUES ((v_loc_id + v_counter), v_new_city, v_countryId);
        v_counter := v_counter+1;
        EXIT WHEN v_counter>3;
    END LOOP;
END;
/

REM -- WHILE LOOPS
DECLARE
    v_countryId LOCATIONS.COUNTRY_ID%TYPE := 'CA';
    v_loc_id LOCATIONS.LOCATION_ID%TYPE;
    v_counter NUMBER(2):= 1;
    v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
    SELECT MAX(LOCATION_ID) INTO v_loc_id
    FROM LOCATIONS
    WHERE COUNTRY_ID = v_countryId;
    WHILE v_counter<=3 LOOP
        INSERT INTO LOCATIONS(LOCATION_ID, CITY, COUNTRY_ID)
        VALUES ((v_loc_id + v_counter), v_new_city, v_countryId);
        v_counter := v_counter+1;
    END LOOP;
END;
/

REM -- FOR LOOPS
DECLARE
    v_countryId LOCATIONS.COUNTRY_ID%TYPE := 'CA';
    v_loc_id LOCATIONS.LOCATION_ID%TYPE;
    v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
    SELECT MAX(LOCATION_ID) INTO v_loc_id
    FROM LOCATIONS
    WHERE COUNTRY_ID = v_countryId;
    FOR i IN 1..3 LOOP
        INSERT INTO LOCATIONS(LOCATION_ID, CITY, COUNTRY_ID)
        VALUES ((v_loc_id + i), v_new_city, v_countryId);
    END LOOP;
END;
/

REM -- FOR LOOP IN REVERSE ORDER
BEGIN
    FOR i IN REVERSE 1..3 LOOP
        DBMS_OUTPUT.PUT_LINE('ITERATION IS : '|| I);
    END LOOP;
END;
/


