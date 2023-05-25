放心，下面的三个模块都是绝对独立的，都归属于自己本身。

为了方便理解，我就不用pom依赖的方式了（属实是多此一举，因为pom就是简化依赖的而已），而是单独地给大家展示一下三个独立项目是如何一起协作运行起来的。

keen-threeParts-service作为提供服务的模块，只是纯粹的一个方法而已。将整个模块用mvn:install打包到本地仓库，在生产上可以直接打包，方便其他模块去调用。

keen-threeParts-client作为客户端模块，就是纯粹地调用服务模块，进行业务操作而已。

keen-threeParts-aspect作为切面，**需要在不侵入原有代码的前提下**，进行织入，提供入参出参的打印和运行时间的统计。

放心，下面的三个模块都是绝对独立的，都归属于自己本身。

为了方便理解，我就不用pom依赖的方式了（属实是多此一举，因为pom就是简化依赖的而已），而是单独地给大家展示一下三个独立项目是如何一起协作运行起来的。

keen-threeParts-service作为提供服务的模块，只是纯粹的一个方法而已。将整个模块用mvn:install打包到本地仓库，在生产上可以直接打包，方便其他模块去调用。

keen-threeParts-client作为客户端模块，就是纯粹地调用服务模块，进行业务操作而已。

keen-threeParts-aspect作为切面，**需要在不侵入原有代码的前提下**，进行织入，提供入参出参的打印和运行时间的统计。


java -Dfile.encoding=utf-8 -jar
-javaagent:"C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar"


C:\allSdk\Java\jdk1.8.0_201\bin\java.exe -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -Dfile.encoding=UTF-8 -classpath .;C:\allSdk\Java\jdk1.8.0_201\jre\lib\charsets.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\deploy.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\dnsns.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\jaccess.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\localedata.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\nashorn.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\servlet-api.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunec.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\zipfs.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\javaws.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jce.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jfr.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jfxswt.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jsse.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\management-agent.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\plugin.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\resources.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\rt.jar;C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-client\target\classes;C:\Users\Administrator\Documents\channelsoft\MavenRepo\xyz\clzly\keen-threeParts-service\1.0.0-SNAPSHOT\keen-threeParts-service-1.0.0-SNAPSHOT.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjrt\1.8.13\aspectjrt-1.8.13.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\com\lmax\disruptor\3.4.4\disruptor-3.4.4.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\apache\logging\log4j\log4j-slf4j-impl\2.15.0\log4j-slf4j-impl-2.15.0.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\com\alibaba\fastjson\1.2.75\fastjson-1.2.75.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\apache\logging\log4j\log4j-api\2.15.0\log4j-api-2.15.0.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\apache\logging\log4j\log4j-core\2.15.0\log4j-core-2.15.0.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\xyz\clzly\keen-threeParts-aspect\1.0-SNAPSHOT\keen-threeParts-aspect-1.0-SNAPSHOT.jar -jar xyz.clzly.KeenMain


java -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -Dfile.encoding=UTF-8  -jar C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-client\target\keen-threeParts-client-1.0-SNAPSHOT-keen-jar-with-dependencies.jar


cd C:\Users\Administrator\Downloads\aspectJDemo

java -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar "-Dfile.encoding=UTF-8" -jar compare-1.0.jar

java -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -Dfile.encoding=UTF-8 -jar 

-javaagent:"C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar"


java -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar  -Dfile.encoding=UTF-8 -classpath .;C:\allSdk\Java\jdk1.8.0_201\jre\lib\charsets.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\deploy.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\dnsns.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\jaccess.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\localedata.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\nashorn.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\servlet-api.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunec.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext\zipfs.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\javaws.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jce.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jfr.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jfxswt.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\jsse.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\management-agent.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\plugin.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\resources.jar;C:\allSdk\Java\jdk1.8.0_201\jre\lib\rt.jar;C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-client\target\classes;C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-service\target\classes;C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\Administrator\Documents\channelsoft\MavenRepo\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-aspect\target\keen-threeParts-aspect-1.0-SNAPSHOT-keen-jar-with-dependencies.jar -jar C:\Users\Administrator\Desktop\aspect\keen-threeParts-client-1.0-SNAPSHOT-keen-jar-with-dependencies.jar

# aspectj1.8
export PATH=$PATH:/Users/abeffect/Green/AspectJ/aspectj1.8/bin
export CLASSPATH="/Users/abeffect/Green/AspectJ/aspectj1.8/lib/aspectjrt.jar:$CLASSPATH"


C:\allSdk\Java\aspectJ1.8\bin\ajc  -inpath C:\Users\Administrator\Desktop\aspect\keen-threeParts-client-1.0-SNAPSHOT-keen-jar-with-dependencies.jar C:\Users\Administrator\Documents\keen\projects\keenJavaTest-aop\keen-threeParts\keen-threeParts-aspect\src\main\java\xyz\clzly\aspect\KeenPrintTimeAndArgsAspect.java -cp "C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjrt\1.8.13\aspectjrt-1.8.13.jar" -d C:\Users\Administrator\Desktop\aspect\new.jar

jar cf hello.jar compare-1.0

jar cvfm FirstApplet.jar C:\Users\Administrator\Downloads\aspectJDemo\compare-1.0\META-INF\MANIFEST.MF compare-1.0

java -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -Djava.ext.dirs="%JAVA_HOME%jre\lib\ext;."  -Dfile.encoding=UTF-8 -jar 


java -Djava.ext.dirs=".;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext"  -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar  -jar  compare-1.0.jar

java -Djava.ext.dirs="./keen-threeParts-aspect-1.0-SNAPSHOT.jar;%JAVA_HOME%jre\lib\ext"  -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar  -jar  compare-1.0.jar

java -cp "C:\Users\Administrator\Downloads\aspectJDemo\keen-threeParts-aspect-1.0-SNAPSHOT.jar;%CLASSPATH%"

java -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar -cp "./keen-threeParts-aspect-1.0-SNAPSHOT.jar; %CLASSPATH%"  -jar  compare-1.0.jar

java -Djava.ext.dirs=".;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext"  KeenTest

java -cp ".;C:/allSdk/Java/jdk1.8.0_201/jre/" KeenTest

java -Djava.ext.dirs="./libsKeen;C:\allSdk\Java\jdk1.8.0_201\jre\lib\ext"  -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar  -jar  compare-1.0.jar