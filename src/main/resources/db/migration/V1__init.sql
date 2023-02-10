CREATE TABLE Actor (
    id bigint GENERATED ALWAYS AS IDENTITY,
    name varchar(255),
    last_name varchar(255),
    country varchar(255),
    PRIMARY KEY (id)
    );

CREATE TABLE Film (
    id bigint GENERATED ALWAYS AS IDENTITY,
    film_name varchar(255),
    imdb_ranking int,
    year int,
    duration_min int,
    description varchar(255),
    max_quality  varchar(255),

    PRIMARY KEY (id)
    );


