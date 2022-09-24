package com.google.ads.interactivemedia.p038v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vq */
/* compiled from: IMASDK */
public final class C4429vq implements C4468xb {

    /* renamed from: a */
    private final int f19236a;

    /* renamed from: b */
    private final List<C4120ke> f19237b;

    public C4429vq() {
        this((byte[]) null);
    }

    public C4429vq(int i, List<C4120ke> list) {
        this.f19236a = i;
        this.f19237b = list;
    }

    /* renamed from: c */
    private final C4457wr m19265c(C4467xa xaVar) {
        return new C4457wr(m19267e(xaVar));
    }

    /* renamed from: d */
    private final C4471xe m19266d(C4467xa xaVar) {
        return new C4471xe(m19267e(xaVar));
    }

    /* renamed from: e */
    private final List<C4120ke> m19267e(C4467xa xaVar) {
        String str;
        int i;
        List list;
        if (m19268f(32)) {
            return this.f19237b;
        }
        alw alw = new alw(xaVar.f19529d);
        List<C4120ke> list2 = this.f19237b;
        while (alw.mo13947e() > 0) {
            int o = alw.mo13957o();
            int h = alw.mo13950h() + alw.mo13957o();
            if (o == 134) {
                list2 = new ArrayList<>();
                int o2 = alw.mo13957o() & 31;
                for (int i2 = 0; i2 < o2; i2++) {
                    String F = alw.mo13937F(3);
                    int o3 = alw.mo13957o();
                    int i3 = o3 & 128;
                    if (i3 != 0) {
                        i = o3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte o4 = (byte) alw.mo13957o();
                    alw.mo13954l(1);
                    if (i3 != 0) {
                        int i4 = akt.f15178a;
                        list = Collections.singletonList((o4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C4119kd kdVar = new C4119kd();
                    kdVar.mo16120ae(str);
                    kdVar.mo16110V(F);
                    kdVar.mo16094F(i);
                    kdVar.mo16108T(list);
                    list2.add(kdVar.mo16115a());
                }
            }
            alw.mo13951i(h);
        }
        return list2;
    }

    /* renamed from: f */
    private final boolean m19268f(int i) {
        return (i & this.f19236a) != 0;
    }

    /* renamed from: a */
    public final SparseArray<C4470xd> mo16712a() {
        return new SparseArray<>();
    }

    /* renamed from: b */
    public final C4470xd mo16713b(int i, C4467xa xaVar) {
        if (i == 2) {
            return new C4449wj(new C4434vv(m19266d(xaVar)));
        }
        if (i == 3 || i == 4) {
            return new C4449wj(new C4446wg(xaVar.f19527b));
        }
        if (i == 21) {
            return new C4449wj(new C4444we());
        }
        if (i != 27) {
            if (i == 36) {
                return new C4449wj(new C4443wd(m19265c(xaVar)));
            }
            if (i == 89) {
                return new C4449wj(new C4431vs(xaVar.f19528c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C4449wj(new C4425vm(xaVar.f19527b));
                }
                if (i == 257) {
                    return new C4456wq(new C4448wi(MimeTypes.APPLICATION_AIT));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (m19268f(2)) {
                                            return null;
                                        }
                                        return new C4449wj(new C4428vp(false, xaVar.f19527b));
                                    case 16:
                                        return new C4449wj(new C4437vy(m19266d(xaVar)));
                                    case 17:
                                        if (m19268f(2)) {
                                            return null;
                                        }
                                        return new C4449wj(new C4445wf(xaVar.f19527b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (m19268f(16)) {
                            return null;
                        } else {
                            return new C4456wq(new C4448wi(MimeTypes.APPLICATION_SCTE35));
                        }
                    } else if (!m19268f(64)) {
                        return null;
                    }
                }
                return new C4449wj(new C4422vj(xaVar.f19527b));
            }
            return new C4449wj(new C4430vr(xaVar.f19527b));
        } else if (m19268f(4)) {
            return null;
        } else {
            return new C4449wj(new C4441wb(m19265c(xaVar), m19268f(1), m19268f(8)));
        }
    }

    public C4429vq(byte[] bArr) {
        this(0, atz.m14807i());
    }
}
