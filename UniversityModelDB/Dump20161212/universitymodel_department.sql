CREATE DATABASE  IF NOT EXISTS `universitymodel` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `universitymodel`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: universitymodel
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `DEPARTMENT_ID` int(11) NOT NULL,
  `DEPARTMENT_NAME` varchar(20) NOT NULL,
  `DEPARTMENT_HEAD` varchar(20) NOT NULL,
  `DEPARTMENT_LOCATION` varchar(20) NOT NULL,
  `DEPARTMENT_CONTACT` varchar(20) NOT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (100,'Engineering','Yasir','Finale','1-490-710-9763'),(101,'Computer Science','Cain','Snell','1-147-228-0466'),(102,'Human Resources','Warren','Bolyston','1-511-383-6367'),(103,'Management','Christian','Student Center','1-297-202-5712'),(104,'Science','Jameson','100 Huntington','1-222-677-0730'),(105,'Law Department','Erasmus','Forsyth','1-168-913-8031'),(106,'Physics','Ezra','Snell Engineering','1-985-687-5321'),(107,'Computer Engineering','Aidan','Funting road','1-591-737-7900'),(108,'Civil Engineering','Xanthus','Yahoo Street','1-659-431-7715'),(109,'Health Science','Gavin','Borland','1-186-122-2401'),(110,'Public Affairs','Raphael','Peterborough','1-145-562-8154'),(111,'Drug Regulatory','Carter','Yahoo Street','1-981-928-1407');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 23:35:48
