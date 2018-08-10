package com.feed_the_beast.timer.api;


import java.util.Optional;

public interface ITimerManager {

	/**
	 *
	 * Retuns the timer instance for the entire server
	 *
	 */
	public Optional<ITimer> getGlobalTimer();


	public ITimer createGlobalTimer(TimerBuilder builder);

}
