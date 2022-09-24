package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C11483b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.i */
public final class C11423i {

    /* renamed from: a */
    public ArrayList<InterstitialPlacement> f51382a;

    /* renamed from: b */
    public C11417c f51383b;

    /* renamed from: c */
    public int f51384c;

    /* renamed from: d */
    public boolean f51385d;

    /* renamed from: e */
    public int f51386e;

    /* renamed from: f */
    public int f51387f;

    /* renamed from: g */
    public String f51388g;

    /* renamed from: h */
    public String f51389h;

    /* renamed from: i */
    public C11483b f51390i;

    /* renamed from: j */
    public InterstitialPlacement f51391j;

    public C11423i() {
        this.f51382a = new ArrayList<>();
        this.f51383b = new C11417c();
    }

    public C11423i(int i, boolean z, int i2, C11417c cVar, C11483b bVar, int i3) {
        this.f51382a = new ArrayList<>();
        this.f51384c = i;
        this.f51385d = z;
        this.f51386e = i2;
        this.f51383b = cVar;
        this.f51390i = bVar;
        this.f51387f = i3;
    }

    /* renamed from: a */
    public final InterstitialPlacement mo44433a() {
        Iterator<InterstitialPlacement> it = this.f51382a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f51391j;
    }
}
