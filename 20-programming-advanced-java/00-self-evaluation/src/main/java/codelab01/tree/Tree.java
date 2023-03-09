package codelab01.tree;

import codelab01.height.Height;
import codelab01.height.HeightUnit;

public class Tree {

	private Height height;
	private TreeType treeType;
	private int age;

	public Tree(Height height, TreeType treeType, int age) {
		this.height = height;
		this.treeType = treeType;
		this.age = age;
	}

	public void grow() {
		double newHeightInMeters = height.getHeightInMeter() + treeType.getGrowSpeed();
		this.height = new Height(newHeightInMeters, HeightUnit.METER);
	}

	public Height getHeight() {
		return this.height;
	}

	public TreeType getTreeType() {
		return treeType;
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append(treeType.toString()).append(" H:").append(height.getHeightAmount()).append(height.getHeightUnit());
		strb.append(", A: ").append(age);
		return strb.toString();
	}
}
