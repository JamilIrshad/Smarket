-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2022 at 03:56 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smarche`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `cat_id` int(11) NOT NULL,
  `category` varchar(30) DEFAULT NULL,
  `category_desc` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`cat_id`, `category`, `category_desc`) VALUES
(1, 'Beverages', 'Cold Drinks, Hot Drinks, Juices, Water'),
(2, 'Vegetables', 'Fresh organic grown vegetables'),
(3, 'Fruits', 'Fresh fruits'),
(4, 'Dairy', 'Dairy Products'),
(5, 'Meat', 'Fresh Chicken, Beef, Mutton'),
(6, 'Bakery', 'Baked foods'),
(7, 'Frozen', 'Frozen meat, Vegetables, Snacks'),
(8, 'House Care', 'Items related to house care'),
(9, 'Personal Care', 'Items related to personal hygiene');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `prod_id` int(11) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `price` int(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `category_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`prod_id`, `product_name`, `price`, `quantity`, `category_id`) VALUES
(1, 'Nescafe', 3, '966.0', 1),
(2, 'Milo', 9, '982.0', 1),
(3, 'Coke 12oz', 15, '1000.0', 1),
(4, 'Silver swan ', 10, '992.0', 1),
(5, 'Nescafe ', 9, '970.0', 1),
(6, 'Colgate', 10, '1000.0', 9),
(7, 'Coke 1 liter', 50, '996.0', 1),
(8, 'Beer', 600, '1000.0', 1),
(9, 'Meat loaf', 23, '996.0', 6),
(10, 'Beef loaf', 24, '997', 6),
(11, 'Corn beef', 25, '981.0', 5),
(12, 'Pepsi 500ml', 65, '9.0', 1),
(13, 'Fries 1kg', 200, '0', 7);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `privilege` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `privilege`) VALUES
('admin', 'admin', 1),
('Ahmed', 'ahmed123', 0),
('Ali', 'alibc', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prod_id`),
  ADD KEY `category_id` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `prod_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`cat_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
