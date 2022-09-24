package com.google.firebase.installations;

import p262w6.C11092h;

/* renamed from: com.google.firebase.installations.c */
/* compiled from: FirebaseInstallationsException */
public class C10459c extends C11092h {

    /* renamed from: b */
    private final C10460a f48958b;

    /* renamed from: com.google.firebase.installations.c$a */
    /* compiled from: FirebaseInstallationsException */
    public enum C10460a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C10459c(C10460a aVar) {
        this.f48958b = aVar;
    }

    public C10459c(String str, C10460a aVar) {
        super(str);
        this.f48958b = aVar;
    }
}
