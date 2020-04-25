select t.max_earn, count(*) from employee e,
(select max(months*salary) max_earn from employee) t
where e.months*e.salary = t.max_earn
group by t.max_earn;