/*created a database and used it*/
create database example;
use example;

create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
/* adding primary key and delete it*/
alter table addresses
add primary key (id);
describe addresses;
alter table addresses
drop primary key ;
describe addresses;

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people
add primary key(id);
describe people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
/*3 .added unique constraint */
describe pets;
alter table pets
add constraint u_species unique (species);

/* 4. to see the properties - SHOW CREATE TABLE people */
show create table people;

/*5. add and deleted foreign keys*/

alter table people
add constraint swathi
foreign key(address_id) references addresses(id);
alter table people
drop foreign key swathi;

/*6. changed the column_name of a particular table */
describe pets;
select * from pets;
alter table pets change `species` `type`varchar(20);
describe pets;
/*7. changed the data_type of a column. */
alter table addresses modify city varchar(30);
describe addresses;

create database test2;
use test2;
show tables;

create table people(
id int auto_increment primary key,
name varchar(30),
age int,
gender enum('M','F')
);

insert into people(name,age,gender)
values ('Emma',21,'F'),('John',30,'M'),('Thomas',27,'M'),('Chris',44,'M'),('Sally',23,'F'),('Frank',55,'M');

select * from people;
set sql_safe_updates=0;
-- deleting a selected row
delete from people
where name='John';
-- deleting multiple rows
delete from people
where gender='F';
-- to delete all the data
delete from people;
show tables;

create database coffee_str;
use coffee_str;

create table products(
id int auto_increment primary key,
name varchar(30),
price decimal(4,2),
coffee_origin varchar(30)
);

create table orders(
id int auto_increment primary key,
product_id int,
customer_id int,
order_time datetime
);

create table products(
id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
gender enum('M','F'),
phone_number varchar(11)
);

-- entering a row of data
insert into products(name,price,coffee_origin)
values('Espresso',2.50,'Brazil');
 
-- entering multiple rows of data

insert into products(name,price,coffee_origin)
values('Macchiato',3.00,'Brazil'),('Cappuccino',3.50,'Cost Rica'); 

insert into products(name,price,coffee_origin)
values('Latte',3.50,'Indonesia'),('Americano',3.00,'Brazil'),('Flat White',3.50,'Indonesia'),('Filter',3.00,'India');

select * from products;

updating the data 
syntax-
update <table_name>
set <column_name>='value'
where <column_name>='value';

update products
set coffee_origin='India'
where name='Filter';

update products
set coffee_origin='Sri Lanka'
where id=7;

set sql_safe_updates=0;

-- changing the price and coffee_origin of Americano
update products
set price=3.25,coffee_origin='Ethiopia'
where name='Americano';

-- changing multiple rows of data 

update products
set coffee_origin='Columbia'
where coffee_origin='Brazil';

select * from products