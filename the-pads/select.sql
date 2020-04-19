select name || '(' || case
        when occupation = 'Doctor' then 'D)'
        when occupation = 'Singer' then 'S)'
        when occupation = 'Actor' then 'A)'
        when occupation = 'Professor' then 'P)'
        end
  from occupations
 order by name;
  
select 'There are a total of ' || count(*) || ' ' || lower(occupation) || 's.'
  from occupations
 group by occupation
 order by count(*), occupation;
