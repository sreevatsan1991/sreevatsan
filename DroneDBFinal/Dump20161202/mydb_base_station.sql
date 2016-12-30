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
-- Table structure for table `base_station`
--

DROP TABLE IF EXISTS `base_station`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `base_station` (
  `Base_StationID` int(11) NOT NULL,
  `Power_Availability` tinyint(1) DEFAULT NULL,
  `Base_Station_bkup_Base_StationID` int(35) NOT NULL,
  `Interval_ID` int(11) NOT NULL,
  PRIMARY KEY (`Interval_ID`),
  KEY `fk_base_station_Base_Station_bkup1_idx` (`Base_Station_bkup_Base_StationID`),
  CONSTRAINT `fk_base_station_Base_Station_bkup1` FOREIGN KEY (`Base_Station_bkup_Base_StationID`) REFERENCES `base_station_bkup` (`Base_StationID_backup`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_patient_id` FOREIGN KEY (`Interval_ID`) REFERENCES `patient` (`Interval_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `base_station`
--

LOCK TABLES `base_station` WRITE;
/*!40000 ALTER TABLE `base_station` DISABLE KEYS */;
INSERT INTO `base_station` VALUES (1,1,2,2),(1,1,2,3),(1,1,2,4),(1,1,2,5),(1,1,2,6),(1,1,2,7),(1,1,2,8),(1,1,2,9),(1,1,2,10),(1,1,2,12),(1,1,2,13),(1,1,2,14),(1,1,2,15),(1,1,2,16),(1,1,2,17),(1,1,2,18),(1,1,2,19),(1,1,2,20),(1,1,2,21),(1,1,2,22),(1,1,2,23),(1,1,2,24),(1,1,2,25),(1,1,2,26),(1,1,2,27),(1,1,2,28),(1,1,2,29),(1,1,2,30);
/*!40000 ALTER TABLE `base_station` ENABLE KEYS */;
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
