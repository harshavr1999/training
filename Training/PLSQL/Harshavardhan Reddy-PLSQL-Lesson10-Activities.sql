REM -- QUERY 1
CREATE PROCEDURE greet IS
    v_today DATE:=SYSDATE;
    v_tomorrow v_today%TYPE;
BEGIN
    v_tomorrow:=v_today+1;
    DBMS_OUTPUT.PUT_LINE(' Hello World ');
    DBMS_OUTPUT.PUT_LINE('TODAY IS : '||v_today);
    DBMS_OUTPUT.PUT_LINE('TOMORROW IS : '||v_tomorrow);
END;

SET SERVEROUTPUT ON;
BEGIN
    greet;
END;
/

REM -- QUERY 2
DROP PROCEDURE greet;

CREATE PROCEDURE greet(pname VARCHAR2) IS
    p_name VARCHAR2(10);
    v_today DATE:=SYSDATE;
    v_tomorrow v_today%TYPE;
BEGIN
    p_name := pname;
    v_tomorrow:=v_today+1;
    DBMS_OUTPUT.PUT_LINE(' Hello '||p_name);
    DBMS_OUTPUT.PUT_LINE('TODAY IS : '||v_today);
    DBMS_OUTPUT.PUT_LINE('TOMORROW IS : '||v_tomorrow);
END;

BEGIN
    greet('Harsha');
END;
/