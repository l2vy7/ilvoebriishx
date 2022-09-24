package com.iab.omid.library.adcolony.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p042b.C4828a;
import com.iab.omid.library.adcolony.p042b.C4831c;
import com.iab.omid.library.adcolony.p044d.C4848f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
public class C4858a {

    /* renamed from: a */
    private final HashMap<View, String> f21748a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C4859a> f21749b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f21750c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f21751d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f21752e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f21753f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f21754g = new HashMap<>();

    /* renamed from: h */
    private boolean f21755h;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a */
    public static class C4859a {

        /* renamed from: a */
        private final C4831c f21756a;

        /* renamed from: b */
        private final ArrayList<String> f21757b = new ArrayList<>();

        public C4859a(C4831c cVar, String str) {
            this.f21756a = cVar;
            mo20202a(str);
        }

        /* renamed from: a */
        public C4831c mo20201a() {
            return this.f21756a;
        }

        /* renamed from: a */
        public void mo20202a(String str) {
            this.f21757b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> mo20203b() {
            return this.f21757b;
        }
    }

    /* renamed from: a */
    private void m22408a(C4826a aVar) {
        for (C4831c a : aVar.mo20075a()) {
            m22409a(a, aVar);
        }
    }

    /* renamed from: a */
    private void m22409a(C4831c cVar, C4826a aVar) {
        View view = (View) cVar.mo20121a().get();
        if (view != null) {
            C4859a aVar2 = this.f21749b.get(view);
            if (aVar2 != null) {
                aVar2.mo20202a(aVar.getAdSessionId());
            } else {
                this.f21749b.put(view, new C4859a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    /* renamed from: d */
    private String m22410d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = C4848f.m22359e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f21751d.addAll(hashSet);
        return null;
    }

    /* renamed from: a */
    public String mo20191a(View view) {
        if (this.f21748a.size() == 0) {
            return null;
        }
        String str = this.f21748a.get(view);
        if (str != null) {
            this.f21748a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String mo20192a(String str) {
        return this.f21754g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> mo20193a() {
        return this.f21752e;
    }

    /* renamed from: b */
    public View mo20194b(String str) {
        return this.f21750c.get(str);
    }

    /* renamed from: b */
    public C4859a mo20195b(View view) {
        C4859a aVar = this.f21749b.get(view);
        if (aVar != null) {
            this.f21749b.remove(view);
        }
        return aVar;
    }

    /* renamed from: b */
    public HashSet<String> mo20196b() {
        return this.f21753f;
    }

    /* renamed from: c */
    public C4869c mo20197c(View view) {
        return this.f21751d.contains(view) ? C4869c.PARENT_VIEW : this.f21755h ? C4869c.OBSTRUCTION_VIEW : C4869c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo20198c() {
        C4828a a = C4828a.m22256a();
        if (a != null) {
            for (C4826a next : a.mo20113c()) {
                View d = next.mo20079d();
                if (next.mo20080e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d != null) {
                        String d2 = m22410d(d);
                        if (d2 == null) {
                            this.f21752e.add(adSessionId);
                            this.f21748a.put(d, adSessionId);
                            m22408a(next);
                        } else {
                            this.f21753f.add(adSessionId);
                            this.f21750c.put(adSessionId, d);
                            this.f21754g.put(adSessionId, d2);
                        }
                    } else {
                        this.f21753f.add(adSessionId);
                        this.f21754g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo20199d() {
        this.f21748a.clear();
        this.f21749b.clear();
        this.f21750c.clear();
        this.f21751d.clear();
        this.f21752e.clear();
        this.f21753f.clear();
        this.f21754g.clear();
        this.f21755h = false;
    }

    /* renamed from: e */
    public void mo20200e() {
        this.f21755h = true;
    }
}
