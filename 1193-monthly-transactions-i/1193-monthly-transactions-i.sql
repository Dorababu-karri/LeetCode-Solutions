# Write your MySQL query statement below
-- IF(condition, value_if_true, value_if_false)
SELECT 
    DATE_FORMAT(trans_date,'%Y-%m') As month,
    country,
    COUNT(ID) as trans_count,
    COUNT(IF(state="approved",1,NULL)) as approved_count,
    SUM(amount) as trans_total_amount ,
    SUM(IF(state="approved",amount,0)) as approved_total_amount
FROM Transactions
GROUP BY month,country;
