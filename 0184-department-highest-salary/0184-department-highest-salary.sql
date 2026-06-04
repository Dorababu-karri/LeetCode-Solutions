# Write your MySQL query statement below
SELECT n1 as Department,n2 as Employee,salary as Salary 
FROM (
    SELECT d.name as n1,e.name as n2,e.salary,
    DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) dr
    From Employee e JOIN Department d on e.departmentId=d.id

) t where dr=1;
