CREATE USER IQGTMS IDENTIFIED BY IQGTMS;


GRANT "RECOVERY_CATALOG_OWNER" TO IQGTMS WITH ADMIN OPTION;
GRANT "GATHER_SYSTEM_STATISTICS" TO IQGTMS WITH ADMIN OPTION;
GRANT "DBA" TO IQGTMS WITH ADMIN OPTION;
GRANT "AQ_ADMINISTRATOR_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "AUTHENTICATEDUSER" TO IQGTMS WITH ADMIN OPTION;
GRANT "CONNECT" TO IQGTMS WITH ADMIN OPTION;
GRANT "XDBWEBSERVICES" TO IQGTMS WITH ADMIN OPTION;
GRANT "DELETE_CATALOG_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "OEM_MONITOR" TO IQGTMS WITH ADMIN OPTION;
GRANT "PLUSTRACE" TO IQGTMS WITH ADMIN OPTION;
GRANT "LOGSTDBY_ADMINISTRATOR" TO IQGTMS WITH ADMIN OPTION;
GRANT "EXECUTE_CATALOG_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "XDBADMIN" TO IQGTMS WITH ADMIN OPTION;
GRANT "SCHEDULER_ADMIN" TO IQGTMS WITH ADMIN OPTION;
GRANT "EXP_FULL_DATABASE" TO IQGTMS WITH ADMIN OPTION;
GRANT "IMP_FULL_DATABASE" TO IQGTMS WITH ADMIN OPTION;
GRANT "HS_ADMIN_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "RESOURCE" TO IQGTMS WITH ADMIN OPTION;
GRANT "AQ_USER_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "SELECT_CATALOG_ROLE" TO IQGTMS WITH ADMIN OPTION;
GRANT "CTXAPP" TO IQGTMS WITH ADMIN OPTION;
GRANT "OEM_ADVISOR" TO IQGTMS WITH ADMIN OPTION;
ALTER USER IQGTMS DEFAULT ROLE "RECOVERY_CATALOG_OWNER","GATHER_SYSTEM_STATISTICS","DBA","AQ_ADMINISTRATOR_ROLE","AUTHENTICATEDUSER","CONNECT","XDBWEBSERVICES","DELETE_CATALOG_ROLE","OEM_MONITOR","PLUSTRACE","LOGSTDBY_ADMINISTRATOR","EXECUTE_CATALOG_ROLE","XDBADMIN","SCHEDULER_ADMIN","EXP_FULL_DATABASE","IMP_FULL_DATABASE","HS_ADMIN_ROLE","RESOURCE","AQ_USER_ROLE","SELECT_CATALOG_ROLE","CTXAPP","OEM_ADVISOR";


