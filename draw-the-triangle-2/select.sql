select trim(rpad('*', level*2, ' *'))
  from dual
connect by level <= 20
order by level;