DROP TABLE IF EXISTS membership_types; CREATE TABLE IF NOT EXISTS membership_types(id integer, name varchar); INSERT INTO membership_types(id, name) VALUES (0, 'Regular'), (1, 'Exceptional'), (2, 'Group Leader'); INSERT INTO member(id, name, join_date, membership_type, service_hours) VALUES (1, 'Lessie Herrera', '2015-04-21', 1, 411), (2, 'Burgess Alvarado', '2019-10-08', 0, 202), (3, 'Pate Ramsey', '2014-02-06', 1, 383), (4, 'Walton Gordon', '2019-10-26', 0, 202), (5, 'Ruiz Allison', '2018-04-21', 0, 80), (6, 'Mullen Henson', '2016-11-12', 1, 142), (7, 'Wall Johns', '2016-01-29', 0, 51), (8, 'Ruthie Hancock', '2015-11-06', 0, 1), (9, 'Fernandez Ramirez', '2017-11-25', 0, 289), (10, 'Ochoa Mclaughlin', '2015-08-22', 0, 161), (11, 'Rosemarie Walter', '2019-01-11', 0, 108), (12, 'Lauri Garrett', '2019-07-12', 0, 237), (13, 'Mcbride Maynard', '2015-01-30', 0, 0), (14, 'Ofelia Kirkland', '2017-07-23', 0, 286), (15, 'Johnson Sawyer', '2014-08-20', 1, 325), (16, 'Kaufman Lester', '2019-02-26', 1, 184), (17, 'Little Gilliam', '2018-09-26', 0, 259), (18, 'Hewitt Flores', '2019-10-11', 0, 11), (19, 'Pearl James', '2014-11-14', 0, 435), (20, 'Kristi Curry', '2018-03-30', 0, 224), (21, 'Jeanne Rowe', '2016-01-14', 2, 422), (22, 'Alston Contreras', '2015-06-11', 1, 125), (23, 'Faith Weeks', '2016-11-19', 0, 326), (24, 'Virginia Lopez', '2017-08-01', 0, 29), (25, 'Adrienne Mercado', '2015-10-22', 0, 62), (26, 'Judy Snyder', '2018-01-26', 0, 370), (27, 'Hester Mcleod', '2018-09-03', 0, 33), (28, 'Tabitha Slater', '2015-09-07', 0, 485), (29, 'Elaine Wise', '2014-01-28', 0, 310), (30, 'Melinda Powers', '2019-04-15', 0, 473);
