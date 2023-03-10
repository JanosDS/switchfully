package basic.codelab02.elements;

import basic.codelab02.Clickable;
import basic.codelab02.Downloadable;

public class Image implements Clickable, Downloadable {

	private final String url;
	private final int heightInPixel;
	private final int widthInPixel;

	public Image(String url, int heightInPixel, int widthInPixel) {
		this.url = url;
		this.heightInPixel = heightInPixel;
		this.widthInPixel = widthInPixel;
	}

	public String getUrl() {
		return url;
	}

	public String getDimensions() {
		return widthInPixel + "x" + heightInPixel;
	}

	@Override
	public String download() {
		return "Downloading this image... ...";
	}

	@Override
	public String click() {
		return "tssss trying to click an image";
	}

	@Override
	public String doubleClick() {
		return "Like double clicking is going to do anything rofl";
	}
}
