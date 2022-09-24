package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zl */
/* compiled from: IMASDK */
public final class C4532zl extends C4530zj {
    public static final Parcelable.Creator<C4532zl> CREATOR = new C4519yz((byte[][]) null);

    /* renamed from: a */
    public final int f19757a;

    /* renamed from: b */
    public final int f19758b;

    /* renamed from: c */
    public final int f19759c;

    /* renamed from: d */
    public final int[] f19760d;

    /* renamed from: e */
    public final int[] f19761e;

    public C4532zl(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.f27474ID);
        this.f19757a = i;
        this.f19758b = i2;
        this.f19759c = i3;
        this.f19760d = iArr;
        this.f19761e = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4532zl.class == obj.getClass()) {
            C4532zl zlVar = (C4532zl) obj;
            return this.f19757a == zlVar.f19757a && this.f19758b == zlVar.f19758b && this.f19759c == zlVar.f19759c && Arrays.equals(this.f19760d, zlVar.f19760d) && Arrays.equals(this.f19761e, zlVar.f19761e);
        }
    }

    public final int hashCode() {
        return ((((((((this.f19757a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19758b) * 31) + this.f19759c) * 31) + Arrays.hashCode(this.f19760d)) * 31) + Arrays.hashCode(this.f19761e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19757a);
        parcel.writeInt(this.f19758b);
        parcel.writeInt(this.f19759c);
        parcel.writeIntArray(this.f19760d);
        parcel.writeIntArray(this.f19761e);
    }

    C4532zl(Parcel parcel) {
        super(MlltFrame.f27474ID);
        this.f19757a = parcel.readInt();
        this.f19758b = parcel.readInt();
        this.f19759c = parcel.readInt();
        this.f19760d = (int[]) amm.m14236f(parcel.createIntArray());
        this.f19761e = (int[]) amm.m14236f(parcel.createIntArray());
    }
}
