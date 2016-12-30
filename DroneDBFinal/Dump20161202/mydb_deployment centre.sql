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
-- Table structure for table `deployment centre`
--

DROP TABLE IF EXISTS `deployment centre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deployment centre` (
  `Deployment_CentreID` int(11) NOT NULL,
  `Drone_Capacity` int(11) DEFAULT NULL,
  `deployed_Drones` int(11) DEFAULT NULL,
  `min_x` int(11) DEFAULT NULL,
  `min_y` int(11) DEFAULT NULL,
  `max_x` int(11) DEFAULT NULL,
  `max_y` int(11) DEFAULT NULL,
  `base_station_record_ID` int(11) NOT NULL,
  `base_station_Base_Station_bkup_Base_StationID` int(11) NOT NULL,
  PRIMARY KEY (`Deployment_CentreID`,`base_station_record_ID`,`base_station_Base_Station_bkup_Base_StationID`),
  KEY `fk_deployment centre_base_station1_idx` (`base_station_record_ID`),
  CONSTRAINT `fk_deployment centre_base_station1` FOREIGN KEY (`base_station_record_ID`) REFERENCES `base_station` (`Interval_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deployment centre`
--

LOCK TABLES `deployment centre` WRITE;
/*!40000 ALTER TABLE `deployment centre` DISABLE KEYS */;
INSERT INTO `deployment centre` VALUES (1,5,0,0,0,200,200,2,2),(2,5,0,0,0,200,200,3,2),(3,5,0,0,0,200,200,4,2),(4,5,0,0,0,200,200,5,2);
/*!40000 ALTER TABLE `deployment centre` ENABLE KEYS */;
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
