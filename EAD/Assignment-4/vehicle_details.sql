create table vehicle_details
(
    name varchar(20),
    type varchar(15),
    vehicleNumber varchar(20),
    empID varchar(10) primary key,
    description varchar(30)
);

select * from vehicle_details;

truncate table vehicle_details;