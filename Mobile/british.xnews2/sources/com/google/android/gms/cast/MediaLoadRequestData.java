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
import p243q4.C10922b;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaLoadRequestData> CREATOR = new C7172k();

    /* renamed from: o */
    private static final C10922b f28407o = new C10922b("MediaLoadRequestData");

    /* renamed from: b */
    private final MediaInfo f28408b;

    /* renamed from: c */
    private final MediaQueueData f28409c;

    /* renamed from: d */
    private final Boolean f28410d;

    /* renamed from: e */
    private final long f28411e;

    /* renamed from: f */
    private final double f28412f;

    /* renamed from: g */
    private final long[] f28413g;

    /* renamed from: h */
    String f28414h;

    /* renamed from: i */
    private final JSONObject f28415i;

    /* renamed from: j */
    private final String f28416j;

    /* renamed from: k */
    private final String f28417k;

    /* renamed from: l */
    private final String f28418l;

    /* renamed from: m */
    private final String f28419m;

    /* renamed from: n */
    private long f28420n;

    /* renamed from: com.google.android.gms.cast.MediaLoadRequestData$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7082a {

        /* renamed from: a */
        private MediaInfo f28421a;

        /* renamed from: b */
        private MediaQueueData f28422b;

        /* renamed from: c */
        private Boolean f28423c = Boolean.TRUE;

        /* renamed from: d */
        private long f28424d = -1;

        /* renamed from: e */
        private double f28425e = 1.0d;

        /* renamed from: f */
        private long[] f28426f;

        /* renamed from: g */
        private JSONObject f28427g;

        /* renamed from: h */
        private String f28428h;

        /* renamed from: i */
        private String f28429i;

        /* renamed from: j */
        private String f28430j;

        /* renamed from: k */
        private String f28431k;

        /* renamed from: l */
        private long f28432l;

        @RecentlyNonNull
        /* renamed from: a */
        public MediaLoadRequestData mo29267a() {
            return new MediaLoadRequestData(this.f28421a, this.f28422b, this.f28423c, this.f28424d, this.f28425e, this.f28426f, this.f28427g, this.f28428h, this.f28429i, this.f28430j, this.f28431k, this.f28432l);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7082a mo29268b(long[] jArr) {
            this.f28426f = jArr;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7082a mo29269c(Boolean bool) {
            this.f28423c = bool;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C7082a mo29270d(String str) {
            this.f28428h = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C7082a mo29271e(String str) {
            this.f28429i = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C7082a mo29272f(long j) {
            this.f28424d = j;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C7082a mo29273g(JSONObject jSONObject) {
            this.f28427g = jSONObject;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public C7082a mo29274h(MediaInfo mediaInfo) {
            this.f28421a = mediaInfo;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public C7082a mo29275i(double d) {
            if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.f28425e = d;
            return this;
        }
    }

    MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, String str, String str2, String str3, String str4, String str5, long j2) {
        this(mediaInfo, mediaQueueData, bool, j, d, jArr, C10920a.m49138a(str), str2, str3, str4, str5, j2);
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public long[] mo29254C0() {
        return this.f28413g;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public Boolean mo29255D0() {
        return this.f28410d;
    }

    @RecentlyNullable
    /* renamed from: E0 */
    public String mo29256E0() {
        return this.f28416j;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public String mo29257F0() {
        return this.f28417k;
    }

    /* renamed from: G0 */
    public long mo29258G0() {
        return this.f28411e;
    }

    @RecentlyNullable
    /* renamed from: H0 */
    public MediaInfo mo29259H0() {
        return this.f28408b;
    }

    /* renamed from: I0 */
    public double mo29260I0() {
        return this.f28412f;
    }

    @RecentlyNullable
    /* renamed from: J0 */
    public MediaQueueData mo29261J0() {
        return this.f28409c;
    }

    /* renamed from: K0 */
    public long mo29262K0() {
        return this.f28420n;
    }

    @RecentlyNonNull
    /* renamed from: L0 */
    public JSONObject mo29263L0() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f28408b;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.mo29235T0());
            }
            MediaQueueData mediaQueueData = this.f28409c;
            if (mediaQueueData != null) {
                jSONObject.put("queueData", mediaQueueData.mo29310L0());
            }
            jSONObject.putOpt("autoplay", this.f28410d);
            long j = this.f28411e;
            if (j != -1) {
                jSONObject.put("currentTime", C10920a.m49139b(j));
            }
            jSONObject.put("playbackRate", this.f28412f);
            jSONObject.putOpt("credentials", this.f28416j);
            jSONObject.putOpt("credentialsType", this.f28417k);
            jSONObject.putOpt("atvCredentials", this.f28418l);
            jSONObject.putOpt("atvCredentialsType", this.f28419m);
            if (this.f28413g != null) {
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (true) {
                    long[] jArr = this.f28413g;
                    if (i >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i, jArr[i]);
                    i++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", this.f28415i);
            jSONObject.put("requestId", this.f28420n);
            return jSONObject;
        } catch (JSONException e) {
            f28407o.mo43192c("Error transforming MediaLoadRequestData into JSONObject", e);
            return new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return C6489l.m28274a(this.f28415i, mediaLoadRequestData.f28415i) && C7408m.m30028a(this.f28408b, mediaLoadRequestData.f28408b) && C7408m.m30028a(this.f28409c, mediaLoadRequestData.f28409c) && C7408m.m30028a(this.f28410d, mediaLoadRequestData.f28410d) && this.f28411e == mediaLoadRequestData.f28411e && this.f28412f == mediaLoadRequestData.f28412f && Arrays.equals(this.f28413g, mediaLoadRequestData.f28413g) && C7408m.m30028a(this.f28416j, mediaLoadRequestData.f28416j) && C7408m.m30028a(this.f28417k, mediaLoadRequestData.f28417k) && C7408m.m30028a(this.f28418l, mediaLoadRequestData.f28418l) && C7408m.m30028a(this.f28419m, mediaLoadRequestData.f28419m) && this.f28420n == mediaLoadRequestData.f28420n;
    }

    public int hashCode() {
        return C7408m.m30029b(this.f28408b, this.f28409c, this.f28410d, Long.valueOf(this.f28411e), Double.valueOf(this.f28412f), this.f28413g, String.valueOf(this.f28415i), this.f28416j, this.f28417k, this.f28418l, this.f28419m, Long.valueOf(this.f28420n));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28415i;
        this.f28414h = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, mo29259H0(), i, false);
        C11058b.m49535u(parcel, 3, mo29261J0(), i, false);
        C11058b.m49518d(parcel, 4, mo29255D0(), false);
        C11058b.m49531q(parcel, 5, mo29258G0());
        C11058b.m49522h(parcel, 6, mo29260I0());
        C11058b.m49532r(parcel, 7, mo29254C0(), false);
        C11058b.m49537w(parcel, 8, this.f28414h, false);
        C11058b.m49537w(parcel, 9, mo29256E0(), false);
        C11058b.m49537w(parcel, 10, mo29257F0(), false);
        C11058b.m49537w(parcel, 11, this.f28418l, false);
        C11058b.m49537w(parcel, 12, this.f28419m, false);
        C11058b.m49531q(parcel, 13, mo29262K0());
        C11058b.m49516b(parcel, a);
    }

    private MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.f28408b = mediaInfo;
        this.f28409c = mediaQueueData;
        this.f28410d = bool;
        this.f28411e = j;
        this.f28412f = d;
        this.f28413g = jArr;
        this.f28415i = jSONObject;
        this.f28416j = str;
        this.f28417k = str2;
        this.f28418l = str3;
        this.f28419m = str4;
        this.f28420n = j2;
    }
}
