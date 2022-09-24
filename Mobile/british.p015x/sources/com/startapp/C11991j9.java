package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.j9 */
/* compiled from: Sta */
public class C11991j9 extends C12344t7<String> implements C12128p7 {

    /* renamed from: j */
    public final C5001b2 f53171j;

    /* renamed from: k */
    public final C12462z2<SensorsConfig> f53172k;

    public C11991j9(Context context, C5069e eVar, C5001b2 b2Var, C12071n3 n3Var, C12462z2<SensorsConfig> z2Var) {
        super(context, eVar, n3Var, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        this.f53171j = b2Var;
        this.f53172k = z2Var;
    }

    /* renamed from: a */
    public Object mo45391a(String str) {
        return str;
    }

    /* renamed from: a */
    public void mo45392a(Object obj) {
        mo46638b(obj != null ? obj.toString() : null);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo45174c() {
        return "";
    }

    /* renamed from: d */
    public long mo45393d() {
        SensorsConfig call = this.f53172k.call();
        if (call != null) {
            return call.mo46412h();
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo45394f() {
        SensorsConfig call;
        if (!this.f53171j.mo20655c() || (call = this.f53172k.call()) == null || !call.mo46417l()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo45395g() {
        Context context = this.f52927a;
        ComponentLocator.m23305a(context).mo21223j().execute(new C12025l3(context, this).f54866d);
    }
}
