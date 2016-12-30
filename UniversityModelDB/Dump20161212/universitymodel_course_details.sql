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
-- Table structure for table `course_details`
--

DROP TABLE IF EXISTS `course_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_details` (
  `COURSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COURSE_NAME` varchar(90) DEFAULT NULL,
  `COURSE_DESCRIPTION` varchar(90) DEFAULT NULL,
  `DEPARTMENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`COURSE_ID`),
  KEY `fk_depname` (`DEPARTMENT_ID`),
  CONSTRAINT `fk_depname` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_details`
--

LOCK TABLES `course_details` WRITE;
/*!40000 ALTER TABLE `course_details` DISABLE KEYS */;
INSERT INTO `course_details` VALUES (1,'Electrical Engineering','Power circuitry specialization',100),(2,'Social Science','Policis and international affairs',110),(3,'Civil Engineering','specialization in structural ',108),(4,'Arts','Painting specialization',104),(5,'Programming ','Fundamntals of comp ',101),(6,'Computer Engineering','VLSI Design',107),(7,'Anthropology','Anthropology',110),(8,' Media Journalism','Specialization in journalism',104),(9,'Marketing','Specialization in marketing analysis',103),(10,'Human resources','Human resource specialization',102),(11,'International Business','Understand international business',103),(12,'Information Technology','Technical knowledge in IT',101),(13,'Geographical Anaysis','Analyze geographical features  of countries',105),(14,'Business Analysis','Business analytics in corporate world',103),(15,'Structural Engineering','Specialized degree in structural engineering',108);
/*!40000 ALTER TABLE `course_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 23:35:49
