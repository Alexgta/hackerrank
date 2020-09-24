MERGE INTO books_copy tgt
    USING books src
    ON (tgt.book_id = src.book_id)
WHEN MATCHED THEN
    UPDATE SET tgt.name = src.name
    WHEN NOT MATCHED THEN
INSERT VALUES (src.book_id, src.name);
