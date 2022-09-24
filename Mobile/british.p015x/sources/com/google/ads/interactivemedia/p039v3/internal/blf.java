package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blf */
/* compiled from: IMASDK */
final class blf implements blz {

    /* renamed from: b */
    private static final bll f16628b = new bld();

    /* renamed from: a */
    private final bll f16629a;

    public blf() {
        bll bll;
        bll[] bllArr = new bll[2];
        bllArr[0] = bld.m16390c();
        try {
            bll = (bll) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            bll = f16628b;
        }
        bllArr[1] = bll;
        ble ble = new ble(bllArr);
        bkr.m16347j(ble, "messageInfoFactory");
        this.f16629a = ble;
    }

    /* renamed from: b */
    private static boolean m16395b(blk blk) {
        return blk.mo15446c() == 1;
    }

    /* renamed from: a */
    public final <T> bly<T> mo15432a(Class<T> cls) {
        Class<bkl> cls2 = bkl.class;
        bma.m16598a(cls);
        blk b = this.f16629a.mo15431b(cls);
        if (b.mo15444a()) {
            if (cls2.isAssignableFrom(cls)) {
                return blq.m16485h(bma.m16582K(), bkb.m16277a(), b.mo15445b());
            }
            return blq.m16485h(bma.m16580I(), bkb.m16278b(), b.mo15445b());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m16395b(b)) {
                return blp.m16461n(b, bls.m16502b(), blb.m16381f(), bma.m16582K(), bkb.m16277a(), blj.m16415b());
            }
            return blp.m16461n(b, bls.m16502b(), blb.m16381f(), bma.m16582K(), (bmw) null, blj.m16415b());
        } else if (m16395b(b)) {
            return blp.m16461n(b, bls.m16501a(), blb.m16380e(), bma.m16580I(), bkb.m16278b(), blj.m16414a());
        } else {
            return blp.m16461n(b, bls.m16501a(), blb.m16380e(), bma.m16581J(), (bmw) null, blj.m16414a());
        }
    }
}
