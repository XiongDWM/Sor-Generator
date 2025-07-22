# SOR(.sor) files generate
[English](README.md) | [中文](README.zh-CN.md)

Generate SOR (.sor) files following Telcordia's SR-4731 Issue 2 (July 2011) standard.

## Features

- Supports serialization of all standard SOR blocks: MapBlock, GeneralParametersBlock, SupplierParametersBlock, FixedParametersBlock, KeyEventsBlock, PtsBlock
- Extensible: all blocks and protocol conversion logic can be customized via generics and abstract classes
- Strict Big Endian byte order, fully compatible with OTDR industry standards
- Can be used as a Java library in any project, supports Gradle/Maven dependency and publishing

## Quick Start

```java
// Extend GenBlockMethods and implement your own data-to-SOR conversion logic
public class MyBlockMethods extends GenBlockMethods<MyDataType> {
    @Override
    public SorFullProtocol convertSorProtocol(MyDataType origin) {
        SorFullProtocol sor = new SorFullProtocol();
        // Fill in each block as needed
        // sor.setGpBlock(...);
        // sor.setFpBlock(...);
        // ...
        return sor;
    }
}

// Serialize to SOR byte array
MyBlockMethods methods = new MyBlockMethods();
SorFullProtocol sor = methods.convertSorProtocol(myData);
byte[] sorBytes = methods.getProtocolBytes(sor);
```

## Publishing & Dependency

- Supports publishing to Maven repositories via Gradle (make sure to configure `publishing` and credentials)
- Example dependency:

```groovy
implementation 'org.xiong:genSor:1.0.0'
``` 

## Reference

- [Telcordia SR-4731 Issue 2, July 2011](https://telecom-info.njdepot.ericsson.net/site-cgi/ido/docs.cgi?ID=SEARCH&DOCUMENT=SR-4731)
- OTDR fiber test industry standard

---

For more usage details or questions, please open an issue!