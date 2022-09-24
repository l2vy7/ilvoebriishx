package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p257v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcde extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcde> CREATOR = new ki0();

    /* renamed from: b */
    public final boolean f21148b;

    /* renamed from: c */
    public final List<String> f21149c;

    public zzcde() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 2, this.f21148b);
        C11058b.m49539y(parcel, 3, this.f21149c, false);
        C11058b.m49516b(parcel, a);
    }

    public zzcde(boolean z, List<String> list) {
        this.f21148b = z;
        this.f21149c = list;
    }
}
