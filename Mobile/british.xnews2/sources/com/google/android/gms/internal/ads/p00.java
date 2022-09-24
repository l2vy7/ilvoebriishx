package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class p00 {

    /* renamed from: A */
    public static final h00<Boolean> f36831A;

    /* renamed from: A0 */
    public static final h00<Boolean> f36832A0;

    /* renamed from: A1 */
    public static final h00<Boolean> f36833A1;

    /* renamed from: A2 */
    public static final h00<Boolean> f36834A2;

    /* renamed from: A3 */
    public static final h00<Integer> f36835A3 = h00.m32762g(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: A4 */
    public static final h00<String> f36836A4 = h00.m32765j(1, "gads:sp:json_string", "");

    /* renamed from: A5 */
    public static final h00<String> f36837A5 = h00.m32765j(1, "gads:scar_v2:user_agent:key", "ua");

    /* renamed from: A6 */
    public static final h00<Boolean> f36838A6;

    /* renamed from: B */
    public static final h00<Integer> f36839B = h00.m32762g(1, "gads:video:spinner:scale", 4);

    /* renamed from: B0 */
    public static final h00<Boolean> f36840B0;

    /* renamed from: B1 */
    public static final h00<Boolean> f36841B1;

    /* renamed from: B2 */
    public static final h00<Boolean> f36842B2;

    /* renamed from: B3 */
    public static final h00<Boolean> f36843B3;

    /* renamed from: B4 */
    public static final h00<Boolean> f36844B4;

    /* renamed from: B5 */
    public static final h00<Boolean> f36845B5;

    /* renamed from: B6 */
    public static final h00<String> f36846B6 = h00.m32765j(1, "gads:inspector:ui_url", "https://admob-gmats.uc.r.appspot.com/");

    /* renamed from: C */
    public static final h00<Long> f36847C = h00.m32763h(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: C0 */
    public static final h00<String> f36848C0 = h00.m32765j(1, "gads:webview_cookie_url", "googleads.g.doubleclick.net");

    /* renamed from: C1 */
    public static final h00<Integer> f36849C1 = h00.m32762g(1, "gads:gestures:a2:enabled", 0);

    /* renamed from: C2 */
    public static final h00<Boolean> f36850C2;

    /* renamed from: C3 */
    public static final h00<Integer> f36851C3 = h00.m32762g(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: C4 */
    public static final h00<Integer> f36852C4 = h00.m32762g(1, "gads:nativeads:image:sample:pixels", ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);

    /* renamed from: C5 */
    public static final h00<String> f36853C5 = h00.m32765j(1, "gads:scar_v2:prior_click_count:key", "pcc");

    /* renamed from: C6 */
    public static final h00<Integer> f36854C6 = h00.m32762g(1, "gads:inspector:max_ad_life_cycles", 1000);

    /* renamed from: D */
    public static final h00<Boolean> f36855D;

    /* renamed from: D0 */
    public static final h00<Boolean> f36856D0;

    /* renamed from: D1 */
    public static final h00<Boolean> f36857D1;

    /* renamed from: D2 */
    public static final h00<Boolean> f36858D2;

    /* renamed from: D3 */
    public static final h00<Boolean> f36859D3;

    /* renamed from: D4 */
    public static final h00<Boolean> f36860D4;

    /* renamed from: D5 */
    public static final h00<String> f36861D5 = h00.m32765j(1, "gads:scar_v2:pings_from_gma:key", "is_gma");

    /* renamed from: D6 */
    public static final h00<Integer> f36862D6 = h00.m32762g(1, "gads:inspector:ui_invocation_millis", 2000);

    /* renamed from: E */
    public static final h00<Boolean> f36863E;

    /* renamed from: E0 */
    public static final h00<Boolean> f36864E0;

    /* renamed from: E1 */
    public static final h00<Boolean> f36865E1;

    /* renamed from: E2 */
    public static final h00<Long> f36866E2 = h00.m32763h(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: E3 */
    public static final h00<Boolean> f36867E3;

    /* renamed from: E4 */
    public static final h00<Boolean> f36868E4;

    /* renamed from: E5 */
    public static final h00<Boolean> f36869E5;

    /* renamed from: E6 */
    public static final h00<Boolean> f36870E6;

    /* renamed from: F */
    public static final h00<String> f36871F = h00.m32765j(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: F0 */
    public static final h00<Boolean> f36872F0;

    /* renamed from: F1 */
    public static final h00<Boolean> f36873F1;

    /* renamed from: F2 */
    public static final h00<Long> f36874F2 = h00.m32763h(1, "gads:parental_controls:timeout", SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);

    /* renamed from: F3 */
    public static final h00<Boolean> f36875F3;

    /* renamed from: F4 */
    public static final h00<Integer> f36876F4 = h00.m32762g(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: F5 */
    public static final h00<Integer> f36877F5 = h00.m32762g(1, "gads:native_ads_signal:timeout", 1000);

    /* renamed from: F6 */
    public static final h00<Float> f36878F6 = h00.m32761f(1, "gads:inspector:shake_strength", 2.0f);

    /* renamed from: G */
    public static final h00<Integer> f36879G = h00.m32762g(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: G0 */
    public static final h00<Long> f36880G0 = h00.m32763h(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: G1 */
    public static final h00<Boolean> f36881G1;

    /* renamed from: G2 */
    public static final h00<Integer> f36882G2 = h00.m32762g(1, "gads:cache:ad_request_timeout_millis", IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: G3 */
    public static final h00<String> f36883G3;

    /* renamed from: G4 */
    public static final h00<Boolean> f36884G4;

    /* renamed from: G5 */
    public static final h00<Boolean> f36885G5;

    /* renamed from: G6 */
    public static final h00<Integer> f36886G6 = h00.m32762g(1, "gads:inspector:shake_interval", 500);

    /* renamed from: H */
    public static final h00<String> f36887H = h00.m32765j(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");

    /* renamed from: H0 */
    public static final h00<Long> f36888H0 = h00.m32763h(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: H1 */
    public static final h00<Boolean> f36889H1;

    /* renamed from: H2 */
    public static final h00<Integer> f36890H2 = h00.m32762g(1, "gads:cache:max_concurrent_downloads", 10);

    /* renamed from: H3 */
    public static final h00<Boolean> f36891H3;

    /* renamed from: H4 */
    public static final h00<Boolean> f36892H4;

    /* renamed from: H5 */
    public static final h00<Boolean> f36893H5;

    /* renamed from: H6 */
    public static final h00<Integer> f36894H6 = h00.m32762g(1, "gads:inspector:shake_reset_time_ms", 3000);

    /* renamed from: I */
    public static final h00<String> f36895I = h00.m32765j(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");

    /* renamed from: I0 */
    public static final h00<Boolean> f36896I0;

    /* renamed from: I1 */
    public static final h00<String> f36897I1 = h00.m32765j(1, "gads:msa:experiments:incapi:trusted_cert", "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");

    /* renamed from: I2 */
    public static final h00<Boolean> f36898I2;

    /* renamed from: I3 */
    public static final h00<Integer> f36899I3 = h00.m32762g(1, "gads:app_open_beta:min_version", 999999999);

    /* renamed from: I4 */
    public static final h00<Boolean> f36900I4;

    /* renamed from: I5 */
    public static final h00<Boolean> f36901I5;

    /* renamed from: I6 */
    public static final h00<Integer> f36902I6 = h00.m32762g(1, "gads:inspector:shake_count", 3);

    /* renamed from: J */
    public static final h00<String> f36903J = h00.m32765j(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");

    /* renamed from: J0 */
    public static final h00<Long> f36904J0 = h00.m32763h(1, "gads:adid_values_in_adrequest:timeout", SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);

    /* renamed from: J1 */
    public static final h00<String> f36905J1 = h00.m32765j(1, "gads:msa:experiments:incapi:debug_cert", "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b");

    /* renamed from: J2 */
    public static final h00<Long> f36906J2 = h00.m32763h(1, "gads:cache:javascript_timeout_millis", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: J3 */
    public static final h00<Integer> f36907J3 = h00.m32762g(1, "gads:app_open_ad_open_beta_api:min_version", 202490999);

    /* renamed from: J4 */
    public static final h00<Boolean> f36908J4;

    /* renamed from: J5 */
    public static final h00<Boolean> f36909J5;

    /* renamed from: J6 */
    public static final h00<Boolean> f36910J6;

    /* renamed from: K */
    public static final h00<String> f36911K = h00.m32765j(1, "gad:mraid:version", "3.0");

    /* renamed from: K0 */
    public static final h00<Boolean> f36912K0;

    /* renamed from: K1 */
    public static final h00<Boolean> f36913K1;

    /* renamed from: K2 */
    public static final h00<Boolean> f36914K2;

    /* renamed from: K3 */
    public static final h00<Boolean> f36915K3;

    /* renamed from: K4 */
    public static final h00<Boolean> f36916K4;

    /* renamed from: K5 */
    public static final h00<Integer> f36917K5 = h00.m32762g(1, "gads:interscroller:min_width", 300);

    /* renamed from: K6 */
    public static final h00<Float> f36918K6 = h00.m32761f(1, "gads:inspector:flick_rotation_threshold", 45.0f);

    /* renamed from: L */
    public static final h00<Boolean> f36919L;

    /* renamed from: L0 */
    public static final h00<Long> f36920L0 = h00.m32763h(1, "gads:ad_overlay:delay_page_close_timeout_ms", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: L1 */
    public static final s10<Boolean> f36921L1 = i20.f33037b;

    /* renamed from: L2 */
    public static final h00<Boolean> f36922L2;

    /* renamed from: L3 */
    public static final h00<String> f36923L3;

    /* renamed from: L4 */
    public static final h00<Boolean> f36924L4;

    /* renamed from: L5 */
    public static final h00<Integer> f36925L5 = h00.m32762g(1, "gads:interscroller:min_height", IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: L6 */
    public static final h00<Integer> f36926L6 = h00.m32762g(1, "gads:inspector:flick_reset_time_ms", 3000);

    /* renamed from: M */
    public static final h00<Boolean> f36927M;

    /* renamed from: M0 */
    public static final h00<Boolean> f36928M0;

    /* renamed from: M1 */
    public static final h00<Boolean> f36929M1;

    /* renamed from: M2 */
    public static final h00<Boolean> f36930M2;

    /* renamed from: M3 */
    public static final h00<Boolean> f36931M3;

    /* renamed from: M4 */
    public static final h00<Boolean> f36932M4;

    /* renamed from: M5 */
    public static final h00<Boolean> f36933M5;

    /* renamed from: M6 */
    public static final h00<Integer> f36934M6 = h00.m32762g(1, "gads:inspector:flick_count", 2);

    /* renamed from: N */
    public static final h00<Integer> f36935N = h00.m32762g(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: N0 */
    public static final h00<Boolean> f36936N0;

    /* renamed from: N1 */
    public static final h00<Long> f36937N1 = h00.m32763h(1, "gads:gestures:task_timeout", SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);

    /* renamed from: N2 */
    public static final h00<Long> f36938N2 = h00.m32763h(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: N3 */
    public static final h00<String> f36939N3;

    /* renamed from: N4 */
    public static final h00<Boolean> f36940N4;

    /* renamed from: N5 */
    public static final h00<Boolean> f36941N5;

    /* renamed from: N6 */
    public static final h00<Integer> f36942N6 = h00.m32762g(1, "gads:inspector:icon_width_px", 256);

    /* renamed from: O */
    public static final h00<Integer> f36943O = h00.m32762g(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: O0 */
    public static final h00<Boolean> f36944O0;

    /* renamed from: O1 */
    public static final h00<Boolean> f36945O1;

    /* renamed from: O2 */
    public static final h00<Boolean> f36946O2;

    /* renamed from: O3 */
    public static final h00<Boolean> f36947O3;

    /* renamed from: O4 */
    public static final h00<Integer> f36948O4 = h00.m32762g(1, "gads:rewarded_precache_pool:count", 0);

    /* renamed from: O5 */
    public static final h00<String> f36949O5 = h00.m32765j(1, "gad:publisher_testing:policy_validator:enabled_list", "");

    /* renamed from: O6 */
    public static final h00<Integer> f36950O6 = h00.m32762g(1, "gads:inspector:icon_height_px", 256);

    /* renamed from: P */
    public static final h00<Integer> f36951P = h00.m32762g(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: P0 */
    public static final h00<String> f36952P0 = h00.m32765j(1, "gads:close_button_asset_name", RewardedVideo.VIDEO_MODE_DEFAULT);

    /* renamed from: P1 */
    public static final h00<Boolean> f36953P1;

    /* renamed from: P2 */
    public static final h00<Boolean> f36954P2;

    /* renamed from: P3 */
    public static final h00<Boolean> f36955P3;

    /* renamed from: P4 */
    public static final h00<Integer> f36956P4 = h00.m32762g(1, "gads:interstitial_precache_pool:count", 0);

    /* renamed from: P5 */
    public static final h00<Integer> f36957P5 = h00.m32762g(1, "gads:policy_validator_layoutparam:flags", 808);

    /* renamed from: P6 */
    public static final h00<Boolean> f36958P6;

    /* renamed from: Q */
    public static final h00<String> f36959Q = h00.m32765j(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: Q0 */
    public static final h00<Long> f36960Q0 = h00.m32763h(1, "gads:close_button_fade_in_duration_ms", 0);

    /* renamed from: Q1 */
    public static final h00<Boolean> f36961Q1;

    /* renamed from: Q2 */
    public static final h00<Long> f36962Q2 = h00.m32763h(1, "gads:cache:connection_timeout", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: Q3 */
    public static final h00<String> f36963Q3;

    /* renamed from: Q4 */
    public static final h00<String> f36964Q4 = h00.m32765j(1, "gads:rewarded_precache_pool:discard_strategy", "lru");

    /* renamed from: Q5 */
    public static final h00<Boolean> f36965Q5;

    /* renamed from: Q6 */
    public static final h00<Boolean> f36966Q6;

    /* renamed from: R */
    public static final h00<String> f36967R = h00.m32765j(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: R0 */
    public static final h00<Boolean> f36968R0;

    /* renamed from: R1 */
    public static final h00<Boolean> f36969R1;

    /* renamed from: R2 */
    public static final h00<Long> f36970R2 = h00.m32763h(1, "gads:cache:read_only_connection_timeout", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: R3 */
    public static final h00<Boolean> f36971R3;

    /* renamed from: R4 */
    public static final h00<String> f36972R4 = h00.m32765j(1, "gads:interstitial_precache_pool:discard_strategy", "lru");

    /* renamed from: R5 */
    public static final h00<Integer> f36973R5 = h00.m32762g(1, "gads:policy_validator_overlay_width:dp", 350);

    /* renamed from: R6 */
    public static final h00<Boolean> f36974R6;

    /* renamed from: S */
    public static final h00<Boolean> f36975S;

    /* renamed from: S0 */
    public static final h00<Boolean> f36976S0;

    /* renamed from: S1 */
    public static final h00<Boolean> f36977S1;

    /* renamed from: S2 */
    public static final h00<Boolean> f36978S2;

    /* renamed from: S3 */
    public static final h00<Boolean> f36979S3;

    /* renamed from: S4 */
    public static final h00<String> f36980S4 = h00.m32765j(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: S5 */
    public static final h00<Integer> f36981S5 = h00.m32762g(1, "gads:policy_validator_overlay_height:dp", IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);

    /* renamed from: S6 */
    public static final h00<Boolean> f36982S6;

    /* renamed from: T */
    public static final h00<Boolean> f36983T;

    /* renamed from: T0 */
    public static final h00<Boolean> f36984T0;

    /* renamed from: T1 */
    public static final h00<Boolean> f36985T1;

    /* renamed from: T2 */
    public static final h00<Boolean> f36986T2;

    /* renamed from: T3 */
    public static final h00<Boolean> f36987T3;

    /* renamed from: T4 */
    public static final h00<String> f36988T4 = h00.m32765j(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: T5 */
    public static final h00<Boolean> f36989T5;

    /* renamed from: T6 */
    public static final h00<Boolean> f36990T6;

    /* renamed from: U */
    public static final h00<Boolean> f36991U;

    /* renamed from: U0 */
    public static final h00<String> f36992U0 = h00.m32765j(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: U1 */
    public static final h00<Boolean> f36993U1;

    /* renamed from: U2 */
    public static final h00<Boolean> f36994U2;

    /* renamed from: U3 */
    public static final h00<Boolean> f36995U3;

    /* renamed from: U4 */
    public static final h00<Integer> f36996U4 = h00.m32762g(1, "gads:rewarded_precache_pool:size", 1);

    /* renamed from: U5 */
    public static final h00<Boolean> f36997U5;

    /* renamed from: U6 */
    public static final h00<Boolean> f36998U6;

    /* renamed from: V */
    public static final h00<Boolean> f36999V;

    /* renamed from: V0 */
    public static final h00<String> f37000V0 = h00.m32765j(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: V1 */
    public static final h00<Boolean> f37001V1;

    /* renamed from: V2 */
    public static final h00<Long> f37002V2 = h00.m32763h(1, "gads:cache:function_call_timeout", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);

    /* renamed from: V3 */
    public static final h00<Boolean> f37003V3;

    /* renamed from: V4 */
    public static final h00<Integer> f37004V4 = h00.m32762g(1, "gads:interstitial_precache_pool:size", 1);

    /* renamed from: V5 */
    public static final h00<Boolean> f37005V5;

    /* renamed from: V6 */
    public static final h00<Integer> f37006V6 = h00.m32762g(1, "gads:h5ads:max_num_ad_objects", 10);

    /* renamed from: W */
    public static final h00<String> f37007W = h00.m32765j(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: W0 */
    public static final h00<Boolean> f37008W0;

    /* renamed from: W1 */
    public static final h00<String> f37009W1 = h00.m32765j(1, "gads:gestures:pk", "");

    /* renamed from: W2 */
    public static final h00<Boolean> f37010W2;

    /* renamed from: W3 */
    public static final h00<Integer> f37011W3 = h00.m32762g(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: W4 */
    public static final h00<Integer> f37012W4 = h00.m32762g(1, "gads:rewarded_precache_pool:ad_time_limit", IronSourceConstants.RV_INSTANCE_LOAD_FAILED);

    /* renamed from: W5 */
    public static final h00<Boolean> f37013W5;

    /* renamed from: W6 */
    public static final h00<Integer> f37014W6 = h00.m32762g(1, "gads:h5ads:max_gmsg_length", 5000);

    /* renamed from: X */
    public static final h00<String> f37015X = h00.m32765j(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");

    /* renamed from: X0 */
    public static final h00<Long> f37016X0 = h00.m32763h(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: X1 */
    public static final h00<Boolean> f37017X1;

    /* renamed from: X2 */
    public static final h00<Boolean> f37018X2;

    /* renamed from: X3 */
    public static final h00<Boolean> f37019X3;

    /* renamed from: X4 */
    public static final h00<Integer> f37020X4 = h00.m32762g(1, "gads:interstitial_precache_pool:ad_time_limit", IronSourceConstants.RV_INSTANCE_LOAD_FAILED);

    /* renamed from: X5 */
    public static final h00<Boolean> f37021X5;

    /* renamed from: X6 */
    public static final h00<String> f37022X6 = h00.m32765j(1, "gads:h5ads:afma_prefix", "(window.AFMA_ReceiveMessage||function(msg,params){window.h5_iframe.contentWindow.postMessage({messageName:'receive_message_action',parameters:{messageName:msg,parameters:params}},'*');})");

    /* renamed from: Y */
    public static final h00<Boolean> f37023Y;

    /* renamed from: Y0 */
    public static final h00<Long> f37024Y0 = h00.m32763h(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: Y1 */
    public static final h00<Boolean> f37025Y1;

    /* renamed from: Y2 */
    public static final h00<String> f37026Y2 = h00.m32765j(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: Y3 */
    public static final h00<Boolean> f37027Y3;

    /* renamed from: Y4 */
    public static final h00<String> f37028Y4 = h00.m32765j(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: Y5 */
    public static final h00<String> f37029Y5 = h00.m32765j(1, "gads:server_transaction_source:list", "Network");

    /* renamed from: Y6 */
    public static final h00<Boolean> f37030Y6;

    /* renamed from: Z */
    public static final h00<String> f37031Z = h00.m32765j(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: Z0 */
    public static final h00<Boolean> f37032Z0;

    /* renamed from: Z1 */
    public static final h00<Boolean> f37033Z1;

    /* renamed from: Z2 */
    public static final h00<Integer> f37034Z2 = h00.m32762g(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: Z3 */
    public static final h00<Boolean> f37035Z3;

    /* renamed from: Z4 */
    public static final h00<String> f37036Z4 = h00.m32765j(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: Z5 */
    public static final h00<Boolean> f37037Z5;

    /* renamed from: Z6 */
    public static final h00<Boolean> f37038Z6;

    /* renamed from: a */
    public static final h00<String> f37039a = h00.m32765j(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: a0 */
    public static final h00<Long> f37040a0 = h00.m32763h(1, "gads:sai:timeout_ms", -1);

    /* renamed from: a1 */
    public static final h00<Boolean> f37041a1;

    /* renamed from: a2 */
    public static final h00<Boolean> f37042a2;

    /* renamed from: a3 */
    public static final h00<Boolean> f37043a3;

    /* renamed from: a4 */
    public static final h00<Boolean> f37044a4;

    /* renamed from: a5 */
    public static final h00<String> f37045a5 = h00.m32765j(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");

    /* renamed from: a6 */
    public static final h00<Boolean> f37046a6;

    /* renamed from: a7 */
    public static final h00<Boolean> f37047a7;

    /* renamed from: b */
    public static final h00<String> f37048b = h00.m32765j(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: b0 */
    public static final h00<Integer> f37049b0 = h00.m32762g(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: b1 */
    public static final h00<Boolean> f37050b1;

    /* renamed from: b2 */
    public static final h00<Integer> f37051b2 = h00.m32762g(1, "gads:gestures:as2percentage", 0);

    /* renamed from: b3 */
    public static final h00<Boolean> f37052b3;

    /* renamed from: b4 */
    public static final h00<String> f37053b4 = h00.m32765j(1, "gads:uri_query_to_map_bg_thread:types", "/result");

    /* renamed from: b5 */
    public static final h00<String> f37054b5 = h00.m32765j(1, "gads:app_open_precache_pool:discard_strategy", "oldest");

    /* renamed from: b6 */
    public static final h00<Integer> f37055b6 = h00.m32762g(1, "gads:ad_error_api:min_version", 202006000);

    /* renamed from: b7 */
    public static final h00<Boolean> f37056b7;

    /* renamed from: c */
    public static final s10<Boolean> f37057c = j20.f33715d;

    /* renamed from: c0 */
    public static final h00<Boolean> f37058c0;

    /* renamed from: c1 */
    public static final h00<String> f37059c1 = h00.m32765j(1, "gads:logged_adapter_version_classes", "");

    /* renamed from: c2 */
    public static final h00<Boolean> f37060c2;

    /* renamed from: c3 */
    public static final h00<Boolean> f37061c3;

    /* renamed from: c4 */
    public static final h00<Integer> f37062c4 = h00.m32762g(1, "gads:uri_query_to_map_bg_thread:min_length", 1000);

    /* renamed from: c5 */
    public static final h00<Integer> f37063c5 = h00.m32762g(1, "gads:app_open_precache_pool:count", 0);

    /* renamed from: c6 */
    public static final h00<Boolean> f37064c6;

    /* renamed from: c7 */
    public static final h00<Boolean> f37065c7;

    /* renamed from: d */
    public static final h00<Integer> f37066d = h00.m32762g(1, "gads:http_url_connection_factory:timeout_millis", 10000);

    /* renamed from: d0 */
    public static final h00<Integer> f37067d0 = h00.m32762g(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);

    /* renamed from: d1 */
    public static final h00<Long> f37068d1 = h00.m32763h(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);

    /* renamed from: d2 */
    public static final h00<Boolean> f37069d2;

    /* renamed from: d3 */
    public static final h00<Boolean> f37070d3;

    /* renamed from: d4 */
    public static final h00<Boolean> f37071d4;

    /* renamed from: d5 */
    public static final h00<String> f37072d5 = h00.m32765j(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");

    /* renamed from: d6 */
    public static final h00<Boolean> f37073d6;

    /* renamed from: d7 */
    public static final h00<Boolean> f37074d7;

    /* renamed from: e */
    public static final h00<String> f37075e = h00.m32765j(1, "gads:video_exo_player:version", "3");

    /* renamed from: e0 */
    public static final h00<Boolean> f37076e0;

    /* renamed from: e1 */
    public static final h00<String> f37077e1 = h00.m32765j(1, "gads:rtb_logging:regex", "(?!)");

    /* renamed from: e2 */
    public static final h00<Boolean> f37078e2;

    /* renamed from: e3 */
    public static final h00<Boolean> f37079e3;

    /* renamed from: e4 */
    public static final h00<Boolean> f37080e4;

    /* renamed from: e5 */
    public static final h00<Integer> f37081e5 = h00.m32762g(1, "gads:app_open_precache_pool:size", 1);

    /* renamed from: e6 */
    public static final h00<Boolean> f37082e6;

    /* renamed from: e7 */
    public static final h00<Integer> f37083e7 = h00.m32762g(1, "gads:msa:visminalpha", 90);

    /* renamed from: f */
    public static final h00<Integer> f37084f = h00.m32762g(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: f0 */
    public static final h00<Boolean> f37085f0;

    /* renamed from: f1 */
    public static final h00<Boolean> f37086f1;

    /* renamed from: f2 */
    public static final h00<Boolean> f37087f2;

    /* renamed from: f3 */
    public static final h00<Boolean> f37088f3;

    /* renamed from: f4 */
    public static final h00<Boolean> f37089f4;

    /* renamed from: f5 */
    public static final h00<Integer> f37090f5 = h00.m32762g(1, "gads:app_open_precache_pool:ad_time_limit", 14400);

    /* renamed from: f6 */
    public static final h00<Integer> f37091f6 = h00.m32762g(1, "gads:mediation_no_fill_error:min_version", 999999999);

    /* renamed from: f7 */
    public static final h00<Boolean> f37092f7;

    /* renamed from: g */
    public static final h00<Integer> f37093g = h00.m32762g(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: g0 */
    public static final h00<Boolean> f37094g0;

    /* renamed from: g1 */
    public static final h00<Boolean> f37095g1;

    /* renamed from: g2 */
    public static final h00<Boolean> f37096g2;

    /* renamed from: g3 */
    public static final h00<Boolean> f37097g3;

    /* renamed from: g4 */
    public static final h00<Boolean> f37098g4;

    /* renamed from: g5 */
    public static final h00<Boolean> f37099g5;

    /* renamed from: g6 */
    public static final h00<Boolean> f37100g6;

    /* renamed from: g7 */
    public static final h00<Boolean> f37101g7;

    /* renamed from: h */
    public static final h00<Integer> f37102h = h00.m32762g(1, "gads:video_exo_player:loading_check_interval", ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);

    /* renamed from: h0 */
    public static final h00<Boolean> f37103h0;

    /* renamed from: h1 */
    public static final h00<Boolean> f37104h1;

    /* renamed from: h2 */
    public static final h00<Boolean> f37105h2;

    /* renamed from: h3 */
    public static final h00<String> f37106h3 = h00.m32765j(1, "gad:publisher_testing:cct_v2:enabled_list", "");

    /* renamed from: h4 */
    public static final h00<Boolean> f37107h4;

    /* renamed from: h5 */
    public static final h00<Boolean> f37108h5;

    /* renamed from: h6 */
    public static final h00<Integer> f37109h6 = h00.m32762g(1, "gads:offline_database_version:version", 1);

    /* renamed from: h7 */
    public static final h00<Boolean> f37110h7;

    /* renamed from: i */
    public static final h00<Integer> f37111i = h00.m32762g(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: i0 */
    public static final h00<Boolean> f37112i0;

    /* renamed from: i1 */
    public static final h00<Boolean> f37113i1;

    /* renamed from: i2 */
    public static final h00<Boolean> f37114i2;

    /* renamed from: i3 */
    public static final h00<Boolean> f37115i3;

    /* renamed from: i4 */
    public static final h00<Boolean> f37116i4;

    /* renamed from: i5 */
    public static final h00<Boolean> f37117i5;

    /* renamed from: i6 */
    public static final h00<Boolean> f37118i6;

    /* renamed from: i7 */
    public static final h00<Boolean> f37119i7;

    /* renamed from: j */
    public static final h00<Integer> f37120j = h00.m32762g(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: j0 */
    public static final h00<Boolean> f37121j0;

    /* renamed from: j1 */
    public static final h00<Integer> f37122j1 = h00.m32762g(1, "gads:native_ad_options_rtb:min_version", ScarAdapterFactory.CODE_19_8);

    /* renamed from: j2 */
    public static final h00<Boolean> f37123j2;

    /* renamed from: j3 */
    public static final h00<Long> f37124j3 = h00.m32763h(1, "gads:debug_hold_gesture:time_millis", SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);

    /* renamed from: j4 */
    public static final h00<Boolean> f37125j4;

    /* renamed from: j5 */
    public static final h00<Boolean> f37126j5;

    /* renamed from: j6 */
    public static final h00<Boolean> f37127j6;

    /* renamed from: j7 */
    public static final h00<Integer> f37128j7 = h00.m32762g(1, "gads:timeout_for_show_call_succeed:ms", 3000);

    /* renamed from: k */
    public static final h00<Integer> f37129k = h00.m32762g(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: k0 */
    public static final h00<Boolean> f37130k0;

    /* renamed from: k1 */
    public static final h00<Boolean> f37131k1;

    /* renamed from: k2 */
    public static final h00<Integer> f37132k2 = h00.m32762g(1, "gads:gass:impression_retry:count", 0);

    /* renamed from: k3 */
    public static final h00<String> f37133k3 = h00.m32765j(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: k4 */
    public static final h00<Boolean> f37134k4;

    /* renamed from: k5 */
    public static final h00<Boolean> f37135k5;

    /* renamed from: k6 */
    public static final h00<Boolean> f37136k6;

    /* renamed from: k7 */
    public static final h00<Boolean> f37137k7;

    /* renamed from: l */
    public static final h00<Integer> f37138l = h00.m32762g(1, "gads:video_exo_player:min_retry_count", -1);

    /* renamed from: l0 */
    public static final h00<Boolean> f37139l0;

    /* renamed from: l1 */
    public static final h00<Boolean> f37140l1;

    /* renamed from: l2 */
    public static final h00<Integer> f37141l2 = h00.m32762g(1, "gads:gass:impression_retry:delay_ms", 400);

    /* renamed from: l3 */
    public static final h00<String> f37142l3 = h00.m32765j(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: l4 */
    public static final h00<Boolean> f37143l4;

    /* renamed from: l5 */
    public static final h00<String> f37144l5 = h00.m32765j(1, "gads:csi:error_parsing:regex", "^(\\d+)");

    /* renamed from: l6 */
    public static final h00<Boolean> f37145l6;

    /* renamed from: l7 */
    public static final h00<Boolean> f37146l7;

    /* renamed from: m */
    public static final h00<Boolean> f37147m;

    /* renamed from: m0 */
    public static final h00<Long> f37148m0 = h00.m32763h(1, "gads:sai:server_side_npa:ttl", TimeUnit.DAYS.toMillis(90));

    /* renamed from: m1 */
    public static final h00<Boolean> f37149m1;

    /* renamed from: m2 */
    public static final h00<String> f37150m2 = h00.m32766k(1, "gads:sdk_core_constants:experiment_id");

    /* renamed from: m3 */
    public static final h00<String> f37151m3 = h00.m32765j(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: m4 */
    public static final h00<Boolean> f37152m4;

    /* renamed from: m5 */
    public static final h00<Boolean> f37153m5;

    /* renamed from: m6 */
    public static final h00<Boolean> f37154m6;

    /* renamed from: m7 */
    public static final h00<Boolean> f37155m7;

    /* renamed from: n */
    public static final h00<Boolean> f37156n;

    /* renamed from: n0 */
    public static final h00<String> f37157n0 = h00.m32765j(1, "gads:sai:server_side_npa:shared_preference_key_list", "{  \"__default__\": [    \"IABTCF_TCString\"  ],  \"mobileads_consent\": [    \"consent_string\"  ]}");

    /* renamed from: n1 */
    public static final h00<Boolean> f37158n1;

    /* renamed from: n2 */
    public static final h00<String> f37159n2 = h00.m32765j(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: n3 */
    public static final h00<String> f37160n3 = h00.m32765j(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: n4 */
    public static final h00<Boolean> f37161n4;

    /* renamed from: n5 */
    public static final h00<Boolean> f37162n5;

    /* renamed from: n6 */
    public static final h00<Boolean> f37163n6;

    /* renamed from: n7 */
    public static final h00<Boolean> f37164n7;

    /* renamed from: o */
    public static final h00<Boolean> f37165o;

    /* renamed from: o0 */
    public static final h00<Boolean> f37166o0;

    /* renamed from: o1 */
    public static final h00<Integer> f37167o1 = h00.m32762g(1, "gads:adapter_initialization:min_sdk_version", 15301000);

    /* renamed from: o2 */
    public static final h00<Boolean> f37168o2;

    /* renamed from: o3 */
    public static final h00<Integer> f37169o3 = h00.m32762g(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: o4 */
    public static final h00<Boolean> f37170o4;

    /* renamed from: o5 */
    public static final h00<Boolean> f37171o5;

    /* renamed from: o6 */
    public static final h00<Boolean> f37172o6;

    /* renamed from: o7 */
    public static final h00<Boolean> f37173o7;

    /* renamed from: p */
    public static final h00<Integer> f37174p = h00.m32762g(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: p0 */
    public static final h00<Boolean> f37175p0;

    /* renamed from: p1 */
    public static final h00<Long> f37176p1 = h00.m32763h(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: p2 */
    public static final h00<String> f37177p2 = h00.m32765j(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: p3 */
    public static final h00<Integer> f37178p3 = h00.m32762g(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: p4 */
    public static final h00<Boolean> f37179p4;

    /* renamed from: p5 */
    public static final h00<Boolean> f37180p5;

    /* renamed from: p6 */
    public static final h00<Boolean> f37181p6;

    /* renamed from: p7 */
    public static final h00<Boolean> f37182p7;

    /* renamed from: q */
    public static final h00<Integer> f37183q = h00.m32762g(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: q0 */
    public static final h00<Boolean> f37184q0;

    /* renamed from: q1 */
    public static final h00<Long> f37185q1 = h00.m32763h(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: q2 */
    public static final h00<String> f37186q2 = h00.m32765j(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: q3 */
    public static final h00<Boolean> f37187q3;

    /* renamed from: q4 */
    public static final h00<Boolean> f37188q4;

    /* renamed from: q5 */
    public static final h00<Integer> f37189q5 = h00.m32762g(1, "gads:maximum_query_json_cache_size", 200);

    /* renamed from: q6 */
    public static final h00<Boolean> f37190q6;

    /* renamed from: q7 */
    public static final h00<Boolean> f37191q7;

    /* renamed from: r */
    public static final h00<Integer> f37192r = h00.m32762g(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: r0 */
    public static final h00<String> f37193r0 = h00.m32765j(1, "gads:idless:cookie_modification", "=; Max-Age=-1; path=/; domain=.doubleclick.net");

    /* renamed from: r1 */
    public static final h00<Boolean> f37194r1;

    /* renamed from: r2 */
    public static final h00<Boolean> f37195r2;

    /* renamed from: r3 */
    public static final h00<Boolean> f37196r3;

    /* renamed from: r4 */
    public static final h00<Boolean> f37197r4;

    /* renamed from: r5 */
    public static final h00<Long> f37198r5 = h00.m32763h(1, "gads:timeout_query_json_cache:millis", 3600000);

    /* renamed from: r6 */
    public static final h00<Boolean> f37199r6;

    /* renamed from: r7 */
    public static final h00<Boolean> f37200r7;

    /* renamed from: s */
    public static final h00<Long> f37201s = h00.m32763h(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: s0 */
    public static final h00<Boolean> f37202s0;

    /* renamed from: s1 */
    public static final h00<Boolean> f37203s1;

    /* renamed from: s2 */
    public static final h00<Integer> f37204s2 = h00.m32762g(1, "gads:native_video_load_timeout", 10);

    /* renamed from: s3 */
    public static final h00<Boolean> f37205s3;

    /* renamed from: s4 */
    public static final h00<Long> f37206s4 = h00.m32763h(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: s5 */
    public static final h00<Boolean> f37207s5;

    /* renamed from: s6 */
    public static final h00<Integer> f37208s6 = h00.m32762g(1, "gads:remote_log_send_rate_ms", 60000);

    /* renamed from: t */
    public static final h00<Long> f37209t = h00.m32763h(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: t0 */
    public static final h00<Boolean> f37210t0;

    /* renamed from: t1 */
    public static final h00<Boolean> f37211t1;

    /* renamed from: t2 */
    public static final h00<String> f37212t2 = h00.m32765j(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: t3 */
    public static final h00<Boolean> f37213t3;

    /* renamed from: t4 */
    public static final h00<Integer> f37214t4 = h00.m32762g(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: t5 */
    public static final h00<Boolean> f37215t5;

    /* renamed from: t6 */
    public static final h00<Integer> f37216t6 = h00.m32762g(1, "gads:remote_log_queue_max_entries", 500);

    /* renamed from: u */
    public static final h00<Integer> f37217u = h00.m32762g(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: u0 */
    public static final h00<Boolean> f37218u0;

    /* renamed from: u1 */
    public static final h00<Boolean> f37219u1;

    /* renamed from: u2 */
    public static final h00<Boolean> f37220u2;

    /* renamed from: u3 */
    public static final h00<Integer> f37221u3 = h00.m32762g(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: u4 */
    public static final h00<Integer> f37222u4 = h00.m32762g(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);

    /* renamed from: u5 */
    public static final h00<Boolean> f37223u5;

    /* renamed from: u6 */
    public static final h00<String> f37224u6 = h00.m32765j(1, "gads:remote_capture_service_url", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1");

    /* renamed from: v */
    public static final h00<String> f37225v = h00.m32765j(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: v0 */
    public static final h00<Boolean> f37226v0;

    /* renamed from: v1 */
    public static final h00<Boolean> f37227v1;

    /* renamed from: v2 */
    public static final h00<Boolean> f37228v2;

    /* renamed from: v3 */
    public static final h00<Boolean> f37229v3;

    /* renamed from: v4 */
    public static final h00<Integer> f37230v4 = h00.m32762g(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);

    /* renamed from: v5 */
    public static final h00<Long> f37231v5 = h00.m32763h(1, "gads:timeout_signal_collection_in_exp:millis", 1000);

    /* renamed from: v6 */
    public static final h00<Integer> f37232v6 = h00.m32762g(1, "gads:cui_monitoring_interval_ms", 300000);

    /* renamed from: w */
    public static final h00<Long> f37233w = h00.m32763h(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: w0 */
    public static final h00<Boolean> f37234w0;

    /* renamed from: w1 */
    public static final h00<Boolean> f37235w1;

    /* renamed from: w2 */
    public static final h00<Boolean> f37236w2;

    /* renamed from: w3 */
    public static final h00<Boolean> f37237w3;

    /* renamed from: w4 */
    public static final h00<Integer> f37238w4 = h00.m32762g(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);

    /* renamed from: w5 */
    public static final h00<Boolean> f37239w5;

    /* renamed from: w6 */
    public static final h00<String> f37240w6 = h00.m32765j(1, "gads:plugin_regex", "^Flutter-GMA-.*|^unity-.*");

    /* renamed from: x */
    public static final h00<Boolean> f37241x;

    /* renamed from: x0 */
    public static final h00<Integer> f37242x0 = h00.m32762g(1, "gads:show_interstitial_with_context:min_version", ScarAdapterFactory.CODE_19_8);

    /* renamed from: x1 */
    public static final h00<Boolean> f37243x1;

    /* renamed from: x2 */
    public static final h00<Boolean> f37244x2;

    /* renamed from: x3 */
    public static final h00<Boolean> f37245x3;

    /* renamed from: x4 */
    public static final h00<Boolean> f37246x4;

    /* renamed from: x5 */
    public static final h00<Boolean> f37247x5;

    /* renamed from: x6 */
    public static final h00<Integer> f37248x6 = h00.m32762g(1, "gads:app_event_queue_size", 20);

    /* renamed from: y */
    public static final h00<Long> f37249y = h00.m32763h(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: y0 */
    public static final h00<Boolean> f37250y0;

    /* renamed from: y1 */
    public static final h00<Boolean> f37251y1;

    /* renamed from: y2 */
    public static final h00<Boolean> f37252y2;

    /* renamed from: y3 */
    public static final h00<String> f37253y3 = h00.m32765j(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: y4 */
    public static final h00<Boolean> f37254y4;

    /* renamed from: y5 */
    public static final h00<Boolean> f37255y5;

    /* renamed from: y6 */
    public static final h00<Boolean> f37256y6;

    /* renamed from: z */
    public static final h00<Boolean> f37257z;

    /* renamed from: z0 */
    public static final h00<Boolean> f37258z0;

    /* renamed from: z1 */
    public static final h00<Boolean> f37259z1;

    /* renamed from: z2 */
    public static final h00<Boolean> f37260z2;

    /* renamed from: z3 */
    public static final h00<String> f37261z3 = h00.m32765j(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: z4 */
    public static final h00<Boolean> f37262z4;

    /* renamed from: z5 */
    public static final h00<Boolean> f37263z5;

    /* renamed from: z6 */
    public static final h00<Boolean> f37264z6;

    static {
        Boolean bool = Boolean.TRUE;
        f37147m = h00.m32764i(1, "gads:video_exo_player:fmp4_extractor_enabled", bool);
        Boolean bool2 = Boolean.FALSE;
        f37156n = h00.m32764i(1, "gads:video_exo_player:use_play_back_info_for_should_start_play_back", bool2);
        f37165o = h00.m32764i(1, "gads:video_exo_player:treat_load_exception_as_non_fatal", bool);
        f37241x = h00.m32764i(1, "gads:video:force_watermark", bool2);
        f37257z = h00.m32764i(1, "gads:video:spinner:enabled", bool2);
        f36831A = h00.m32764i(1, "gads:video:shutter:enabled", bool2);
        f36855D = h00.m32764i(1, "gads:video:aggressive_media_codec_release", bool2);
        f36863E = h00.m32764i(1, "gads:memory_bundle:debug_info", bool2);
        f36919L = h00.m32764i(1, "gads:mraid:expanded_interstitial_fix", bool2);
        f36927M = h00.m32764i(1, "gads:mraid:initial_size_fallback", bool2);
        f36975S = h00.m32764i(1, "gads:content_fetch_disable_get_title_from_webview", bool2);
        f36983T = h00.m32764i(1, "gads:content_fetch_enable_new_content_score", bool2);
        f36991U = h00.m32764i(1, "gads:content_fetch_enable_serve_once", bool2);
        f36999V = h00.m32764i(1, "gads:sai:enabled", bool);
        f37023Y = h00.m32764i(1, "gads:sai:using_macro:enabled", bool2);
        f37058c0 = h00.m32764i(1, "gads:sai:app_measurement_enabled3", bool2);
        f37076e0 = h00.m32764i(1, "gads:sai:force_through_reflection", bool);
        f37085f0 = h00.m32764i(1, "gads:sai:gmscore_availability_check_disabled", bool2);
        f37094g0 = h00.m32764i(1, "gads:sai:logging_disabled_for_drx", bool2);
        f37103h0 = h00.m32764i(1, "gads:sai:app_measurement_npa_enabled", bool2);
        f37112i0 = h00.m32764i(1, "gads:idless:idless_disables_attestation", bool);
        f37121j0 = h00.m32764i(1, "gads:idless:app_measurement_idless_enabled", bool);
        f37130k0 = h00.m32764i(1, "gads:sai:server_side_npa:disable_writing", bool2);
        f37139l0 = h00.m32764i(1, "gads:sai:server_side_npa:enabled", bool2);
        f37166o0 = h00.m32764i(1, "gads:idless:internal_state_enabled", bool);
        f37175p0 = h00.m32764i(1, "gads:idless:idless_disables_offline_ads_signalling", bool);
        f37184q0 = h00.m32764i(1, "gads:custom_idless:enabled", bool2);
        f37202s0 = h00.m32764i(1, "gads:tfcd_deny_ad_storage:enabled", bool2);
        f37210t0 = h00.m32764i(1, "gads:tfua_deny_ad_storage:enabled", bool2);
        f37218u0 = h00.m32764i(1, "gads:interstitial:app_must_be_foreground:enabled", bool2);
        f37226v0 = h00.m32764i(1, "gads:interstitial:foreground_report:enabled", bool2);
        f37234w0 = h00.m32764i(1, "gads:interstitial:default_immersive", bool2);
        f37250y0 = h00.m32764i(1, "gads:webview:error_web_response:enabled", bool2);
        f37258z0 = h00.m32764i(1, "gads:webview:set_fixed_text_zoom", bool);
        f36832A0 = h00.m32764i(1, "gads:webviewgone:kill_process:enabled", bool2);
        f36840B0 = h00.m32764i(1, "gads:webviewgone:new_onshow:enabled", bool2);
        f36856D0 = h00.m32764i(1, "gads:new_rewarded_ad:enabled", bool);
        f36864E0 = h00.m32764i(1, "gads:rewarded:adapter_initialization_enabled", bool2);
        f36872F0 = h00.m32764i(1, "gads:rewarded:ad_metadata_enabled", bool2);
        f36896I0 = h00.m32764i(1, "gads:adid_values_in_adrequest:enabled", bool2);
        f36912K0 = h00.m32764i(1, "gads:disable_adid_values_in_ms", bool2);
        f36928M0 = h00.m32764i(1, "gads:custom_close_blocking:enabled", bool2);
        f36936N0 = h00.m32764i(1, "gads:disabling_closable_area:enabled", bool2);
        f36944O0 = h00.m32764i(1, "gads:force_top_right_close_button:enabled", bool2);
        f36968R0 = h00.m32764i(1, "gads:disable_click_during_fade_in", bool2);
        f36976S0 = h00.m32764i(1, "gads:use_system_ui_for_fullscreen:enabled", bool2);
        f36984T0 = h00.m32764i(1, "gads:ad_overlay:collect_cutout_info:enabled", bool2);
        f37008W0 = h00.m32764i(1, "gads:include_local_global_rectangles", bool2);
        f37032Z0 = h00.m32764i(1, "gads:position_watcher:enable_scroll_aware_ads", bool2);
        f37041a1 = h00.m32764i(1, "gads:position_watcher:send_scroll_data", bool2);
        f37050b1 = h00.m32764i(1, "gads:gen204_signals:enabled", bool2);
        f37086f1 = h00.m32764i(1, "gads:presentation_error:urls_enabled", bool);
        f37095g1 = h00.m32764i(1, "gads:rtb_interstitial:use_fullscreen_monitor", bool);
        f37104h1 = h00.m32764i(1, "gads:native_required_assets:enabled", bool2);
        f37113i1 = h00.m32764i(1, "gads:native_required_assets:check_inner_mediaview:enabled", bool);
        f37131k1 = h00.m32764i(1, "gads:track_view_next_runloop:enabled", bool2);
        f37140l1 = h00.m32764i(1, "gads:synchronize_measurement_listener:enabled", bool2);
        f37149m1 = h00.m32764i(1, "gads:native_required_assets:viewability:enabled", bool2);
        f37158n1 = h00.m32764i(1, "gads:signal_adapters:enabled", bool2);
        f37194r1 = h00.m32764i(1, "gads:additional_video_csi:enabled", bool2);
        f37203s1 = h00.m32764i(1, "gads:using_official_simple_exoplayer:enabled", bool2);
        f37211t1 = h00.m32764i(1, "gads:multiple_video_playback:enabled", bool2);
        f37219u1 = h00.m32764i(1, "gads:run_exoplayer_video_stream_task_in_ui_thread:enabled", bool2);
        f37227v1 = h00.m32764i(1, "gads:csi:enabled_per_sampling", bool2);
        f37235w1 = h00.m32764i(1, "gads:always_set_transfer_listener:enabled", bool2);
        f37243x1 = h00.m32764i(1, "gads:initialization_csi:enabled", bool2);
        f37251y1 = h00.m32764i(1, "gads:msa:experiments:enabled", bool2);
        f37259z1 = h00.m32764i(1, "gads:msa:experiments:ps:enabled", bool);
        f36833A1 = h00.m32764i(1, "gads:msa:experiments:fb:enabled", bool);
        f36841B1 = h00.m32764i(1, "gads:msa:experiments:ps:er", bool);
        f36857D1 = h00.m32764i(1, "gads:msa:experiments:a2", bool2);
        f36865E1 = h00.m32764i(1, "gads:msa:experiments:log", bool2);
        f36873F1 = h00.m32764i(1, "gads:msa:experiments:vfb", bool);
        f36881G1 = h00.m32764i(1, "gads:msa:experiments:incapi:enabled", bool2);
        f36889H1 = h00.m32764i(1, "gads:msa:experiments:incapigass:enabled", bool2);
        f36913K1 = h00.m32764i(1, "gads:gestures:clearTd:enabled", bool2);
        f36929M1 = h00.m32764i(1, "gads:gestures:errorlogging:enabled", bool2);
        f36945O1 = h00.m32764i(1, "gads:gestures:asig:enabled", bool2);
        f36953P1 = h00.m32764i(1, "gads:gestures:ans:enabled", bool2);
        f36961Q1 = h00.m32764i(1, "gads:gestures:tos:enabled", bool2);
        f36969R1 = h00.m32764i(1, "gads:gestures:brt:enabled", bool);
        f36977S1 = h00.m32764i(1, "gads:gestures:fpi:enabled", bool2);
        f36985T1 = h00.m32764i(1, "gads:signal:app_permissions:disabled", bool2);
        f36993U1 = h00.m32764i(1, "gads:signal:app_set_id_info_in_ad_request:enabled", bool2);
        f37001V1 = h00.m32764i(1, "gads:gestures:hpk:enabled", bool);
        f37017X1 = h00.m32764i(1, "gads:gestures:bs:enabled", bool);
        f37025Y1 = h00.m32764i(1, "gads:gestures:check_initialization_thread:enabled", bool2);
        f37033Z1 = h00.m32764i(1, "gads:gestures:init_new_thread:enabled", bool);
        f37042a2 = h00.m32764i(1, "gads:gestures:pds:enabled", bool);
        f37060c2 = h00.m32764i(1, "gads:gestures:ns:enabled", bool);
        f37069d2 = h00.m32764i(1, "gads:gestures:vdd:enabled", bool2);
        f37078e2 = h00.m32764i(1, "gads:gadsignalsdelegate_ui_thread_fix:enabled", bool2);
        f37087f2 = h00.m32764i(1, "gads:native:asset_view_touch_events", bool2);
        f37096g2 = h00.m32764i(1, "gads:native:set_touch_listener_on_asset_views", bool);
        f37105h2 = h00.m32764i(1, "gads:ais:enabled", bool);
        f37114i2 = h00.m32764i(1, "gads:stav:enabled", bool2);
        f37123j2 = h00.m32764i(1, "gads:spam:impression_ui_idle:enable", bool2);
        f37168o2 = h00.m32764i(1, "gads:js_flags:disable_phenotype", bool2);
        f37195r2 = h00.m32764i(1, "gads:native:get_native_ad_view_signals", bool2);
        f37220u2 = h00.m32764i(1, "gads:enable_singleton_broadcast_receiver", bool2);
        f37228v2 = h00.m32764i(1, "gads:native:media_view_match_parent:enabled", bool);
        f37236w2 = h00.m32764i(1, "gads:video:restrict_inside_web_view:enabled", bool2);
        f37244x2 = h00.m32764i(1, "gads:native:count_impression_for_assets", bool2);
        f37252y2 = h00.m32764i(1, "gads:native:enable_enigma_watermarking", bool2);
        f37260z2 = h00.m32764i(1, "gads:fluid_ad:use_wrap_content_height", bool2);
        f36834A2 = h00.m32764i(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", bool);
        f36842B2 = h00.m32764i(1, "gads:get_request_signals_cld:enabled", bool);
        f36850C2 = h00.m32764i(1, "gads:get_request_signals_common_cld:enabled", bool);
        f36858D2 = h00.m32764i(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", bool);
        String str = "(?!)";
        f36898I2 = h00.m32764i(1, "gads:cache:downloader_use_high_priority", bool2);
        f36914K2 = h00.m32764i(1, "gads:cache:bind_on_foreground", bool2);
        f36922L2 = h00.m32764i(1, "gads:cache:bind_on_init", bool2);
        f36930M2 = h00.m32764i(1, "gads:cache:bind_on_request", bool2);
        f36946O2 = h00.m32764i(1, "gads:cache:use_cache_data_source", bool2);
        f36954P2 = h00.m32764i(1, "gads:cache:connection_per_read", bool2);
        f36978S2 = h00.m32764i(1, "gads:cache:read_inner_data_source_if_gcache_miss", bool2);
        f36986T2 = h00.m32764i(1, "gads:cache:read_inner_data_source_if_gcache_not_downloaded", bool2);
        f36994U2 = h00.m32764i(1, "gads:cache:function_call_timeout_v1:enabled", bool2);
        f37010W2 = h00.m32764i(1, "gads:cache:add_itag_to_cache_key:enabled", bool2);
        f37018X2 = h00.m32764i(1, "gads:http_assets_cache:enabled", bool2);
        f37043a3 = h00.m32764i(1, "gads:chrome_custom_tabs_browser:enabled", bool2);
        f37052b3 = h00.m32764i(1, "gads:chrome_custom_tabs:disabled", bool2);
        f37061c3 = h00.m32764i(1, "gads:chrome_custom_tabs_browser_v2:enabled", bool2);
        f37070d3 = h00.m32764i(1, "gads:cct_v2_connection:enabled", bool2);
        f37079e3 = h00.m32764i(1, "gads:cct_v2_direct_launch:enabled", bool2);
        f37088f3 = h00.m32764i(1, "gads:chrome_custom_tabs_for_native_ads:enabled", bool2);
        f37097g3 = h00.m32764i(1, "gad:cct_v2_beta:enabled", bool2);
        f37115i3 = h00.m32764i(2, "CHROME_CUSTOM_TAB_OPT_OUT", bool2);
        f37187q3 = h00.m32764i(1, "gad:interstitial_notify_publisher_without_delay", bool2);
        f37196r3 = h00.m32764i(1, "gad:interstitial_for_multi_window", bool2);
        f37205s3 = h00.m32764i(1, "gad:interstitial_ad_stay_active_in_multi_window", bool2);
        f37213t3 = h00.m32764i(1, "gad:interstitial_multi_window_method", bool2);
        f37229v3 = h00.m32764i(1, "gads:clearcut_logging:enabled", bool2);
        f37237w3 = h00.m32764i(1, "gads:clearcut_logging:write_to_file", bool2);
        f37245x3 = h00.m32764i(1, "gad:publisher_testing:force_local_request:enabled", bool);
        f36843B3 = h00.m32764i(1, "gads:omid:enabled", bool);
        f36859D3 = h00.m32764i(1, "gads:omid_use_admob_impl_dependency:enabled", bool2);
        f36867E3 = h00.m32764i(1, "gads:omid_use_base_64_encoding_for_native_html:enabled", bool2);
        f36875F3 = h00.m32764i(1, "gads:nonagon:banner:enabled", bool);
        f36883G3 = h00.m32765j(1, "gads:nonagon:banner:ad_unit_exclusions", str);
        f36891H3 = h00.m32764i(1, "gads:nonagon:app_open:enabled", bool);
        f36915K3 = h00.m32764i(1, "gads:nonagon:app_open_app_switch_signal:enabled", bool2);
        f36923L3 = h00.m32765j(1, "gads:nonagon:app_open:ad_unit_exclusions", str);
        f36931M3 = h00.m32764i(1, "gads:nonagon:interstitial:enabled", bool);
        f36939N3 = h00.m32765j(1, "gads:nonagon:interstitial:ad_unit_exclusions", str);
        f36947O3 = h00.m32764i(1, "gads:nonagon:rewardedvideo:enabled", bool);
        f36955P3 = h00.m32764i(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool);
        f36963Q3 = h00.m32765j(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", str);
        f36971R3 = h00.m32764i(1, "gads:nonagon:banner:check_dp_size", bool);
        f36979S3 = h00.m32764i(1, "gads:nonagon:rewarded:load_multiple_ads", bool);
        f36987T3 = h00.m32764i(1, "gads:nonagon:return_no_fill_error_code", bool2);
        f36995U3 = h00.m32764i(1, "gads:nonagon:continue_on_no_fill", bool2);
        f37003V3 = h00.m32764i(1, "gads:nonagon:separate_timeout:enabled", bool);
        f37019X3 = h00.m32764i(1, "gads:nonagon:banner_recursive_renderer", bool2);
        f37027Y3 = h00.m32764i(1, "gads:nonagon:app_stats_lock:enabled", bool2);
        f37035Z3 = h00.m32764i(1, "gads:nonagon:app_stats_main_thread:enabled", bool2);
        f37044a4 = h00.m32764i(1, "gads:uri_query_to_map_bg_thread:enabled", bool2);
        f37071d4 = h00.m32764i(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool);
        f37080e4 = h00.m32764i(1, "gads:active_view_gmsg_separate_pool:enabled", bool);
        f37089f4 = h00.m32764i(1, "gads:active_view_audio_signal_audio_mode:enabled", bool2);
        f37098g4 = h00.m32764i(1, "gads:signals:ad_id_info:enabled", bool2);
        f37107h4 = h00.m32764i(1, "gads:signals:app_index:enabled", bool2);
        f37116i4 = h00.m32764i(1, "gads:signals:attestation_token:enabled", bool2);
        f37125j4 = h00.m32764i(1, "gads:signals:cache:enabled", bool2);
        f37134k4 = h00.m32764i(1, "gads:signals:doritos:enabled", bool2);
        f37143l4 = h00.m32764i(1, "gads:signals:doritos:v1:enabled", bool2);
        f37152m4 = h00.m32764i(1, "gads:signals:doritos:v2:immediate:enabled", bool2);
        f37161n4 = h00.m32764i(1, "gads:signals:parental_control:enabled", bool2);
        f37170o4 = h00.m32764i(1, "gads:signals:video_decoder:enabled", bool2);
        f37179p4 = h00.m32764i(1, "gads:signals:banner_hardware_acceleration:enabled", bool2);
        f37188q4 = h00.m32764i(1, "gads:signals:native_hardware_acceleration:enabled", bool2);
        f37197r4 = h00.m32764i(1, "gads:attestation_token:enabled", bool2);
        f37246x4 = h00.m32764i(1, "gads:consent:shared_preference_reading:enabled", bool);
        f37254y4 = h00.m32764i(1, "gads:consent:iab_consent_info:enabled", bool);
        f37262z4 = h00.m32764i(1, "gads:fc_consent:shared_preference_reading:enabled", bool);
        f36844B4 = h00.m32764i(1, "gads:nativeads:image:sample:enabled", bool);
        f36860D4 = h00.m32764i(1, "gads:nativeads:pub_image_scale_type:enabled", bool);
        f36868E4 = h00.m32764i(1, "gads:offline_signaling:enabled", bool2);
        f36884G4 = h00.m32764i(1, "gads:nativeads:template_signal:enabled", bool);
        f36892H4 = h00.m32764i(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool);
        f36900I4 = h00.m32764i(1, "gads:nativeads:media_content_metadata:enabled", bool);
        f36908J4 = h00.m32764i(1, "gads:buffer_click_url_as_ready_to_ping:enabled", bool2);
        f36916K4 = h00.m32764i(1, "gads:predictive_prefetch_from_cld:enabled", bool2);
        f36924L4 = h00.m32764i(1, "gads:cache_layer_from_cld:enabled", bool2);
        f36932M4 = h00.m32764i(1, "gads:cache_layer_wait_for_app_settings:enabled", bool2);
        f36940N4 = h00.m32764i(1, "gads:precache_pool:verbose_logging", bool2);
        f37099g5 = h00.m32764i(1, "gads:memory_leak:b129558083", bool2);
        f37108h5 = h00.m32764i(1, "gads:unhandled_event_reporting:enabled", bool2);
        f37117i5 = h00.m32764i(1, "gads:response_info:enabled", bool);
        f37126j5 = h00.m32764i(1, "gads:csi:interstitial_failed_to_show:enabled", bool2);
        f37135k5 = h00.m32764i(1, "gads:csi:mediation_failure:enabled", bool2);
        f37153m5 = h00.m32764i(1, "gads:csi:eids_from_cld:enabled", bool2);
        f37162n5 = h00.m32764i(1, "gads:request_id_check:enabled", bool2);
        f37171o5 = h00.m32764i(1, "gads:request_id_int32:enabled", bool);
        f37180p5 = h00.m32764i(1, "gads:render_decouple:enabled", bool);
        f37207s5 = h00.m32764i(1, "gads:scar_csi:enabled", bool2);
        f37215t5 = h00.m32764i(1, "gads:scar_signal_comparison_experiment:enabled", bool2);
        f37223u5 = h00.m32764i(1, "gads:scar_signal_comparison_format:unknown", bool2);
        f37239w5 = h00.m32764i(1, "gads:scar_trustless_token_for_gbid:enabled", bool2);
        f37247x5 = h00.m32764i(1, "gads:scar_v2:send_click_ping:enabled", bool2);
        f37255y5 = h00.m32764i(1, "gads:scar_v2:send_impression_pings:enabled", bool2);
        f37263z5 = h00.m32764i(1, "gads:scar_v2:user_agent:enabled", bool2);
        f36845B5 = h00.m32764i(1, "gads:scar_v2:prior_click_count:enabled", bool2);
        f36869E5 = h00.m32764i(1, "gads:signal_collection_without_rendering:enabled", bool);
        f36885G5 = h00.m32764i(2, "DISABLE_CRASH_REPORTING", bool2);
        f36893H5 = h00.m32764i(1, "gads:paid_event_listener:enabled", bool);
        f36901I5 = h00.m32764i(1, "gads:interscroller_ad:enabled", bool);
        f36909J5 = h00.m32764i(1, "gads:interscroller_ad:refresh:enabled", bool2);
        f36933M5 = h00.m32764i(1, "gads:is_in_scroll_view_new_api:enabled", bool);
        f36941N5 = h00.m32764i(1, "gads:policy_validator_for_all_pubs:enabled", bool);
        f36965Q5 = h00.m32764i(2, "NATIVE_AD_DEBUGGER_ENABLED", bool);
        f36989T5 = h00.m32764i(1, "gads:use_wide_viewport:enabled", bool2);
        f36997U5 = h00.m32764i(1, "gads:load_with_overview_mode:enabled", bool2);
        f37005V5 = h00.m32764i(1, "gads:wire_banner_listener_after_request:enabled", bool2);
        f37013W5 = h00.m32764i(1, "gads:wire_app_open_listener_after_request:enabled", bool2);
        f37021X5 = h00.m32764i(1, "gads:wire_interstitial_listener_after_request:enabled", bool2);
        f37037Z5 = h00.m32764i(1, "gads:can_open_app_and_open_app_action:enabled", bool2);
        f37046a6 = h00.m32764i(1, "gads:open_gmsg:set_uri_data_and_type:enabled", bool2);
        f37064c6 = h00.m32764i(1, "gads:forward_bow_error_string:enabled", bool);
        f37073d6 = h00.m32764i(1, "gads:continue_on_process_response:enabled", bool2);
        f37082e6 = h00.m32764i(1, "gads:mediation_status_reporting:enabled", bool);
        f37100g6 = h00.m32764i(1, "gads:line_item_no_fill_conversion:enabled", bool2);
        f37118i6 = h00.m32764i(1, "gads:offline_ads_notification:enabled", bool);
        f37127j6 = h00.m32764i(1, "gads:use_new_network_api:enabled", bool);
        f37136k6 = h00.m32764i(1, "gads:handle_click_recorded_event:enabled", bool2);
        f37145l6 = h00.m32764i(1, "gads:default_network_type_fine_to_unknown:enabled", bool);
        f37154m6 = h00.m32764i(1, "gads:handle_intent_async:enabled", bool);
        f37163n6 = h00.m32764i(1, "gads:skip_deep_link_validation_native_ads:enabled", bool);
        f37172o6 = h00.m32764i(1, "gads:try_deep_link_fallback_native_ads:enabled", bool);
        f37181p6 = h00.m32764i(1, "gads:in_app_link_handling_for_android_11_enabled:enabled", bool);
        f37190q6 = h00.m32764i(1, "gads:new_remote_logging_utils:enabled", bool2);
        f37199r6 = h00.m32764i(1, "gads:remote_logging:enabled", bool2);
        f37256y6 = h00.m32764i(1, "gads:hide_grey_title_bar:enabled", bool2);
        f37264z6 = h00.m32764i(1, "gads:interstitial_ad_parameter_handler:enabled", bool);
        f36838A6 = h00.m32764i(1, "gads:inspector:enabled", bool);
        f36870E6 = h00.m32764i(1, "gads:inspector:shake_enabled", bool);
        f36910J6 = h00.m32764i(1, "gads:inspector:flick_enabled", bool);
        f36958P6 = h00.m32764i(1, "gads:inspector:ad_manager_enabled", bool);
        f36966Q6 = h00.m32764i(1, "gads:inspector:policy_violations_enabled", bool2);
        f36974R6 = h00.m32764i(1, "gads:inspector:bidding_data_enabled", bool);
        f36982S6 = h00.m32764i(1, "gads:paw_register_webview:enabled", bool);
        f36990T6 = h00.m32764i(1, "gads:paw_webview_early_initialization:enabled", bool2);
        f36998U6 = h00.m32764i(1, "gads:h5ads:enabled", bool);
        f37030Y6 = h00.m32764i(1, "gads:native_html_video_asset:enabled", bool);
        f37038Z6 = h00.m32764i(1, "gads:native_html_image_asset:enabled", bool);
        f37047a7 = h00.m32764i(1, "gads:leibniz:events:enabled", bool2);
        f37056b7 = h00.m32764i(1, "gads:msa:alphavis_enabled", bool2);
        f37065c7 = h00.m32764i(1, "gads:msa:adutilalphavis_enabled", bool2);
        f37074d7 = h00.m32764i(1, "gads:msa:nativealphavis_enabled", bool2);
        f37092f7 = h00.m32764i(1, "gads:msa:vswfl", bool2);
        f37101g7 = h00.m32764i(1, "gads:msa:poslogger", bool2);
        f37110h7 = h00.m32764i(1, "gads:new_dynamite_module_method:enabled", bool2);
        f37119i7 = h00.m32764i(1, "gads:new_show_failure_coverage:enabled", bool2);
        f37137k7 = h00.m32764i(1, "gads:read_pub_callback_param_open_gmsg:enabled", bool);
        f37146l7 = h00.m32764i(1, "gads:read_pub_callback_param_click_gmsg:enabled", bool);
        f37155m7 = h00.m32764i(1, "gads:forward_physical_click_to_ad_listener:enabled", bool);
        f37164n7 = h00.m32764i(1, "gads:webview_destroy_workaround:enabled", bool);
        f37173o7 = h00.m32764i(1, "gads:appstate_getresource_fix:enabled", bool2);
        f37182p7 = h00.m32764i(1, "gads:convert_ad_unit_lower_case_rtb:enabled", bool2);
        f37191q7 = h00.m32764i(1, "gads:drx_ad_unit_regex_case_insensitive:enabled", bool2);
        f37200r7 = h00.m32764i(1, "gads:csi_ping_for_invalid_dynamite_flags_access:enabled", bool2);
    }

    /* renamed from: a */
    public static List<String> m35911a() {
        return C8311wv.m39275a().mo32512a();
    }

    /* renamed from: b */
    public static List<String> m35912b() {
        return C8311wv.m39275a().mo32513b();
    }

    /* renamed from: c */
    public static void m35913c(Context context) {
        r00.m36840a(new o00(context));
    }

    /* renamed from: d */
    public static void m35914d(Context context, int i, JSONObject jSONObject) {
        C8311wv.m39276b();
        SharedPreferences.Editor edit = j00.m33504a(context).edit();
        C8311wv.m39275a();
        s10<Boolean> s10 = w10.f40654a;
        C8311wv.m39275a().mo32516e(edit, 1, jSONObject);
        C8311wv.m39276b();
        edit.commit();
    }
}
