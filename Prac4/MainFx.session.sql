SELECT *
FROM PG_CATALOG.pg_tables
WHERE schemaname = 'public'
SELECT *
FROM banks
SELECT tablename
DELETE FROM feedback;
FROM PG_CATALOG.pg_tables
WHERE schemaname = 'public'
        AND EXISTS(
                SELECT table_name
                FROM information_schema.columns
                WHERE column_name = 'sector'
        )