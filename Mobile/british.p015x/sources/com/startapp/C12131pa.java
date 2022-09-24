package com.startapp;

import java.util.regex.Pattern;

/* renamed from: com.startapp.pa */
/* compiled from: Sta */
public class C12131pa {

    /* renamed from: a */
    public final Pattern f54013a = Pattern.compile("\\+");

    /* renamed from: b */
    public final Pattern f54014b = Pattern.compile("/");

    /* renamed from: c */
    public final Pattern f54015c = Pattern.compile("=");

    public C12131pa() {
        Pattern.compile("_");
        Pattern.compile("\\*");
        Pattern.compile("#");
    }

    /* renamed from: a */
    public String mo45670a(String str) {
        return this.f54015c.matcher(this.f54014b.matcher(this.f54013a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
