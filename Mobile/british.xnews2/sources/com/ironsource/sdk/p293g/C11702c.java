package com.ironsource.sdk.p293g;

import com.ironsource.sdk.p296j.C11720a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.g.c */
public final class C11702c {

    /* renamed from: a */
    public String f52386a;

    /* renamed from: b */
    public String f52387b;

    /* renamed from: c */
    public int f52388c = -1;

    /* renamed from: d */
    public Map<String, String> f52389d;

    /* renamed from: e */
    public int f52390e;

    /* renamed from: f */
    public boolean f52391f;

    /* renamed from: g */
    public C11720a f52392g;

    public C11702c(String str, String str2, Map<String, String> map, C11720a aVar) {
        this.f52387b = str;
        this.f52386a = str2;
        this.f52389d = map;
        this.f52392g = aVar;
        this.f52390e = 0;
        this.f52391f = false;
    }

    /* renamed from: a */
    public final Map<String, String> mo44999a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f52387b);
        hashMap.put("demandSourceName", this.f52386a);
        Map<String, String> map = this.f52389d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo45000a(int i) {
        this.f52390e = i;
    }
}
