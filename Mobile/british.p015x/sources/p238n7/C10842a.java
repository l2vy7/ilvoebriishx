package p238n7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0600b;
import p201d7.C10506c;

/* renamed from: n7.a */
/* compiled from: DataCollectionConfigStorage */
public class C10842a {

    /* renamed from: a */
    private final Context f49611a;

    /* renamed from: b */
    private final SharedPreferences f49612b;

    /* renamed from: c */
    private final C10506c f49613c;

    /* renamed from: d */
    private boolean f49614d = m48836c();

    public C10842a(Context context, String str, C10506c cVar) {
        Context a = m48835a(context);
        this.f49611a = a;
        this.f49612b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f49613c = cVar;
    }

    /* renamed from: a */
    private static Context m48835a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return C0600b.m3290b(context);
    }

    /* renamed from: c */
    private boolean m48836c() {
        if (this.f49612b.contains("firebase_data_collection_default_enabled")) {
            return this.f49612b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m48837d();
    }

    /* renamed from: d */
    private boolean m48837d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f49611a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f49611a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo43011b() {
        return this.f49614d;
    }
}
