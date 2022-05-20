package acme.entities.configuration;

import java.util.List;

public class SpamDetector {
    
    private SpamDetector() {
        throw new IllegalStateException("Utility class");
    }
    
    public static Boolean detectSpam(final List<String> text, final List<String> spamTerms, final Double threshold) {
        Double cont = 0.;
        for(final String word: text) {
            if(spamTerms.contains(word))
                cont++;
        }
        final Double x = cont / spamTerms.size();
        return x >= threshold;
    }

}
