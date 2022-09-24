package com.google.ads.interactivemedia.p039v3.internal;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bq */
/* compiled from: IMASDK */
public final class C3889bq {

    /* renamed from: a */
    private final HashMap<View, String> f16773a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C3888bp> f16774b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f16775c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f16776d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f16777e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f16778f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f16779g = new HashMap<>();

    /* renamed from: h */
    private boolean f16780h;

    /* renamed from: a */
    public final HashSet<String> mo15580a() {
        return this.f16777e;
    }

    /* renamed from: b */
    public final HashSet<String> mo15581b() {
        return this.f16778f;
    }

    /* renamed from: c */
    public final String mo15582c(String str) {
        return this.f16779g.get(str);
    }

    /* renamed from: d */
    public final void mo15583d() {
        C3855aw a = C3855aw.m14982a();
        if (a != null) {
            for (C3846ap next : a.mo14652f()) {
                View j = next.mo14173j();
                if (next.mo14174k()) {
                    String i = next.mo14172i();
                    if (j != null) {
                        String str = null;
                        if (!j.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = j;
                            while (true) {
                                if (view == null) {
                                    this.f16776d.addAll(hashSet);
                                    break;
                                }
                                String e = C4130ko.m17749e(view);
                                if (e != null) {
                                    str = e;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            this.f16777e.add(i);
                            this.f16773a.put(j, i);
                            for (C3871az next2 : next.mo14170g()) {
                                View view2 = (View) next2.mo14777d().get();
                                if (view2 != null) {
                                    C3888bp bpVar = this.f16774b.get(view2);
                                    if (bpVar != null) {
                                        bpVar.mo15577a(next.mo14172i());
                                    } else {
                                        this.f16774b.put(view2, new C3888bp(next2, next.mo14172i()));
                                    }
                                }
                            }
                        } else {
                            this.f16778f.add(i);
                            this.f16775c.put(i, j);
                            this.f16779g.put(i, str);
                        }
                    } else {
                        this.f16778f.add(i);
                        this.f16779g.put(i, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo15584e() {
        this.f16773a.clear();
        this.f16774b.clear();
        this.f16775c.clear();
        this.f16776d.clear();
        this.f16777e.clear();
        this.f16778f.clear();
        this.f16779g.clear();
        this.f16780h = false;
    }

    /* renamed from: f */
    public final void mo15585f() {
        this.f16780h = true;
    }

    /* renamed from: g */
    public final String mo15586g(View view) {
        if (this.f16773a.size() == 0) {
            return null;
        }
        String str = this.f16773a.get(view);
        if (str != null) {
            this.f16773a.remove(view);
        }
        return str;
    }

    /* renamed from: h */
    public final View mo15587h(String str) {
        return this.f16775c.get(str);
    }

    /* renamed from: i */
    public final C3888bp mo15588i(View view) {
        C3888bp bpVar = this.f16774b.get(view);
        if (bpVar != null) {
            this.f16774b.remove(view);
        }
        return bpVar;
    }

    /* renamed from: j */
    public final int mo15589j(View view) {
        if (this.f16776d.contains(view)) {
            return 1;
        }
        return this.f16780h ? 2 : 3;
    }
}
