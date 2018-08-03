INSERT INTO `user` (id, name, password) VALUES (1, 'John Smith', '111');
INSERT INTO `user` (id, name, password) VALUES (2, 'Jone Doe', '111');

INSERT INTO `poll_subject` (id, user_id, subject, expiration_time) VALUES (1, 1, '哪个小鲜肉最帅？', '2017-08-05 16:07:56');
INSERT INTO `poll_subject` (id, user_id, subject, expiration_time) VALUES (2, 2, '哪家的汉堡好吃？', NOW());

INSERT INTO `sub_item` (id, subject_id, description, number) VALUES (1, 1, '鹿晗', 0);
INSERT INTO `sub_item` (id, subject_id, description, number) VALUES (2, 1, '吴亦凡', 0);
INSERT INTO `sub_item` (id, subject_id, description, number) VALUES (3, 2, 'KFC', 0);
INSERT INTO `sub_item` (id, subject_id, description, number) VALUES (4, 2, 'McDonald''s', 0);

INSERT INTO `poll_history` (id, user_id, subject_id, sub_item_id, date, ip) VALUES (1, 1, 1, 1, '2017-08-05 21:07:56', '192.168.1.1');
INSERT INTO `poll_history` (id, user_id, subject_id, sub_item_id, date, ip) VALUES (2, 2, 1, 1, '2017-08-05 22:07:56', '192.168.1.2');
INSERT INTO `poll_history` (id, user_id, subject_id, sub_item_id, date, ip) VALUES (3, 1, 2, 3, NOW(), '192.168.1.2');
INSERT INTO `poll_history` (id, user_id, subject_id, sub_item_id, date, ip) VALUES (4, 2, 2, 4, NOW(), '192.168.1.5');

