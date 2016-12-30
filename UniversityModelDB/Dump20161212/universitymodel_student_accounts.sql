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
-- Table structure for table `student_accounts`
--

DROP TABLE IF EXISTS `student_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_accounts` (
  `INVOICE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `STUDENT_ID` int(11) NOT NULL,
  `COURSE_ID` int(11) NOT NULL,
  `AMOUNT_PAID` varchar(20) NOT NULL,
  `DATE_PAID` datetime NOT NULL,
  PRIMARY KEY (`INVOICE_ID`),
  KEY `FOREIGN_KEY_STUDENT` (`STUDENT_ID`),
  KEY `FOREIGN_KEY_COURSE` (`COURSE_ID`),
  CONSTRAINT `FOREIGN_KEY_COURSE` FOREIGN KEY (`COURSE_ID`) REFERENCES `course_details` (`COURSE_ID`),
  CONSTRAINT `FOREIGN_KEY_STUDENT` FOREIGN KEY (`STUDENT_ID`) REFERENCES `student` (`STUDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5020 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_accounts`
--

LOCK TABLES `student_accounts` WRITE;
/*!40000 ALTER TABLE `student_accounts` DISABLE KEYS */;
INSERT INTO `student_accounts` VALUES (5000,1,2,'3000','2015-12-13 00:00:00'),(5001,2,2,'5000','2015-12-13 00:00:00'),(5002,3,4,'1500','2015-12-13 00:00:00'),(5003,4,7,'3000','2015-12-11 00:00:00'),(5004,7,9,'2500','2015-12-01 00:00:00'),(5005,12,2,'3000','2015-11-13 00:00:00'),(5006,11,2,'900','2015-10-02 00:00:00'),(5007,8,2,'1400','2015-12-13 00:00:00'),(5008,3,9,'1412','2015-12-13 00:00:00'),(5009,2,2,'5000','2015-12-13 00:00:00'),(5011,2,2,'5000','2015-12-13 00:00:00'),(5013,15,10,'1000','2015-12-01 00:00:00'),(5014,2,2,'5000','2015-12-13 00:00:00'),(5015,6,2,'1368','2015-12-14 00:00:00'),(5016,8,13,'3687','2015-10-05 00:00:00'),(5017,9,15,'1366','2015-11-18 00:00:00'),(5018,10,14,'1478','2015-11-11 00:00:00'),(5019,11,15,'557','2015-08-15 00:00:00');
/*!40000 ALTER TABLE `student_accounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 23:35:50
