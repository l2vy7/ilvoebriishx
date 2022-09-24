package com.startapp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.t5 */
/* compiled from: Sta */
public class C12342t5 {

    /* renamed from: b */
    public static C12342t5 f54758b = new C12342t5();

    /* renamed from: a */
    public Map<String, C12178s5> f54759a = new ConcurrentHashMap();

    /* renamed from: a */
    public C12178s5 mo46637a(String str) {
        if (this.f54759a.containsKey(str)) {
            return this.f54759a.get(str);
        }
        C12178s5 s5Var = new C12178s5();
        this.f54759a.put(str, s5Var);
        return s5Var;
    }
}
