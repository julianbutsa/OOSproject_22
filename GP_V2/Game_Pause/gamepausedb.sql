-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2014 at 08:34 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gamepausedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
`accountid` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phonenumber` char(11) DEFAULT NULL,
  `admin` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`accountid`, `username`, `email`, `password`, `firstname`, `lastname`, `phonenumber`, `admin`) VALUES
(4, 'student', 'student@my.utsa.edu', '12345', 'student123', 'student456', '7730145', NULL),
(5, 'guest', 'guest@guest.com', 'guest', 'guestor', 'guestar', '7894511', NULL),
(6, 'megaman', 'mega@mega.up', 'mega123', 'mega', 'man', '778945', NULL),
(7, 'admin', 'admin@gmail.com', 'admin', 'admin', 'strator', '777777777', 1);

-- --------------------------------------------------------

--
-- Table structure for table `billinginfo`
--

CREATE TABLE IF NOT EXISTS `billinginfo` (
  `accountid` int(11) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(40) DEFAULT NULL,
  `zip` int(11) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `apptnum` int(11) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
`commentid` int(11) NOT NULL,
  `comment` varchar(1024) DEFAULT NULL,
  `dateposted` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`commentid`, `comment`, `dateposted`) VALUES
(1, 'Do not buy! Does not work! You have been warned!', '2014-12-12 04:59:50'),
(2, 'Bad!!! Red ring of Fire! Red ring of DEATH!', '2014-12-12 04:59:50'),
(3, '5 Starts! the best console up-to-date', '2014-12-12 05:00:02'),
(4, 'Excelent Console the best there is!', '2014-12-12 05:00:07');

-- --------------------------------------------------------

--
-- Table structure for table `commentmap`
--

CREATE TABLE IF NOT EXISTS `commentmap` (
  `commentid` int(11) DEFAULT NULL,
  `accountid` int(11) DEFAULT NULL,
  `itemid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `commentmap`
--

