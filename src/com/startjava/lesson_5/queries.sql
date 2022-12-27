SELECT * 
  FROM jaegers;

SELECT * 
  FROM jaegers 
  WHERE status NOT IN ('Destroyed');

SELECT * 
  FROM jaegers 
  WHERE mark IN ('Mark-1', 'Mark-2');

SELECT * 
  FROM jaegers 
  WHERE mark NOT IN ('Mark-1', 'Mark-2');

SELECT * 
  FROM jaegers 
  ORDER BY mark DESC;

SELECT * 
  FROM jaegers 
  WHERE launch = (SELECT MAX(launch) FROM jaegers);

SELECT * 
  FROM jaegers 
  WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

SELECT AVG(weight) 
  FROM jaegers;

UPDATE jaegers 
   SET kaijukill = kaijukill+1 
 WHERE status NOT IN ('Destroyed');

DELETE FROM jaegers 
      WHERE status IN ('Destroyed');