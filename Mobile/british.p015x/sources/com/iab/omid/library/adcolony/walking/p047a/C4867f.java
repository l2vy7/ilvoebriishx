package com.iab.omid.library.adcolony.walking.p047a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p043b.C4828a;
import com.iab.omid.library.adcolony.p045d.C4843b;
import com.iab.omid.library.adcolony.walking.p047a.C4861b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.f */
public class C4867f extends C4860a {
    public C4867f(C4861b.C4863b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22437b(String str) {
        C4828a a = C4828a.m22256a();
        if (a != null) {
            for (C4826a next : a.mo20111b()) {
                if (this.f21758a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo20164a(str, this.f21760c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4843b.m22334b(this.f21759b, this.f21761d.mo20210b())) {
            return null;
        }
        this.f21761d.mo20209a(this.f21759b);
        return this.f21759b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22437b(str);
        }
        super.onPostExecute(str);
    }
}
