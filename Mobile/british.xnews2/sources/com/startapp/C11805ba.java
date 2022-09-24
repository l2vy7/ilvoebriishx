package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.StaleDcConfig;

/* renamed from: com.startapp.ba */
/* compiled from: Sta */
public class C11805ba extends C11896f2<C11788aa> {

    /* renamed from: e */
    public final C5069e f52630e;

    /* renamed from: f */
    public final C12462z2<StaleDcConfig> f52631f;

    public C11805ba(Context context, C5069e eVar, C12462z2<StaleDcConfig> z2Var) {
        super(context, 86400000);
        this.f52630e = eVar;
        this.f52631f = z2Var;
    }

    /* renamed from: a */
    public Object mo45173a(boolean z) {
        C11788aa aaVar = new C11788aa();
        String str = null;
        if (!z) {
            str = this.f52630e.getString("a83b59c2138cbf65", (String) null);
        }
        if (str == null) {
            Context context = this.f52927a;
            context.getPackageName();
            str = C5015nb.m22925b(context);
            C5069e.C5070a a = this.f52630e.edit();
            a.mo21101a("a83b59c2138cbf65", str);
            a.f22385a.putString("a83b59c2138cbf65", str);
            a.apply();
        }
        aaVar.f52588a = str;
        return aaVar;
    }

    /* renamed from: c */
    public Object mo45174c() {
        return new C11788aa();
    }
}
