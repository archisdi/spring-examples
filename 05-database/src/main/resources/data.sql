create table if not exists person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(10003,  'Pieter', 'Amsterdam',sysdate());