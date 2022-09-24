package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.p048b.C4878a;
import com.iab.omid.library.ironsrc.p048b.C4881c;
import com.iab.omid.library.ironsrc.p050d.C4898f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
public class C4908a {

    /* renamed from: a */
    private final HashMap<View, String> f21862a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4909a> f21863b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f21864c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f21865d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f21866e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f21867f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f21868g = new HashMap<>();

    /* renamed from: h */
    private boolean f21869h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    public static class C4909a {

        /* renamed from: a */
        private final C4881c f21870a;

        /* renamed from: b */
        private final ArrayList<String> f21871b = new ArrayList<>();

        public C4909a(C4881c cVar, String str) {
            this.f21870a = cVar;
            mo20388a(str);
        }

        /* renamed from: a */
        public C4881c mo20387a() {
            return this.f21870a;
        }

        /* renamed from: a */
        public void mo20388a(String str) {
            this.f21871b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo20389b() {
            return this.f21871b;
        }
    }

    /* renamed from: a */
    private void m22629a(C4876a aVar) {
        for (C4881c a : aVar.mo20261a()) {
            m22630a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22630a(C4881c cVar, C4876a aVar) {
        View view = (View) cVar.mo20307a().get();
        if (view != null) {
            C4909a aVar2 = this.f21863b.get(view);
            if (aVar2 != null) {
                aVar2.mo20388a(aVar.getAdSessionId());
            } else {
                this.f21863b.put(view, new C4909a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22631d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4898f.m22580e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f21865d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo20377a(View view) {
        if (this.f21862a.size() == 0) {
            return null;
        }
        String str = this.f21862a.get(view);
        if (str != null) {
            this.f21862a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo20378a(String str) {
        return this.f21868g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo20379a() {
        return this.f21866e;
    }

    /* renamed from: b */
    public View mo20380b(String str) {
        return this.f21864c.get(str);
    }

    /* renamed from: b */
    public C4909a mo20381b(View view) {
        C4909a aVar = this.f21863b.get(view);
        if (aVar != null) {
            this.f21863b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo20382b() {
        return this.f21867f;
    }

    /* renamed from: c */
    public C4919c mo20383c(View view) {
        return this.f21865d.contains(view) ? C4919c.PARENT_VIEW : this.f21869h ? C4919c.OBSTRUCTION_VIEW : C4919c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo20384c() {
        C4878a a = C4878a.m22477a();
        if (a != null) {
            for (C4876a next : a.mo20299c()) {
                View d = next.mo20265d();
                if (next.mo20266e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22631d(d);
                        if (d2 == null) {
                            this.f21866e.add(adSessionId);
                            this.f21862a.put(d, adSessionId);
                            m22629a(next);
                        } else {
                            this.f21867f.add(adSessionId);
                            this.f21864c.put(adSessionId, d);
                            this.f21868g.put(adSessionId, d2);
                        }
                    } else {
                        this.f21867f.add(adSessionId);
                        this.f21868g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo20385d() {
        this.f21862a.clear();
        this.f21863b.clear();
        this.f21864c.clear();
        this.f21865d.clear();
        this.f21866e.clear();
        this.f21867f.clear();
        this.f21868g.clear();
        this.f21869h = false;
    }

    /* renamed from: e */
    public void mo20386e() {
        this.f21869h = true;
    }
}
