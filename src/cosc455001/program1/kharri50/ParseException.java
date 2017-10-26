package cosc455001.program1.kharri50;
/*
COURSE : COSC455001
Submitter : kharri50
Names; Kyle Harris
 */


/**
 * Parsing exception. For simplicity, this is used for both lexical errors as
 * well as parsing errors. A more complete design would include a hierarchy of
 * specific error types.
 *
 * @author Adam J. Conover, D.Sc. <aconover@towson.edu>
 */
@SuppressWarnings("serial")
public class ParseException extends Exception {

    /**
     * Construct a new Error Message.
     *
     * @param errMsg The text of the error.
     */
    public ParseException(String errMsg) {
        super(errMsg);
    }
}
