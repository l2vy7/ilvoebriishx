package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaa extends AbstractSafeParcelable implements C7341k {
    public static final Parcelable.Creator<zaa> CREATOR = new C9987b();

    /* renamed from: b */
    final int f47002b;

    /* renamed from: c */
    private int f47003c;

    /* renamed from: d */
    private Intent f47004d;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        if (this.f47003c == 0) {
            return Status.f28882g;
        }
        return Status.f28886k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f47002b);
        C11058b.m49527m(parcel, 2, this.f47003c);
        C11058b.m49535u(parcel, 3, this.f47004d, i, false);
        C11058b.m49516b(parcel, a);
    }

    zaa(int i, int i2, Intent intent) {
        this.f47002b = i;
        this.f47003c = i2;
        this.f47004d = intent;
    }
}
