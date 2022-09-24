package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.p052a.C4911b;
import com.iab.omid.library.ironsrc.walking.p052a.C4914c;
import com.iab.omid.library.ironsrc.walking.p052a.C4915d;
import com.iab.omid.library.ironsrc.walking.p052a.C4916e;
import com.iab.omid.library.ironsrc.walking.p052a.C4917f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
public class C4918b implements C4911b.C4913b {

    /* renamed from: a */
    private JSONObject f21881a;

    /* renamed from: b */
    private final C4914c f21882b;

    public C4918b(C4914c cVar) {
        this.f21882b = cVar;
    }

    /* renamed from: a */
    public void mo20404a() {
        this.f21882b.mo20397b(new C4915d(this));
    }

    /* renamed from: a */
    public void mo20395a(JSONObject jSONObject) {
        this.f21881a = jSONObject;
    }

    /* renamed from: a */
    public void mo20405a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21882b.mo20397b(new C4917f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo20396b() {
        return this.f21881a;
    }

    /* renamed from: b */
    public void mo20406b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21882b.mo20397b(new C4916e(this, hashSet, jSONObject, j));
    }
}
