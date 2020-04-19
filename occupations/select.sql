select * from
  (select min(doctor) d, min(professor) p, min(singer) s, min(actor) a
    from (SELECT CASE WHEN occupation = 'Doctor' THEN name END AS Doctor,
                 CASE WHEN occupation = 'Professor' THEN name END AS Professor,
                 CASE WHEN occupation = 'Singer' THEN name END AS Singer,
                 CASE WHEN occupation = 'Actor' THEN name END AS Actor,
                 RANK() OVER (PARTITION BY Occupation order by name) AS row_rank
            FROM occupations) x
    group by row_rank)
 order by d, p, s, a;
