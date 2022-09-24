package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class NotificationAction extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<NotificationAction> CREATOR = new C7111c1();

    /* renamed from: b */
    private final String f28612b;

    /* renamed from: c */
    private final int f28613c;

    /* renamed from: d */
    private final String f28614d;

    NotificationAction(String str, int i, String str2) {
        this.f28612b = str;
        this.f28613c = i;
        this.f28614d = str2;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public String mo29484C0() {
        return this.f28612b;
    }

    @RecentlyNonNull
    /* renamed from: D0 */
    public String mo29485D0() {
        return this.f28614d;
    }

    /* renamed from: E0 */
    public int mo29486E0() {
        return this.f28613c;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29484C0(), false);
        C11058b.m49527m(parcel, 3, mo29486E0());
        C11058b.m49537w(parcel, 4, mo29485D0(), false);
        C11058b.m49516b(parcel, a);
    }
}
