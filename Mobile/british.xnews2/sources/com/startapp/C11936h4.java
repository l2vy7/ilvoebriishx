package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.h4 */
/* compiled from: Sta */
public class C11936h4 {

    /* renamed from: a */
    public final List<String> f53024a;

    /* renamed from: b */
    public final List<String> f53025b;

    /* renamed from: c */
    public final List<String> f53026c;

    /* renamed from: d */
    public final List<String> f53027d;

    /* renamed from: e */
    public final List<String> f53028e;

    /* renamed from: f */
    public final long f53029f;

    /* renamed from: com.startapp.h4$a */
    /* compiled from: Sta */
    public static class C11937a {

        /* renamed from: a */
        public List<String> f53030a;

        /* renamed from: b */
        public List<String> f53031b;

        /* renamed from: c */
        public List<String> f53032c;

        /* renamed from: d */
        public String f53033d;

        /* renamed from: a */
        public List<String> mo45398a() {
            return this.f53031b;
        }

        /* renamed from: b */
        public List<String> mo45399b() {
            return this.f53032c;
        }

        /* renamed from: c */
        public List<String> mo45400c() {
            return this.f53030a;
        }

        /* renamed from: d */
        public String mo45401d() {
            return this.f53033d;
        }

        /* renamed from: a */
        public C11937a mo45396a(String... strArr) {
            List list = this.f53032c;
            if (list == null) {
                list = new ArrayList();
                this.f53032c = list;
            }
            return mo45397a(strArr, list);
        }

        /* renamed from: a */
        public final C11937a mo45397a(String[] strArr, List<String> list) {
            for (String str : strArr) {
                if (str != null) {
                    list.add(str);
                }
            }
            return this;
        }
    }

    public C11936h4(C11937a aVar) {
        this.f53024a = C5015nb.m22928b(aVar.mo45400c());
        this.f53025b = C5015nb.m22928b(aVar.mo45398a());
        this.f53026c = C5015nb.m22928b((List) null);
        this.f53027d = C5015nb.m22928b((List) null);
        this.f53028e = C5015nb.m22928b(aVar.mo45399b());
        this.f53029f = Math.max(0, C5015nb.m22935e(aVar.mo45401d()));
    }

    /* renamed from: a */
    public static List<C11936h4> m52383a(List<AnalyticsCategoryFilterConfig> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (AnalyticsCategoryFilterConfig next : list) {
            if (next != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                }
                arrayList.add(new C11936h4(next));
            }
        }
        return arrayList != null ? C5015nb.m22928b(arrayList) : arrayList;
    }

    public C11936h4(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f53024a = C5015nb.m22928b(analyticsCategoryFilterConfig.mo46303e());
        this.f53025b = C5015nb.m22928b(analyticsCategoryFilterConfig.mo46300b());
        this.f53026c = C5015nb.m22928b(analyticsCategoryFilterConfig.mo46302d());
        this.f53027d = C5015nb.m22928b(analyticsCategoryFilterConfig.mo46299a());
        this.f53028e = C5015nb.m22928b(analyticsCategoryFilterConfig.mo46301c());
        this.f53029f = Math.max(0, C5015nb.m22935e(analyticsCategoryFilterConfig.mo46305f()));
    }
}
