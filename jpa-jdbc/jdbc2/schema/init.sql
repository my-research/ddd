CREATE TABLE IF NOT EXISTS users
(
    id BIGINT PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    info json NOT NULL,

    version INT NOT NULL
);