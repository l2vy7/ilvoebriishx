package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C7400j0();

    /* renamed from: b */
    final int f29380b;

    /* renamed from: c */
    private final Account f29381c;

    /* renamed from: d */
    private final int f29382d;

    /* renamed from: e */
    private final GoogleSignInAccount f29383e;

    zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f29380b = i;
        this.f29381c = account;
        this.f29382d = i2;
        this.f29383e = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29380b);
        C11058b.m49535u(parcel, 2, this.f29381c, i, false);
        C11058b.m49527m(parcel, 3, this.f29382d);
        C11058b.m49535u(parcel, 4, this.f29383e, i, false);
        C11058b.m49516b(parcel, a);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
