package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C7462d();

    /* renamed from: b */
    final int f29439b;

    /* renamed from: c */
    final String f29440c;

    /* renamed from: d */
    final ArrayList<zam> f29441d;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f29439b = i;
        this.f29440c = str;
        this.f29441d = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29439b);
        C11058b.m49537w(parcel, 2, this.f29440c, false);
        C11058b.m49510A(parcel, 3, this.f29441d, false);
        C11058b.m49516b(parcel, a);
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f29439b = 1;
        this.f29440c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f29441d = arrayList;
    }
}
