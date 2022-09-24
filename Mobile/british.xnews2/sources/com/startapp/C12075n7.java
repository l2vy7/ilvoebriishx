package com.startapp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

/* renamed from: com.startapp.n7 */
/* compiled from: Sta */
public final class C12075n7 {

    /* renamed from: a */
    public static C11945hd f53327a = new C11945hd();

    /* renamed from: a */
    public static void m52625a(Context context) {
        C11945hd hdVar = f53327a;
        Context applicationContext = context.getApplicationContext();
        C12000je.m52519a((Object) applicationContext, "Application Context cannot be null");
        if (!hdVar.f53046a) {
            hdVar.f53046a = true;
            C12117oe a = C12117oe.m52725a();
            a.f53987c.getClass();
            C12134pd pdVar = new C12134pd();
            C12038le leVar = a.f53986b;
            Handler handler = new Handler();
            leVar.getClass();
            a.f53988d = new C11932ge(handler, applicationContext, pdVar, a);
            C12170rd rdVar = C12170rd.f54116d;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(rdVar);
            }
            WindowManager windowManager = C12377ud.f54853a;
            C12377ud.f54855c = applicationContext.getResources().getDisplayMetrics().density;
            C12377ud.f54853a = (WindowManager) applicationContext.getSystemService("window");
            C11875de.f52875b.f52876a = applicationContext.getApplicationContext();
        }
    }
}
