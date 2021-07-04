package com.bookit.ActionBarAPI;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class ActionBarAPI extends JavaPlugin implements Listener {
    private static HashMap<String, HashMap<String, String>> texts = new HashMap<String, HashMap<String, String>>();


    @Override
    public void onEnable() {
        getServer().getLogger().info("ActionBarAPI Plugin Enabled.");
    }


    @Override
    public void onDisable() {
        getServer().getLogger().info("ActionBarAPI Plugin Disabled.");
    }


    public static void addText(String name, String key, String text) {
        if (!texts.containsKey(name)) {
            texts.put(name, new HashMap<String, String>());
        }

        texts.get(name).put(key, text);
    }

    public static void addText(Player player, String key, String text) {
        addText(player.getName(), key, text);
    }


    public static void removeText(String name, String key) {
        if(!texts.containsKey(name) || !texts.get(name).containsKey(key)) {
            throw new NullPointerException("Unfounded key. (" + name + ", " + key + ")");
        }

        texts.get(name).remove(key);
    }

    public static void removeText(Player player, String key) {
        removeText(player.getName(), key);
    }


    public static void sendActionBar(Player player) {
        StringBuilder sb = new StringBuilder();
        texts.get(player.getName()).forEach((key, value) -> {
            sb.append(value);
        });
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(sb.toString()));
    }
}
