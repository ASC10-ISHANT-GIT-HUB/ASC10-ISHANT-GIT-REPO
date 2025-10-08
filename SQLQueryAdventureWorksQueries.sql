use AdventureWorksLT2019;
--1 
select * from SalesLT.Customer;
--2
select * from SalesLT.Product;
--3
Select FirstName, LastName, EmailAddress from SalesLT.Customer;
--4
select Name, ListPrice from SalesLT.Product;
--5
select  count(*) as TotalCustomer from SalesLT.Customer;
--6
select  count(*) as TotalProduct from SalesLT.Product;
--7
select distinct Color from SalesLT.Product where Color is NOT NULL;
--8
select TOP 10 Name, ListPrice from SalesLT.Product order by ListPrice Desc;
--9
select * from SalesLt.SalesOrderHeader;
--10
select Name, ProductNumber, StandardCost from SalesLT.Product
where SellEndDate is NULL;
--11
Select Name, ListPrice from SalesLT.Product where ListPrice>1000;
--12
Select FirstName, LastName,CompanyName
from SalesLt.Customer c
join SalesLt.CustomerAddress ca ON c.customerId = ca.CustomerID
join SalesLt.Address a ON ca.addressID = a.AddressID
where a.City = 'Seattle';
--13
select Name, color, ListPrice
from SalesLT.Product where color='Red'
--14
select SalesOrderID,OrderDate, TotalDue
from SalesLT.SalesOrderHeader
where YEAR(OrderDate) = 2008;

select GETDATE() AS CurrentDateTime;
Select Format(Getdate(), 'dd/MM/YYYY') AS FormattedDate;

select Month(Getdate()) As CurrentMonth; 

--15
select Name, ListPrice
from SalesLT.Product
where ListPrice between 100 and 500;

--16
select FirstName, LastName from SalesLT.Customer 
where EmailAddress Like '%adventure-works.com'

--17
select Name from SalesLT.Product where Name Like 'Mountain%'

--18
select * from SalesLT.Product where Color is NULL;

--19
select * from SalesLT.Customer where Phone is NOT NULL;

--20
select * from SalesLT.ProductCategory pc
join SalesLT.Product p 
ON p.ProductCategoryID = pc.ProductCategoryID
where pc.Name IN('Helmets', 'Gloves')

--21
select AVG(ListPrice) as AVG_PRICE
from SalesLT.Product;

select count_big(*) as total_products from SalesLT.Product;
-- count big
select APPROX_COUNT_DISTINCT(color) from SalesLT.Product where color is not null;
--approx_count_distinct

--22
select SUM(TotalDue) as TotalSales
from SalesLT.SalesOrderHeader

--23
select MAX(ListPrice) as MaxPrice
from SalesLT.Product 

--24
select MIN(ListPrice) as MinPrice
from SalesLT.Product where ListPrice>0

--25
select color, COunt(*) as No_of_color
from SalesLT.Product 
where color is NOT NULL group by color

--26
SELECT 
YEAR(OrderDate) AS OrderYear,
AVG(TotalDue) AS AverageTotalDue
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate)
ORDER BY OrderYear;

--27
SELECT 
P.Name AS ProductName,
SUM(SOD.OrderQty) AS TotalUnitsSold
FROM SalesLT.SalesOrderDetail SOD
JOIN SalesLT.Product P ON SOD.ProductID = P.ProductID
GROUP BY P.Name
ORDER BY TotalUnitsSold DESC;

--28. Orders per Customer
SELECT 
CustomerID,
COUNT(SalesOrderID) AS OrdersPlaced
FROM SalesLT.SalesOrderHeader
GROUP BY CustomerID
ORDER BY OrdersPlaced DESC;

--29
SELECT 
PC.Name AS CategoryName,
AVG(P.ListPrice) AS AveragePrice
FROM SalesLT.Product P
JOIN SalesLT.ProductCategory PC ON P.ProductCategoryID = PC.ProductCategoryID
GROUP BY PC.Name
ORDER BY AveragePrice DESC;

