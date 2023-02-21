package codelab09.computerParts.screen;

import codelab09.computerParts.ComputerPart;

import java.awt.*;

public class Screen extends ComputerPart {
	private static final int MIN_BRIGHTNESS = 0;
	private ScreenType screenType;
	private String resolution;
	private int brightness;
	private Color color;
	private String name;

	public Screen(String name, ScreenType screenType, String resolution, int brightness, Color color) {
		super(75);
		this.name = name;
		this.screenType = screenType;
		this.resolution = resolution;
		this.brightness = brightness;
		this.color = color;
	}

	public void dimBrightness() {
		if (brightness <= MIN_BRIGHTNESS) {
			brightness = MIN_BRIGHTNESS;
		}
		brightness--;
	}

	@Override
	public String toString() {
		return "Screen:" +
				" Name='" + name + '\'' +
				", Type=" + screenType.getType() +
				", Resolution=" + resolution +
				", Brightness=" + brightness +
				", Color=" + color +

				'}';
	}
}
