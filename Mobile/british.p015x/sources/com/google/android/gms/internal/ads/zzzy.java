package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzy extends zzzu {
    public static final Parcelable.Creator<zzzy> CREATOR = new ue4();

    /* renamed from: c */
    public final int f43122c;

    /* renamed from: d */
    public final int f43123d;

    /* renamed from: e */
    public final int f43124e;

    /* renamed from: f */
    public final int[] f43125f;

    /* renamed from: g */
    public final int[] f43126g;

    public zzzy(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.f27474ID);
        this.f43122c = i;
        this.f43123d = i2;
        this.f43124e = i3;
        this.f43125f = iArr;
        this.f43126g = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzy.class == obj.getClass()) {
            zzzy zzzy = (zzzy) obj;
            return this.f43122c == zzzy.f43122c && this.f43123d == zzzy.f43123d && this.f43124e == zzzy.f43124e && Arrays.equals(this.f43125f, zzzy.f43125f) && Arrays.equals(this.f43126g, zzzy.f43126g);
        }
    }

    public final int hashCode() {
        return ((((((((this.f43122c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f43123d) * 31) + this.f43124e) * 31) + Arrays.hashCode(this.f43125f)) * 31) + Arrays.hashCode(this.f43126g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43122c);
        parcel.writeInt(this.f43123d);
        parcel.writeInt(this.f43124e);
        parcel.writeIntArray(this.f43125f);
        parcel.writeIntArray(this.f43126g);
    }

    zzzy(Parcel parcel) {
        super(MlltFrame.f27474ID);
        this.f43122c = parcel.readInt();
        this.f43123d = parcel.readInt();
        this.f43124e = parcel.readInt();
        this.f43125f = (int[]) d13.m20300c(parcel.createIntArray());
        this.f43126g = (int[]) d13.m20300c(parcel.createIntArray());
    }
}
