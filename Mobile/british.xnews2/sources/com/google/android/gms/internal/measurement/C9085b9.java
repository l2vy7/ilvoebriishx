package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public class C9085b9 extends IOException {
    public C9085b9(String str) {
        super(str);
    }

    /* renamed from: a */
    static C9070a9 m42683a() {
        return new C9070a9("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static C9085b9 m42684b() {
        return new C9085b9("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C9085b9 m42685c() {
        return new C9085b9("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C9085b9 m42686d() {
        return new C9085b9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static C9085b9 m42687e() {
        return new C9085b9("Failed to parse the message.");
    }

    /* renamed from: f */
    static C9085b9 m42688f() {
        return new C9085b9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
