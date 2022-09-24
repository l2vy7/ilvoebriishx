package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfnr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnr> CREATOR = new t13();

    /* renamed from: b */
    public final int f43047b;

    /* renamed from: c */
    private C8218u8 f43048c = null;

    /* renamed from: d */
    private byte[] f43049d;

    zzfnr(int i, byte[] bArr) {
        this.f43047b = i;
        this.f43049d = bArr;
        zzb();
    }

    private final void zzb() {
        C8218u8 u8Var = this.f43048c;
        if (u8Var == null && this.f43049d != null) {
            return;
        }
        if (u8Var != null && this.f43049d == null) {
            return;
        }
        if (u8Var != null && this.f43049d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (u8Var == null && this.f43049d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: C0 */
    public final C8218u8 mo36284C0() {
        if (this.f43048c == null) {
            try {
                this.f43048c = C8218u8.m38228v0(this.f43049d, wo3.m39219a());
                this.f43049d = null;
            } catch (wp3 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.f43048c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f43047b);
        byte[] bArr = this.f43049d;
        if (bArr == null) {
            bArr = this.f43048c.mo33365g();
        }
        C11058b.m49520f(parcel, 2, bArr, false);
        C11058b.m49516b(parcel, a);
    }
}
