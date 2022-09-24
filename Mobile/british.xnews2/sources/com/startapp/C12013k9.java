package com.startapp;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.k9 */
/* compiled from: Sta */
public class C12013k9 implements Executor {

    /* renamed from: a */
    public final Queue<Runnable> f53206a;

    /* renamed from: b */
    public final Executor f53207b;

    /* renamed from: c */
    public Runnable f53208c;

    /* renamed from: com.startapp.k9$a */
    /* compiled from: Sta */
    public class C12014a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f53209a;

        public C12014a(Runnable runnable) {
            this.f53209a = runnable;
        }

        public void run() {
            try {
                this.f53209a.run();
            } finally {
                C12013k9.this.mo45506a();
            }
        }
    }

    public C12013k9(Executor executor) {
        if (Build.VERSION.SDK_INT >= 9) {
            this.f53206a = new ArrayDeque();
        } else {
            this.f53206a = new LinkedList();
        }
        this.f53207b = executor;
    }

    /* renamed from: a */
    public synchronized void mo45506a() {
        Runnable poll = this.f53206a.poll();
        this.f53208c = poll;
        if (poll != null) {
            this.f53207b.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f53206a.offer(new C12014a(runnable));
        if (this.f53208c == null) {
            mo45506a();
        }
    }
}
