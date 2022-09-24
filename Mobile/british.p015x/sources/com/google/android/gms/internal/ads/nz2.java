package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nz2 {

    /* renamed from: a */
    private final HashMap<View, String> f36198a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, mz2> f36199b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f36200c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f36201d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f36202e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f36203f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f36204g = new HashMap<>();

    /* renamed from: h */
    private boolean f36205h;

    /* renamed from: a */
    public final View mo33814a(String str) {
        return this.f36200c.get(str);
    }

    /* renamed from: b */
    public final mz2 mo33815b(View view) {
        mz2 mz2 = this.f36199b.get(view);
        if (mz2 != null) {
            this.f36199b.remove(view);
        }
        return mz2;
    }

    /* renamed from: c */
    public final String mo33816c(String str) {
        return this.f36204g.get(str);
    }

    /* renamed from: d */
    public final String mo33817d(View view) {
        if (this.f36198a.size() == 0) {
            return null;
        }
        String str = this.f36198a.get(view);
        if (str != null) {
            this.f36198a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet<String> mo33818e() {
        return this.f36203f;
    }

    /* renamed from: f */
    public final HashSet<String> mo33819f() {
        return this.f36202e;
    }

    /* renamed from: g */
    public final void mo33820g() {
        this.f36198a.clear();
        this.f36199b.clear();
        this.f36200c.clear();
        this.f36201d.clear();
        this.f36202e.clear();
        this.f36203f.clear();
        this.f36204g.clear();
        this.f36205h = false;
    }

    /* renamed from: h */
    public final void mo33821h() {
        this.f36205h = true;
    }

    /* renamed from: i */
    public final void mo33822i() {
        qy2 a = qy2.m36822a();
        if (a != null) {
            for (fy2 next : a.mo34440b()) {
                View f = next.mo31961f();
                if (next.mo31965j()) {
                    String h = next.mo31963h();
                    if (f != null) {
                        String str = null;
                        if (!f.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = f;
                            while (true) {
                                if (view == null) {
                                    this.f36201d.addAll(hashSet);
                                    break;
                                }
                                String b = lz2.m34627b(view);
                                if (b != null) {
                                    str = b;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            this.f36202e.add(h);
                            this.f36198a.put(f, h);
                            for (ty2 next2 : next.mo31964i()) {
                                View view2 = (View) next2.mo35073b().get();
                                if (view2 != null) {
                                    mz2 mz2 = this.f36199b.get(view2);
                                    if (mz2 != null) {
                                        mz2.mo33619c(next.mo31963h());
                                    } else {
                                        this.f36199b.put(view2, new mz2(next2, next.mo31963h()));
                                    }
                                }
                            }
                        } else {
                            this.f36203f.add(h);
                            this.f36200c.put(h, f);
                            this.f36204g.put(h, str);
                        }
                    } else {
                        this.f36203f.add(h);
                        this.f36204g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo33823j(View view) {
        if (this.f36201d.contains(view)) {
            return 1;
        }
        return this.f36205h ? 2 : 3;
    }
}
