CREATE SCHEMA `database` DEFAULT CHARACTER SET utf8;

CREATE TABLE `database`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Кожевин', 'Святослав', 'koz@cv.com', 'Москва');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Покалюк', 'Лев', 'pokal@lev.com', 'Воронеж');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Мусин', 'Радислав', 'mus@rag.com', 'Белгород');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Мощенский', 'Артемий', 'mosh@art.com', 'Краснодар');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Боголепов', 'Борис', 'bog@bor.com', 'Москва');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Курдиков', 'Вадим', 'kyrd@vad.com', 'Воронеж');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Друганин', 'Арсений', 'dgug@ars.com', 'Воронеж');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Кочнев', 'Артемий', 'koch@ar.com', 'Москва');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Донцов', 'Дмитрий', 'don@dmtr.com', 'Краснодар');
INSERT INTO `database`.`users` (`surname`, `name`, `email`, `city`) VALUES ('Волобуев', 'Остап', 'volob@ost.com', 'Курск');