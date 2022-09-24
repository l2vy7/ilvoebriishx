package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C7458a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C7456b();

    /* renamed from: b */
    final int f29413b;

    /* renamed from: c */
    private final HashMap<String, Integer> f29414c;

    /* renamed from: d */
    private final SparseArray<String> f29415d;

    public StringToIntConverter() {
        this.f29413b = 1;
        this.f29414c = new HashMap<>();
        this.f29415d = new SparseArray<>();
    }

    /* renamed from: C0 */
    public StringToIntConverter mo30194C0(String str, int i) {
        this.f29414c.put(str, Integer.valueOf(i));
        this.f29415d.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29413b);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f29414c.keySet()) {
            arrayList.add(new zac(next, this.f29414c.get(next).intValue()));
        }
        C11058b.m49510A(parcel, 2, arrayList, false);
        C11058b.m49516b(parcel, a);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ Object mo30196x(Object obj) {
        String str = this.f29415d.get(((Integer) obj).intValue());
        if (str != null || !this.f29414c.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    StringToIntConverter(int i, ArrayList<zac> arrayList) {
        this.f29413b = i;
        this.f29414c = new HashMap<>();
        this.f29415d = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = arrayList.get(i2);
            mo30194C0(zac.f29419c, zac.f29420d);
        }
    }
}
