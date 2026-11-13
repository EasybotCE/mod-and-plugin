# mod-and-plugin
存放EasyBot-CE的模组和插件代码的仓库

## 构建（Gradle，Kotlin DSL）

多模块结构，三个独立子模块共享同一套 API：

| 模块     | 说明                                   | 产物                 |
|----------|----------------------------------------|----------------------|
| `api`    | 跨平台共享 API，不依赖任何平台相关类    | 被其它模块复用       |
| `plugin` | Bukkit / Paper / Spigot 服务端插件     | `plugin-<version>.jar` |
| `mod`    | Fabric 模组（基于 fabric-loom）         | `mod-<version>.jar`  |

### 前置要求
- JDK 21+（当前工程使用 Gradle 9.9.1，需 JDK 17–27 运行；源码目标为 Java 21）
- 联网（首次构建会下载 Gradle 分发、Minecraft 映射、依赖等）

### 常用命令
```bash
./gradlew build          # 同时构建 plugin 与 mod 两个 jar
./gradlew :plugin:build  # 只构建插件
./gradlew :mod:build     # 只构建模组
./gradlew clean
```

依赖与插件版本集中在 `gradle/libs.versions.toml`（版本目录），
仓库地址集中在 `settings.gradle.kts`。

