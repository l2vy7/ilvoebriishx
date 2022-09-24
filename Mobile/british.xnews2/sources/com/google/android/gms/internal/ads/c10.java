package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c10 {

    /* renamed from: a */
    private final Map<String, b10> f20157a = new HashMap();

    /* renamed from: b */
    private final e10 f20158b;

    public c10(e10 e10) {
        this.f20158b = e10;
    }

    /* renamed from: a */
    public final e10 mo18174a() {
        return this.f20158b;
    }

    /* renamed from: b */
    public final void mo18175b(String str, b10 b10) {
        this.f20157a.put(str, b10);
    }

    /* renamed from: c */
    public final void mo18176c(String str, String str2, long j) {
        e10 e10 = this.f20158b;
        b10 b10 = this.f20157a.get(str2);
        String[] strArr = {str};
        if (b10 != null) {
            e10.mo18244e(b10, j, strArr);
        }
        this.f20157a.put(str, new b10(j, (String) null, (b10) null));
    }
}
