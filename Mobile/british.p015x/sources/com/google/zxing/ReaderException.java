package com.google.zxing;

public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] NO_TRACE = new StackTraceElement[0];
    protected static final boolean isStackTrace = (System.getProperty("surefire.test.class.path") != null);

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    ReaderException(Throwable th) {
        super(th);
    }
}
