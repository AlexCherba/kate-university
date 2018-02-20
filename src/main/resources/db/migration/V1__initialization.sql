--CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE university (
  id uuid PRIMARY KEY,
  name VARCHAR(100),
  description VARCHAR(255),
  phone VARCHAR(100),
  email VARCHAR(100),
  address VARCHAR(255)
);