package top.jingwenmc.pieexample;

import net.md_5.bungee.api.ChatColor;
import top.jingwenmc.spigotpie.common.command.CommandSender;
import top.jingwenmc.spigotpie.common.command.NotRequiredCommandParam;
import top.jingwenmc.spigotpie.common.command.PieCommand;
import top.jingwenmc.spigotpie.common.instance.ObjectManager;
import top.jingwenmc.spigotpie.common.instance.PieComponent;
import top.jingwenmc.spigotpie.common.instance.Wire;

@PieComponent
public class CommandTest {
    @Wire
    ConfigTest configTest;
    @Wire
    InterfaceExample anotherImpl;

    @PieCommand(value = "hi",aliases = {"hello say"},bungeeCord = false,spigot = true)
    public void onCommand(CommandSender sender,@NotRequiredCommandParam("Hello") String value) {
        sender.sendMessage(ChatColor.AQUA+value);
    }

    @PieCommand(value = "config",bungeeCord = false,spigot = true)
    public void onConfig(CommandSender sender) {
        sender.sendMessage(ChatColor.AQUA+configTest.MAIN_CONFIG);
    }

    @PieCommand(value = "interface",bungeeCord = false,spigot = true)
    public void onInterface(CommandSender sender) {
        sender.sendMessage(ChatColor.AQUA+anotherImpl.getMessage());
    }

    @PieCommand(value = "pie",bungeeCord = false,spigot = true)
    public void onInterface(CommandSender sender,@NotRequiredCommandParam("all") String value) throws ClassNotFoundException {
        if (value.equalsIgnoreCase("all")) {
            return;
        }
        sender.sendMessage(ChatColor.AQUA+""+ObjectManager.contains(Class.forName(value)));
    }
}