--30
SELECT 
YEAR(OrderDate) AS OrderYear,
MONTH(OrderDate) AS OrderMonth,
SUM(TotalDue) AS MonthlySales
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
ORDER BY OrderYear, OrderMonth;

--36
SELECT
    soh.SalesOrderID,
    c.FirstName + ' ' + c.LastName AS CustomerName,
    p.Name AS ProductName,
    sod.OrderQty,
    sod.UnitPrice,
    sod.LineTotal
FROM SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Customer c
    ON soh.CustomerID = c.CustomerID
INNER JOIN SalesLT.SalesOrderDetail sod
    ON soh.SalesOrderID = sod.SalesOrderID
INNER JOIN SalesLT.Product p
    ON sod.ProductID = p.ProductID
ORDER BY
    soh.SalesOrderID,
    p.Name;

--37
SELECT
    p.ProductID,
    p.Name AS ProductName
FROM SalesLT.Product p
LEFT JOIN SalesLT.SalesOrderDetail sod
    ON p.ProductID = sod.ProductID
WHERE
    sod.SalesOrderDetailID IS NULL
ORDER BY
    p.Name;
    
--38 
SELECT
    c.CustomerID,
    c.FirstName,
    c.LastName,
    SUM(soh.TotalDue) AS TotalSpent
FROM SalesLT.Customer c
INNER JOIN SalesLT.SalesOrderHeader soh
    ON c.CustomerID = soh.CustomerID
GROUP BY
    c.CustomerID,
    c.FirstName,
    c.LastName
ORDER BY
    TotalSpent DESC;

--39
SELECT
    pm.Name AS ModelName,
    pd.Description AS EnglishDescription
FROM SalesLT.ProductModel pm
INNER JOIN SalesLT.ProductModelProductDescription pmpd
    ON pm.ProductModelID = pmpd.ProductModelID
INNER JOIN SalesLT.ProductDescription pd
    ON pmpd.ProductDescriptionID = pd.ProductDescriptionID
WHERE
    pmpd.Culture = 'en'; -- Filter for English culture

--40
SELECT
    soh.SalesOrderID,
    a.AddressLine1,
    a.City,
    a.StateProvince,
    a.PostalCode
FROM SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Address a
    ON soh.ShipToAddressID = a.AddressID
ORDER BY
soh.SalesOrderID;

--41
SELECT pc.Name AS CategoryName, COUNT(p.ProductID) AS NumberOfProducts
FROM SalesLT.ProductCategory AS pc
JOIN SalesLT.Product AS p ON pc.ProductCategoryID = p.ProductCategoryID
GROUP BY pc.Name
HAVING COUNT(p.ProductID) > 10;

--42
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalSpent
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName
HAVING SUM(soh.TotalDue) > 10000;

--43
SELECT p.Name, SUM(sod.OrderQty) AS TotalUnitsSold
FROM SalesLT.Product AS p
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY p.Name
HAVING SUM(sod.OrderQty) > 100;

--44
SELECT Color, AVG(ListPrice) AS AveragePrice
FROM SalesLT.Product
WHERE Color IS NOT NULL
GROUP BY Color
HAVING AVG(ListPrice) > 500;

--45
SELECT YEAR(OrderDate) AS OrderYear, SUM(TotalDue) AS TotalSales
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate)
HAVING SUM(TotalDue) > 1000000;

--46
SELECT c.CustomerID, c.FirstName, c.LastName, COUNT(soh.SalesOrderID) AS OrderCount
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName
HAVING COUNT(soh.SalesOrderID) > 3;

--47
SELECT p.Name, AVG(CAST(sod.OrderQty AS DECIMAL(10, 2))) AS AvgOrderQty
FROM SalesLT.Product AS p
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY p.Name
HAVING AVG(CAST(sod.OrderQty AS DECIMAL(10, 2))) > 5;

