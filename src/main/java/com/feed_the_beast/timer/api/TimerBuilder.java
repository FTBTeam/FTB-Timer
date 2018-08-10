package com.feed_the_beast.timer.api;

import org.apache.commons.lang3.Validate;

public class TimerBuilder {

	public static TimerBuilder TimerBuilder(TimerType timerType){
		return new TimerBuilder(timerType);
	}

	private TimerType type;
	private long startTime = 0;

	private TimerBuilder(TimerType type) {
		this.type = type;
	}

	/**
	 * Sets the time that the timer should start to count down from, must be used only when creating a stopwatch
	 */
	public TimerBuilder setStartTime(long time){
		Validate.isTrue(type == TimerType.STOPWATCH);
		this.startTime = time;
		return this;
	}

	/**
	 * Validates the the current timer builder is valid
	 */
	public void validate(){
		if (type == TimerType.STOPWATCH){
			Validate.isTrue(startTime > 0);
		}
	}
}
