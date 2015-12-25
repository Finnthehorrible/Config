package de.Finnthehorrible.config;

import org.bukkit.Bukkit;

/**
 * Created by Finnthehorrible on 25.12.2015
 */
public class MapConfig implements Runnable {
    private static MapConfig config;

    public static MapConfig getConfig(){
        return config;
    }
    @Override
    public void run() {
        config = this;
        if(config.equals("mapConfig")){
            Bukkit.broadcastMessage("The Server ist Loading");
            this.getConfig().setConfig();
            this.setConfig();
            config.setConfig();
        } else {
            Bukkit.broadcastMessage("Error, please report this bug in our Forums");
            stop();
        }
    }
    public void setConfig(){

    }
    public void stop(){

    }
}
