package top.jingwenmc.pieexample;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import top.jingwenmc.spigotpie.common.event.SpigotEventListener;
import top.jingwenmc.spigotpie.common.instance.PieComponent;

@PieComponent
@SpigotEventListener
public class ListenerTest implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(ChatColor.AQUA+"  Welcome!!!");
        System.out.println(ChatColor.AQUA+event.getPlayer().getName()+" Welcome!!!");
    }
}
