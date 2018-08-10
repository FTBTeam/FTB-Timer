package com.feed_the_beast.timer.timers;

import com.feed_the_beast.timer.api.ITimer;
import com.feed_the_beast.timer.api.TimerType;
import com.google.gson.JsonElement;

public abstract class BaseTimer implements ITimer {

	TimerType timerType;
	long currentCount;
	boolean running;

	@Override
	public void start() {
		running = true;
	}

	@Override
	public void stop() {

	}

	@Override
	public void reset() {

	}

	@Override
	public long getTime() {
		return currentCount;
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public TimerType getType() {
		return timerType;
	}

	@Override
	public void fromJson(JsonElement json) {

	}

	@Override
	public JsonElement getSerializableElement() {
		return null;
	}
}
