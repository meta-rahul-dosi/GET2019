insert into products values
(101,'skybag1213',1250,12,81),
(102,'silk',120,100,51),
(103,'volleyball',350,20,66),
(104,'cricket-ball',140,90,68),
(105,'cricket-bat',700,18,69);


insert into categories values 
(80, 1, 'bags', null, null, null),
(81, 2, 'skybags', 101, 80, 'bag'),
(50, 3, 'choclates', null, null, null),
(51, 4, 'dairy milk silk', 102, 50, 'choclates'),
(65, 5, 'sports', null, null, null),
(66, 6, 'volleyball', 103, 65, 'sports'),
(67, 7, 'cricket', null, 65 , 'sports'),
(68, 8, 'ball', 104, 67, 'cricket'),
(69, 9, 'bat', 105, 67, 'cricket' );



insert into images values 
(1, 101),
(2, 102),
(3, 102),
(4, 104),
(5, 104);



insert into users values
(201, 'ram', 1001, 'admin', 9828494949),
(202, 'anirudh', 1002, 'shopper', 9772277220),
(203, 'laxman', 1003, 'shopper', 8989454589),
(204, 'radhika', 1004, 'shopper', 7878787878);



insert into orders values
(1001, 1, 101, 1, 'shipped'),
(1001, 2, 102, 3, 'returned'),
(1002, 3, 104, 2, 'shipped'),
(1003, 4, 105, 1, 'cancelled');



insert into bill values 
(601, 1, 1, '2018-01-24 10:23:10', 'vaishali nagar', 1250),
(601, 2, 2,  '2019-01-02 11:22:17', 'pratap nagar', 306),
(602, 3, 3, '2019-03-03 17:00:00', 'pink city', 280),
(603, 4, 4, '2019-04-23 12:12:08', 'sindhi camp', 700);




