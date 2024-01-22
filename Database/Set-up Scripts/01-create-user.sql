-- Drop user first if they exist
DROP USER if exists 'lkk'@'%' ;

-- Now create user with prop privileges
CREATE USER 'lkk'@'%' IDENTIFIED BY 'lkk';

GRANT ALL PRIVILEGES ON * . * TO 'lkk'@'%';