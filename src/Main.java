
//String Exercise

void main() {
Scanner inputText = new Scanner(System.in);

while (true) {
    IO.println("What is your sentence?");
    String sentence = inputText.nextLine();
    if (sentence == null || sentence.equals("") || sentence.length() == 0) {
        IO.println("Invalid sentence!\n");

    }else{
        IO.println("Original Sentence: " + sentence);
        IO.println("Substring Sentence: " +sentence.substring(5, sentence.length()-1));
        IO.println("Uppercase Sentence: " +sentence.toUpperCase());
        break;
    }

}






}
