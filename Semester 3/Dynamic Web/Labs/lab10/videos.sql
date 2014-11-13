-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2014 at 03:15 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `videos`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `custid` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(15) NOT NULL,
  `custaddress` varchar(35) NOT NULL,
  `custdate` date NOT NULL,
  PRIMARY KEY (`custid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`custid`, `name`, `custaddress`, `custdate`) VALUES
(1, 'Nazmul Alam', 'Castleisland', '2014-11-10'),
(2, 'Anne White', 'Tralee', '2007-03-03'),
(3, 'Sam', 'KingBing', '2008-03-03');

-- --------------------------------------------------------

--
-- Table structure for table `rentals`
--

CREATE TABLE IF NOT EXISTS `rentals` (
  `rentalid` int(11) NOT NULL AUTO_INCREMENT,
  `custid` int(11) NOT NULL,
  `videoid` int(11) NOT NULL,
  `dateRented` date NOT NULL,
  `duedate` date NOT NULL,
  PRIMARY KEY (`rentalid`),
  KEY `custid` (`custid`),
  KEY `videoid` (`videoid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `rentals`
--

INSERT INTO `rentals` (`rentalid`, `custid`, `videoid`, `dateRented`, `duedate`) VALUES
(1, 1, 2, '2014-08-01', '2004-08-02'),
(2, 1, 3, '2014-07-01', '2004-07-02'),
(3, 2, 3, '2014-07-03', '2004-07-05'),
(4, 3, 3, '2014-07-03', '2004-07-05');

-- --------------------------------------------------------

--
-- Table structure for table `videos`
--

CREATE TABLE IF NOT EXISTS `videos` (
  `videoid` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(25) NOT NULL,
  `rating` char(3) NOT NULL,
  `rented` enum('N','n','Y','y') NOT NULL,
  PRIMARY KEY (`videoid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `videos`
--

INSERT INTO `videos` (`videoid`, `name`, `rating`, `rented`) VALUES
(1, 'Intersteller', '18', 'N'),
(2, 'SpiderMan 3', '12A', 'Y'),
(3, 'The Vow', '12', 'Y');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rentals`
--
ALTER TABLE `rentals`
  ADD CONSTRAINT `rentals_ibfk_1` FOREIGN KEY (`custid`) REFERENCES `customer` (`custid`),
  ADD CONSTRAINT `rentals_ibfk_2` FOREIGN KEY (`videoid`) REFERENCES `videos` (`videoid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
