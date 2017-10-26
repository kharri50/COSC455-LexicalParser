package cosc455001.program1.kharri50;
/*
COURSE : COSC455001
Submitter : kharri50
Names; Kyle Harris
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Token set as an Enum type. This is just "binds" each token to its list of
 * valid lexemes.
 *
 * @author Adam J. Conover
 */
public enum TOKEN {

    /*
     Please note, i added some additional grammar elements to conform to some test cases which
     were provided.
     */

    ARTICLE("a", "the"), // a list of articles
    CONJUNCTION("and", "or"), // A new Conjunction
    NOUN("dog", "cat", "rat", "tree", "house"), // a list of nouns
    VERB("loves", "hates", "eats", "chases", "stalks", "loves"), // a list of verbs
    ADJECTIVE("fast", "slow", "delicious", "lazy", "sneaky", "furry", "tall"), // Adjectives
    ADVERB("silently" , "quickly"),
    TERMINAL(".","!"),
    PREPOSITION("with","up","around"),
    EOS(TOKEN.EOS_MARKER), // End of statement marker. (A character not used for anything else.)
    UNKNOWN(); //An unknown token

    // The lexemes under this token
    private final List<String> lexemeList;

    // The marker symbol for statement termination (if used)
    public static final String EOS_MARKER = ";";

    // Construct the token with the list of lexems
    private TOKEN(String... tokenStrings) {
        lexemeList = new ArrayList<>(tokenStrings.length);
        lexemeList.addAll(Arrays.asList(tokenStrings));
    }

    /**
     * Gets a token from a lexeme by the following rules (in order).
     *
     * 1. If the lexeme is blank return EOF (end of file). 2. If the lexeme
     * corresponds to a known token, return the token. 3. if the lexeme is a
     * sequence of digits, it is a LITERAL. 4. if the lexeme is anything else,
     * it must be an identifier.
     *
     * @param string The Lexeme
     * @return The Token
     */
    public static TOKEN fromLexeme(final String string) {
        // Just to be safe...
        String lexeme = string.trim();

        // An empty string should mean no more tokens to process.
        if (lexeme.isEmpty())
            return EOS;

        // Search through ALL lexemes looking for a match.
        for (TOKEN t : TOKEN.values()) {
            if (t.lexemeList.contains(lexeme)) {
                // early bailout.
                return t;
            }
        }


        // If nothing matches assume an ID.  (What other choice do we have?)
        return UNKNOWN;
    }

}
