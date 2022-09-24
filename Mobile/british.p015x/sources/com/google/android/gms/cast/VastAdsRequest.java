package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p244q4.C10920a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class VastAdsRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<VastAdsRequest> CREATOR = new C7186y();

    /* renamed from: b */
    private final String f28530b;

    /* renamed from: c */
    private final String f28531c;

    VastAdsRequest(String str, String str2) {
        this.f28530b = str;
        this.f28531c = str2;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public static VastAdsRequest m29237C0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VastAdsRequest(C10920a.m49140c(jSONObject, "adTagUrl"), C10920a.m49140c(jSONObject, "adsResponse"));
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29398D0() {
        return this.f28530b;
    }

    @RecentlyNullable
    /* renamed from: E0 */
    public String mo29399E0() {
        return this.f28531c;
    }

    @RecentlyNonNull
    /* renamed from: F0 */
    public final JSONObject mo29400F0() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f28530b;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f28531c;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return C10920a.m49143f(this.f28530b, vastAdsRequest.f28530b) && C10920a.m49143f(this.f28531c, vastAdsRequest.f28531c);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28530b, this.f28531c);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29398D0(), false);
        C11058b.m49537w(parcel, 3, mo29399E0(), false);
        C11058b.m49516b(parcel, a);
    }
}
