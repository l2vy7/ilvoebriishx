package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8301wk {

    /* renamed from: a */
    private int f40812a;

    /* renamed from: b */
    private final C8018ok[] f40813b;

    public C8301wk(C8018ok[] okVarArr, byte... bArr) {
        this.f40813b = okVarArr;
    }

    /* renamed from: a */
    public final C8018ok mo35640a(int i) {
        return this.f40813b[i];
    }

    /* renamed from: b */
    public final C8018ok[] mo35641b() {
        return (C8018ok[]) this.f40813b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8301wk.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f40813b, ((C8301wk) obj).f40813b);
    }

    public final int hashCode() {
        int i = this.f40812a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f40813b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.f40812a = hashCode;
        return hashCode;
    }
}
