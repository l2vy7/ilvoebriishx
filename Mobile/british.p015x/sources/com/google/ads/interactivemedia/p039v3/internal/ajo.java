package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.ext.rtmp.RtmpDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajo */
/* compiled from: IMASDK */
public final class ajo implements ajg {

    /* renamed from: a */
    private final Context f15090a;

    /* renamed from: b */
    private final List<akp> f15091b = new ArrayList();

    /* renamed from: c */
    private final ajg f15092c;

    /* renamed from: d */
    private ajg f15093d;

    /* renamed from: e */
    private ajg f15094e;

    /* renamed from: f */
    private ajg f15095f;

    /* renamed from: g */
    private ajg f15096g;

    /* renamed from: h */
    private ajg f15097h;

    /* renamed from: i */
    private ajg f15098i;

    /* renamed from: j */
    private ajg f15099j;

    /* renamed from: k */
    private ajg f15100k;

    public ajo(Context context, ajg ajg) {
        this.f15090a = context.getApplicationContext();
        aup.m14890u(ajg);
        this.f15092c = ajg;
    }

    /* renamed from: g */
    private final ajg m13876g() {
        if (this.f15094e == null) {
            aiu aiu = new aiu(this.f15090a);
            this.f15094e = aiu;
            m13877h(aiu);
        }
        return this.f15094e;
    }

    /* renamed from: h */
    private final void m13877h(ajg ajg) {
        for (int i = 0; i < this.f15091b.size(); i++) {
            ajg.mo13295b(this.f15091b.get(i));
        }
    }

    /* renamed from: i */
    private static final void m13878i(ajg ajg, akp akp) {
        if (ajg != null) {
            ajg.mo13295b(akp);
        }
    }

    /* renamed from: a */
    public final int mo13294a(byte[] bArr, int i, int i2) throws IOException {
        ajg ajg = this.f15100k;
        aup.m14890u(ajg);
        return ajg.mo13294a(bArr, i, i2);
    }

    /* renamed from: b */
    public final void mo13295b(akp akp) {
        aup.m14890u(akp);
        this.f15092c.mo13295b(akp);
        this.f15091b.add(akp);
        m13878i(this.f15093d, akp);
        m13878i(this.f15094e, akp);
        m13878i(this.f15095f, akp);
        m13878i(this.f15096g, akp);
        m13878i(this.f15097h, akp);
        m13878i(this.f15098i, akp);
        m13878i(this.f15099j, akp);
    }

    /* renamed from: c */
    public final long mo13296c(ajk ajk) throws IOException {
        ajg ajg;
        aup.m14887r(this.f15100k == null);
        String scheme = ajk.f15056a.getScheme();
        if (amm.m14232b(ajk.f15056a)) {
            String path = ajk.f15056a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f15093d == null) {
                    aju aju = new aju();
                    this.f15093d = aju;
                    m13877h(aju);
                }
                this.f15100k = this.f15093d;
            } else {
                this.f15100k = m13876g();
            }
        } else if ("asset".equals(scheme)) {
            this.f15100k = m13876g();
        } else if ("content".equals(scheme)) {
            if (this.f15095f == null) {
                ajc ajc = new ajc(this.f15090a);
                this.f15095f = ajc;
                m13877h(ajc);
            }
            this.f15100k = this.f15095f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f15096g == null) {
                Class<RtmpDataSource> cls = RtmpDataSource.class;
                try {
                    int i = RtmpDataSource.f27409a;
                    ajg ajg2 = (ajg) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f15096g = ajg2;
                    m13877h(ajg2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f15096g == null) {
                    this.f15096g = this.f15092c;
                }
            }
            this.f15100k = this.f15096g;
        } else if ("udp".equals(scheme)) {
            if (this.f15097h == null) {
                akr akr = new akr();
                this.f15097h = akr;
                m13877h(akr);
            }
            this.f15100k = this.f15097h;
        } else if ("data".equals(scheme)) {
            if (this.f15098i == null) {
                aje aje = new aje();
                this.f15098i = aje;
                m13877h(aje);
            }
            this.f15100k = this.f15098i;
        } else {
            if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f15099j == null) {
                    akn akn = new akn(this.f15090a);
                    this.f15099j = akn;
                    m13877h(akn);
                }
                ajg = this.f15099j;
            } else {
                ajg = this.f15092c;
            }
            this.f15100k = ajg;
        }
        return this.f15100k.mo13296c(ajk);
    }

    /* renamed from: d */
    public final Uri mo13297d() {
        ajg ajg = this.f15100k;
        if (ajg == null) {
            return null;
        }
        return ajg.mo13297d();
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo13298e() {
        ajg ajg = this.f15100k;
        return ajg == null ? Collections.emptyMap() : ajg.mo13298e();
    }

    /* renamed from: f */
    public final void mo13299f() throws IOException {
        ajg ajg = this.f15100k;
        if (ajg != null) {
            try {
                ajg.mo13299f();
            } finally {
                this.f15100k = null;
            }
        }
    }
}
