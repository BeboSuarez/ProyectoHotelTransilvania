-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2023 a las 03:51:20
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel_equipo21`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipodehabitacion` int(11) NOT NULL,
  `precioNoche` double NOT NULL,
  `cantidadPersonas` int(11) NOT NULL,
  `descripcion` varchar(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipodehabitacion`, `precioNoche`, `cantidadPersonas`, `descripcion`, `estado`) VALUES
(1, 1, 35000, 2, 'Estándar Si', 1),
(2, 1, 35000, 2, 'Estándar Si', 1),
(3, 1, 35000, 2, 'Estándar Si', 0),
(4, 1, 35000, 2, 'Estándar Si', 0),
(5, 1, 35000, 2, 'Estándar Si', 0),
(6, 1, 35000, 2, 'Estándar Si', 0),
(7, 1, 35000, 2, 'Estándar Si', 0),
(8, 1, 35000, 2, 'Estándar Si', 0),
(9, 1, 35000, 2, 'Estándar Si', 0),
(10, 1, 35000, 2, 'Estándar Si', 0),
(11, 1, 35000, 2, 'Estándar Si', 0),
(12, 1, 35000, 2, 'Estándar Si', 0),
(13, 1, 35000, 2, 'Estándar Si', 0),
(14, 1, 35000, 2, 'Estándar Si', 0),
(15, 1, 35000, 2, 'Estándar Si', 0),
(16, 1, 35000, 2, 'Estándar Si', 0),
(17, 1, 35000, 2, 'Estándar Si', 0),
(18, 1, 35000, 2, 'Estándar Si', 0),
(19, 2, 35500, 2, 'Estándar Si', 0),
(20, 2, 35500, 2, 'Estándar Si', 0),
(21, 2, 35500, 2, 'Estándar Si', 0),
(22, 2, 35500, 2, 'Estándar Si', 0),
(23, 2, 35500, 2, 'Estándar Si', 0),
(24, 2, 35500, 2, 'Estándar Si', 0),
(25, 2, 35500, 2, 'Estándar Si', 0),
(26, 2, 35500, 2, 'Estándar Si', 0),
(27, 2, 35500, 2, 'Estándar Si', 0),
(28, 2, 35500, 2, 'Estándar Si', 0),
(29, 2, 35500, 2, 'Estándar Si', 0),
(30, 2, 35500, 2, 'Estándar Si', 0),
(31, 2, 35500, 2, 'Estándar Si', 0),
(32, 2, 35500, 2, 'Estándar Si', 0),
(33, 2, 35500, 2, 'Estándar Si', 0),
(34, 2, 35500, 2, 'Estándar Si', 0),
(35, 2, 35500, 2, 'Estándar Si', 0),
(36, 2, 35500, 2, 'Estándar Si', 0),
(37, 2, 38000, 2, 'Estándar Si', 0),
(38, 2, 38000, 2, 'Estándar Si', 0),
(39, 2, 38000, 2, 'Estándar Si', 0),
(40, 2, 38000, 2, 'Estándar Si', 0),
(41, 2, 38000, 2, 'Estándar Si', 0),
(42, 2, 38000, 2, 'Estándar Si', 0),
(43, 2, 38000, 2, 'Estándar Si', 0),
(44, 2, 38000, 2, 'Estándar Si', 0),
(45, 2, 38000, 2, 'Estándar Si', 0),
(46, 2, 38000, 2, 'Estándar Si', 0),
(47, 2, 38000, 2, 'Estándar Si', 0),
(48, 2, 38000, 2, 'Estándar Si', 0),
(49, 2, 38000, 2, 'Estándar Si', 0),
(50, 2, 38000, 2, 'Estándar Si', 0),
(51, 4, 50000, 4, 'Estándar Do', 0),
(52, 4, 50000, 4, 'Estándar Do', 0),
(53, 4, 50000, 4, 'Estándar Do', 0),
(54, 4, 50000, 4, 'Estándar Do', 0),
(55, 4, 50000, 4, 'Estándar Do', 0),
(56, 4, 50000, 4, 'Estándar Do', 0),
(57, 4, 50000, 4, 'Estándar Do', 0),
(58, 4, 50000, 4, 'Estándar Do', 0),
(59, 4, 50000, 4, 'Estándar Do', 0),
(60, 4, 50000, 4, 'Estándar Do', 0),
(61, 4, 50000, 4, 'Estándar Do', 0),
(62, 4, 50000, 4, 'Estándar Do', 0),
(63, 4, 50000, 4, 'Estándar Do', 0),
(64, 4, 50000, 4, 'Estándar Do', 0),
(65, 4, 50000, 4, 'Estándar Do', 0),
(66, 4, 50000, 4, 'Estándar Do', 0),
(67, 4, 50000, 4, 'Estándar Do', 0),
(68, 4, 50000, 4, 'Estándar Do', 0),
(69, 4, 50000, 4, 'Estándar Do', 0),
(70, 4, 50000, 4, 'Estándar Do', 0),
(71, 4, 50000, 4, 'Estándar Do', 0),
(72, 4, 50000, 4, 'Estándar Do', 0),
(73, 4, 50000, 4, 'Estándar Do', 0),
(74, 4, 50000, 4, 'Estándar Do', 0),
(75, 5, 52000, 6, 'Estándar Do', 0),
(76, 5, 52000, 6, 'Estándar Do', 0),
(77, 5, 52000, 6, 'Estándar Do', 0),
(78, 5, 52000, 6, 'Estándar Do', 0),
(79, 5, 52000, 6, 'Estándar Do', 0),
(80, 5, 52000, 6, 'Estándar Do', 0),
(81, 5, 52000, 6, 'Estándar Do', 0),
(82, 5, 52000, 6, 'Estándar Do', 0),
(83, 5, 52000, 6, 'Estándar Do', 0),
(84, 5, 52000, 6, 'Estándar Do', 0),
(85, 5, 52000, 6, 'Estándar Do', 0),
(86, 5, 52000, 6, 'Estándar Do', 0),
(87, 5, 52000, 6, 'Estándar Do', 0),
(88, 5, 52000, 6, 'Estándar Do', 0),
(89, 5, 52000, 6, 'Estándar Do', 0),
(90, 5, 52000, 6, 'Estándar Do', 0),
(91, 5, 52000, 6, 'Estándar Do', 0),
(92, 5, 52000, 6, 'Estándar Do', 0),
(93, 5, 52000, 6, 'Estándar Do', 0),
(94, 5, 52000, 6, 'Estándar Do', 0),
(95, 5, 52000, 6, 'Estándar Do', 0),
(96, 5, 52000, 6, 'Estándar Do', 0),
(97, 5, 52000, 6, 'Estándar Do', 0),
(98, 5, 52000, 6, 'Estándar Do', 0),
(99, 6, 55000, 3, 'Estándar Tr', 0),
(100, 6, 55000, 3, 'Estándar Tr', 0),
(101, 6, 55000, 3, 'Estándar Tr', 0),
(102, 6, 55000, 3, 'Estándar Tr', 0),
(103, 6, 55000, 3, 'Estándar Tr', 0),
(104, 6, 55000, 3, 'Estándar Tr', 0),
(105, 6, 55000, 3, 'Estándar Tr', 0),
(106, 6, 55000, 3, 'Estándar Tr', 0),
(107, 6, 55000, 3, 'Estándar Tr', 0),
(108, 6, 55000, 3, 'Estándar Tr', 0),
(109, 6, 55000, 3, 'Estándar Tr', 0),
(110, 6, 55000, 3, 'Estándar Tr', 0),
(111, 6, 55000, 3, 'Estándar Tr', 0),
(112, 6, 55000, 3, 'Estándar Tr', 0),
(113, 6, 55000, 3, 'Estándar Tr', 0),
(114, 6, 55000, 3, 'Estándar Tr', 0),
(115, 6, 55000, 3, 'Estándar Tr', 0),
(116, 6, 55000, 3, 'Estándar Tr', 0),
(117, 6, 55000, 3, 'Estándar Tr', 0),
(118, 6, 55000, 3, 'Estándar Tr', 0),
(119, 6, 55000, 3, 'Estándar Tr', 0),
(120, 6, 55000, 3, 'Estándar Tr', 0),
(121, 7, 58000, 3, 'Estándar Tr', 0),
(122, 7, 58000, 3, 'Estándar Tr', 0),
(123, 7, 58000, 3, 'Estándar Tr', 0),
(124, 7, 58000, 3, 'Estándar Tr', 0),
(125, 7, 58000, 3, 'Estándar Tr', 0),
(126, 7, 58000, 3, 'Estándar Tr', 0),
(127, 7, 58000, 3, 'Estándar Tr', 0),
(128, 7, 58000, 3, 'Estándar Tr', 0),
(129, 7, 58000, 3, 'Estándar Tr', 0),
(130, 7, 58000, 3, 'Estándar Tr', 0),
(131, 7, 58000, 3, 'Estándar Tr', 0),
(132, 7, 58000, 3, 'Estándar Tr', 0),
(133, 7, 58000, 3, 'Estándar Tr', 0),
(134, 7, 58000, 3, 'Estándar Tr', 0),
(135, 7, 58000, 3, 'Estándar Tr', 0),
(136, 7, 58000, 3, 'Estándar Tr', 0),
(138, 8, 58500, 3, 'Estándar Tr', 0),
(139, 8, 58500, 3, 'Estándar Tr', 0),
(140, 8, 58500, 3, 'Estándar Tr', 0),
(141, 8, 58500, 3, 'Estándar Tr', 0),
(142, 8, 58500, 3, 'Estándar Tr', 0),
(143, 8, 58500, 3, 'Estándar Tr', 0),
(144, 8, 58500, 3, 'Estándar Tr', 0),
(145, 8, 58500, 3, 'Estándar Tr', 0),
(146, 8, 58500, 3, 'Estándar Tr', 0),
(147, 8, 58500, 3, 'Estándar Tr', 0),
(148, 8, 58500, 3, 'Estándar Tr', 0),
(149, 8, 58500, 3, 'Estándar Tr', 0),
(150, 8, 58500, 3, 'Estándar Tr', 0),
(151, 8, 58500, 3, 'Estándar Tr', 0),
(152, 9, 71000, 1, 'Siut Queen', 0),
(153, 9, 71000, 1, 'Suit Queen', 0),
(154, 9, 71000, 1, 'Suit Queen', 0),
(155, 9, 71000, 1, 'Suit Queen', 0),
(156, 9, 71000, 1, 'Suit Queen', 0),
(157, 9, 71000, 1, 'Suit Queen', 0),
(158, 9, 71000, 1, 'Suit Queen', 0),
(159, 9, 71000, 1, 'Suit Queen', 0),
(160, 9, 71000, 1, 'Suit Queen', 0),
(161, 9, 71000, 1, 'Suit Queen', 0),
(162, 9, 71000, 1, 'Suit Queen', 0),
(163, 9, 71000, 1, 'Suit Queen', 0),
(164, 9, 71000, 1, 'Suit Queen', 0),
(165, 9, 71000, 1, 'Suit Queen', 0),
(166, 9, 71000, 1, 'Suit Queen', 0),
(167, 10, 85000, 2, 'Suit King S', 0),
(168, 10, 85000, 2, 'Suit King S', 0),
(169, 10, 85000, 2, 'Suit King S', 0),
(170, 10, 85000, 2, 'Suit King S', 0),
(171, 10, 85000, 2, 'Suit King S', 0),
(172, 10, 85000, 2, 'Suit King S', 0),
(173, 10, 85000, 2, 'Suit King S', 0),
(174, 10, 85000, 2, 'Suit King S', 0),
(175, 10, 85000, 2, 'Suit King S', 0),
(176, 10, 85000, 2, 'Suit King S', 0),
(177, 11, 38300, 2, 'Capacidades', 0),
(178, 11, 38300, 2, 'Capacidades', 0),
(179, 11, 38300, 2, 'Capacidades', 0),
(180, 11, 38300, 2, 'Capacidades', 0),
(181, 11, 38300, 2, 'Capacidades', 0),
(182, 11, 38300, 2, 'Capacidades', 0),
(183, 11, 38300, 2, 'Capacidades', 0),
(184, 11, 38300, 2, 'Capacidades', 0),
(185, 11, 38300, 2, 'Capacidades', 0),
(186, 11, 38300, 2, 'Capacidades', 0),
(187, 11, 38300, 2, 'Capacidades', 0),
(188, 11, 38300, 2, 'Capacidades', 0),
(189, 11, 38300, 2, 'Capacidades', 0),
(190, 11, 38300, 2, 'Capacidades', 0),
(191, 11, 38300, 2, 'Capacidades', 0),
(192, 12, 38700, 2, 'Capacidades', 0),
(193, 12, 38700, 2, 'Capacidades', 0),
(194, 12, 38700, 2, 'Capacidades', 0),
(195, 12, 38700, 2, 'Capacidades', 0),
(196, 12, 38700, 2, 'Capacidades', 0),
(197, 12, 38700, 2, 'Capacidades', 0),
(198, 12, 38700, 2, 'Capacidades', 0),
(199, 12, 38700, 2, 'Capacidades', 0),
(200, 12, 38700, 2, 'Capacidades', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(65) NOT NULL,
  `apellido` varchar(65) NOT NULL,
  `dni` int(20) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `correo` varchar(80) NOT NULL,
  `telefono` bigint(40) NOT NULL,
  `domicilio` varchar(80) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `fechaNacimiento`, `correo`, `telefono`, `domicilio`, `estado`) VALUES
(1, 'Pablo', 'Martin', 555555555, '1982-02-27', 'agu@gmail.com', 0, 'San luis', 1),
(3, 'Lucas', 'Martin', 35944682, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 0),
(8, 'Lucia', 'Barrionuevo', 11111111, '1982-02-01', 'lucia@gmail.com', 555555555, 'fgrgrtggr', 1),
(9, 'Roberto', 'Martin', 333333333, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 1),
(11, 'Pablo', 'Martin', 35434581, '1982-02-27', 'agu@gmail.com', 4535, '', 0),
(12, 'Pablo', 'Martin', 35444581, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 0),
(13, 'Lucia', 'Barrionuevo', 11333111, '1982-02-01', 'lucia@gmail.com', 453524, 'San Juan', 0),
(14, 'Pablo', 'Martin', 35654825, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 1),
(16, 'Pablo', 'Martin', 38440581, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 0),
(17, 'Brenda', 'Siwonia', 36233661, '1992-03-27', 'micaelabrenda@gmail.com', 547500, 'Villa Giardino', 1),
(18, 'Alberto', 'Romero', 165478965, '2023-10-13', 'jose@hotmail.com', 324598, 'siempreviva', 0),
(20, 'Maria', 'Barrionuevo', 785421457, '1982-02-01', 'lucia@gmail.com', 123456, '', 1),
(29, 'Brenda', 'Siwonia', 36233546, '1992-03-27', 'micaelabrenda@gmail.com', 547500, 'Villa Giardino', 1),
(34, 'Brenda', 'Siwonia', 36234785, '1992-03-27', 'micaelabrenda@gmail.com', 547500, 'Villa Giardino', 0),
(44, 'Brenda', 'Siwonia', 362361, '1992-03-26', 'siwonia@gmail.com', 56566, 'Planta567', 1),
(45, 'Cecilia', 'Sanches', 5487542, '2023-10-09', 'ceci@gmail.com', 1585456, 'tuyu 1524', 1),
(46, 'Luis', 'Armoni', 147852369, '1988-10-20', 'Luis@hotmail.com', 369852147, 'La pampa477', 1),
(47, 'Beatriz', 'Vazquez', 26305459, '2023-11-22', 'maruu@gmail.com', 26305459, 'Pascual 56', 1),
(48, 'jdakjd', 'kadmld', 918463279, '2023-11-30', 'sxakmd', 398573492, 'kdfreiuweop', 1),
(49, 'Ximena', 'Castillo', 30147654, '2023-11-08', '', 15487598, 'Oro 167', 0),
(51, 'Ezequiel', 'Salinas', 29488552, '2023-11-02', 'ezesal@hotmail.com', 15422563, 'Hirigoyen', 1),
(52, 'Ezequiel', 'Salinas', 123654521, '2023-11-02', 'ezesal@hotmail.com', 548745632, 'Hirigoyen', 1),
(53, 'lorena', 'pacheco', 578000002, '2023-11-16', 'PACHECO@GMAIL.COM', 152356854, 'LA PAMPA 566', 1),
(54, 'Omar', 'Diaz', 39843710, '2016-11-17', 'diaz@gmail.com', 222222222, 'Albarracin 476', 0),
(55, 'Natalia', 'Marquez', 897642301, '2014-11-12', 'natu@gmail.com', 123456789, 'Pascual Segura', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `cantidadPersonas` int(11) NOT NULL,
  `precioTotal` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHabitacion`, `idHuesped`, `fechaIngreso`, `fechaSalida`, `cantidadPersonas`, `precioTotal`, `estado`) VALUES
