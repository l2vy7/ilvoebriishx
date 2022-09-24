package com.facebook;

import android.content.Intent;
import com.facebook.internal.C3474d;

/* renamed from: com.facebook.e */
/* compiled from: CallbackManager */
public interface C3448e {

    /* renamed from: com.facebook.e$a */
    /* compiled from: CallbackManager */
    public static class C3449a {
        /* renamed from: a */
        public static C3448e m11509a() {
            return new C3474d();
        }
    }

    boolean onActivityResult(int i, int i2, Intent intent);
}
