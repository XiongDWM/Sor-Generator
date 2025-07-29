# SOR(.sor) 文件生成
[中文](READM.md)｜[English](README.en.md) 

生成 SOR (.sor) 文件，遵循 Telcordia SR-4731 issue2 (July 2011) 标准。

## 特点

- 支持 SOR 文件各标准块（MapBlock、GeneralParametersBlock、SupplierParametersBlock、FixedParametersBlock、KeyEventsBlock、PtsBlock）的序列化
- 所有块均可自定义扩展，支持泛型和抽象转换
- 字节序严格遵循大端（Big Endian），兼容 OTDR 行业标准
- 可作为 Java 库集成到任意项目，支持通过 Gradle/Maven 依赖

## 快速开始

```java
import org.xiong.sor.GenBlockMethods;
import org.xiong.sor.blocks.SorFullProtocol;

// 定义的数据类型, 例如 SorSample
SorSample sample = new SorSample(new int[]{1, 2, 3}, "Sample Event");

// 使用匿名类或子类实现自定义数据类和SOR协议封装的转换
GenBlockMethods<SorSample> genBlockMethods = new GenBlockMethods<>() {
    @Override
    public SorFullProtocol convertSorProtocol(SorSample origin) {
        SorFullProtocol sor = new SorFullProtocol();
        // 按需填充各个数据块
        // sor.setGpBlock(...);
        // sor.setFpBlock(...);
        // ...
        return sor;
    }
};

// 转换数据并获取序列化数据
SorFullProtocol protocol = genBlockMethods.convertSorProtocol(sample);
byte[] sorBytes = GenBlockMethods.getProtocolBytes(protocol);
```

## 发布与依赖

- 支持通过 Gradle 发布到 Maven 仓库（需配置 publishing 和凭证）
- 依赖方式（示例）：

```groovy
implementation 'org.xiong:sor-generator:1.0.0'
```

## 参考

- [Telcordia SR-4731 issue2, July 2011](https://telecom-info.njdepot.ericsson.net/site-cgi/ido/docs.cgi?ID=SEARCH&DOCUMENT=SR-4731)
- OTDR 光纤测试行业标准

---

如需详细用法或遇到问题，欢迎提 issue！