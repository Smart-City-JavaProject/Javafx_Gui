SELECT b_address
FROM banks
WHERE b_locality = 'Nerul';
ALTER TABLE banks
ADD COLUMN sector VARCHAR(50) DEFAULT '15';
SELECT *
FROM pg_catalog.pg_tables
WHERE schemaname = 'public';
SELECT *
FROM mall;
SELECT *
from cinema;
ALTER TABLE cinema
ADD COLUMN sector VARCHAR(50) DEFAULT '15';