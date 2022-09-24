package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vm */
/* compiled from: IMASDK */
public final class C4425vm implements C4432vt {

    /* renamed from: a */
    private final alv f19188a;

    /* renamed from: b */
    private final alw f19189b;

    /* renamed from: c */
    private final String f19190c;

    /* renamed from: d */
    private String f19191d;

    /* renamed from: e */
    private C4327rw f19192e;

    /* renamed from: f */
    private int f19193f;

    /* renamed from: g */
    private int f19194g;

    /* renamed from: h */
    private boolean f19195h;

    /* renamed from: i */
    private boolean f19196i;

    /* renamed from: j */
    private long f19197j;

    /* renamed from: k */
    private C4120ke f19198k;

    /* renamed from: l */
    private int f19199l;

    /* renamed from: m */
    private long f19200m;

    public C4425vm() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19193f = 0;
        this.f19194g = 0;
        this.f19195h = false;
        this.f19196i = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19191d = xcVar.mo16765c();
        this.f19192e = reVar.mo13362ba(xcVar.mo16764b(), 1);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19200m = j;
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        byte b;
        boolean z;
        aup.m14889t(this.f19192e);
        while (alw.mo13947e() > 0) {
            int i = this.f19193f;
            if (i == 0) {
                while (true) {
                    if (alw.mo13947e() <= 0) {
                        break;
                    } else if (!this.f19195h) {
                        this.f19195h = alw.mo13957o() == 172;
                    } else {
                        int o = alw.mo13957o();
                        this.f19195h = o == 172;
                        b = 64;
                        if (o != 64) {
                            if (o == 65) {
                                break;
                            }
                        } else if (o != 65) {
                            z = false;
                        }
                    }
                }
                z = true;
                this.f19196i = z;
                this.f19193f = 1;
                this.f19189b.mo13952j()[0] = -84;
                byte[] j = this.f19189b.mo13952j();
                if (true == this.f19196i) {
                    b = 65;
                }
                j[1] = b;
                this.f19194g = 2;
            } else if (i != 1) {
                int min = Math.min(alw.mo13947e(), this.f19199l - this.f19194g);
                this.f19192e.mo13406d(alw, min);
                int i2 = this.f19194g + min;
                this.f19194g = i2;
                int i3 = this.f19199l;
                if (i2 == i3) {
                    this.f19192e.mo13404b(this.f19200m, 1, i3, 0, (C4326rv) null);
                    this.f19200m += this.f19197j;
                    this.f19193f = 0;
                }
            } else {
                byte[] j2 = this.f19189b.mo13952j();
                int min2 = Math.min(alw.mo13947e(), 16 - this.f19194g);
                alw.mo13956n(j2, this.f19194g, min2);
                int i4 = this.f19194g + min2;
                this.f19194g = i4;
                if (i4 == 16) {
                    this.f19188a.mo13923e(0);
                    C4208nl a = C4209nm.m18276a(this.f19188a);
                    C4120ke keVar = this.f19198k;
                    if (keVar == null || keVar.f17694y != 2 || a.f18083a != keVar.f17695z || !MimeTypes.AUDIO_AC4.equals(keVar.f17681l)) {
                        C4119kd kdVar = new C4119kd();
                        kdVar.mo16107S(this.f19191d);
                        kdVar.mo16120ae(MimeTypes.AUDIO_AC4);
                        kdVar.mo16096H(2);
                        kdVar.mo16121af(a.f18083a);
                        kdVar.mo16110V(this.f19190c);
                        C4120ke a2 = kdVar.mo16115a();
                        this.f19198k = a2;
                        this.f19192e.mo13403a(a2);
                    }
                    this.f19199l = a.f18084b;
                    this.f19197j = (((long) a.f18085c) * 1000000) / ((long) this.f19198k.f17695z);
                    this.f19189b.mo13951i(0);
                    this.f19192e.mo13406d(this.f19189b, 16);
                    this.f19193f = 2;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
    }

    public C4425vm(String str) {
        alv alv = new alv(new byte[16]);
        this.f19188a = alv;
        this.f19189b = new alw(alv.f15245a);
        this.f19193f = 0;
        this.f19194g = 0;
        this.f19195h = false;
        this.f19196i = false;
        this.f19190c = str;
    }
}
