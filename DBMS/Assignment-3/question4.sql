-- creating table zipcode_map

create table zipcode_map(
zipcode int,
city varchar(50),
state varchar(50));



-- inserting values in the zipcode_map table

insert into zipcode_map
values(282001,'Dwarka','Gujarat'),
(302017,'Jaipur','Rajasthan'),
(302034,'Bhilwara','Rajasthan'),
(609844,'Pahalgam','Jammu & Kashmir');



-- Resultset containing Zip Code, City Names and States ordered by State Name and City Name.

select zipcode,city,state
from zipcode_map
order by city asc, state asc;

