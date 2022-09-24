package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.i */
final class C9701i implements Comparator<ActivityTransition> {
    C9701i() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int C0 = activityTransition.mo38681C0();
        int C02 = activityTransition2.mo38681C0();
        if (C0 != C02) {
            return C0 < C02 ? -1 : 1;
        }
        int D0 = activityTransition.mo38682D0();
        int D02 = activityTransition2.mo38682D0();
        if (D0 == D02) {
            return 0;
        }
        return D0 < D02 ? -1 : 1;
    }
}
