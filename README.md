# SOR(.sor) 文件生成
[中文](README.md)｜[English](README.en.md) 

生成 SOR (.sor) 文件，遵循 Telcordia SR-4731 issue2 (July 2011) 标准。

## 特点

- 支持 SOR 文件各标准块（MapBlock、GeneralParametersBlock、SupplierParametersBlock、FixedParametersBlock、KeyEventsBlock、PtsBlock）的序列化
- 所有块均可自定义扩展，支持泛型和抽象转换
- 字节序严格遵循大端（Big Endian），兼容 OTDR 行业标准
- 可作为 Java 库集成到任意项目，支持通过 Gradle/Maven 依赖

## 快速开始

```java
// 继承 GenBlockMethods，实现自己的数据到 SOR 协议的转换
public class MyBlockMethods extends GenBlockMethods<MyDataType> {
    @Override
    public SorFullProtocol convertSorProtocol(MyDataType origin) {
        // 构建并填充各 Block
        SorFullProtocol sor = new SorFullProtocol();
        // ...填充各 block...
        return sor;
    }
}

// 序列化为 SOR 字节流
MyBlockMethods methods = new MyBlockMethods();
SorFullProtocol sor = methods.convertSorProtocol(myData);
byte[] sorBytes = methods.getProtocolBytes(sor);
```

## 发布与依赖

- 支持通过 Gradle 发布到 Maven 仓库（需配置 publishing 和凭证）
- 依赖方式（示例）：

```groovy
implementation 'org.xiong:genSor:1.0.0'
```

## 参考

- [Telcordia SR-4731 issue2, July 2011](https://telecom-info.njdepot.ericsson.net/site-cgi/ido/docs.cgi?ID=SEARCH&DOCUMENT=SR-4731)
- OTDR 光纤测试行业标准

---

如需详细用法或遇到问题，欢迎提 issue！