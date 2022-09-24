package com.iab.omid.library.adcolony.p043b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p042a.C4822b;
import com.iab.omid.library.adcolony.p042a.C4823c;
import com.iab.omid.library.adcolony.p042a.C4824d;
import com.iab.omid.library.adcolony.p042a.C4825e;
import com.iab.omid.library.adcolony.p043b.C4829b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

/* renamed from: com.iab.omid.library.adcolony.b.f */
public class C4835f implements C4823c, C4829b.C4830a {

    /* renamed from: f */
    private static C4835f f21699f;

    /* renamed from: a */
    private float f21700a = 0.0f;

    /* renamed from: b */
    private final C4825e f21701b;

    /* renamed from: c */
    private final C4822b f21702c;

    /* renamed from: d */
    private C4824d f21703d;

    /* renamed from: e */
    private C4828a f21704e;

    public C4835f(C4825e eVar, C4822b bVar) {
        this.f21701b = eVar;
        this.f21702c = bVar;
    }

    /* renamed from: a */
    public static C4835f m22294a() {
        if (f21699f == null) {
            f21699f = new C4835f(new C4825e(), new C4822b());
        }
        return f21699f;
    }

    /* renamed from: e */
    private C4828a m22295e() {
        if (this.f21704e == null) {
            this.f21704e = C4828a.m22256a();
        }
        return this.f21704e;
    }

    /* renamed from: a */
    public void mo20037a(float f) {
        this.f21700a = f;
        for (C4826a adSessionStatePublisher : m22295e().mo20113c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo20155a(f);
        }
    }

    /* renamed from: a */
    public void mo20144a(Context context) {
        this.f21703d = this.f21701b.mo20041a(new Handler(), context, this.f21702c.mo20036a(), this);
    }

    /* renamed from: b */
    public void mo20145b() {
        C4829b.m22263a().mo20117a((C4829b.C4830a) this);
        C4829b.m22263a().mo20118b();
        if (C4829b.m22263a().mo20120d()) {
            TreeWalker.getInstance().mo20180a();
        }
        this.f21703d.mo20038a();
    }

    /* renamed from: c */
    public void mo20146c() {
        TreeWalker.getInstance().mo20182b();
        C4829b.m22263a().mo20119c();
        this.f21703d.mo20039b();
    }

    /* renamed from: d */
    public float mo20147d() {
        return this.f21700a;
    }
}
