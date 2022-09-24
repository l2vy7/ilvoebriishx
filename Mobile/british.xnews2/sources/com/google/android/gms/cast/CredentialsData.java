package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p108l4.C10684j;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class CredentialsData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CredentialsData> CREATOR = new C10684j();

    /* renamed from: b */
    private final String f28369b;

    /* renamed from: c */
    private final String f28370c;

    public CredentialsData(String str, String str2) {
        this.f28369b = str;
        this.f28370c = str2;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public String mo29200C0() {
        return this.f28369b;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29201D0() {
        return this.f28370c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return C7408m.m30028a(this.f28369b, credentialsData.f28369b) && C7408m.m30028a(this.f28370c, credentialsData.f28370c);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28369b, this.f28370c);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo29200C0(), false);
        C11058b.m49537w(parcel, 2, mo29201D0(), false);
        C11058b.m49516b(parcel, a);
    }
}
