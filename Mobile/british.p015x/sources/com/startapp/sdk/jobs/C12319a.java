package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C5009h0;
import com.startapp.sdk.jobs.C12320b;
import java.lang.reflect.Constructor;

/* renamed from: com.startapp.sdk.jobs.a */
/* compiled from: Sta */
public abstract class C12319a {
    /* renamed from: a */
    public abstract void mo46480a(C12320b bVar);

    /* renamed from: a */
    public boolean mo46482a(Context context, String[] strArr, C12320b.C12321a aVar, Bundle bundle) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (String cls : strArr) {
            Class<? extends U> cls2 = null;
            try {
                cls2 = Class.forName(cls).asSubclass(C12320b.class);
            } catch (ClassNotFoundException unused) {
            }
            if (cls2 != null) {
                try {
                    Constructor<? extends U> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{Context.class, C12320b.C12321a.class, Bundle.class});
                    declaredConstructor.setAccessible(true);
                    Context a = C5009h0.m22892a(context);
                    if (a == null) {
                        a = context;
                    }
                    mo46480a((C12320b) declaredConstructor.newInstance(new Object[]{a, aVar, bundle}));
                    z = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z;
    }
}
