# openapi JAVA SDK
## 环境依赖
SDK 支持 JDK  1.8 及以上版本。

## 安装 SDK
安装 SDK 的方式有两种：maven 安装和源码安装。



- maven安装
在 maven 工程中使用 pom.xml 添加相关依赖，内容如下：

请将代码打包并上传到自己公司的Maven私服。应用在实际使用时只需要按照如下方式引入即可。

```
 <dependency>
            <groupId>com.fang</groupId>
            <artifactId>openapi</artifactId>
            <version>1.0.0</version>
</dependency>
```

- 源码安装
从 [Java SDK](https://github.com/fangjjy/openapi_sdk_java) 下载源码，通过 maven 导入。比如 eclipse，依次选择 File->Import->maven->Existing Maven Projects。

## 卸载 SDK
卸载 SDK 的方式即删除 pom 依赖或源码。

## SDK文档
点击查看[SDK文档]()

## 接口文档
点击查看[接口文档](https://github.com/fangjjy/openapi_document/wiki)