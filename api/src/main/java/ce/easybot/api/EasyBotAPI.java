package ce.easybot.api;

/**
 * 跨平台共享的 API。该模块不引用任何 Bukkit / Fabric 的类型，
 * 因此可以被 plugin 与 mod 两个模块同时复用。
 */
public final class EasyBotAPI {

    private EasyBotAPI() {
    }

    public static void greet(String platform) {
        System.out.println("[EasyBot] Hello from " + platform + " (shared API)");
    }
}
