package com.iab.omid.library.ironsrc.p048b;

import android.annotation.SuppressLint;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C4876a;

/* renamed from: com.iab.omid.library.ironsrc.b.b */
public class C4879b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C4879b f21798a = new C4879b();

    /* renamed from: b */
    private Context f21799b;

    /* renamed from: c */
    private boolean f21800c;

    /* renamed from: d */
    private boolean f21801d;

    /* renamed from: e */
    private C4880a f21802e;

    /* renamed from: com.iab.omid.library.ironsrc.b.b$a */
    public interface C4880a {
    }

    private C4879b() {
    }

    /* renamed from: a */
    public static C4879b m22484a() {
        return f21798a;
    }

    /* renamed from: e */
    private void m22485e() {
        boolean z = !this.f21801d;
        for (C4876a adSessionStatePublisher : C4878a.m22477a().mo20297b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo20353a(z);
        }
    }

    /* renamed from: a */
    public void mo20302a(Context context) {
        this.f21799b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo20303a(C4880a aVar) {
        this.f21802e = aVar;
    }

    /* renamed from: b */
    public void mo20304b() {
        this.f21800c = true;
        m22485e();
    }

    /* renamed from: c */
    public void mo20305c() {
        this.f21800c = false;
        this.f21801d = false;
        this.f21802e = null;
    }

    /* renamed from: d */
    public boolean mo20306d() {
        return !this.f21801d;
    }
}
