create table images
(
    image_link varchar(100),
    image_id int
);

describe  images;

insert into images
values
("www.w3schools.com",8),
("www.fb.com",12),
("www.amazon.in",43);

drop table images;

