create table images
(
    image_link varchar(100),
    image_id int primary key,
    product_id int, foreign key (product_id) references products(product_id)
);

describe  images;

drop table images;

