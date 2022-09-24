package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.nd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8658nd implements C8578ie {

    /* renamed from: b */
    private static final C8752td f43845b = new C8626ld();

    /* renamed from: a */
    private final C8752td f43846a;

    public C8658nd() {
        C8752td tdVar;
        C8752td[] tdVarArr = new C8752td[2];
        tdVarArr[0] = C8657nc.m41160a();
        try {
            tdVar = (C8752td) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            tdVar = f43845b;
        }
        tdVarArr[1] = tdVar;
        C8642md mdVar = new C8642md(tdVarArr);
        C8443ad.m40690b(mdVar, "messageInfoFactory");
        this.f43846a = mdVar;
    }

    /* renamed from: b */
    private static boolean m41163b(C8737sd sdVar) {
        return sdVar.zzc() == 1;
    }

    /* renamed from: a */
    public final <T> C8561he<T> mo36558a(Class<T> cls) {
        Class<C8705qc> cls2 = C8705qc.class;
        C8594je.m41034A(cls);
        C8737sd c = this.f43846a.mo36599c(cls);
        if (c.zza()) {
            if (cls2.isAssignableFrom(cls)) {
                return C8444ae.m40698g(C8594je.m41062c(), C8592jc.m41028a(), c.zzb());
            }
            return C8444ae.m40698g(C8594je.m41060a(), C8592jc.m41029b(), c.zzb());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m41163b(c)) {
                return C8844zd.m41469o(cls, c, C8478ce.m40750b(), C8593jd.m41031d(), C8594je.m41062c(), C8592jc.m41028a(), C8721rd.m41281b());
            }
            return C8844zd.m41469o(cls, c, C8478ce.m40750b(), C8593jd.m41031d(), C8594je.m41062c(), (C8559hc<?>) null, C8721rd.m41281b());
        } else if (m41163b(c)) {
            return C8844zd.m41469o(cls, c, C8478ce.m40749a(), C8593jd.m41030c(), C8594je.m41060a(), C8592jc.m41029b(), C8721rd.m41280a());
        } else {
            return C8844zd.m41469o(cls, c, C8478ce.m40749a(), C8593jd.m41030c(), C8594je.m41061b(), (C8559hc<?>) null, C8721rd.m41280a());
        }
    }
}
