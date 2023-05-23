-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 23-05-2023 a las 05:03:16
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `apellido_paciente` varchar(70) COLLATE utf8mb4_unicode_ci NOT NULL,
  `direccion_paciente` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_paciente` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ident_paciente` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nombre_paciente` varchar(70) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefono_paciente` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `apellido_paciente`, `direccion_paciente`, `email_paciente`, `ident_paciente`, `nombre_paciente`, `telefono_paciente`) VALUES
(1, 'Cortez Barrera', 'calle falsa 123', 'franklinrony2@gmail.com', '12344', 'Franklin Rony', '44444'),
(2, 'Perez', 'sdsdd', 'juan.perez@email.com', '33232', 'Juan', '3343434'),
(3, 'Cortez Barrera', 'calle falsa 123', 'maritere@gmail.com', '12344', 'Maria Teresa', '44444');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
