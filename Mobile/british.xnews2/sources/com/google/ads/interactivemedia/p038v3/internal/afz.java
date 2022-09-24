package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afz */
/* compiled from: IMASDK */
public final class afz implements abl {

    /* renamed from: a */
    private afw f14611a = afw.f14562a;

    /* renamed from: b */
    private ahi f14612b = new agp();

    /* renamed from: c */
    private ahj f14613c = agt.f14731a;

    /* renamed from: d */
    private C4287qj f14614d = new C4273pw();

    /* renamed from: e */
    private int f14615e = 1;

    /* renamed from: f */
    private List<C4543zw> f14616f = Collections.emptyList();

    /* renamed from: g */
    private long f14617g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private final afm f14618h;

    /* renamed from: i */
    private C4396uk f14619i = new C4396uk();

    /* renamed from: j */
    private aup f14620j = new aup();

    public afz(afm afm) {
        aup.m14890u(afm);
        this.f14618h = afm;
    }

    @Deprecated
    /* renamed from: a */
    public final aga mo13642a(Uri uri) {
        List<C4543zw> list;
        C4124ki kiVar = new C4124ki();
        kiVar.mo16144f(uri);
        kiVar.mo16142d(MimeTypes.APPLICATION_M3U8);
        C4129kn a = kiVar.mo16139a();
        aup.m14890u(a.f17729b);
        ahi ahi = this.f14612b;
        if (a.f17729b.f17724e.isEmpty()) {
            list = this.f14616f;
        } else {
            list = a.f17729b.f17724e;
        }
        agu agu = !list.isEmpty() ? new agu(ahi, list) : ahi;
        C4128km kmVar = a.f17729b;
        Object obj = kmVar.f17727h;
        if (kmVar.f17724e.isEmpty() && !list.isEmpty()) {
            C4124ki a2 = a.mo16153a();
            a2.mo16143e(list);
            a = a2.mo16139a();
        }
        afm afm = this.f14618h;
        afw afw = this.f14611a;
        C4396uk ukVar = this.f14619i;
        C4286qi a3 = this.f14614d.mo16529a(a);
        aup aup = this.f14620j;
        return new aga(a, afm, afw, ukVar, a3, aup, new agt(this.f14618h, aup, agu, (byte[]) null, (byte[]) null, (byte[]) null), this.f14617g, this.f14615e, (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
