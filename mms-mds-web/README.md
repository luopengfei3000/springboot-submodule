
SpringBoot基于main方法启动时，默认会自动扫描本包及本包下所有子包的内容，所以我们将main方法向外提一层；

**例如：**

情况一：`mms-mds-web` 模块，启动类 `MmsMdsWebApplication` 在包 `com.luopf.example` 下面，则启动项目时，则自动扫描 `com.luopf.example` 包下面的类，如果service，service-impl类也在 `com.luopf.example` 包路径下，则启动时加载这些类。

情况二：`mms-mds-web` 模块，启动类 `MmsMdsWebApplication` 在包 `com.luopf.example.mmsmdsweb` 下面，则启动项目时，则自动扫描 `com.luopf.example.mmsmdsweb` 包下面的类，如果service，service-impl类在 `com.luopf.example` 包路径下，则启动时不加载此类。此时需要在启动在 `MmsMdsWebApplication` 启动类中加入注解 `@ComponentScan(value="com.luopf.example")` ，则启动时加载这些类。