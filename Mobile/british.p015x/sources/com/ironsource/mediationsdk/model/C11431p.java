package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C11483b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.p */
public final class C11431p {

    /* renamed from: a */
    public ArrayList<Placement> f51424a;

    /* renamed from: b */
    public C11417c f51425b;

    /* renamed from: c */
    public int f51426c;

    /* renamed from: d */
    public boolean f51427d;

    /* renamed from: e */
    public int f51428e;

    /* renamed from: f */
    public String f51429f;

    /* renamed from: g */
    public String f51430g;

    /* renamed from: h */
    public int f51431h;

    /* renamed from: i */
    public int f51432i;

    /* renamed from: j */
    public int f51433j;

    /* renamed from: k */
    public Placement f51434k;

    /* renamed from: l */
    public C11483b f51435l;

    public C11431p() {
        this.f51424a = new ArrayList<>();
        this.f51425b = new C11417c();
    }

    public C11431p(int i, boolean z, int i2, int i3, int i4, C11417c cVar, C11483b bVar, int i5) {
        this.f51424a = new ArrayList<>();
        this.f51426c = i;
        this.f51427d = z;
        this.f51428e = i2;
        this.f51431h = i3;
        this.f51425b = cVar;
        this.f51432i = i4;
        this.f51435l = bVar;
        this.f51433j = i5;
    }

    /* renamed from: a */
    public final Placement mo44446a() {
        Iterator<Placement> it = this.f51424a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f51434k;
    }
}
