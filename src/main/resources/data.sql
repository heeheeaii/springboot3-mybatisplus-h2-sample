-- Attempt to insert a user with id=1 if they don't already exist
INSERT INTO trees (id, name)
SELECT 1, 'Acacla'
WHERE NOT EXISTS (SELECT * FROM trees WHERE id = 1);

INSERT INTO trees (id, name)
SELECT 2, 'Hemlock'
WHERE NOT EXISTS (SELECT * FROM trees WHERE id = 2);
