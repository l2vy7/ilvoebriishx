package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o03 extends l03 {

    /* renamed from: a */
    private String f36214a;

    /* renamed from: b */
    private Boolean f36215b;

    /* renamed from: c */
    private Boolean f36216c;

    o03() {
    }

    /* renamed from: a */
    public final l03 mo33220a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f36214a = str;
        return this;
    }

    /* renamed from: b */
    public final l03 mo33221b(boolean z) {
        this.f36216c = Boolean.TRUE;
        return this;
    }

    /* renamed from: c */
    public final l03 mo33222c(boolean z) {
        this.f36215b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final m03 mo33223d() {
        Boolean bool;
        String str = this.f36214a;
        if (str != null && (bool = this.f36215b) != null && this.f36216c != null) {
            return new q03(str, bool.booleanValue(), this.f36216c.booleanValue(), (p03) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36214a == null) {
            sb.append(" clientVersion");
        }
        if (this.f36215b == null) {
            sb.append(" shouldGetAdvertisingId");
        }
        if (this.f36216c == null) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
