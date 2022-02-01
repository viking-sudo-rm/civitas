package snorri;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Ave Civitas!");
    }

    @Override
    public void onDisable(){
        getLogger().info("Vale Civitas!");
    }

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (label.equalsIgnoreCase("hello")) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Hello world!");
            return true;
        }
    }
    return false;
}

}