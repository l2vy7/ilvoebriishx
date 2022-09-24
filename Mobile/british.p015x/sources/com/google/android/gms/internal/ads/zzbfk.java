package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p257v4.C11058b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfk> CREATOR = new C8204tu();

    /* renamed from: b */
    public final int f21077b;

    /* renamed from: c */
    public final int f21078c;

    /* renamed from: d */
    public final String f21079d;

    /* renamed from: e */
    public final long f21080e;

    public zzbfk(int i, int i2, String str, long j) {
        this.f21077b = i;
        this.f21078c = i2;
        this.f21079d = str;
        this.f21080e = j;
    }

    /* renamed from: C0 */
    public static zzbfk m21322C0(JSONObject jSONObject) throws JSONException {
        return new zzbfk(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(InAppPurchaseMetaData.KEY_CURRENCY), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f21077b);
        C11058b.m49527m(parcel, 2, this.f21078c);
        C11058b.m49537w(parcel, 3, this.f21079d, false);
        C11058b.m49531q(parcel, 4, this.f21080e);
        C11058b.m49516b(parcel, a);
    }
}
