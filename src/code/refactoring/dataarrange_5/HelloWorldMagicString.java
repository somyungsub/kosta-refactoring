package code.refactoring.dataarrange_5;

public class HelloWorldMagicString {
	
	private static final String FIRST_WORD = "Hello";
	private static final String SECOND_WORD = "World";
	
	private String firstWord;
	private String secondWord;
	public HelloWorldMagicString(String firstWord, String secondWord) {
		this.firstWord = firstWord;
		this.secondWord = secondWord;
	}
    public static void main(String[] args) {
    	HelloWorldMagicString hello = new HelloWorldMagicString(FIRST_WORD, SECOND_WORD);
    	hello.makeSentence();
//        System.out.println("Hello World");
    }
    
	private void makeSentence() {
		String finalSentence = firstWord + " *** " + secondWord;
		System.out.println(finalSentence);
	}

}
