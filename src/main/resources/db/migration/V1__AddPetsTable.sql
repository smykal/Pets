CREATE TABLE pets
(
id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
name varchar(10),
type varchar(10),
indoor BOOLEAN DEFAULT TRUE
);
--##
--## Define the herd
--##
INSERT INTO pets (name, type)
VALUES ('tula', 'cat'),('ruby','dog'),('rosie','dog');
