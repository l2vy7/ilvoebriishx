package com.google.ads.interactivemedia.p038v3.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ago */
/* compiled from: IMASDK */
public final class ago implements C4306rb {

    /* renamed from: a */
    private static final Pattern f14709a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f14710b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: c */
    private final String f14711c;

    /* renamed from: d */
    private final amk f14712d;

    /* renamed from: e */
    private final alw f14713e = new alw();

    /* renamed from: f */
    private C4309re f14714f;

    /* renamed from: g */
    private byte[] f14715g = new byte[1024];

    /* renamed from: h */
    private int f14716h;

    public ago(String str, amk amk) {
        this.f14711c = str;
        this.f14712d = amk;
    }

    /* renamed from: a */
    private final C4327rw m13607a(long j) {
        C4327rw ba = this.f14714f.mo13362ba(0, 3);
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.TEXT_VTT);
        kdVar.mo16110V(this.f14711c);
        kdVar.mo16124ai(j);
        ba.mo13403a(kdVar.mo16115a());
        this.f14714f.mo13363bb();
        return ba;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        rcVar.mo16599f(this.f14715g, 0, 6, false);
        this.f14713e.mo13945c(this.f14715g, 6);
        if (ahr.m13720b(this.f14713e)) {
            return true;
        }
        rcVar.mo16599f(this.f14715g, 6, 3, false);
        this.f14713e.mo13945c(this.f14715g, 9);
        return ahr.m13720b(this.f14713e);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f14714f = reVar;
        reVar.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        String str;
        String str2;
        int i;
        aup.m14890u(this.f14714f);
        int m = (int) rcVar.mo16606m();
        int i2 = this.f14716h;
        byte[] bArr = this.f14715g;
        int length = bArr.length;
        if (i2 == length) {
            if (m != -1) {
                i = m;
            } else {
                m = length;
                i = -1;
            }
            this.f14715g = Arrays.copyOf(bArr, (m * 3) / 2);
            m = i;
        }
        byte[] bArr2 = this.f14715g;
        int i3 = this.f14716h;
        int a = rcVar.mo13294a(bArr2, i3, bArr2.length - i3);
        if (a != -1) {
            int i4 = this.f14716h + a;
            this.f14716h = i4;
            if (m == -1 || i4 != m) {
                return 0;
            }
        }
        alw alw = new alw(this.f14715g);
        ahr.m13719a(alw);
        long j = 0;
        long j2 = 0;
        for (String J = alw.mo13941J(); !TextUtils.isEmpty(J); J = alw.mo13941J()) {
            if (J.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f14709a.matcher(J);
                if (!matcher.find()) {
                    if (J.length() != 0) {
                        str = "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(J);
                    } else {
                        str = new String("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    }
                    throw new C4144lb(str);
                }
                Matcher matcher2 = f14710b.matcher(J);
                if (!matcher2.find()) {
                    if (J.length() != 0) {
                        str2 = "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(J);
                    } else {
                        str2 = new String("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                    }
                    throw new C4144lb(str2);
                }
                String group = matcher.group(1);
                aup.m14890u(group);
                j2 = ahr.m13721c(group);
                String group2 = matcher2.group(1);
                aup.m14890u(group2);
                j = amk.m14175h(Long.parseLong(group2));
            }
        }
        Matcher d = ahr.m13722d(alw);
        if (d == null) {
            m13607a(0);
        } else {
            String group3 = d.group(1);
            aup.m14890u(group3);
            long c = ahr.m13721c(group3);
            long f = this.f14712d.mo13998f(amk.m14176i((j + c) - j2) % 8589934592L);
            C4327rw a2 = m13607a(f - c);
            this.f14713e.mo13945c(this.f14715g, this.f14716h);
            a2.mo13406d(this.f14713e, this.f14716h);
            a2.mo13404b(f, 1, this.f14716h, 0, (C4326rv) null);
        }
        return -1;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
