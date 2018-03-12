-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 20, 2016 at 07:09 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `student_alumni`
--

-- --------------------------------------------------------

--
-- Table structure for table `achivement`
--

CREATE TABLE IF NOT EXISTS `achivement` (
  `ac_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_id` varchar(15) NOT NULL,
  `chancellor` tinyint(1) NOT NULL,
  `vc` tinyint(1) NOT NULL,
  `dean` tinyint(1) NOT NULL,
  `dgree_honurs` tinyint(1) NOT NULL,
  `not_applicable` tinyint(1) NOT NULL,
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;

--
-- Dumping data for table `achivement`
--

INSERT INTO `achivement` (`ac_id`, `st_id`, `chancellor`, `vc`, `dean`, `dgree_honurs`, `not_applicable`) VALUES
(15, '140203020101', 0, 0, 1, 1, 0),
(17, '140203020005', 0, 1, 1, 1, 0),
(18, '140203020003', 1, 1, 1, 1, 0),
(19, '140203020010', 1, 1, 1, 1, 0),
(21, '140103020011', 1, 0, 0, 1, 0),
(23, '140203020002', 1, 1, 1, 1, 0),
(24, '140203020107', 0, 0, 0, 0, 1),
(25, '130203020101', 1, 0, 0, 0, 0),
(26, '120303020007', 1, 1, 1, 1, 0),
(27, '130203020005', 1, 1, 1, 1, 0),
(28, '140203020009', 0, 0, 1, 1, 0),
(29, '130202020001', 0, 0, 1, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `activity`
--

CREATE TABLE IF NOT EXISTS `activity` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `st_id` varchar(15) NOT NULL,
  `club` varchar(50) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `year` varchar(20) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Dumping data for table `activity`
--

INSERT INTO `activity` (`aid`, `st_id`, `club`, `designation`, `year`) VALUES
(12, '140203020101', 'CSE Socity', 'Assistant General secretary', '2015-2016'),
(14, '140203020005', 'Debating Society', 'Executive Member', '2014-2015'),
(15, '140203020005', 'CSE Socity', 'Executive Member', '2017-2018'),
(16, '140203020003', 'Debating Society', 'Executive Member', '2014-2021'),
(17, '140203020003', 'CSE Socity', 'Executive Member', '2016-2017'),
(18, '140203020010', 'CSE Socity', 'President', '2021-2022'),
(19, '140103020011', 'CSE Socity', 'Executive Member', '2014-2018'),
(20, '140203020101', 'Tourist Club', 'EM', '2016-2017'),
(21, '140203020002', 'CSE Socity', 'Executive Member', '2015-2016'),
(22, '130203020101', 'CSE Socity', 'Vice President', '2013 to2014'),
(23, '130203020101', 'Debating Society', 'Organizing Secretary', '2014 to2015'),
(24, '120303020007', 'CSE Socity', 'General secretary ', '2014 to2014'),
(25, '120303020007', 'CSE Socity', 'Executive Member', '2015 to2016'),
(26, '130203020005', 'CSE Socity', 'Executive Member', '2014 to 2017'),
(27, '140203020009', 'CSE Socity', 'General secretary ', '2016 to 2017');

-- --------------------------------------------------------

--
-- Table structure for table `addraess`
--

CREATE TABLE IF NOT EXISTS `addraess` (
  `add_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_id` varchar(15) NOT NULL,
  `add_type` varchar(15) NOT NULL,
  `sab` varchar(10) NOT NULL,
  `house` varchar(5) NOT NULL,
  `road` varchar(5) NOT NULL,
  `block` varchar(3) NOT NULL,
  `village` varchar(50) NOT NULL,
  `p_o` varchar(15) NOT NULL,
  `p_s` varchar(50) NOT NULL,
  `district` varchar(25) NOT NULL,
  PRIMARY KEY (`add_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=77 ;

--
-- Dumping data for table `addraess`
--

INSERT INTO `addraess` (`add_id`, `st_id`, `add_type`, `sab`, `house`, `road`, `block`, `village`, `p_o`, `p_s`, `district`) VALUES
(44, '140203020101', 'Permanent', ' No', '16', '2', 'B', 'Tilaghor', 'SYL-3100', 'Sadar', 'Sylhet'),
(45, '140203020101', 'Present', ' Yes', '16', '2', 'B', 'Tilaghor', 'SYL-3100', 'Sadar', 'Sylhet'),
(48, '140203020005', 'Permanent', ' No', '20', '9', 'A', 'xyz', 'abc', 'Bissonat', 'Sylhet'),
(49, '140203020005', 'Present', ' Yes', '20', '9', 'A', 'xyz', 'abc', 'Bissonat', 'Sylhet'),
(50, '140203020003', 'Permanent', ' No', '6/A', 'n/a', 'n/a', 'Suraiya Tower, Borobazar, Amborkhana', 'SYL-3100', 'Airport Police Station', 'Nowakhali'),
(51, '140203020003', 'Present', ' Yes', '6/A', 'n/a', 'n/a', 'Suraiya Tower, Borobazar, Amborkhana', 'SYL-3100', 'Airport Police Station', 'Nowakhali'),
(52, '140203020010', 'Permanent', ' No', '12', '4', 'A', 'Modina Market', 'SYL-3100', 'Airport', 'Sylhet'),
(53, '140203020010', 'Present', ' Yes', '12', '4', 'A', 'Modina Market', 'SYL-3100', 'Airport', 'Sylhet'),
(56, '140103020011', 'Permanent', ' No', '11/2', 'n/a', 'n/a', 'North Kazitula', 'SYL-3100', 'kotuali', 'Sylhet'),
(57, '140103020011', 'Present', ' Yes', '11/2', 'n/a', 'n/a', 'North Kazitula', 'SYL-3100', 'kotuali', 'Sylhet'),
(60, '140203020002', 'Permanent', ' No', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a'),
(61, '140203020002', 'Present', ' Yes', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a', 'n/a'),
(63, '140203020107', 'Permanent', 'No', '22', '3', 'b', 'tilaghor', 'sylhet-3100', 'sadar', 'Sylhet'),
(64, '140203020107', 'Present', 'Yes', '22', '3', 'b', 'tilaghor', 'sylhet-3100', 'sadar', 'Sylhet'),
(65, '130203020101', 'Permanent', 'No', '30', '9', 'H', 'Uposhohor', 'SYL-3200', 'Shahporan Model Police Station', 'Sylhet'),
(66, '130203020101', 'Present', 'Yes', '30', '9', 'H', 'Uposhohor', 'SYL-3200', 'Shahporan Model Police Station', 'Sylhet'),
(67, '120303020007', 'Permanent', 'No', '102', '9', 'N/A', 'Lama kaji', 'SYL-3100', 'Airport Model P.S.', 'Dhaka'),
(68, '120303020007', 'Present', 'Yes', '102', '9', 'N/A', 'Lama kaji', 'SYL-3100', 'Airport Model P.S.', 'Dhaka'),
(69, '130203020005', 'Permanent', 'No', '90', '2', 'L', 'Housing State', 'SYL-3100', 'Sadar', 'Sylhet'),
(70, '130203020005', 'Present', 'No', 'N/A', 'N/A', 'N/A', 'Vulagonji', 'Vulagonj Bazar', 'Sylhet', 'Sylhet'),
(71, '140203020009', 'Permanent', 'No', '8/s', 'a', '6', 'south surma', 'sylhet,3100', 'sodor', 'sylhet'),
(72, '140203020009', 'Present', 'No', '7/c', 'n/a', 'n/a', 'subud bazer', 'sylhet,3100', 'Airport police', 'sylhet'),
(73, '130202020001', 'Permanent', 'No', '5', 'n/a', 'n/a', 'wkdmw', 'wlkmdwo', 'dnnc', 'ldndks'),
(74, '130202020001', 'Present', 'Yes', '5', 'n/a', 'n/a', 'wkdmw', 'wlkmdwo', 'dnnc', 'ldndks');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`) VALUES
(0, 'admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `information`
--

CREATE TABLE IF NOT EXISTS `information` (
  `id` varchar(15) NOT NULL,
  `stduent_name` varchar(30) NOT NULL,
  `father_name` varchar(30) NOT NULL,
  `mother_name` varchar(30) NOT NULL,
  `dob` varchar(25) NOT NULL,
  `mobile_no` varchar(15) NOT NULL,
  `e_mail` varchar(30) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `pass_year` varchar(20) NOT NULL,
  `convaction_year` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `information`
--

INSERT INTO `information` (`id`, `stduent_name`, `father_name`, `mother_name`, `dob`, `mobile_no`, `e_mail`, `blood_group`, `religion`, `pass_year`, `convaction_year`) VALUES
('120303020007', 'Asia Khanom afa', 'N/A', 'N/A', '5 February, 1993', '01979-908980', 'asia@gmail.com', 'A (+ve)', 'Muslim', '2016', '2021'),
('130202020001', 'jbdskj', 'kljsdn', 'dlkjs', '1 January, 1995', '01243974300', 'nysyau@yahoo.com', 'O (+ve)', 'Muslim', '2013', '2016'),
('130203020005', 'Afaz', 'N/A', 'N/A', '4 May, 1993', '01742-101010', 'afaz@gmail.com', 'A (+ve)', 'Muslim', '2017', '2021'),
('130203020101', 'kuddus', 'mokles', 'sokina', '14 August, 1990', '01920982890', 'asd@yahoo.com', 'B (-ve)', 'Muslim', '2017', '2021'),
('140103020011', 'Shakil Ahmed Munna', 'Abdur Nur', 'Rowshon Ara', '01-01-1991', '01790-898998', 'sakil@gmail.com', 'A (+ve)', 'Muslim', '2017', '2021'),
('140203020002', 'Raihan', 'M.A. Latif', 'Beauti Begum', '2 July, 2000', '01790297980', 'mir@gmail.com', 'A (+ve)', 'Muslim', '2018', '2021'),
('140203020003', 'Rocksar Sultana afa', 'Md. Khandokhar Belal Hossain', 'Nasrin Akter', '20-12-1994', '01790-121212', 'rockstra@gmail.com', 'AB (+ve)', 'Muslim', '2018', '2021'),
('140203020005', 'TOPU', 'n/a', 'n/a', '1-1-1994', '01790-909090', 'topu05@gmail.com', 'AB (+ve)', 'Hindu', '2018', '2021'),
('140203020009', 'Nusrat khan', 'Abdul Lotif', 'Lovley Begum', '29 Novembar, 1995', '0172888222', 'nusratkhan@yahoo.com', 'A (+ve)', 'Muslim', '2018', '2020'),
('140203020010', 'Rubina Begum', 'Mr. Mamud', 'Mrs. Fulesa', '01-01-1995', '0179-909090', 'xyz@kuddus.net', 'O (+ve)', 'Muslim', '2018', '2021'),
('140203020101', 'Rahat', 'Abdul Goni', 'Naila Sultana', '01-01-1980', '01790-297939', 'adrahat@gmail.com', 'O (+ve)', 'Muslim', '2017', '2021'),
('140203020107', 'Mokles', 'sab', 's', '7 September, 1990', '01920-192878', 'ased@gmail.com', 'O (-ve)', 'Muslim', '2018', '2021');

-- --------------------------------------------------------

--
-- Table structure for table `research_project`
--

CREATE TABLE IF NOT EXISTS `research_project` (
  `rp_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_id` varchar(15) NOT NULL,
  `rp_type` varchar(15) NOT NULL,
  `rp_area` varchar(50) NOT NULL,
  `rp_title` varchar(200) NOT NULL,
  `supervisor` varchar(30) NOT NULL,
  `year` varchar(20) NOT NULL,
  `paper` text NOT NULL,
  PRIMARY KEY (`rp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `research_project`
--

INSERT INTO `research_project` (`rp_id`, `st_id`, `rp_type`, `rp_area`, `rp_title`, `supervisor`, `year`, `paper`) VALUES
(8, '140203020101', 'Research', 'OCR', 'Finding Better approach of OCR in Bangla Letter.', 'Mrs. Tasnim Zahan Tithy', '2017', '1. Fundamental technique of OCR.\n2. Using "Kuddus" method for OCR.\n3. Using "Mokles" method for OCR.\n4. The Fundamentals difference of Kuddus and Mokles methods.'),
(10, '140203020005', 'Research', 'DIP', 'Image Enhance using tetra histrogram equaligation', 'Al Mehdi Saadat Chowdhury', '2018', '1. Fundamental of DIP.\n2. Create an inteligence model name "kuddus model" for image enhance.'),
(11, '140203020003', 'Research', 'NLP', 'Speech to Text conersion.', 'Ahsan Habib', '2018', '1. Fundamantals of Speech recognition.\n2. Developed "Kuddus Method" for noiseless speech.'),
(12, '140203020010', 'Research', 'OCR', 'Recognotion of Bengali Character', 'Al Mehdi Saadat Chowdhury', '2018', '1. Developed "Saadat Sir" Method.'),
(14, '140103020011', 'Project', 'N/A', 'Deveploed an androad project of "AIDS" detector', 'Fardayek Vai', '2017', 'N/A'),
(16, '140203020002', 'Research', 'ML', 'After Dicission', 'Al Mehdi Saadat Chowdhury', '2018', '1. developed "kuddus method".\n2. developed "The SC vai''s theorem".'),
(17, '140203020107', 'Project', 'N/A', 'Result processing', 'AHF', '2032', 'N/A'),
(18, '130203020101', 'Project', 'N/A', 'Student Database', 'TTO', '2017', 'N/A'),
(19, '120303020007', 'Research', 'ML', 'Bangla Character Recognize By Using Artificaial Neural Network', 'Al Mehdi Saadat Chowdhury', '2016', '1. Fundamental of "OCR".\n2. How to be a comando to teach machine.'),
(20, '130203020005', 'Research', 'ML', 'Recognized Bangla Numeric Digit', 'Al Mehdi Saadat Chowdhury', '2017', '1. Delevoped "SC" Model.\n2. Fundamental Difference betweeen Kudddus model and SC Model.'),
(21, '140203020009', 'Research', 'data compress', 'sms data compress', 'Ahsan Habib', '2017', 'gfffgbhjfugctrdc jhtrfhgh'),
(22, '130202020001', 'Research', 'qd', 'QDSG', 'sgsb', '2013', 'sgdrheddxx');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE IF NOT EXISTS `results` (
  `id` varchar(15) NOT NULL,
  `re_1` float NOT NULL,
  `re_2` float NOT NULL,
  `re_3` float NOT NULL,
  `re_4` float NOT NULL,
  `re_5` float NOT NULL,
  `re_6` float NOT NULL,
  `re_7` float NOT NULL,
  `re_8` float NOT NULL,
  `re_9` float NOT NULL,
  `re_10` float NOT NULL,
  `re_11` float NOT NULL,
  `re_12` float NOT NULL,
  `ce_1` float NOT NULL,
  `ce_2` float NOT NULL,
  `ce_3` float NOT NULL,
  `ce_4` float NOT NULL,
  `ce_5` float NOT NULL,
  `ce_6` float NOT NULL,
  `ce_7` float NOT NULL,
  `ce_8` float NOT NULL,
  `ce_9` float NOT NULL,
  `ce_10` float NOT NULL,
  `ce_11` float NOT NULL,
  `ce_12` float NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`id`, `re_1`, `re_2`, `re_3`, `re_4`, `re_5`, `re_6`, `re_7`, `re_8`, `re_9`, `re_10`, `re_11`, `re_12`, `ce_1`, `ce_2`, `ce_3`, `ce_4`, `ce_5`, `ce_6`, `ce_7`, `ce_8`, `ce_9`, `ce_10`, `ce_11`, `ce_12`) VALUES
('120303020007', 4, 4, 4, 4, 4, 4, 4, 4, 3.98, 3.98, 4, 4, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14),
('130202020001', 3, 2.5, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 21, 12, 11, 11, 11, 11, 15, 15, 15, 15, 15, 15),
('130203020005', 4, 4, 4, 4, 4, 4, 3.75, 3.75, 3.75, 3.75, 3.75, 3.75, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14),
('130203020101', 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 3.6, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15),
('140103020011', 3.9, 3.9, 3.9, 3.9, 3, 3.9, 4, 4, 4, 4, 4, 4, 10, 10, 10, 10, 10, 10, 2, 20, 20, 20, 20, 20),
('140203020002', 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12),
('140203020003', 3.75, 3.75, 3.75, 3.75, 3.75, 3.75, 4, 4, 4, 4, 4, 4, 10, 10, 10, 10, 10, 10, 15, 15, 15, 15, 15, 15),
('140203020005', 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 10, 10, 10, 10, 10, 10, 15, 15, 15, 15, 15, 15),
('140203020009', 3.4, 2.3, 3.66, 3.55, 3.7, 3.55, 4, 4, 3.88, 3.9, 4, 3.95, 10, 12, 13, 13.5, 15, 14, 15, 15, 15, 13.5, 15, 13.5),
('140203020010', 3.8, 3.8, 3.8, 3.8, 3.8, 3.8, 4, 4, 4, 4, 4, 4, 13.5, 13.5, 13.5, 13.5, 13.5, 13.5, 15, 15, 15, 15, 15, 15),
('140203020101', 3, 3, 3, 4, 3.9, 3, 3.9, 4, 3.9, 3, 3, 3, 10, 15, 10, 15, 10, 15, 15, 10, 15, 10, 15, 10),
('140203020107', 3.5, 3.5, 3.5, 3.5, 3.5, 3.5, 3.25, 3.25, 3.25, 3.25, 3.25, 3.25, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12);

-- --------------------------------------------------------

--
-- Table structure for table `work_in`
--

CREATE TABLE IF NOT EXISTS `work_in` (
  `w_id` int(11) NOT NULL AUTO_INCREMENT,
  `st_id` varchar(15) NOT NULL,
  `type` varchar(15) NOT NULL,
  `company` varchar(50) NOT NULL,
  `designation` varchar(30) NOT NULL,
  `year` varchar(20) NOT NULL,
  PRIMARY KEY (`w_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `work_in`
--

INSERT INTO `work_in` (`w_id`, `st_id`, `type`, `company`, `designation`, `year`) VALUES
(5, '140203020101', 'Previous', 'kuddus BODNQA company', 'CEO', '2017-2019'),
(6, '140203020101', 'Present', 'Mokles bodna com', 'CEO', '2018-2021'),
(9, '140203020005', 'Present', 'kuddus Bodna company', 'IT officer', '2019- present'),
(10, '140203020005', 'Previous', 'Mokles Bodna company', 'IT Officer', '2017-2018'),
(11, '140203020003', 'Previous', 'Mr. Sweet', 'Special Khadok', '2016-2018'),
(12, '140203020003', 'Present', 'Dingi Restuarent', 'CEO', '2018-2021'),
(13, '140203020010', 'Previous', 'Kuddus Bank Pvt. Lmt', 'Manager', '2018-2019'),
(14, '140203020010', 'Present', 'NEUB Dept. of CSE', 'Head (Acting)', '2018-now'),
(17, '140103020011', 'Previous', 'Bangladesh Bank', 'CEO', '2013-2018'),
(18, '140103020011', 'Present', 'Switch Bank', 'CEO', '2018-present'),
(20, '140203020002', 'Previous', 'Microsoft Corp.', 'Senior SE', '2017-2018'),
(21, '140203020002', 'Present', 'Facebook', 'Assistant CEO', '2017-present'),
(22, '140203020107', 'Present', 'Bangladesh Televission', 'IT officer', '2012-2012'),
(23, '120303020007', 'Present', 'NEUB', 'Lecturer', '2016-2021'),
(24, '130203020005', 'Present', 'NEUB', 'Lecturer', '2018-Present');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
