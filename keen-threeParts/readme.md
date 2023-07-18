放心，下面的三个模块都是绝对独立的，都归属于自己本身。

为了方便理解，我就不用pom依赖的方式了（属实是多此一举，因为pom就是简化依赖的而已），而是单独地给大家展示一下三个独立项目是如何一起协作运行起来的。

keen-threeParts-service作为提供服务的模块，只是纯粹的一个方法而已。将整个模块用mvn:install打包到本地仓库，在生产上可以直接打包，方便其他模块去调用。

keen-threeParts-client作为客户端模块，就是纯粹地调用服务模块，进行业务操作而已。

keen-threeParts-aspect作为切面，**需要在不侵入原有代码的前提下**，进行织入，提供入参出参的打印和运行时间的统计。

需要注意的是，在META-INF/aop.xml文件的weaver标签内，应该把切面所在路径和切入目标所在路径都加入进去！！！
本样例中，只是因为两者的路径一样所以看起来是一条。

keen-threeParts-client-war作为客户端war部署模块，就是用springboot打包成war类型之后在tomcat上面运行服务。

java -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -cp "./keen-threeParts-aspect-1.0-SNAPSHOT.jar; %CLASSPATH%"  -jar  compare-1.0.jar

java -Djava.ext.dirs=".;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext"  KeenTest

java -cp ".;C:/allSdk/Java/jdk1.8.0_201/jre/" KeenTest

java -Djava.ext.dirs="./libsKeen;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext"  -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar  -jar  compare-1.0.jar