(51, 2, 9, '2017-11-14', '2017-11-17', 2, 105000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipodehabitacion` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `cantidadCamas` int(11) NOT NULL,
  `cantidadPersonas` int(11) NOT NULL,
  `tipoCama` varchar(80) NOT NULL,
  `precioNoche` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`idTipodehabitacion`, `descripcion`, `cantidadCamas`, `cantidadPersonas`, `tipoCama`, `precioNoche`, `estado`) VALUES
(1, 'Estándar Simple Individual', 2, 2, 'Individual Simple', 35000, 0),
(2, 'Estándar Simple Queen', 1, 2, 'Matrimonial Queen', 35500, 0),
(3, 'Estándar Simple King Size', 1, 2, 'King Size', 38000, 0),
(4, 'Estándar Doble Queen', 2, 4, 'Matrimonial Queen', 50000, 0),
(5, 'Estándar Doble King Size', 2, 6, 'King Size', 52000, 0),
(6, 'Estándar Triple Individual', 3, 3, 'Individual Simple', 55000, 0),
(7, 'Estándar Triple Queen + Simple\r\n', 2, 3, 'Matrimonial Queen + Individual Simple', 58000, 0),
(8, 'Estándar Triple King Size + Simple', 2, 3, 'Matrimonial King Size + Individual Simple', 58500, 0),
(9, 'Suit Queen', 1, 1, 'Matrimonial Queen', 71000, 0),
(10, 'Suit King Size', 1, 2, 'king Size', 85000, 0),
(11, 'Capacidades diferentes Simples', 2, 2, 'Individuales Simples', 38300, 0),
(12, 'Capacidades diferentes ', 1, 2, 'Matrimonial ', 38700, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipodehabitacion` (`idTipodehabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipodehabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=205;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipodehabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipodehabitacion`) REFERENCES `tipodehabitacion` (`idTipodehabitacion`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
