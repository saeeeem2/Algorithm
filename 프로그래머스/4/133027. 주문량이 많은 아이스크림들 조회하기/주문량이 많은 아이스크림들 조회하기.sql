-- 코드를 입력하세요
SELECT J.FLAVOR
FROM  FIRST_HALF FH, JULY J 
WHERE FH.FLAVOR=J.FLAVOR
GROUP BY FLAVOR
HAVING SUM(J.TOTAL_ORDER)+SUM(FH.TOTAL_ORDER)
ORDER BY SUM(J.TOTAL_ORDER)+SUM(FH.TOTAL_ORDER) DESC LIMIT 3;