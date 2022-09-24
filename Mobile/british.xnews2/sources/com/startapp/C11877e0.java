package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.util.Map;

/* renamed from: com.startapp.e0 */
/* compiled from: Sta */
public class C11877e0 extends C11954i2 {

    /* renamed from: a */
    public final C5005f0 f52879a;

    /* renamed from: b */
    public int f52880b;

    /* renamed from: c */
    public boolean f52881c;

    /* renamed from: d */
    public boolean f52882d;

    public C11877e0(C5005f0 f0Var) {
        this.f52879a = f0Var;
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            int i = this.f52880b + 1;
            this.f52880b = i;
            if (i == 1 && !this.f52881c) {
                Map<String, String> map = null;
                if (!this.f52882d) {
                    this.f52882d = true;
                    StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f52879a;
                    StartAppSDKInternal.m23102f(startAppSDKInternal.f22276h);
                    C11828cb cbVar = startAppSDKInternal.f22267A;
                    if (cbVar != null) {
                        TriggeredLinksMetadata a = cbVar.mo45212a();
                        AppEventsMetadata a2 = a != null ? a.mo46505a() : null;
                        Map<String, String> c = a2 != null ? a2.mo46496c() : null;
                        if (c != null) {
                            cbVar.mo45215a(a, c, "Launch");
                        }
                    }
                }
                StartAppSDKInternal startAppSDKInternal2 = (StartAppSDKInternal) this.f52879a;
                Application application = startAppSDKInternal2.f22276h;
                if (application != null) {
                    C12052ma u = ComponentLocator.m23305a((Context) application).mo21234u();
                    u.f53283b.execute(new C12015ka(u));
                }
                StartAppSDKInternal.m23102f(startAppSDKInternal2.f22276h);
                C11828cb cbVar2 = startAppSDKInternal2.f22267A;
                if (cbVar2 != null) {
                    TriggeredLinksMetadata a3 = cbVar2.mo45212a();
                    AppEventsMetadata a4 = a3 != null ? a3.mo46505a() : null;
                    if (a4 != null) {
                        map = a4.mo46494a();
                    }
                    if (map != null) {
                        cbVar2.mo45215a(a3, map, "Active");
                    }
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity != null) {
            this.f52880b--;
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.f52881c = isChangingConfigurations;
            if (this.f52880b == 0 && !isChangingConfigurations) {
                StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f52879a;
                Application application = startAppSDKInternal.f22276h;
                if (application != null) {
                    C12052ma u = ComponentLocator.m23305a((Context) application).mo21234u();
                    u.f53283b.execute(new C12033la(u));
                }
                StartAppSDKInternal.m23102f(startAppSDKInternal.f22276h);
                C11828cb cbVar = startAppSDKInternal.f22267A;
                if (cbVar != null) {
                    TriggeredLinksMetadata a = cbVar.mo45212a();
                    Map<String, String> map = null;
                    AppEventsMetadata a2 = a != null ? a.mo46505a() : null;
                    if (a2 != null) {
                        map = a2.mo46495b();
                    }
                    if (map != null) {
                        cbVar.mo45215a(a, map, "Inactive");
                    }
                }
                Application application2 = startAppSDKInternal.f22276h;
                if (application2 != null) {
                    C11822c6 o = ComponentLocator.m23305a((Context) application2).mo21228o();
                    o.getClass();
                    try {
                        o.mo45202c();
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                }
            }
        }
    }
}
