USE disney;

-- Inserts CHARACTERS

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (29, 89, 'Buzz Lightyear', 'www.disney.com/characters/images/1', 'Hacia el infinito y mas allá');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (19, 50, 'Elsa', 'www.disney.com/characters/images/2', 'La reina del hielo');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (32, 87, 'Forky', 'www.disney.com/characters/images/3', 'Un juguete muy peculiar');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (23, 80, 'Goofy', 'www.disney.com/characters/images/4', 'Reconocido por su icónica risa, es uno de los personajes icónicos de Disney');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (24, 74, 'Pato Donald', 'www.disney.com/characters/images/5', 'Pato blanco antropomórfico de ojos celestes, y pico, piernas y pies anaranjados. Es uno de los personajes icónicos de Disney');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (115, 10, 'Mickey Mouse', 'www.disney.com/characters/images/6', 'Ratón antropomórfico negro con la cara de color piel, tiene grandes ojos con iris azul negruzco, una cola larga y negra y un par de orejas redondas y grandes. Es uno de los personajes icónicos de Disney');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (56, 90, 'Hércules', 'www.disney.com/characters/images/7', 'Hijo de Zeus y Hera, secuestrado tras su nacimiento por Hades, que debe quitarlo de en medio para poder llevar a cabo su plan de conquistar el Olimpo. Su misión es convertirse en un héroe verdadero para poder regresar al monte Olimpo.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (45, 97, 'Pegasus', 'www.disney.com/characters/images/8', 'Basado en el animal mitológico del mismo nombre, Es el caballo alado de Hércules.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (89, 83, 'Las musas', 'www.disney.com/characters/images/9', 'Basadas en cinco de los nueve personajes mitológicos de las musas, Calliope, Melpomene, Terpsichore, Thalia y Clio, son las narradoras de la historia de la película Hércules.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (12, 45, 'Hades', 'www.disney.com/characters/images/10', 'El perverso Amo y Señor del Inframundo antagonista principal de la película Hércules.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (67, 77, 'Igor', 'www.disney.com/characters/images/11', 'Además de su personalidad triste, la cola de Igor es quizás su rasgo más definitorio.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (50, 63, 'Jessie', 'www.disney.com/characters/images/12', 'Es una vaquera de juguete basada en la antigua serie "El Rodeo de Woody". Antiguamente, permaneció a una niña llamada Emily, quien le abandonó en una caja, por lo que Jessie tiene claustrofobia.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (11, 34, 'Pinocho', 'www.disney.com/characters/images/13', 'Entero de madera, le crece su nariz, cuando miente.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (11, 30, 'Pluto', 'www.disney.com/characters/images/14', 'Perro fiel de Mickey Mouse');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (11, 40, 'Rapunzel', 'www.disney.com/characters/images/15', 'La chica de 70 pies de cabello dorado es una adolescente enérgica e inquisitiva que llena sus días de arte, libros e imaginación.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (29, 72, 'Rayo McQueen', 'www.disney.com/characters/images/16', 'Auto que habla.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (29, 66, 'Rex', 'www.disney.com/characters/images/17', 'Un juguete, con la forma de un tiranosaurio rex.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (50, 67, 'Simba', 'www.disney.com/characters/images/18', 'Hijo de Mufasa y Sarabi, Simba fue el siguiente a su padre en la línea para gobernar las Tierras del Reino.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (50, 78, 'Yoda', 'www.disney.com/characters/images/19', 'Enano verde que domina la fuerza.');

INSERT INTO characters (AGE, WEIGHT, CHARACTER_NAME, URL_IMAGE, CHARACTER_HISTORY) 
	VALUES (22, 59, 'Soldados imperiales', 'www.disney.com/characters/images/20', 'La Primera generación Stormtoopers fue creado en el Planeta Kamino hecho de clones de Jango Fett para combatir la Guerra de los Clones a favor de la Republica Galáctica.');

-- Inserts MOVIES/SERIES

INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Toy Story', '2004-10-10', 5, 'www.disney.com/movies-series/images/1');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Frozen', '2008-11-01', 0, 'www.disney.com/movies-series/images/2');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Hércules', '2020-12-10', 2, 'www.disney.com/movies-series/images/3');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Winnie the Pooh', '2001-02-10', 3, 'www.disney.com/movies-series/images/4');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Pinocho', '2000-03-07', 3, 'www.disney.com/movies-series/images/5');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Enredados', '2009-10-09', 4, 'www.disney.com/movies-series/images/6');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('El rey León', '2022-10-10', 4, 'www.disney.com/movies-series/images/7');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Star wars', '2011-11-01', 4, 'www.disney.com/movies-series/images/8');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Mickey Mouse', '2022-02-01', 1, 'www.disney.com/movies-series/images/9');
    
INSERT INTO movies_series (TITLE, CREATION_DATE, QUALIFICATION, URL_IMAGE) 
	VALUES ('Cars', '2020-07-12', 2, 'www.disney.com/movies-series/images/10');

-- Inserts GENRES

INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Terror', 'www.disney.com/genres/images/1');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Ciencia ficción', 'www.disney.com/genres/images/2');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Comedia', 'www.disney.com/genres/images/3');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Infantil', 'www.disney.com/genres/images/4');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Suspenso', 'www.disney.com/genres/images/5');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Drama', 'www.disney.com/genres/images/6');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Romance', 'www.disney.com/genres/images/7');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Tragedia', 'www.disney.com/genres/images/8');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Recuentos de la vida', 'www.disney.com/genres/images/9');
    
