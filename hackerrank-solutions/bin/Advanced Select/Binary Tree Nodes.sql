SELECT N, CASE WHEN P is NULL THEN 'Root' 
               ELSE CASE WHEN N IN (SELECT P FROM BST ) THEN 'Inner'           
                         ELSE 'Leaf' END
          END FROM BST ORDER BY N ASC;
