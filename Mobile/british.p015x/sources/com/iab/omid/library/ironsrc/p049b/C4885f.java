package com.iab.omid.library.ironsrc.p049b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.p048a.C4872b;
import com.iab.omid.library.ironsrc.p048a.C4873c;
import com.iab.omid.library.ironsrc.p048a.C4874d;
import com.iab.omid.library.ironsrc.p048a.C4875e;
import com.iab.omid.library.ironsrc.p049b.C4879b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* renamed from: com.iab.omid.library.ironsrc.b.f */
public class C4885f implements C4873c, C4879b.C4880a {

    /* renamed from: a */
    private static C4885f f21813a;

    /* renamed from: b */
    private float f21814b = 0.0f;

    /* renamed from: c */
    private final C4875e f21815c;

    /* renamed from: d */
    private final C4872b f21816d;

    /* renamed from: e */
    private C4874d f21817e;

    /* renamed from: f */
    private C4878a f21818f;

    public C4885f(C4875e eVar, C4872b bVar) {
        this.f21815c = eVar;
        this.f21816d = bVar;
    }

    /* renamed from: a */
    public static C4885f m22515a() {
        if (f21813a == null) {
            f21813a = new C4885f(new C4875e(), new C4872b());
        }
        return f21813a;
    }

    /* renamed from: e */
    private C4878a m22516e() {
        if (this.f21818f == null) {
            this.f21818f = C4878a.m22477a();
        }
        return this.f21818f;
    }

    /* renamed from: a */
    public void mo20223a(float f) {
        this.f21814b = f;
        for (C4876a adSessionStatePublisher : m22516e().mo20299c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo20341a(f);
        }
    }

    /* renamed from: a */
    public void mo20330a(Context context) {
        this.f21817e = this.f21815c.mo20227a(new Handler(), context, this.f21816d.mo20222a(), this);
    }

    /* renamed from: b */
    public void mo20331b() {
        C4879b.m22484a().mo20303a((C4879b.C4880a) this);
        C4879b.m22484a().mo20304b();
        if (C4879b.m22484a().mo20306d()) {
            TreeWalker.getInstance().mo20366a();
        }
        this.f21817e.mo20224a();
    }

    /* renamed from: c */
    public void mo20332c() {
        TreeWalker.getInstance().mo20368b();
        C4879b.m22484a().mo20305c();
        this.f21817e.mo20225b();
    }

    /* renamed from: d */
    public float mo20333d() {
        return this.f21814b;
    }
}
