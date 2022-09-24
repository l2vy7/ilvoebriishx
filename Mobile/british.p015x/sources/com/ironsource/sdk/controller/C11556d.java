package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.d */
class C11556d {

    /* renamed from: b */
    private static final String f51938b = "d";

    /* renamed from: a */
    final C11618w.C11622d f51939a;

    C11556d(C11618w.C11622d dVar) {
        this.f51939a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo44692a(String str, String str2) {
        if (this.f51939a == null) {
            Logger.m51951e(f51938b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C11618w.C11622d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f51939a, new Object[]{str2});
    }
}
