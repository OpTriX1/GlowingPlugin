package de.glowing;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GlowingPlugin extends JavaPlugin implements Listener {

    private static final PotionEffect GLOWING =
            new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, 0, false, false);

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getOnlinePlayers().forEach(p -> p.addPotionEffect(GLOWING));
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().addPotionEffect(GLOWING);
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        Bukkit.getScheduler().runTaskLater(this,
                () -> e.getPlayer().addPotionEffect(GLOWING), 1L);
    }

    @EventHandler
    public void onEffectRemove(EntityPotionEffectEvent e) {
        if (!(e.getEntity() instanceof org.bukkit.entity.Player p)) return;
        if (e.getOldEffect() == null) return;
        if (e.getOldEffect().getType() != PotionEffectType.GLOWING) return;

        Bukkit.getScheduler().runTaskLater(this,
                () -> p.addPotionEffect(GLOWING), 1L);
    }
}
