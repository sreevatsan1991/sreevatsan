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
-- Temporary view structure for view `studentdetails2`
--

DROP TABLE IF EXISTS `studentdetails2`;
/*!50001 DROP VIEW IF EXISTS `studentdetails2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `studentdetails2` AS SELECT 
 1 AS `STUDENT_ID`,
 1 AS `STUDENT_FIRST_NAME`,
 1 AS `STUDENT_DOB`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `studentpayment`
--

DROP TABLE IF EXISTS `studentpayment`;
/*!50001 DROP VIEW IF EXISTS `studentpayment`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `studentpayment` AS SELECT 
 1 AS `STUDENT_ID`,
 1 AS `STUDENT_FIRST_NAME`,
 1 AS `STUDENT_PHONE`,
 1 AS `STUDENT_ADDRESS`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `studentdetails`
--

DROP TABLE IF EXISTS `studentdetails`;
/*!50001 DROP VIEW IF EXISTS `studentdetails`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `studentdetails` AS SELECT 
 1 AS `STUDENT_ID`,
 1 AS `STUDENT_FIRST_NAME`,
 1 AS `STUDENT_DOB`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `studentdetails2`
--

/*!50001 DROP VIEW IF EXISTS `studentdetails2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `studentdetails2` AS select `studentdetails`.`STUDENT_ID` AS `STUDENT_ID`,`studentdetails`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`studentdetails`.`STUDENT_DOB` AS `STUDENT_DOB` from `studentdetails` where (`studentdetails`.`STUDENT_FIRST_NAME` like 'j%') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `studentpayment`
--

/*!50001 DROP VIEW IF EXISTS `studentpayment`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `studentpayment` AS select `student`.`STUDENT_ID` AS `STUDENT_ID`,`student`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`student`.`STUDENT_PHONE` AS `STUDENT_PHONE`,`student`.`STUDENT_ADDRESS` AS `STUDENT_ADDRESS` from `student` where `student`.`STUDENT_ID` in (select `student_accounts`.`STUDENT_ID` from `student_accounts` where (`student_accounts`.`AMOUNT_PAID` > 3500)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `studentdetails`
--

/*!50001 DROP VIEW IF EXISTS `studentdetails`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `studentdetails` AS select `student`.`STUDENT_ID` AS `STUDENT_ID`,`student`.`STUDENT_FIRST_NAME` AS `STUDENT_FIRST_NAME`,`student`.`STUDENT_DOB` AS `STUDENT_DOB` from `student` group by `student`.`STUDENT_ID`,`student`.`STUDENT_FIRST_NAME`,`student`.`STUDENT_DOB` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping events for database 'universitymodel'
--

--
-- Dumping routines for database 'universitymodel'
--
/*!50003 DROP PROCEDURE IF EXISTS `Amount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Amount`(IN STUDENT_ID_2 int)
BEGIN

select STUDENT_ID, COURSE_ID,AMOUNT_PAID,DATE_PAID 
from
student_accounts where
STUDENT_ID in
 (SELECT STUDENT_ID from student_accounts where STUDENT_ID=STUDENT_ID_2);


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Location` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Location`(IN STUDENT_POSTAL_CODE2 varchar(100))
BEGIN

SELECT * FROM student where STUDENT_POSTAL_CODE = STUDENT_POSTAL_CODE2 ;

END ;;
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

-- Dump completed on 2016-12-12 23:35:50
