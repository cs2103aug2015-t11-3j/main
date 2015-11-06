package parser;

import java.util.ArrayList;
import java.util.Arrays;

import application.Constants;

public class TitleParser {

	public static String getTitle(String input) {
		String text = new String();
		text = splitInputWithDictionary(Constants.DICTIONARY_ADD, input);
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_DELETE, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_EDIT, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_SEARCH, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_UNDO, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_REDO, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_EXIT, input);
		}
		if (text == null) {
			text = splitInputWithDictionary(Constants.DICTIONARY_SETPATH, input);
		}
		return text;
	}

	public static String getEditTitle(String input) {
		for (int i = 0; i < 3; i++) {
			input = excludeFirstWord(input);
		}
		return input;
	}

	public static String splitInputWithDictionary(String[] dictionary, String input) {
		int firstIndex = -1;
		int lastIndex = input.length();

		for (String regex : dictionary) {
			if (input.toLowerCase().indexOf(regex) > firstIndex) {
				firstIndex = input.toLowerCase().indexOf(regex);
			}
		}

		if (firstIndex < 0) {
			return null;
		}

		ArrayList<String> taskKeywords = new ArrayList<String>();
		// taskKeywords.addAll(Arrays.asList(Constants.TASK_END_DATE));
		// taskKeywords.addAll(Arrays.asList(Constants.TASK_START_DATE));
		taskKeywords.addAll(Arrays.asList(Constants.TASK_START_DATETIME));
		taskKeywords.addAll(Arrays.asList(Constants.TASK_END_DATETIME));
		taskKeywords.removeAll(Arrays.asList(dictionary));

		for (String regex : taskKeywords) {
			if (input.toLowerCase().indexOf(regex) < lastIndex && input.toLowerCase().indexOf(regex) > 0) {
				lastIndex = input.toLowerCase().indexOf(regex);
			}
		}
		if (lastIndex <= firstIndex) {
			lastIndex = input.length();
		}

		return excludeFirstWord(input.substring(firstIndex, lastIndex)).trim();
	}

	static String extractFirstWord(String input) {
		return input.split(Constants.SPACE)[0].trim();
	}

	static String excludeFirstWord(String input) {
		return input.substring(extractFirstWord(input).length()).trim();
	}

}
