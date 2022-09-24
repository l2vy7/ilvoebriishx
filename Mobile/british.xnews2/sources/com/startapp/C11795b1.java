package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.b1 */
/* compiled from: Sta */
public class C11795b1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f52595a;

    /* renamed from: b */
    public final /* synthetic */ String f52596b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f52597c;

    /* renamed from: d */
    public final /* synthetic */ Context f52598d;

    public C11795b1(String str, String str2, Bitmap bitmap, Context context) {
        this.f52595a = str;
        this.f52596b = str2;
        this.f52597c = bitmap;
        this.f52598d = context;
    }

    public void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ((ConcurrentHashMap) C11812c1.f52641a).put(this.f52595a + this.f52596b, this.f52597c);
        try {
            fileOutputStream = new FileOutputStream(this.f52598d.getFilesDir().getPath() + "/" + this.f52595a + this.f52596b);
            try {
                this.f52597c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                C5015nb.m22917a((Closeable) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    C5004d4.m22887a(th);
                } finally {
                    C5015nb.m22917a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            C5004d4.m22887a(th);
        }
    }
}
