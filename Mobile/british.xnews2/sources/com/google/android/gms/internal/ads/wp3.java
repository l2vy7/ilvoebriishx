package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class wp3 extends IOException {

    /* renamed from: b */
    private uq3 f40845b = null;

    /* renamed from: c */
    private boolean f40846c;

    public wp3(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static vp3 m39222a() {
        return new vp3("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static wp3 m39223b() {
        return new wp3("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static wp3 m39224c() {
        return new wp3("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static wp3 m39225d() {
        return new wp3("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static wp3 m39226e() {
        return new wp3("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static wp3 m39227f() {
        return new wp3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static wp3 m39228g() {
        return new wp3("Failed to parse the message.");
    }

    /* renamed from: i */
    static wp3 m39229i() {
        return new wp3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static wp3 m39230j() {
        return new wp3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final wp3 mo35653h(uq3 uq3) {
        this.f40845b = uq3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo35654k() {
        this.f40846c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo35655l() {
        return this.f40846c;
    }

    public wp3(String str) {
        super(str);
    }
}
