package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.C7355d;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p192c5.C6520c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class n00 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: b */
    private final Object f20551b = new Object();

    /* renamed from: c */
    private final ConditionVariable f20552c = new ConditionVariable();

    /* renamed from: d */
    private volatile boolean f20553d = false;

    /* renamed from: e */
    volatile boolean f20554e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SharedPreferences f20555f = null;

    /* renamed from: g */
    private Bundle f20556g = new Bundle();

    /* renamed from: h */
    private Context f20557h;

    /* renamed from: i */
    private JSONObject f20558i = new JSONObject();

    /* renamed from: f */
    private final void m20714f() {
        if (this.f20555f != null) {
            try {
                this.f20558i = new JSONObject((String) r00.m36840a(new k00(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo18570b(h00<T> h00) {
        if (!this.f20552c.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            synchronized (this.f20551b) {
                if (!this.f20554e) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f20553d || this.f20555f == null) {
            synchronized (this.f20551b) {
                if (this.f20553d) {
                    if (this.f20555f == null) {
                    }
                }
                T l = h00.mo32311l();
                return l;
            }
        }
        if (h00.mo32310e() == 2) {
            Bundle bundle = this.f20556g;
            if (bundle == null) {
                return h00.mo32311l();
            }
            return h00.mo30275b(bundle);
        } else if (h00.mo32310e() != 1 || !this.f20558i.has(h00.mo32312m())) {
            return r00.m36840a(new l00(this, h00));
        } else {
            return h00.mo30274a(this.f20558i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo18571c(h00 h00) {
        return h00.mo30276c(this.f20555f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo18572d() {
        return this.f20555f.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void mo18573e(Context context) {
        if (!this.f20553d) {
            synchronized (this.f20551b) {
                if (!this.f20553d) {
                    if (!this.f20554e) {
                        this.f20554e = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f20557h = applicationContext;
                    try {
                        this.f20556g = C6520c.m28321a(applicationContext).mo24352c(this.f20557h.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context e = C7355d.m29939e(context);
                        if (!(e == null && (e = context.getApplicationContext()) == null)) {
                            context = e;
                        }
                        if (context != null) {
                            C8311wv.m39276b();
                            SharedPreferences a = j00.m33504a(context);
                            this.f20555f = a;
                            if (a != null) {
                                a.registerOnSharedPreferenceChangeListener(this);
                            }
                            v20.m38685c(new m00(this));
                            m20714f();
                            this.f20553d = true;
                            this.f20554e = false;
                            this.f20552c.open();
                        }
                    } finally {
                        this.f20554e = false;
                        this.f20552c.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m20714f();
        }
    }
}
