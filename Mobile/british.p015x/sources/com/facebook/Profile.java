package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C3366b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f12792h = Profile.class.getSimpleName();

    /* renamed from: b */
    private final String f12793b;

    /* renamed from: c */
    private final String f12794c;

    /* renamed from: d */
    private final String f12795d;

    /* renamed from: e */
    private final String f12796e;

    /* renamed from: f */
    private final String f12797f;

    /* renamed from: g */
    private final Uri f12798g;

    /* renamed from: com.facebook.Profile$a */
    static class C3365a implements C3481f0.C3484c {
        C3365a() {
        }

        /* renamed from: a */
        public void mo11289a(JSONObject jSONObject) {
            String optString = jSONObject.optString(TtmlNode.ATTR_ID);
            if (optString != null) {
                String optString2 = jSONObject.optString("link");
                Profile.m11333f(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString(MediationMetaData.KEY_NAME), optString2 != null ? Uri.parse(optString2) : null));
            }
        }

        /* renamed from: b */
        public void mo11290b(C3572j jVar) {
            String a = Profile.f12792h;
            Log.e(a, "Got unexpected exception: " + jVar);
        }
    }

    /* renamed from: com.facebook.Profile$b */
    static class C3366b implements Parcelable.Creator<Profile> {
        C3366b() {
        }

        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, (C3365a) null);
        }

        /* renamed from: b */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* synthetic */ Profile(Parcel parcel, C3365a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static void m11331b() {
        AccessToken h = AccessToken.m11205h();
        if (!AccessToken.m11207t()) {
            m11333f((Profile) null);
        } else {
            C3481f0.m11659x(h.mo11191r(), new C3365a());
        }
    }

    /* renamed from: d */
    public static Profile m11332d() {
        return C3754w.m12656b().mo12611a();
    }

    /* renamed from: f */
    public static void m11333f(Profile profile) {
        C3754w.m12656b().mo12613e(profile);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11284e() {
        return this.f12797f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.f12793b.equals(profile.f12793b) || this.f12794c != null) {
            if (!this.f12794c.equals(profile.f12794c) || this.f12795d != null) {
                if (!this.f12795d.equals(profile.f12795d) || this.f12796e != null) {
                    if (!this.f12796e.equals(profile.f12796e) || this.f12797f != null) {
                        if (!this.f12797f.equals(profile.f12797f) || this.f12798g != null) {
                            return this.f12798g.equals(profile.f12798g);
                        }
                        if (profile.f12798g == null) {
                            return true;
                        }
                    } else if (profile.f12797f == null) {
                        return true;
                    }
                } else if (profile.f12796e == null) {
                    return true;
                }
            } else if (profile.f12795d == null) {
                return true;
            }
        } else if (profile.f12794c == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo11286g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f12793b);
            jSONObject.put("first_name", this.f12794c);
            jSONObject.put("middle_name", this.f12795d);
            jSONObject.put("last_name", this.f12796e);
            jSONObject.put(MediationMetaData.KEY_NAME, this.f12797f);
            Uri uri = this.f12798g;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        int hashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12793b.hashCode();
        String str = this.f12794c;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f12795d;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f12796e;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f12797f;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f12798g;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12793b);
        parcel.writeString(this.f12794c);
        parcel.writeString(this.f12795d);
        parcel.writeString(this.f12796e);
        parcel.writeString(this.f12797f);
        Uri uri = this.f12798g;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C3489g0.m11688j(str, TtmlNode.ATTR_ID);
        this.f12793b = str;
        this.f12794c = str2;
        this.f12795d = str3;
        this.f12796e = str4;
        this.f12797f = str5;
        this.f12798g = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f12793b = jSONObject.optString(TtmlNode.ATTR_ID, (String) null);
        this.f12794c = jSONObject.optString("first_name", (String) null);
        this.f12795d = jSONObject.optString("middle_name", (String) null);
        this.f12796e = jSONObject.optString("last_name", (String) null);
        this.f12797f = jSONObject.optString(MediationMetaData.KEY_NAME, (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f12798g = optString != null ? Uri.parse(optString) : uri;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f12793b = parcel.readString();
        this.f12794c = parcel.readString();
        this.f12795d = parcel.readString();
        this.f12796e = parcel.readString();
        this.f12797f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f12798g = uri;
    }
}
