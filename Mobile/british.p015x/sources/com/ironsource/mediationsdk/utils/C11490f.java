package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* renamed from: com.ironsource.mediationsdk.utils.f */
public final class C11490f {

    /* renamed from: a */
    private long f51567a = new Date().getTime();

    /* renamed from: a */
    public static long m51271a(C11490f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f51567a;
    }
}
