package fr.neiyko.projet;

import fr.neiyko.projet.commande.Alert;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        System.out.println(ChatColor.BOLD +"Plugin Project : ON");
        getCommand("alert").setExecutor((CommandExecutor)new Alert());
    }
}
