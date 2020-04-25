select sum(c.population)
  from city c
     , country co
 where c.countrycode = co.code
   and co.continent = 'Asia';