package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C3347a();

    /* renamed from: m */
    private static final Date f12707m;

    /* renamed from: n */
    private static final Date f12708n;

    /* renamed from: o */
    private static final Date f12709o = new Date();

    /* renamed from: p */
    private static final C3436c f12710p = C3436c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: b */
    private final Date f12711b;

    /* renamed from: c */
    private final Set<String> f12712c;

    /* renamed from: d */
    private final Set<String> f12713d;

    /* renamed from: e */
    private final Set<String> f12714e;

    /* renamed from: f */
    private final String f12715f;

    /* renamed from: g */
    private final C3436c f12716g;

    /* renamed from: h */
    private final Date f12717h;

    /* renamed from: i */
    private final String f12718i;

    /* renamed from: j */
    private final String f12719j;

    /* renamed from: k */
    private final Date f12720k;

    /* renamed from: l */
    private final String f12721l;

    /* renamed from: com.facebook.AccessToken$a */
    static class C3347a implements Parcelable.Creator {
        C3347a() {
        }

        /* renamed from: a */
        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: b */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* renamed from: com.facebook.AccessToken$b */
    public interface C3348b {
        /* renamed from: a */
        void mo11201a(C3572j jVar);

        /* renamed from: b */
        void mo11202b(AccessToken accessToken);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f12707m = date;
        f12708n = date;
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C3436c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, (String) null);
    }

    /* renamed from: a */
    private void m11200a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f12712c == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f12712c));
        sb.append("]");
    }

    /* renamed from: b */
    static AccessToken m11201b(AccessToken accessToken) {
        return new AccessToken(accessToken.f12715f, accessToken.f12718i, accessToken.mo11192s(), accessToken.mo11189o(), accessToken.mo11184j(), accessToken.mo11185k(), accessToken.f12716g, new Date(), new Date(), accessToken.f12720k);
    }

    /* renamed from: d */
    static AccessToken m11202d(JSONObject jSONObject) throws JSONException {
        Collection collection;
        if (jSONObject.getInt(MediationMetaData.KEY_VERSION) <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C3436c valueOf = C3436c.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            String optString = jSONObject.optString("graph_domain", (String) null);
            List<String> R = C3481f0.m11607R(jSONArray);
            List<String> R2 = C3481f0.m11607R(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = C3481f0.m11607R(optJSONArray);
            }
            return new AccessToken(string, string2, string3, R, R2, collection, valueOf, date, date2, date3, optString);
        }
        throw new C3572j("Unknown AccessToken serialization format.");
    }

    /* renamed from: e */
    static AccessToken m11203e(Bundle bundle) {
        List<String> p = m11206p(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> p2 = m11206p(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List<String> p3 = m11206p(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String c = C3751t.m12646c(bundle);
        if (C3481f0.m11604O(c)) {
            c = C3642m.m12280f();
        }
        String str = c;
        String f = C3751t.m12649f(bundle);
        try {
            return new AccessToken(f, str, C3481f0.m11622d(f).getString(TtmlNode.ATTR_ID), p, p2, p3, C3751t.m12648e(bundle), C3751t.m12647d(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C3751t.m12647d(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), (Date) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    static void m11204f() {
        AccessToken g = C3427b.m11468h().mo11864g();
        if (g != null) {
            m11208v(m11201b(g));
        }
    }

    /* renamed from: h */
    public static AccessToken m11205h() {
        return C3427b.m11468h().mo11864g();
    }

    /* renamed from: p */
    static List<String> m11206p(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: t */
    public static boolean m11207t() {
        AccessToken g = C3427b.m11468h().mo11864g();
        return g != null && !g.mo11194u();
    }

    /* renamed from: v */
    public static void m11208v(AccessToken accessToken) {
        C3427b.m11468h().mo11867m(accessToken);
    }

    /* renamed from: x */
    private String m11209x() {
        if (this.f12715f == null) {
            return "null";
        }
        return C3642m.m12298x(C3752u.f13857c) ? this.f12715f : "ACCESS_TOKEN_REMOVED";
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f12711b.equals(accessToken.f12711b) && this.f12712c.equals(accessToken.f12712c) && this.f12713d.equals(accessToken.f12713d) && this.f12714e.equals(accessToken.f12714e) && this.f12715f.equals(accessToken.f12715f) && this.f12716g == accessToken.f12716g && this.f12717h.equals(accessToken.f12717h) && ((str = this.f12718i) != null ? str.equals(accessToken.f12718i) : accessToken.f12718i == null) && this.f12719j.equals(accessToken.f12719j) && this.f12720k.equals(accessToken.f12720k)) {
            String str2 = this.f12721l;
            String str3 = accessToken.f12721l;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String mo11181g() {
        return this.f12718i;
    }

    public int hashCode() {
        int hashCode = (((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12711b.hashCode()) * 31) + this.f12712c.hashCode()) * 31) + this.f12713d.hashCode()) * 31) + this.f12714e.hashCode()) * 31) + this.f12715f.hashCode()) * 31) + this.f12716g.hashCode()) * 31) + this.f12717h.hashCode()) * 31;
        String str = this.f12718i;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f12719j.hashCode()) * 31) + this.f12720k.hashCode()) * 31;
        String str2 = this.f12721l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public Date mo11183i() {
        return this.f12720k;
    }

    /* renamed from: j */
    public Set<String> mo11184j() {
        return this.f12713d;
    }

    /* renamed from: k */
    public Set<String> mo11185k() {
        return this.f12714e;
    }

    /* renamed from: l */
    public Date mo11186l() {
        return this.f12711b;
    }

    /* renamed from: m */
    public String mo11187m() {
        return this.f12721l;
    }

    /* renamed from: n */
    public Date mo11188n() {
        return this.f12717h;
    }

    /* renamed from: o */
    public Set<String> mo11189o() {
        return this.f12712c;
    }

    /* renamed from: q */
    public C3436c mo11190q() {
        return this.f12716g;
    }

    /* renamed from: r */
    public String mo11191r() {
        return this.f12715f;
    }

    /* renamed from: s */
    public String mo11192s() {
        return this.f12719j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m11209x());
        m11200a(sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo11194u() {
        return new Date().after(this.f12711b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public JSONObject mo11195w() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MediationMetaData.KEY_VERSION, 1);
        jSONObject.put("token", this.f12715f);
        jSONObject.put("expires_at", this.f12711b.getTime());
        jSONObject.put("permissions", new JSONArray(this.f12712c));
        jSONObject.put("declined_permissions", new JSONArray(this.f12713d));
        jSONObject.put("expired_permissions", new JSONArray(this.f12714e));
        jSONObject.put("last_refresh", this.f12717h.getTime());
        jSONObject.put("source", this.f12716g.name());
        jSONObject.put("application_id", this.f12718i);
        jSONObject.put("user_id", this.f12719j);
        jSONObject.put("data_access_expiration_time", this.f12720k.getTime());
        String str = this.f12721l;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12711b.getTime());
        parcel.writeStringList(new ArrayList(this.f12712c));
        parcel.writeStringList(new ArrayList(this.f12713d));
        parcel.writeStringList(new ArrayList(this.f12714e));
        parcel.writeString(this.f12715f);
        parcel.writeString(this.f12716g.name());
        parcel.writeLong(this.f12717h.getTime());
        parcel.writeString(this.f12718i);
        parcel.writeString(this.f12719j);
        parcel.writeLong(this.f12720k.getTime());
        parcel.writeString(this.f12721l);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C3436c cVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C3489g0.m11688j(str, "accessToken");
        C3489g0.m11688j(str2, "applicationId");
        C3489g0.m11688j(str3, DataKeys.USER_ID);
        this.f12711b = date == null ? f12708n : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.f12712c = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.f12713d = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f12714e = Collections.unmodifiableSet(hashSet3);
        this.f12715f = str;
        this.f12716g = cVar == null ? f12710p : cVar;
        this.f12717h = date2 == null ? f12709o : date2;
        this.f12718i = str2;
        this.f12719j = str3;
        this.f12720k = (date3 == null || date3.getTime() == 0) ? f12708n : date3;
        this.f12721l = str4;
    }

    AccessToken(Parcel parcel) {
        this.f12711b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f12712c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f12713d = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f12714e = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f12715f = parcel.readString();
        this.f12716g = C3436c.valueOf(parcel.readString());
        this.f12717h = new Date(parcel.readLong());
        this.f12718i = parcel.readString();
        this.f12719j = parcel.readString();
        this.f12720k = new Date(parcel.readLong());
        this.f12721l = parcel.readString();
    }
}
