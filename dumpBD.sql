CREATE DATABASE spring_boot_db
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;
       
CREATE TABLE person(
  id text PRIMARY KEY,
  fullName text NOT NULL,
  birth text NOT NULL  ,
  created timestamp NOT NULL,
  updated timestamp NOT NULL
);