GRANT ALTER TABLESPACE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY TRIGGER TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE USER TO IQGTMS WITH ADMIN OPTION;
GRANT FLASHBACK ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY OUTLINE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT FORCE TRANSACTION TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY SEQUENCE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY LIBRARY TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY ROLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY JOB TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY CLUSTER TO IQGTMS WITH ADMIN OPTION;
GRANT UPDATE ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY INDEXTYPE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE TRIGGER TO IQGTMS WITH ADMIN OPTION;
GRANT ADMINISTER SQL TUNING SET TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY EVALUATION CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY PROGRAM TO IQGTMS WITH ADMIN OPTION;
GRANT DROP PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT GRANT ANY PRIVILEGE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE TABLESPACE TO IQGTMS WITH ADMIN OPTION;
GRANT DEBUG CONNECT SESSION TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY DIRECTORY TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT MERGE ANY VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY EVALUATION CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY OPERATOR TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE SEQUENCE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY ROLE TO IQGTMS WITH ADMIN OPTION;
GRANT ON COMMIT REFRESH TO IQGTMS WITH ADMIN OPTION;
GRANT SELECT ANY SEQUENCE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY RULE SET TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY TRIGGER TO IQGTMS WITH ADMIN OPTION;
GRANT UNDER ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY SQL PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY SQL PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT BACKUP ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE SYNONYM TO IQGTMS WITH ADMIN OPTION;
GRANT ADVISOR TO IQGTMS WITH ADMIN OPTION;
GRANT ADMINISTER ANY SQL TUNING SET TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER DATABASE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY OPERATOR TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY LIBRARY TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY DIRECTORY TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY INDEX TO IQGTMS WITH ADMIN OPTION;
GRANT BECOME USER TO IQGTMS WITH ADMIN OPTION;
GRANT ADMINISTER RESOURCE MANAGER TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE RULE SET TO IQGTMS WITH ADMIN OPTION;
GRANT MANAGE TABLESPACE TO IQGTMS WITH ADMIN OPTION;
GRANT EXEMPT ACCESS POLICY TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY INDEX TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY CLUSTER TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY EVALUATION CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER RESOURCE COST TO IQGTMS WITH ADMIN OPTION;
GRANT SELECT ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY CLUSTER TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ROLLBACK SEGMENT TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY INDEX TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE PUBLIC SYNONYM TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE OPERATOR TO IQGTMS WITH ADMIN OPTION;
GRANT GLOBAL QUERY REWRITE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY RULE SET TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY INDEXTYPE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ROLE TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY CLASS TO IQGTMS WITH ADMIN OPTION;
GRANT RESTRICTED SESSION TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY MATERIALIZED VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT SELECT ANY TRANSACTION TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER USER TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT ANALYZE ANY DICTIONARY TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY SYNONYM TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE EXTERNAL JOB TO IQGTMS WITH ADMIN OPTION;
GRANT INSERT ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE LIBRARY TO IQGTMS WITH ADMIN OPTION;
GRANT GRANT ANY OBJECT PRIVILEGE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE JOB TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY OPERATOR TO IQGTMS WITH ADMIN OPTION;
GRANT ENQUEUE ANY QUEUE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY OUTLINE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY RULE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY LIBRARY TO IQGTMS WITH ADMIN OPTION;
GRANT DROP PUBLIC SYNONYM TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY SEQUENCE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY EVALUATION CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE SESSION TO IQGTMS WITH ADMIN OPTION;
GRANT QUERY REWRITE TO IQGTMS WITH ADMIN OPTION;
GRANT DEQUEUE ANY QUEUE TO IQGTMS WITH ADMIN OPTION;
GRANT EXPORT FULL DATABASE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE CLUSTER TO IQGTMS WITH ADMIN OPTION;
GRANT RESUMABLE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE PUBLIC DATABASE LINK TO IQGTMS WITH ADMIN OPTION;
GRANT FORCE ANY TRANSACTION TO IQGTMS WITH ADMIN OPTION;
GRANT UNLIMITED TABLESPACE TO IQGTMS WITH ADMIN OPTION;
GRANT UNDER ANY VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY OUTLINE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE EVALUATION CONTEXT TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY INDEXTYPE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY MATERIALIZED VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT DROP USER TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY OPERATOR TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY SQL PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE INDEXTYPE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER SYSTEM TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY INDEXTYPE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY SYNONYM TO IQGTMS WITH ADMIN OPTION;
GRANT GRANT ANY ROLE TO IQGTMS WITH ADMIN OPTION;
GRANT LOCK ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE MATERIALIZED VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY RULE SET TO IQGTMS WITH ADMIN OPTION;
GRANT MANAGE SCHEDULER TO IQGTMS WITH ADMIN OPTION;
GRANT CHANGE NOTIFICATION TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY DIMENSION TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY DIMENSION TO IQGTMS WITH ADMIN OPTION;
GRANT DROP TABLESPACE TO IQGTMS WITH ADMIN OPTION;
GRANT READ ANY FILE GROUP TO IQGTMS WITH ADMIN OPTION;
GRANT SELECT ANY DICTIONARY TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY RULE TO IQGTMS WITH ADMIN OPTION;
GRANT IMPORT FULL DATABASE TO IQGTMS WITH ADMIN OPTION;
GRANT DELETE ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT AUDIT SYSTEM TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY MATERIALIZED VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT DEBUG ANY PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT EXEMPT IDENTITY POLICY TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ROLLBACK SEGMENT TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE RULE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY VIEW TO IQGTMS WITH ADMIN OPTION;
GRANT SYSOPER TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE PROCEDURE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE PROFILE TO IQGTMS WITH ADMIN OPTION;
GRANT SYSDBA TO IQGTMS WITH ADMIN OPTION;
GRANT ANALYZE ANY TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT UNDER ANY TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY TRIGGER TO IQGTMS WITH ADMIN OPTION;
GRANT MANAGE ANY FILE GROUP TO IQGTMS WITH ADMIN OPTION;
GRANT COMMENT ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY DIMENSION TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ANY TYPE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY RULE TO IQGTMS WITH ADMIN OPTION;
GRANT DROP PUBLIC DATABASE LINK TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE DIMENSION TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE ROLLBACK SEGMENT TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY SEQUENCE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER ANY RULE SET TO IQGTMS WITH ADMIN OPTION;
GRANT CREATE DATABASE LINK TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY TABLE TO IQGTMS WITH ADMIN OPTION;
GRANT MANAGE ANY QUEUE TO IQGTMS WITH ADMIN OPTION;
GRANT ALTER SESSION TO IQGTMS WITH ADMIN OPTION;
GRANT ADMINISTER DATABASE TRIGGER TO IQGTMS WITH ADMIN OPTION;
GRANT EXECUTE ANY RULE TO IQGTMS WITH ADMIN OPTION;
GRANT AUDIT ANY TO IQGTMS WITH ADMIN OPTION;
GRANT DROP ANY LIBRARY TO IQGTMS WITH ADMIN OPTION;
GRANT MANAGE FILE GROUP TO IQGTMS WITH ADMIN OPTION;

