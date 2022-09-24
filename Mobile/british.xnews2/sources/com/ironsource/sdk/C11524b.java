package com.ironsource.sdk;

import com.ironsource.sdk.p296j.C11720a;
import java.util.Map;

/* renamed from: com.ironsource.sdk.b */
public final class C11524b {

    /* renamed from: a */
    public final boolean f51826a;

    /* renamed from: b */
    public String f51827b;

    /* renamed from: c */
    public String f51828c;

    /* renamed from: d */
    public boolean f51829d;

    /* renamed from: e */
    public C11515a f51830e;

    /* renamed from: f */
    public Map<String, String> f51831f;

    /* renamed from: g */
    public C11720a f51832g;

    /* renamed from: h */
    public boolean f51833h = false;

    C11524b(String str, String str2, boolean z, boolean z2, Map<String, String> map, C11720a aVar, C11515a aVar2) {
        this.f51827b = str;
        this.f51828c = str2;
        this.f51826a = z;
        this.f51829d = z2;
        this.f51831f = map;
        this.f51832g = aVar;
        this.f51830e = aVar2;
    }

    /* renamed from: a */
    public final boolean mo44602a() {
        C11515a aVar = this.f51830e;
        if (aVar != null) {
            if (aVar.f51791b > 0 && aVar.f51790a > 0) {
                return true;
            }
        }
        return false;
    }
}
