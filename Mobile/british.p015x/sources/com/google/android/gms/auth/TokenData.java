package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p257v4.C11058b;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C7078d();

    /* renamed from: b */
    private final int f28151b;

    /* renamed from: c */
    private final String f28152c;

    /* renamed from: d */
    private final Long f28153d;

    /* renamed from: e */
    private final boolean f28154e;

    /* renamed from: f */
    private final boolean f28155f;

    /* renamed from: g */
    private final List<String> f28156g;

    /* renamed from: h */
    private final String f28157h;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f28151b = i;
        this.f28152c = C4604n.m20094g(str);
        this.f28153d = l;
        this.f28154e = z;
        this.f28155f = z2;
        this.f28156g = list;
        this.f28157h = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f28152c, tokenData.f28152c) || !C7408m.m30028a(this.f28153d, tokenData.f28153d) || this.f28154e != tokenData.f28154e || this.f28155f != tokenData.f28155f || !C7408m.m30028a(this.f28156g, tokenData.f28156g) || !C7408m.m30028a(this.f28157h, tokenData.f28157h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28152c, this.f28153d, Boolean.valueOf(this.f28154e), Boolean.valueOf(this.f28155f), this.f28156g, this.f28157h);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28151b);
        C11058b.m49537w(parcel, 2, this.f28152c, false);
        C11058b.m49533s(parcel, 3, this.f28153d, false);
        C11058b.m49517c(parcel, 4, this.f28154e);
        C11058b.m49517c(parcel, 5, this.f28155f);
        C11058b.m49539y(parcel, 6, this.f28156g, false);
        C11058b.m49537w(parcel, 7, this.f28157h, false);
        C11058b.m49516b(parcel, a);
    }
}
