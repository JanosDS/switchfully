package codelab01;

import codelab01.height.Height;
import codelab01.height.HeightUnit;
import codelab01.tree.FruitTree;
import codelab01.tree.Tree;
import codelab01.tree.TreeType;

public class Main {
	public static void main(String[] args) {
		Forrest forrest = new Forrest();
		Tree tree = new Tree(new Height(5, HeightUnit.METER), TreeType.OAK, 1);
		Tree tree2 = new FruitTree(new Height(4, HeightUnit.METER), TreeType.APPLE_TREE, 2);

		forrest.addTree(tree);
		forrest.addTree(tree2);

		System.out.println(forrest.displayTrees());
		forrest.forrestFire();
		System.out.println(forrest.displayTrees());
	}
}
