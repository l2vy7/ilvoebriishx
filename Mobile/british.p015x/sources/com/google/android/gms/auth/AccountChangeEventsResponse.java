package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p257v4.C11058b;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C7077c();

    /* renamed from: b */
    private final int f28149b;

    /* renamed from: c */
    private final List<AccountChangeEvent> f28150c;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f28149b = i;
        this.f28150c = (List) C4604n.m20098k(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28149b);
        C11058b.m49510A(parcel, 2, this.f28150c, false);
        C11058b.m49516b(parcel, a);
    }
}
