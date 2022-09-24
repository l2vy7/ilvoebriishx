package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbg;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zzbj;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nq0 {

    /* renamed from: a */
    private final Context f36071a;

    /* renamed from: b */
    private final String f36072b;

    /* renamed from: c */
    private final zzcjf f36073c;

    /* renamed from: d */
    private final b10 f36074d;

    /* renamed from: e */
    private final e10 f36075e;

    /* renamed from: f */
    private final zzbj f36076f;

    /* renamed from: g */
    private final long[] f36077g;

    /* renamed from: h */
    private final String[] f36078h;

    /* renamed from: i */
    private boolean f36079i = false;

    /* renamed from: j */
    private boolean f36080j = false;

    /* renamed from: k */
    private boolean f36081k = false;

    /* renamed from: l */
    private boolean f36082l = false;

    /* renamed from: m */
    private boolean f36083m;

    /* renamed from: n */
    private sp0 f36084n;

    /* renamed from: o */
    private boolean f36085o;

    /* renamed from: p */
    private boolean f36086p;

    /* renamed from: q */
    private long f36087q = -1;

    public nq0(Context context, zzcjf zzcjf, String str, e10 e10, b10 b10) {
        zzbh zzbh = new zzbh();
        zzbh zzbh2 = zzbh;
        zzbh2.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbh2.zza("1_5", 1.0d, 5.0d);
        zzbh2.zza("5_10", 5.0d, 10.0d);
        zzbh2.zza("10_20", 10.0d, 20.0d);
        zzbh2.zza("20_30", 20.0d, 30.0d);
        zzbh2.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f36076f = zzbh.zzb();
        this.f36071a = context;
        this.f36073c = zzcjf;
        this.f36072b = str;
        this.f36075e = e10;
        this.f36074d = b10;
        String str2 = (String) C8311wv.m39277c().mo18570b(p00.f37225v);
        if (str2 == null) {
            this.f36078h = new String[0];
            this.f36077g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f36078h = new String[length];
        this.f36077g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f36077g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                co0.zzk("Unable to parse frame hash target time number.", e);
                this.f36077g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo33729a(sp0 sp0) {
        w00.m39004a(this.f36075e, this.f36074d, "vpc2");
        this.f36079i = true;
        this.f36075e.mo18243d("vpn", sp0.mo31386p());
        this.f36084n = sp0;
    }

    /* renamed from: b */
    public final void mo33730b() {
        if (this.f36079i && !this.f36080j) {
            w00.m39004a(this.f36075e, this.f36074d, "vfr2");
            this.f36080j = true;
        }
    }

    /* renamed from: c */
    public final void mo33731c() {
        this.f36083m = true;
        if (this.f36080j && !this.f36081k) {
            w00.m39004a(this.f36075e, this.f36074d, "vfp2");
            this.f36081k = true;
        }
    }

    /* renamed from: d */
    public final void mo33732d() {
        String str;
        if (s20.f38854a.mo34648e().booleanValue() && !this.f36085o) {
            Bundle bundle = new Bundle();
            bundle.putString(SessionDescription.ATTR_TYPE, "native-player-metrics");
            bundle.putString("request", this.f36072b);
            bundle.putString("player", this.f36084n.mo31386p());
            for (zzbg next : this.f36076f.zza()) {
                String valueOf = String.valueOf(next.zza);
                if (valueOf.length() != 0) {
                    str = "fps_c_".concat(valueOf);
                } else {
                    str = new String("fps_c_");
                }
                bundle.putString(str, Integer.toString(next.zze));
                String valueOf2 = String.valueOf(next.zza);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.zzd));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f36077g;
                if (i < jArr.length) {
                    String str2 = this.f36078h[i];
                    if (str2 != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
                    }
                    i++;
                } else {
                    zzt.zzp().zzn(this.f36071a, this.f36073c.f43036b, "gmob-apps", bundle, true);
                    this.f36085o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo33733e() {
        this.f36083m = false;
    }

    /* renamed from: f */
    public final void mo33734f(sp0 sp0) {
        if (this.f36081k && !this.f36082l) {
            if (zze.zzc() && !this.f36082l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            w00.m39004a(this.f36075e, this.f36074d, "vff2");
            this.f36082l = true;
        }
        long a = zzt.zzA().mo24318a();
        if (this.f36083m && this.f36086p && this.f36087q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1);
            long j = this.f36087q;
            zzbj zzbj = this.f36076f;
            double d = (double) nanos;
            double d2 = (double) (a - j);
            Double.isNaN(d);
            Double.isNaN(d2);
            zzbj.zzb(d / d2);
        }
        this.f36086p = this.f36083m;
        this.f36087q = a;
        long longValue = ((Long) C8311wv.m39277c().mo18570b(p00.f37233w)).longValue();
        long h = (long) sp0.mo31372h();
        int i = 0;
        while (true) {
            String[] strArr = this.f36078h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(h - this.f36077g[i])) {
                String[] strArr2 = this.f36078h;
                int i2 = 8;
                Bitmap bitmap = sp0.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j2);
                        i4++;
                        j2--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j3)});
                return;
            }
            sp0 sp02 = sp0;
            i++;
        }
    }
}
