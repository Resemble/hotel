/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-11-05 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `pass_word` varchar(200) DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(32) DEFAULT NULL,
  `nick_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

INSERT INTO users(id, user_name, pass_word, user_sex, nick_name) VALUES (1, 'name', 'password', 'man', 'nickName1'),
  (2, 'name2', 'password', 'man', 'nickName2'),(3, 'name3', 'password', 'man', 'nickName3');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (3, '赵云', '213', 'man', 'nickName3');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (4, '夏侯渊', '324234', 'man', '佛挡杀佛');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (6, '夏侯淳', '2314', '男', '3432');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (7, '关羽', '123423', 'man', '管二哥');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (8, '张飞', '123432', '男', '张飞');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (10, '刘备', '2323', '男', '留个');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (11, '李晓', '134', 'man', '晓');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (12, '诸葛亮2', '23432', '男', '孔明');
INSERT INTO test.users (id, user_name, pass_word, user_sex, nick_name) VALUES (13, '貂蝉', '123432', '女', '吊');
