package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzj extends zzzu {
    public static final Parcelable.Creator<zzzj> CREATOR = new le4();

    /* renamed from: c */
    public final String f43100c;

    /* renamed from: d */
    public final int f43101d;

    /* renamed from: e */
    public final int f43102e;

    /* renamed from: f */
    public final long f43103f;

    /* renamed from: g */
    public final long f43104g;

    /* renamed from: h */
    private final zzzu[] f43105h;

    zzzj(Parcel parcel) {
        super(ChapterFrame.f27468ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43100c = readString;
        this.f43101d = parcel.readInt();
        this.f43102e = parcel.readInt();
        this.f43103f = parcel.readLong();
        this.f43104g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f43105h = new zzzu[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f43105h[i2] = (zzzu) parcel.readParcelable(zzzu.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzj.class == obj.getClass()) {
            zzzj zzzj = (zzzj) obj;
            return this.f43101d == zzzj.f43101d && this.f43102e == zzzj.f43102e && this.f43103f == zzzj.f43103f && this.f43104g == zzzj.f43104g && d13.m20317p(this.f43100c, zzzj.f43100c) && Arrays.equals(this.f43105h, zzzj.f43105h);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f43101d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f43102e) * 31) + ((int) this.f43103f)) * 31) + ((int) this.f43104g)) * 31;
        String str = this.f43100c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43100c);
        parcel.writeInt(this.f43101d);
        parcel.writeInt(this.f43102e);
        parcel.writeLong(this.f43103f);
        parcel.writeLong(this.f43104g);
        parcel.writeInt(this.f43105h.length);
        for (zzzu writeParcelable : this.f43105h) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzzj(String str, int i, int i2, long j, long j2, zzzu[] zzzuArr) {
        super(ChapterFrame.f27468ID);
        this.f43100c = str;
        this.f43101d = i;
        this.f43102e = i2;
        this.f43103f = j;
        this.f43104g = j2;
        this.f43105h = zzzuArr;
    }
}
