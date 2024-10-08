-- 코드를 입력하세요
SELECT PRODUCT_CODE
      ,SUM(PRICE * SALES_AMOUNT) AS SALES
FROM PRODUCT A, OFFLINE_SALE B
WHERE A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE;