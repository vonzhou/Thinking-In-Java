package thinkinginjava.exceptions;//: exceptions/LoggingExceptions.java
// An exception that reports through a Logger.

import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();

        //Prints this throwable and its backtrace to the specified print writer.
        printStackTrace(new PrintWriter(trace));

        // Log a SEVERE message.
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
