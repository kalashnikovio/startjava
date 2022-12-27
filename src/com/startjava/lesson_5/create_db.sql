DROP DATABASE IF EXISTS Jaegers;

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height INTEGER,
    weight INTEGER,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);