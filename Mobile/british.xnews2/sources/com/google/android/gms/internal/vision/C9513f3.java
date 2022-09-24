package com.google.android.gms.internal.vision;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.f3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C9513f3 extends IOException {

    /* renamed from: b */
    private C9522g4 f45639b = null;

    public C9513f3(String str) {
        super(str);
    }

    /* renamed from: a */
    static C9513f3 m44255a() {
        return new C9513f3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C9513f3 m44256b() {
        return new C9513f3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C9513f3 m44257c() {
        return new C9513f3("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C9503e3 m44258d() {
        return new C9503e3("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static C9513f3 m44259e() {
        return new C9513f3("Failed to parse the message.");
    }

    /* renamed from: f */
    static C9513f3 m44260f() {
        return new C9513f3("Protocol message had invalid UTF-8.");
    }
}
