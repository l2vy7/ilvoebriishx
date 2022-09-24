package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ape */
/* compiled from: IMASDK */
public final class ape extends C4591e<C7191a.C7195d.C7199d> implements aoz {

    /* renamed from: a */
    private static final C7191a.C7202g<apf> f15525a;

    /* renamed from: b */
    private static final C7191a.C7192a<apf, C7191a.C7195d.C7199d> f15526b;

    /* renamed from: c */
    private static final C7191a<C7191a.C7195d.C7199d> f15527c;

    static {
        C7191a.C7202g<apf> gVar = new C7191a.C7202g<>();
        f15525a = gVar;
        apc apc = new apc();
        f15526b = apc;
        f15527c = new C7191a<>("SignalSdk.API", apc, gVar);
    }

    public ape(Context context) {
        super(context, f15527c, null, C4591e.C4592a.f19970c);
    }

    /* renamed from: a */
    public final aqs<String> mo14169a(String str, int i, String str2, boolean z) {
        if (z) {
            return arh.m14595b(new apa(8));
        }
        return doRead(C7310t.m29801a().mo29940d(aqa.f15556b).mo29939c(false).mo29938b(new apb(this, str, i, str2)).mo29937a());
    }
}
