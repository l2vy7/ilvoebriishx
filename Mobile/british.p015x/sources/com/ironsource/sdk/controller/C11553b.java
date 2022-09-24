package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b */
public final class C11553b {

    /* renamed from: a */
    private int f51931a = C11554a.f51934a;

    /* renamed from: b */
    private ArrayList f51932b = new ArrayList();

    /* renamed from: c */
    private String f51933c;

    /* renamed from: com.ironsource.sdk.controller.b$a */
    enum C11554a {
        ;
        

        /* renamed from: a */
        public static final int f51934a = 1;

        /* renamed from: b */
        public static final int f51935b = 2;

        static {
            f51936c = new int[]{1, 2};
        }
    }

    public C11553b(String str) {
        this.f51933c = str;
    }

    /* renamed from: a */
    public final synchronized void mo44686a() {
        this.f51931a = C11554a.f51935b;
    }

    /* renamed from: a */
    public final synchronized void mo44687a(Runnable runnable) {
        if (this.f51931a != C11554a.f51935b) {
            this.f51932b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo44688b() {
        Object[] array = this.f51932b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f51932b.clear();
    }
}
