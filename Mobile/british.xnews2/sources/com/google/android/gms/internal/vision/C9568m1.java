package com.google.android.gms.internal.vision;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.vision.m1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9568m1 implements Comparator<C9552k1> {
    C9568m1() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C9552k1 k1Var = (C9552k1) obj;
        C9552k1 k1Var2 = (C9552k1) obj2;
        C9633u1 u1Var = (C9633u1) k1Var.iterator();
        C9633u1 u1Var2 = (C9633u1) k1Var2.iterator();
        while (u1Var.hasNext() && u1Var2.hasNext()) {
            int compare = Integer.compare(C9552k1.m44402a(u1Var.mo38506d()), C9552k1.m44402a(u1Var2.mo38506d()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(k1Var.size(), k1Var2.size());
    }
}
