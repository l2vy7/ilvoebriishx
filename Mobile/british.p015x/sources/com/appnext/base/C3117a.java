package com.appnext.base;

import android.text.TextUtils;
import com.appnext.base.p027b.C3125a;
import com.appnext.core.crashes.C3178b;

/* renamed from: com.appnext.base.a */
public final class C3117a {
    /* renamed from: a */
    public static void m10553a(String str, Throwable th) {
        if (th != null) {
            String message = th.getMessage();
            if (TextUtils.isEmpty(message)) {
                message = th.toString();
                if (TextUtils.isEmpty(message)) {
                    return;
                }
            }
            C3178b.m10711p(C3125a.getContext()).mo10767m(str, message);
        }
    }
}
