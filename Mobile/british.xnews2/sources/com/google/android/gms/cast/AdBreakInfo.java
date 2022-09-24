package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p108l4.C10709w;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class AdBreakInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new C10709w();

    /* renamed from: b */
    private final long f28314b;

    /* renamed from: c */
    private final String f28315c;

    /* renamed from: d */
    private final long f28316d;

    /* renamed from: e */
    private final boolean f28317e;

    /* renamed from: f */
    private final String[] f28318f;

    /* renamed from: g */
    private final boolean f28319g;

    /* renamed from: h */
    private final boolean f28320h;

    public AdBreakInfo(long j, @RecentlyNonNull String str, long j2, boolean z, @RecentlyNonNull String[] strArr, boolean z2, boolean z3) {
        this.f28314b = j;
        this.f28315c = str;
        this.f28316d = j2;
        this.f28317e = z;
        this.f28318f = strArr;
        this.f28319g = z2;
        this.f28320h = z3;
    }

    @RecentlyNonNull
    /* renamed from: C0 */
    public String[] mo29152C0() {
        return this.f28318f;
    }

    /* renamed from: D0 */
    public long mo29153D0() {
        return this.f28316d;
    }

    @RecentlyNonNull
    /* renamed from: E0 */
    public String mo29154E0() {
        return this.f28315c;
    }

    /* renamed from: F0 */
    public long mo29155F0() {
        return this.f28314b;
    }

    /* renamed from: G0 */
    public boolean mo29156G0() {
        return this.f28319g;
    }

    /* renamed from: H0 */
    public boolean mo29157H0() {
        return this.f28320h;
    }

    /* renamed from: I0 */
    public boolean mo29158I0() {
        return this.f28317e;
    }

    @RecentlyNonNull
    /* renamed from: J0 */
    public final JSONObject mo29159J0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f28315c);
            jSONObject.put("position", C10920a.m49139b(this.f28314b));
            jSONObject.put("isWatched", this.f28317e);
            jSONObject.put("isEmbedded", this.f28319g);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, C10920a.m49139b(this.f28316d));
            jSONObject.put("expanded", this.f28320h);
            if (this.f28318f != null) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f28318f) {
                    jSONArray.put(put);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return C10920a.m49143f(this.f28315c, adBreakInfo.f28315c) && this.f28314b == adBreakInfo.f28314b && this.f28316d == adBreakInfo.f28316d && this.f28317e == adBreakInfo.f28317e && Arrays.equals(this.f28318f, adBreakInfo.f28318f) && this.f28319g == adBreakInfo.f28319g && this.f28320h == adBreakInfo.f28320h;
    }

    public int hashCode() {
        return this.f28315c.hashCode();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49531q(parcel, 2, mo29155F0());
        C11058b.m49537w(parcel, 3, mo29154E0(), false);
        C11058b.m49531q(parcel, 4, mo29153D0());
        C11058b.m49517c(parcel, 5, mo29158I0());
        C11058b.m49538x(parcel, 6, mo29152C0(), false);
        C11058b.m49517c(parcel, 7, mo29156G0());
        C11058b.m49517c(parcel, 8, mo29157H0());
        C11058b.m49516b(parcel, a);
    }
}