CONNECT IQGTMS/IQGTMS

CREATE TABLE TM_VEHICLEDETAILS 
(
  VEH_ID NUMBER NOT NULL 
, VEH_TYPE VARCHAR2(50 BYTE) NOT NULL 
, ENGINE_NO VARCHAR2(50 BYTE) NOT NULL 
, MODEL_NO VARCHAR2(50 BYTE) NOT NULL 
, VEH_NAME VARCHAR2(50 BYTE) NOT NULL 
, VEH_COLOR VARCHAR2(50 BYTE) 
, MANUFACTURER_NAME VARCHAR2(50 BYTE) NOT NULL 
, DATE_OF_MANUFACTURE DATE NOT NULL 
, NO_OF_CYLINDERS NUMBER 
, CUBIC_CAPACITY NUMBER 
, FUEL_USED VARCHAR2(20 BYTE) 
, CONSTRAINT TM_VEHICLEDETAILS_PK PRIMARY KEY 
  (
    VEH_ID 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

CREATE TABLE TM_USERMASTER 
(
  USERNAME VARCHAR2(20 BYTE) NOT NULL 
, PASSWORD VARCHAR2(20 BYTE) NOT NULL 
, ROLENAME VARCHAR2(20 BYTE) NOT NULL 
, CONSTRAINT TM_USERMASTER_PK PRIMARY KEY 
  (
    USERNAME 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

CREATE TABLE TM_ROLEMASTER 
(
  ROLENAME VARCHAR2(20 BYTE) NOT NULL 
, ROLE_DESC VARCHAR2(100 BYTE) 
, CONSTRAINT TM_ROLEMASTER_PK PRIMARY KEY 
  (
    ROLENAME 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

CREATE TABLE TM_REGDETAILS 
(
  APP_NO NUMBER NOT NULL 
, VEH_NO VARCHAR2(20 BYTE) NOT NULL 
, VEH_ID NUMBER 
, OWNER_ID NUMBER 
, DATE_OF_PURCHASE DATE NOT NULL 
, DISTRUBUTER_NAME VARCHAR2(200 BYTE) NOT NULL 
, CONSTRAINT TM_REGDETAILS_PK PRIMARY KEY 
  (
    VEH_NO 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

CREATE TABLE TM_OWNERDETAILS 
(
  OWNER_ID NUMBER NOT NULL 
, FNAME VARCHAR2(50 BYTE) NOT NULL 
, LNAME VARCHAR2(50 BYTE) NOT NULL 
, DATEOFBIRTH DATE NOT NULL 
, LANDLINE_NO VARCHAR2(20 BYTE) 
, MOBILE_NO VARCHAR2(15 BYTE) 
, GENDER CHAR(1 BYTE) NOT NULL 
, TEMP_ADDR VARCHAR2(200 BYTE) 
, PERM_ADDR VARCHAR2(200 BYTE) NOT NULL 
, PINCODE NUMBER NOT NULL 
, OCCUPATION VARCHAR2(200 BYTE) 
, PANCARD_NO VARCHAR2(20 BYTE) NOT NULL 
, ADD_PROOF_NAME VARCHAR2(20 BYTE) NOT NULL 
, CONSTRAINT TM_OWNERDETAILS_PK PRIMARY KEY 
  (
    OWNER_ID 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

CREATE TABLE TM_OFFENCE_DETAILS 
(
  VEH_NO VARCHAR2(20 BYTE) NOT NULL 
, IMAGE BLOB 
, OFFENCE_DETAIL_ID NUMBER NOT NULL 
, OFFENCE_STATUS VARCHAR2(20 BYTE) 
, OFFENCE_ID NUMBER NOT NULL 
, TIME DATE NOT NULL 
, PLACE VARCHAR2(200 BYTE) NOT NULL 
, REPORTED_BY VARCHAR2(20 BYTE) NOT NULL 
, CONSTRAINT TM_OFFENCE_DETAILS_PK PRIMARY KEY 
  (
    OFFENCE_DETAIL_ID 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
) 
LOB (IMAGE) STORE AS SYS_LOB0000015940C00002$$ 
( 
  ENABLE STORAGE IN ROW 
  CHUNK 8192 
  RETENTION 
  NOCACHE 
  LOGGING 
  STORAGE 
  ( 
    INITIAL 65536 
    MINEXTENTS 1 
    MAXEXTENTS 2147483645 
    FREELISTS 1 
    FREELIST GROUPS 1 
    BUFFER_POOL DEFAULT 
  )  
);

CREATE TABLE TM_OFFENCE 
(
  OFFENCE_ID NUMBER NOT NULL 
, OFFENCE_TYPE VARCHAR2(200 BYTE) NOT NULL 
, PENALTY NUMBER NOT NULL 
, VEH_TYPE VARCHAR2(50 BYTE) NOT NULL 
, CONSTRAINT TM_OFFENCE_PK PRIMARY KEY 
  (
    OFFENCE_ID 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE "SYSTEM" 
PCTFREE 10 
PCTUSED 40 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  FREELISTS 1 
  FREELIST GROUPS 1 
  BUFFER_POOL DEFAULT 
);

ALTER TABLE TM_VEHICLEDETAILS
ADD CONSTRAINT TM_VEHICLEDETAILS_UK1 UNIQUE 
(
  ENGINE_NO 
)
ENABLE;

ALTER TABLE TM_USERMASTER
ADD CONSTRAINT TM_USERMASTER_TM_ROLEMAST_FK1 FOREIGN KEY
(
  ROLENAME 
)
REFERENCES TM_ROLEMASTER
(
  ROLENAME 
)
ON DELETE CASCADE ENABLE;

ALTER TABLE TM_REGDETAILS
ADD CONSTRAINT TM_REGDETAILS_TM_OWNERDET_FK1 FOREIGN KEY
(
  OWNER_ID 
)
REFERENCES TM_OWNERDETAILS
(
  OWNER_ID 
)
ON DELETE CASCADE ENABLE;

ALTER TABLE TM_REGDETAILS
ADD CONSTRAINT TM_REGDETAILS_TM_VEHICLED_FK1 FOREIGN KEY
(
  VEH_ID 
)
REFERENCES TM_VEHICLEDETAILS
(
  VEH_ID 
)
ON DELETE CASCADE ENABLE;

ALTER TABLE TM_OFFENCE_DETAILS
ADD CONSTRAINT OFFENCE_DETAILS_TM_OFFENC_FK1 FOREIGN KEY
(
  OFFENCE_ID 
)
REFERENCES TM_OFFENCE
(
  OFFENCE_ID 
)
ON DELETE CASCADE ENABLE;

ALTER TABLE TM_OFFENCE_DETAILS
ADD CONSTRAINT TM_OFFENCE_DETAILS_TM_REG_FK1 FOREIGN KEY
(
  VEH_NO 
)
REFERENCES TM_REGDETAILS
(
  VEH_NO 
)
ON DELETE CASCADE ENABLE;

ALTER TABLE TM_OFFENCE_DETAILS
ADD CONSTRAINT TM_OFFENCE_DETAILS_TM_USE_FK1 FOREIGN KEY
(
  REPORTED_BY 
)
REFERENCES TM_USERMASTER
(
  USERNAME 
)
ENABLE;

CREATE SEQUENCE TM_VEH_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 1 CACHE 20;

CREATE SEQUENCE TM_OWNER_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 1 CACHE 20;

CREATE SEQUENCE TM_OFFENCE_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 1 CACHE 20;

CREATE SEQUENCE TM_OFFENCE_DETAIL_ID_SEQ INCREMENT BY 1 MAXVALUE 999999999999999999999999999 MINVALUE 1 CACHE 20 ORDER;

CREATE TRIGGER TM_VEHICLEDETAILS_TRG BEFORE INSERT ON TM_VEHICLEDETAILS
FOR EACH ROW
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.VEH_ID IS NULL THEN
      SELECT TM_VEH_ID_SEQ.NEXTVAL INTO :NEW.VEH_ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

CREATE TRIGGER TM_OWNERDETAILS_TRG BEFORE INSERT ON TM_OWNERDETAILS
FOR EACH ROW
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.OWNER_ID IS NULL THEN
      SELECT TM_OWNER_ID_SEQ.NEXTVAL INTO :NEW.OWNER_ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

CREATE TRIGGER TM_OFFENCE_TRG BEFORE INSERT ON TM_OFFENCE
FOR EACH ROW
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.OFFENCE_ID IS NULL THEN
      SELECT TM_OFFENCE_ID_SEQ.NEXTVAL INTO :NEW.OFFENCE_ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/

CREATE TRIGGER TM_OFFENCE_DETAIL_ID_TRG BEFORE INSERT ON TM_OFFENCE_DETAILS
FOR EACH ROW
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.OFFENCE_DETAIL_ID IS NULL THEN
      SELECT TM_OFFENCE_DETAIL_ID_SEQ.NEXTVAL INTO :NEW.OFFENCE_DETAIL_ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/