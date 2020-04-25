select h.hacker_id, h.name
  from submissions s
     , hackers h
     , challenges c
     , difficulty d
 where s.hacker_id = h.hacker_id
   and c.difficulty_level = d.difficulty_level
   and s.score = d.score
   and s.challenge_id = c.challenge_id
group by h.hacker_id, h.name
having count(*) > 1
order by count(*) desc, h.hacker_id;