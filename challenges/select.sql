select h.hacker_id
     , h.name
     , count(*) c_count
  from hackers h
     , challenges c
 where h.hacker_id = c.hacker_id
group by h.hacker_id, h.name
having (count(*) = 
        (select max(count(*)) as cnt
             from challenges
             group by hacker_id))
    or count(*) in 
        (select t.cnt
         from (select count(*) as cnt 
               from challenges
               group by hacker_id) t
         group by t.cnt
        having count(t.cnt) = 1)
order by count(*) desc, h.hacker_id;