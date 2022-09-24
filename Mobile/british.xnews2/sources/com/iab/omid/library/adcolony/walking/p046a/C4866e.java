package com.iab.omid.library.adcolony.walking.p046a;

import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p042b.C4828a;
import com.iab.omid.library.adcolony.walking.p046a.C4861b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.e */
public class C4866e extends C4860a {
    public C4866e(C4861b.C4863b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22434b(String str) {
        C4828a a = C4828a.m22256a();
        if (a != null) {
            for (C4826a next : a.mo20111b()) {
                if (this.f21758a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo20169b(str, this.f21760c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f21759b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22434b(str);
        super.onPostExecute(str);
    }
}
