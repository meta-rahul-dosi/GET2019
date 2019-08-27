create table images
(
    image_id int primary key,
    product_id int, foreign key(product_id) references products(product_id)
);

describe  images;

select * from images;



