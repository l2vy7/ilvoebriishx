package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C7049a();

    /* renamed from: b */
    private final int f28139b;

    /* renamed from: c */
    private final long f28140c;

    /* renamed from: d */
    private final String f28141d;

    /* renamed from: e */
    private final int f28142e;

    /* renamed from: f */
    private final int f28143f;

    /* renamed from: g */
    private final String f28144g;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f28139b = i;
        this.f28140c = j;
        this.f28141d = (String) C4604n.m20098k(str);
        this.f28142e = i2;
        this.f28143f = i3;
        this.f28144g = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f28139b == accountChangeEvent.f28139b && this.f28140c == accountChangeEvent.f28140c && C7408m.m30028a(this.f28141d, accountChangeEvent.f28141d) && this.f28142e == accountChangeEvent.f28142e && this.f28143f == accountChangeEvent.f28143f && C7408m.m30028a(this.f28144g, accountChangeEvent.f28144g);
        }
    }

    public int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28139b), Long.valueOf(this.f28140c), this.f28141d, Integer.valueOf(this.f28142e), Integer.valueOf(this.f28143f), this.f28144g);
    }

    public String toString() {
        int i = this.f28142e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f28141d;
        String str3 = this.f28144g;
        int i2 = this.f28143f;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28139b);
        C11058b.m49531q(parcel, 2, this.f28140c);
        C11058b.m49537w(parcel, 3, this.f28141d, false);
        C11058b.m49527m(parcel, 4, this.f28142e);
        C11058b.m49527m(parcel, 5, this.f28143f);
        C11058b.m49537w(parcel, 6, this.f28144g, false);
        C11058b.m49516b(parcel, a);
    }
}
