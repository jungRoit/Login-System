-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2018 at 08:08 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admins`
--

CREATE TABLE `tbl_admins` (
  `admin_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact_no` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_admins`
--

INSERT INTO `tbl_admins` (`admin_id`, `first_name`, `last_name`, `email`, `contact_no`, `username`, `password`, `role`, `added_date`, `modified_date`, `created_by`, `status`) VALUES
(2, 'David', 'Thapa', 'david@gmail.com', '9802012035', 'admin', '123456', 'ROLE_ADMIN', '2018-01-02 06:01:32', NULL, 'super_admin', 1),
(3, 'John', 'Martyn', 'johnny@gmail.com', '9851202012', 'john_admin', '123456', 'ROLE_ADMIN', '2018-01-02 06:02:24', NULL, 'super_admin', 1),
(4, 'james', 'Taylor', 'james@gmail.com', '980215456', 'admin2', '123456', 'ROLE_ADMIN', '2018-01-03 18:06:57', NULL, 'super_admin', 1),
(6, 'Gopi', 'Krishna', 'hope@gmail.com', '9841212526', 'hope', '123456', 'ROLE_ADMIN', '2018-01-03 18:38:12', NULL, 'super_admin', 1),
(7, 'Madhav', 'Bohora', 'madhav@gmail.com', '983245698', 'admin_madhav', '123456', 'ROLE_ADMIN', '2018-01-04 06:53:46', NULL, 'super_admin2', 1),
(8, 'Manish', 'Kc', 'Mmanish@gmaill.com', '980251455', 'admin_manish', '123456', 'ROLE_ADMIN', '2018-01-04 06:54:31', NULL, 'super_admin2', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_assigned_admins`
--

CREATE TABLE `tbl_assigned_admins` (
  `assigned_id` int(11) NOT NULL,
  `created_by` varchar(255) NOT NULL,
  `admin_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_assigned_admins`
--

INSERT INTO `tbl_assigned_admins` (`assigned_id`, `created_by`, `admin_id`) VALUES
(2, 'super_admin1', 3),
(3, 'super_admin', 2),
(4, 'super_admin', 4),
(6, 'super_admin', 6),
(7, 'super_admin2', 7),
(8, 'super_admin2', 8);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_assigned_to`
--

CREATE TABLE `tbl_assigned_to` (
  `assigned_id` int(11) NOT NULL,
  `created_by` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_assigned_to`
--

INSERT INTO `tbl_assigned_to` (`assigned_id`, `created_by`, `user_id`) VALUES
(1, 'admin', 1),
(2, 'admin', 2),
(3, 'john_admin', 3),
(5, 'john_admin', 4),
(6, 'john_admin', 6),
(8, 'admin2', 8),
(9, 'admin2', 9),
(10, 'admin_madhav', 10),
(11, 'admin', 11),
(12, 'admin_madhav', 12);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_super_admins`
--

CREATE TABLE `tbl_super_admins` (
  `super_admin_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact_no` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_super_admins`
--

INSERT INTO `tbl_super_admins` (`super_admin_id`, `first_name`, `last_name`, `email`, `contact_no`, `username`, `password`, `role`, `added_date`, `modified_date`, `created_by`, `status`) VALUES
(5, 'Roit', 'Karki', 'roit.jung@gmail.com', '9843933569', 'super_admin', '123456', 'ROLE_SUPER_ADMIN', '2018-01-03 16:34:38', NULL, 'super_admin', 1),
(6, 'Super', 'Admin', 'super@admin.com', '9854585698', 'super_admin1', '123456', 'ROLE_SUPER_ADMIN', '2018-01-03 16:43:06', NULL, 'super_admin', 1),
(7, 'Tom', 'Cruise', 'tom@gmail.com', '98512326598', 'super_admin2', '123456', 'ROLE_SUPER_ADMIN', '2018-01-04 06:50:44', NULL, 'super_admin1', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact_no` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `created_by` varchar(255) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`user_id`, `first_name`, `last_name`, `email`, `contact_no`, `username`, `password`, `role`, `added_date`, `modified_date`, `created_by`, `status`) VALUES
(1, 'Ram', 'Prashad', 'ram@gmail.com', '9841206589', 'ram', '123456', 'ROLE_USER', '2018-01-02 06:05:59', NULL, 'super_admin', 1),
(2, 'Hari', 'Mohan', 'hari@gmail.com', '9851122335', 'hari', '123456', 'ROLE_USER', '2018-01-02 06:05:59', NULL, 'admin', 1),
(3, 'Gopal', 'Mn', 'ggopal@gmail.com', '9852012356', 'gopal', '123456', 'ROLE_USER', '2018-01-02 06:06:42', NULL, 'admin', 1),
(4, 'Dipesh', 'King', 'deep23@gmail.com', '9805215246', 'user', '123456', 'ROLE_USER', '2018-01-03 17:59:30', NULL, 'admin', 1),
(6, 'Kedar', 'Khatiwoda', 'kedar32@gmail.com', '9841987569', 'kedar', '123456', 'ROLE_USER', '2018-01-03 18:00:56', NULL, 'john_admin', 1),
(8, 'Bishal', 'Rai', 'biishar@gmail.com', '9841212526', 'bishal', '123456', 'ROLE_USER', '2018-01-03 19:03:45', NULL, 'super_admin', 1),
(9, 'Johnny', 'jackson', 'jackson@gmail.com', '9807766534', 'johnny', '123456', 'ROLE_USER', '2018-01-04 06:42:31', NULL, 'super_admin', 1),
(10, 'Harish', 'Sharma', 'harish@gmail.com', '9841212526', 'harish', '123456', 'ROLE_USER', '2018-01-04 06:58:34', NULL, 'super_admin2', 1),
(11, 'Trishna', 'Thapa', 'cool@gmail.com', '9841215951', 'trishna', '123456', 'ROLE_USER', '2018-01-04 07:00:38', NULL, 'admin', 1),
(12, 'Sita', 'Devi', 'sita@gmail.com', '980215456', 'sita', '123456', 'ROLE_USER', '2018-01-04 07:02:46', NULL, 'admin_madhav', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admins`
--
ALTER TABLE `tbl_admins`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `tbl_assigned_admins`
--
ALTER TABLE `tbl_assigned_admins`
  ADD PRIMARY KEY (`assigned_id`),
  ADD UNIQUE KEY `admin_id` (`admin_id`),
  ADD KEY `created_by` (`created_by`);

--
-- Indexes for table `tbl_assigned_to`
--
ALTER TABLE `tbl_assigned_to`
  ADD PRIMARY KEY (`assigned_id`),
  ADD UNIQUE KEY `user_id` (`user_id`),
  ADD KEY `created_by` (`created_by`);

--
-- Indexes for table `tbl_super_admins`
--
ALTER TABLE `tbl_super_admins`
  ADD PRIMARY KEY (`super_admin_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_admins`
--
ALTER TABLE `tbl_admins`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tbl_assigned_admins`
--
ALTER TABLE `tbl_assigned_admins`
  MODIFY `assigned_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tbl_assigned_to`
--
ALTER TABLE `tbl_assigned_to`
  MODIFY `assigned_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `tbl_super_admins`
--
ALTER TABLE `tbl_super_admins`
  MODIFY `super_admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_assigned_admins`
--
ALTER TABLE `tbl_assigned_admins`
  ADD CONSTRAINT `tbl_assigned_admins_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `tbl_super_admins` (`username`),
  ADD CONSTRAINT `tbl_assigned_admins_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `tbl_admins` (`admin_id`);

--
-- Constraints for table `tbl_assigned_to`
--
ALTER TABLE `tbl_assigned_to`
  ADD CONSTRAINT `tbl_assigned_to_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `tbl_users` (`user_id`),
  ADD CONSTRAINT `tbl_assigned_to_ibfk_3` FOREIGN KEY (`created_by`) REFERENCES `tbl_admins` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
