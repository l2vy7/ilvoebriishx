package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.C7355d;
import org.json.JSONException;
import org.json.JSONObject;
import p192c5.C6520c;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoi */
/* compiled from: IMASDK */
public final class aoi implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile boolean f15476a = false;

    /* renamed from: b */
    private final Object f15477b = new Object();

    /* renamed from: c */
    private final ConditionVariable f15478c = new ConditionVariable();

    /* renamed from: d */
    private volatile boolean f15479d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SharedPreferences f15480e = null;

    /* renamed from: f */
    private Bundle f15481f = new Bundle();

    /* renamed from: g */
    private Context f15482g;

    /* renamed from: h */
    private JSONObject f15483h = new JSONObject();

    /* renamed from: f */
    private final void m14462f() {
        if (this.f15480e != null) {
            try {
                this.f15483h = new JSONObject((String) aol.m14469a(new aog(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo14155a(Context context) {
        if (!this.f15479d) {
            synchronized (this.f15477b) {
                if (!this.f15479d) {
                    if (!this.f15476a) {
                        this.f15476a = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f15482g = applicationContext;
                    try {
                        this.f15481f = C6520c.m28321a(applicationContext).mo24352c(this.f15482g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context e = C7355d.m29939e(context);
                        if (!(e == null && (e = context.getApplicationContext()) == null)) {
                            context = e;
                        }
                        if (context != null) {
                            anx.m14428c();
                            SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                            this.f15480e = sharedPreferences;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                            }
                            aoq.m14474b(new aoh(this));
                            m14462f();
                            this.f15479d = true;
                            return;
                        }
                        this.f15476a = false;
                        this.f15478c.open();
                    } finally {
                        this.f15476a = false;
                        this.f15478c.open();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo14156b(aod<T> aod) {
        if (!this.f15478c.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            synchronized (this.f15477b) {
                if (!this.f15476a) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f15479d || this.f15480e == null) {
            synchronized (this.f15477b) {
                if (this.f15479d) {
                    if (this.f15480e == null) {
                    }
                }
                T e = aod.mo14148e();
                return e;
            }
        }
        if (aod.mo14150h() == 2) {
            Bundle bundle = this.f15481f;
            if (bundle == null) {
                return aod.mo14148e();
            }
            return aod.mo14143a(bundle);
        } else if (aod.mo14150h() != 1 || !this.f15483h.has(aod.mo14147d())) {
            return aol.m14469a(new aof(this, aod));
        } else {
            return aod.mo14144b(this.f15483h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo14157c() {
        return this.f15480e.getString("flag_configuration", "{}");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo14158d(aod aod) {
        return aod.mo14145c(this.f15480e);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m14462f();
        }
    }
}
