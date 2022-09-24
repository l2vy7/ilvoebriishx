package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nd3 {

    /* renamed from: a */
    public final String f35983a;

    /* renamed from: b */
    public final C8281w f35984b;

    /* renamed from: c */
    public final C8281w f35985c;

    /* renamed from: d */
    public final int f35986d;

    /* renamed from: e */
    public final int f35987e;

    public nd3(String str, C8281w wVar, C8281w wVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            nu1.m20745d(z);
            nu1.m20744c(str);
            this.f35983a = str;
            Objects.requireNonNull(wVar);
            this.f35984b = wVar;
            Objects.requireNonNull(wVar2);
            this.f35985c = wVar2;
            this.f35986d = i;
            this.f35987e = i2;
        }
        z = true;
        nu1.m20745d(z);
        nu1.m20744c(str);
        this.f35983a = str;
        Objects.requireNonNull(wVar);
        this.f35984b = wVar;
        Objects.requireNonNull(wVar2);
        this.f35985c = wVar2;
        this.f35986d = i;
        this.f35987e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nd3.class == obj.getClass()) {
            nd3 nd3 = (nd3) obj;
            return this.f35986d == nd3.f35986d && this.f35987e == nd3.f35987e && this.f35983a.equals(nd3.f35983a) && this.f35984b.equals(nd3.f35984b) && this.f35985c.equals(nd3.f35985c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f35986d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f35987e) * 31) + this.f35983a.hashCode()) * 31) + this.f35984b.hashCode()) * 31) + this.f35985c.hashCode();
    }
}
