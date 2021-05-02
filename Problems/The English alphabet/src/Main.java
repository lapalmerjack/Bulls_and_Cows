class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here

        char c;
        StringBuilder letters = new StringBuilder();
        for(c ='A'; c<='Z'; c++){
            letters.append(c + " ");

        }
        return letters;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}


