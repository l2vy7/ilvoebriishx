package com.startapp;

import android.content.Context;
import java.lang.Thread;

/* renamed from: com.startapp.r */
/* compiled from: Sta */
public class C12153r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f54080a;

    public C12153r(Context context) {
    }

    /* renamed from: a */
    public final void mo45698a(Thread thread, Throwable th) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f54080a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (C5015nb.m22904a(th) != null) {
                if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th.getMessage())) {
                    mo45698a(thread, th);
                    return;
                }
                C5004d4.m22888a(th, C11882e4.f52889h);
            }
        } catch (Throwable unused) {
        }
        mo45698a(thread, th);
    }
}
