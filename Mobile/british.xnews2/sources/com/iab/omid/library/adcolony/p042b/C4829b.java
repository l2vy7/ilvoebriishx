package com.iab.omid.library.adcolony.p042b;

import android.annotation.SuppressLint;
import android.content.Context;
import com.iab.omid.library.adcolony.adsession.C4826a;

/* renamed from: com.iab.omid.library.adcolony.b.b */
public class C4829b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    private static C4829b f21684e = new C4829b();

    /* renamed from: a */
    private Context f21685a;

    /* renamed from: b */
    private boolean f21686b;

    /* renamed from: c */
    private boolean f21687c;

    /* renamed from: d */
    private C4830a f21688d;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    public interface C4830a {
    }

    private C4829b() {
    }

    /* renamed from: a */
    public static C4829b m22263a() {
        return f21684e;
    }

    /* renamed from: e */
    private void m22264e() {
        boolean z = !this.f21687c;
        for (C4826a adSessionStatePublisher : C4828a.m22256a().mo20111b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo20167a(z);
        }
    }

    /* renamed from: a */
    public void mo20116a(Context context) {
        this.f21685a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo20117a(C4830a aVar) {
        this.f21688d = aVar;
    }

    /* renamed from: b */
    public void mo20118b() {
        this.f21686b = true;
        m22264e();
    }

    /* renamed from: c */
    public void mo20119c() {
        this.f21686b = false;
        this.f21687c = false;
        this.f21688d = null;
    }

    /* renamed from: d */
    public boolean mo20120d() {
        return !this.f21687c;
    }
}
