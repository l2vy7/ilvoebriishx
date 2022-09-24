package p082g3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C3752u;
import com.facebook.appevents.C3406g;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3561x;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.Locale;
import p124o3.C5871a;

/* renamed from: g3.j */
/* compiled from: SessionLogger */
class C5352j {

    /* renamed from: a */
    private static final String f23567a = "g3.j";

    /* renamed from: b */
    private static final long[] f23568b = {DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: a */
    private static String m24094a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String a = C5344f.m24056a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            sharedPreferences.edit().putString(str, a).apply();
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static int m24095b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = f23568b;
            if (i >= jArr.length || jArr[i] >= j) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public static void m24096c(String str, C5353k kVar, String str2, Context context) {
        String kVar2 = kVar != null ? kVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", kVar2);
        bundle.putString("fb_mobile_pckg_fp", m24094a(context));
        bundle.putString("fb_mobile_app_cert_hash", C5871a.m25868a(context));
        C3420m mVar = new C3420m(str, str2, (AccessToken) null);
        mVar.mo11845f("fb_mobile_activate_app", bundle);
        if (C3420m.m11431c() != C3406g.C3407a.EXPLICIT_ONLY) {
            mVar.mo11843a();
        }
    }

    /* renamed from: d */
    private static void m24097d() {
        C3561x.m11893g(C3752u.APP_EVENTS, f23567a, "Clock skew detected");
    }

    /* renamed from: e */
    public static void m24098e(String str, C5351i iVar, String str2) {
        Long valueOf = Long.valueOf(iVar.mo21650b() - iVar.mo21653e().longValue());
        Long l = 0L;
        if (valueOf.longValue() < 0) {
            m24097d();
            valueOf = l;
        }
        Long valueOf2 = Long.valueOf(iVar.mo21654f());
        if (valueOf2.longValue() < 0) {
            m24097d();
        } else {
            l = valueOf2;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", iVar.mo21651c());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m24095b(valueOf.longValue()))}));
        C5353k g = iVar.mo21655g();
        bundle.putString("fb_mobile_launch_source", g != null ? g.toString() : "Unclassified");
        bundle.putLong("_logTime", iVar.mo21653e().longValue() / 1000);
        C3420m mVar = new C3420m(str, str2, (AccessToken) null);
        double longValue = (double) l.longValue();
        Double.isNaN(longValue);
        mVar.mo11844e("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
    }
}
