package com.javaex.oop.tv.v1;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	void channel(int channel) {
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
		} else if (channel == 0) {
		} else {
			this.channel = channel % 255;
		}
	}

	void power(boolean on) {
		this.power = on;

	}

	void channel(boolean up) {
		this.channel += 1;
	}

	void volume(int volume) {
		if (volume >= 1 && volume <= 100) {
			this.volume = volume;
		}
	}

	void volume(boolean up) {
		this.volume += 1;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	public void statue() {
		System.out.printf("채널:%d 소리:%d 전원:%b%n", channel, volume, power);
	}
	public void statue(boolean power) {
		String message = String.format("채널:%d 소리:%d 전원:%b%n", channel, volume, power);
		message = power ? "채널:%d 소리:%d 전원:%b%n\", channel, volume, power" : "꺼졌습니다.";
		System.out.printf(message);
	}

}
