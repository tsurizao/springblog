use springblog_db;

SELECT *
FROM posts;

SELECT *
FROM users;

DELETE FROM posts WHERE id = '28';

INSERT INTO users (id, email, password, username)
VALUES (1, 'bob@bobmail.com', 'bob', 'bob');

insert into posts (title, body, user_id)
values ('Kirk''s dik dik', 'tristique est et tempus semper est quam pharetra magna ac', 1);
insert into posts (title, body, user_id)
values ('Mountain lion',
        'tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis nulla neque libero convallis eget',
        1);
insert into posts (title, body, user_id)
values ('Goose, spur-winged', 'orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur', 1);
insert into posts (title, body, user_id)
values ('Striped dolphin',
        'integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent',
        1);
insert into posts (title, body, user_id)
values ('Pheasant, ring-necked', 'vel augue vestibulum rutrum rutrum neque aenean auctor gravida sem', 1);
insert into posts (title, body, user_id)
values ('Brush-tailed phascogale',
        'sollicitudin mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui',
        1);
insert into posts (title, body, user_id)
values ('Tyrant flycatcher',
        'vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis',
        1);
insert into posts (title, body, user_id)
values ('Kangaroo, black-faced',
        'duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla rhoncus', 1);
insert into posts (title, body, user_id)
values ('Common wolf', 'eu mi nulla ac enim in tempor turpis nec euismod scelerisque quam turpis', 1);
insert into posts (title, body, user_id)
values ('Gull, lava', 'nisi volutpat eleifend donec ut dolor morbi vel lectus in quam fringilla', 1);
insert into posts (title, body, user_id)
values ('Two-toed sloth', 'sit amet diam in magna bibendum imperdiet nullam orci pede venenatis', 1);
insert into posts (title, body, user_id)
values ('Stanley crane',
        'nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam', 1);
insert into posts (title, body, user_id)
values ('Orca',
        'metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae mauris viverra diam',
        1);
insert into posts (title, body, user_id)
values ('Leadbeateri''s ground hornbill', 'consequat morbi a ipsum integer a nibh in quis justo', 1);
insert into posts (title, body, user_id)
values ('Indian red admiral',
        'maecenas leo odio condimentum id luctus nec molestie sed justo pellentesque viverra pede ac diam cras pellentesque volutpat',
        1);
insert into posts (title, body, user_id)
values ('Cormorant, javanese',
        'turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis',
        1);
insert into posts (title, body, user_id)
values ('Long-tailed jaeger',
        'amet sem fusce consequat nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit',
        1);
insert into posts (title, body, user_id)
values ('Bat, asian false vampire',
        'nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac',
        1);
insert into posts (title, body, user_id)
values ('Silver-backed jackal',
        'faucibus accumsan odio curabitur convallis duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel lectus in quam',
        1);
insert into posts (title, body, user_id)
values ('Swan, black',
        'sapien urna pretium nisl ut volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis',
        1);