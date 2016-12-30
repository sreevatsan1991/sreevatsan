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
-- Table structure for table `defibillirator`
--

DROP TABLE IF EXISTS `defibillirator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `defibillirator` (
  `Drone_ID` int(30) NOT NULL,
  `Energy` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Time_Required` int(11) DEFAULT NULL,
  `Completion` tinyint(1) DEFAULT NULL,
  `base_station_interval_ID` int(11) NOT NULL,
  KEY `Drone_ID_idx` (`Drone_ID`),
  KEY `fk_defibillirator_base_station1_idx` (`base_station_interval_ID`),
  CONSTRAINT `FK_Defibillirator` FOREIGN KEY (`Drone_ID`) REFERENCES `drone` (`Drone_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_defibillirator_base_station1` FOREIGN KEY (`base_station_interval_ID`) REFERENCES `base_station` (`Interval_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defibillirator`
--

LOCK TABLES `defibillirator` WRITE;
/*!40000 ALTER TABLE `defibillirator` DISABLE KEYS */;
INSERT INTO `defibillirator` VALUES (1,200,1,10,0,22),(2,130,2,13,0,2),(3,140,3,18,0,3),(4,116,1,25,0,4),(5,158,3,14,0,5),(6,146,2,16,0,6),(7,196,2,12,0,7),(8,167,3,18,0,8),(9,175,2,16,0,9),(10,116,3,19,0,10);
/*!40000 ALTER TABLE `defibillirator` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-02 19:45:39
