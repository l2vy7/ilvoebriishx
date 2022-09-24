package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6489l;
import p006a5.C6492o;
import p244q4.C10920a;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C7182u();
    @RecentlyNonNull

    /* renamed from: l */
    public static final String f28494l = "alternate";

    /* renamed from: b */
    private long f28495b;

    /* renamed from: c */
    private int f28496c;

    /* renamed from: d */
    private String f28497d;

    /* renamed from: e */
    private String f28498e;

    /* renamed from: f */
    private String f28499f;

    /* renamed from: g */
    private final String f28500g;

    /* renamed from: h */
    private int f28501h;

    /* renamed from: i */
    private final List<String> f28502i;

    /* renamed from: j */
    String f28503j;

    /* renamed from: k */
    private final JSONObject f28504k;

    /* renamed from: com.google.android.gms.cast.MediaTrack$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C7089a {

        /* renamed from: a */
        private final long f28505a;

        /* renamed from: b */
        private final int f28506b;

        /* renamed from: c */
        private String f28507c;

        /* renamed from: d */
        private String f28508d;

        /* renamed from: e */
        private String f28509e;

        /* renamed from: f */
        private String f28510f;

        /* renamed from: g */
        private int f28511g = 0;

        /* renamed from: h */
        private List<String> f28512h;

        /* renamed from: i */
        private JSONObject f28513i;

        public C7089a(long j, int i) throws IllegalArgumentException {
            this.f28505a = j;
            this.f28506b = i;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public MediaTrack mo29374a() {
            return new MediaTrack(this.f28505a, this.f28506b, this.f28507c, this.f28508d, this.f28509e, this.f28510f, this.f28511g, this.f28512h, this.f28513i);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C7089a mo29375b(String str) {
            this.f28507c = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C7089a mo29376c(String str) {
            this.f28509e = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C7089a mo29377d(int i) throws IllegalArgumentException {
            if (i < -1 || i > 5) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid subtype ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i == 0 || this.f28506b == 1) {
                this.f28511g = i;
                return this;
            } else {
                throw new IllegalArgumentException("subtypes are only valid for text tracks");
            }
        }
    }

    MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List<String> list, JSONObject jSONObject) {
        this.f28495b = j;
        this.f28496c = i;
        this.f28497d = str;
        this.f28498e = str2;
        this.f28499f = str3;
        this.f28500g = str4;
        this.f28501h = i2;
        this.f28502i = list;
        this.f28504k = jSONObject;
    }

    @RecentlyNullable
    /* renamed from: C0 */
    public String mo29361C0() {
        return this.f28497d;
    }

    @RecentlyNullable
    /* renamed from: D0 */
    public String mo29362D0() {
        return this.f28498e;
    }

    /* renamed from: E0 */
    public long mo29363E0() {
        return this.f28495b;
    }

    @RecentlyNullable
    /* renamed from: F0 */
    public String mo29364F0() {
        return this.f28500g;
    }

    @TargetApi(21)
    @RecentlyNullable
    /* renamed from: G0 */
    public Locale mo29365G0() {
        if (TextUtils.isEmpty(this.f28500g)) {
            return null;
        }
        if (C6492o.m28285h()) {
            return Locale.forLanguageTag(this.f28500g);
        }
        String[] split = this.f28500g.split("-", -1);
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        return new Locale(split[0], split[1]);
    }

    @RecentlyNullable
    /* renamed from: H0 */
    public String mo29366H0() {
        return this.f28499f;
    }

    @RecentlyNullable
    /* renamed from: I0 */
    public List<String> mo29367I0() {
        return this.f28502i;
    }

    /* renamed from: J0 */
    public int mo29368J0() {
        return this.f28501h;
    }

    /* renamed from: K0 */
    public int mo29369K0() {
        return this.f28496c;
    }

    @RecentlyNonNull
    /* renamed from: L0 */
    public final JSONObject mo29370L0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f28495b);
            int i = this.f28496c;
            if (i == 1) {
                jSONObject.put(SessionDescription.ATTR_TYPE, AdPreferences.TYPE_TEXT);
            } else if (i == 2) {
                jSONObject.put(SessionDescription.ATTR_TYPE, "AUDIO");
            } else if (i == 3) {
                jSONObject.put(SessionDescription.ATTR_TYPE, "VIDEO");
            }
            String str = this.f28497d;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.f28498e;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.f28499f;
            if (str3 != null) {
                jSONObject.put(MediationMetaData.KEY_NAME, str3);
            }
            if (!TextUtils.isEmpty(this.f28500g)) {
                jSONObject.put("language", this.f28500g);
            }
            int i2 = this.f28501h;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List<String> list = this.f28502i;
            if (list != null) {
                jSONObject.put("roles", new JSONArray(list));
            }
            JSONObject jSONObject2 = this.f28504k;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f28504k;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f28504k;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C6489l.m28274a(jSONObject, jSONObject2)) && this.f28495b == mediaTrack.f28495b && this.f28496c == mediaTrack.f28496c && C10920a.m49143f(this.f28497d, mediaTrack.f28497d) && C10920a.m49143f(this.f28498e, mediaTrack.f28498e) && C10920a.m49143f(this.f28499f, mediaTrack.f28499f) && C10920a.m49143f(this.f28500g, mediaTrack.f28500g) && this.f28501h == mediaTrack.f28501h && C10920a.m49143f(this.f28502i, mediaTrack.f28502i);
    }

    public int hashCode() {
        return C7408m.m30029b(Long.valueOf(this.f28495b), Integer.valueOf(this.f28496c), this.f28497d, this.f28498e, this.f28499f, this.f28500g, Integer.valueOf(this.f28501h), this.f28502i, String.valueOf(this.f28504k));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.f28504k;
        this.f28503j = jSONObject == null ? null : jSONObject.toString();
        int a = C11058b.m49515a(parcel);
        C11058b.m49531q(parcel, 2, mo29363E0());
        C11058b.m49527m(parcel, 3, mo29369K0());
        C11058b.m49537w(parcel, 4, mo29361C0(), false);
        C11058b.m49537w(parcel, 5, mo29362D0(), false);
        C11058b.m49537w(parcel, 6, mo29366H0(), false);
        C11058b.m49537w(parcel, 7, mo29364F0(), false);
        C11058b.m49527m(parcel, 8, mo29368J0());
        C11058b.m49539y(parcel, 9, mo29367I0(), false);
        C11058b.m49537w(parcel, 10, this.f28503j, false);
        C11058b.m49516b(parcel, a);
    }
}
