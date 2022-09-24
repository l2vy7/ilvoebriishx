package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agt */
/* compiled from: IMASDK */
public final class agt implements aho, akb {

    /* renamed from: a */
    public static final ahj f14731a = agq.f14717a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ahi f14732b;

    /* renamed from: c */
    private final HashMap<Uri, ags> f14733c = new HashMap<>();

    /* renamed from: d */
    private final List<ahk> f14734d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public abj f14735e;

    /* renamed from: f */
    private aki f14736f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f14737g;

    /* renamed from: h */
    private ahn f14738h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public agx f14739i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Uri f14740j;

    /* renamed from: k */
    private ahd f14741k;

    /* renamed from: l */
    private boolean f14742l;

    /* renamed from: m */
    private long f14743m = C6540C.TIME_UNSET;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final afm f14744n;

    /* renamed from: o */
    private final aup f14745o;

    public agt(afm afm, aup aup, ahi ahi, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14744n = afm;
        this.f14732b = ahi;
        this.f14745o = aup;
    }

    /* renamed from: A */
    private static aha m13632A(ahd ahd, ahd ahd2) {
        int i = (int) (ahd2.f14799f - ahd.f14799f);
        List<aha> list = ahd.f14806m;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: n */
    static /* synthetic */ boolean m13634n(agt agt, Uri uri, long j) {
        int size = agt.f14734d.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !agt.f14734d.get(i).mo13641s(uri, j);
        }
        return z;
    }

    /* renamed from: r */
    static /* synthetic */ ahd m13638r(agt agt, ahd ahd, ahd ahd2) {
        long j;
        int i;
        aha A;
        int size;
        int size2;
        int size3;
        agt agt2 = agt;
        ahd ahd3 = ahd;
        ahd ahd4 = ahd2;
        if (ahd3 != null) {
            long j2 = ahd4.f14799f;
            long j3 = ahd3.f14799f;
            if (j2 <= j3 && (j2 < j3 || ((size = ahd4.f14806m.size() - ahd3.f14806m.size()) == 0 ? !((size2 = ahd4.f14807n.size()) > (size3 = ahd3.f14807n.size()) || (size2 == size3 && ahd4.f14803j && !ahd3.f14803j)) : size <= 0))) {
                if (!ahd4.f14803j || ahd3.f14803j) {
                    return ahd3;
                }
                return new ahd(ahd3.f14794a, ahd3.f14811r, ahd3.f14812s, ahd3.f14795b, ahd3.f14796c, ahd3.f14797d, ahd3.f14798e, ahd3.f14799f, ahd3.f14800g, ahd3.f14801h, ahd3.f14802i, ahd3.f14813t, true, ahd3.f14804k, ahd3.f14805l, ahd3.f14806m, ahd3.f14807n, ahd3.f14810q, ahd3.f14808o);
            }
        }
        if (ahd4.f14804k) {
            j = ahd4.f14796c;
        } else {
            ahd ahd5 = agt2.f14741k;
            j = ahd5 != null ? ahd5.f14796c : 0;
            if (ahd3 != null) {
                int size4 = ahd3.f14806m.size();
                aha A2 = m13632A(ahd, ahd2);
                if (A2 != null) {
                    j = ahd3.f14796c + A2.f14782g;
                } else if (((long) size4) == ahd4.f14799f - ahd3.f14799f) {
                    j = ahd.mo13716b();
                }
            }
        }
        long j4 = j;
        if (ahd4.f14797d) {
            i = ahd4.f14798e;
        } else {
            ahd ahd6 = agt2.f14741k;
            i = ahd6 != null ? ahd6.f14798e : 0;
            if (!(ahd3 == null || (A = m13632A(ahd, ahd2)) == null)) {
                i = (ahd3.f14798e + A.f14781f) - ahd4.f14806m.get(0).f14781f;
            }
        }
        return new ahd(ahd4.f14794a, ahd4.f14811r, ahd4.f14812s, ahd4.f14795b, j4, true, i, ahd4.f14799f, ahd4.f14800g, ahd4.f14801h, ahd4.f14802i, ahd4.f14813t, ahd4.f14803j, ahd4.f14804k, ahd4.f14805l, ahd4.f14806m, ahd4.f14807n, ahd4.f14810q, ahd4.f14808o);
    }

    /* renamed from: s */
    static /* synthetic */ void m13639s(agt agt, Uri uri, ahd ahd) {
        if (uri.equals(agt.f14740j)) {
            if (agt.f14741k == null) {
                agt.f14742l = !ahd.f14803j;
                agt.f14743m = ahd.f14796c;
            }
            agt.f14741k = ahd;
            agt.f14738h.mo13646y(ahd);
        }
        int size = agt.f14734d.size();
        for (int i = 0; i < size; i++) {
            agt.f14734d.get(i).mo13640r();
        }
    }

