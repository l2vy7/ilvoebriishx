package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class ImageHints extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ImageHints> CREATOR = new C7136p0();

    /* renamed from: b */
    private final int f28591b;

    /* renamed from: c */
    private final int f28592c;

    /* renamed from: d */
    private final int f28593d;

    public ImageHints(int i, int i2, int i3) {
        this.f28591b = i;
        this.f28592c = i2;
        this.f28593d = i3;
    }

    /* renamed from: C0 */
    public int mo29467C0() {
        return this.f28593d;
    }

    /* renamed from: D0 */
    public int mo29468D0() {
        return this.f28591b;
    }

    /* renamed from: E0 */
    public int mo29469E0() {
        return this.f28592c;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, mo29468D0());
        C11058b.m49527m(parcel, 3, mo29469E0());
        C11058b.m49527m(parcel, 4, mo29467C0());
        C11058b.m49516b(parcel, a);
    }
}
