use dbmicrotech;


-- Show all product name from product table
select prodname
from tblproduct;

-- show all product name and price from product table 
select prodId as productId,
	prodName "Product Name",
    prodPrice "product Price"
from tblproduct;

-- show all records from product table
select *
from tblproduct;