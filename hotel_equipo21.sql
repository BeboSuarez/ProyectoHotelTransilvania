-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 21:24:41
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
-- Base de datos: `hotel.equipo21`
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
  `descripcion` varchar(80) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipodehabitacion`, `precioNoche`, `cantidadPersonas`, `descripcion`, `estado`) VALUES
(1, 1, 35000, 2, 'Estándar Simple Individual', 0),
(2, 1, 35000, 2, 'Estándar Simple Individual', 0),
(3, 1, 35000, 2, 'Estándar Simple Individual', 0),
(4, 1, 35000, 2, 'Estándar Simple Individual', 0),
(5, 1, 35000, 2, 'Estándar Simple Individual', 0),
(6, 1, 35000, 2, 'Estándar Simple Individual', 0),
(7, 1, 35000, 2, 'Estándar Simple Individual', 0),
(8, 1, 35000, 2, 'Estándar Simple Individual', 0),
(9, 1, 35000, 2, 'Estándar Simple Individual', 0),
(10, 1, 35000, 2, 'Estándar Simple Individual', 0),
(11, 1, 35000, 2, 'Estándar Simple Individual', 0),
(12, 1, 35000, 2, 'Estándar Simple Individual', 0),
(13, 1, 35000, 2, 'Estándar Simple Individual', 0),
(14, 1, 35000, 2, 'Estándar Simple Individual', 0),
(15, 1, 35000, 2, 'Estándar Simple Individual', 0),
(16, 1, 35000, 2, 'Estándar Simple Individual', 0),
(17, 1, 35000, 2, 'Estándar Simple Individual', 0),
(18, 1, 35000, 2, 'Estándar Simple Individual', 0),
(19, 2, 35500, 2, 'Estándar Simple Queen', 0),
(20, 2, 35500, 2, 'Estándar Simple Queen', 0),
(21, 2, 35500, 2, 'Estándar Simple Queen', 0),
(22, 2, 35500, 2, 'Estándar Simple Queen', 0),
(23, 2, 35500, 2, 'Estándar Simple Queen', 0),
(24, 2, 35500, 2, 'Estándar Simple Queen', 0),
(25, 2, 35500, 2, 'Estándar Simple Queen', 0),
(26, 2, 35500, 2, 'Estándar Simple Queen', 0),
(27, 2, 35500, 2, 'Estándar Simple Queen', 0),
(28, 2, 35500, 2, 'Estándar Simple Queen', 0),
(29, 2, 35500, 2, 'Estándar Simple Queen', 0),
(30, 2, 35500, 2, 'Estándar Simple Queen', 0),
(31, 2, 35500, 2, 'Estándar Simple Queen', 0),
(32, 2, 35500, 2, 'Estándar Simple Queen', 0),
(33, 2, 35500, 2, 'Estándar Simple Queen', 0),
(34, 2, 35500, 2, 'Estándar Simple Queen', 0),
(35, 2, 35500, 2, 'Estándar Simple Queen', 0),
(36, 2, 35500, 2, 'Estándar Simple Queen', 0),
(37, 3, 38000, 2, 'Estándar Simple King Size', 0),
(38, 3, 38000, 2, 'Estándar Simple King Size', 0),
(39, 3, 38000, 2, 'Estándar Simple King Size', 0),
(40, 3, 38000, 2, 'Estándar Simple King Size', 0),
(41, 3, 38000, 2, 'Estándar Simple King Size', 0),
(42, 3, 38000, 2, 'Estándar Simple King Size', 0),
(43, 3, 38000, 2, 'Estándar Simple King Size', 0),
(44, 3, 38000, 2, 'Estándar Simple King Size', 0),
(45, 3, 38000, 2, 'Estándar Simple King Size', 0),
(46, 3, 38000, 2, 'Estándar Simple King Size', 0),
(47, 3, 38000, 2, 'Estándar Simple King Size', 0),
(48, 3, 38000, 2, 'Estándar Simple King Size', 0),
(49, 3, 38000, 2, 'Estándar Simple King Size', 0),
(50, 3, 38000, 2, 'Estándar Simple King Size', 0),
(51, 4, 50000, 4, 'Estándar Doble Queen', 0),
(52, 4, 50000, 4, 'Estándar Doble Queen', 0),
(53, 4, 50000, 4, 'Estándar Doble Queen', 0),
(54, 4, 50000, 4, 'Estándar Doble Queen', 0),
(55, 4, 50000, 4, 'Estándar Doble Queen', 0),
(56, 4, 50000, 4, 'Estándar Doble Queen', 0),
(57, 4, 50000, 4, 'Estándar Doble Queen', 0),
(58, 4, 50000, 4, 'Estándar Doble Queen', 0),
(59, 4, 50000, 4, 'Estándar Doble Queen', 0),
(60, 4, 50000, 4, 'Estándar Doble Queen', 0),
(61, 4, 50000, 4, 'Estándar Doble Queen', 0),
(62, 4, 50000, 4, 'Estándar Doble Queen', 0),
(63, 4, 50000, 4, 'Estándar Doble Queen', 0),
(64, 4, 50000, 4, 'Estándar Doble Queen', 0),
(65, 4, 50000, 4, 'Estándar Doble Queen', 0),
(66, 4, 50000, 4, 'Estándar Doble Queen', 0),
(67, 4, 50000, 4, 'Estándar Doble Queen', 0),
(68, 4, 50000, 4, 'Estándar Doble Queen', 0),
(69, 4, 50000, 4, 'Estándar Doble Queen', 0),
(70, 4, 50000, 4, 'Estándar Doble Queen', 0),
(71, 4, 50000, 4, 'Estándar Doble Queen', 0),
(72, 4, 50000, 4, 'Estándar Doble Queen', 0),
(73, 4, 50000, 4, 'Estándar Doble Queen', 0),
(74, 4, 50000, 4, 'Estándar Doble Queen', 0),
(75, 5, 52000, 6, 'Estándar Doble King Size', 0),
(76, 5, 52000, 6, 'Estándar Doble King Size', 0),
(77, 5, 52000, 6, 'Estándar Simple King Size', 0),
(78, 5, 52000, 6, 'Estándar Simple King Size', 0),
(79, 5, 52000, 6, 'Estándar Simple King Size', 0),
(80, 5, 52000, 6, 'Estándar Simple King Size', 0),
(81, 5, 52000, 6, 'Estándar Simple King Size', 0),
(82, 5, 52000, 6, 'Estándar Simple King Size', 0),
(83, 5, 52000, 6, 'Estándar Simple King Size', 0),
(84, 5, 52000, 6, 'Estándar Simple King Size', 0),
(85, 5, 52000, 6, 'Estándar Simple King Size', 0),
(86, 5, 52000, 6, 'Estándar Simple King Size', 0),
(87, 5, 52000, 6, 'Estándar Simple King Size', 0),
(88, 5, 52000, 6, 'Estándar Simple King Size', 0),
(89, 5, 52000, 6, 'Estándar Simple King Size', 0),
(90, 5, 52000, 6, 'Estándar Simple King Size', 0),
(91, 5, 52000, 6, 'Estándar Simple King Size', 0),
(92, 5, 52000, 6, 'Estándar Simple King Size', 0),
(93, 5, 52000, 6, 'Estándar Simple King Size', 0),
(94, 5, 52000, 6, 'Estándar Simple King Size', 0),
(95, 5, 52000, 6, 'Estándar Simple King Size', 0),
(96, 5, 52000, 6, 'Estándar Simple King Size', 0),
(97, 5, 52000, 6, 'Estándar Simple King Size', 0),
(98, 5, 52000, 6, 'Estándar Simple King Size', 0),
(99, 6, 55000, 3, 'Estándar Triple Individual', 0),
(100, 6, 55000, 3, 'Estándar Triple Individual', 0),
(101, 6, 55000, 3, 'Estándar Triple Individual', 0),
(102, 6, 55000, 3, 'Estándar Triple Individual', 0),
(103, 6, 55000, 3, 'Estándar Triple Individual', 0),
(104, 6, 55000, 3, 'Estándar Triple Individual', 0),
(105, 6, 55000, 3, 'Estándar Triple Individual', 0),
(106, 6, 55000, 3, 'Estándar Triple Individual', 0),
(107, 6, 55000, 3, 'Estándar Triple Individual', 0),
(108, 6, 55000, 3, 'Estándar Triple Individual', 0),
(109, 6, 55000, 3, 'Estándar Triple Individual', 0),
(110, 6, 55000, 3, 'Estándar Triple Individual', 0),
(111, 6, 55000, 3, 'Estándar Triple Individual', 0),
(112, 6, 55000, 3, 'Estándar Triple Individual', 0),
(113, 6, 55000, 3, 'Estándar Triple Individual', 0),
(114, 6, 55000, 3, 'Estándar Triple Individual', 0),
(115, 6, 55000, 3, 'Estándar Triple Individual', 0),
(116, 6, 55000, 3, 'Estándar Triple Individual', 0),
(117, 6, 55000, 3, 'Estándar Triple Individual', 0),
(118, 6, 55000, 3, 'Estándar Triple Individual', 0),
(119, 6, 55000, 3, 'Estándar Triple Individual', 0),
(120, 6, 55000, 3, 'Estándar Triple Individual', 0),
(121, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(122, 7, 58000, 3, 'Estándar Triple Queen + Simple ', 0),
(123, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(124, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(125, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(126, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(127, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(128, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(129, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(130, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(131, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(132, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(133, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(134, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(135, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(136, 7, 58000, 3, 'Estándar Triple Queen + Simple', 0),
(137, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(138, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(139, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(140, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(141, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(142, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(143, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(144, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(145, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(146, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(147, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(148, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(149, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(150, 8, 58500, 3, 'Estándar Triple King Size + Simple', 0),
(151, 9, 71000, 1, 'Suit Queen', 0),
(152, 9, 71000, 1, 'Suit Queen', 0),
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
(166, 10, 85000, 2, 'Suit King Size', 0),
(167, 10, 85000, 2, 'Suit King Size', 0),
(168, 10, 85000, 2, 'Suit King Size', 0),
(169, 10, 85000, 2, 'Suit King Size', 0),
(170, 10, 85000, 2, 'Suit King Size', 0),
(171, 10, 85000, 2, 'Suit King Size', 0),
(172, 10, 85000, 2, 'Suit King Size', 0),
(173, 10, 85000, 2, 'Suit King Size', 0),
(174, 10, 85000, 2, 'Suit King Size', 0),
(175, 10, 85000, 2, 'Suit King Size', 0),
(176, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(177, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(178, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(179, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(180, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(181, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(182, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(183, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(184, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(185, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(186, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(187, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(188, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(189, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(190, 11, 38300, 2, 'Capacidades diferentes Simple', 0),
(191, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(192, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(193, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(194, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(195, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(196, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(197, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(198, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(199, 12, 38700, 2, 'Capacidades diferentes Queen', 0),
(200, 12, 38700, 2, 'Capacidades diferentes Queen', 0);

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
  `telefono` bigint(20) NOT NULL,
  `domicilio` varchar(80) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `fechaNacimiento`, `correo`, `telefono`, `domicilio`, `estado`) VALUES
(1, 'Pablo', 'Martin', 555555555, '1982-02-27', 'agu@gmail.com', 0, 'San luis', 0),
(3, 'Lucas', 'Martin', 35944681, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 0),
(8, 'Lucia', 'Barrionuevo', 11111111, '1982-02-01', 'lucia@gmail.com', 555555555, 'fgrgrtggr', 1),
(9, 'Roberto', 'Martin', 333333333, '1982-02-27', 'agu@gmail.com', 4535, 'San luis', 0),
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
(46, 'Luis', 'Armoni', 147852369, '1988-10-20', 'Luis@hotmail.com', 369852147, 'La pampa477', 1);

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
(12, 'Capacidades diferentes Queen', 1, 2, 'Matrimonial Queen', 38700, 0);

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
  ADD UNIQUE KEY `idHabitacion` (`idHabitacion`),
  ADD KEY `reserva_ibfk_1` (`idHuesped`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipodehabitacion`),
  ADD UNIQUE KEY `precioNoche` (`precioNoche`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipodehabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

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
