select co.continent, floor(avg(c.population))
  from city c
     , country co
 where c.countrycode = co.code
group by co.continent;