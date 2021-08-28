package ru.whitebeef.atrixkiller.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import ru.whitebeef.atrixkiller.AtrixKiller;

public class AtrixKillerTask extends BukkitRunnable {

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach((player) -> {
            if (player.getUniqueId().equals(AtrixKiller.getInstance().getAtrixUUID()))
                player.damage(5);
        });
    }
}
