package com.startapp;

import android.os.Build;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.startapp.na */
/* compiled from: Sta */
public class C12077na implements Iterator<Throwable> {

    /* renamed from: a */
    public Throwable f53330a;

    /* renamed from: b */
    public Throwable[] f53331b;

    /* renamed from: c */
    public int f53332c;

    /* renamed from: d */
    public boolean f53333d;

    public C12077na(Throwable th) {
        this.f53330a = th;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f53331b = th.getSuppressed();
        }
    }

    /* renamed from: a */
    public Throwable next() {
        int i;
        Throwable th = this.f53330a;
        boolean z = false;
        this.f53333d = false;
        if (th != null) {
            this.f53330a = th.getCause();
        } else {
            Throwable[] thArr = this.f53331b;
            if (thArr != null && (i = this.f53332c) < thArr.length) {
                if (i == 0) {
                    z = true;
                }
                this.f53333d = z;
                this.f53332c = i + 1;
                th = thArr[i];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f53331b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r2 = this;
            java.lang.Throwable r0 = r2.f53330a
            if (r0 != 0) goto L_0x0010
            java.lang.Throwable[] r0 = r2.f53331b
            if (r0 == 0) goto L_0x000e
            int r1 = r2.f53332c
            int r0 = r0.length
            if (r1 >= r0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12077na.hasNext():boolean");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
