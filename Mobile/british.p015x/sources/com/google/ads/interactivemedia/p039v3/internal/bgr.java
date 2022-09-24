package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgr */
/* compiled from: IMASDK */
final class bgr implements bfj {

    /* renamed from: a */
    private final /* synthetic */ int f16305a = 0;

    bgr() {
    }

    bgr(byte[] bArr) {
    }

    bgr(char[] cArr) {
    }

    bgr(float[] fArr) {
    }

    bgr(int[] iArr) {
    }

    bgr(short[] sArr) {
    }

    bgr(boolean[] zArr) {
    }

    /* renamed from: a */
    public final bfi mo14244a(bet bet, biu biu) {
        Type type;
        Class<Enum> cls = Enum.class;
        int i = this.f16305a;
        if (i != 0) {
            if (i == 1) {
                Type b = biu.mo15134b();
                boolean z = b instanceof GenericArrayType;
                if (!z && (!(b instanceof Class) || !((Class) b).isArray())) {
                    return null;
                }
                if (z) {
                    type = ((GenericArrayType) b).getGenericComponentType();
                } else {
                    type = ((Class) b).getComponentType();
                }
                return new bgp(bet, bet.mo14965b(biu.m15937c(type)), bfp.m15816c(type));
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            Class<? super Object> a = biu.mo15133a();
                            if (!cls.isAssignableFrom(a) || a == cls) {
                                return null;
                            }
                            if (!a.isEnum()) {
                                a = a.getSuperclass();
                            }
                            return new bio(a);
                        } else if (biu.mo15133a() != Timestamp.class) {
                            return null;
                        } else {
                            return new bhy(bet.mo14967d(Date.class));
                        }
                    } else if (biu.mo15133a() == Time.class) {
                        return new bhe();
                    } else {
                        return null;
                    }
                } else if (biu.mo15133a() == java.sql.Date.class) {
                    return new bhd();
                } else {
                    return null;
                }
            } else if (biu.mo15133a() == Object.class) {
                return new bgz(bet);
            } else {
                return null;
            }
        } else if (biu.mo15133a() == Date.class) {
            return new bgs();
        } else {
            return null;
        }
    }
}
