-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
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
-- Table structure for table `person_medicalrecords`
--

DROP TABLE IF EXISTS `person_medicalrecords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person_medicalrecords` (
  `Person_ID` int(30) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Heart rate` int(11) DEFAULT NULL,
  `Pre-ExistingDiseases` varchar(545) DEFAULT NULL,
  `Department_ID` int(11) NOT NULL,
  PRIMARY KEY (`Person_ID`),
  KEY `Department_ID_idx` (`Department_ID`),
  KEY `Person_ID_idx` (`Person_ID`),
  CONSTRAINT `FK_Person_MedicalRecords_Dept_ID` FOREIGN KEY (`Department_ID`) REFERENCES `healthcare_departments` (`Department_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Person_MedicalRecords_Person_ID` FOREIGN KEY (`Person_ID`) REFERENCES `person_data` (`Person_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_medicalrecords`
--

LOCK TABLES `person_medicalrecords` WRITE;
/*!40000 ALTER TABLE `person_medicalrecords` DISABLE KEYS */;
INSERT INTO `person_medicalrecords` VALUES (1,'Etta Romero',96,'Yes',1),(2,'Manuel Schmidt',72,'No',2),(3,'Lucas Sanchez',78,'Yes',3),(4,'Cora Robinson',76,'No',4),(5,'Roy Buchanan',75,'Yes',5),(6,'Sylvia Stokes',69,'Yes',1),(7,'Francis Patrick',82,'No',2),(8,'Donald Lopez',80,'Yes',3),(9,'Bill Reese',77,'No',4),(10,'Aaron Baldwin',91,'Yes',5),(11,'Victor Stokes',87,'Yes',1),(12,'Adeline Knight',89,'No',2),(13,'Elnora Pearson',71,'Yes',3),(14,'Bradley McLaughlin',67,'No',4),(15,'Belle Alexander',70,'Yes',5),(16,'Sam',87,'Yes',1),(17,'rick',76,'No',2),(18,'Donald ',75,'Yes',3),(19,'John',75,'No',4),(20,'Kerry',74,'Yes',5),(21,'Marco',73,'Yes',1),(22,'Bobby',76,'No',2),(23,'Paul',74,'Yes',3),(24,'Arnold',75,'No',4),(25,'Ted',74,'Yes',5),(26,'Lindsey',75,'Yes',1),(27,'Shally',75,'No',2),(28,'sarthak',75,'Yes',3),(29,'rajat',75,'No',4),(30,'arun',73,'Yes',5);
/*!40000 ALTER TABLE `person_medicalrecords` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-02 19:45:40
