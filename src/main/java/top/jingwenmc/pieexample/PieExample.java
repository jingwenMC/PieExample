package top.jingwenmc.pieexample;

import org.bukkit.plugin.java.JavaPlugin;
import top.jingwenmc.spigotpie.common.instance.PieComponent;
import top.jingwenmc.spigotpie.spigot.SpigotPieSpigot;

@PieComponent
public final class PieExample extends JavaPlugin {

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        SpigotPieSpigot.inject(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
