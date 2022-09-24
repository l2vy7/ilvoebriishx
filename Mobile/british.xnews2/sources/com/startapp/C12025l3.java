package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.startapp.l3 */
/* compiled from: Sta */
public class C12025l3 extends C12379v0 {

    /* renamed from: com.startapp.l3$a */
    /* compiled from: Sta */
    public class C12026a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11966i9 f53246a;

        public C12026a(C11966i9 i9Var) {
            this.f53246a = i9Var;
        }

        public void run() {
            JSONArray jSONArray;
            C11966i9 i9Var = this.f53246a;
            i9Var.f53108c.unregisterListener(i9Var.f53111f);
            C12128p7 p7Var = C12025l3.this.f54864b;
            C11966i9 i9Var2 = this.f53246a;
            i9Var2.getClass();
            try {
                jSONArray = i9Var2.f53107b.mo45407a();
            } catch (Exception unused) {
                jSONArray = null;
            }
            p7Var.mo45392a(jSONArray);
        }
    }

    public C12025l3(Context context, C12128p7 p7Var) {
        super(context, p7Var);
    }

    /* renamed from: a */
    public void mo45343a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f22407k.mo21163E().mo46416k());
            C11966i9 i9Var = new C11966i9(this.f54863a, this.f54864b);
            this.f54865c.postDelayed(new C12026a(i9Var), millis);
            i9Var.mo45450b();
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            this.f54864b.mo45392a((Object) null);
        }
    }
}
