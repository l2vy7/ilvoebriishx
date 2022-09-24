package com.facebook;

/* renamed from: com.facebook.o */
/* compiled from: FacebookServiceException */
public class C3650o extends C3572j {

    /* renamed from: b */
    private final FacebookRequestError f13557b;

    public C3650o(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f13557b = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo12348a() {
        return this.f13557b;
    }

    public final String toString() {
        return "{FacebookServiceException: " + "httpResponseCode: " + this.f13557b.mo11231i() + ", facebookErrorCode: " + this.f13557b.mo11225d() + ", facebookErrorType: " + this.f13557b.mo11228f() + ", message: " + this.f13557b.mo11227e() + "}";
    }
}
