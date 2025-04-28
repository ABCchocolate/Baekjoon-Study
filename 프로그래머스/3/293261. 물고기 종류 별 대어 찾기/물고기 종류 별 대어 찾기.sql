SELECT   A1.ID
                 , C.FISH_NAME
                 , A1.LENGTH
   FROM  FISH_INFO A1
  INNER
    JOIN  (
              SELECT  FISH_TYPE
                              , MAX(LENGTH) AS MAX_LENGTH
                 FROM   FISH_INFO A2
               GROUP
                       BY   FISH_TYPE 
               ) B
        ON   A1.FISH_TYPE = B.FISH_TYPE
                 AND A1.LENGTH = B.MAX_LENGTH
    LEFT
    JOIN    FISH_NAME_INFO C
        ON   A1.FISH_TYPE = C.FISH_TYPE 
 ORDER
         BY  A1.ID ASC