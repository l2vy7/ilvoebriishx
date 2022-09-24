package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class od2 implements zi2<pd2> {

    /* renamed from: a */
    private final zi2<ej2> f36387a;

    /* renamed from: b */
    private final bs2 f36388b;

    /* renamed from: c */
    private final Context f36389c;

    /* renamed from: d */
    private final nn0 f36390d;

    public od2(ef2<ej2> ef2, bs2 bs2, Context context, nn0 nn0) {
        this.f36387a = ef2;
        this.f36388b = bs2;
        this.f36389c = context;
        this.f36390d = nn0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pd2 mo33871a(ej2 ej2) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        zzbfi zzbfi = this.f36388b.f30088e;
        zzbfi[] zzbfiArr = zzbfi.f42970h;
        if (zzbfiArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzbfi zzbfi2 : zzbfiArr) {
                boolean z4 = zzbfi2.f42972j;
                if (!z4 && !z2) {
                    str = zzbfi2.f42964b;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzbfi.f42964b;
            z = zzbfi.f42972j;
        }
        Resources resources = this.f36389c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f36390d.mo18583h().zzl();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzbfi[] zzbfiArr2 = zzbfi.f42970h;
        if (zzbfiArr2 != null) {
            boolean z5 = false;
            for (zzbfi zzbfi3 : zzbfiArr2) {
                if (zzbfi3.f42972j) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzbfi3.f42968f;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (((float) zzbfi3.f42969g) / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzbfi3.f42965c;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (((float) zzbfi3.f42966d) / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new pd2(zzbfi, str, z, sb.toString(), f, i2, i, str2, this.f36388b.f30099p);
    }

    public final mb3<pd2> zzb() {
        return bb3.m30653m(this.f36387a.zzb(), new nd2(this), po0.f37727f);
    }
}
