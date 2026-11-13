plugins {
    `java-library`
    alias(libs.plugins.shadow)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    // 服务端已提供，仅编译期需要
    compileOnly(libs.paper.api)
    // 复用共享 API（shadow 会一并打进最终 jar）
    implementation(project(":api"))
}

// 用 shadow 把 plugin + api 打包成单个可被服务端直接加载的 jar
tasks.named<com.gradleup.shadow.tasks.ShadowJar>("shadowJar") {
    archiveClassifier.set("")
    archiveFileName.set("${project.name}-${project.version}.jar")
    // 避免与服务器自带的类冲突
    mergeServiceFiles()
}

// 禁用原生 jar 任务，统一以 shadowJar 作为产物
tasks.named("jar") {
    enabled = false
}
