package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.d1 */
/* compiled from: Sta */
public class C11840d1 {

    /* renamed from: a */
    public final Context f52719a;

    /* renamed from: b */
    public String f52720b;

    /* renamed from: c */
    public C11843b f52721c;

    /* renamed from: d */
    public int f52722d;

    /* renamed from: com.startapp.d1$a */
    /* compiled from: Sta */
    public class C11841a implements Runnable {

        /* renamed from: com.startapp.d1$a$a */
        /* compiled from: Sta */
        public class C11842a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f52724a;

            public C11842a(Bitmap bitmap) {
                this.f52724a = bitmap;
            }

            public void run() {
                C11840d1 d1Var = C11840d1.this;
                C11843b bVar = d1Var.f52721c;
                if (bVar != null) {
                    bVar.mo20798a(this.f52724a, d1Var.f52722d);
                }
            }
        }

        public C11841a() {
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C11842a(C11878e1.m52263b(C11840d1.this.f52720b)));
        }
    }

    /* renamed from: com.startapp.d1$b */
    /* compiled from: Sta */
    public interface C11843b {
        /* renamed from: a */
        void mo20798a(Bitmap bitmap, int i);
    }

    public C11840d1(Context context, String str, C11843b bVar, int i) {
        this.f52719a = context;
        this.f52720b = str;
        this.f52721c = bVar;
        this.f52722d = i;
    }

    /* renamed from: a */
    public void mo45233a() {
        ComponentLocator.m23305a(this.f52719a).f22460z.mo46698b().execute(new C11841a());
    }
}