    /* renamed from: u */
    static /* synthetic */ boolean m13641u(agt agt) {
        List<agw> list = agt.f14739i.f14759c;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            ags ags = agt.f14733c.get(list.get(i).f14751a);
            aup.m14890u(ags);
            if (elapsedRealtime > ags.f14728i) {
                Uri i2 = ags.f14721b;
                agt.f14740j = i2;
                ags.m13619k(agt.m13643z(i2));
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private final Uri m13643z(Uri uri) {
        agz agz;
        ahd ahd = this.f14741k;
        if (ahd == null || !ahd.f14810q.f14793e || (agz = ahd.f14808o.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(agz.f14768a));
        int i = agz.f14769b;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    /* renamed from: a */
    public final void mo13703a(Uri uri, abj abj, ahn ahn) {
        this.f14737g = amm.m14241k();
        this.f14735e = abj;
        this.f14738h = ahn;
        akl akl = new akl(this.f14744n.mo13606a(), uri, 4, this.f14732b.mo13694a());
        aup.m14887r(this.f14736f == null);
        aki aki = new aki("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f14736f = aki;
        aki.mo13843e(akl, this, aup.m14894y(akl.f15153c));
        abj.mo13330d(new aas(akl.f15152b), akl.f15153c);
    }

    /* renamed from: b */
    public final void mo13704b() {
        this.f14740j = null;
        this.f14741k = null;
        this.f14739i = null;
        this.f14743m = C6540C.TIME_UNSET;
        this.f14736f.mo13846h();
        this.f14736f = null;
        for (ags e : this.f14733c.values()) {
            e.mo13701e();
        }
        this.f14737g.removeCallbacksAndMessages((Object) null);
        this.f14737g = null;
        this.f14733c.clear();
    }

    /* renamed from: c */
    public final void mo13705c(ahk ahk) {
        this.f14734d.add(ahk);
    }

    /* renamed from: d */
    public final void mo13706d(ahk ahk) {
        this.f14734d.remove(ahk);
    }

    /* renamed from: e */
    public final agx mo13707e() {
        return this.f14739i;
    }

    /* renamed from: f */
    public final ahd mo13708f(Uri uri, boolean z) {
        ahd a = this.f14733c.get(uri).mo13697a();
        if (a != null && z && !uri.equals(this.f14740j)) {
            List<agw> list = this.f14739i.f14759c;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(list.get(i).f14751a)) {
                    ahd ahd = this.f14741k;
                    if (ahd == null || !ahd.f14803j) {
                        this.f14740j = uri;
                        this.f14733c.get(uri).m13619k(m13643z(uri));
                    }
                } else {
                    i++;
                }
            }
        }
        return a;
    }

    /* renamed from: g */
    public final long mo13709g() {
        return this.f14743m;
    }

    /* renamed from: h */
    public final boolean mo13710h(Uri uri) {
        return this.f14733c.get(uri).mo13698b();
    }

    /* renamed from: i */
    public final void mo13711i() throws IOException {
        aki aki = this.f14736f;
        if (aki != null) {
            aki.mo13518a();
        }
        Uri uri = this.f14740j;
        if (uri != null) {
            mo13712j(uri);
        }
    }

    /* renamed from: j */
    public final void mo13712j(Uri uri) throws IOException {
        this.f14733c.get(uri).mo13700d();
    }

    /* renamed from: k */
    public final void mo13713k(Uri uri) {
        this.f14733c.get(uri).mo13699c();
    }

    /* renamed from: l */
    public final boolean mo13714l() {
        return this.f14742l;
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ akc mo13373v(ake ake, long j, long j2, IOException iOException, int i) {
        akl akl = (akl) ake;
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        aas aas = new aas();
        new aax(akl.f15153c);
        long z = aup.m14895z(new aka(iOException, i));
        boolean z2 = z == C6540C.TIME_UNSET;
        this.f14735e.mo13336j(aas, akl.f15153c, iOException, z2);
        return z2 ? aki.f15147c : aki.m13929b(false, z);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        akl akl = (akl) ake;
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        this.f14735e.mo13334h(new aas(), 4);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        agx agx;
        akl akl = (akl) ake;
        ahe ahe = (ahe) akl.mo13849a();
        boolean z = ahe instanceof ahd;
        if (z) {
            agx = agx.m13661b(ahe.f14811r);
        } else {
            agx = (agx) ahe;
        }
        this.f14739i = agx;
        this.f14740j = agx.f14759c.get(0).f14751a;
        List<Uri> list = agx.f14758b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f14733c.put(uri, new ags(this, uri));
        }
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        aas aas = new aas();
        ags ags = this.f14733c.get(this.f14740j);
        if (z) {
            ags.m13621m((ahd) ahe, aas);
        } else {
            ags.mo13699c();
        }
        this.f14735e.mo13332f(aas, 4);
    }
}
