package com.feed_the_beast.timer.api;

import net.minecraftforge.fml.common.Loader;
import org.apache.commons.lang3.Validate;

public class FTBTimerAPI {

	private static ITimerManager timerManager;

	public static ITimerManager getTimerManager(){
		return timerManager;
	}

	public static void setTimerManager(ITimerManager manager){
		Validate.isTrue(timerManager == null);
		Validate.isTrue(Loader.instance().activeModContainer().getModId().equals("ftbtimer"));
		timerManager = manager;
	}

}
