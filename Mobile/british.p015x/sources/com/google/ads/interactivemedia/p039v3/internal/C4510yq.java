package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yq */
/* compiled from: IMASDK */
public final class C4510yq implements C4506ym {
    public static final Parcelable.Creator<C4510yq> CREATOR = new C4509yp();

    /* renamed from: f */
    private static final C4120ke f19690f;

    /* renamed from: g */
    private static final C4120ke f19691g;

    /* renamed from: a */
    public final String f19692a;

    /* renamed from: b */
    public final String f19693b;

    /* renamed from: c */
    public final long f19694c;

    /* renamed from: d */
    public final long f19695d;

    /* renamed from: e */
    public final byte[] f19696e;

    /* renamed from: h */
    private int f19697h;

    static {
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(MimeTypes.APPLICATION_ID3);
        f19690f = kdVar.mo16115a();
        C4119kd kdVar2 = new C4119kd();
        kdVar2.mo16120ae(MimeTypes.APPLICATION_SCTE35);
        f19691g = kdVar2.mo16115a();
    }

    C4510yq(Parcel parcel) {
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19692a = readString;
        this.f19693b = parcel.readString();
        this.f19694c = parcel.readLong();
        this.f19695d = parcel.readLong();
        this.f19696e = (byte[]) amm.m14236f(parcel.createByteArray());
    }

    public C4510yq(String str, String str2, long j, long j2, byte[] bArr) {
        this.f19692a = str;
        this.f19693b = str2;
        this.f19694c = j;
        this.f19695d = j2;
        this.f19696e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p039v3.internal.C4120ke mo16844a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f19692a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            com.google.ads.interactivemedia.v3.internal.ke r0 = f19691g
            return r0
        L_0x0042:
            com.google.ads.interactivemedia.v3.internal.ke r0 = f19690f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4510yq.mo16844a():com.google.ads.interactivemedia.v3.internal.ke");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4510yq.class == obj.getClass()) {
            C4510yq yqVar = (C4510yq) obj;
            return this.f19694c == yqVar.f19694c && this.f19695d == yqVar.f19695d && amm.m14233c(this.f19692a, yqVar.f19692a) && amm.m14233c(this.f19693b, yqVar.f19693b) && Arrays.equals(this.f19696e, yqVar.f19696e);
        }
    }

    public final int hashCode() {
        int i = this.f19697h;
        if (i != 0) {
            return i;
        }
        String str = this.f19692a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19693b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f19694c;
        long j2 = this.f19695d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f19696e);
        this.f19697h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f19692a;
        long j = this.f19695d;
        long j2 = this.f19694c;
        String str2 = this.f19693b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19692a);
        parcel.writeString(this.f19693b);
        parcel.writeLong(this.f19694c);
        parcel.writeLong(this.f19695d);
        parcel.writeByteArray(this.f19696e);
    }
}
