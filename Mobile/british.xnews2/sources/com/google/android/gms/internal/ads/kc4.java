package com.google.android.gms.internal.ads;

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

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kc4 {

    /* renamed from: a */
    public final int f34241a;

    /* renamed from: b */
    public final int f34242b;

    /* renamed from: c */
    public final int f34243c;

    /* renamed from: d */
    public final int f34244d;

    /* renamed from: e */
    public final int f34245e;

    /* renamed from: f */
    public final int f34246f;

    /* renamed from: g */
    public final int f34247g;

    /* renamed from: h */
    public final int f34248h;

    /* renamed from: i */
    public final int f34249i;

    /* renamed from: j */
    public final long f34250j;

    /* renamed from: k */
    public final jc4 f34251k;

    /* renamed from: l */
    private final zzdd f34252l;

    private kc4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, jc4 jc4, zzdd zzdd) {
        this.f34241a = i;
        this.f34242b = i2;
        this.f34243c = i3;
        this.f34244d = i4;
        this.f34245e = i5;
        this.f34246f = m33905i(i5);
        this.f34247g = i6;
        this.f34248h = i7;
        this.f34249i = m33904h(i7);
        this.f34250j = j;
        this.f34251k = jc4;
        this.f34252l = zzdd;
    }

    public kc4(byte[] bArr, int i) {
        tp2 tp2 = new tp2(bArr, bArr.length);
        tp2.mo35013h(i * 8);
        this.f34241a = tp2.mo35008c(16);
        this.f34242b = tp2.mo35008c(16);
        this.f34243c = tp2.mo35008c(24);
        this.f34244d = tp2.mo35008c(24);
        int c = tp2.mo35008c(20);
        this.f34245e = c;
        this.f34246f = m33905i(c);
        this.f34247g = tp2.mo35008c(3) + 1;
        int c2 = tp2.mo35008c(5) + 1;
        this.f34248h = c2;
        this.f34249i = m33904h(c2);
        this.f34250j = d13.m20299b0(tp2.mo35008c(4), tp2.mo35008c(32));
        this.f34251k = null;
        this.f34252l = null;
    }

    /* renamed from: h */
    private static int m33904h(int i) {
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

    /* renamed from: i */
    private static int m33905i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: j */
    private static zzdd m33906j(List<String> list, List<zzyz> list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            String[] E = d13.m20274E(str2, "=");
            if (E.length != 2) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "Failed to parse Vorbis comment: ".concat(valueOf);
                } else {
                    str = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("FlacStreamMetadata", str);
            } else {
                arrayList.add(new zzzb(E[0], E[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzdd((List<? extends zzdc>) arrayList);
    }

    /* renamed from: a */
    public final long mo33060a() {
        long j = this.f34250j;
        return j == 0 ? C6540C.TIME_UNSET : (j * 1000000) / ((long) this.f34245e);
    }

    /* renamed from: b */
    public final long mo33061b(long j) {
        return d13.m20290U((j * ((long) this.f34245e)) / 1000000, 0, this.f34250j - 1);
    }

    /* renamed from: c */
    public final C8281w mo33062c(byte[] bArr, zzdd zzdd) {
        bArr[4] = C12425x3.f55111d;
        int i = this.f34244d;
        if (i <= 0) {
            i = -1;
        }
        zzdd d = mo33063d(zzdd);
        ge4 ge4 = new ge4();
        ge4.mo32093s(MimeTypes.AUDIO_FLAC);
        ge4.mo32086l(i);
        ge4.mo32076e0(this.f34247g);
        ge4.mo32094t(this.f34245e);
        ge4.mo32083i(Collections.singletonList(bArr));
        ge4.mo32087m(d);
        return ge4.mo32099y();
    }

    /* renamed from: d */
    public final zzdd mo33063d(zzdd zzdd) {
        zzdd zzdd2 = this.f34252l;
        return zzdd2 == null ? zzdd : zzdd2.mo36277e(zzdd);
    }

    /* renamed from: e */
    public final kc4 mo33064e(List<zzyz> list) {
        return new kc4(this.f34241a, this.f34242b, this.f34243c, this.f34244d, this.f34245e, this.f34247g, this.f34248h, this.f34250j, this.f34251k, mo33063d(m33906j(Collections.emptyList(), list)));
    }

    /* renamed from: f */
    public final kc4 mo33065f(jc4 jc4) {
        return new kc4(this.f34241a, this.f34242b, this.f34243c, this.f34244d, this.f34245e, this.f34247g, this.f34248h, this.f34250j, jc4, this.f34252l);
    }

    /* renamed from: g */
    public final kc4 mo33066g(List<String> list) {
        return new kc4(this.f34241a, this.f34242b, this.f34243c, this.f34244d, this.f34245e, this.f34247g, this.f34248h, this.f34250j, this.f34251k, mo33063d(m33906j(list, Collections.emptyList())));
    }
}
