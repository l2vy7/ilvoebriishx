package p186z5;

import android.annotation.SuppressLint;
import android.util.Log;

/* renamed from: z5.d */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C11148d {
    /* renamed from: a */
    public static int m49745a(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 3)) {
            return Log.d("Vision", String.format(str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m49746b(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return Log.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: c */
    public static int m49747c(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        if (Log.isLoggable("Vision", 3)) {
            return Log.e("Vision", String.format(str, objArr), th);
        }
        String format = String.format(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + valueOf.length());
        sb.append(format);
        sb.append(": ");
        sb.append(valueOf);
        return Log.e("Vision", sb.toString());
    }

    /* renamed from: d */
    public static int m49748d(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public static int m49749e(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
