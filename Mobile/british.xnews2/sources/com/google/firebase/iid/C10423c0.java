package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import p077f7.C10553p;
import p077f7.C5263b;
import p261w6.C11086c;

/* renamed from: com.google.firebase.iid.c0 */
final class C10423c0 implements C5263b {

    /* renamed from: a */
    private final C11086c f48854a;

    /* renamed from: b */
    private final C10553p f48855b;

    /* renamed from: c */
    private final C10430g f48856c;

    /* renamed from: d */
    private final Executor f48857d;

    C10423c0(C11086c cVar, C10553p pVar, Executor executor) {
        this(cVar, pVar, executor, new C10430g(cVar.mo43355h(), pVar));
    }

    /* renamed from: g */
    private final Task<Bundle> m48033g(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f48854a.mo43358k().mo43368c());
        bundle.putString("gmsv", Integer.toString(this.f48855b.mo42681f()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f48855b.mo42679d());
        bundle.putString("app_ver_name", this.f48855b.mo42680e());
        bundle.putString("cliv", "fiid-12451000");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48857d.execute(new C10425d0(this, bundle, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static String m48034h(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: k */
    private final <T> Task<Void> m48036k(Task<T> task) {
        return task.continueWith(C10448u.m48120c(), new C10427e0(this));
    }

    /* renamed from: l */
    private final Task<String> m48037l(Task<Bundle> task) {
        return task.continueWith(this.f48857d, new C10429f0(this));
    }

    /* renamed from: a */
    public final Task<Void> mo21478a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String valueOf2 = String.valueOf(str3);
        return m48036k(m48037l(m48033g(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    /* renamed from: b */
    public final Task<Void> mo21479b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m48036k(m48037l(m48033g(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    /* renamed from: c */
    public final boolean mo21480c() {
        return true;
    }

    /* renamed from: d */
    public final Task<String> mo21481d(String str, String str2, String str3, String str4) {
        return m48037l(m48033g(str, str3, str4, new Bundle()));
    }

    /* renamed from: e */
    public final Task<Void> mo21482e(String str, String str2) {
        return Tasks.forResult(null);
    }

    /* renamed from: f */
    public final boolean mo21483f() {
        return this.f48855b.mo42678c() != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo41876j(Bundle bundle, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(this.f48856c.mo41881f(bundle));
        } catch (IOException e) {
            taskCompletionSource.setException(e);
        }
    }

    private C10423c0(C11086c cVar, C10553p pVar, Executor executor, C10430g gVar) {
        this.f48854a = cVar;
        this.f48855b = pVar;
        this.f48856c = gVar;
        this.f48857d = executor;
    }
}
