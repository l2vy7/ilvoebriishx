package com.startapp;

import java.util.List;

/* renamed from: com.startapp.hc */
/* compiled from: Sta */
public class C11944hc {

    /* renamed from: a */
    public List<String> f53044a;

    /* renamed from: b */
    public String f53045b;

    public C11944hc(List<String> list, String str) {
        this.f53044a = list;
        this.f53045b = str;
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("[VideoEvent: tag=");
        a.append(this.f53045b);
        a.append(", fullUrls=");
        a.append(this.f53044a.toString());
        a.append("]");
        return a.toString();
    }
}
