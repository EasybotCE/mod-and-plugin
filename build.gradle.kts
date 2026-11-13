plugins {
    // 仅在子模块中按需 apply
    alias(libs.plugins.shadow) apply false
    alias(libs.plugins.loom) apply false
}

allprojects {
    group = "ce.easybot"
    version = "1.0.0"
}
