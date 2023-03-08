package exercise02.solution01;

public class AlphabetCypher {


	public String encodeMessage(String message, String key) {
		//To lower case (uppercase chars have different ascii value)
		message = message.toLowerCase();
		key = key.toLowerCase();
		StringBuilder codedMessage = new StringBuilder();
		while (message.length() > key.length()) {
			key += key;
		}
		for (int i = 0; i < message.length(); i++) {
			int letterValue = message.charAt(i);
			int keyValue = key.charAt(i);
			int offset = letterValue - 97;
			int val = keyValue - 97;
			int codedLetterValue = offset + val;
			if (codedLetterValue >= 26) {
				codedLetterValue = codedLetterValue - 26;
			}
			char c = (char) (codedLetterValue + 97);
			codedMessage.append(c);
		}
		return codedMessage.toString();
	}
}
