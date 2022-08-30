# keenJavaTest-aop

君匡出品，AspectJ项目的Demo
为什么我是每个模块都要重复引用一次依赖呢？
因为我要保证每个模块都是独立的，都是能够拉取下来，导入依赖后直接运行的！

## 环境
因为不同机器，配置的依赖环境是不同的，所以有时是需要具体地指明jar包位置时，
在win环境上，就是-javaagent:"D:\MavenRepository\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar"
而在Mac环境上，就是-javaagent:/Users/keen/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar

# 更新记录
修改日志依赖
log4j-slf4j-impl 升到2.15.0
disruptor升到3.4.4