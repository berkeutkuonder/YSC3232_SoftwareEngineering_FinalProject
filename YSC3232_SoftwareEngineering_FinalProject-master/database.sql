
CREATE TABLE Group (
	Id INTEGER /*GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1)*/,
	Name VARCHAR2(255) NOT NULL,
	PRIMARY KEY (Id)
);




CREATE TABLE User (
	UserName VARCHAR2(255) NOT NULL, /*GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1)*/,
	FirstName VARCHAR2(255) NOT NULL,
	LastName VARCHAR2(255) NOT NULL,
	Password1 VARCHAR2(255), NOT NULL,
	CONSTRAINT pk_user PRIMARY KEY (UserName)
);

CREATE TABLE UserandGroup (
	Id INTEGER,
    UserName VARCHAR2(255) NOT NULL,
	PRIMARY KEY (Id)
);
