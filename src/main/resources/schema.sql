CREATE DATABASE IF NOT EXISTS `poll` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `poll`.`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB, CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `poll`.`poll_subject` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `subject` VARCHAR(128) NOT NULL,
  `expiration_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_poll_subject_user_id` (`user_id` ASC),
  CONSTRAINT `fk_poll_subject_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `poll`.`user` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB, CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `poll`.`sub_item` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `subject_id` BIGINT NOT NULL,
  `description` VARCHAR(128) NOT NULL,
  `number` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_sub_item_subject_id` (`subject_id` ASC),
  CONSTRAINT `fk_sub_item_subject_id`
    FOREIGN KEY (`subject_id`)
    REFERENCES `poll`.`poll_subject` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB, CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `poll`.`poll_history` (
  `id` BIGINT NOT NULL,
  `user_id` BIGINT NOT NULL,
  `subject_id` BIGINT NOT NULL,
  `sub_item_id` BIGINT NOT NULL,
  `date` DATETIME NOT NULL,
  `ip` VARCHAR(39),
  INDEX `idx_poll_history_user_id` (`user_id` ASC),
  INDEX `idx_poll_history_subject_id` (`subject_id` ASC),
  INDEX `idx_poll_history_sub_item_id` (`sub_item_id` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_poll_history_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `poll`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_poll_history_subject_id`
    FOREIGN KEY (`subject_id`)
    REFERENCES `poll`.`poll_subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_poll_history_sub_item_id`
    FOREIGN KEY (`sub_item_id`)
    REFERENCES `poll`.`sub_item` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB, CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;