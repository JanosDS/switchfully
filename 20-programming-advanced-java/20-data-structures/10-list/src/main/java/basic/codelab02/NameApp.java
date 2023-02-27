package basic.codelab02;

import java.util.List;

public class NameApp {
	public static void main(String[] args) {
		List<String> funnyList = NameGenerator.generateFunnyNames();
		for (String name : funnyList) {
			System.out.println(name);
		}

		List<String> normalList = NameGenerator.generateNormalNames();
		System.out.println(normalList.get(0));

		List<String> seriousList = NameGenerator.generateSeriousNames();
		System.out.println(seriousList.get(seriousList.size() - 1));

	}
}
