package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import javax.annotation.Nullable;
import p256v4.C11058b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C7464a();

    /* renamed from: b */
    final int f20055b;

    /* renamed from: c */
    private final long f20056c;

    /* renamed from: d */
    private int f20057d;

    /* renamed from: e */
    private final String f20058e;

    /* renamed from: f */
    private final String f20059f;

    /* renamed from: g */
    private final String f20060g;

    /* renamed from: h */
    private final int f20061h;
    @Nullable

    /* renamed from: i */
    private final List<String> f20062i;

    /* renamed from: j */
    private final String f20063j;

    /* renamed from: k */
    private final long f20064k;

    /* renamed from: l */
    private int f20065l;

    /* renamed from: m */
    private final String f20066m;

    /* renamed from: n */
    private final float f20067n;

    /* renamed from: o */
    private final long f20068o;

    /* renamed from: p */
    private final boolean f20069p;

    /* renamed from: q */
    private long f20070q = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, @Nullable List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f20055b = i;
        this.f20056c = j;
        this.f20057d = i2;
        this.f20058e = str;
        this.f20059f = str3;
        this.f20060g = str5;
        this.f20061h = i3;
        this.f20062i = list;
        this.f20063j = str2;
        this.f20064k = j2;
        this.f20065l = i4;
        this.f20066m = str4;
        this.f20067n = f;
        this.f20068o = j3;
        this.f20069p = z;
    }

    /* renamed from: C0 */
    public final String mo18003C0() {
        String str;
        List<String> list = this.f20062i;
        String str2 = this.f20058e;
        int i = this.f20061h;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f20065l;
        String str4 = this.f20059f;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f20066m;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f20067n;
        String str6 = this.f20060g;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f20069p;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + str4.length() + str5.length() + str3.length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f20055b);
        C11058b.m49531q(parcel, 2, this.f20056c);
        C11058b.m49537w(parcel, 4, this.f20058e, false);
        C11058b.m49527m(parcel, 5, this.f20061h);
        C11058b.m49539y(parcel, 6, this.f20062i, false);
        C11058b.m49531q(parcel, 8, this.f20064k);
        C11058b.m49537w(parcel, 10, this.f20059f, false);
        C11058b.m49527m(parcel, 11, this.f20057d);
        C11058b.m49537w(parcel, 12, this.f20063j, false);
        C11058b.m49537w(parcel, 13, this.f20066m, false);
        C11058b.m49527m(parcel, 14, this.f20065l);
        C11058b.m49524j(parcel, 15, this.f20067n);
        C11058b.m49531q(parcel, 16, this.f20068o);
        C11058b.m49537w(parcel, 17, this.f20060g, false);
        C11058b.m49517c(parcel, 18, this.f20069p);
        C11058b.m49516b(parcel, a);
    }

    public final int zza() {
        return this.f20057d;
    }

    public final long zzb() {
        return this.f20070q;
    }

    public final long zzc() {
        return this.f20056c;
    }
}
