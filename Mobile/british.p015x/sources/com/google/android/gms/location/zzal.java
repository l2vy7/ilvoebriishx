package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p257v4.C11058b;

public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C9699g();

    /* renamed from: b */
    private final List<String> f46119b;

    /* renamed from: c */
    private final PendingIntent f46120c;

    /* renamed from: d */
    private final String f46121d;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f46119b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f46120c = pendingIntent;
        this.f46121d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49539y(parcel, 1, this.f46119b, false);
        C11058b.m49535u(parcel, 2, this.f46120c, i, false);
        C11058b.m49537w(parcel, 3, this.f46121d, false);
        C11058b.m49516b(parcel, a);
    }
}
