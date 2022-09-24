package com.startapp;

import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.startapp.s5 */
/* compiled from: Sta */
public class C12178s5 {

    /* renamed from: a */
    public C11818c4 f54140a = new C11818c4();

    /* renamed from: b */
    public List<C12142q5> f54141b;

    /* renamed from: c */
    public String f54142c = "";

    /* renamed from: a */
    public void mo45747a(AdDetails adDetails) {
        C12142q5 q5Var = new C12142q5(adDetails);
        this.f54141b.add(q5Var);
        this.f54140a.mo45194a(this.f54141b.size() - 1, q5Var.f54052a, q5Var.f54060i);
    }

    /* renamed from: a */
    public void mo45745a() {
        for (C11868d9 next : this.f54140a.f52654a.values()) {
            if (next != null) {
                next.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public void mo45746a(C12030l7 l7Var, boolean z) {
        C11818c4 c4Var = this.f54140a;
        c4Var.f52657d = l7Var;
        if (z) {
            c4Var.f52656c.clear();
            c4Var.f52658e = 0;
            c4Var.f52659f.clear();
            HashMap<String, C11868d9> hashMap = c4Var.f52654a;
            if (hashMap != null) {
                for (C11868d9 next : hashMap.values()) {
                    if (next != null) {
                        next.mo45303a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                }
                c4Var.f52654a.clear();
            }
        }
    }
}
