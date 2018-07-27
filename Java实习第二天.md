### 问题:
- [x] 一但run(…) 方法报错，整个程序立刻终止。

### SQL:
1. 备份一张表在同一个数据库:
   ' CREATE A_bak select * from A '
2. 判断两张表是否一样:
   

### 常用包:

### Spring Cloud:
1. 项目模块:
项目分为三个模块:api,web,provider
api:
- api中包含公有资源，实体类，对内对外接口
- api中server包里放对内接口，web包放对外接口
provider:
- 放置对微服务的接口，这些接口都是由外部用户调用，依赖api模块
web:
- 所有接口的实现
   
2. 配置加载与工作:
- 通过配置中心获取配置
- label: 来源于git配置中心哪个分支
