package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p150t.C6090g;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tm1 {

    /* renamed from: h */
    public static final tm1 f39461h = new tm1(new rm1());

    /* renamed from: a */
    private final s40 f39462a;

    /* renamed from: b */
    private final p40 f39463b;

    /* renamed from: c */
    private final f50 f39464c;

    /* renamed from: d */
    private final c50 f39465d;

    /* renamed from: e */
    private final r90 f39466e;

    /* renamed from: f */
    private final C6090g<String, y40> f39467f;

    /* renamed from: g */
    private final C6090g<String, v40> f39468g;

    private tm1(rm1 rm1) {
        this.f39462a = rm1.f38723a;
        this.f39463b = rm1.f38724b;
        this.f39464c = rm1.f38725c;
        this.f39467f = new C6090g<>(rm1.f38728f);
        this.f39468g = new C6090g<>(rm1.f38729g);
        this.f39465d = rm1.f38726d;
        this.f39466e = rm1.f38727e;
    }

    /* renamed from: a */
    public final p40 mo34979a() {
        return this.f39463b;
    }

    /* renamed from: b */
    public final s40 mo34980b() {
        return this.f39462a;
    }

    /* renamed from: c */
    public final v40 mo34981c(String str) {
        return this.f39468g.get(str);
    }

    /* renamed from: d */
    public final y40 mo34982d(String str) {
        return this.f39467f.get(str);
    }

    /* renamed from: e */
    public final c50 mo34983e() {
        return this.f39465d;
    }

    /* renamed from: f */
    public final f50 mo34984f() {
        return this.f39464c;
    }

    /* renamed from: g */
    public final r90 mo34985g() {
        return this.f39466e;
    }

    /* renamed from: h */
    public final ArrayList<String> mo34986h() {
        ArrayList<String> arrayList = new ArrayList<>(this.f39467f.size());
        for (int i = 0; i < this.f39467f.size(); i++) {
            arrayList.add(this.f39467f.mo23390j(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList<String> mo34987i() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f39464c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f39462a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f39463b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f39467f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f39466e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
