CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `account` varchar(100) NOT NULL COMMENT '账号',
  `pass_word` varchar(100) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) COMMENT='用户信息表';