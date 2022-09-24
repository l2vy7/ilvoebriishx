package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.l0 */
class C2844l0 {

    /* renamed from: a */
    private static int f11533a = 0;

    /* renamed from: b */
    private static HashMap<String, Integer> f11534b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f11535c = new HashMap<>();

    /* renamed from: d */
    static final int f11536d = 5;

    /* renamed from: e */
    static final int f11537e = 1;

    /* renamed from: f */
    static final int f11538f = 3;

    /* renamed from: g */
    static final int f11539g = 0;

    /* renamed from: h */
    static final int f11540h = 1;

    C2844l0() {
    }

    /* renamed from: a */
    static boolean m9828a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f11534b.get(string) == null) {
                f11534b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f11535c.get(string) == null) {
                f11535c.put(string, 0);
            }
            if (currentTimeMillis - f11534b.get(string).intValue() > 1) {
                f11535c.put(string, 1);
                f11534b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f11535c.get(string).intValue() + 1;
            f11535c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f11533a < 5) {
            return true;
        } else {
            f11533a = currentTimeMillis;
            return false;
        }
    }
}
