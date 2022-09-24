package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p216i4.C10585d;
import p220j4.C10607a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C7191a.C7195d.C7198c, C7191a.C7195d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C7070e();

    /* renamed from: m */
    public static final GoogleSignInOptions f28252m;

    /* renamed from: n */
    public static final GoogleSignInOptions f28253n;

    /* renamed from: o */
    public static final Scope f28254o = new Scope("profile");

    /* renamed from: p */
    public static final Scope f28255p = new Scope("email");

    /* renamed from: q */
    public static final Scope f28256q = new Scope("openid");

    /* renamed from: r */
    public static final Scope f28257r;

    /* renamed from: s */
    public static final Scope f28258s = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: t */
    private static Comparator<Scope> f28259t = new C7069d();

    /* renamed from: b */
    final int f28260b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ArrayList<Scope> f28261c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Account f28262d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f28263e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f28264f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f28265g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f28266h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f28267i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f28268j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f28269k;

    /* renamed from: l */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f28270l;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f28257r = scope;
        C7063a aVar = new C7063a();
        aVar.mo29110b();
        aVar.mo29111c();
        f28252m = aVar.mo29109a();
        C7063a aVar2 = new C7063a();
        aVar2.mo29112d(scope, new Scope[0]);
        f28253n = aVar2.mo29109a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m28981V0(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C10585d dVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    /* renamed from: K0 */
    public static GoogleSignInOptions m28971K0(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, optString2, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m28981V0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.mo29122C0()), next);
        }
        return hashMap;
    }

    /* renamed from: C0 */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo29097C0() {
        return this.f28268j;
    }

    /* renamed from: D0 */
    public String mo29098D0() {
        return this.f28269k;
    }

    /* renamed from: E0 */
    public ArrayList<Scope> mo29099E0() {
        return new ArrayList<>(this.f28261c);
    }

    /* renamed from: F0 */
    public String mo29100F0() {
        return this.f28266h;
    }

    /* renamed from: G0 */
    public boolean mo29101G0() {
        return this.f28265g;
    }

    /* renamed from: H0 */
    public boolean mo29102H0() {
        return this.f28263e;
    }

    /* renamed from: I0 */
    public boolean mo29103I0() {
        return this.f28264f;
    }

    /* renamed from: O0 */
    public final String mo29104O0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f28261c, f28259t);
            Iterator<Scope> it = this.f28261c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo29726C0());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f28262d;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f28263e);
            jSONObject.put("forceCodeForRefreshToken", this.f28265g);
            jSONObject.put("serverAuthRequested", this.f28264f);
            if (!TextUtils.isEmpty(this.f28266h)) {
                jSONObject.put("serverClientId", this.f28266h);
            }
            if (!TextUtils.isEmpty(this.f28267i)) {
                jSONObject.put("hostedDomain", this.f28267i);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d0 */
    public Account mo29105d0() {
        return this.f28262d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo29105d0()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f28268j     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f28268j     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f28261c     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo29099E0()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f28261c     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo29099E0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f28262d     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo29105d0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo29105d0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f28266h     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo29100F0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f28266h     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo29100F0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f28265g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo29101G0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f28263e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo29102H0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f28264f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo29103I0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f28269k     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo29098D0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f28261c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).mo29726C0());
        }
        Collections.sort(arrayList);
        C10607a aVar = new C10607a();
        aVar.mo42719a(arrayList);
        aVar.mo42719a(this.f28262d);
        aVar.mo42719a(this.f28266h);
        aVar.mo42721c(this.f28265g);
        aVar.mo42721c(this.f28263e);
        aVar.mo42721c(this.f28264f);
        aVar.mo42719a(this.f28269k);
        return aVar.mo42720b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28260b);
        C11058b.m49510A(parcel, 2, mo29099E0(), false);
        C11058b.m49535u(parcel, 3, mo29105d0(), i, false);
        C11058b.m49517c(parcel, 4, mo29102H0());
        C11058b.m49517c(parcel, 5, mo29103I0());
        C11058b.m49517c(parcel, 6, mo29101G0());
        C11058b.m49537w(parcel, 7, mo29100F0(), false);
        C11058b.m49537w(parcel, 8, this.f28267i, false);
        C11058b.m49510A(parcel, 9, mo29097C0(), false);
        C11058b.m49537w(parcel, 10, mo29098D0(), false);
        C11058b.m49516b(parcel, a);
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C7063a {

        /* renamed from: a */
        private Set<Scope> f28271a = new HashSet();

        /* renamed from: b */
        private boolean f28272b;

        /* renamed from: c */
        private boolean f28273c;

        /* renamed from: d */
        private boolean f28274d;

        /* renamed from: e */
        private String f28275e;

        /* renamed from: f */
        private Account f28276f;

        /* renamed from: g */
        private String f28277g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f28278h = new HashMap();

        /* renamed from: i */
        private String f28279i;

        public C7063a() {
        }

        /* renamed from: a */
        public GoogleSignInOptions mo29109a() {
            if (this.f28271a.contains(GoogleSignInOptions.f28258s)) {
                Set<Scope> set = this.f28271a;
                Scope scope = GoogleSignInOptions.f28257r;
                if (set.contains(scope)) {
                    this.f28271a.remove(scope);
                }
            }
            if (this.f28274d && (this.f28276f == null || !this.f28271a.isEmpty())) {
                mo29110b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f28271a), this.f28276f, this.f28274d, this.f28272b, this.f28273c, this.f28275e, this.f28277g, this.f28278h, this.f28279i, (C10585d) null);
        }

        /* renamed from: b */
        public C7063a mo29110b() {
            this.f28271a.add(GoogleSignInOptions.f28256q);
            return this;
        }

        /* renamed from: c */
        public C7063a mo29111c() {
            this.f28271a.add(GoogleSignInOptions.f28254o);
            return this;
        }

        /* renamed from: d */
        public C7063a mo29112d(Scope scope, Scope... scopeArr) {
            this.f28271a.add(scope);
            this.f28271a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public C7063a(GoogleSignInOptions googleSignInOptions) {
            C4604n.m20098k(googleSignInOptions);
            this.f28271a = new HashSet(googleSignInOptions.f28261c);
            this.f28272b = googleSignInOptions.f28264f;
            this.f28273c = googleSignInOptions.f28265g;
            this.f28274d = googleSignInOptions.f28263e;
            this.f28275e = googleSignInOptions.f28266h;
            this.f28276f = googleSignInOptions.f28262d;
            this.f28277g = googleSignInOptions.f28267i;
            this.f28278h = GoogleSignInOptions.m28981V0(googleSignInOptions.f28268j);
            this.f28279i = googleSignInOptions.f28269k;
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f28260b = i;
        this.f28261c = arrayList;
        this.f28262d = account;
        this.f28263e = z;
        this.f28264f = z2;
        this.f28265g = z3;
        this.f28266h = str;
        this.f28267i = str2;
        this.f28268j = new ArrayList<>(map.values());
        this.f28270l = map;
        this.f28269k = str3;
    }
}
