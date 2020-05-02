package fr.neiyko.projet;

import fr.neiyko.projet.commande.Alert;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        System.out.println("§6Plugin Project : §4ON");
        getCommand("alert").setExecutor((CommandExecutor)new Alert());
    }

}
