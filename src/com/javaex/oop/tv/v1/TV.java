package com.javaex.oop.tv.v1;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;

    public TV() {
    	this(7, 20, false);
    }
    
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	void channel(int channel) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
		} else if (channel == 0) {
		} else {
			this.channel = channel % 255;
		}
	}
	void channel(boolean up) {
		if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel += 1;
		} else {
			if (this.channel > MIN_CHANNEL) {
				this.channel--;
			}
		}

	}
	
	void power(boolean on) {
		this.power = on;
		
	}
	
	//	볼륨 조절 메서드
	void volume(int volume) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume = volume;
		}
	}

	void volume(boolean up) {
		if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
			this.volume += 1;
		} else {
			if (this.volume > MIN_VOLUME) {
				this.volume --;
			}
		}
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
