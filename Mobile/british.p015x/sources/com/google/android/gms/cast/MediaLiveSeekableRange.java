package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p244q4.C10920a;
import p244q4.C10922b;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaLiveSeekableRange> CREATOR = new C7168i();

    /* renamed from: f */
    private static final C10922b f28402f = new C10922b("MediaLiveSeekableRange");

    /* renamed from: b */
    private final long f28403b;

    /* renamed from: c */
    private final long f28404c;

    /* renamed from: d */
    private final boolean f28405d;

    /* renamed from: e */
    private final boolean f28406e;

    MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.f28403b = Math.max(j, 0);
        this.f28404c = Math.max(j2, 0);
        this.f28405d = z;
        this.f28406e = z2;
    }

    /* renamed from: G0 */
    static MediaLiveSeekableRange m29107G0(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(TtmlNode.START) && jSONObject.has(TtmlNode.END)) {
            try {
                long d = C10920a.m49141d(jSONObject.getDouble(TtmlNode.START));
                double d2 = jSONObject.getDouble(TtmlNode.END);
                return new MediaLiveSeekableRange(d, C10920a.m49141d(d2), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                C10922b bVar = f28402f;
                String valueOf = String.valueOf(jSONObject);
                StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                sb.append(valueOf);
                bVar.mo43192c(sb.toString(), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: C0 */
    public long mo29247C0() {
        return this.f28404c;
    }

    /* renamed from: D0 */
    public long mo29248D0() {
        return this.f28403b;
    }

    /* renamed from: E0 */
    public boolean mo29249E0() {
        return this.f28406e;
    }

    /* renamed from: F0 */
    public boolean mo29250F0() {
        return this.f28405d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.f28403b == mediaLiveSeekableRange.f28403b && this.f28404c == mediaLiveSeekableRange.f28404c && this.f28405d == mediaLiveSeekableRange.f28405d && this.f28406e == mediaLiveSeekableRange.f28406e;
    }

    public int hashCode() {
        return C7408m.m30029b(Long.valueOf(this.f28403b), Long.valueOf(this.f28404c), Boolean.valueOf(this.f28405d), Boolean.valueOf(this.f28406e));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49531q(parcel, 2, mo29248D0());
        C11058b.m49531q(parcel, 3, mo29247C0());
        C11058b.m49517c(parcel, 4, mo29250F0());
        C11058b.m49517c(parcel, 5, mo29249E0());
        C11058b.m49516b(parcel, a);
    }
}
