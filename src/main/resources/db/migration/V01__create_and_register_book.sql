CREATE TABLE book(
id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
subject_book VARCHAR(50) NOT NULL,
author VARCHAR(50) NOT NULL,
price DECIMAL (4,2) NOT NULL,
publishing_date VARCHAR(10) NOT NULL,
publisher VARCHAR(50),
publisher_phone VARCHAR(50) NOT NULL,
publisher_email VARCHAR(50)


) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO book (title, subject_book, author, price, publishing_date, publisher, publisher_phone, publisher_email) values ('Angels and Deamons', 'Criminal Investigation',
 'Dan Brown', 39.90, '2000-05-01', 'Random House', '555-5555', 'random_house@randomhouse.com');
 INSERT INTO book (title, subject_book, author, price, publishing_date, publisher, publisher_phone, publisher_email) values ('The Da Vinces Code', 'Criminal Investigation',
 'Dan Brown', 49.90, '2003-05-01', 'Random House', '555-5555', 'random_house@randomhouse.com');
 INSERT INTO book (title, subject_book, author, price, publishing_date, publisher, publisher_phone, publisher_email) values ('The Lost Symbol', 'Criminal Investigation',
 'Dan Brown', 29.90, '2009-09-15', 'Random House', '555-5555', 'random_house@randomhouse.com');