create database CSE_B2_423



CREATE TABLE DEPOSITE(
ACTNO INT,
CNAME VARCHAR(50),
BNAME VARCHAR(50),
AMOUNT DECIMAL(8,2),
ADATE DATETIME
)

INSERT INTO  DEPOSITE VALUES (101 ,'ANIL' ,'VRCE' ,1000.00 ,'01-MAR-1995'),
                             (102 ,'SUNIL' ,'AJNI' ,5000.00 ,'04-JAN-1996'),
                             (103 ,'MUHUL' ,'KAROLBAGH' ,3500.00 ,'17-NOV-1995'),
							 (104 ,'MADHURI' ,'CHANDI' ,1200.00 ,'17-DEC-1995'),
							 (105 ,'PRAMOD' ,'M.G.ROAD' ,3000.00 ,'27-MAR-1996'),
							 (106 ,'SANDIP' ,'ANDHERI' ,2000.00 ,'31-MAR-1996'),
							 (107 ,'SIVANI' ,'VIRAR' ,1000.00 ,'05-OCT-1995'),
							 (108 ,'KRANTI' ,'NEHRU PLACE ',5000.00 ,'02-JUL-1995'),
							 (109 ,'MINU' ,'POWAI' ,7000.00 ,'10-SEP-1995')

CREATE TABLE BRANCH(
BNAME VARCHAR(50),
CITY VARCHAR(50)
);

INSERT INTO BRANCH VALUES  
('VRCE' ,'NAGPUR'),
('AJNI' ,'NAGPUR'),
('KAROLBAGH' ,'DELHI'),
('CHANDI' ,'DELHI'),
('DHARAMPETH' ,'NAGPUR'),
('M.G. ROAD','BANGLORE'),
('ANDHERI' ,'BOMBAY'),
('VIRAR ','BOMBAY'),
('NEHRU' ,'PLACE DELHI'),
('POWAI' ,'BOMBAY')


CREATE TABLE CUSTOMERS(
CNAME VARCHAR(50),
CITY VARCHAR(50)
)

INSERT INTO CUSTOMERS VALUES  
('ANIL' ,'CALCUTTA'),
('SUNIL' ,'DILHI'),
('MEHUL' ,'BARODA'),
('MANDAR' ,'PATNA'),
('MADHURI' ,'NAGPUR'),
('PRAMOD','NAGPUR'),
('SANDIP' ,'SURAT'),
('SHIVANI ','BOMBAY'),
('KRANTI' ,'BOMBAY'),
('NAREN' ,'BOMBAY')

CREATE TABLE BORROW(
LOANNO INT,
CNAME VARCHAR(50),
BNAME VARCHAR(50),
AMOUNT DECIMAL(8,2)
);


INSERT INTO  BORROW VALUES

(201 ,'ANIL' ,'VRCE' ,1000.00 ),
 (206 ,'MUHUL' ,'AJNI' ,5000.00 ),
  (311 , 'SUNIL','DHARAMPETH' ,3000.00 ),
   (321 ,'MADHURI' ,'ANDHERI' ,2000.00 ),
	(375 ,'PRAMOD' ,'VIRAR' ,8000.00 ),
     (481 ,'KRANTI' ,'NEHRU PLACE' ,3000.00 )
	 


-- QUERIES LAB_2_PART_A

SELECT * FROM DEPOSITE
SELECT * FROM BORROW
SELECT * FROM CUSTOMERS
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE
SELECT LOANNO,AMOUNT FROM BORROW
SELECT * FROM BORROW WHERE BNAME='ANDHERI'
SELECT ACTNO,AMOUNT FROM DEPOSITE WHERE ACTNO=106
SELECT CNAME FROM BORROW WHERE AMOUNT>5000
SELECT CNAME FROM DEPOSITE WHERE ADATE>'01-DEC-1996'
SELECT CNAME FROM DEPOSITE WHERE ACTNO<105
SELECT CNAME FROM CUSTOMERS WHERE  CITY IN ('NAGPUR','DELHI')
SELECT CNAME,BNAME FROM DEPOSITE WHERE AMOUNT >4000 AND ACTNO<105
SELECT * FROM BORROW WHERE AMOUNT>=3000 AND AMOUNT<=8000
SELECT * FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000 -- SAME QUERIES AS ABOVE
SELECT * FROM DEPOSITE WHERE BNAME <> 'ANDHERI'
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE WHERE BNAME IN ('AJNI','KAROLBAGH','M.G. ROAD ') AND ACTNO<104



-- QUERIES LAB_2_PART_B

SELECT TOP 5 * FROM DEPOSITE
SELECT TOP 3 * FROM DEPOSITE WHERE AMOUNT>1000
SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME <> 'ANDHERI'
SELECT DISTINCT CITY FROM CUSTOMERS 
SELECT DISTINCT BNAME FROM BRANCH


-- QUERIES LAB_2_PART_C

SELECT TOP 50 PERCENT * FROM BORROW
SELECT TOP 10 PERCENT AMOUNT FROM DEPOSITE
SELECT TOP 25 PERCENT * FROM DEPOSITE WHERE AMOUNT>5000
SELECT TOP 10 PERCENT AMOUNT FROM BORROW
SELECT DISTINCT CNAME,CITY FROM CUSTOMERS
SELECT *, AMOUNT + (AMOUNT * 0.1)AS INCREMENTCOLUME FROM BORROW
SELECT LOANNO FROM BORROW WHERE  (LOANNO%2=0) -- FOR EVEN
SELECT LOANNO FROM BORROW WHERE  (LOANNO%2<>0) -- FOR ODD