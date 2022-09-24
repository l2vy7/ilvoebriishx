package com.startapp;

import java.util.Collection;
import java.util.Locale;

/* renamed from: com.startapp.v5 */
/* compiled from: Sta */
public class C12387v5 {

    /* renamed from: d */
    public static final C12387v5 f54885d = new C12387v5();

    /* renamed from: a */
    public final String f54886a;

    /* renamed from: b */
    public final String f54887b;

    /* renamed from: c */
    public final String f54888c;

    public C12387v5(Locale locale, Collection<Locale> collection) {
        this.f54886a = locale.toString();
        this.f54887b = m53569a((Locale) null, collection, ';');
        this.f54888c = m53569a(locale, collection, ',');
    }

    /* renamed from: a */
    public static String m53569a(Locale locale, Iterable<Locale> iterable, char c) {
        boolean z;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z = true;
        } else {
            z = false;
            sb = null;
        }
        if (iterable != null) {
            for (Locale next : iterable) {
                if (next != null) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    if (z) {
                        sb.append(c);
                    }
                    sb.append(next);
                    z = true;
                }
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public C12387v5() {
        this.f54886a = null;
        this.f54887b = null;
        this.f54888c = null;
    }
}
