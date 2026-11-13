plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
}

// 共享 API 模块：不依赖任何平台（Bukkit / Fabric）相关类，
// plugin 与 mod 通过 implementation(project(":api")) 复用其中的代码。
