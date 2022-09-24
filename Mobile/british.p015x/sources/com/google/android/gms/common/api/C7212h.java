package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C7305s;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7212h {
    /* renamed from: a */
    public static <R extends C7341k> C7210g<R> m29547a(R r, C7206f fVar) {
        C4604n.m20099l(r, "Result must not be null");
        C4604n.m20089b(!r.mo29527p0().mo29735G0(), "Status code must not be SUCCESS");
        C7350t tVar = new C7350t(fVar, r);
        tVar.mo29791i(r);
        return tVar;
    }

    /* renamed from: b */
    public static C7210g<Status> m29548b(Status status, C7206f fVar) {
        C4604n.m20099l(status, "Result must not be null");
        C7305s sVar = new C7305s(fVar);
        sVar.mo29791i(status);
        return sVar;
    }
}
