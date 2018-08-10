package com.feed_the_beast.timer;

import com.feed_the_beast.timer.api.FTBTimerAPI;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "ftbtimer", name = "FTB Timer")
public class FTBTimer {

	//Dont use this, use the api. If this has something the api doesnt expose tell me
	private TimerManager timerManager;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		timerManager = new TimerManager();
		FTBTimerAPI.setTimerManager(timerManager);
	}

	@Mod.EventHandler
	public void serverStart(FMLServerStartingEvent event){

	}

}
