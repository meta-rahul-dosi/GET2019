create table emp_details
(
    fullName varchar(30)NOT NULL ,
    gender varchar(10) NOT NULL,
    email varchar(40) NOT NULL,
    password varchar(30) NOT NULL,
    contact varchar(10) NOT NULL,
    organization varchar(20) NOT NULL,
    empID int(10) AUTO_INCREMENT NOT NULL,
    primary key(empID) 
);

describe emp_details;

insert into emp_details(fullName, gender, email, password, contact, organization)
values ('r', 'male', 'email@gmail.com', 'Abc@12345', '7728017799', 'Metacube');

select * from emp_details;

truncate table emp_details;

drop table emp_details;

