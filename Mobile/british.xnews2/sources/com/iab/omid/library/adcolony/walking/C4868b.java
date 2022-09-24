package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.p046a.C4861b;
import com.iab.omid.library.adcolony.walking.p046a.C4864c;
import com.iab.omid.library.adcolony.walking.p046a.C4865d;
import com.iab.omid.library.adcolony.walking.p046a.C4866e;
import com.iab.omid.library.adcolony.walking.p046a.C4867f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
public class C4868b implements C4861b.C4863b {

    /* renamed from: a */
    private JSONObject f21767a;

    /* renamed from: b */
    private final C4864c f21768b;

    public C4868b(C4864c cVar) {
        this.f21768b = cVar;
    }

    /* renamed from: a */
    public void mo20218a() {
        this.f21768b.mo20211b(new C4865d(this));
    }

    /* renamed from: a */
    public void mo20209a(JSONObject jSONObject) {
        this.f21767a = jSONObject;
    }

    /* renamed from: a */
    public void mo20219a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21768b.mo20211b(new C4867f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo20210b() {
        return this.f21767a;
    }

    /* renamed from: b */
    public void mo20220b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21768b.mo20211b(new C4866e(this, hashSet, jSONObject, j));
    }
}
