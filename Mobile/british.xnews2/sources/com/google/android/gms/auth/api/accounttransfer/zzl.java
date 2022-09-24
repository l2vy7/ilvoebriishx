package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p256v4.C11058b;

public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new C7050a();

    /* renamed from: g */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28162g;

    /* renamed from: b */
    private final Set<Integer> f28163b;

    /* renamed from: c */
    private final int f28164c;

    /* renamed from: d */
    private ArrayList<zzr> f28165d;

    /* renamed from: e */
    private int f28166e;

    /* renamed from: f */
    private zzo f28167f;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f28162g = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m30128E0("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.m30127D0("progress", 4, zzo.class));
    }

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f28163b = set;
        this.f28164c = i;
        this.f28165d = arrayList;
        this.f28166e = i2;
        this.f28167f = zzo;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo29036a() {
        return f28162g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo29037b(FastJsonResponse.Field field) {
        int I0 = field.mo30209I0();
        if (I0 == 1) {
            return Integer.valueOf(this.f28164c);
        }
        if (I0 == 2) {
            return this.f28165d;
        }
        if (I0 == 4) {
            return this.f28167f;
        }
        int I02 = field.mo30209I0();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(I02);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo29038e(FastJsonResponse.Field field) {
        return this.f28163b.contains(Integer.valueOf(field.mo30209I0()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        Set<Integer> set = this.f28163b;
        if (set.contains(1)) {
            C11058b.m49527m(parcel, 1, this.f28164c);
        }
        if (set.contains(2)) {
            C11058b.m49510A(parcel, 2, this.f28165d, true);
        }
        if (set.contains(3)) {
            C11058b.m49527m(parcel, 3, this.f28166e);
        }
        if (set.contains(4)) {
            C11058b.m49535u(parcel, 4, this.f28167f, i, true);
        }
        C11058b.m49516b(parcel, a);
    }

    public zzl() {
        this.f28163b = new HashSet(1);
        this.f28164c = 1;
    }
}
