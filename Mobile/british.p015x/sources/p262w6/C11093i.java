package p262w6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.C7417p;
import p006a5.C0116s;

/* renamed from: w6.i */
/* compiled from: FirebaseOptions */
public final class C11093i {

    /* renamed from: a */
    private final String f50044a;

    /* renamed from: b */
    private final String f50045b;

    /* renamed from: c */
    private final String f50046c;

    /* renamed from: d */
    private final String f50047d;

    /* renamed from: e */
    private final String f50048e;

    /* renamed from: f */
    private final String f50049f;

    /* renamed from: g */
    private final String f50050g;

    private C11093i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C4604n.m20102o(!C0116s.m414a(str), "ApplicationId must be set.");
        this.f50045b = str;
        this.f50044a = str2;
        this.f50046c = str3;
        this.f50047d = str4;
        this.f50048e = str5;
        this.f50049f = str6;
        this.f50050g = str7;
    }

    /* renamed from: a */
    public static C11093i m49584a(Context context) {
        C7417p pVar = new C7417p(context);
        String a = pVar.mo30148a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C11093i(a, pVar.mo30148a("google_api_key"), pVar.mo30148a("firebase_database_url"), pVar.mo30148a("ga_trackingId"), pVar.mo30148a("gcm_defaultSenderId"), pVar.mo30148a("google_storage_bucket"), pVar.mo30148a("project_id"));
    }

    /* renamed from: b */
    public String mo43367b() {
        return this.f50044a;
    }

    /* renamed from: c */
    public String mo43368c() {
        return this.f50045b;
    }

    /* renamed from: d */
    public String mo43369d() {
        return this.f50048e;
    }

    /* renamed from: e */
    public String mo43370e() {
        return this.f50050g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11093i)) {
            return false;
        }
        C11093i iVar = (C11093i) obj;
        if (!C7408m.m30028a(this.f50045b, iVar.f50045b) || !C7408m.m30028a(this.f50044a, iVar.f50044a) || !C7408m.m30028a(this.f50046c, iVar.f50046c) || !C7408m.m30028a(this.f50047d, iVar.f50047d) || !C7408m.m30028a(this.f50048e, iVar.f50048e) || !C7408m.m30028a(this.f50049f, iVar.f50049f) || !C7408m.m30028a(this.f50050g, iVar.f50050g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7408m.m30029b(this.f50045b, this.f50044a, this.f50046c, this.f50047d, this.f50048e, this.f50049f, this.f50050g);
    }

    public String toString() {
        return C7408m.m30030c(this).mo30140a("applicationId", this.f50045b).mo30140a("apiKey", this.f50044a).mo30140a("databaseUrl", this.f50046c).mo30140a("gcmSenderId", this.f50048e).mo30140a("storageBucket", this.f50049f).mo30140a("projectId", this.f50050g).toString();
    }
}
