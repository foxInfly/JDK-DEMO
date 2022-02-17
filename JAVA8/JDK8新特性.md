#JDK8 新特性
##课程介绍
1. JavaSE的发展历史
2. 了解OpenJDK 和 Oracle JDK
3. JDK8 新特性
    - Lambda表达
    - 集合之stream流式操作
    - 接口的增强
    - 并行数组排序
    - Optional中避免Null检查
    - 新的时间和日期API
    - 可重复注解

jdk8发布于2014.03.18

##1. JavaSE的发展历史
Sun公司在1991年成立了一个称为绿色计划(Green Project )的项目，由James Gosling(高斯林)博土领导，绿色计划的目的是开发一种能够在各种消费性电子产品(机顶盒、冰箱、收音机等)上运行的程序架构。这个项目的产品就是Java语言的前身:Oak(橡树)。Oak当时在消费品市场上并不算成功，但随着1995年互联网潮流的兴起，Oak迅速找到了最适合自己发展的市场定位。
- JDK Beta - 1995
- JDK 1.0 - 1996年1月(真正第一个稳定的版本JDK1.0.2，被称作Java 1)
- JDK 1.1 - 1997年2月
- J2SE 1.2 - 1998年12月
  - J2SE (Java 2 Standard Edition，Java 2平台的标准版)，应用于桌面环境。
  - J2ME (ava 2 Micro Edition，Java 2平台的微型版)，应用于移动、无线及有限资源的环境。
  - J2EE CJava 2 Enterprise Edition，Java 2平台的企业版)，应用于基于Java的应用服务器。
- J2SE 1.3 - 2000年5月
- J2SE 1.4- 2002年2月
- J2SE 5.0 - 2004年9月
- Java SE 6 - 2006年12月
- Java SE 7- 2011年7月
- Java sE 8 (LTS) - 2014年3月
- Java SE 9 - 2017年9月
- Java SE 10 (18.3)- 2018年3月
- Java SE 11 (18.9 LTS) - 2018年9月
- Java SE 12 (19.3)- 2019年3月
- Java SE 13(19.9) - 2019年9月

##2. 了解OpenJDK 和 Oracle JDK
###openJDK来源
Java由Sun公司发明，Open JDK是Sun在2006年末把Java开源而形成的项目。也就是说Open JDK是Java SE平台版的开源和免费实现，它由SUN和Java社区提供支持，2009年Oracle收购了Sun公司，自此Java 的维护方之一的SUN也变成了Oracle,
###open JDK和Oracle JDK的关系
大多数JDK 都是在Open JDK的基础上进一步编写实现的，如 IBM 9,Oracle JDK和Azul zulu, AzulZing。Oracle JDK完全由Oracle公司开发，Oracle JDK是基于Open JDK源代码的商业版本。此外，它包含闭源组件。Oracle JDK根据二进制代码许可协议获得许可，在没有商业许可的情况下，在2019年1月之后发布的OracleJava SE 8的公开更新将无法用于商业或生产用途。但是Open JDK是完全开源的，可以自由使用。

###pen JDK官网介绍
- open JDK官网: http://openjdk.java.net/
- JDK Enhancement ProposalsUJDK增强建议)。通俗的讲JEP就是JDK的新特性

###3. JDK8 新特性
####3.1 Lambda
