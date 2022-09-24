package com.unity3d.scar.adapter.common;

import p322q7.C12866c;

/* renamed from: com.unity3d.scar.adapter.common.b */
/* compiled from: GMAAdsError */
public class C12485b extends C12496l {
    public C12485b(C12486c cVar, Object... objArr) {
        super(cVar, (String) null, objArr);
    }

    /* renamed from: a */
    public static C12485b m53822a(C12866c cVar) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", new Object[]{cVar.mo48010c()});
        return new C12485b(C12486c.AD_NOT_LOADED_ERROR, format, cVar.mo48010c(), cVar.mo48011d(), format);
    }

    /* renamed from: b */
    public static C12485b m53823b(String str) {
        return new C12485b(C12486c.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    /* renamed from: c */
    public static C12485b m53824c(C12866c cVar, String str) {
        return new C12485b(C12486c.INTERNAL_LOAD_ERROR, str, cVar.mo48010c(), cVar.mo48011d(), str);
    }

    /* renamed from: d */
    public static C12485b m53825d(C12866c cVar, String str) {
        return new C12485b(C12486c.INTERNAL_SHOW_ERROR, str, cVar.mo48010c(), cVar.mo48011d(), str);
    }

    /* renamed from: e */
    public static C12485b m53826e(String str) {
        return new C12485b(C12486c.INTERNAL_SIGNALS_ERROR, str, str);
    }

    /* renamed from: f */
    public static C12485b m53827f(String str, String str2, String str3) {
        return new C12485b(C12486c.NO_AD_ERROR, str3, str, str2, str3);
    }

    /* renamed from: g */
    public static C12485b m53828g(C12866c cVar) {
        String format = String.format("Missing queryInfoMetadata for ad %s", new Object[]{cVar.mo48010c()});
        return new C12485b(C12486c.QUERY_NOT_FOUND_ERROR, format, cVar.mo48010c(), cVar.mo48011d(), format);
    }

    public String getDomain() {
        return "GMA";
    }

    public C12485b(C12486c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
