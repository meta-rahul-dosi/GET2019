drop database library;

create database library;

use library;

CREATE  TABLE `library`.`Book` (

  `BookID` INT PRIMARY KEY AUTO_INCREMENT ,

  `Title` VARCHAR(45) not NULL ,

  `Writer` VARCHAR(45) not NULL ,

  `Publisher` VARCHAR(45) not NULL ,

  `PublishedYear` INT UNSIGNED NOT NULL
);

show databases;

show tables;