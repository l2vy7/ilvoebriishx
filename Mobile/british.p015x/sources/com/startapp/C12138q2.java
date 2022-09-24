package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.startapp.q2 */
/* compiled from: Sta */
public class C12138q2 {

    /* renamed from: c */
    private static final String f54045c = "q2";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object f54046a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InetAddress f54047b;

    /* renamed from: com.startapp.q2$a */
    /* compiled from: Sta */
    public class C12139a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54048a;

        public C12139a(String str) {
            this.f54048a = str;
        }

        public void run() {
            try {
                InetAddress byName = InetAddress.getByName(this.f54048a);
                synchronized (C12138q2.this.f54046a) {
                    InetAddress unused = C12138q2.this.f54047b = byName;
                }
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        }
    }

    /* renamed from: a */
    public String mo45691a(String str, int i) throws UnknownHostException {
        String hostAddress;
        this.f54046a = new Object();
        Thread thread = new Thread(new C12139a(str));
        thread.start();
        try {
            thread.join((long) i);
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
        synchronized (this.f54046a) {
            InetAddress inetAddress = this.f54047b;
            if (inetAddress != null) {
                hostAddress = inetAddress.getHostAddress();
            } else {
                throw new UnknownHostException();
            }
        }
        return hostAddress;
    }
}
