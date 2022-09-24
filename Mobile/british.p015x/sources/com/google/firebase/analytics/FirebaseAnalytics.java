package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9372u2;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C10456b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p256u5.C11046u;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f48817b;

    /* renamed from: a */
    private final C9372u2 f48818a;

    public FirebaseAnalytics(C9372u2 u2Var) {
        C4604n.m20098k(u2Var);
        this.f48818a = u2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f48817b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f48817b == null) {
                    f48817b = new FirebaseAnalytics(C9372u2.m43684t(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f48817b;
    }

    @Keep
    public static C11046u getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C9372u2 t = C9372u2.m43684t(context, (String) null, (String) null, (String) null, bundle);
        if (t == null) {
            return null;
        }
        return new C10413a(t);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C10456b.m48140l().mo41931k(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f48818a.mo38074d(activity, str, str2);
    }
}
