CREATE DATABASE  IF NOT EXISTS `pharmacy` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pharmacy`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: pharmacy
-- ------------------------------------------------------
-- Server version	5.6.10

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('C00001','heshan perera','0771589459','112735895','112789456','hesh@gmail.com','21/3,terrence avenue,mount lavinia');
INSERT INTO `customer` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('C00002','udara','0771584977','112258745','114587896','udara@yahoo.com','47/2 galle road,bambalapitiya');
INSERT INTO `customer` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('C00003','thilina','0717258795','112588769','112987568','thilina@gmail.com','56,temple road,maharagama');
INSERT INTO `customer` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('C00004','ayesha','0725877458','112735671','112987568','ash@yahoo.com','56b, campus road, rattanapitiya');
INSERT INTO `customer` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('C00005','anura','0774855555','112577025','112578890','anura@gmail.com','345, katuwawala road, maharagama');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('1','Sales','DO_SALES','Perform sales');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('2','Purchases','DO_PURCHASES','Perform purchases');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('3','Users','MANAGE_USERS','Manage users');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('4','Roles','MANAGE_ROLES','Manage roles');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('5','Customers','MANAGE_CUSTOMERS','Manage customers');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('6','Suppliers','MANAGE_SUPPLIERS','Manage suppliers');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('7','Products','MANAGE_PRODUCTS','Manage products');
INSERT INTO `permission` (`id`, `name`, `code`, `description`) VALUES ('8','Reports','GENERATE_REPORTS','Generate reports');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`product_code`, `product_name`, `category`, `unit`, `reorder_level`) VALUES ('p123','terww','Capsule','g',100);
INSERT INTO `product` (`product_code`, `product_name`, `category`, `unit`, `reorder_level`) VALUES ('p457847','hyurue','Vaccine','packet',50);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`, `name`, `description`) VALUES ('aafd7f9f-6fbb-43ac-bcdb-5896670de0ab','admin','');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role_permission`
--

LOCK TABLES `role_permission` WRITE;
/*!40000 ALTER TABLE `role_permission` DISABLE KEYS */;
INSERT INTO `role_permission` (`id`, `permission_id`, `role_id`) VALUES ('11b3535b-3ed5-41e0-bf21-725091fa5367','3','aafd7f9f-6fbb-43ac-bcdb-5896670de0ab');
INSERT INTO `role_permission` (`id`, `permission_id`, `role_id`) VALUES ('bc97a80a-e6ad-4c07-940e-14c9957f6f53','1','aafd7f9f-6fbb-43ac-bcdb-5896670de0ab');
INSERT INTO `role_permission` (`id`, `permission_id`, `role_id`) VALUES ('e91f0ab4-f0c5-4a1a-81ed-73efff356efd','2','aafd7f9f-6fbb-43ac-bcdb-5896670de0ab');
INSERT INTO `role_permission` (`id`, `permission_id`, `role_id`) VALUES ('f5184154-b308-4b8b-831f-b9bc9b4b716a','4','aafd7f9f-6fbb-43ac-bcdb-5896670de0ab');
/*!40000 ALTER TABLE `role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('2ed08be3-a059-44e1-9b6c-d7da771af0d4','p457847','S00003',100,'2014-08-21 00:00:00',2.5);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('3aee48e5-6c50-4471-9045-d01b25adbcf0','p457847','S00003',400,'2014-08-23 00:00:00',2.25);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('5c9d664a-6154-4751-9a27-108c74210292','p457847','S00001',1000,'2014-08-31 00:00:00',22.5);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('68212904-daa7-46c8-a7af-74790f9e88c7','p123','S00003',100,'2013-12-31 00:00:00',10);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('8519da79-5fb2-460c-9b8a-503c87be8f74','p123','S00001',1000,'2014-08-31 00:00:00',12);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('e92d2cf4-5150-4a28-a461-cf94050b310b','p123','S00003',100,'2014-08-21 00:00:00',10);
INSERT INTO `stock` (`stock_id`, `product_code`, `supplier_id`, `quantity`, `exp_date`, `purchased_unit_price`) VALUES ('eb22b258-5be5-4ae4-940e-f124557354ae','p123','S00003',1000,'2014-08-23 00:00:00',10);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('S00001','nimal','0717584999','114587965','112587963','nimal@yahoo.com','21,3rd floor,raja building,pettha');
INSERT INTO `supplier` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('S00002','dharshan','0774589663','112587964','112876459','d_de@gmail.com','23,galle road,colombo 3');
INSERT INTO `supplier` (`id`, `name`, `mobile`, `home`, `office`, `email`, `address`) VALUES ('S00003','kalum','0758789878','112547896','112597846','kalum@gmail.lk','33,galle road,colombo 5');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` (`transaction_id`, `customer_id`, `supplier_id`, `date`, `total`, `transaction_type`, `payment_method`) VALUES ('60d88d86-d16d-4462-9f9b-68ee2a354bea',NULL,'S00003','2013-12-31 00:00:00',0,'PURCHASE','CASH');
INSERT INTO `transaction` (`transaction_id`, `customer_id`, `supplier_id`, `date`, `total`, `transaction_type`, `payment_method`) VALUES ('a1406f5a-ef4a-4fa4-982d-d5cad52ca7fd',NULL,'S00003','2014-08-21 00:00:00',0,'PURCHASE','CASH');
INSERT INTO `transaction` (`transaction_id`, `customer_id`, `supplier_id`, `date`, `total`, `transaction_type`, `payment_method`) VALUES ('aade682d-e767-44e4-87fd-bcc4e3e88cd7',NULL,'S00001','2014-08-31 00:00:00',0,'PURCHASE','CASH');
INSERT INTO `transaction` (`transaction_id`, `customer_id`, `supplier_id`, `date`, `total`, `transaction_type`, `payment_method`) VALUES ('d6ea38cf-7674-4949-9956-2ea575ead81f',NULL,'S00003','2014-08-23 00:00:00',0,'PURCHASE','CASH');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `transaction_detail`
--

LOCK TABLES `transaction_detail` WRITE;
/*!40000 ALTER TABLE `transaction_detail` DISABLE KEYS */;
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('3d63f48d-2250-47b7-aed8-330e06241c41','p123','d6ea38cf-7674-4949-9956-2ea575ead81f',10,NULL,'2015-03-31 00:00:00',1000);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('4091a72f-b5a4-4652-bc2f-d3b51e0895e5','p123','aade682d-e767-44e4-87fd-bcc4e3e88cd7',12,NULL,'2015-04-30 00:00:00',1000);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('6151599e-c941-444f-ac22-1a39768a3b42','p457847','d6ea38cf-7674-4949-9956-2ea575ead81f',2.25,NULL,'2015-04-30 00:00:00',400);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('6d72d81e-b392-4bfe-a1d9-d8440b5bea0e','p123','a1406f5a-ef4a-4fa4-982d-d5cad52ca7fd',10,NULL,'2015-02-27 00:00:00',100);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('6ece929f-7b1f-409b-90a6-9bdb4d6a1ce4','p457847','aade682d-e767-44e4-87fd-bcc4e3e88cd7',22.5,NULL,'2015-05-31 00:00:00',1000);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('7010e0e0-959d-4371-870f-20c930860783','p123','60d88d86-d16d-4462-9f9b-68ee2a354bea',10,NULL,'2015-01-31 00:00:00',100);
INSERT INTO `transaction_detail` (`transaction_detail_id`, `product_code`, `transaction_id`, `unit_price`, `discount`, `exp_date`, `quantity`) VALUES ('c5ddf0f1-0986-4bc2-89ac-8a8f31f5c1a8','p457847','a1406f5a-ef4a-4fa4-982d-d5cad52ca7fd',2.5,NULL,'2015-05-27 00:00:00',100);
/*!40000 ALTER TABLE `transaction_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `first_name`, `last_name`, `userid`, `email`, `password`) VALUES ('232233','ggg','hhhh','kkkk','iui',NULL);
INSERT INTO `user` (`id`, `first_name`, `last_name`, `userid`, `email`, `password`) VALUES ('4545','yuy','fgfg','sdff','errer',NULL);
INSERT INTO `user` (`id`, `first_name`, `last_name`, `userid`, `email`, `password`) VALUES ('660a3cf0-9f8d-44ac-9181-72de9ef8f559','gg','eeee','qqqq','uiui',NULL);
INSERT INTO `user` (`id`, `first_name`, `last_name`, `userid`, `email`, `password`) VALUES ('fe70ee56-3577-46e0-857a-0865eb2d956c','qwqw','qwqww','admin','','d74ff0ee8da3b9806b18c877dbf29bbde50b5bd8e4dad7a3a725000feb82e8f1');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`id`, `user_id`, `role_id`) VALUES ('89da72ab-0402-4a9f-8041-8edab4221c72','fe70ee56-3577-46e0-857a-0865eb2d956c','aafd7f9f-6fbb-43ac-bcdb-5896670de0ab');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-08-23 15:03:43
