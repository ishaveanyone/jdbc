# database connection pool 
连接池是一种众所周知的数据访问模式，其主要目的是减少执行数据库连接和读/写数据库操作所涉及的开销。

因为与数据库交互中 最大的开销其实就是连接 ，避免重复连接数据库时使用数据库连接池的目的所在

现在公司用的时druid 数据库连接池 ，但是看了外网说日本人开发的那个hikaricp 性能更加的优秀，他自己的git 说明上还给了专门的测试截图

下面给出 一个issue 两个数据库连接池的作者在里面争论过 ：
https://github.com/brettwooldridge/HikariCP/issues/232

druid 主要是用于数据库连接的运维和监测，偏向与管理