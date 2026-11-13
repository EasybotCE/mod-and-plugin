package ce.easybot.mod;

import net.fabricmc.api.ModInitializer;
import ce.easybot.api.EasyBotAPI;

public class EasyBotMod implements ModInitializer {

    @Override
    public void onInitialize() {
        EasyBotAPI.greet("Fabric Mod");
    }
}
