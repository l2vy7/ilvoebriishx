package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7195d;
import com.google.android.gms.common.internal.C7408m;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7220b<O extends C7191a.C7195d> {

    /* renamed from: a */
    private final int f28968a;

    /* renamed from: b */
    private final C7191a<O> f28969b;

    /* renamed from: c */
    private final O f28970c;

    /* renamed from: d */
    private final String f28971d;

    private C7220b(C7191a<O> aVar, O o, String str) {
        this.f28969b = aVar;
        this.f28970c = o;
        this.f28971d = str;
        this.f28968a = C7408m.m30029b(aVar, o, str);
    }

    /* renamed from: a */
    public static <O extends C7191a.C7195d> C7220b<O> m29599a(C7191a<O> aVar, O o, String str) {
        return new C7220b<>(aVar, o, str);
    }

    /* renamed from: b */
    public final String mo29817b() {
        return this.f28969b.mo29744d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7220b)) {
            return false;
        }
        C7220b bVar = (C7220b) obj;
        return C7408m.m30028a(this.f28969b, bVar.f28969b) && C7408m.m30028a(this.f28970c, bVar.f28970c) && C7408m.m30028a(this.f28971d, bVar.f28971d);
    }

    public final int hashCode() {
        return this.f28968a;
    }
}
