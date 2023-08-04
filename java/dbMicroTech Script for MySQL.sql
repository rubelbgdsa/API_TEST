-- DROP Database dbMicrotech;

CREATE Database dbMicrotech;



USE dbMicrotech;

CREATE TABLE tblEmployee        
(
empId     int   PRIMARY KEY not null,
empName   VarChar(50) not null,    
empState  Char(2) null,
empDOB    Date  null,
empSalary Decimal(9,2) null,    
empMarried Bit null,   
managerId int
);


CREATE TABLE tblCustomer
(
custId int PRIMARY KEY not null,
custName varchar(50) null,
custState char(2) null
);


CREATE TABLE tblProduct
(
prodId int PRIMARY KEY not null,
prodName varchar(200) null,
prodPrice decimal(10,2) null 
);


CREATE TABLE tblOrder
(
ordId int PRIMARY KEY not null,
customerId int null,   
employeeId int null,   
productId int null,    
ordDate date null,
ordDeliveryDate date null
);


USE dbMicrotech;
INSERT INTO tblCustomer (custId, custName,custState) values(1,'Matt Inc','NJ');
INSERT INTO tblCustomer (custId, custName,custState) values(2,'Oricef LLC','CT');  
INSERT INTO tblCustomer (custId, custName,custState) values(3,'Klahri LLC','NJ');
INSERT INTO tblCustomer (custId, custName,custState) values(4,'Fargo & Sons','NY');
INSERT INTO tblCustomer (custId, custName,custState) values(5,'Laiba','NJ');

USE dbMicrotech;


INSERT INTO tblEmployee (empId, empName, empState, empDOB, empSalary, empMarried,managerId )    
                  values(1, 'Kate', 'NY', '1975-06-27', 56.50, 1, 2);
INSERT INTO tblEmployee (empId, empName, empState, empDOB, empSalary, empMarried, managerId )    
                  values(2, 'Maria', 'NY', '1956-10-01', 19.00, 1, 2);
INSERT INTO tblEmployee (empId, empName, empState, empDOB, empSalary, empMarried, managerId )    
                  values(3, 'Hasan', 'NY', '1991-03-17', 29.33, 0, 2);


use dbMicrotech;

INSERT INTO tblProduct(prodId,prodName,prodPrice) values(1,'Pen', 2.00 );
INSERT INTO tblProduct(prodId,prodName,prodPrice) values(2,'Eraser', 1.50 );
INSERT INTO tblProduct(prodId,prodName,prodPrice) values(3,'Pencil', 3.50 );
INSERT INTO tblProduct(prodId,prodName,prodPrice) values(4,'envelop', 6.10 );
INSERT INTO tblProduct(prodId,prodName,prodPrice) values(5,'pad', 1.29 );
INSERT INTO tblProduct(prodId,prodName,prodPrice) values(6,'pin', 0.59 );


USE dbMicrotech;

INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (1, 4, 3, 4, '2014-01-01', '2014-01-03' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (2, 3, 2, 3, '2014-01-02', '2014-01-04' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (3, 2, 1, 1, '2014-01-02', '2014-01-04' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (4, 3, 1, 1, '2014-01-02', '2014-01-04' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (5, 4, 3, 1, '2014-01-03', '2014-01-04' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (6, 3, 1, 6, '2014-01-04', '2014-01-05' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (7, 5, 3, 2, '2014-01-04', '2014-01-05' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (8, 4, 3, 4, '2014-01-04', '2014-01-05' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (9, Null, 1, 1, '2014-01-05', '2014-01-08');
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (10, 3, 1, 4, '2020-09-12', '2020-09-17' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (11, 5, 2, 1, '2020-09-12', '2020-09-17' );
INSERT INTO tblOrder (ordId, customerId, employeeId, productId, ordDate, ordDeliveryDate) values (12, 3, 1, 3, '2020-09-12', '2020-09-17' );

