package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9098c6 {

    /* renamed from: a */
    static volatile C9344s6 f44922a = C9344s6.m43616c();

    /* renamed from: b */
    private static final Object f44923b = new Object();

    /* renamed from: a */
    public static boolean m42749a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f44922a.mo19214b()) {
            return ((Boolean) f44922a.mo19213a()).booleanValue();
        } else {
            synchronized (f44923b) {
                if (f44922a.mo19214b()) {
                    boolean booleanValue = ((Boolean) f44922a.mo19213a()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f44922a = C9344s6.m43617d(Boolean.valueOf(z));
                    return ((Boolean) f44922a.mo19213a()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f44922a = C9344s6.m43617d(Boolean.valueOf(z));
                return ((Boolean) f44922a.mo19213a()).booleanValue();
            }
        }
    }
}
