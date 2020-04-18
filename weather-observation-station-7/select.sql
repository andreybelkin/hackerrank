select distinct city
  from station
 where lower(substr(city, length(city))) in ('a', 'e', 'i', 'o', 'u');
