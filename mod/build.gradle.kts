plugins {
    alias(libs.plugins.loom)
}

val minecraftVersion = libs.versions.minecraft.get()
val yarnVersion = libs.versions.yarn.get()
val fabricLoaderVersion = libs.versions.fabricLoader.get()
val fabricApiVersion = libs.versions.fabricApi.get()

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    // 用于开发期反混淆 Minecraft
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings("net.fabricmc:yarn:$yarnVersion:v2")

    modImplementation("net.fabricmc:fabric-loader:$fabricLoaderVersion")
    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabricApiVersion")

    // 复用共享 API，loom 会把它一并打进 mod jar
    implementation(project(":api"))
}
