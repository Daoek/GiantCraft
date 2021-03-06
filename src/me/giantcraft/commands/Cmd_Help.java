package me.giantcraft.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd_Help implements CommandExecutor {
	
	// The full code for this command
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {			// If the command is executed by the player
			Player player = (Player) sender;
			
			// Code that will be executed when this cmd is entered.
			player.sendMessage(ChatColor.RED + "-= GiantCraft command list =-");
			player.sendMessage("");
			player.sendMessage(ChatColor.YELLOW + "There are no commands yet!");
		}
		
		return true;		// Return something..
	}

}
