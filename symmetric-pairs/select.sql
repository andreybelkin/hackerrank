select distinct t1.x, t1.y
  from functions t1
     , functions t2
 where t1.x = t2.y
   and t1.y = t2.x
   and t1.rowid != t2.rowid
   and t1.x <= t1.y
order by t1.x;