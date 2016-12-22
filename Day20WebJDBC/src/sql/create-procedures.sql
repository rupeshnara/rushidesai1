SELECT 'Dropping procedure SHOW_SUPPLIERS' AS ' '|
DROP PROCEDURE IF EXISTS SHOW_SUPPLIERS|

SELECT 'Dropping procedure GET_SUPPLIER_OF_COFFEE' AS ' '|
DROP PROCEDURE IF EXISTS GET_SUPPLIER_OF_COFFEE|

SELECT 'Dropping procedure RAISE_PRICE' AS ' '|
DROP PROCEDURE IF EXISTS RAISE_PRICE|


SELECT 'Creating procedure SHOW_SUPPLIERS' AS ' '|
CREATE PROCEDURE SHOW_SUPPLIERS()
  BEGIN
    SELECT
      SUPPLIERS.SUP_NAME,
      COFFEES.COF_NAME
    FROM SUPPLIERS, COFFEES
    WHERE SUPPLIERS.SUP_ID = COFFEES.SUP_ID
    ORDER BY SUP_NAME;
  END |

SELECT 'Creating procedure GET_SUPPLIER_OF_COFFEE' AS ' '|
CREATE PROCEDURE GET_SUPPLIER_OF_COFFEE(IN coffeeName VARCHAR(32), OUT supplierName VARCHAR(40))
  BEGIN
    SELECT SUPPLIERS.SUP_NAME
    INTO supplierName
    FROM SUPPLIERS, COFFEES
    WHERE SUPPLIERS.SUP_ID = COFFEES.SUP_ID
          AND coffeeName = COFFEES.COF_NAME;
    SELECT supplierName;
  END |

SELECT 'Creating procedure RAISE_PRICE' AS ' '|
CREATE PROCEDURE RAISE_PRICE(IN coffeeName VARCHAR(32), IN maximumPercentage FLOAT, INOUT newPrice NUMERIC(10, 2))
  BEGIN
      main: BEGIN
      DECLARE maximumNewPrice NUMERIC(10, 2);
      DECLARE oldPrice NUMERIC(10, 2);
      SELECT COFFEES.PRICE
      INTO oldPrice
      FROM COFFEES
      WHERE COFFEES.COF_NAME = coffeeName;
      SET maximumNewPrice = oldPrice * (1 + maximumPercentage);
      IF (newPrice > maximumNewPrice)
      THEN SET newPrice = maximumNewPrice;
      END IF;
      IF (newPrice <= oldPrice)
      THEN SET newPrice = oldPrice;
        LEAVE main;
      END IF;
      UPDATE COFFEES
      SET COFFEES.PRICE = newPrice
      WHERE COFFEES.COF_NAME = coffeeName;
      SELECT newPrice;
    END main;
  END |

SELECT 'Listing stored procedures ...' AS ' '|
SHOW PROCEDURE STATUS |