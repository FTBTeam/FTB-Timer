package com.feed_the_beast.timer.api;

import net.minecraft.util.IJsonSerializable;

public interface ITimer extends IJsonSerializable {

	public void start();

	public void stop();

	public void reset();

	public long getTime();

	public boolean isRunning();

	public TimerType getType();

}
