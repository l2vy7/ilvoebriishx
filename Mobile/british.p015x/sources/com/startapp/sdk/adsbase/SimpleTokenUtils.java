package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Pair;
import com.startapp.C12347t9;
import com.startapp.C12373u9;
import com.startapp.C12437y;
import com.startapp.C5004d4;
import com.startapp.C5009h0;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Sta */
public class SimpleTokenUtils {

    /* renamed from: a */
    public static List<PackageInfo> f22244a = null;

    /* renamed from: b */
    public static List<PackageInfo> f22245b = null;

    /* renamed from: c */
    public static long f22246c = 0;

    /* renamed from: d */
    public static volatile Pair<TokenType, String> f22247d = null;

    /* renamed from: e */
    public static volatile Pair<TokenType, String> f22248e = null;

    /* renamed from: f */
    public static boolean f22249f = true;

    /* renamed from: g */
    public static boolean f22250g = false;

    /* renamed from: h */
    public static TokenType f22251h = TokenType.UNDEFINED;

    /* compiled from: Sta */
    public enum TokenType {
        T1("token"),
        T2("token2"),
        UNDEFINED("");
        
        private final String text;

        /* access modifiers changed from: public */
        TokenType(String str) {
            this.text = str;
        }

        /* renamed from: a */
        public static TokenType m23088a(String str) {
            TokenType tokenType = T1;
            if (tokenType.text.equals(str)) {
                return tokenType;
            }
            TokenType tokenType2 = T2;
            if (tokenType2.text.equals(str)) {
                return tokenType2;
            }
            return UNDEFINED;
        }

        public String toString() {
            return this.text;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$a */
    /* compiled from: Sta */
    public class C5044a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            SimpleTokenUtils.f22247d = null;
            SimpleTokenUtils.f22248e = null;
            SimpleTokenUtils.m23087f(context);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$c */
    /* compiled from: Sta */
    public class C5046c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f22257a;

        public C5046c(Context context) {
            this.f22257a = context;
        }

        public void run() {
            SimpleTokenUtils.m23086e(this.f22257a);
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m23077a() {
        if (f22247d != null) {
            return new Pair<>(((TokenType) f22247d.first).toString(), f22247d.second);
        }
        return new Pair<>(TokenType.T1.toString(), "");
    }

    /* renamed from: b */
    public static Pair<String, String> m23080b() {
        if (f22248e != null) {
            return new Pair<>(((TokenType) f22248e.first).toString(), f22248e.second);
        }
        return new Pair<>(TokenType.T2.toString(), "");
    }

    /* renamed from: c */
    public static long m23083c() {
        return f22246c;
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: d */
    public static void m23085d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> q = MetaData.f22407k.mo21205q();
        Set<String> A = MetaData.f22407k.mo21159A();
        f22244a = new CopyOnWriteArrayList();
        f22245b = new CopyOnWriteArrayList();
        try {
            List<PackageInfo> a = C12437y.m53776a(packageManager);
            f22246c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo next : a) {
                if (!C12437y.m53784a(next)) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        long j = next.firstInstallTime;
                        if (j < f22246c && j >= 1291593600000L) {
                            f22246c = j;
                        }
                    }
                    f22244a.add(next);
                    try {
                        String b = C5015nb.m22925b(context);
                        if (q != null && q.contains(b)) {
                            f22245b.add(next);
                        }
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                    }
                } else if (A.contains(next.packageName)) {
                    f22244a.add(next);
                } else if (next.packageName.equals(Constants.f54684a)) {
                    packageInfo = next;
                }
            }
            f22244a = m23079a(f22244a);
            f22245b = m23079a(f22245b);
            if (packageInfo != null) {
                f22244a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            C5004d4.m22887a(th2);
        }
    }

    /* renamed from: e */
    public static void m23086e(Context context) {
        boolean a = MetaData.f22407k.mo21165G().mo46418a(context);
        synchronized (SimpleTokenUtils.class) {
            if ((f22247d == null || f22248e == null) && a) {
                try {
                    m23085d(context);
                    f22247d = new Pair<>(TokenType.T1, C12347t9.m53508a(m23082b(f22244a)));
                    f22248e = new Pair<>(TokenType.T2, C12347t9.m53508a(m23082b(f22245b)));
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }
        return;
    }

    /* renamed from: f */
    public static void m23087f(Context context) {
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            context = a;
        }
        try {
            if ((f22247d == null || f22248e == null) && MetaData.f22407k.mo21165G().mo46418a(context)) {
                ComponentLocator.m23305a(context).mo21223j().execute(new C5046c(context));
            }
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: c */
    public static void m23084c(Context context) {
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            context = a;
        }
        m23087f(context);
        f22249f = true;
        f22250g = false;
        f22251h = TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new C5044a(), intentFilter);
        MetaData.f22407k.mo21186a((C5073c) new C5045b(context));
    }

    /* renamed from: a */
    public static Pair<TokenType, String> m23078a(Context context) {
        if (f22247d == null) {
            m23086e(context);
        }
        C5069e.C5070a a = ComponentLocator.m23305a(context).mo21217d().edit();
        String str = (String) f22247d.second;
        a.mo21101a("shared_prefs_simple_token", str);
        a.f22385a.putString("shared_prefs_simple_token", str);
        a.apply();
        f22249f = false;
        f22251h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T1, f22247d.second);
    }

    /* renamed from: b */
    public static Pair<TokenType, String> m23081b(Context context) {
        if (f22248e == null) {
            m23086e(context);
        }
        C5069e.C5070a a = ComponentLocator.m23305a(context).mo21217d().edit();
        String str = (String) f22248e.second;
        a.mo21101a("shared_prefs_simple_token2", str);
        a.f22385a.putString("shared_prefs_simple_token2", str);
        a.apply();
        f22249f = false;
        f22251h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T2, f22248e.second);
    }

    /* renamed from: com.startapp.sdk.adsbase.SimpleTokenUtils$b */
    /* compiled from: Sta */
    public class C5045b implements C5073c {

        /* renamed from: a */
        public final /* synthetic */ Context f22256a;

        public C5045b(Context context) {
            this.f22256a = context;
        }

        /* renamed from: a */
        public void mo20651a(MetaDataRequest.RequestReason requestReason, boolean z) {
            if (z) {
                SimpleTokenUtils.f22247d = null;
                SimpleTokenUtils.f22248e = null;
                SimpleTokenUtils.m23087f(this.f22256a);
            }
            MetaData.f22407k.mo21186a((C5073c) this);
        }

        /* renamed from: a */
        public void mo20650a(MetaDataRequest.RequestReason requestReason) {
            MetaData.f22407k.mo21186a((C5073c) this);
        }
    }

    /* renamed from: a */
    public static List<PackageInfo> m23079a(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (Build.VERSION.SDK_INT >= 9) {
            Collections.sort(arrayList, new C12373u9());
        }
        return arrayList.subList(0, 100);
    }

    /* renamed from: b */
    public static List<String> m23082b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            arrayList.add(packageInfo.packageName);
        }
        return arrayList;
    }
}
