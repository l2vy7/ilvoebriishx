package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p150t.C6079b;
import p257v4.C11058b;

public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new C7053d();

    /* renamed from: i */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28182i;

    /* renamed from: b */
    private final Set<Integer> f28183b;

    /* renamed from: c */
    private final int f28184c;

    /* renamed from: d */
    private String f28185d;

    /* renamed from: e */
    private int f28186e;

    /* renamed from: f */
    private byte[] f28187f;

    /* renamed from: g */
    private PendingIntent f28188g;

    /* renamed from: h */
    private DeviceMetaData f28189h;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f28182i = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m30130G0("accountType", 2));
        hashMap.put(IronSourceConstants.EVENTS_STATUS, FastJsonResponse.Field.m30129F0(IronSourceConstants.EVENTS_STATUS, 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.m30126C0("transferBytes", 4));
    }

    zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f28183b = set;
        this.f28184c = i;
        this.f28185d = str;
        this.f28186e = i2;
        this.f28187f = bArr;
        this.f28188g = pendingIntent;
        this.f28189h = deviceMetaData;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo29036a() {
        return f28182i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo29037b(FastJsonResponse.Field field) {
        int I0 = field.mo30209I0();
        if (I0 == 1) {
            return Integer.valueOf(this.f28184c);
        }
        if (I0 == 2) {
            return this.f28185d;
        }
        if (I0 == 3) {
            return Integer.valueOf(this.f28186e);
        }
        if (I0 == 4) {
            return this.f28187f;
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
        return this.f28183b.contains(Integer.valueOf(field.mo30209I0()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        Set<Integer> set = this.f28183b;
        if (set.contains(1)) {
            C11058b.m49527m(parcel, 1, this.f28184c);
        }
        if (set.contains(2)) {
            C11058b.m49537w(parcel, 2, this.f28185d, true);
        }
        if (set.contains(3)) {
            C11058b.m49527m(parcel, 3, this.f28186e);
        }
        if (set.contains(4)) {
            C11058b.m49520f(parcel, 4, this.f28187f, true);
        }
        if (set.contains(5)) {
            C11058b.m49535u(parcel, 5, this.f28188g, i, true);
        }
        if (set.contains(6)) {
            C11058b.m49535u(parcel, 6, this.f28189h, i, true);
        }
        C11058b.m49516b(parcel, a);
    }

    public zzt() {
        this.f28183b = new C6079b(3);
        this.f28184c = 1;
    }
}
