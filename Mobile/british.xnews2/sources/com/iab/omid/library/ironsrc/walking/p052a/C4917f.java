package com.iab.omid.library.ironsrc.walking.p052a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.p048b.C4878a;
import com.iab.omid.library.ironsrc.p050d.C4893b;
import com.iab.omid.library.ironsrc.walking.p052a.C4911b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.f */
public class C4917f extends C4910a {
    public C4917f(C4911b.C4913b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22658b(String str) {
        C4878a a = C4878a.m22477a();
        if (a != null) {
            for (C4876a next : a.mo20297b()) {
                if (this.f21872a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo20350a(str, this.f21874c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4893b.m22555b(this.f21873b, this.f21876d.mo20396b())) {
            return null;
        }
        this.f21876d.mo20395a(this.f21873b);
        return this.f21873b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22658b(str);
        }
        super.onPostExecute(str);
    }
}
