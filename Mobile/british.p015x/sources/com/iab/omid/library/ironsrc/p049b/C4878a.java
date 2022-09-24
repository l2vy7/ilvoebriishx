package com.iab.omid.library.ironsrc.p049b;

import com.iab.omid.library.ironsrc.adsession.C4876a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.b.a */
public class C4878a {

    /* renamed from: a */
    private static C4878a f21795a = new C4878a();

    /* renamed from: b */
    private final ArrayList<C4876a> f21796b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4876a> f21797c = new ArrayList<>();

    private C4878a() {
    }

    /* renamed from: a */
    public static C4878a m22477a() {
        return f21795a;
    }

    /* renamed from: a */
    public void mo20296a(C4876a aVar) {
        this.f21796b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4876a> mo20297b() {
        return Collections.unmodifiableCollection(this.f21796b);
    }

    /* renamed from: b */
    public void mo20298b(C4876a aVar) {
        boolean d = mo20301d();
        this.f21797c.add(aVar);
        if (!d) {
            C4885f.m22515a().mo20331b();
        }
    }

    /* renamed from: c */
    public Collection<C4876a> mo20299c() {
        return Collections.unmodifiableCollection(this.f21797c);
    }

    /* renamed from: c */
    public void mo20300c(C4876a aVar) {
        boolean d = mo20301d();
        this.f21796b.remove(aVar);
        this.f21797c.remove(aVar);
        if (d && !mo20301d()) {
            C4885f.m22515a().mo20332c();
        }
    }

    /* renamed from: d */
    public boolean mo20301d() {
        return this.f21797c.size() > 0;
    }
}
