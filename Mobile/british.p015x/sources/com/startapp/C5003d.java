package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.d */
/* compiled from: Sta */
public class C5003d {

    /* renamed from: d */
    public static C5003d f22119d = new C5003d();

    /* renamed from: a */
    public List<C5002c> f22120a = new ArrayList();

    /* renamed from: b */
    public Map<AdPreferences.Placement, List<C5002c>> f22121b = new HashMap();

    /* renamed from: c */
    public Map<String, List<C5002c>> f22122c = new HashMap();

    /* renamed from: a */
    public static C5003d m22884a() {
        return f22119d;
    }

    /* renamed from: b */
    public int mo20660b() {
        return this.f22120a.size();
    }

    /* renamed from: a */
    public synchronized void mo20659a(C5002c cVar) {
        this.f22120a.add(0, cVar);
        List list = this.f22121b.get(cVar.f22117b);
        if (list == null) {
            list = new ArrayList();
            this.f22121b.put(cVar.f22117b, list);
        }
        list.add(0, cVar);
        List list2 = this.f22122c.get(cVar.f22118c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.f22122c.put(cVar.f22118c, list2);
        }
        list2.add(0, cVar);
    }
}
