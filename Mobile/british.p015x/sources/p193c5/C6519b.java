package p193c5;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import p006a5.C6492o;
import p105l0.C5644d;

/* renamed from: c5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6519b {

    /* renamed from: a */
    protected final Context f26592a;

    public C6519b(Context context) {
        this.f26592a = context;
    }

    /* renamed from: a */
    public int mo24350a(String str) {
        return this.f26592a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo24351b(String str, String str2) {
        return this.f26592a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo mo24352c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f26592a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence mo24353d(String str) throws PackageManager.NameNotFoundException {
        return this.f26592a.getPackageManager().getApplicationLabel(this.f26592a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public C5644d<CharSequence, Drawable> mo24354e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f26592a.getPackageManager().getApplicationInfo(str, 0);
        return C5644d.m24957a(this.f26592a.getPackageManager().getApplicationLabel(applicationInfo), this.f26592a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* renamed from: f */
    public PackageInfo mo24355f(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f26592a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: g */
    public boolean mo24356g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C6518a.m28312a(this.f26592a);
        }
        if (!C6492o.m28288k() || (nameForUid = this.f26592a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f26592a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: h */
    public final boolean mo24357h(int i, String str) {
        if (C6492o.m28283f()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f26592a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f26592a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
