INSERT INTO user (id, username, password, name, email) VALUES (1, 'admin', '123456', '孙泽阳', 'isyl@qq.cn');
INSERT INTO user (id, username, password, name, email)  VALUES (2, 'sun', '123456', 'Way Lau', 'waylau@waylau.com');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 2);