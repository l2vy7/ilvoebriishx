package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.apq */
/* compiled from: IMASDK */
public final class apq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<apq> CREATOR = new apr();

    /* renamed from: a */
    public final int f15538a;

    /* renamed from: b */
    private C4385u f15539b = null;

    /* renamed from: c */
    private byte[] f15540c;

    apq(int i, byte[] bArr) {
        this.f15538a = i;
        this.f15540c = bArr;
        m14507b();
    }

    /* renamed from: b */
    private final void m14507b() {
        C4385u uVar = this.f15539b;
        if (uVar == null && this.f15540c != null) {
            return;
        }
        if (uVar != null && this.f15540c == null) {
            return;
        }
        if (uVar != null && this.f15540c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (uVar == null && this.f15540c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: a */
    public final C4385u mo14191a() {
        if (this.f15539b == null) {
            try {
                this.f15539b = C4385u.m19060f(this.f15540c, bka.m16275a());
                this.f15540c = null;
            } catch (bkt | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        m14507b();
        return this.f15539b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f15538a);
        byte[] bArr = this.f15540c;
        if (bArr == null) {
            bArr = this.f15539b.mo15165aV();
        }
        C11058b.m49520f(parcel, 2, bArr, false);
        C11058b.m49516b(parcel, a);
    }
}
