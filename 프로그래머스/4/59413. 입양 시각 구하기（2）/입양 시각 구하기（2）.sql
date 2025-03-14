WITH RECURSIVE hours AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1 FROM hours WHERE HOUR < 23
)
SELECT 
    h.HOUR, 
    IFNULL(COUNT(A.DATETIME), 0) AS COUNT
FROM hours h
LEFT JOIN ANIMAL_OUTS A ON h.HOUR = HOUR(A.DATETIME)
GROUP BY h.HOUR
ORDER BY h.HOUR;