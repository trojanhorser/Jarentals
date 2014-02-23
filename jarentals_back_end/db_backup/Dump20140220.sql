CREATE DATABASE  IF NOT EXISTS `jarentals` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jarentals`;
-- MySQL dump 10.13  Distrib 5.5.35, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: jarentals
-- ------------------------------------------------------
-- Server version	5.5.35-0ubuntu0.12.04.2

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
-- Table structure for table `role_priviledge_map`
--

DROP TABLE IF EXISTS `role_priviledge_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_priviledge_map` (
  `id` int(11) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `priviledge_id` varchar(45) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_priviledge_map`
--

LOCK TABLES `role_priviledge_map` WRITE;
/*!40000 ALTER TABLE `role_priviledge_map` DISABLE KEYS */;
INSERT INTO `role_priviledge_map` VALUES (1,100,'200','2014-02-20 01:30:01','2014-02-20 01:30:01'),(2,100,'201','2014-02-20 01:30:01','2014-02-20 01:30:01'),(3,100,'202','2014-02-20 01:30:01','2014-02-20 01:30:01'),(4,100,'203','2014-02-20 01:30:01','2014-02-20 01:30:01'),(5,100,'204','2014-02-20 01:30:01','2014-02-20 01:30:01'),(6,100,'205','2014-02-20 01:30:01','2014-02-20 01:30:01'),(7,100,'206','2014-02-20 01:30:01','2014-02-20 01:30:01'),(8,101,'200','2014-02-20 01:30:01','2014-02-20 01:30:01'),(9,101,'202','2014-02-20 01:30:01','2014-02-20 01:30:01'),(10,101,'203','2014-02-20 01:30:01','2014-02-20 01:30:01'),(11,101,'204','2014-02-20 01:30:01','2014-02-20 01:30:01'),(12,101,'205','2014-02-20 01:30:01','2014-02-20 01:30:01'),(13,101,'206','2014-02-20 01:30:01','2014-02-20 01:30:01');
/*!40000 ALTER TABLE `role_priviledge_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `priviledge`
--

DROP TABLE IF EXISTS `priviledge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `priviledge` (
  `id` int(11) NOT NULL,
  `short_name` varchar(30) DEFAULT NULL,
  `descritpion` varchar(45) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `priviledge`
--

LOCK TABLES `priviledge` WRITE;
/*!40000 ALTER TABLE `priviledge` DISABLE KEYS */;
INSERT INTO `priviledge` VALUES (200,'ADD_USER','Add a user','2014-02-20 01:30:01','2014-02-19 20:30:01'),(201,'REMOVE_USER','Remove a user','2014-02-20 01:30:40','2014-02-19 20:30:40'),(202,'UPDATE_USER','Update a user','2014-02-20 01:31:16','2014-02-19 20:31:16'),(203,'ADD_PLACE','Add a place','2014-02-20 01:31:46','2014-02-19 20:31:46'),(204,'REMOVE_PLACE','Remove a place','2014-02-20 01:32:22','2014-02-19 20:32:22'),(205,'UPDATE_PLACE','Update a place','2014-02-20 01:32:40','2014-02-19 20:32:40'),(206,'CREDENTIAL_RECOVERY','password reset and username recovery','2014-02-20 01:41:44','2014-02-19 20:41:44');
/*!40000 ALTER TABLE `priviledge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `place_status`
--

DROP TABLE IF EXISTS `place_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `place_status` (
  `id` int(11) NOT NULL,
  `short_name` varchar(10) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `place_status`
--

LOCK TABLES `place_status` WRITE;
/*!40000 ALTER TABLE `place_status` DISABLE KEYS */;
INSERT INTO `place_status` VALUES (100,'AVAILABLE','Place is ready for viewing and not yet rented','2014-02-20 01:47:06','2014-02-20 01:47:06'),(101,'RENTED','Place is rented and no longer available','2014-02-20 01:47:49','2014-02-20 01:47:49');
/*!40000 ALTER TABLE `place_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_type`
--

DROP TABLE IF EXISTS `contact_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact_type` (
  `id` int(11) NOT NULL,
  `short_name` varchar(30) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_type`
--

LOCK TABLES `contact_type` WRITE;
/*!40000 ALTER TABLE `contact_type` DISABLE KEYS */;
INSERT INTO `contact_type` VALUES (100,'SKYPE','Skype name','2014-02-20 01:50:17','2014-02-19 20:50:17'),(101,'FACEBOOK','Facebook homepage','2014-02-20 01:50:59','2014-02-19 20:50:59'),(103,'HOME_NUMBER','Home phone number','2014-02-20 01:51:29','2014-02-19 20:51:29'),(104,'EMAIL','Email address','2014-02-20 01:51:51','2014-02-19 20:51:51'),(105,'MOBILE_NUMBER','Mobile number','2014-02-20 01:50:17',NULL);
/*!40000 ALTER TABLE `contact_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DATABASECHANGELOGLOCK`
--

DROP TABLE IF EXISTS `DATABASECHANGELOGLOCK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOGLOCK` (
  `ID` int(11) NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOGLOCK`
--

LOCK TABLES `DATABASECHANGELOGLOCK` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOGLOCK` VALUES (1,'\0',NULL,NULL);
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `contact_type_id` int(11) DEFAULT NULL,
  `value` varchar(45) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_contact_1` (`contact_type_id`),
  CONSTRAINT `fk_contact_1` FOREIGN KEY (`contact_type_id`) REFERENCES `contact_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `place`
--

DROP TABLE IF EXISTS `place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `place` (
  `id` int(11) NOT NULL,
  `address_id` int(11) DEFAULT NULL,
  `contact_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `place_status_id` int(11) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_place_1` (`user_id`),
  KEY `fk_place_2` (`place_status_id`),
  KEY `fk_place_3` (`address_id`),
  KEY `fk_place_4` (`contact_id`),
  CONSTRAINT `fk_place_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_place_2` FOREIGN KEY (`place_status_id`) REFERENCES `place_status` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_place_3` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_place_4` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `place`
--

LOCK TABLES `place` WRITE;
/*!40000 ALTER TABLE `place` DISABLE KEYS */;
/*!40000 ALTER TABLE `place` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fb_id` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_User_1` (`role_id`),
  CONSTRAINT `fk_User_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `parish` varchar(45) DEFAULT NULL,
  `town` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `addresscol` varchar(45) DEFAULT NULL,
  `longitude` bigint(20) DEFAULT NULL,
  `latitude` bigint(20) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `short_name` varchar(10) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (100,'ADMIN','The admin user has all privilegdes, ','2014-02-20 01:25:08','2014-02-19 20:25:08'),(101,'USER','The privilede to perform CRUD on user and place ','2014-02-20 01:26:15','2014-02-19 20:26:15');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DATABASECHANGELOG`
--

DROP TABLE IF EXISTS `DATABASECHANGELOG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOG` (
  `ID` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int(11) NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOG`
--

LOCK TABLES `DATABASECHANGELOG` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOG` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOG` VALUES ('1392516838057-1','denisdbell (generated)','db_change_log_1.xml','2014-02-15 23:19:35',1,'EXECUTED','7:04d48b9ada2eb6e9b8c103a369a88201','createTable','',NULL,'3.1.1'),('1392516838057-1','denisdbell (generated)','change_logs/db_change_log_1.xml','2014-02-15 23:24:23',2,'EXECUTED','7:04d48b9ada2eb6e9b8c103a369a88201','createTable','',NULL,'3.1.1');
/*!40000 ALTER TABLE `DATABASECHANGELOG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `place_images`
--

DROP TABLE IF EXISTS `place_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `place_images` (
  `id` int(11) NOT NULL,
  `place_id` int(11) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  `created_when` timestamp NULL DEFAULT NULL,
  `updated_when` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_place_images_1` (`place_id`),
  CONSTRAINT `fk_place_images_1` FOREIGN KEY (`place_id`) REFERENCES `place` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `place_images`
--

LOCK TABLES `place_images` WRITE;
/*!40000 ALTER TABLE `place_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `place_images` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-02-20 20:12:04
