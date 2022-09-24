package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agg */
/* compiled from: IMASDK */
final class agg implements C4327rw {

    /* renamed from: a */
    private static final C4120ke f14639a;

    /* renamed from: b */
    private final C4511yr f14640b = new C4511yr();

    /* renamed from: c */
    private final C4327rw f14641c;

    /* renamed from: d */
    private final C4120ke f14642d;

    /* renamed from: e */
    private C4120ke f14643e;

    /* renamed from: f */
    private byte[] f14644f;

    /* renamed from: g */
    private int f14645g;

    static {
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.APPLICATION_ID3);
        f14639a = kdVar.mo16115a();
        C4119kd kdVar2 = new C4119kd();
        kdVar2.mo16120ae(MimeTypes.APPLICATION_EMSG);
        kdVar2.mo16115a();
    }

    public agg(C4327rw rwVar, int i) {
        this.f14641c = rwVar;
        if (i == 1) {
            this.f14642d = f14639a;
            this.f14644f = new byte[0];
            this.f14645g = 0;
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown metadataType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    private final void m13548g(int i) {
        byte[] bArr = this.f14644f;
        if (bArr.length < i) {
            this.f14644f = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    /* renamed from: a */
    public final void mo13403a(C4120ke keVar) {
        this.f14643e = keVar;
        this.f14641c.mo13403a(this.f14642d);
    }

    /* renamed from: b */
    public final void mo13404b(long j, int i, int i2, int i3, C4326rv rvVar) {
        String str;
        aup.m14890u(this.f14643e);
        int i4 = this.f14645g - i3;
        alw alw = new alw(Arrays.copyOfRange(this.f14644f, i4 - i2, i4));
        byte[] bArr = this.f14644f;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f14645g = i3;
        if (!amm.m14233c(this.f14643e.f17681l, this.f14642d.f17681l)) {
            if (MimeTypes.APPLICATION_EMSG.equals(this.f14643e.f17681l)) {
                C4510yq c = C4511yr.m19609c(alw);
                C4120ke a = c.mo16844a();
                if (a == null || !amm.m14233c(this.f14642d.f17681l, a.f17681l)) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f14642d.f17681l, c.mo16844a()}));
                    return;
                }
                alw = new alw((byte[]) aup.m14890u(c.mo16844a() != null ? c.f19696e : null));
            } else {
                String valueOf = String.valueOf(this.f14643e.f17681l);
                if (valueOf.length() != 0) {
                    str = "Ignoring sample for unsupported format: ".concat(valueOf);
                } else {
                    str = new String("Ignoring sample for unsupported format: ");
                }
                Log.w("EmsgUnwrappingTrackOutput", str);
                return;
            }
        }
        int e = alw.mo13947e();
        this.f14641c.mo13406d(alw, e);
        this.f14641c.mo13404b(j, i, e, i3, rvVar);
    }

    /* renamed from: c */
    public final int mo13405c(ajd ajd, int i, boolean z) throws IOException {
        return ajq.m13892f(this, ajd, i, z);
    }

    /* renamed from: d */
    public final void mo13406d(alw alw, int i) {
        ajq.m13893g(this, alw, i);
    }

    /* renamed from: e */
    public final int mo13407e(ajd ajd, int i, boolean z) throws IOException {
        m13548g(this.f14645g + i);
        int a = ajd.mo13294a(this.f14644f, this.f14645g, i);
        if (a != -1) {
            this.f14645g += a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: f */
    public final void mo13408f(alw alw, int i) {
        m13548g(this.f14645g + i);
        alw.mo13956n(this.f14644f, this.f14645g, i);
        this.f14645g += i;
    }
}
