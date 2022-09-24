package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p198d5.C10487a;
import p198d5.C10489b;
import p256v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcco extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcco> CREATOR = new vh0();

    /* renamed from: b */
    public final View f21088b;

    /* renamed from: c */
    public final Map<String, WeakReference<View>> f21089c;

    public zzcco(IBinder iBinder, IBinder iBinder2) {
        this.f21088b = (View) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder));
        this.f21089c = (Map) C10489b.m48194f3(C10487a.C10488a.m48193b2(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49526l(parcel, 1, C10489b.m48195m6(this.f21088b).asBinder(), false);
        C11058b.m49526l(parcel, 2, C10489b.m48195m6(this.f21089c).asBinder(), false);
        C11058b.m49516b(parcel, a);
    }
}
