-----------------------
test当中用的是
MybatisGenerator

1. 所以整个项目的pom.xml要添加这个
		<dependency>
    		<groupId>org.mybatis.generator</groupId>
    		<artifactId>mybatis-generator-maven-plugin</artifactId>
    		<version>1.4.0</version>
		</dependency>

2. 然后我还要用个mygeneratorConfig.xml
来设置数据库的url等等

3.之后我再用个类写一些代码然后run, 从而去读取这个xml，然后把数据库里的某个表进行反向工程，
生成对应的配置文件
例如
model, mapper.java, mapper.xml/其他

例如
 <javaClientGenerator targetPackage="com.mytest.testweb_package.testmybatis" type="XMLMAPPER" 
这里的type 可以换成
        type：选择怎么生成mapper接口（在MyBatis3/MyBatis3Simple下）：
            1，ANNOTATEDMAPPER：会生成使用Mapper接口+Annotation的方式创建（SQL生成在annotation中），不会生成对应的XML；
            2，MIXEDMAPPER：使用混合配置，会生成Mapper接口，并适当添加合适的Annotation，但是XML会生成在XML中；
            3，XMLMAPPER：会生成Mapper接口，接口完全依赖XML；

4. 因为在这个工程里 我想要生成到test下的某个位置，
毕竟生成以后我还得 审查一些 ，说不定改点东西
所以可能因为类里写的 package的位置 与当前所在的test下的位置不符，会有报错，
但这个 无伤大雅，不影响运行的
-------------------------------------