--48
SELECT a.City, COUNT(DISTINCT c.CustomerID) AS CustomerCount
FROM SalesLT.Customer AS c
JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID
GROUP BY a.City
HAVING COUNT(DISTINCT c.CustomerID) > 5;

--49
SELECT pc.Name AS CategoryName, SUM(sod.LineTotal) AS TotalCategorySales
FROM SalesLT.ProductCategory AS pc
JOIN SalesLT.Product AS p ON pc.ProductCategoryID = p.ProductCategoryID
JOIN SalesLT.SalesOrderDetail AS sod ON p.ProductID = sod.ProductID
GROUP BY pc.Name
HAVING SUM(sod.LineTotal) > 50000;

--50
SELECT YEAR(OrderDate) AS OrderYear, MONTH(OrderDate) AS OrderMonth, COUNT(SalesOrderID) AS OrderCount
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
HAVING COUNT(SalesOrderID) > 50;

--51
SELECT Name, ListPrice
FROM SalesLT.Product
WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product);

--52
SELECT FirstName, LastName
FROM SalesLT.Customer
WHERE CustomerID IN (SELECT CustomerID FROM SalesLT.SalesOrderHeader WHERE YEAR(OrderDate) = 2008);

--53
SELECT pc.Name AS CategoryName, p.Name AS ProductName, p.ListPrice
FROM SalesLT.Product AS p
JOIN SalesLT.ProductCategory AS pc ON p.ProductCategoryID = pc.ProductCategoryID
WHERE p.ListPrice = (
    SELECT MAX(p2.ListPrice)
    FROM SalesLT.Product AS p2
    WHERE p2.ProductCategoryID = p.ProductCategoryID
);

--54
WITH CustomerTotal AS (
    SELECT CustomerID, SUM(TotalDue) AS TotalSpent
    FROM SalesLT.SalesOrderHeader
    GROUP BY CustomerID
)
SELECT c.FirstName, c.LastName, ct.TotalSpent
FROM CustomerTotal AS ct
JOIN SalesLT.Customer AS c ON ct.CustomerID = c.CustomerID
WHERE ct.TotalSpent > (SELECT AVG(TotalSpent) FROM CustomerTotal);

--55
SELECT Name
FROM SalesLT.Product
WHERE ProductID NOT IN (SELECT DISTINCT ProductID FROM SalesLT.SalesOrderDetail);

--56
SELECT SalesOrderID, TotalDue
FROM SalesLT.SalesOrderHeader
WHERE TotalDue > (SELECT AVG(TotalDue) FROM SalesLT.SalesOrderHeader);

--57
SELECT TOP 5 c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases
FROM SalesLT.Customer AS c
JOIN SalesLT.SalesOrderHeader AS soh ON c.CustomerID = soh.CustomerID
GROUP BY c.FirstName, c.LastName
ORDER BY TotalPurchases DESC;

--58
SELECT Name, ListPrice
FROM SalesLT.Product
WHERE ProductCategoryID = (
    SELECT TOP 1 ProductCategoryID
    FROM SalesLT.Product
    GROUP BY ProductCategoryID
    ORDER BY AVG(ListPrice) DESC
);

--59
SELECT c.FirstName, c.LastName, a.City
FROM SalesLT.Customer AS c
JOIN SalesLT.CustomerAddress AS ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address AS a ON ca.AddressID = a.AddressID
WHERE a.City IN (
    SELECT TOP 3 City
    FROM SalesLT.Address AS addr
    JOIN SalesLT.CustomerAddress AS custaddr ON addr.AddressID = custaddr.AddressID
    GROUP BY City
    ORDER BY COUNT(DISTINCT custaddr.CustomerID) DESC
);

--60
SELECT p1.Name, p1.ListPrice
FROM SalesLT.Product AS p1
WHERE p1.ListPrice > (
    SELECT AVG(p2.ListPrice)
    FROM SalesLT.Product AS p2
    WHERE p2.ProductCategoryID = p1.ProductCategoryID
);
