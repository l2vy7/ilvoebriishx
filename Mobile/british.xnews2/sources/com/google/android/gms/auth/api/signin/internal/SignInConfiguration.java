package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p220j4.C10607a;
import p220j4.C10626t;
import p256v4.C11058b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C10626t();

    /* renamed from: b */
    private final String f28291b;

    /* renamed from: c */
    private GoogleSignInOptions f28292c;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f28291b = C4604n.m20094g(str);
        this.f28292c = googleSignInOptions;
    }

    /* renamed from: C0 */
    public final GoogleSignInOptions mo29124C0() {
        return this.f28292c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f28291b.equals(signInConfiguration.f28291b)) {
            GoogleSignInOptions googleSignInOptions = this.f28292c;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f28292c == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f28292c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C10607a().mo42719a(this.f28291b).mo42719a(this.f28292c).mo42720b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f28291b, false);
        C11058b.m49535u(parcel, 5, this.f28292c, i, false);
        C11058b.m49516b(parcel, a);
    }
}