INSERT INTO `commentmap` (`commentid`, `accountid`, `itemid`) VALUES
(1, 1, 4),
(1, 1, 4),
(4, 2, 5),
(NULL, NULL, 6);

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE IF NOT EXISTS `game` (
  `itemid` int(11) DEFAULT NULL,
  `releasedate` date DEFAULT NULL,
  `genre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hardware`
--

CREATE TABLE IF NOT EXISTS `hardware` (
  `itemid` int(11) DEFAULT NULL,
  `itemtype` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE IF NOT EXISTS `item` (
`itemid` int(11) NOT NULL,
  `itemname` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `platform` varchar(40) DEFAULT NULL,
  `manufacturer` varchar(255) DEFAULT NULL,
  `image` varchar(100) NOT NULL,
  `rating` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`itemid`, `itemname`, `price`, `stock`, `platform`, `manufacturer`, `image`, `rating`) VALUES
(1, 'Bayoneta 2', 6.99, 1, 'WiiU', 'EPIC GAMES', 'bayoneta2-wiiu.jpg', 0),
(2, 'Call of Duty - Advanced Warfare', 59.99, 2, 'XBOX ONE', 'Activision', 'callofdutyaw-xboxone.jpg', 0),
(3, 'Assassins Creed - Unity', 69.79, 5, 'PlayStation 4', 'Ubisoft', 'asscreduni-ps4.jpg', 0),
(4, 'BorderLands - Pre-Sequel', 49.99, 2, 'PC', '2K', 'borderlands-pc.jpg', 0),
(5, 'Grand Theft Auto V', 50, 3, 'XBOX ONE', 'Rockstar', 'gtav-xboxone.jpg', 0),
(6, 'Halo - The Master Chief Collection', 45.55, 2, 'XBOX ONE', 'Bungie', 'halotmcc-xboxone.jpg', 0),
(7, 'Hyrule Warrios', 79.99, 5, 'WiiU', 'Nintendo', 'hyrulewar-wiiu.jpg', 0),
(8, 'Play Station 4', 299.99, 8, 'PlayStation 4', 'Sony', 'ps4.jpg', 0),
(9, 'XBOX ONE', 359.99, 3, 'XBOX ONE', 'Microsoft', 'xboxone.jpg', 0),
(10, 'Atari', 100, 2, 'Atari', 'Atari', 'atari6.jpg', 0),
(11, 'Super Famicom', 300, 3, 'Super Famicom', 'Nintendo', 'superfamicon.jpg', 0);

-- --------------------------------------------------------

--
-- Table structure for table `ordermap`
--

CREATE TABLE IF NOT EXISTS `ordermap` (
  `orderid` int(11) DEFAULT NULL,
  `accountid` int(11) DEFAULT NULL,
  `itemid` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ordermap`
--

INSERT INTO `ordermap` (`orderid`, `accountid`, `itemid`, `quantity`) VALUES
(1, 5, 1, 1),
(1, 5, 3, 1),
(3, 5, 2, 1),
(5, 5, 3, 1),
(9, 5, 4, 1),
(10, 5, 2, 1),
(11, 5, 4, 1),
(11, 5, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
`orderid` int(11) NOT NULL,
  `timeoforder` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `completed` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`orderid`, `timeoforder`, `completed`) VALUES
(1, '2014-12-04 02:21:02', 0),
(2, '2014-12-04 02:21:05', 0),
(3, '2014-12-04 02:21:15', 0),
(4, '2014-12-04 02:21:18', 0),
(5, '2014-12-04 02:39:49', 0),
(6, '2014-12-04 02:39:51', 0),
(7, '2014-12-04 02:50:31', 0),
(8, '2014-12-04 02:50:48', 0),
(9, '2014-12-04 02:50:55', 0),
(10, '2014-12-05 01:19:44', 0),
(11, '2014-12-05 03:04:10', 0);

-- --------------------------------------------------------

--
-- Table structure for table `shippinginfo`
--

CREATE TABLE IF NOT EXISTS `shippinginfo` (
  `accountid` int(11) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(40) DEFAULT NULL,
  `zip` int(11) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `apptnum` int(11) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shippinginfo`
--

INSERT INTO `shippinginfo` (`accountid`, `city`, `state`, `zip`, `street`, `apptnum`, `country`) VALUES
(4, 'Eagle Pass', 'TX', 78852, 'Elm Creek', 554, 'United States'),
(5, 'San Antonio', 'TX', 78250, 'Choofer St.', 456, 'United States');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
 ADD PRIMARY KEY (`accountid`);

--
-- Indexes for table `billinginfo`
--
ALTER TABLE `billinginfo`
 ADD KEY `accountid` (`accountid`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
 ADD PRIMARY KEY (`commentid`);

--
-- Indexes for table `commentmap`
--
ALTER TABLE `commentmap`
 ADD KEY `commentid` (`commentid`), ADD KEY `accountid` (`accountid`), ADD KEY `itemid` (`itemid`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
 ADD KEY `itemid` (`itemid`);

--
-- Indexes for table `hardware`
--
ALTER TABLE `hardware`
 ADD KEY `itemid` (`itemid`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
 ADD PRIMARY KEY (`itemid`);

--
-- Indexes for table `ordermap`
--
ALTER TABLE `ordermap`
 ADD KEY `orderid` (`orderid`), ADD KEY `accountid` (`accountid`), ADD KEY `itemid` (`itemid`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
 ADD PRIMARY KEY (`orderid`);

--
-- Indexes for table `shippinginfo`
--
ALTER TABLE `shippinginfo`
 ADD KEY `accountid` (`accountid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
MODIFY `accountid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
MODIFY `commentid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
MODIFY `itemid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
MODIFY `orderid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `billinginfo`
--
ALTER TABLE `billinginfo`
ADD CONSTRAINT `billinginfo_ibfk_1` FOREIGN KEY (`accountid`) REFERENCES `account` (`accountid`);

--
-- Constraints for table `commentmap`
--
ALTER TABLE `commentmap`
ADD CONSTRAINT `commentmap_ibfk_1` FOREIGN KEY (`commentid`) REFERENCES `comment` (`commentid`),
ADD CONSTRAINT `commentmap_ibfk_2` FOREIGN KEY (`accountid`) REFERENCES `item` (`itemid`),
ADD CONSTRAINT `commentmap_ibfk_3` FOREIGN KEY (`itemid`) REFERENCES `account` (`accountid`);

--
-- Constraints for table `game`
--
ALTER TABLE `game`
ADD CONSTRAINT `game_ibfk_1` FOREIGN KEY (`itemid`) REFERENCES `item` (`itemid`);

--
-- Constraints for table `hardware`
--
ALTER TABLE `hardware`
ADD CONSTRAINT `hardware_ibfk_1` FOREIGN KEY (`itemid`) REFERENCES `item` (`itemid`);

--
-- Constraints for table `ordermap`
--
ALTER TABLE `ordermap`
ADD CONSTRAINT `ordermap_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orders` (`orderid`),
ADD CONSTRAINT `ordermap_ibfk_2` FOREIGN KEY (`accountid`) REFERENCES `account` (`accountid`),
ADD CONSTRAINT `ordermap_ibfk_3` FOREIGN KEY (`itemid`) REFERENCES `item` (`itemid`);

--
-- Constraints for table `shippinginfo`
--
ALTER TABLE `shippinginfo`
ADD CONSTRAINT `shippinginfo_ibfk_1` FOREIGN KEY (`accountid`) REFERENCES `account` (`accountid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
