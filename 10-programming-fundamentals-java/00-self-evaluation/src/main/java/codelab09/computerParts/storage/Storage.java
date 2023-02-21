package codelab09.computerParts.storage;

import codelab09.computerParts.ComputerPart;

public class Storage extends ComputerPart {
	private final int STORAGE_SIZE;
	private StorageType storageType;
	private int speed;
	private String name;

	public Storage(String name, StorageType storageType, int STORAGE_SIZE, int speed) {
		super(100);
		this.name = name;
		this.storageType = storageType;
		this.STORAGE_SIZE = STORAGE_SIZE;
		this.speed = speed;
	}

	public void storeData() {

	}

	@Override
	public String toString() {
		return "Storage: Name='" + name + "', Size=" + STORAGE_SIZE
				+ ", Type= " + storageType.getType()
				+ ", Speed=" + speed + "MB/s";
	}
}
