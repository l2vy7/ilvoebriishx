package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nv0 extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f36153a;

    /* renamed from: b */
    private Context f36154b;

    /* renamed from: c */
    private Context f36155c;

    public nv0(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo33767a() {
        return this.f36153a;
    }

    /* renamed from: b */
    public final Context mo33768b() {
        return this.f36155c;
    }

    public final Object getSystemService(String str) {
        return this.f36155c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36154b = applicationContext;
        this.f36153a = context instanceof Activity ? (Activity) context : null;
        this.f36155c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f36153a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f36154b.startActivity(intent);
    }
}
