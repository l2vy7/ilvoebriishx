package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;

/* renamed from: com.google.android.gms.internal.measurement.dc */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9120dc implements C9104cc {

    /* renamed from: A */
    public static final C4659n6 f44958A;

    /* renamed from: B */
    public static final C4659n6 f44959B;

    /* renamed from: C */
    public static final C4659n6 f44960C;

    /* renamed from: D */
    public static final C4659n6 f44961D;

    /* renamed from: E */
    public static final C4659n6 f44962E;

    /* renamed from: F */
    public static final C4659n6 f44963F;

    /* renamed from: G */
    public static final C4659n6 f44964G;

    /* renamed from: H */
    public static final C4659n6 f44965H;

    /* renamed from: I */
    public static final C4659n6 f44966I;

    /* renamed from: J */
    public static final C4659n6 f44967J;

    /* renamed from: K */
    public static final C4659n6 f44968K;

    /* renamed from: L */
    public static final C4659n6 f44969L;

    /* renamed from: a */
    public static final C4659n6 f44970a;

    /* renamed from: b */
    public static final C4659n6 f44971b;

    /* renamed from: c */
    public static final C4659n6 f44972c;

    /* renamed from: d */
    public static final C4659n6 f44973d;

    /* renamed from: e */
    public static final C4659n6 f44974e;

    /* renamed from: f */
    public static final C4659n6 f44975f;

    /* renamed from: g */
    public static final C4659n6 f44976g;

    /* renamed from: h */
    public static final C4659n6 f44977h;

    /* renamed from: i */
    public static final C4659n6 f44978i;

    /* renamed from: j */
    public static final C4659n6 f44979j;

    /* renamed from: k */
    public static final C4659n6 f44980k;

    /* renamed from: l */
    public static final C4659n6 f44981l;

    /* renamed from: m */
    public static final C4659n6 f44982m;

    /* renamed from: n */
    public static final C4659n6 f44983n;

    /* renamed from: o */
    public static final C4659n6 f44984o;

    /* renamed from: p */
    public static final C4659n6 f44985p;

    /* renamed from: q */
    public static final C4659n6 f44986q;

    /* renamed from: r */
    public static final C4659n6 f44987r;

    /* renamed from: s */
    public static final C4659n6 f44988s;

    /* renamed from: t */
    public static final C4659n6 f44989t;

    /* renamed from: u */
    public static final C4659n6 f44990u;

    /* renamed from: v */
    public static final C4659n6 f44991v;

    /* renamed from: w */
    public static final C4659n6 f44992w;

    /* renamed from: x */
    public static final C4659n6 f44993x;

    /* renamed from: y */
    public static final C4659n6 f44994y;

    /* renamed from: z */
    public static final C4659n6 f44995z;

    static {
        C4657k6 k6Var = new C4657k6(C9114d6.m42777a("com.google.android.gms.measurement"));
        f44970a = k6Var.mo19203c("measurement.ad_id_cache_time", ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
        f44971b = k6Var.mo19203c("measurement.max_bundles_per_iteration", 100);
        f44972c = k6Var.mo19203c("measurement.config.cache_time", 86400000);
        f44973d = k6Var.mo19204d("measurement.log_tag", "FA");
        f44974e = k6Var.mo19204d("measurement.config.url_authority", "app-measurement.com");
        f44975f = k6Var.mo19204d("measurement.config.url_scheme", "https");
        f44976g = k6Var.mo19203c("measurement.upload.debug_upload_interval", 1000);
        f44977h = k6Var.mo19203c("measurement.lifetimevalue.max_currency_tracked", 4);
        f44978i = k6Var.mo19203c("measurement.store.max_stored_events_per_app", 100000);
        f44979j = k6Var.mo19203c("measurement.experiment.max_ids", 50);
        f44980k = k6Var.mo19203c("measurement.audience.filter_result_max_count", 200);
        f44981l = k6Var.mo19203c("measurement.alarm_manager.minimum_interval", 60000);
        f44982m = k6Var.mo19203c("measurement.upload.minimum_delay", 500);
        f44983n = k6Var.mo19203c("measurement.monitoring.sample_period_millis", 86400000);
        f44984o = k6Var.mo19203c("measurement.upload.realtime_upload_interval", ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
        f44985p = k6Var.mo19203c("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f44986q = k6Var.mo19203c("measurement.config.cache_time.service", 3600000);
        f44987r = k6Var.mo19203c("measurement.service_client.idle_disconnect_millis", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        f44988s = k6Var.mo19204d("measurement.log_tag.service", "FA-SVC");
        f44989t = k6Var.mo19203c("measurement.upload.stale_data_deletion_interval", 86400000);
        f44990u = k6Var.mo19203c("measurement.sdk.attribution.cache.ttl", 604800000);
        f44991v = k6Var.mo19203c("measurement.upload.backoff_period", 43200000);
        f44992w = k6Var.mo19203c("measurement.upload.initial_upload_delay_time", 15000);
        f44993x = k6Var.mo19203c("measurement.upload.interval", 3600000);
        f44994y = k6Var.mo19203c("measurement.upload.max_bundle_size", 65536);
        f44995z = k6Var.mo19203c("measurement.upload.max_bundles", 100);
        f44958A = k6Var.mo19203c("measurement.upload.max_conversions_per_day", 500);
        f44959B = k6Var.mo19203c("measurement.upload.max_error_events_per_day", 1000);
        f44960C = k6Var.mo19203c("measurement.upload.max_events_per_bundle", 1000);
        f44961D = k6Var.mo19203c("measurement.upload.max_events_per_day", 100000);
        f44962E = k6Var.mo19203c("measurement.upload.max_public_events_per_day", 50000);
        f44963F = k6Var.mo19203c("measurement.upload.max_queue_time", 2419200000L);
        f44964G = k6Var.mo19203c("measurement.upload.max_realtime_events_per_day", 10);
        f44965H = k6Var.mo19203c("measurement.upload.max_batch_size", 65536);
        f44966I = k6Var.mo19203c("measurement.upload.retry_count", 6);
        f44967J = k6Var.mo19203c("measurement.upload.retry_time", 1800000);
        f44968K = k6Var.mo19204d("measurement.upload.url", "https://app-measurement.com/a");
        f44969L = k6Var.mo19203c("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: b */
    public final long mo37459b() {
        return ((Long) f44969L.mo19208b()).longValue();
    }

    /* renamed from: d */
    public final long mo37460d() {
        return ((Long) f44961D.mo19208b()).longValue();
    }

    /* renamed from: f */
    public final long mo37461f() {
        return ((Long) f44966I.mo19208b()).longValue();
    }

    /* renamed from: n */
    public final long mo37462n() {
        return ((Long) f44995z.mo19208b()).longValue();
    }

    /* renamed from: q */
    public final String mo37463q() {
        return (String) f44974e.mo19208b();
    }

    /* renamed from: r */
    public final long mo37464r() {
        return ((Long) f44959B.mo19208b()).longValue();
    }

    /* renamed from: t */
    public final String mo37465t() {
        return (String) f44975f.mo19208b();
    }

    public final long zzA() {
        return ((Long) f44963F.mo19208b()).longValue();
    }

    public final long zzB() {
        return ((Long) f44964G.mo19208b()).longValue();
    }

    public final long zzC() {
        return ((Long) f44965H.mo19208b()).longValue();
    }

    public final long zzE() {
        return ((Long) f44967J.mo19208b()).longValue();
    }

    public final String zzI() {
        return (String) f44968K.mo19208b();
    }

    public final long zza() {
        return ((Long) f44970a.mo19208b()).longValue();
    }

    public final long zzb() {
        return ((Long) f44971b.mo19208b()).longValue();
    }

    public final long zzc() {
        return ((Long) f44972c.mo19208b()).longValue();
    }

    public final long zzd() {
        return ((Long) f44976g.mo19208b()).longValue();
    }

    public final long zze() {
        return ((Long) f44977h.mo19208b()).longValue();
    }

    public final long zzf() {
        return ((Long) f44978i.mo19208b()).longValue();
    }

    public final long zzg() {
        return ((Long) f44979j.mo19208b()).longValue();
    }

    public final long zzh() {
        return ((Long) f44980k.mo19208b()).longValue();
    }

    public final long zzi() {
        return ((Long) f44981l.mo19208b()).longValue();
    }

    public final long zzj() {
        return ((Long) f44982m.mo19208b()).longValue();
    }

    public final long zzk() {
        return ((Long) f44983n.mo19208b()).longValue();
    }

    public final long zzl() {
        return ((Long) f44984o.mo19208b()).longValue();
    }

    public final long zzm() {
        return ((Long) f44985p.mo19208b()).longValue();
    }

    public final long zzn() {
        return ((Long) f44987r.mo19208b()).longValue();
    }

    public final long zzo() {
        return ((Long) f44989t.mo19208b()).longValue();
    }

    public final long zzp() {
        return ((Long) f44990u.mo19208b()).longValue();
    }

    public final long zzq() {
        return ((Long) f44991v.mo19208b()).longValue();
    }

    public final long zzr() {
        return ((Long) f44992w.mo19208b()).longValue();
    }

    public final long zzs() {
        return ((Long) f44993x.mo19208b()).longValue();
    }

    public final long zzt() {
        return ((Long) f44994y.mo19208b()).longValue();
    }

    public final long zzv() {
        return ((Long) f44958A.mo19208b()).longValue();
    }

    public final long zzx() {
        return ((Long) f44960C.mo19208b()).longValue();
    }

    public final long zzz() {
        return ((Long) f44962E.mo19208b()).longValue();
    }
}
