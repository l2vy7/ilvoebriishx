package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C7465t();

    /* renamed from: b */
    private final boolean f20075b;
    @Nullable

    /* renamed from: c */
    private final String f20076c;

    /* renamed from: d */
    private final int f20077d;

    zzq(boolean z, String str, int i) {
        this.f20075b = z;
        this.f20076c = str;
        this.f20077d = C7454s.m30114a(i) - 1;
    }

    @Nullable
    /* renamed from: C0 */
    public final String mo18010C0() {
        return this.f20076c;
    }

    /* renamed from: D0 */
    public final boolean mo18011D0() {
        return this.f20075b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, this.f20075b);
        C11058b.m49537w(parcel, 2, this.f20076c, false);
        C11058b.m49527m(parcel, 3, this.f20077d);
        C11058b.m49516b(parcel, a);
    }

    public final int zzc() {
        return C7454s.m30114a(this.f20077d);
    }
}
