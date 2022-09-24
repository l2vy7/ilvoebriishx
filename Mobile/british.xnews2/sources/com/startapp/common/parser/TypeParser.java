package com.startapp.common.parser;

/* compiled from: Sta */
public interface TypeParser<T> {
    T parse(Class<T> cls, Object obj);
}
