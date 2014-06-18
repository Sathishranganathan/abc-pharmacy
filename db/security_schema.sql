SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `pharmacy` ;
CREATE SCHEMA IF NOT EXISTS `pharmacy` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `pharmacy` ;

-- -----------------------------------------------------
-- Table `pharmacy`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pharmacy`.`user` ;

CREATE  TABLE IF NOT EXISTS `pharmacy`.`user` (
  `id` VARCHAR(45) NOT NULL ,
  `first_name` VARCHAR(45) NULL ,
  `last_name` VARCHAR(45) NULL ,
  `userid` VARCHAR(45) NOT NULL ,
  `email` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pharmacy`.`role` ;

CREATE  TABLE IF NOT EXISTS `pharmacy`.`role` (
  `id` VARCHAR(45) NOT NULL ,
  `name` VARCHAR(45) NOT NULL ,
  `description` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy`.`permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pharmacy`.`permission` ;

CREATE  TABLE IF NOT EXISTS `pharmacy`.`permission` (
  `id` VARCHAR(45) NOT NULL ,
  `name` VARCHAR(45) NULL ,
  `code` VARCHAR(45) NOT NULL ,
  `description` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy`.`user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pharmacy`.`user_role` ;

CREATE  TABLE IF NOT EXISTS `pharmacy`.`user_role` (
  `id` VARCHAR(45) NOT NULL ,
  `user_id` VARCHAR(45) NOT NULL ,
  `role_id` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_user_role_user_idx` (`user_id` ASC) ,
  INDEX `fk_user_role_role1_idx` (`role_id` ASC) ,
  CONSTRAINT `fk_user_role_user`
    FOREIGN KEY (`user_id` )
    REFERENCES `pharmacy`.`user` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_role1`
    FOREIGN KEY (`role_id` )
    REFERENCES `pharmacy`.`role` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy`.`role_permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pharmacy`.`role_permission` ;

CREATE  TABLE IF NOT EXISTS `pharmacy`.`role_permission` (
  `id` VARCHAR(45) NOT NULL ,
  `role_id` VARCHAR(45) NOT NULL ,
  `permission_id` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_role_permission_role1_idx` (`role_id` ASC) ,
  INDEX `fk_role_permission_permission1_idx` (`permission_id` ASC) ,
  CONSTRAINT `fk_role_permission_role1`
    FOREIGN KEY (`role_id` )
    REFERENCES `pharmacy`.`role` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permission_permission1`
    FOREIGN KEY (`permission_id` )
    REFERENCES `pharmacy`.`permission` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `pharmacy` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
