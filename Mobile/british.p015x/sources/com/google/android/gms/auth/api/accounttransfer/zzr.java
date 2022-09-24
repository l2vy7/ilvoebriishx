package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p257v4.C11058b;

public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new C7052c();

    /* renamed from: h */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28175h;

    /* renamed from: b */
    private final Set<Integer> f28176b;

    /* renamed from: c */
    private final int f28177c;

    /* renamed from: d */
    private zzt f28178d;

    /* renamed from: e */
    private String f28179e;

    /* renamed from: f */
    private String f28180f;

    /* renamed from: g */
    private String f28181g;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f28175h = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m30127D0("authenticatorInfo", 2, zzt.class));
        hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, FastJsonResponse.Field.m30130G0(InAppPurchaseMetaData.KEY_SIGNATURE, 3));
        hashMap.put("package", FastJsonResponse.Field.m30130G0("package", 4));
    }

    public zzr() {
        this.f28176b = new HashSet(3);
        this.f28177c = 1;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo29036a() {
        return f28175h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo29037b(FastJsonResponse.Field field) {
        int I0 = field.mo30209I0();
        if (I0 == 1) {
            return Integer.valueOf(this.f28177c);
        }
        if (I0 == 2) {
            return this.f28178d;
        }
        if (I0 == 3) {
            return this.f28179e;
        }
        if (I0 == 4) {
            return this.f28180f;
        }
        int I02 = field.mo30209I0();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(I02);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo29038e(FastJsonResponse.Field field) {
        return this.f28176b.contains(Integer.valueOf(field.mo30209I0()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        Set<Integer> set = this.f28176b;
        if (set.contains(1)) {
            C11058b.m49527m(parcel, 1, this.f28177c);
        }
        if (set.contains(2)) {
            C11058b.m49535u(parcel, 2, this.f28178d, i, true);
        }
        if (set.contains(3)) {
            C11058b.m49537w(parcel, 3, this.f28179e, true);
        }
        if (set.contains(4)) {
            C11058b.m49537w(parcel, 4, this.f28180f, true);
        }
        if (set.contains(5)) {
            C11058b.m49537w(parcel, 5, this.f28181g, true);
        }
        C11058b.m49516b(parcel, a);
    }

    zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f28176b = set;
        this.f28177c = i;
        this.f28178d = zzt;
        this.f28179e = str;
        this.f28180f = str2;
        this.f28181g = str3;
    }
}
