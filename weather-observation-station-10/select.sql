select distinct city
  from station
 where lower(substr(city, length(city))) not in ('a', 'e', 'i', 'o', 'u');
