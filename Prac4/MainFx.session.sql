SELECT *
FROM PG_CATALOG.pg_tables
WHERE schemaname = 'public'
SELECT *
FROM education
SELECT tablename
FROM PG_CATALOG.pg_tables
WHERE schemaname = 'public'
        AND EXISTS(
                SELECT table_name
                FROM information_schema.columns
                WHERE column_name = 'sector'
        )