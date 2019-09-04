create table emp_details
(
    fullName varchar(30),
    gender varchar(10),
    email varchar(40),
    password varchar(30),
    contact varchar(10),
    organization varchar(20),
    empID varchar(15) primary key
);

describe emp_details;

select * from emp_details;

insert into emp_details 
values
('rahul', 'male', 'email@gmail.com', 'Abc@12345', '7728017799', 'metacube', 'e19-1216'),
('keshav', 'male', 'email1@gmail.com', 'Abc@123456', '7728017779', 'appirio', 'e19-1217');

truncate table emp_details;


delete from emp_details
where gender='female' and fullName='rahul';

drop table emp_details;

