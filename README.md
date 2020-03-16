# InfectStatisticWeb-main

###工具
- Eclipse IDE for Enterprise Java Developers - 2019-12
- apache-tomcat-9.0.31
- MySQL Server 5.5
- jdk1.8.0

###流程
- 1、新建Dynamic Web Project，设置如图
![01](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613475901.png)
![02](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613480802.png)
![03](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613481603.png)
- 2、如图将Index.jsp、province.jsp、文件夹echarts放入根目录下的WebContent内，WebContent\WEB-INF\lib下的mysql-connector-java-5.1.46.jar粘贴至对应路径（如图）
![11](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613482311.png)
![12](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613482812.png)
- 3、src下新建infect.web，将src\infect\web文件夹下的五个java文件粘贴至对应路径（如图）
![41](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_200316135010001.png)
![42](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_200316135014002.png)
- 4、log文件夹粘贴至D盘根目录（或如图在infect.web下的 File_handle.java中自定义日志文件路径）；在infect.web下的 DBTool文件中修改数据库配置（如图）
![31](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613484022.png)
![32](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613484423.png)
- 5、在Index.jsp页面点击run on server，设置如图
![41](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613484931.png)
![42](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_20031613485532.png)
- 6、将url复制至浏览器打开（以查看交互效果）
![43](https://images.cnblogs.com/cnblogs_com/myblog001/1670623/o_200316135020003.png)