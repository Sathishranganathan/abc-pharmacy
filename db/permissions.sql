INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('1','Sales','DO_SALES','Perform sales');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('2','Purachases','DO_PURCHASES','Perform purchases');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('3','Users','MANAGE_USERS','Manage users');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('4','Roles','MANAGE_ROLES','Manage roles');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('5','Customers','MANAGE_CUSTOMERS','Manage customers');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('6','Suppliers','MANAGE_SUPPLIERS','Manage suppliers');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('7','Products','MANAGE_PRODUCTS','Manage products');
INSERT INTO `permission` (`id`,`name`,`code`,`description`) VALUES ('8','Reports','GENERATE_REPORTS','Generate reports');

INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('218bf347-6d1a-4bb7-9bba-5db5f733a5df','2','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('277ba995-b3c3-4fc7-b130-c9f447e65e3f','6','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('35d94e25-cf6c-478f-b262-bdf7959a312c','7','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('7c030002-a253-4197-880a-766667308be1','1','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('8c21052a-69e6-412f-8148-3b03457990bd','5','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('f5cef6c1-4917-487e-9caf-2e20985d4b10','8','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('f8c7ece5-3922-4f6e-b038-43058e607122','3','fed1f586-6c91-46fc-a3c7-df867c811aca');
INSERT INTO `role_permission` (`id`,`permission_id`,`role_id`) VALUES ('fadb79ee-e1b5-482f-b0d7-58a4685b5dbb','4','fed1f586-6c91-46fc-a3c7-df867c811aca');

INSERT INTO `role` (`id`,`name`,`description`) VALUES ('fed1f586-6c91-46fc-a3c7-df867c811aca','ADMIN','Administrator role with all permissions.');

INSERT INTO `user_role` (`id`,`user_id`,`role_id`) VALUES ('aabb1444-c02a-4f93-838c-dcd28fbfa26b','2f82d26e-0a17-4d86-8620-3f83e1340c87','fed1f586-6c91-46fc-a3c7-df867c811aca');

INSERT INTO `user` (`id`,`first_name`,`last_name`,`userid`,`email`,`password`) VALUES ('2f82d26e-0a17-4d86-8620-3f83e1340c87','Administrator','','admin','admin@abc.com','5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8');
