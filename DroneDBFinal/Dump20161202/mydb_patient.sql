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
-- Table structure for table `patient`
--
use mydb;
DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `Patient_ID` int(11) NOT NULL,
  `Interval_Id` int(11) NOT NULL,
  `Person_ID` int(80) DEFAULT NULL,
  `Location_ID` int(80) DEFAULT NULL,
  `Heart_Rate` int(80) DEFAULT NULL,
  `Emergency_Contact_Number` varchar(45) DEFAULT NULL,
  `TIme_Stamp` datetime DEFAULT CURRENT_TIMESTAMP,
  `Ref_heart_data_Id` int(11) NOT NULL,
  PRIMARY KEY (`Interval_Id`),
  KEY `Person_ID_idx` (`Person_ID`),
  KEY `Location_ID_idx` (`Location_ID`),
  KEY `fk_patient_Ref_heart_data1_idx` (`Ref_heart_data_Id`),
  CONSTRAINT `fk_Location_ID` FOREIGN KEY (`Location_ID`) REFERENCES `location` (`Location_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Person_ID` FOREIGN KEY (`Person_ID`) REFERENCES `person_data` (`Person_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_patient_Ref_heart_data1` FOREIGN KEY (`Ref_heart_data_Id`) REFERENCES `ref_heart_data` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 1, 2, 1, 72, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 2, 2, 1, 75, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 3, 2, 1, 78, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 4, 2, 1, 81, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 5, 2, 1, 84, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 6, 2, 1, 87, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 7, 2, 1, 90, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 8, 2, 1, 93, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 9, 2, 1, 96, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (1, 10, 2, 1, 74, '1234', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 11, 3, 2, 78, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 12, 3, 2, 82, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 13, 3, 2, 86, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 14, 3, 2, 90, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 15, 3, 2, 94, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 16, 3, 2, 98, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 17, 3, 2, 102, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 18, 3, 2, 106, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 19, 3, 2, 110, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (2, 20, 3, 2, 114, '4567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 21, 4, 3, 68, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 22, 4, 3, 72, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 23, 4, 3, 76, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 24, 4, 3, 80, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 25, 4, 3, 84, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 26, 4, 3, 88, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 27, 4, 3, 92, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 28, 4, 3, 96, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 29, 4, 3, 100, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (3, 30, 4, 3, 104, '7567', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 31, 5, 4, 76, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 32, 5, 4, 80, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 33, 5, 4, 84, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 34, 5, 4, 88, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 35, 5, 4, 92, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 36, 5, 4, 96, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 37, 5, 4, 100, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 38, 5, 4, 104, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 39, 5, 4, 108, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (4, 40, 5, 4, 112, '6545', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 41, 6, 5, 81, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 42, 6, 5, 84, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 43, 6, 5, 87, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 44, 6, 5, 90, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 45, 6, 5, 93, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 46, 6, 5, 96, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 47, 6, 5, 99, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 48, 6, 5, 102, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 49, 6, 5, 105, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (5, 50, 6, 5, 108, '5432', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 51, 7, 6, 71, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 52, 7, 6, 73, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 53, 7, 6, 75, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 54, 7, 6, 77, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 55, 7, 6, 79, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 56, 7, 6, 81, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 57, 7, 6, 83, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 58, 7, 6, 85, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 59, 7, 6, 87, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (6, 60, 7, 6, 89, '5676', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 61, 8, 7, 71, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 62, 8, 7, 68, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 63, 8, 7, 65, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 64, 8, 7, 62, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 65, 8, 7, 59, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 66, 8, 7, 56, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 67, 8, 7, 53, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 68, 8, 7, 50, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 69, 8, 7, 47, '6554', now(), 1);
INSERT INTO `mydb`.`patient` (`Patient_ID`, `Interval_Id`, `Person_ID`, `Location_ID`, `Heart_Rate`, `Emergency_Contact_Number`, `TIme_Stamp`, `Ref_heart_data_Id`) VALUES (7, 70, 8, 7, 44, '6554', now(), 1);

/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
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
