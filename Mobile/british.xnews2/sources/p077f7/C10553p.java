package p077f7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6492o;
import p261w6.C11086c;

/* renamed from: f7.p */
public final class C10553p {

    /* renamed from: a */
    private final Context f49102a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f49103b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f49104c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f49105d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f49106e = 0;

    public C10553p(Context context) {
        this.f49102a = context;
    }

    /* renamed from: a */
    public static String m48301a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: b */
    public static String m48302b(C11086c cVar) {
        String d = cVar.mo43358k().mo43369d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo43358k().mo43368c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: g */
    private final synchronized void m48303g() {
        PackageInfo h = m48304h(this.f49102a.getPackageName());
        if (h != null) {
            this.f49103b = Integer.toString(h.versionCode);
            this.f49104c = h.versionName;
        }
    }

    /* renamed from: h */
    private final PackageInfo m48304h(String str) {
        try {
            return this.f49102a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public final synchronized int mo42678c() {
        int i = this.f49106e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f49102a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C6492o.m28288k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f49106e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C6492o.m28288k()) {
                this.f49106e = 2;
            } else {
                this.f49106e = 1;
            }
            return this.f49106e;
        }
        this.f49106e = 2;
        return 2;
    }

    /* renamed from: d */
    public final synchronized String mo42679d() {
        if (this.f49103b == null) {
            m48303g();
        }
        return this.f49103b;
    }

    /* renamed from: e */
    public final synchronized String mo42680e() {
        if (this.f49104c == null) {
            m48303g();
        }
        return this.f49104c;
    }

    /* renamed from: f */
    public final synchronized int mo42681f() {
        PackageInfo h;
        if (this.f49105d == 0 && (h = m48304h("com.google.android.gms")) != null) {
            this.f49105d = h.versionCode;
        }
        return this.f49105d;
    }
}
