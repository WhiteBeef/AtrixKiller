package ru.whitebeef.atrixkiller;

import org.bukkit.plugin.java.JavaPlugin;
import ru.whitebeef.atrixkiller.tasks.AtrixKillerTask;

import java.util.UUID;

public final class AtrixKiller extends JavaPlugin {

    private final UUID ATRIX_UUID = UUID.fromString("c7a01dbbb7094217be4efee97a50af93");
    AtrixKillerTask killerTask;
    private static AtrixKiller instance;

    @Override
    public void onEnable() {
        instance = this;
        killerTask = new AtrixKillerTask();
        killerTask.runTaskTimer(this, 0, 20);

    }

    @Override
    public void onDisable() {
        if (killerTask != null)
            killerTask.cancel();
    }

    public UUID getAtrixUUID() {
        return ATRIX_UUID;
    }

    public static AtrixKiller getInstance() {
        return instance;
    }
}
