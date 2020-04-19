select distinct par.n, case when par.p is null then 'Root'
                            when chld.n is null then 'Leaf'
                       else 'Inner'
                       end
  from bst par,
       bst chld
 where par.n = chld.p(+)
 order by par.n;
