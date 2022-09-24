package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t84 implements yd1 {

    /* renamed from: a */
    private final Context f39325a;

    /* renamed from: b */
    private final List<mt1> f39326b = new ArrayList();

    /* renamed from: c */
    private final yd1 f39327c;

    /* renamed from: d */
    private yd1 f39328d;

    /* renamed from: e */
    private yd1 f39329e;

    /* renamed from: f */
    private yd1 f39330f;

    /* renamed from: g */
    private yd1 f39331g;

    /* renamed from: h */
    private yd1 f39332h;

    /* renamed from: i */
    private yd1 f39333i;

    /* renamed from: j */
    private yd1 f39334j;

    /* renamed from: k */
    private yd1 f39335k;

    public t84(Context context, yd1 yd1) {
        this.f39325a = context.getApplicationContext();
        this.f39327c = yd1;
    }

    /* renamed from: j */
    private final yd1 m37722j() {
        if (this.f39329e == null) {
            c84 c84 = new c84(this.f39325a);
            this.f39329e = c84;
            m37723k(c84);
        }
        return this.f39329e;
    }

    /* renamed from: k */
    private final void m37723k(yd1 yd1) {
        for (int i = 0; i < this.f39326b.size(); i++) {
            yd1.mo30796h(this.f39326b.get(i));
        }
    }

    /* renamed from: l */
    private static final void m37724l(yd1 yd1, mt1 mt1) {
        if (yd1 != null) {
            yd1.mo30796h(mt1);
        }
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        yd1 yd1 = this.f39335k;
        Objects.requireNonNull(yd1);
        return yd1.mo30477b(bArr, i, i2);
    }

    /* renamed from: h */
    public final void mo30796h(mt1 mt1) {
        Objects.requireNonNull(mt1);
        this.f39327c.mo30796h(mt1);
        this.f39326b.add(mt1);
        m37724l(this.f39328d, mt1);
        m37724l(this.f39329e, mt1);
        m37724l(this.f39330f, mt1);
        m37724l(this.f39331g, mt1);
        m37724l(this.f39332h, mt1);
        m37724l(this.f39333i, mt1);
        m37724l(this.f39334j, mt1);
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws IOException {
        yd1 yd1;
        nu1.m20747f(this.f39335k == null);
        String scheme = ci1.f30390a.getScheme();
        if (d13.m20320s(ci1.f30390a)) {
            String path = ci1.f30390a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f39328d == null) {
                    x84 x84 = new x84();
                    this.f39328d = x84;
                    m37723k(x84);
                }
                this.f39335k = this.f39328d;
            } else {
                this.f39335k = m37722j();
            }
        } else if ("asset".equals(scheme)) {
            this.f39335k = m37722j();
        } else if ("content".equals(scheme)) {
            if (this.f39330f == null) {
                m84 m84 = new m84(this.f39325a);
                this.f39330f = m84;
                m37723k(m84);
            }
            this.f39335k = this.f39330f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f39331g == null) {
                try {
                    yd1 yd12 = (yd1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f39331g = yd12;
                    m37723k(yd12);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f39331g == null) {
                    this.f39331g = this.f39327c;
                }
            }
            this.f39335k = this.f39331g;
        } else if ("udp".equals(scheme)) {
            if (this.f39332h == null) {
                s94 s94 = new s94(2000);
                this.f39332h = s94;
                m37723k(s94);
            }
            this.f39335k = this.f39332h;
        } else if ("data".equals(scheme)) {
            if (this.f39333i == null) {
                n84 n84 = new n84();
                this.f39333i = n84;
                m37723k(n84);
            }
            this.f39335k = this.f39333i;
        } else {
            if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f39334j == null) {
                    k94 k94 = new k94(this.f39325a);
                    this.f39334j = k94;
                    m37723k(k94);
                }
                yd1 = this.f39334j;
            } else {
                yd1 = this.f39327c;
            }
            this.f39335k = yd1;
        }
        return this.f39335k.mo30478i(ci1);
    }

    public final Map<String, List<String>> zza() {
        yd1 yd1 = this.f39335k;
        return yd1 == null ? Collections.emptyMap() : yd1.zza();
    }

    public final Uri zzi() {
        yd1 yd1 = this.f39335k;
        if (yd1 == null) {
            return null;
        }
        return yd1.zzi();
    }

    public final void zzj() throws IOException {
        yd1 yd1 = this.f39335k;
        if (yd1 != null) {
            try {
                yd1.zzj();
            } finally {
                this.f39335k = null;
            }
        }
    }
}
