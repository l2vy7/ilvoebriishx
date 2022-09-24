package com.ironsource.p054a;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.ironsource.a.a */
public final class C4922a {

    /* renamed from: a */
    String f21923a;

    /* renamed from: b */
    public boolean f21924b;

    /* renamed from: c */
    String f21925c;

    /* renamed from: d */
    C4927d f21926d;

    /* renamed from: e */
    boolean f21927e = false;

    /* renamed from: f */
    ArrayList<Pair<String, String>> f21928f;

    /* renamed from: com.ironsource.a.a$a */
    public static class C4923a {

        /* renamed from: a */
        String f21929a = "";

        /* renamed from: b */
        public boolean f21930b = false;

        /* renamed from: c */
        public String f21931c = "POST";

        /* renamed from: d */
        public C4927d f21932d;

        /* renamed from: e */
        public boolean f21933e = false;

        /* renamed from: f */
        public ArrayList<Pair<String, String>> f21934f = new ArrayList<>();

        public C4923a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f21929a = str;
            }
        }
    }

    public C4922a(C4923a aVar) {
        this.f21923a = aVar.f21929a;
        this.f21924b = aVar.f21930b;
        this.f21925c = aVar.f21931c;
        this.f21926d = aVar.f21932d;
        this.f21927e = aVar.f21933e;
        if (aVar.f21934f != null) {
            this.f21928f = new ArrayList<>(aVar.f21934f);
        }
    }
}
