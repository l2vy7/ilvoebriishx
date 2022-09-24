package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p209g4.C10555b;
import p257v4.C11058b;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C10555b();

    /* renamed from: b */
    private final String f28215b;

    /* renamed from: c */
    private final String f28216c;

    public IdToken(String str, String str2) {
        C4604n.m20089b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C4604n.m20089b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f28215b = str;
        this.f28216c = str2;
    }

    /* renamed from: C0 */
    public final String mo29063C0() {
        return this.f28215b;
    }

    /* renamed from: D0 */
    public final String mo29064D0() {
        return this.f28216c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C7408m.m30028a(this.f28215b, idToken.f28215b) && C7408m.m30028a(this.f28216c, idToken.f28216c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 1, mo29063C0(), false);
        C11058b.m49537w(parcel, 2, mo29064D0(), false);
        C11058b.m49516b(parcel, a);
    }
}
