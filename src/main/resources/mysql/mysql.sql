/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.5.40 : Database - spring
*********************************************************************
*/

CREATE DATABASE `spring` ;

USE `spring`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `money` double(8,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `account` */

insert  into `account`(`id`,`name`,`money`) values (1,'aaa',50000.00),(2,'bbb',50000.00),(3,'zhangsan',50000.00),(4,'lisi',50000.00);

