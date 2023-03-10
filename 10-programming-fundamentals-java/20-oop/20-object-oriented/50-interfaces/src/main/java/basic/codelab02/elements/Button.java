package basic.codelab02.elements;

import basic.codelab02.Clickable;

public class Button implements Clickable {

	private final String label;

	public Button(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public Button changeLabel(String label) {
		return new Button(label);
	}

	@Override
	public String click() {
		return "oh ohw you clicked me";
	}

	@Override
	public String doubleClick() {
		return click().repeat(2);
	}
}
