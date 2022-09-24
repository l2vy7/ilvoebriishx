package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C7076b();

    /* renamed from: b */
    private final int f28145b;

    /* renamed from: c */
    private int f28146c;
    @Deprecated

    /* renamed from: d */
    private String f28147d;

    /* renamed from: e */
    private Account f28148e;

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f28145b = i;
        this.f28146c = i2;
        this.f28147d = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f28148e = account;
        } else {
            this.f28148e = new Account(str, "com.google");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28145b);
        C11058b.m49527m(parcel, 2, this.f28146c);
        C11058b.m49537w(parcel, 3, this.f28147d, false);
        C11058b.m49535u(parcel, 4, this.f28148e, i, false);
        C11058b.m49516b(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f28145b = 1;
    }
}
