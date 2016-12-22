SELECT 'Dropping procedure SHOW_SUPPLIERS' AS ' ';

DROP PROCEDURE IF EXISTS SHOW_SUPPLIERS;

SELECT 'Changing delimiter to pipe' AS ' ';

DELIMITER |

SELECT 'Creating procedure SHOW_SUPPLIERS' AS ' '|

CREATE PROCEDURE SHOW_SUPPLIERS()
  BEGIN
    SELECT
      SUPPLIERS.SUP_NAME,
      COFFEES.COF_NAME
    FROM SUPPLIERS, COFFEES
    WHERE SUPPLIERS.SUP_ID = COFFEES.SUP_ID
    ORDER BY SUP_NAME;
  END|

DELIMITER ;