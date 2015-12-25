package de.Finnthehorrible.config;

import org.bukkit.Bukkit;

/**
 * Created by Finnthehorrible on 25.12.2015
 */
public class GameConfig implements Runnable {
    private static GameConfig config;

    public final GameConfig getConfig(){
        return config;
    }
    @Override
    public void run(){
        config = this;
        if(config.equals("gameConfig")){
            Bukkit.broadcastMessage("The Game is Loading");
            this.getConfig().setConfig();
            this.setConfig();
            config.setConfig();
        } else {
            Bukkit.broadcastMessage("Error, please report this bug in our Forums");
            stop();
        }
    }
    public void stop(){
    }
    public void setConfig(){

    }
}
