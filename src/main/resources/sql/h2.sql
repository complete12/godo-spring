CREATE TABLE Board
(
    id integer NOT NULL,
    boardName varchar(255) NOT NULL,
    createdDate NOT timestamp,
    updatedDate timestamp,
    primary key(id)
);
CREATE TABLE Post
(
    id integer NOT NULL,
    boardId integer NOT NULL,
    title varchar(255) NOT NULL,
    writerName varchar(255) NOT NULL,
    writtenDate timestamp NOT NULL,
    updatedDate timestamp,
    views integer,
    primary key(id)
);