<?xml version = '1.0' encoding = 'UTF-8'?>
<trigger xmlns="http://xmlns.oracle.com/jdeveloper/1111/offlinedb">
  <ID class="oracle.javatools.db.IdentifierBasedID">
    <identifier class="java.lang.String">ff0b4520-ca04-4112-92f1-9a41d59e4a21</identifier>
  </ID>
  <name>TEMPLATE_TRIGGER1</name>
  <baseSchemaName>TEMPLATES</baseSchemaName>
  <baseType>TABLE</baseType>
  <enabled>true</enabled>
  <events>
    <event>INSERT</event>
    <event>UPDATE</event>
    <event>DELETE</event>
  </events>
  <schema>
    <name>TEMPLATES</name>
  </schema>
  <source>/*
 * To change this template comment, edit FOD.TEMPLATES.TEMPLATE_TRIGGER1
 */
CREATE OR REPLACE TRIGGER TEMPLATE_TRIGGER1 
BEFORE INSERT OR UPDATE OR DELETE ON TEMPLATES.TEMPLATE_TABLE1 
BEGIN
  NULL;
END;</source>
  <statementLevel>true</statementLevel>
  <tableID class="oracle.javatools.db.IdentifierBasedID">
    <name>TEMPLATE_TABLE1</name>
    <identifier class="java.lang.String">05bee794-49a4-4262-b36c-f95be9b038db</identifier>
    <schemaName>TEMPLATES</schemaName>
    <type>TABLE</type>
  </tableID>
  <timing>BEFORE</timing>
</trigger>
