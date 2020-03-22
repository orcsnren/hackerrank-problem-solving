SELECT
    CASE
      WHEN (A+B)<=C OR (A+C)<=B OR (B+C)<=A THEN 'Not A Triangle'
      WHEN A=B AND B=C THEN 'Equilateral'
      WHEN (A=B AND NOT A=C) OR (A=C AND NOT A=B) OR (B=C AND NOT B=A) THEN 'Isosceles'
      WHEN (NOT A=B AND NOT A=C AND NOT B=C) THEN 'Scalene'
END FROM TRIANGLES