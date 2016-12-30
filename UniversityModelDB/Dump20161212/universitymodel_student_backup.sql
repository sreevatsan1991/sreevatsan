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
-- Table structure for table `student_backup`
--

DROP TABLE IF EXISTS `student_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_backup` (
  `STUDENT_ID` int(11) NOT NULL,
  `STUDENT_FIRST_NAME` varchar(20) NOT NULL,
  `STUDENT_LAST_NAME` varchar(20) NOT NULL,
  `STUDENT_PHONE` varchar(20) NOT NULL,
  `STUDENT_ADDRESS` varchar(100) DEFAULT NULL,
  `STUDENT_CITY` varchar(20) DEFAULT NULL,
  `STUDENT_STATE` varchar(20) DEFAULT NULL,
  `STUDENT_POSTAL_CODE` varchar(25) NOT NULL,
  `STUDENT_COUNTRY` varchar(20) DEFAULT NULL,
  `STUDENT_DOB` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_backup`
--

LOCK TABLES `student_backup` WRITE;
/*!40000 ALTER TABLE `student_backup` DISABLE KEYS */;
INSERT INTO `student_backup` VALUES (101,'Fitz','Maruice','567893','22 Bolyston hill','Boston','MA','0211S','US','1993-05-25'),(102,'Shawn','Scott','(529) 253-6985','Ficzed Manor','Puapetu','NC','79432','USA','5/21/1984');
/*!40000 ALTER TABLE `student_backup` ENABLE KEYS */;
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
