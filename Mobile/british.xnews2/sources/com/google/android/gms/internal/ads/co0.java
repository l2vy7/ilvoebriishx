package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class co0 {

    /* renamed from: a */
    protected static final k43 f30442a = k43.m33840b(4000);

    /* renamed from: a */
    static String m31073a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void zze(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f30442a.mo33028d(str)) {
            if (z) {
                Log.d("Ads", next);
            } else {
                Log.d("Ads-cont", next);
            }
            z = false;
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f30442a.mo33028d(str)) {
            if (z) {
                Log.e("Ads", next);
            } else {
                Log.e("Ads-cont", next);
            }
            z = false;
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f30442a.mo33028d(str)) {
            if (z) {
                Log.i("Ads", next);
            } else {
                Log.i("Ads-cont", next);
            }
            z = false;
        }
    }

    public static void zzj(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f30442a.mo33028d(str)) {
            if (z) {
                Log.w("Ads", next);
            } else {
                Log.w("Ads-cont", next);
            }
            z = false;
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (!zzm(5)) {
            return;
        }
        if (th != null) {
            zzk(m31073a(str), th);
        } else {
            zzj(m31073a(str));
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
