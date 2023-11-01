public class MergeStringAlternate1768 {

    public static void main(String[] args) {

        String word1 ="abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

    }

    public static String mergeAlternately(String word1, String word2) {
        int count1 = 0, count2=0;
        StringBuilder result = new StringBuilder();

        while(count1 < word1.length() && count2 < word2.length()){
            result.append(word1.charAt(count1)).append(word2.charAt(count2));
            count1++;
            count2++;
        }

        if(count1 < word1.length())
            result.append(word1.substring(count1));
        if(count2 < word2.length())
            result.append(word2.substring(count2));

        return result.toString();
    }

}
