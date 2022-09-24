package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.aox */
/* compiled from: IMASDK */
public final class aox extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aox> CREATOR = new aoy();

    /* renamed from: a */
    private final String f15509a;

    @Hide
    public aox(String str) {
        this.f15509a = str;
    }

    /* renamed from: a */
    public final String mo14165a() {
        return this.f15509a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo14165a(), false);
        C11058b.m49516b(parcel, a);
    }
}
