package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzyw implements zzdc {
    public static final Parcelable.Creator<zzyw> CREATOR = new de4();

    /* renamed from: h */
    private static final C8281w f43071h;

    /* renamed from: i */
    private static final C8281w f43072i;

    /* renamed from: b */
    public final String f43073b;

    /* renamed from: c */
    public final String f43074c;

    /* renamed from: d */
    public final long f43075d;

    /* renamed from: e */
    public final long f43076e;

    /* renamed from: f */
    public final byte[] f43077f;

    /* renamed from: g */
    private int f43078g;

    static {
        ge4 ge4 = new ge4();
        ge4.mo32093s(MimeTypes.APPLICATION_ID3);
        f43071h = ge4.mo32099y();
        ge4 ge42 = new ge4();
        ge42.mo32093s(MimeTypes.APPLICATION_SCTE35);
        f43072i = ge42.mo32099y();
    }

    zzyw(Parcel parcel) {
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43073b = readString;
        this.f43074c = parcel.readString();
        this.f43075d = parcel.readLong();
        this.f43076e = parcel.readLong();
        this.f43077f = (byte[]) d13.m20300c(parcel.createByteArray());
    }

    public zzyw(String str, String str2, long j, long j2, byte[] bArr) {
        this.f43073b = str;
        this.f43074c = str2;
        this.f43075d = j;
        this.f43076e = j2;
        this.f43077f = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyw.class == obj.getClass()) {
            zzyw zzyw = (zzyw) obj;
            return this.f43075d == zzyw.f43075d && this.f43076e == zzyw.f43076e && d13.m20317p(this.f43073b, zzyw.f43073b) && d13.m20317p(this.f43074c, zzyw.f43074c) && Arrays.equals(this.f43077f, zzyw.f43077f);
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo36161g0(C7840jr jrVar) {
    }

    public final int hashCode() {
        int i = this.f43078g;
        if (i != 0) {
            return i;
        }
        String str = this.f43073b;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f43074c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f43075d;
        long j2 = this.f43076e;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f43077f);
        this.f43078g = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f43073b;
        long j = this.f43076e;
        long j2 = this.f43075d;
        String str2 = this.f43074c;
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
        parcel.writeString(this.f43073b);
        parcel.writeString(this.f43074c);
        parcel.writeLong(this.f43075d);
        parcel.writeLong(this.f43076e);
        parcel.writeByteArray(this.f43077f);
    }
}
