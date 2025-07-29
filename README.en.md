# SOR(.sor) files generate
[English](README.en.md) | [中文](README.md)

Generate SOR (.sor) files following Telcordia's SR-4731 Issue 2 (July 2011) standard.

## Features

- Supports serialization of all standard SOR blocks: MapBlock, GeneralParametersBlock, SupplierParametersBlock, FixedParametersBlock, KeyEventsBlock, PtsBlock
- Extensible: all blocks and protocol conversion logic can be customized via generics and abstract classes
- Strict Big Endian byte order, fully compatible with OTDR industry standards
- Can be used as a Java library in any project, supports Gradle/Maven dependency and publishing

## Quick Start

```java
import org.xiong.sor.GenBlockMethods;
import org.xiong.sor.blocks.SorFullProtocol;

// Define your own data type, e.g. SorSample
SorSample sample = new SorSample(new int[]{1, 2, 3}, "Sample Event");

// Use anonymous class or subclass to implement your conversion logic
GenBlockMethods<SorSample> genBlockMethods = new GenBlockMethods<>() {
    @Override
    public SorFullProtocol convertSorProtocol(SorSample origin) {
        SorFullProtocol sor = new SorFullProtocol();
        // Fill in each block as needed
        // sor.setGpBlock(...);
        // sor.setFpBlock(...);
        // ...
        return sor;
    }
};

// Convert your data to SOR protocol and get the byte array
SorFullProtocol protocol = genBlockMethods.convertSorProtocol(sample);
byte[] sorBytes = GenBlockMethods.getProtocolBytes(protocol);
```

## Publishing & Dependency

- Supports publishing to Maven repositories via Gradle (make sure to configure `publishing` and credentials)
- Example dependency:

```groovy
implementation 'org.xiong:sor-generator:1.0.0'
``` 

## Reference

- [Telcordia SR-4731 Issue 2, July 2011](https://telecom-info.njdepot.ericsson.net/site-cgi/ido/docs.cgi?ID=SEARCH&DOCUMENT=SR-4731)
- OTDR fiber test industry standard

---

For more usage details or questions, please open an issue!