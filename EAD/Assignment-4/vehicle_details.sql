create table vehicle_details
(
    vehicleName varchar(20),
    vehicleType varchar(15),
    vehicleNumber varchar(20),
    empID int(10),
    identification varchar(30),
    vehicle_id int primary key auto_increment
);

select * from vehicle_details;

truncate table vehicle_details;

drop table vehicle_details;


