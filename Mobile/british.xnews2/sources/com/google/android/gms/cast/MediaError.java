package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;
import p108l4.C10683i0;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaError> CREATOR = new C10683i0();

    /* renamed from: b */
    private String f28375b;

    /* renamed from: c */
    private long f28376c;

    /* renamed from: d */
    private final Integer f28377d;

    /* renamed from: e */
    private final String f28378e;

    /* renamed from: f */
    String f28379f;

    /* renamed from: g */
    private final JSONObject f28380g;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.f28375b = str;
        this.f28376c = j;
        this.f28377d = num;
        this.f28378e = str2;
        this.f28380g = jSONObject;
    }

    @RecentlyNonNull
    /* renamed from: G0 */
    public static MediaError m29072G0(@RecentlyNonNull JSONObject jSONObject) {
        return new MediaError(jSONObject.optString(SessionDescription.ATTR_TYPE, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, C10920a.m49140c(jSONObject, IronSourceConstants.EVENTS_ERROR_REASON), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public Integer mo29213C0() {
        return this.f28377d;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29214D0() {
        return this.f28378e;
    }

    /* renamed from: E0 */
    public long mo29215E0() {
        return this.f28376c;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public String mo29216F0() {
        return this.f28375b;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28380g;
        this.f28379f = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, mo29216F0(), false);
        C11058b.m49531q(parcel, 3, mo29215E0());
        C11058b.m49530p(parcel, 4, mo29213C0(), false);
        C11058b.m49537w(parcel, 5, mo29214D0(), false);
        C11058b.m49537w(parcel, 6, this.f28379f, false);
        C11058b.m49516b(parcel, a);
    }
}
