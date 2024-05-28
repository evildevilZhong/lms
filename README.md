# lms
library management system

## 简介

基于JAVA技术栈实现的图书后台管理系统(基于macrozheng/mal项目提供的脚手架开发)。基于SpringSecurity使用JWT对用户进行认证，
可动态配置为角色分配资源访问权限。

### 项目开发测试启动
1、运行/lms-library/src/main/java/com/chung/lms/LmsAdminApplication.java的main函数启动</br>
2、数据库为mysql5.8, 数据库表schema及测试数据脚本路径为/document/sql/lms.sql</br>
3、swagger页面访问路径http://localhost:8089/swagger-ui/#/

### 组织结构
lms-common -- 工具类及通用代码</br>
lms-mbg -- 数据库操作代码</br>
lms-security -- 登录鉴权相关代码</br>
lms-library -- 图书管理系统业务逻辑代码

### 开发环境依赖

| 工具          | 版本号 | 下载                                                         |
| ------------- | ------ | ------------------------------------------------------------ |
| JDK           | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| MySQL         | 5.8    | https://www.mysql.com/                                       |
| Redis         | 7.0    | https://redis.io/download                                    |
| Nginx         | 1.22   | http://nginx.org/en/download.html                            |
