package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C11483b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.f */
public final class C11420f {

    /* renamed from: a */
    public C11417c f51369a;

    /* renamed from: b */
    public long f51370b;

    /* renamed from: c */
    public ArrayList<C11421g> f51371c;

    /* renamed from: d */
    public C11421g f51372d;

    /* renamed from: e */
    public int f51373e;

    /* renamed from: f */
    public int f51374f;

    /* renamed from: g */
    public C11483b f51375g;

    /* renamed from: h */
    private int f51376h;

    public C11420f() {
        this.f51369a = new C11417c();
        this.f51371c = new ArrayList<>();
    }

    public C11420f(int i, long j, C11417c cVar, int i2, C11483b bVar, int i3) {
        this.f51371c = new ArrayList<>();
        this.f51376h = i;
        this.f51370b = j;
        this.f51369a = cVar;
        this.f51373e = i2;
        this.f51374f = i3;
        this.f51375g = bVar;
    }

    /* renamed from: a */
    public final C11421g mo44430a() {
        Iterator<C11421g> it = this.f51371c.iterator();
        while (it.hasNext()) {
            C11421g next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f51372d;
    }

    /* renamed from: a */
    public final C11421g mo44431a(String str) {
        Iterator<C11421g> it = this.f51371c.iterator();
        while (it.hasNext()) {
            C11421g next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
