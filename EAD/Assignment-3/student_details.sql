create table student_details
(
    id int primary key auto_increment,
    first_name varchar(20),
    last_name varchar(20),
    father_name varchar(20),
    email varchar(40),
    class int(3),
    age int(2)
);

describe student_details;

insert into student_details(first_name, last_name, father_name, email, class, age) 
values 
("a",'fb','hth','efg@rhh',5,5),
("c",'fb','hth','efg@rhh',5,5);

select * from student_details;

truncate table student_details;

drop table student_details;