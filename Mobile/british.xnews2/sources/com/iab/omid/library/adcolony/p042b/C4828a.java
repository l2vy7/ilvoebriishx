package com.iab.omid.library.adcolony.p042b;

import com.iab.omid.library.adcolony.adsession.C4826a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.a */
public class C4828a {

    /* renamed from: c */
    private static C4828a f21681c = new C4828a();

    /* renamed from: a */
    private final ArrayList<C4826a> f21682a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C4826a> f21683b = new ArrayList<>();

    private C4828a() {
    }

    /* renamed from: a */
    public static C4828a m22256a() {
        return f21681c;
    }

    /* renamed from: a */
    public void mo20110a(C4826a aVar) {
        this.f21682a.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4826a> mo20111b() {
        return Collections.unmodifiableCollection(this.f21682a);
    }

    /* renamed from: b */
    public void mo20112b(C4826a aVar) {
        boolean d = mo20115d();
        this.f21683b.add(aVar);
        if (!d) {
            C4835f.m22294a().mo20145b();
        }
    }

    /* renamed from: c */
    public Collection<C4826a> mo20113c() {
        return Collections.unmodifiableCollection(this.f21683b);
    }

    /* renamed from: c */
    public void mo20114c(C4826a aVar) {
        boolean d = mo20115d();
        this.f21682a.remove(aVar);
        this.f21683b.remove(aVar);
        if (d && !mo20115d()) {
            C4835f.m22294a().mo20146c();
        }
    }

    /* renamed from: d */
    public boolean mo20115d() {
        return this.f21683b.size() > 0;
    }
}
