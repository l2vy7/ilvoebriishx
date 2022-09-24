package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p256u5.C11045t;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9768f6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    final /* synthetic */ C9779g6 f46270b;

    /* synthetic */ C9768f6(C9779g6 g6Var, C11045t tVar) {
        this.f46270b = g6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4670h4 h4Var;
        try {
            this.f46270b.f21269a.mo19276j().mo19286v().mo38856a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                h4Var = this.f46270b.f21269a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f46270b.f21269a.mo19372N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? TtmlNode.TEXT_EMPHASIS_AUTO : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f46270b.f21269a.mo19273e().mo38909z(new C9758e6(this, z, data, str, queryParameter));
                        h4Var = this.f46270b.f21269a;
                    }
                }
                h4Var = this.f46270b.f21269a;
            }
        } catch (RuntimeException e) {
            this.f46270b.f21269a.mo19276j().mo19282q().mo38857b("Throwable caught in onActivityCreated", e);
            h4Var = this.f46270b.f21269a;
        } catch (Throwable th) {
            this.f46270b.f21269a.mo19369K().mo39204z(activity, bundle);
            throw th;
        }
        h4Var.mo19369K().mo39204z(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f46270b.f21269a.mo19369K().mo39194A(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f46270b.f21269a.mo19369K().mo39195B(activity);
        C9813j8 M = this.f46270b.f21269a.mo19371M();
        M.f21269a.mo19273e().mo38909z(new C9729b8(M, M.f21269a.mo19274f().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        C9813j8 M = this.f46270b.f21269a.mo19371M();
        M.f21269a.mo19273e().mo38909z(new C9719a8(M, M.f21269a.mo19274f().elapsedRealtime()));
        this.f46270b.f21269a.mo19369K().mo39196C(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f46270b.f21269a.mo19369K().mo39197D(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
