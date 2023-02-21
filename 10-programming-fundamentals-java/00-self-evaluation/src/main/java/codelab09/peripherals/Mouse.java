package codelab09.peripherals;

public class Mouse extends Peripheral {
	private int DPI;
	private boolean hasAutoScroll;
	private int scrollSpeed;

	public Mouse(int DPI, boolean hasAutoScroll, int scrollSpeed) {
		this.DPI = DPI;
		this.hasAutoScroll = hasAutoScroll;
		this.scrollSpeed = scrollSpeed;
	}

	@Override
	public String use() {
		return "Clikedy click!";
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("Mouse {");
		strb.append(" DPI=" + DPI);
		if (hasAutoScroll) {
			strb.append(", has auto-scroll");
		}
		strb.append(", scroll-speed=" + scrollSpeed);
		strb.append(" }");

		return strb.toString();
	}
}
