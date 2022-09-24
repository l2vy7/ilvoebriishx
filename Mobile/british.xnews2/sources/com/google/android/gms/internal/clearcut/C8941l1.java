package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.l1 */
public class C8941l1 extends IOException {

    /* renamed from: b */
    private C8942l2 f44600b = null;

    public C8941l1(String str) {
        super(str);
    }

    /* renamed from: a */
    static C8941l1 m41909a() {
        return new C8941l1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C8941l1 m41910b() {
        return new C8941l1("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C8953m1 m41911c() {
        return new C8953m1("Protocol message tag had invalid wire type.");
    }

    /* renamed from: d */
    static C8941l1 m41912d() {
        return new C8941l1("Failed to parse the message.");
    }

    /* renamed from: e */
    static C8941l1 m41913e() {
        return new C8941l1("Protocol message had invalid UTF-8.");
    }

    /* renamed from: f */
    public final C8941l1 mo36995f(C8942l2 l2Var) {
        this.f44600b = l2Var;
        return this;
    }
}
