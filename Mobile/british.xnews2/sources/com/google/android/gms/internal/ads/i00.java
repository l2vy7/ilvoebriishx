package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class i00 {

    /* renamed from: a */
    private final Collection<h00<?>> f33008a = new ArrayList();

    /* renamed from: b */
    private final Collection<h00<String>> f33009b = new ArrayList();

    /* renamed from: c */
    private final Collection<h00<String>> f33010c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo32512a() {
        ArrayList arrayList = new ArrayList();
        for (h00<String> b : this.f33009b) {
            String str = (String) C8311wv.m39277c().mo18570b(b);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(q00.m36265a());
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo32513b() {
        List<String> a = mo32512a();
        for (h00<String> b : this.f33010c) {
            String str = (String) C8311wv.m39277c().mo18570b(b);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(q00.m36266b());
        return a;
    }

    /* renamed from: c */
    public final void mo32514c(h00<String> h00) {
        this.f33009b.add(h00);
    }

    /* renamed from: d */
    public final void mo32515d(h00 h00) {
        this.f33008a.add(h00);
    }

    /* renamed from: e */
    public final void mo32516e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (h00 next : this.f33008a) {
            if (next.mo32310e() == 1) {
                next.mo30277d(editor, next.mo30274a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            co0.zzg("Flag Json is null.");
        }
    }
}