INSERT INTO genres (GENRE_NAME, URL_IMAGE) 
	VALUES ('Acción', 'www.disney.com/genres/images/10');
    
-- Inserts MOVIES_SERIES_GENRES

INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (3, 1);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (4, 1);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (6, 2);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (7, 2);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (10, 3);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (8, 3);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (2, 3);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (4, 4);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (2, 5);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (4, 5);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (7, 6);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (4, 6);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (2, 7);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (8, 7);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (2, 8);
    
INSERT INTO movies_series_genres (GENRE_ID, MOVIE_SERIE_ID) 
	VALUES (5, 8);
    
-- Inserts MOVIES_SERIES_CHARACTERS

INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (1, 1);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (2, 2);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (3, 1);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (4, 9);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (5, 9);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (6, 9);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (7, 3);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (8, 3);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (9, 3);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (10, 3);

INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (11, 4);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (12, 1);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (13, 5);

INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (14, 9);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (15, 6);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (16, 10);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (17, 1);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (18, 7);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (19, 8);
    
INSERT INTO movies_series_characters (CHARACTER_ID, MOVIE_SERIE_ID) 
	VALUES (20, 8);

-- Inserts ROLES

INSERT INTO roles (ROLE_NAME) 
	VALUES ('USER');

INSERT INTO roles (ROLE_NAME) 
	VALUES ('ADMIN');

-- Inserts USERS

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('leandro_deferrari', 'leandro@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('admin_admin', 'admin@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('usuario_usuario', 'usuario@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('florencia_flo', 'flor@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('lucia_gomez', 'lucia@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('carlos_ernesto', 'carlos@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('francisco_orlando', 'fran@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('sergio_torres', 'sergio@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('dora_lopez', 'dora@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('angie_estevanez', 'angie@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('julieta_russo', 'juli@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('lucas_gomez', 'lucas@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('federico_silas', 'federico@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('maximiliano_torres', 'maxi@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('javier_hidalgo', 'javi@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('romina_pampin', 'romi@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('ernesto_gavilan', 'ernesto@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('jazmin_tramontana', 'jazmin@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('pepe_tronalto', 'pepe@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1);
    
INSERT INTO users (USER_NAME, EMAIL, USER_PASSWORD, CREATION_DATE, UPDATE_DATE, SOFT_DELETE) 
	VALUES ('malena_sol', 'male@disney.com', '12345678', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 0);

-- Inserts USERS_ROLES

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 1);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (2, 2);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 3);

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 4);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 5);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 6);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (2, 7);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (2, 8);

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 9);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 10);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 11);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (2, 12);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 13);

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 14);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 15);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 16);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 17);
    
INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 18);

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (1, 19);

INSERT INTO users_roles (ROLE_ID, USER_ID) 
	VALUES (2, 20);