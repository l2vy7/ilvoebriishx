package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C4612go;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.x10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6492o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzj implements zzg {
    @GuardedBy("lock")

    /* renamed from: A */
    private long f27903A = 0;

    /* renamed from: a */
    private final Object f27904a = new Object();

    /* renamed from: b */
    private boolean f27905b;

    /* renamed from: c */
    private final List<Runnable> f27906c = new ArrayList();

    /* renamed from: d */
    private mb3<?> f27907d;
    @GuardedBy("lock")

    /* renamed from: e */
    private C4612go f27908e = null;
    @GuardedBy("lock")

    /* renamed from: f */
    private SharedPreferences f27909f;
    @GuardedBy("lock")

    /* renamed from: g */
    private SharedPreferences.Editor f27910g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f27911h = true;
    @GuardedBy("lock")

    /* renamed from: i */
    private String f27912i;
    @GuardedBy("lock")

    /* renamed from: j */
    private String f27913j;
    @GuardedBy("lock")

    /* renamed from: k */
    private boolean f27914k = true;
    @GuardedBy("lock")

    /* renamed from: l */
    private in0 f27915l = new in0("", 0);
    @GuardedBy("lock")

    /* renamed from: m */
    private long f27916m = 0;
    @GuardedBy("lock")

    /* renamed from: n */
    private long f27917n = 0;
    @GuardedBy("lock")

    /* renamed from: o */
    private int f27918o = -1;
    @GuardedBy("lock")

    /* renamed from: p */
    private int f27919p = 0;
    @GuardedBy("lock")

    /* renamed from: q */
    private Set<String> f27920q = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: r */
    private JSONObject f27921r = new JSONObject();
    @GuardedBy("lock")

    /* renamed from: s */
    private boolean f27922s = true;
    @GuardedBy("lock")

    /* renamed from: t */
    private boolean f27923t = true;
    @GuardedBy("lock")

    /* renamed from: u */
    private String f27924u = null;
    @GuardedBy("lock")

    /* renamed from: v */
    private String f27925v = "";
    @GuardedBy("lock")

    /* renamed from: w */
    private boolean f27926w = false;
    @GuardedBy("lock")

    /* renamed from: x */
    private String f27927x = "";
    @GuardedBy("lock")

    /* renamed from: y */
    private int f27928y = -1;
    @GuardedBy("lock")

    /* renamed from: z */
    private int f27929z = -1;

    /* renamed from: b */
    private final void m28839b() {
        mb3<?> mb3 = this.f27907d;
        if (mb3 != null && !mb3.isDone()) {
            try {
                this.f27907d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                co0.zzk("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                co0.zzh("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: c */
    private final void m28840c() {
        po0.f37722a.execute(new zzh(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28615a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f27904a) {
            this.f27909f = sharedPreferences;
            this.f27910g = edit;
            if (C6492o.m28286i()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f27911h = this.f27909f.getBoolean("use_https", this.f27911h);
            this.f27922s = this.f27909f.getBoolean("content_url_opted_out", this.f27922s);
            this.f27912i = this.f27909f.getString("content_url_hashes", this.f27912i);
            this.f27914k = this.f27909f.getBoolean("gad_idless", this.f27914k);
            this.f27923t = this.f27909f.getBoolean("content_vertical_opted_out", this.f27923t);
            this.f27913j = this.f27909f.getString("content_vertical_hashes", this.f27913j);
            this.f27919p = this.f27909f.getInt("version_code", this.f27919p);
            this.f27915l = new in0(this.f27909f.getString("app_settings_json", this.f27915l.mo32721c()), this.f27909f.getLong("app_settings_last_update_ms", this.f27915l.mo32719a()));
            this.f27916m = this.f27909f.getLong("app_last_background_time_ms", this.f27916m);
            this.f27918o = this.f27909f.getInt("request_in_session_count", this.f27918o);
            this.f27917n = this.f27909f.getLong("first_ad_req_time_ms", this.f27917n);
            this.f27920q = this.f27909f.getStringSet("never_pool_slots", this.f27920q);
            this.f27924u = this.f27909f.getString("display_cutout", this.f27924u);
            this.f27928y = this.f27909f.getInt("app_measurement_npa", this.f27928y);
            this.f27929z = this.f27909f.getInt("sd_app_measure_npa", this.f27929z);
            this.f27903A = this.f27909f.getLong("sd_app_measure_npa_ts", this.f27903A);
            this.f27925v = this.f27909f.getString("inspector_info", this.f27925v);
            this.f27926w = this.f27909f.getBoolean("linked_device", this.f27926w);
            this.f27927x = this.f27909f.getString("linked_ad_unit", this.f27927x);
            try {
                this.f27921r = new JSONObject(this.f27909f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                co0.zzk("Could not convert native advanced settings to json object", e);
            }
            m28840c();
        }
    }

    public final void zzA(String str) {
        m28839b();
        synchronized (this.f27904a) {
            if (!TextUtils.equals(this.f27924u, str)) {
                this.f27924u = str;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzB(long j) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27917n != j) {
                this.f27917n = j;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzC(String str) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
            m28839b();
            synchronized (this.f27904a) {
                if (!this.f27925v.equals(str)) {
                    this.f27925v = str;
                    SharedPreferences.Editor editor = this.f27910g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f27910g.apply();
                    }
                    m28840c();
                }
            }
        }
    }

    public final void zzD(boolean z) {
        m28839b();
        synchronized (this.f27904a) {
            if (z != this.f27914k) {
                this.f27914k = z;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzE(String str, String str2, boolean z) {
        m28839b();
        synchronized (this.f27904a) {
            JSONArray optJSONArray = this.f27921r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i;
                        } else {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzt.zzA().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f27921r.put(str, optJSONArray);
            } catch (JSONException e) {
                co0.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f27910g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f27921r.toString());
                this.f27910g.apply();
            }
            m28840c();
        }
    }

    public final void zzF(int i) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27918o != i) {
                this.f27918o = i;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzG(int i) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27929z != i) {
                this.f27929z = i;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzH(long j) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27903A != j) {
                this.f27903A = j;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final boolean zzI() {
        boolean z;
        m28839b();
        synchronized (this.f27904a) {
            z = this.f27922s;
        }
        return z;
    }

    public final boolean zzJ() {
        boolean z;
        m28839b();
        synchronized (this.f27904a) {
            z = this.f27923t;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        m28839b();
        synchronized (this.f27904a) {
            z = this.f27926w;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37166o0)).booleanValue()) {
            return false;
        }
        m28839b();
        synchronized (this.f27904a) {
            z = this.f27914k;
        }
        return z;
    }

    public final int zza() {
        int i;
        m28839b();
        synchronized (this.f27904a) {
            i = this.f27919p;
        }
        return i;
    }

    public final int zzb() {
        int i;
        m28839b();
        synchronized (this.f27904a) {
            i = this.f27918o;
        }
        return i;
    }

    public final long zzc() {
        long j;
        m28839b();
        synchronized (this.f27904a) {
            j = this.f27916m;
        }
        return j;
    }

    public final long zzd() {
        long j;
        m28839b();
        synchronized (this.f27904a) {
            j = this.f27917n;
        }
        return j;
    }

    public final long zze() {
        long j;
        m28839b();
        synchronized (this.f27904a) {
            j = this.f27903A;
        }
        return j;
    }

    public final C4612go zzf() {
        if (!this.f27905b) {
            return null;
        }
        if ((zzI() && zzJ()) || !x10.f40983b.mo34648e().booleanValue()) {
            return null;
        }
        synchronized (this.f27904a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f27908e == null) {
                this.f27908e = new C4612go();
            }
            this.f27908e.mo18354e();
            co0.zzi("start fetching content...");
            C4612go goVar = this.f27908e;
            return goVar;
        }
    }

    public final in0 zzg() {
        in0 in0;
        m28839b();
        synchronized (this.f27904a) {
            in0 = this.f27915l;
        }
        return in0;
    }

    public final in0 zzh() {
        in0 in0;
        synchronized (this.f27904a) {
            in0 = this.f27915l;
        }
        return in0;
    }

    public final String zzi() {
        String str;
        m28839b();
        synchronized (this.f27904a) {
            str = this.f27912i;
        }
        return str;
    }

    public final String zzj() {
        String str;
        m28839b();
        synchronized (this.f27904a) {
            str = this.f27913j;
        }
        return str;
    }

    public final String zzk() {
        String str;
        m28839b();
        synchronized (this.f27904a) {
            str = this.f27927x;
        }
        return str;
    }

    public final String zzl() {
        String str;
        m28839b();
        synchronized (this.f27904a) {
            str = this.f27924u;
        }
        return str;
    }

    public final String zzm() {
        String str;
        m28839b();
        synchronized (this.f27904a) {
            str = this.f27925v;
        }
        return str;
    }

    public final JSONObject zzn() {
        JSONObject jSONObject;
        m28839b();
        synchronized (this.f27904a) {
            jSONObject = this.f27921r;
        }
        return jSONObject;
    }

    public final void zzo(Runnable runnable) {
        this.f27906c.add(runnable);
    }

    public final void zzp(Context context) {
        synchronized (this.f27904a) {
            if (this.f27909f == null) {
                this.f27907d = po0.f37722a.mo33676c(new zzi(this, context, "admob"));
                this.f27905b = true;
            }
        }
    }

    public final void zzq() {
        m28839b();
        synchronized (this.f27904a) {
            this.f27921r = new JSONObject();
            SharedPreferences.Editor editor = this.f27910g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f27910g.apply();
            }
            m28840c();
        }
    }

    public final void zzr(long j) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27916m != j) {
                this.f27916m = j;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzs(String str) {
        m28839b();
        synchronized (this.f27904a) {
            long currentTimeMillis = zzt.zzA().currentTimeMillis();
            if (str != null) {
                if (!str.equals(this.f27915l.mo32721c())) {
                    this.f27915l = new in0(str, currentTimeMillis);
                    SharedPreferences.Editor editor = this.f27910g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f27910g.putLong("app_settings_last_update_ms", currentTimeMillis);
                        this.f27910g.apply();
                    }
                    m28840c();
                    for (Runnable run : this.f27906c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f27915l.mo32725g(currentTimeMillis);
        }
    }

    public final void zzt(int i) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27919p != i) {
                this.f27919p = i;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzu(String str) {
        m28839b();
        synchronized (this.f27904a) {
            if (!str.equals(this.f27912i)) {
                this.f27912i = str;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzv(boolean z) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27922s != z) {
                this.f27922s = z;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzw(String str) {
        m28839b();
        synchronized (this.f27904a) {
            if (!str.equals(this.f27913j)) {
                this.f27913j = str;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzx(boolean z) {
        m28839b();
        synchronized (this.f27904a) {
            if (this.f27923t != z) {
                this.f27923t = z;
                SharedPreferences.Editor editor = this.f27910g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f27910g.apply();
                }
                m28840c();
            }
        }
    }

    public final void zzy(String str) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
            m28839b();
            synchronized (this.f27904a) {
                if (!this.f27927x.equals(str)) {
                    this.f27927x = str;
                    SharedPreferences.Editor editor = this.f27910g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f27910g.apply();
                    }
                    m28840c();
                }
            }
        }
    }

    public final void zzz(boolean z) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
            m28839b();
            synchronized (this.f27904a) {
                if (this.f27926w != z) {
                    this.f27926w = z;
                    SharedPreferences.Editor editor = this.f27910g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f27910g.apply();
                    }
                    m28840c();
                }
            }
        }
    }
}
