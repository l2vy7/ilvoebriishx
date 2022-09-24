package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mq3 implements pr3 {

    /* renamed from: b */
    private static final sq3 f35603b = new kq3();

    /* renamed from: a */
    private final sq3 f35604a;

    public mq3() {
        sq3 sq3;
        sq3[] sq3Arr = new sq3[2];
        sq3Arr[0] = gp3.m32633a();
        try {
            sq3 = (sq3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            sq3 = f35603b;
        }
        sq3Arr[1] = sq3;
        lq3 lq3 = new lq3(sq3Arr);
        up3.m38380f(lq3, "messageInfoFactory");
        this.f35604a = lq3;
    }

    /* renamed from: b */
    private static boolean m34879b(rq3 rq3) {
        return rq3.zzc() == 1;
    }

    /* renamed from: a */
    public final <T> or3<T> mo33582a(Class<T> cls) {
        Class<kp3> cls2 = kp3.class;
        qr3.m36648g(cls);
        rq3 b = this.f35604a.mo32214b(cls);
        if (b.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return yq3.m39988b(qr3.m36642b(), ap3.m30432b(), b.zza());
            }
            return yq3.m39988b(qr3.m36643b0(), ap3.m30431a(), b.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m34879b(b)) {
                return xq3.m39541H(cls, b, br3.m30817b(), iq3.m33380e(), qr3.m36642b(), ap3.m30432b(), qq3.m36612b());
            }
            return xq3.m39541H(cls, b, br3.m30817b(), iq3.m33380e(), qr3.m36642b(), (xo3<?>) null, qq3.m36612b());
        } else if (m34879b(b)) {
            return xq3.m39541H(cls, b, br3.m30816a(), iq3.m33379d(), qr3.m36643b0(), ap3.m30431a(), qq3.m36611a());
        } else {
            return xq3.m39541H(cls, b, br3.m30816a(), iq3.m33379d(), qr3.m36640a(), (xo3<?>) null, qq3.m36611a());
        }
    }
}
