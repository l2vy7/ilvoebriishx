package com.startapp;

import android.provider.Settings;
import android.view.View;
import com.iab.omid.library.startio.adsession.AdSessionContextType;
import com.iab.omid.library.startio.adsession.Owner;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.startapp.id */
/* compiled from: Sta */
public class C11972id extends C12039m {

    /* renamed from: k */
    public static final Pattern f53123k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C12101o f53124a;

    /* renamed from: b */
    public final C12063n f53125b;

    /* renamed from: c */
    public final List<C12456yd> f53126c = new ArrayList();

    /* renamed from: d */
    public C12116od f53127d;

    /* renamed from: e */
    public AdSessionStatePublisher f53128e;

    /* renamed from: f */
    public boolean f53129f = false;

    /* renamed from: g */
    public boolean f53130g = false;

    /* renamed from: h */
    public final String f53131h;

    /* renamed from: i */
    public boolean f53132i;

    /* renamed from: j */
    public boolean f53133j;

    public C11972id(C12063n nVar, C12101o oVar) {
        this.f53125b = nVar;
        this.f53124a = oVar;
        this.f53131h = UUID.randomUUID().toString();
        mo45458a((View) null);
        this.f53128e = (oVar.mo45631a() == AdSessionContextType.HTML || oVar.mo45631a() == AdSessionContextType.JAVASCRIPT) ? new C11999jd(oVar.mo45634d()) : new C12151qd(oVar.mo45632b(), oVar.mo45633c());
        this.f53128e.mo20422d();
        C11931gd.m52358a().mo45386a(this);
        this.f53128e.mo20417a(nVar);
    }

    /* renamed from: a */
    public void mo45457a() {
        if (!this.f53129f) {
            this.f53129f = true;
            C11931gd gdVar = C11931gd.f53013c;
            boolean b = gdVar.mo45387b();
            gdVar.f53015b.add(this);
            if (!b) {
                C12117oe a = C12117oe.m52725a();
                a.getClass();
                C12170rd rdVar = C12170rd.f54116d;
                rdVar.f54119c = a;
                rdVar.f54117a = true;
                rdVar.f54118b = false;
                rdVar.mo45730a();
                C12471za.f55206h.mo46860a();
                C11932ge geVar = a.f53988d;
                geVar.f53020e = geVar.mo45388a();
                geVar.mo45389b();
                geVar.f53016a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, geVar);
            }
            float f = C12117oe.m52725a().f53985a;
            AdSessionStatePublisher adSessionStatePublisher = this.f53128e;
            C11973ie.f53134a.mo45464a(adSessionStatePublisher.mo20421c(), "setDeviceVolume", Float.valueOf(f));
            this.f53128e.mo20415a(this, this.f53124a);
        }
    }

    /* renamed from: a */
    public final void mo45458a(View view) {
        this.f53127d = new C12116od((View) null);
    }

    /* renamed from: b */
    public View mo45459b() {
        return (View) this.f53127d.get();
    }

    /* renamed from: c */
    public boolean mo45460c() {
        return this.f53129f && !this.f53130g;
    }

    /* renamed from: d */
    public boolean mo45461d() {
        return Owner.NATIVE == this.f53125b.f53308a;
    }

    /* renamed from: e */
    public boolean mo45462e() {
        return Owner.NATIVE == this.f53125b.f53309b;
    }
}
