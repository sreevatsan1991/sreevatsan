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
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty` (
  `FACULTY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FACULTY_NAME` varchar(20) NOT NULL,
  `FACULTY_GENDER` varchar(20) NOT NULL,
  `FACULTY_SPECIALIZATION` varchar(20) NOT NULL,
  `FACULTY_CONTACT` varchar(20) NOT NULL,
  `DEPARTMENT_ID` int(11) NOT NULL,
  `DEPARTMENT_NAME` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`FACULTY_ID`),
  KEY `fk2_depname` (`DEPARTMENT_ID`),
  KEY `FacultyIndexing` (`FACULTY_ID`),
  CONSTRAINT `fk2_depname` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=727 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (700,'Kelly','Male','History','1-132-275-9583',100,NULL),(701,'Emery','Female','Mathematics','1-415-640-2729',102,NULL),(703,'Liberty','Female','Management','1-408-596-8524',101,NULL),(704,'Alika','Female','Computer Science','1-596-782-4903',106,NULL),(705,'Callie','Female','Science','1-168-525-0199',100,NULL),(706,'Ciara','Male','Anthropology','1-263-440-5565',109,NULL),(707,'Scarlett','Female','Management','1-891-542-2496',101,NULL),(708,'Nolan','Male','Computer Science','1-930-591-7188',111,NULL),(709,'Kalia','Female','Mathematics','1-963-980-2593',100,NULL),(710,'Paki','Female','History','1-534-466-7319',100,NULL),(711,'Callie','Female','Management','1-759-149-8163',103,NULL),(713,'Plato','Male','Management','1-439-640-8381',110,NULL),(714,'Lamar','Male','History','1-289-960-6829',100,NULL),(715,'Brielle','Female','Anthropology','1-500-164-7283',100,NULL),(716,'Nolan','Male','History','1-291-625-2109',110,NULL),(717,'Buffy','Male','History','1-201-861-2757',108,NULL),(718,'Nita','Female','Civil','1-957-944-2260',100,NULL),(719,'Colt','Male','Civil','1-553-511-7056',110,NULL),(720,'Keely','Female','History','1-942-703-4429',100,NULL),(721,'Jael','Female','Science','1-108-372-9887',101,NULL),(722,'Seth','Female','Science','1-621-356-1707',105,NULL),(723,'Bevis','Female','Mathematics','1-981-279-5765',100,NULL),(724,'Silas','Female','Science','1-669-500-9715',104,NULL),(725,'Adele','Female','Mathematics','1-143-638-0401',100,NULL),(726,'Keefe','Female','Science','1-352-623-9034',102,NULL);
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger faculty_backup
 
 

after delete
 on faculty
 for each row
 insert into faculty_backup
(FACULTY_ID,FACULTY_NAME,FACULTY_GENDER,FACULTY_SPECIALIZATION,FACULTY_CONTACT,DEPARTMENT_id) 
values
(old.FACULTY_ID,old.FACULTY_NAME,old.FACULTY_GENDER,old.FACULTY_SPECIALIZATION,old.FACULTY_CONTACT,old.DEPARTMENT_id) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 23:35:49
