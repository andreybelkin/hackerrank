select c.name
  from city c
     , country co
 where c.countrycode = co.code
   and co.continent = 'Africa';