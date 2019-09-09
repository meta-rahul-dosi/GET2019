create table pass_prices
(
    vehicleType varchar(10),
    dailyPrice float(3),
    monthlyPrice float(3),
    yearlyPrice float(3),
      id int primary key
);

describe pass_prices;

insert into pass_prices values
( 'cycle', 0.07, 1.4, 7, 1),
( '2wheeler', 0.14, 2.8, 14, 2),
( '4wheeler', 0.28, 7, 49, 3);

select * from pass_prices;

SELECT * FROM pass_prices WHERE vehicleType = 'cycle';

drop table pass_prices;
