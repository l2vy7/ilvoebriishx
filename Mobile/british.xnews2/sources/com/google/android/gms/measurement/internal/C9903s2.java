package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.internal.measurement.C9114d6;
import com.google.android.gms.internal.measurement.C9359t5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p255u5.C11028c;

/* renamed from: com.google.android.gms.measurement.internal.s2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9903s2 {

    /* renamed from: A */
    public static final C9893r2 f46650A = m45335a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C9722b0.f46158a);

    /* renamed from: B */
    public static final C9893r2 f46651B = m45335a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C9732c0.f46189a);

    /* renamed from: C */
    public static final C9893r2 f46652C = m45335a("measurement.upload.retry_time", 1800000L, 1800000L, C9743d0.f46204a);

    /* renamed from: D */
    public static final C9893r2 f46653D = m45335a("measurement.upload.retry_count", 6, 6, C9762f0.f46247a);

    /* renamed from: E */
    public static final C9893r2 f46654E = m45335a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C9773g0.f46281a);

    /* renamed from: F */
    public static final C9893r2 f46655F = m45335a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C9784h0.f46316a);

    /* renamed from: G */
    public static final C9893r2 f46656G = m45335a("measurement.audience.filter_result_max_count", 200, 200, C9805j0.f46370a);

    /* renamed from: H */
    public static final C9893r2 f46657H = m45335a("measurement.upload.max_public_user_properties", 25, 25, (C9873p2) null);

    /* renamed from: I */
    public static final C9893r2 f46658I = m45335a("measurement.upload.max_event_name_cardinality", 500, 500, (C9873p2) null);

    /* renamed from: J */
    public static final C9893r2 f46659J = m45335a("measurement.upload.max_public_event_params", 25, 25, (C9873p2) null);

    /* renamed from: K */
    public static final C9893r2 f46660K;

    /* renamed from: L */
    public static final C9893r2 f46661L;

    /* renamed from: M */
    public static final C9893r2 f46662M = m45335a("measurement.test.string_flag", "---", "---", C9838m0.f46454a);

    /* renamed from: N */
    public static final C9893r2 f46663N = m45335a("measurement.test.long_flag", -1L, -1L, C9849n0.f46490a);

    /* renamed from: O */
    public static final C9893r2 f46664O = m45335a("measurement.test.int_flag", -2, -2, C9860o0.f46536a);

    /* renamed from: P */
    public static final C9893r2 f46665P;

    /* renamed from: Q */
    public static final C9893r2 f46666Q = m45335a("measurement.experiment.max_ids", 50, 50, C9891r0.f46624a);

    /* renamed from: R */
    public static final C9893r2 f46667R = m45335a("measurement.max_bundles_per_iteration", 100, 100, C9901s0.f46648a);

    /* renamed from: S */
    public static final C9893r2 f46668S = m45335a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C9911t0.f46740a);

    /* renamed from: T */
    public static final C9893r2 f46669T;

    /* renamed from: U */
    public static final C9893r2 f46670U;

    /* renamed from: V */
    public static final C9893r2 f46671V;

    /* renamed from: W */
    public static final C9893r2 f46672W;

    /* renamed from: X */
    public static final C9893r2 f46673X;

    /* renamed from: Y */
    public static final C9893r2 f46674Y;

    /* renamed from: Z */
    public static final C9893r2 f46675Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f46676a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C9893r2 f46677a0;

    /* renamed from: b */
    private static final Set f46678b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C9893r2 f46679b0;

    /* renamed from: c */
    public static final C9893r2 f46680c;

    /* renamed from: c0 */
    public static final C9893r2 f46681c0;

    /* renamed from: d */
    public static final C9893r2 f46682d = m45335a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C9752e0.f46223a);

    /* renamed from: d0 */
    public static final C9893r2 f46683d0;

    /* renamed from: e */
    public static final C9893r2 f46684e = m45335a("measurement.config.cache_time", 86400000L, 3600000L, C9929v.f46796a);

    /* renamed from: e0 */
    public static final C9893r2 f46685e0;

    /* renamed from: f */
    public static final C9893r2 f46686f = m45335a("measurement.config.url_scheme", "https", "https", C9794i0.f46350a);

    /* renamed from: f0 */
    public static final C9893r2 f46687f0;

    /* renamed from: g */
    public static final C9893r2 f46688g = m45335a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C9921u0.f46772a);

    /* renamed from: g0 */
    public static final C9893r2 f46689g0;

    /* renamed from: h */
    public static final C9893r2 f46690h = m45335a("measurement.upload.max_bundles", 100, 100, C9785h1.f46317a);

    /* renamed from: h0 */
    public static final C9893r2 f46691h0;

    /* renamed from: i */
    public static final C9893r2 f46692i;

    /* renamed from: i0 */
    public static final C9893r2 f46693i0;

    /* renamed from: j */
    public static final C9893r2 f46694j;

    /* renamed from: j0 */
    public static final C9893r2 f46695j0;

    /* renamed from: k */
    public static final C9893r2 f46696k = m45335a("measurement.upload.max_events_per_bundle", 1000, 1000, C9818k2.f46398a);

    /* renamed from: k0 */
    public static final C9893r2 f46697k0 = m45335a("measurement.service.storage_consent_support_version", 203600, 203600, C9872p1.f46566a);

    /* renamed from: l */
    public static final C9893r2 f46698l;

    /* renamed from: l0 */
    public static final C9893r2 f46699l0;

    /* renamed from: m */
    public static final C9893r2 f46700m = m45335a("measurement.upload.max_error_events_per_day", 1000, 1000, C9871p0.f46565a);

    /* renamed from: m0 */
    public static final C9893r2 f46701m0;

    /* renamed from: n */
    public static final C9893r2 f46702n = m45335a("measurement.upload.max_public_events_per_day", 50000, 50000, C9723b1.f46159a);

    /* renamed from: n0 */
    public static final C9893r2 f46703n0;

    /* renamed from: o */
    public static final C9893r2 f46704o = m45335a("measurement.upload.max_conversions_per_day", 10000, 10000, C9839m1.f46455a);

    /* renamed from: o0 */
    public static final C9893r2 f46705o0;

    /* renamed from: p */
    public static final C9893r2 f46706p = m45335a("measurement.upload.max_realtime_events_per_day", 10, 10, C9951x1.f46845a);

    /* renamed from: p0 */
    public static final C9893r2 f46707p0;

    /* renamed from: q */
    public static final C9893r2 f46708q;

    /* renamed from: q0 */
    public static final C9893r2 f46709q0;

    /* renamed from: r */
    public static final C9893r2 f46710r = m45335a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C9840m2.f46456a);

    /* renamed from: r0 */
    public static final C9893r2 f46711r0;

    /* renamed from: s */
    public static final C9893r2 f46712s = m45335a("measurement.upload.backoff_period", 43200000L, 43200000L, C9851n2.f46492a);

    /* renamed from: s0 */
    public static final C9893r2 f46713s0;

    /* renamed from: t */
    public static final C9893r2 f46714t = m45335a("measurement.upload.window_interval", 3600000L, 3600000L, C9862o2.f46538a);

    /* renamed from: t0 */
    public static final C9893r2 f46715t0;

    /* renamed from: u */
    public static final C9893r2 f46716u = m45335a("measurement.upload.interval", 3600000L, 3600000L, C9910t.f46739a);

    /* renamed from: u0 */
    public static final C9893r2 f46717u0;

    /* renamed from: v */
    public static final C9893r2 f46718v;

    /* renamed from: v0 */
    public static final C9893r2 f46719v0;

    /* renamed from: w */
    public static final C9893r2 f46720w = m45335a("measurement.upload.debug_upload_interval", 1000L, 1000L, C9949x.f46842a);

    /* renamed from: w0 */
    public static final C9893r2 f46721w0;

    /* renamed from: x */
    public static final C9893r2 f46722x = m45335a("measurement.upload.minimum_delay", 500L, 500L, C9959y.f46891a);

    /* renamed from: x0 */
    public static final C9893r2 f46723x0;

    /* renamed from: y */
    public static final C9893r2 f46724y = m45335a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C9969z.f46911a);

    /* renamed from: y0 */
    public static final C9893r2 f46725y0;

    /* renamed from: z */
    public static final C9893r2 f46726z = m45335a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C9711a0.f46138a);

    /* renamed from: z0 */
    public static final C9893r2 f46727z0;

    static {
        Long valueOf = Long.valueOf(ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
        f46680c = m45335a("measurement.ad_id_cache_time", valueOf, valueOf, C9900s.f46647a);
        Integer valueOf2 = Integer.valueOf(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        f46692i = m45335a("measurement.upload.max_batch_size", valueOf2, valueOf2, C9912t1.f46741a);
        f46694j = m45335a("measurement.upload.max_bundle_size", valueOf2, valueOf2, C9775g2.f46283a);
        Integer valueOf3 = Integer.valueOf(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        f46698l = m45335a("measurement.upload.max_events_per_day", valueOf3, valueOf3, C9829l2.f46427a);
        f46708q = m45335a("measurement.store.max_stored_events_per_app", valueOf3, valueOf3, C9807j2.f46372a);
        f46718v = m45335a("measurement.upload.realtime_upload_interval", valueOf, valueOf, C9920u.f46771a);
        Long valueOf4 = Long.valueOf(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        f46660K = m45335a("measurement.service_client.idle_disconnect_millis", valueOf4, valueOf4, C9816k0.f46396a);
        Boolean bool = Boolean.FALSE;
        f46661L = m45335a("measurement.test.boolean_flag", bool, bool, C9827l0.f46425a);
        Double valueOf5 = Double.valueOf(-3.0d);
        f46665P = m45335a("measurement.test.double_flag", valueOf5, valueOf5, C9882q0.f46583a);
        Boolean bool2 = Boolean.TRUE;
        f46669T = m45335a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, C9930v0.f46797a);
        f46670U = m45335a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C9940w0.f46822a);
        f46671V = m45335a("measurement.quality.checksum", bool, bool, (C9873p2) null);
        f46672W = m45335a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C9960y0.f46892a);
        f46673X = m45335a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C9970z0.f46912a);
        f46674Y = m45335a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C9712a1.f46139a);
        f46675Z = m45335a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C9733c1.f46190a);
        f46677a0 = m45335a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C9744d1.f46205a);
        f46679b0 = m45335a("measurement.lifecycle.app_in_background_parameter", bool, bool, C9753e1.f46224a);
        f46681c0 = m45335a("measurement.integration.disable_firebase_instance_id", bool, bool, C9763f1.f46248a);
        f46683d0 = m45335a("measurement.collection.service.update_with_analytics_fix", bool, bool, C9774g1.f46282a);
        f46685e0 = m45335a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C9795i1.f46351a);
        f46687f0 = m45335a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C9806j1.f46371a);
        f46689g0 = m45335a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C9817k1.f46397a);
        f46691h0 = m45335a("measurement.upload.file_truncate_fix", bool, bool, C9828l1.f46426a);
        f46693i0 = m45335a("measurement.collection.synthetic_data_mitigation", bool, bool, C9850n1.f46491a);
        f46695j0 = m45335a("measurement.androidId.delete_feature", bool2, bool2, C9861o1.f46537a);
        f46699l0 = m45335a("measurement.client.click_identifier_control.dev", bool, bool, C9883q1.f46584a);
        f46701m0 = m45335a("measurement.service.click_identifier_control", bool, bool, C9892r1.f46625a);
        f46703n0 = m45335a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C9902s1.f46649a);
        f46705o0 = m45335a("measurement.module.pixie.fix_array", bool2, bool2, C9922u1.f46773a);
        f46707p0 = m45335a("measurement.adid_zero.service", bool2, bool2, C9931v1.f46798a);
        f46709q0 = m45335a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C9941w1.f46823a);
        f46711r0 = m45335a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C9971z1.f46913a);
        f46713s0 = m45335a("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, C9713a2.f46140a);
        f46715t0 = m45335a("measurement.adid_zero.adid_uid", bool, bool, C9724b2.f46160a);
        f46717u0 = m45335a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C9734c2.f46191a);
        f46719v0 = m45335a("measurement.service.refactor.package_side_screen", bool2, bool2, C9745d2.f46206a);
        f46721w0 = m45335a("measurement.enhanced_campaign.service", bool, bool, C9754e2.f46225a);
        f46723x0 = m45335a("measurement.enhanced_campaign.client", bool, bool, C9764f2.f46249a);
        f46725y0 = m45335a("measurement.service.store_null_safelist", bool, bool, C9786h2.f46318a);
        f46727z0 = m45335a("measurement.service.store_safelist", bool, bool, C9796i2.f46352a);
    }

    /* renamed from: a */
    static C9893r2 m45335a(String str, Object obj, Object obj2, C9873p2 p2Var) {
        C9893r2 r2Var = new C9893r2(str, obj, obj2, p2Var, (C11028c) null);
        f46676a.add(r2Var);
        return r2Var;
    }

    /* renamed from: c */
    public static Map m45337c(Context context) {
        C9359t5 b = C9359t5.m43653b(context.getContentResolver(), C9114d6.m42777a("com.google.android.gms.measurement"));
        return b == null ? Collections.emptyMap() : b.mo38055c();
    }
}
