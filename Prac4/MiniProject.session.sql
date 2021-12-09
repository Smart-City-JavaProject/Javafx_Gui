SELECT *
FROM PG_CATALOG.pg_tables
WHERE schemaname = 'public';
SELECT *
FROM bus
SELECT *
FROM flight
SELECT *
FROM train
ALTER TABLE education
ADD COLUMN sector VARCHAR(20) DEFAULT '15';