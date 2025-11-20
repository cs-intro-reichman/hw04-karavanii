public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static boolean contains(String str1, String str2) {
         if (str2.length() > str1.length()) {
        return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    for (int i = 0; i <= arr1.length - arr2.length; i++) {
        int j = 0;
        while (j < arr2.length && arr1[i + j] == arr2[j]) {
            j++;
        }
        if (j == arr2.length) {
            return true;
        }
    }
    return false;
    }

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
        for (int j = 0; j < keywords.length; j++) {
            if (contains(sentences[i].toLowerCase(), keywords[j].toLowerCase())) {
                System.out.println(keywords[j]);
                break;
            }
    }
    }
    }
    }
