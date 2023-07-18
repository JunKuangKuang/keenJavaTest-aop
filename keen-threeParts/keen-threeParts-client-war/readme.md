专门给Tomcat部署的war包，参考文档
https://blog.csdn.net/xiaozhuzhuyang/article/details/118605060

可参考的小项目
https://blog.csdn.net/qq_45464930/article/details/116062110

需要在配置文件catlina.bat中配置
set "JAVA_OPTS=%JAVA_OPTS% %JSSE_OPTS%  -Dfile.encoding=UTF-8 -javaagent:C:\Users\Administrator\Documents\channelsoft\MavenRepo\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar"

其次需要在部署的Artifacts里面引入指定的切面依赖，就可以了。

如果还不生效，建议先在项目里用切面能够成功切入了再把切面单独拎出来。


加载时织入的案例https://qa.1r1g.com/sf/ask/702246471/
