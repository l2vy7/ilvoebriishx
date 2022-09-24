package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.startapp.C12425x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rl */
/* compiled from: IMASDK */
public final class C4316rl {

    /* renamed from: a */
    public final int f18512a;

    /* renamed from: b */
    public final int f18513b;

    /* renamed from: c */
    public final int f18514c;

    /* renamed from: d */
    public final int f18515d;

    /* renamed from: e */
    public final int f18516e;

    /* renamed from: f */
    public final int f18517f;

    /* renamed from: g */
    public final int f18518g;

    /* renamed from: h */
    public final int f18519h;

    /* renamed from: i */
    public final int f18520i;

    /* renamed from: j */
    public final long f18521j;

    /* renamed from: k */
    public final C4315rk f18522k;

    /* renamed from: l */
    private final C4507yn f18523l;

    private C4316rl(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C4315rk rkVar, C4507yn ynVar) {
        this.f18512a = i;
        this.f18513b = i2;
        this.f18514c = i3;
        this.f18515d = i4;
        this.f18516e = i5;
        this.f18517f = m18782h(i5);
        this.f18518g = i6;
        this.f18519h = i7;
        this.f18520i = m18783i(i7);
        this.f18521j = j;
        this.f18522k = rkVar;
        this.f18523l = ynVar;
    }

    public C4316rl(byte[] bArr, int i) {
        alv alv = new alv(bArr);
        alv.mo13923e(i * 8);
        this.f18512a = alv.mo13927i(16);
        this.f18513b = alv.mo13927i(16);
        this.f18514c = alv.mo13927i(24);
        this.f18515d = alv.mo13927i(24);
        int i2 = alv.mo13927i(20);
        this.f18516e = i2;
        this.f18517f = m18782h(i2);
        this.f18518g = alv.mo13927i(3) + 1;
        int i3 = alv.mo13927i(5) + 1;
        this.f18519h = i3;
        this.f18520i = m18783i(i3);
        this.f18521j = amm.m14200Q(alv.mo13927i(4), alv.mo13927i(32));
        this.f18522k = null;
        this.f18523l = null;
    }

    /* renamed from: h */
    private static int m18782h(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /*16000*/:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /*48000*/:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /*192000*/:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    private static int m18783i(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    private static C4507yn m18784j(List<String> list, List<C4513yt> list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            String[] A = amm.m14184A(str2, "=");
            if (A.length != 2) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "Failed to parse Vorbis comment: ".concat(valueOf);
                } else {
                    str = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("FlacStreamMetadata", str);
            } else {
                arrayList.add(new C4515yv(A[0], A[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4507yn((List<? extends C4506ym>) arrayList);
    }

    /* renamed from: a */
    public final long mo16608a() {
        long j = this.f18521j;
        return j == 0 ? C6540C.TIME_UNSET : (j * 1000000) / ((long) this.f18516e);
    }

    /* renamed from: b */
    public final long mo16609b(long j) {
        return amm.m14192I((j * ((long) this.f18516e)) / 1000000, 0, this.f18521j - 1);
    }

    /* renamed from: c */
    public final C4120ke mo16610c(byte[] bArr, C4507yn ynVar) {
        bArr[4] = C12425x3.f55111d;
        int i = this.f18515d;
        if (i <= 0) {
            i = -1;
        }
        C4507yn d = mo16611d(ynVar);
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.AUDIO_FLAC);
        kdVar.mo16111W(i);
        kdVar.mo16096H(this.f18518g);
        kdVar.mo16121af(this.f18516e);
        kdVar.mo16108T(Collections.singletonList(bArr));
        kdVar.mo16112X(d);
        return kdVar.mo16115a();
    }

    /* renamed from: d */
    public final C4507yn mo16611d(C4507yn ynVar) {
        C4507yn ynVar2 = this.f18523l;
        return ynVar2 == null ? ynVar : ynVar2.mo16833c(ynVar);
    }

    /* renamed from: e */
    public final C4316rl mo16612e(C4315rk rkVar) {
        return new C4316rl(this.f18512a, this.f18513b, this.f18514c, this.f18515d, this.f18516e, this.f18518g, this.f18519h, this.f18521j, rkVar, this.f18523l);
    }

    /* renamed from: f */
    public final C4316rl mo16613f(List<String> list) {
        return new C4316rl(this.f18512a, this.f18513b, this.f18514c, this.f18515d, this.f18516e, this.f18518g, this.f18519h, this.f18521j, this.f18522k, mo16611d(m18784j(list, Collections.emptyList())));
    }

    /* renamed from: g */
    public final C4316rl mo16614g(List<C4513yt> list) {
        return new C4316rl(this.f18512a, this.f18513b, this.f18514c, this.f18515d, this.f18516e, this.f18518g, this.f18519h, this.f18521j, this.f18522k, mo16611d(m18784j(Collections.emptyList(), list)));
    }
}
