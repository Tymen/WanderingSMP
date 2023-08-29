package dev.tymen.wanderingsmp;

import org.bukkit.plugin.java.JavaPlugin;

public final class WanderingSMP extends JavaPlugin {
    private final String pluginName = "WanderingSMP";
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(String.format("[%s] Wandering SMP loaded successfully!", pluginName));
    }

    @Override
    public void onDisable() {
        getLogger().info(String.format("[%s] Wandering SMP is disabled", pluginName));
    }
}
