package codelab09.computerParts.storage;

public enum StorageType {
	HDD("HDD"),
	SSD("SSD");

	private String type;

	StorageType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
