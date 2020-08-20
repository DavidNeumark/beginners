package d.textAnalize;

public class MyTextAnalizer implements TextAnalizer {

	@Override
	public int stringLength(String str) {
		return str.length();
	}

	@Override
	public char charAt(String str, int index) {
		return str.charAt(index);
	}

}
