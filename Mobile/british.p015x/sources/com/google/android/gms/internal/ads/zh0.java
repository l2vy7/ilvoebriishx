package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.C7353b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
import p193c5.C6520c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zh0 implements bi0 {

    /* renamed from: f */
    private static final Object f21043f = new Object();

    /* renamed from: g */
    static bi0 f21044g;

    /* renamed from: h */
    static bi0 f21045h;

    /* renamed from: a */
    private final Object f21046a = new Object();

    /* renamed from: b */
    private final Context f21047b;

    /* renamed from: c */
    private final WeakHashMap<Thread, Boolean> f21048c = new WeakHashMap<>();

    /* renamed from: d */
    private final ExecutorService f21049d;

    /* renamed from: e */
    private final zzcjf f21050e;

    protected zh0(Context context, zzcjf zzcjf) {
        c33.m30893a();
        this.f21049d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f21047b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f21050e = zzcjf;
    }

    /* renamed from: c */
    public static bi0 m21287c(Context context) {
        synchronized (f21043f) {
            if (f21044g == null) {
                if (m20.f35360e.mo34648e().booleanValue()) {
                    if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36885G5)).booleanValue()) {
                        f21044g = new zh0(context, zzcjf.m40656C0());
                    }
                }
                f21044g = new ai0();
            }
        }
        return f21044g;
    }

    /* renamed from: d */
    public static bi0 m21288d(Context context, zzcjf zzcjf) {
        synchronized (f21043f) {
            if (f21045h == null) {
                if (m20.f35360e.mo34648e().booleanValue()) {
                    if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36885G5)).booleanValue()) {
                        zh0 zh0 = new zh0(context, zzcjf);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zh0.f21046a) {
                                zh0.f21048c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new yh0(zh0, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new xh0(zh0, Thread.getDefaultUncaughtExceptionHandler()));
                        f21045h = zh0;
                    }
                }
                f21045h = new ai0();
            }
        }
        return f21045h;
    }

    /* renamed from: a */
    public final void mo19057a(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (vn0.m38850f(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = C6520c.m28321a(this.f21047b).mo24356g();
                } catch (Throwable th2) {
                    co0.zzh("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f21047b.getPackageName();
                } catch (Throwable unused) {
                    co0.zzj("Cannot obtain package name, proceeding.");
                    str2 = C3791bd.UNKNOWN_CONTENT_TYPE;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f21050e.f43036b).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", p00.m35911a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "428884702").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(m20.f35358c.mo34648e())).appendQueryParameter("gmscv", String.valueOf(C7353b.m29920h().mo29973b(this.f21047b))).appendQueryParameter("lite", true != this.f21050e.f43040f ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).toString());
                for (String wh0 : arrayList) {
                    this.f21049d.execute(new wh0(new io0((String) null), wh0));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo19058b(Throwable th, String str) {
        mo19057a(th, str, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo19059e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= vn0.m38851j(stackTraceElement.getClassName());
                    z2 |= zh0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                mo19057a(th, "", 1.0f);
            }
        }
    }
}
