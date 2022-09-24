package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoa> CREATOR = new b23();

    /* renamed from: b */
    public final int f43055b;

    /* renamed from: c */
    public final byte[] f43056c;

    /* renamed from: d */
    public final int f43057d;

    zzfoa(int i, byte[] bArr, int i2) {
        byte[] bArr2;
        this.f43055b = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f43056c = bArr2;
        this.f43057d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43055b);
        C11058b.m49520f(parcel, 2, this.f43056c, false);
        C11058b.m49527m(parcel, 3, this.f43057d);
        C11058b.m49516b(parcel, a);
    }

    public zzfoa(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }
}
