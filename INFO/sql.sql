CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);



INSERT INTO users (firstName, lastName, email) VALUES
  ('John', 'Doe', 'john.doe@example.com'),
  ('Jane', 'Smith', 'jane.smith@example.com'),
  ('Bob', 'Johnson', 'bob.johnson@example.com'),
  ('Alice', 'Williams', 'alice.williams@example.com');


