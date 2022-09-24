package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;

/* renamed from: com.startapp.dd */
/* compiled from: Sta */
public class C11873dd {

    /* renamed from: a */
    public final Context f52872a;

    /* renamed from: b */
    public WebView f52873b;

    /* renamed from: com.startapp.dd$a */
    /* compiled from: Sta */
    public class C11874a implements MessageQueue.IdleHandler {
        public C11874a() {
        }

        public boolean queueIdle() {
            C11873dd ddVar = C11873dd.this;
            if (ddVar.f52873b != null) {
                return false;
            }
            try {
                ddVar.f52873b = new WebView(ddVar.f52872a);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public C11873dd(Context context) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f52872a = context;
        } else {
            this.f52872a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, (Bundle) null);
        }
        mo45308a();
    }

    /* renamed from: a */
    public final void mo45308a() {
        MessageQueue myQueue = Looper.myQueue();
        if (myQueue != null) {
            myQueue.addIdleHandler(new C11874a());
        }
    }

    /* renamed from: b */
    public WebView mo45309b() {
        WebView webView = this.f52873b;
        if (webView == null) {
            return new WebView(this.f52872a);
        }
        this.f52873b = null;
        MessageQueue myQueue = Looper.myQueue();
        if (myQueue == null) {
            return webView;
        }
        myQueue.addIdleHandler(new C11874a());
        return webView;
    }
}
