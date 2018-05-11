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

DROP TABLE IF EXISTS `diagnosis_score`;
CREATE TABLE IF NOT EXISTS diagnosis_score (
  datekey INT PRIMARY KEY COMMENT '日期',
  room_night INT COMMENT '间夜',
  intention_unique_visitor INT COMMENT '意向UV',
  intention_pay_rate DOUBLE COMMENT '意向支付率',
  close_lose_rate DOUBLE COMMENT '关房lose率 lose跟竞对比较',
  has_house_rate DOUBLE COMMENT '时均有房率',
  competition_situation INT COMMENT '竞争形式'
)ENGINE=InnoDB  COMMENT = '诊断得分表';

INSERT INTO diagnosis_score(datekey, room_night, intention_unique_visitor, intention_pay_rate, close_lose_rate, has_house_rate, competition_situation) VALUES
  (20180504, 3, 88, 0.618, 0.22, 0.33, 1),(20180505, 3, 82, 0.718, 0.42, 0.43, 2),(20180506, 1, 82, 0.818, 0.22, 0.33, 1);

SELECT datekey, room_night, intention_unique_visitor, intention_pay_rate, close_lose_rate, has_house_rate, competition_situation FROM diagnosis_score;



DROP TABLE IF EXISTS monitor_list;
CREATE TABLE IF NOT EXISTS monitor_list (
  datekey INT PRIMARY KEY COMMENT '日期',
  room_night INT COMMENT '入住间夜',
  cross_income INT COMMENT '入住毛收入',
  high_star_room_night INT COMMENT '高星入住间夜',
  high_star_cross_income INT COMMENT '高星入住毛收入',
  intention_unique_visitor INT COMMENT '酒店意向UV',
  intention_pay_rate DOUBLE COMMENT '意向支付率',
  pay_user_cnt INT COMMENT '支付用户数',
  close_lose_rate DOUBLE COMMENT '关房lose率',
  has_house_rate DOUBLE COMMENT '时均有房率',
  original_lose_rate DOUBLE COMMENT '原价Lose率',
  fact_lose_rate DOUBLE COMMENT '实价Lose率',
  competition_situation INT COMMENT '竞争形式'
)ENGINE=InnoDB  COMMENT = '诊断得分表';

INSERT INTO monitor_list(datekey, room_night, cross_income, high_star_room_night, high_star_cross_income, intention_unique_visitor, intention_pay_rate, pay_user_cnt, close_lose_rate, has_house_rate, original_lose_rate, fact_lose_rate, competition_situation) VALUES
  (20180504, 3, 23434, 2, 943, 88, 0.618, 3, 0.22, 0.33, 0.32, 0.44, 1),
  (20180505, 3, 23434, 2, 943, 82, 0.718, 3, 0.42, 0.43, 0.32, 0.44, 2),
  (20180506, 1, 23434, 2, 943, 82, 0.818, 3, 0.22, 0.33, 0.32, 0.44, 1);

SELECT datekey, room_night, cross_income, high_star_room_night, high_star_cross_income, intention_unique_visitor, intention_pay_rate, pay_user_cnt, close_lose_rate, has_house_rate, original_lose_rate, fact_lose_rate, competition_situation FROM monitor_list;
