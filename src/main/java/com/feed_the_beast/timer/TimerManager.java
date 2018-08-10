package com.feed_the_beast.timer;

import com.feed_the_beast.timer.api.ITimer;
import com.feed_the_beast.timer.api.ITimerManager;
import com.feed_the_beast.timer.api.TimerBuilder;
import com.google.gson.JsonElement;
import net.minecraft.util.IJsonSerializable;
import org.apache.commons.lang3.Validate;

import java.util.Optional;

public class TimerManager implements ITimerManager, IJsonSerializable {

	private ITimer timer = null;

	@Override
	public Optional<ITimer> getGlobalTimer() {
		if(timer == null){
			return Optional.empty();
		}
		return Optional.of(timer);
	}

	@Override
	public ITimer createGlobalTimer(TimerBuilder builder) {
		Validate.isTrue(timer == null); //Dont create a timer over a pre existing one, should we crash here though?
		builder.validate();

		return null;
	}

	@Override
	public void fromJson(JsonElement json) {

	}

	@Override
	public JsonElement getSerializableElement() {
		return timer.getSerializableElement();
	}
}
