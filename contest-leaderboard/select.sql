select h.hacker_id
     , h.name
     , sum(max_score)
  from hackers h
     , (select hacker_id
             , challenge_id
             , max(score) max_score
          from submissions
        group by hacker_id, challenge_id) t
 where h.hacker_id = t.hacker_id
group by h.hacker_id, h.name
having sum(max_score) > 0
order by sum(max_score) desc, h.hacker_id;