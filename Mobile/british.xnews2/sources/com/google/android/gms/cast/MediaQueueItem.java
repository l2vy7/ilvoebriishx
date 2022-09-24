package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6489l;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaQueueItem extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new C7181t();

    /* renamed from: b */
    private MediaInfo f28456b;

    /* renamed from: c */
    private int f28457c;

    /* renamed from: d */
    private boolean f28458d;

    /* renamed from: e */
    private double f28459e;

    /* renamed from: f */
    private double f28460f;

    /* renamed from: g */
    private double f28461g;

    /* renamed from: h */
    private long[] f28462h;

    /* renamed from: i */
    String f28463i;

    /* renamed from: j */
    private JSONObject f28464j;

    /* renamed from: k */
    private final C7087b f28465k;

    /* renamed from: com.google.android.gms.cast.MediaQueueItem$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7086a {

        /* renamed from: a */
        private final MediaQueueItem f28466a;

        public C7086a(@RecentlyNonNull MediaInfo mediaInfo) throws IllegalArgumentException {
            this.f28466a = new MediaQueueItem(mediaInfo, (C7180s) null);
        }

        @RecentlyNonNull
        /* renamed from: a */
        public MediaQueueItem mo29329a() {
            this.f28466a.mo29325L0();
            return this.f28466a;
        }

        public C7086a(@RecentlyNonNull JSONObject jSONObject) throws JSONException {
            this.f28466a = new MediaQueueItem(jSONObject);
        }
    }

    /* renamed from: com.google.android.gms.cast.MediaQueueItem$b */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public class C7087b {
        public C7087b() {
        }
    }

    MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f28459e = Double.NaN;
        this.f28465k = new C7087b();
        this.f28456b = mediaInfo;
        this.f28457c = i;
        this.f28458d = z;
        this.f28459e = d;
        this.f28460f = d2;
        this.f28461g = d3;
        this.f28462h = jArr;
        this.f28463i = str;
        if (str != null) {
            try {
                this.f28464j = new JSONObject(str);
            } catch (JSONException unused) {
                this.f28464j = null;
                this.f28463i = null;
            }
        } else {
            this.f28464j = null;
        }
    }

    /* renamed from: C0 */
    public boolean mo29316C0(@RecentlyNonNull JSONObject jSONObject) throws JSONException {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f28456b = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f28457c != (i = jSONObject.getInt("itemId"))) {
            this.f28457c = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f28458d != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f28458d = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f28459e) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f28459e) > 1.0E-7d)) {
            this.f28459e = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f28460f) > 1.0E-7d) {
                this.f28460f = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f28461g) > 1.0E-7d) {
                this.f28461g = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f28462h;
            if (jArr2 != null && jArr2.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (this.f28462h[i3] != jArr[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z3 = true;
        } else {
            jArr = null;
        }
        if (z3) {
            this.f28462h = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f28464j = jSONObject.getJSONObject("customData");
        return true;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public long[] mo29317D0() {
        return this.f28462h;
    }

    /* renamed from: E0 */
    public boolean mo29318E0() {
        return this.f28458d;
    }

    /* renamed from: F0 */
    public int mo29319F0() {
        return this.f28457c;
    }

    @RecentlyNullable
    /* renamed from: G0 */
    public MediaInfo mo29320G0() {
        return this.f28456b;
    }

    /* renamed from: H0 */
    public double mo29321H0() {
        return this.f28460f;
    }

    /* renamed from: I0 */
    public double mo29322I0() {
        return this.f28461g;
    }

    /* renamed from: J0 */
    public double mo29323J0() {
        return this.f28459e;
    }

    @RecentlyNonNull
    /* renamed from: K0 */
    public JSONObject mo29324K0() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f28456b;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.mo29235T0());
            }
            int i = this.f28457c;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.f28458d);
            if (!Double.isNaN(this.f28459e)) {
                jSONObject.put("startTime", this.f28459e);
            }
            double d = this.f28460f;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f28461g);
            if (this.f28462h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.f28462h) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f28464j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public final void mo29325L0() throws IllegalArgumentException {
        if (this.f28456b == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(this.f28459e) && this.f28459e < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.f28460f)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.f28461g) || this.f28461g < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.f28464j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.f28464j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C6489l.m28274a(jSONObject, jSONObject2)) && C10920a.m49143f(this.f28456b, mediaQueueItem.f28456b) && this.f28457c == mediaQueueItem.f28457c && this.f28458d == mediaQueueItem.f28458d && ((Double.isNaN(this.f28459e) && Double.isNaN(mediaQueueItem.f28459e)) || this.f28459e == mediaQueueItem.f28459e) && this.f28460f == mediaQueueItem.f28460f && this.f28461g == mediaQueueItem.f28461g && Arrays.equals(this.f28462h, mediaQueueItem.f28462h);
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28456b, Integer.valueOf(this.f28457c), Boolean.valueOf(this.f28458d), Double.valueOf(this.f28459e), Double.valueOf(this.f28460f), Double.valueOf(this.f28461g), Integer.valueOf(Arrays.hashCode(this.f28462h)), String.valueOf(this.f28464j));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28464j;
        this.f28463i = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, mo29320G0(), i, false);
        C11058b.m49527m(parcel, 3, mo29319F0());
        C11058b.m49517c(parcel, 4, mo29318E0());
        C11058b.m49522h(parcel, 5, mo29323J0());
        C11058b.m49522h(parcel, 6, mo29321H0());
        C11058b.m49522h(parcel, 7, mo29322I0());
        C11058b.m49532r(parcel, 8, mo29317D0(), false);
        C11058b.m49537w(parcel, 9, this.f28463i, false);
        C11058b.m49516b(parcel, a);
    }

    /* synthetic */ MediaQueueItem(MediaInfo mediaInfo, C7180s sVar) throws IllegalArgumentException {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, (long[]) null, (String) null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public MediaQueueItem(@RecentlyNonNull JSONObject jSONObject) throws JSONException {
        this((MediaInfo) null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, (long[]) null, (String) null);
        mo29316C0(jSONObject);
    }
}
