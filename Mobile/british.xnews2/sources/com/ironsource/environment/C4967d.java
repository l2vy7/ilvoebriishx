package com.ironsource.environment;

import android.os.Build;
import java.lang.Thread;

/* renamed from: com.ironsource.environment.d */
public final class C4967d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f22026a;

    C4967d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f22026a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            sb.append(System.lineSeparator());
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(";" + System.lineSeparator());
                if (stackTraceElement.toString().contains(C4970e.m22762a().f22038i)) {
                    z = true;
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                sb.append("--CAUSE");
                sb.append(System.lineSeparator());
                sb.append(cause.toString());
                sb.append(System.lineSeparator());
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    sb.append(stackTraceElement2.toString());
                    sb.append(";" + System.lineSeparator());
                    if (stackTraceElement2.toString().contains(C4970e.m22762a().f22038i)) {
                        z = true;
                    }
                }
            }
            if (z) {
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis());
                new C4961c(sb2, sb3.toString(), "Crash").mo20579d();
            }
            this.f22026a.uncaughtException(thread, th);
        }
    }
}
