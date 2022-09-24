package p217i5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p006a5.C6486h;

/* renamed from: i5.l */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C10597l implements AppSetIdClient {

    /* renamed from: e */
    private static AppSetIdClient f49138e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f49139a;

    /* renamed from: b */
    private boolean f49140b = false;

    /* renamed from: c */
    private final ScheduledExecutorService f49141c;

    /* renamed from: d */
    private final ExecutorService f49142d;

    C10597l(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f49141c = newSingleThreadScheduledExecutor;
        this.f49142d = Executors.newSingleThreadExecutor();
        this.f49139a = context;
        if (!this.f49140b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C10595j(this, (C10594i) null), 0, 86400, TimeUnit.SECONDS);
            this.f49140b = true;
        }
    }

    /* renamed from: c */
    static synchronized AppSetIdClient m48339c(Context context) {
        AppSetIdClient appSetIdClient;
        synchronized (C10597l.class) {
            C4604n.m20099l(context, "Context must not be null");
            if (f49138e == null) {
                f49138e = new C10597l(context.getApplicationContext());
            }
            appSetIdClient = f49138e;
        }
        return appSetIdClient;
    }

    /* renamed from: e */
    protected static final void m48340e(Context context) {
        String str;
        if (!m48341f(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to clear app set ID generated for App ".concat(valueOf);
            } else {
                str = new String("Failed to clear app set ID generated for App ");
            }
            Log.e("AppSet", str);
        }
        if (!m48341f(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
        }
    }

    /* renamed from: f */
    private static final SharedPreferences m48341f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: g */
    private static final void m48342g(Context context) throws C10596k {
        String str;
        SharedPreferences f = m48341f(context);
        if (!f.edit().putLong("app_set_id_last_used_time", C6486h.m28261b().currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new C10596k("Failed to store the app set ID last used time.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo42711a() {
        long j = m48341f(this.f49139a).getLong("app_set_id_last_used_time", -1);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo42712d(TaskCompletionSource taskCompletionSource) {
        String str;
        String str2;
        String string = m48341f(this.f49139a).getString("app_set_id", (String) null);
        long a = mo42711a();
        if (string == null || C6486h.m28261b().currentTimeMillis() > a) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f49139a;
                if (!m48341f(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to store app set ID generated for App ");
                    }
                    Log.e("AppSet", str2);
                    throw new C10596k("Failed to store the app set ID.");
                }
                m48342g(context);
                Context context2 = this.f49139a;
                SharedPreferences f = m48341f(context2);
                if (!f.edit().putLong("app_set_id_creation_time", C6486h.m28261b().currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                    } else {
                        str = new String("Failed to store app set ID creation time for App ");
                    }
                    Log.e("AppSet", str);
                    throw new C10596k("Failed to store the app set ID creation time.");
                }
            } catch (C10596k e) {
                taskCompletionSource.setException(e);
                return;
            }
        } else {
            try {
                m48342g(this.f49139a);
            } catch (C10596k e2) {
                taskCompletionSource.setException(e2);
                return;
            }
        }
        taskCompletionSource.setResult(new AppSetIdInfo(string, 1));
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f49142d.execute(new C10593h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
