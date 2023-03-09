package codelab01;

import codelab01.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Forrest {

	private List<Tree> trees = new ArrayList<>();

	public String displayTrees() {
		StringBuilder strb = new StringBuilder();
		for (Tree tree : trees) {
			strb.append(tree.toString());
			strb.append("\n");
		}
		return strb.toString();
	}

	public void forrestFire() {
		trees.removeIf(tree -> tree.getTreeType().isFruitTree());
	}

	public void addTree(Tree tree) {
		trees.add(tree);
	}
}
