package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C7461c();

    /* renamed from: b */
    final int f29445b;

    /* renamed from: c */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f29446c;

    /* renamed from: d */
    private final String f29447d;

    zan(int i, ArrayList<zal> arrayList, String str) {
        this.f29445b = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f29440c;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C4604n.m20098k(zal.f29441d)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f29441d.get(i3);
                hashMap2.put(zam.f29443c, zam.f29444d);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f29446c = hashMap;
        this.f29447d = (String) C4604n.m20098k(str);
        mo30237E0();
    }

    /* renamed from: C0 */
    public final String mo30235C0() {
        return this.f29447d;
    }

    /* renamed from: D0 */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo30236D0(String str) {
        return this.f29446c.get(str);
    }

    /* renamed from: E0 */
    public final void mo30237E0() {
        for (String str : this.f29446c.keySet()) {
            Map map = this.f29446c.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo30214O0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f29446c.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f29446c.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29445b);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f29446c.keySet()) {
            arrayList.add(new zal(next, this.f29446c.get(next)));
        }
        C11058b.m49510A(parcel, 2, arrayList, false);
        C11058b.m49537w(parcel, 3, this.f29447d, false);
        C11058b.m49516b(parcel, a);
    }
}
