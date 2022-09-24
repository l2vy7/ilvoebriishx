package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzces extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzces> CREATOR = new vj0();

    /* renamed from: b */
    public final String f43026b;

    /* renamed from: c */
    public final int f43027c;

    public zzces(String str, int i) {
        this.f43026b = str;
        this.f43027c = i;
    }

    /* renamed from: C0 */
    public static zzces m40654C0(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzces(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzces)) {
            zzces zzces = (zzces) obj;
            if (!C7408m.m30028a(this.f43026b, zzces.f43026b) || !C7408m.m30028a(Integer.valueOf(this.f43027c), Integer.valueOf(zzces.f43027c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f43026b, Integer.valueOf(this.f43027c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f43026b, false);
        C11058b.m49527m(parcel, 3, this.f43027c);
        C11058b.m49516b(parcel, a);
    }
}
