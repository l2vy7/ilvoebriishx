package com.google.android.gms.appset;

import android.content.Context;
import p217i5.C10603r;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        return new C10603r(context);
    }
}
