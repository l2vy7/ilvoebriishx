package com.startapp;

import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: com.startapp.d5 */
/* compiled from: Sta */
public class C11846d5 implements Comparator<JSONObject> {

    /* renamed from: a */
    public final String f52728a;

    public C11846d5(String str) {
        this.f52728a = str;
    }

    public int compare(Object obj, Object obj2) {
        Object opt = ((JSONObject) obj).opt(this.f52728a);
        Object opt2 = ((JSONObject) obj2).opt(this.f52728a);
        if ((opt instanceof Comparable) && (opt2 instanceof Comparable)) {
            if (opt.getClass() == opt2.getClass()) {
                return ((Comparable) opt).compareTo(opt2);
            }
            if ((opt instanceof Number) && (opt2 instanceof Number)) {
                return Double.compare(((Number) opt).doubleValue(), ((Number) opt2).doubleValue());
            }
        }
        Object obj3 = JSONObject.NULL;
        if (opt == obj3) {
            opt = null;
        }
        if (opt2 == obj3) {
            opt2 = null;
        }
        if (opt != null && opt2 != null) {
            return opt.toString().compareTo(opt2.toString());
        }
        if (opt != null) {
            return 1;
        }
        return opt2 != null ? -1 : 0;
    }
}
