package com.startapp;

import android.os.HandlerThread;

/* renamed from: com.startapp.p3 */
/* compiled from: Sta */
public class C12124p3 extends HandlerThread {

    /* renamed from: a */
    public final Object f54004a = new Object();

    public C12124p3(String str) {
        super(str);
    }

    public void onLooperPrepared() {
        synchronized (this.f54004a) {
            this.f54004a.notifyAll();
        }
    }

    public void start() {
        synchronized (this.f54004a) {
            super.start();
            try {
                this.f54004a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
