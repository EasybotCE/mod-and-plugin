package ce.easybot.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import ce.easybot.api.EasyBotAPI;

public class EasyBotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        EasyBotAPI.greet("Paper Plugin");
        getLogger().info("EasyBot plugin enabled");
    }
}
