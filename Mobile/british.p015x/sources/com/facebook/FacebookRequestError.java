package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3490h;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C3351a();

    /* renamed from: p */
    static final C3353c f12738p = new C3353c(200, 299, (C3351a) null);

    /* renamed from: b */
    private final C3352b f12739b;

    /* renamed from: c */
    private final int f12740c;

    /* renamed from: d */
    private final int f12741d;

    /* renamed from: e */
    private final int f12742e;

    /* renamed from: f */
    private final String f12743f;

    /* renamed from: g */
    private final String f12744g;

    /* renamed from: h */
    private final String f12745h;

    /* renamed from: i */
    private final String f12746i;

    /* renamed from: j */
    private final String f12747j;

    /* renamed from: k */
    private final JSONObject f12748k;

    /* renamed from: l */
    private final JSONObject f12749l;

    /* renamed from: m */
    private final Object f12750m;

    /* renamed from: n */
    private final HttpURLConnection f12751n;

    /* renamed from: o */
    private final C3572j f12752o;

    /* renamed from: com.facebook.FacebookRequestError$a */
    static class C3351a implements Parcelable.Creator<FacebookRequestError> {
        C3351a() {
        }

        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (C3351a) null);
        }

        /* renamed from: b */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public enum C3352b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$c */
    private static class C3353c {

        /* renamed from: a */
        private final int f12757a;

        /* renamed from: b */
        private final int f12758b;

        /* synthetic */ C3353c(int i, int i2, C3351a aVar) {
            this(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11239a(int i) {
            return this.f12757a <= i && i <= this.f12758b;
        }

        private C3353c(int i, int i2) {
            this.f12757a = i;
            this.f12758b = i2;
        }
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, C3351a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static FacebookRequestError m11234a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("code")) {
                int i3 = jSONObject2.getInt("code");
                Object C = C3481f0.m11592C(jSONObject2, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
                if (C != null && (C instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) C;
                    boolean z2 = false;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C3481f0.m11592C(jSONObject3, "error", (String) null);
                        String optString = jSONObject4.optString(SessionDescription.ATTR_TYPE, (String) null);
                        String optString2 = jSONObject4.optString("message", (String) null);
                        i2 = jSONObject4.optInt("code", -1);
                        int optInt = jSONObject4.optInt("error_subcode", -1);
                        str2 = jSONObject4.optString("error_user_msg", (String) null);
                        str = jSONObject4.optString("error_user_title", (String) null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str4 = optString;
                        z2 = true;
                        int i4 = optInt;
                        str3 = optString2;
                        i = i4;
                    } else {
                        if (!jSONObject3.has("error_code")) {
                            if (!jSONObject3.has("error_msg")) {
                                if (!jSONObject3.has("error_reason")) {
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                    i2 = -1;
                                    i = -1;
                                    z = false;
                                }
                            }
                        }
                        String optString3 = jSONObject3.optString("error_reason", (String) null);
                        String optString4 = jSONObject3.optString("error_msg", (String) null);
                        int optInt2 = jSONObject3.optInt("error_code", -1);
                        i = jSONObject3.optInt("error_subcode", -1);
                        str4 = optString3;
                        str3 = optString4;
                        str2 = null;
                        str = null;
                        z2 = true;
                        z = false;
                        i2 = optInt2;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, i, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, (C3572j) null);
                    }
                }
                if (!f12738p.mo11239a(i3)) {
                    return new FacebookRequestError(i3, -1, -1, (String) null, (String) null, (String) null, (String) null, false, jSONObject2.has(TtmlNode.TAG_BODY) ? (JSONObject) C3481f0.m11592C(jSONObject2, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, (C3572j) null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: b */
    static synchronized C3490h m11235b() {
        synchronized (FacebookRequestError.class) {
            C3520m j = C3522n.m11804j(C3642m.m12280f());
            if (j == null) {
                C3490h c = C3490h.m11691c();
                return c;
            }
            C3490h c2 = j.mo11998c();
            return c2;
        }
    }

    /* renamed from: d */
    public int mo11225d() {
        return this.f12741d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11227e() {
        String str = this.f12744g;
        if (str != null) {
            return str;
        }
        return this.f12752o.getLocalizedMessage();
    }

    /* renamed from: f */
    public String mo11228f() {
        return this.f12743f;
    }

    /* renamed from: g */
    public C3572j mo11229g() {
        return this.f12752o;
    }

    /* renamed from: h */
    public JSONObject mo11230h() {
        return this.f12748k;
    }

    /* renamed from: i */
    public int mo11231i() {
        return this.f12740c;
    }

    /* renamed from: j */
    public int mo11232j() {
        return this.f12742e;
    }

    public String toString() {
        return "{HttpStatus: " + this.f12740c + ", errorCode: " + this.f12741d + ", subErrorCode: " + this.f12742e + ", errorType: " + this.f12743f + ", errorMessage: " + mo11227e() + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12740c);
        parcel.writeInt(this.f12741d);
        parcel.writeInt(this.f12742e);
        parcel.writeString(this.f12743f);
        parcel.writeString(this.f12744g);
        parcel.writeString(this.f12745h);
        parcel.writeString(this.f12746i);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C3572j jVar) {
        boolean z2;
        C3352b bVar;
        this.f12740c = i;
        this.f12741d = i2;
        this.f12742e = i3;
        this.f12743f = str;
        this.f12744g = str2;
        this.f12749l = jSONObject;
        this.f12748k = jSONObject2;
        this.f12750m = obj;
        this.f12751n = httpURLConnection;
        this.f12745h = str3;
        this.f12746i = str4;
        if (jVar != null) {
            this.f12752o = jVar;
            z2 = true;
        } else {
            this.f12752o = new C3650o(this, str2);
            z2 = false;
        }
        C3490h b = m11235b();
        if (z2) {
            bVar = C3352b.OTHER;
        } else {
            bVar = b.mo11940a(i2, i3, z);
        }
        this.f12739b = bVar;
        this.f12747j = b.mo11941e(bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.C3572j
            if (r1 == 0) goto L_0x000a
            com.facebook.j r0 = (com.facebook.C3572j) r0
            r15 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.j r1 = new com.facebook.j
            r1.<init>((java.lang.Throwable) r0)
            r15 = r1
        L_0x0010:
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r16
            r14 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C3572j) null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C3572j) null);
    }
}
