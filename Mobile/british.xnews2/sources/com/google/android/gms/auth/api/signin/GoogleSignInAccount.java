package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6483e;
import p006a5.C6486h;
import p216i4.C10584c;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C7068c();

    /* renamed from: o */
    public static C6483e f28238o = C6486h.m28261b();

    /* renamed from: b */
    final int f28239b;

    /* renamed from: c */
    private String f28240c;

    /* renamed from: d */
    private String f28241d;

    /* renamed from: e */
    private String f28242e;

    /* renamed from: f */
    private String f28243f;

    /* renamed from: g */
    private Uri f28244g;

    /* renamed from: h */
    private String f28245h;

    /* renamed from: i */
    private long f28246i;

    /* renamed from: j */
    private String f28247j;

    /* renamed from: k */
    List<Scope> f28248k;

    /* renamed from: l */
    private String f28249l;

    /* renamed from: m */
    private String f28250m;

    /* renamed from: n */
    private Set<Scope> f28251n = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f28239b = i;
        this.f28240c = str;
        this.f28241d = str2;
        this.f28242e = str3;
        this.f28243f = str4;
        this.f28244g = uri;
        this.f28245h = str5;
        this.f28246i = j;
        this.f28247j = str6;
        this.f28248k = list;
        this.f28249l = str7;
        this.f28250m = str8;
    }

    /* renamed from: L0 */
    public static GoogleSignInAccount m28956L0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C4604n.m20094g(str7), new ArrayList((Collection) C4604n.m20098k(set)), str5, str6);
    }

    /* renamed from: M0 */
    public static GoogleSignInAccount m28957M0(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount L0 = m28956L0(jSONObject.optString(TtmlNode.ATTR_ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        L0.f28245h = str2;
        return L0;
    }

    /* renamed from: C0 */
    public String mo29082C0() {
        return this.f28243f;
    }

    /* renamed from: D0 */
    public String mo29083D0() {
        return this.f28242e;
    }

    /* renamed from: E0 */
    public String mo29084E0() {
        return this.f28250m;
    }

    /* renamed from: F0 */
    public String mo29085F0() {
        return this.f28249l;
    }

    /* renamed from: G0 */
    public String mo29086G0() {
        return this.f28240c;
    }

    /* renamed from: H0 */
    public String mo29087H0() {
        return this.f28241d;
    }

    /* renamed from: I0 */
    public Uri mo29088I0() {
        return this.f28244g;
    }

    /* renamed from: J0 */
    public Set<Scope> mo29089J0() {
        HashSet hashSet = new HashSet(this.f28248k);
        hashSet.addAll(this.f28251n);
        return hashSet;
    }

    /* renamed from: K0 */
    public String mo29090K0() {
        return this.f28245h;
    }

    /* renamed from: N0 */
    public final String mo29091N0() {
        return this.f28247j;
    }

    /* renamed from: O0 */
    public final String mo29092O0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo29086G0() != null) {
                jSONObject.put(TtmlNode.ATTR_ID, mo29086G0());
            }
            if (mo29087H0() != null) {
                jSONObject.put("tokenId", mo29087H0());
            }
            if (mo29083D0() != null) {
                jSONObject.put("email", mo29083D0());
            }
            if (mo29082C0() != null) {
                jSONObject.put("displayName", mo29082C0());
            }
            if (mo29085F0() != null) {
                jSONObject.put("givenName", mo29085F0());
            }
            if (mo29084E0() != null) {
                jSONObject.put("familyName", mo29084E0());
            }
            Uri I0 = mo29088I0();
            if (I0 != null) {
                jSONObject.put("photoUrl", I0.toString());
            }
            if (mo29090K0() != null) {
                jSONObject.put("serverAuthCode", mo29090K0());
            }
            jSONObject.put("expirationTime", this.f28246i);
            jSONObject.put("obfuscatedIdentifier", this.f28247j);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f28248k;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C10584c.f49131b);
            for (Scope C0 : scopeArr) {
                jSONArray.put(C0.mo29726C0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d0 */
    public Account mo29093d0() {
        String str = this.f28242e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f28247j.equals(this.f28247j) && googleSignInAccount.mo29089J0().equals(mo29089J0());
    }

    public int hashCode() {
        return ((this.f28247j.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + mo29089J0().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28239b);
        C11058b.m49537w(parcel, 2, mo29086G0(), false);
        C11058b.m49537w(parcel, 3, mo29087H0(), false);
        C11058b.m49537w(parcel, 4, mo29083D0(), false);
        C11058b.m49537w(parcel, 5, mo29082C0(), false);
        C11058b.m49535u(parcel, 6, mo29088I0(), i, false);
        C11058b.m49537w(parcel, 7, mo29090K0(), false);
        C11058b.m49531q(parcel, 8, this.f28246i);
        C11058b.m49537w(parcel, 9, this.f28247j, false);
        C11058b.m49510A(parcel, 10, this.f28248k, false);
        C11058b.m49537w(parcel, 11, mo29085F0(), false);
        C11058b.m49537w(parcel, 12, mo29084E0(), false);
        C11058b.m49516b(parcel, a);
    }
}
