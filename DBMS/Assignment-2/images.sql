create table images
(
    image_id varchar(50),
    image_link varchar(100)
);

describe  images;

insert into images values
(0001,"www.w3schools.com"),
(0002,"www.fb.com"),
(00032,"www.amazon.in");

select * from images;

drop table images;

