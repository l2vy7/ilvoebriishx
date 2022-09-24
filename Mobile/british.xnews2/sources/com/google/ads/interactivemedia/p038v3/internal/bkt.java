package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkt */
/* compiled from: IMASDK */
public class bkt extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public bkt(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static bkt m16348a() {
        return new bkt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static bkt m16349b() {
        return new bkt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static bkt m16350c() {
        return new bkt("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static bkt m16351d() {
        return new bkt("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static bkt m16352e() {
        return new bkt("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static bks m16353f() {
        return new bks();
    }

    /* renamed from: g */
    static bkt m16354g() {
        return new bkt("Failed to parse the message.");
    }

    /* renamed from: h */
    static bkt m16355h() {
        return new bkt("Protocol message had invalid UTF-8.");
    }

    public bkt(String str) {
        super(str);
    }
}
