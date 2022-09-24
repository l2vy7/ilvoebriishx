package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C11422h;
import com.ironsource.mediationsdk.model.C11423i;
import com.ironsource.mediationsdk.model.C11429n;
import com.ironsource.mediationsdk.model.C11430o;
import com.ironsource.mediationsdk.model.C11431p;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.utils.k */
public final class C11495k {

    /* renamed from: A */
    private final String f51608A = IronSourceConstants.EVENTS_GENERIC_PARAMS;

    /* renamed from: A0 */
    private final String f51609A0 = "numOfSeconds";

    /* renamed from: B */
    private final String f51610B = "adUnits";

    /* renamed from: B0 */
    private final String f51611B0 = "unit";

    /* renamed from: C */
    private final String f51612C = "providerLoadName";

    /* renamed from: C0 */
    private final String f51613C0 = "virtualItemName";

    /* renamed from: D */
    private final String f51614D = MimeTypes.BASE_TYPE_APPLICATION;

    /* renamed from: D0 */
    private final String f51615D0 = "virtualItemCount";

    /* renamed from: E */
    private final String f51616E = "rewardedVideo";

    /* renamed from: E0 */
    private final String f51617E0 = "backFill";

    /* renamed from: F */
    private final String f51618F = IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE;

    /* renamed from: F0 */
    private final String f51619F0 = "premium";

    /* renamed from: G */
    private final String f51620G = "offerwall";

    /* renamed from: G0 */
    private final String f51621G0 = "uuidEnabled";

    /* renamed from: H */
    private final String f51622H = "banner";

    /* renamed from: H0 */
    private final String f51623H0 = "abt";

    /* renamed from: I */
    private final String f51624I = "integration";

    /* renamed from: I0 */
    private final String f51625I0 = "delayLoadFailure";

    /* renamed from: J */
    private final String f51626J = "loggers";

    /* renamed from: J0 */
    private final String f51627J0 = "keysToInclude";

    /* renamed from: K */
    private final String f51628K = "segment";

    /* renamed from: K0 */
    private final String f51629K0 = "reporterURL";

    /* renamed from: L */
    private final String f51630L = "events";

    /* renamed from: L0 */
    private final String f51631L0 = "reporterKeyword";

    /* renamed from: M */
    private final String f51632M = "crashReporter";

    /* renamed from: M0 */
    private final String f51633M0 = "includeANR";

    /* renamed from: N */
    private final String f51634N = "token";

    /* renamed from: N0 */
    private final String f51635N0 = "timeout";

    /* renamed from: O */
    private final String f51636O = "external";

    /* renamed from: O0 */
    private final String f51637O0 = "setIgnoreDebugger";

    /* renamed from: P */
    private final String f51638P = "mediationTypes";

    /* renamed from: P0 */
    private final String f51639P0 = "adSourceName";

    /* renamed from: Q */
    private final String f51640Q = "providerDefaultInstance";

    /* renamed from: Q0 */
    private final String f51641Q0 = "spId";

    /* renamed from: R */
    private final String f51642R = "settings";

    /* renamed from: R0 */
    private final String f51643R0 = "mpis";

    /* renamed from: S */
    private final String f51644S = "maxNumOfAdaptersToLoadOnStart";

    /* renamed from: S0 */
    private final String f51645S0 = "auction";

    /* renamed from: T */
    private final String f51646T = "advancedLoading";

    /* renamed from: T0 */
    private final String f51647T0 = "auctionData";

    /* renamed from: U */
    private final String f51648U = "adapterTimeOutInSeconds";

    /* renamed from: U0 */
    private final String f51649U0 = "auctioneerURL";

    /* renamed from: V */
    private final String f51650V = "atim";

    /* renamed from: V0 */
    private final String f51651V0 = IronSourceConstants.EVENTS_PROGRAMMATIC;

    /* renamed from: W */
    private final String f51652W = "bannerInterval";

    /* renamed from: W0 */
    private final String f51653W0 = "objectPerWaterfall";

    /* renamed from: X */
    private final String f51654X = "loadRVInterval";

    /* renamed from: X0 */
    private final String f51655X0 = "minTimeBeforeFirstAuction";

    /* renamed from: Y */
    private final String f51656Y = "expiredDurationInMinutes";

    /* renamed from: Y0 */
    private final String f51657Y0 = "timeToWaitBeforeAuction";

    /* renamed from: Z */
    private final String f51658Z = "server";

    /* renamed from: Z0 */
    private final String f51659Z0 = "timeToWaitBeforeLoad";

    /* renamed from: a */
    public C11429n f51660a;

    /* renamed from: a0 */
    private final String f51661a0 = "publisher";

    /* renamed from: a1 */
    private final String f51662a1 = "auctionRetryInterval";

    /* renamed from: b */
    public C11430o f51663b;

    /* renamed from: b0 */
    private final String f51664b0 = "console";

    /* renamed from: b1 */
    private final String f51665b1 = "isAuctionOnShowStart";

    /* renamed from: c */
    public C11422h f51666c;

    /* renamed from: c0 */
    private final String f51667c0 = "sendUltraEvents";

    /* renamed from: c1 */
    private final String f51668c1 = "isLoadWhileShow";

    /* renamed from: d */
    public JSONObject f51669d;

    /* renamed from: d0 */
    private final String f51670d0 = "sendEventsToggle";

    /* renamed from: d1 */
    private final String f51671d1 = IronSourceConstants.AUCTION_TRIALS;

    /* renamed from: e */
    private final String f51672e = "error";

    /* renamed from: e0 */
    private final String f51673e0 = "eventsCompression";

    /* renamed from: e1 */
    private final String f51674e1 = "auctionTimeout";

    /* renamed from: f */
    private final int f51675f = 3;

    /* renamed from: f0 */
    private final String f51676f0 = "serverEventsURL";

    /* renamed from: f1 */
    private final String f51677f1 = "auctionSavedHistory";

    /* renamed from: g */
    private final int f51678g = 2;

    /* renamed from: g0 */
    private final String f51679g0 = "serverEventsType";

    /* renamed from: g1 */
    private final String f51680g1 = "disableLoadWhileShowSupportFor";

    /* renamed from: h */
    private final int f51681h = 60;

    /* renamed from: h0 */
    private final String f51682h0 = "backupThreshold";

    /* renamed from: h1 */
    private final String f51683h1 = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: i */
    private final int f51684i = 10000;

    /* renamed from: i0 */
    private final String f51685i0 = "maxNumberOfEvents";

    /* renamed from: i1 */
    private final String f51686i1 = "compressAuctionRequest";

    /* renamed from: j */
    private final int f51687j = 5000;

    /* renamed from: j0 */
    private final String f51688j0 = "maxEventsPerBatch";

    /* renamed from: j1 */
    private final String f51689j1 = "compressAuctionResponse";

    /* renamed from: k */
    private final int f51690k = 300;

    /* renamed from: k0 */
    private final String f51691k0 = "optOut";

    /* renamed from: k1 */
    private final String f51692k1 = "encryptionVersion";

    /* renamed from: l */
    private final int f51693l = 3;

    /* renamed from: l0 */
    private final String f51694l0 = "optIn";

    /* renamed from: l1 */
    private final String f51695l1 = "shouldSendBannerBURLFromImpression";

    /* renamed from: m */
    private final int f51696m = 3;

    /* renamed from: m0 */
    private final String f51697m0 = "triggerEvents";

    /* renamed from: m1 */
    private final String f51698m1 = "optInKeys";

    /* renamed from: n */
    private final int f51699n = 3;

    /* renamed from: n0 */
    private final String f51700n0 = "nonConnectivityEvents";

    /* renamed from: n1 */
    private final String f51701n1 = "tokenGenericParams";

    /* renamed from: o */
    private final int f51702o = 2;

    /* renamed from: o0 */
    private final String f51703o0 = "pixel";

    /* renamed from: o1 */
    private final String f51704o1 = "oneToken";

    /* renamed from: p */
    private final int f51705p = 15;

    /* renamed from: p0 */
    private final String f51706p0 = "pixelEventsUrl";

    /* renamed from: p1 */
    private final String f51707p1 = "compressToken";

    /* renamed from: q */
    private final long f51708q = ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;

    /* renamed from: q0 */
    private final String f51709q0 = "pixelEventsEnabled";

    /* renamed from: q1 */
    private final String f51710q1 = "isExternalArmEventsEnabled";

    /* renamed from: r */
    private final int f51711r = 0;

    /* renamed from: r0 */
    private final String f51712r0 = "placements";

    /* renamed from: r1 */
    private final String f51713r1 = "externalArmEventsUrl";

    /* renamed from: s */
    private final boolean f51714s = false;

    /* renamed from: s0 */
    private final String f51715s0 = "placementId";

    /* renamed from: s1 */
    private final String f51716s1 = "compressExternalToken";

    /* renamed from: t */
    private final int f51717t = 30000;

    /* renamed from: t0 */
    private final String f51718t0 = "placementName";

    /* renamed from: t1 */
    private String f51719t1;

    /* renamed from: u */
    private final int f51720u = -1;

    /* renamed from: u0 */
    private final String f51721u0 = "delivery";

    /* renamed from: u1 */
    private String f51722u1;

    /* renamed from: v */
    private final int f51723v = 5000;

    /* renamed from: v0 */
    private final String f51724v0 = "isDefault";

    /* renamed from: v1 */
    private Context f51725v1;

    /* renamed from: w */
    private final int f51726w = 1;

    /* renamed from: w0 */
    private final String f51727w0 = "capping";

    /* renamed from: x */
    private final String f51728x = "providerOrder";

    /* renamed from: x0 */
    private final String f51729x0 = "pacing";

    /* renamed from: y */
    private final String f51730y = "providerSettings";

    /* renamed from: y0 */
    private final String f51731y0 = "enabled";

    /* renamed from: z */
    private final String f51732z = "configurations";

    /* renamed from: z0 */
    private final String f51733z0 = "maxImpressions";

    public C11495k(Context context, String str, String str2, String str3) {
        this.f51725v1 = context;
        try {
            this.f51669d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            m51300h();
            m51301i();
            m51299g();
            this.f51719t1 = TextUtils.isEmpty(str) ? "" : str;
            this.f51722u1 = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            m51297e();
        }
    }

    public C11495k(C11495k kVar) {
        try {
            this.f51725v1 = kVar.f51725v1;
            this.f51669d = new JSONObject(kVar.f51669d.toString());
            this.f51719t1 = kVar.f51719t1;
            this.f51722u1 = kVar.f51722u1;
            this.f51660a = kVar.f51660a;
            this.f51663b = kVar.f51663b;
            this.f51666c = kVar.f51666c;
        } catch (Exception unused) {
            m51297e();
        }
    }

    /* renamed from: a */
    private static int m51293a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r7.toString().equals(r6) != false) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ironsource.mediationsdk.model.C11426l m51294b(org.json.JSONObject r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ironsource.mediationsdk.model.l$a r1 = new com.ironsource.mediationsdk.model.l$a
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r9.optBoolean(r2, r3)
            r1.f51405a = r2
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r9.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L_0x0058
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0044
            com.ironsource.mediationsdk.model.m r7 = com.ironsource.mediationsdk.model.C11428m.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x0037
        L_0x0035:
            r0 = r7
            goto L_0x0044
        L_0x0037:
            com.ironsource.mediationsdk.model.m r7 = com.ironsource.mediationsdk.model.C11428m.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0044
            goto L_0x0035
        L_0x0044:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L_0x0054
            if (r6 <= 0) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r1.mo44439a(r2, r0, r6)
        L_0x0058:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            if (r9 == 0) goto L_0x0073
            java.lang.String r0 = "numOfSeconds"
            int r0 = r9.optInt(r0, r5)
            boolean r9 = r9.optBoolean(r4, r5)
            if (r9 == 0) goto L_0x006f
            if (r0 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            r1.mo44438a(r3, r0)
        L_0x0073:
            com.ironsource.mediationsdk.model.l r9 = r1.mo44440a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11495k.m51294b(org.json.JSONObject):com.ironsource.mediationsdk.model.l");
    }

    /* renamed from: c */
    private static int[] m51295c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    /* renamed from: d */
    private static JSONObject m51296d(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: e */
    private void m51297e() {
        this.f51669d = new JSONObject();
        this.f51719t1 = "";
        this.f51722u1 = "";
        this.f51660a = new C11429n();
        this.f51663b = C11430o.m51086a();
        this.f51666c = new C11422h();
    }

    /* renamed from: f */
    private boolean m51298f() {
        JSONArray names = m51296d(this.f51669d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject d = m51296d(m51296d(this.f51669d, "configurations"), "adUnits");
        for (int i = 0; i < names.length(); i++) {
            JSONArray optJSONArray = m51296d(d, names.optString(i)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private void m51299g() {
        C11422h hVar;
        C11423i iVar;
        C11422h hVar2;
        C11431p pVar;
        try {
            JSONObject d = m51296d(this.f51669d, "providerOrder");
            JSONArray optJSONArray = d.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = d.optJSONArray(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            JSONArray optJSONArray3 = d.optJSONArray("banner");
            this.f51660a = new C11429n();
            if (!(optJSONArray == null || (hVar2 = this.f51666c) == null || (pVar = hVar2.f51377a) == null)) {
                String str = pVar.f51429f;
                String str2 = pVar.f51430g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.f51660a.f51416b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f51660a.f51417c = str2;
                        }
                        C11429n nVar = this.f51660a;
                        if (!TextUtils.isEmpty(optString)) {
                            nVar.f51415a.add(optString);
                        }
                        NetworkSettings a = C11430o.m51086a().mo44442a(optString);
                        if (a != null) {
                            a.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || (hVar = this.f51666c) == null || (iVar = hVar.f51378b) == null)) {
                String str3 = iVar.f51388g;
                String str4 = iVar.f51389h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.f51660a.f51420f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f51660a.f51421g = str4;
                        }
                        C11429n nVar2 = this.f51660a;
                        if (!TextUtils.isEmpty(optString2)) {
                            nVar2.f51418d.add(optString2);
                        }
                        NetworkSettings a2 = C11430o.m51086a().mo44442a(optString2);
                        if (a2 != null) {
                            a2.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    C11429n nVar3 = this.f51660a;
                    if (!TextUtils.isEmpty(optString3)) {
                        nVar3.f51419e.add(optString3);
                    }
                    NetworkSettings a3 = C11430o.m51086a().mo44442a(optString3);
                    if (a3 != null) {
                        a3.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m51300h() {
        JSONObject jSONObject;
        String str;
        C11430o oVar;
        NetworkSettings networkSettings;
        String str2 = "Mediation";
        try {
            this.f51663b = C11430o.m51086a();
            JSONObject d = m51296d(this.f51669d, "providerSettings");
            Iterator<String> keys = d.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = d.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", SessionDescription.SUPPORTED_SDP_VERSION);
                    String optString2 = optJSONObject.optString("adSourceName", (String) null);
                    String optString3 = optJSONObject.optString("providerLoadName", next);
                    String optString4 = optJSONObject.optString("providerDefaultInstance", optString3);
                    JSONObject d2 = m51296d(optJSONObject, "adUnits");
                    JSONObject d3 = m51296d(optJSONObject, MimeTypes.BASE_TYPE_APPLICATION);
                    JSONObject d4 = m51296d(d2, "rewardedVideo");
                    JSONObject d5 = m51296d(d2, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    JSONObject d6 = m51296d(d2, "banner");
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(d4, d3);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(d5, d3);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(d6, d3);
                    if (this.f51663b.mo44445b(next)) {
                        NetworkSettings a = this.f51663b.mo44442a(next);
                        JSONObject rewardedVideoSettings = a.getRewardedVideoSettings();
                        JSONObject interstitialSettings = a.getInterstitialSettings();
                        JSONObject bannerSettings = a.getBannerSettings();
                        a.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        a.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        a.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        a.setIsMultipleInstances(optBoolean);
                        a.setSubProviderId(optString);
                        a.setAdSourceNameForEvents(optString2);
                    } else {
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = optString3.toLowerCase(locale);
                        jSONObject = d;
                        if (this.f51663b.mo44445b(str2) && (IronSourceConstants.SUPERSONIC_CONFIG_NAME.toLowerCase(locale).equals(lowerCase) || IronSourceConstants.IRONSOURCE_CONFIG_NAME.toLowerCase(locale).equals(lowerCase))) {
                            NetworkSettings a2 = this.f51663b.mo44442a(str2);
                            JSONObject rewardedVideoSettings2 = a2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = a2.getInterstitialSettings();
                            JSONObject bannerSettings2 = a2.getBannerSettings();
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d3, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), mergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            oVar = this.f51663b;
                        } else {
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d3, mergeJsons, mergeJsons2, mergeJsons3);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            oVar = this.f51663b;
                        }
                        oVar.mo44443a(networkSettings);
                    }
                } else {
                    str = str2;
                    jSONObject = d;
                }
                str2 = str;
                d = jSONObject;
            }
            this.f51663b.mo44444b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x0547 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x078b A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08c5 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x032a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x055a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x079e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x08d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0317 A[Catch:{ Exception -> 0x0586 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m51301i() {
        /*
            r82 = this;
            r1 = r82
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f51669d     // Catch:{ Exception -> 0x0abd }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = m51296d(r3, r4)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = m51296d(r3, r4)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = m51296d(r3, r5)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = m51296d(r4, r5)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = m51296d(r4, r6)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = m51296d(r4, r7)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = m51296d(r4, r8)     // Catch:{ Exception -> 0x0abd }
            org.json.JSONObject r8 = m51296d(r3, r2)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = m51296d(r3, r9)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = m51296d(r3, r10)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = m51296d(r3, r11)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = m51296d(r3, r12)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = m51296d(r3, r13)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = m51296d(r3, r14)     // Catch:{ Exception -> 0x0abd }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = m51296d(r3, r15)     // Catch:{ Exception -> 0x0abd }
            r16 = r15
            java.lang.String r15 = "pixel"
            org.json.JSONObject r15 = m51296d(r8, r15)     // Catch:{ Exception -> 0x0abd }
            r17 = r14
            r14 = 1
            if (r3 == 0) goto L_0x007d
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            boolean r11 = r3.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0abd }
            android.content.Context r14 = r1.f51725v1     // Catch:{ Exception -> 0x0abd }
            r19 = r13
            java.lang.String r13 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.m51226m(r14, r13, r11)     // Catch:{ Exception -> 0x0abd }
            goto L_0x0081
        L_0x007d:
            r18 = r11
            r19 = r13
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0abd }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0abd }
            if (r13 != 0) goto L_0x009b
            com.ironsource.mediationsdk.a.d r13 = com.ironsource.mediationsdk.p275a.C11292d.m50446e()     // Catch:{ Exception -> 0x0abd }
            r13.f50686p = r11     // Catch:{ Exception -> 0x0abd }
            com.ironsource.mediationsdk.a.h r13 = com.ironsource.mediationsdk.p275a.C11296h.m50466e()     // Catch:{ Exception -> 0x0abd }
            r13.f50686p = r11     // Catch:{ Exception -> 0x0abd }
        L_0x009b:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r14 = "maxNumberOfEvents"
            r20 = r9
            java.lang.String r9 = "backupThreshold"
            r21 = r6
            r22 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r24 = r15
            java.lang.String r15 = "sendEventsToggle"
            r25 = r10
            java.lang.String r10 = "placements"
            r26 = r4
            java.lang.String r4 = "optIn"
            java.lang.String r1 = "optOut"
            r27 = r12
            java.lang.String r12 = "eventsCompression"
            r28 = r11
            java.lang.String r11 = ""
            r29 = 0
            r30 = r4
            if (r5 == 0) goto L_0x0355
            org.json.JSONArray r4 = r5.optJSONArray(r10)     // Catch:{ Exception -> 0x0350 }
            r31 = r10
            org.json.JSONObject r10 = m51296d(r5, r2)     // Catch:{ Exception -> 0x0350 }
            r32 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r33 = r4
            r4 = 2
            int r2 = m51293a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "advancedLoading"
            r34 = r2
            r2 = 0
            int r4 = m51293a(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0350 }
            if (r4 <= 0) goto L_0x00ee
            r36 = r4
            r37 = 1
            goto L_0x00f2
        L_0x00ee:
            r36 = r34
            r37 = 0
        L_0x00f2:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r4 = 60
            int r38 = m51293a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r2 = "loadRVInterval"
            r4 = 300(0x12c, float:4.2E-43)
            int r39 = m51293a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r4 = -1
            int r40 = m51293a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r2 = "delayLoadFailure"
            r4 = 3
            int r43 = m51293a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0350 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r8)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "sendUltraEvents"
            r10 = 0
            boolean r45 = r2.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0350 }
            boolean r46 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0350 }
            boolean r47 = r2.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r48 = r2.optString(r7, r11)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r49 = r2.optString(r6, r11)     // Catch:{ Exception -> 0x0350 }
            r4 = -1
            int r50 = r2.optInt(r9, r4)     // Catch:{ Exception -> 0x0350 }
            int r51 = r2.optInt(r14, r4)     // Catch:{ Exception -> 0x0350 }
            r4 = 5000(0x1388, float:7.006E-42)
            int r52 = r2.optInt(r13, r4)     // Catch:{ Exception -> 0x0350 }
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0350 }
            if (r4 == 0) goto L_0x015d
            int r10 = r4.length()     // Catch:{ Exception -> 0x0350 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0350 }
            r34 = r1
            r57 = r13
            r1 = 0
        L_0x014b:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0350 }
            if (r1 >= r13) goto L_0x015a
            int r13 = r4.optInt(r1)     // Catch:{ Exception -> 0x0350 }
            r10[r1] = r13     // Catch:{ Exception -> 0x0350 }
            int r1 = r1 + 1
            goto L_0x014b
        L_0x015a:
            r53 = r10
            goto L_0x0163
        L_0x015d:
            r34 = r1
            r57 = r13
            r53 = r29
        L_0x0163:
            r1 = r30
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0350 }
            if (r4 == 0) goto L_0x0186
            int r10 = r4.length()     // Catch:{ Exception -> 0x0350 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0350 }
            r30 = r1
            r13 = 0
        L_0x0174:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0350 }
            if (r13 >= r1) goto L_0x0183
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0350 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0350 }
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0183:
            r54 = r10
            goto L_0x018a
        L_0x0186:
            r30 = r1
            r54 = r29
        L_0x018a:
            r1 = r28
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0350 }
            if (r4 == 0) goto L_0x01ad
            int r10 = r4.length()     // Catch:{ Exception -> 0x0350 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0350 }
            r28 = r1
            r13 = 0
        L_0x019b:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0350 }
            if (r13 >= r1) goto L_0x01aa
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0350 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0350 }
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01aa:
            r55 = r10
            goto L_0x01b1
        L_0x01ad:
            r28 = r1
            r55 = r29
        L_0x01b1:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0350 }
            if (r1 == 0) goto L_0x01d2
            int r2 = r1.length()     // Catch:{ Exception -> 0x0350 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0350 }
            r4 = 0
        L_0x01c0:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0350 }
            if (r4 >= r10) goto L_0x01cf
            int r10 = r1.optInt(r4)     // Catch:{ Exception -> 0x0350 }
            r2[r4] = r10     // Catch:{ Exception -> 0x0350 }
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01cf:
            r56 = r2
            goto L_0x01d4
        L_0x01d2:
            r56 = r29
        L_0x01d4:
            com.ironsource.mediationsdk.model.c r41 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0350 }
            r44 = r41
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0350 }
            if (r27 == 0) goto L_0x02a0
            java.lang.String r1 = "rewardedVideo"
            r2 = r27
            org.json.JSONObject r1 = m51296d(r2, r1)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "auctionData"
            java.lang.String r59 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "auctionTrials"
            r10 = 2
            int r61 = r2.optInt(r4, r10)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "auctionTimeout"
            r10 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r4, r14)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "programmatic"
            boolean r65 = r1.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r4 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r4 = r1.optInt(r4, r13)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r1.optInt(r13, r14)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r27 = r2
            r2 = 5000(0x1388, float:7.006E-42)
            int r14 = r1.optInt(r14, r2)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r2 = "timeToWaitBeforeLoad"
            r44 = r10
            r10 = 50
            int r2 = r1.optInt(r2, r10)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r10 = "isAuctionOnShowStart"
            r45 = r9
            r9 = 0
            boolean r74 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r10 = "isLoadWhileShow"
            boolean r75 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r9 = "timeToDeleteOldWaterfallAfterAuction"
            r10 = 30000(0x7530, float:4.2039E-41)
            int r76 = r1.optInt(r9, r10)     // Catch:{ Exception -> 0x0350 }
            com.ironsource.mediationsdk.utils.b r9 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0350 }
            r10 = r6
            r46 = r7
            long r6 = (long) r4     // Catch:{ Exception -> 0x0350 }
            r66 = r6
            long r6 = (long) r13     // Catch:{ Exception -> 0x0350 }
            r68 = r6
            long r6 = (long) r14     // Catch:{ Exception -> 0x0350 }
            r70 = r6
            long r6 = (long) r2     // Catch:{ Exception -> 0x0350 }
            r72 = r6
            r81 = 0
            r58 = r9
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r2 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0350 }
            if (r1 == 0) goto L_0x029d
            r2 = 0
        L_0x0285:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0350 }
            if (r2 >= r4) goto L_0x029d
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0350 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0350 }
            if (r6 != 0) goto L_0x029a
            java.util.ArrayList<java.lang.String> r6 = r9.f51546o     // Catch:{ Exception -> 0x0350 }
            r6.add(r4)     // Catch:{ Exception -> 0x0350 }
        L_0x029a:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x029d:
            r42 = r9
            goto L_0x02ae
        L_0x02a0:
            r10 = r6
            r46 = r7
            r45 = r9
            r44 = r14
            com.ironsource.mediationsdk.utils.b r1 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0350 }
            r1.<init>()     // Catch:{ Exception -> 0x0350 }
            r42 = r1
        L_0x02ae:
            com.ironsource.mediationsdk.model.p r1 = new com.ironsource.mediationsdk.model.p     // Catch:{ Exception -> 0x0350 }
            r35 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0350 }
            if (r33 == 0) goto L_0x032f
            r2 = 0
        L_0x02b8:
            int r4 = r33.length()     // Catch:{ Exception -> 0x0350 }
            if (r2 >= r4) goto L_0x032f
            r4 = r33
            org.json.JSONObject r6 = r4.optJSONObject(r2)     // Catch:{ Exception -> 0x0350 }
            if (r6 == 0) goto L_0x0311
            java.lang.String r7 = "placementId"
            r9 = -1
            int r36 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r7 = "placementName"
            java.lang.String r37 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r7 = "isDefault"
            r9 = 0
            boolean r38 = r6.optBoolean(r7, r9)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r7 = "virtualItemName"
            java.lang.String r39 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0350 }
            java.lang.String r7 = "virtualItemCount"
            r9 = -1
            int r40 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0350 }
            com.ironsource.mediationsdk.model.l r6 = m51294b(r6)     // Catch:{ Exception -> 0x0350 }
            if (r36 < 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r37)     // Catch:{ Exception -> 0x0350 }
            if (r7 != 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r39)     // Catch:{ Exception -> 0x0350 }
            if (r7 != 0) goto L_0x0311
            if (r40 <= 0) goto L_0x0311
            com.ironsource.mediationsdk.model.Placement r7 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0350 }
            r35 = r7
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0350 }
            if (r6 == 0) goto L_0x030e
            r6 = r82
            android.content.Context r9 = r6.f51725v1     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C11484c.m51233a((android.content.Context) r9, (com.ironsource.mediationsdk.model.Placement) r7)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0315
        L_0x030e:
            r6 = r82
            goto L_0x0315
        L_0x0311:
            r6 = r82
            r7 = r29
        L_0x0315:
            if (r7 == 0) goto L_0x032a
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r9 = r1.f51424a     // Catch:{ Exception -> 0x0586 }
            r9.add(r7)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.Placement r9 = r1.f51434k     // Catch:{ Exception -> 0x0586 }
            if (r9 != 0) goto L_0x0323
        L_0x0320:
            r1.f51434k = r7     // Catch:{ Exception -> 0x0586 }
            goto L_0x032a
        L_0x0323:
            int r9 = r7.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r9 != 0) goto L_0x032a
            goto L_0x0320
        L_0x032a:
            int r2 = r2 + 1
            r33 = r4
            goto L_0x02b8
        L_0x032f:
            r6 = r82
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0586 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x033f
            r1.f51429f = r2     // Catch:{ Exception -> 0x0586 }
        L_0x033f:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0586 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x034d
            r1.f51430g = r2     // Catch:{ Exception -> 0x0586 }
        L_0x034d:
            r36 = r1
            goto L_0x0368
        L_0x0350:
            r0 = move-exception
            r6 = r82
            goto L_0x0abf
        L_0x0355:
            r34 = r1
            r32 = r2
            r46 = r7
            r45 = r9
            r31 = r10
            r57 = r13
            r44 = r14
            r10 = r6
            r6 = r82
            r36 = r29
        L_0x0368:
            if (r21 == 0) goto L_0x0589
            r1 = r21
            r2 = r31
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            r5 = r32
            org.json.JSONObject r7 = m51296d(r1, r5)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r9 = m51293a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = m51293a(r1, r3, r13, r14)     // Catch:{ Exception -> 0x0586 }
            if (r13 <= 0) goto L_0x038d
            r38 = r13
            r39 = 1
            goto L_0x0391
        L_0x038d:
            r38 = r9
            r39 = 0
        L_0x0391:
            java.lang.String r9 = "adapterTimeOutInSeconds"
            r13 = 60
            int r40 = m51293a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "delayLoadFailure"
            r13 = 3
            int r43 = m51293a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x0586 }
            r9 = 0
            boolean r60 = r7.optBoolean(r15, r9)     // Catch:{ Exception -> 0x0586 }
            boolean r61 = r7.optBoolean(r12, r9)     // Catch:{ Exception -> 0x0586 }
            r9 = r46
            java.lang.String r62 = r7.optString(r9, r11)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r63 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x0586 }
            r13 = r45
            r14 = -1
            int r64 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x0586 }
            r45 = r13
            r13 = r44
            int r65 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x0586 }
            r44 = r13
            r14 = r57
            r13 = 5000(0x1388, float:7.006E-42)
            int r66 = r7.optInt(r14, r13)     // Catch:{ Exception -> 0x0586 }
            r57 = r14
            r13 = r34
            org.json.JSONArray r14 = r7.optJSONArray(r13)     // Catch:{ Exception -> 0x0586 }
            if (r14 == 0) goto L_0x03f9
            r34 = r13
            int r13 = r14.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r46 = r9
            r21 = r10
            r10 = 0
        L_0x03e7:
            int r9 = r14.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r9) goto L_0x03f6
            int r9 = r14.optInt(r10)     // Catch:{ Exception -> 0x0586 }
            r13[r10] = r9     // Catch:{ Exception -> 0x0586 }
            int r10 = r10 + 1
            goto L_0x03e7
        L_0x03f6:
            r67 = r13
            goto L_0x0401
        L_0x03f9:
            r46 = r9
            r21 = r10
            r34 = r13
            r67 = r29
        L_0x0401:
            r9 = r30
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x0424
            int r13 = r10.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r30 = r9
            r14 = 0
        L_0x0412:
            int r9 = r10.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r9) goto L_0x0421
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r13[r14] = r9     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x0412
        L_0x0421:
            r68 = r13
            goto L_0x0428
        L_0x0424:
            r30 = r9
            r68 = r29
        L_0x0428:
            r9 = r28
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x044b
            int r13 = r10.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r28 = r9
            r14 = 0
        L_0x0439:
            int r9 = r10.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r9) goto L_0x0448
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r13[r14] = r9     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x0439
        L_0x0448:
            r69 = r13
            goto L_0x044f
        L_0x044b:
            r28 = r9
            r69 = r29
        L_0x044f:
            java.lang.String r9 = "nonConnectivityEvents"
            org.json.JSONArray r7 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x0586 }
            if (r7 == 0) goto L_0x0470
            int r9 = r7.length()     // Catch:{ Exception -> 0x0586 }
            int[] r9 = new int[r9]     // Catch:{ Exception -> 0x0586 }
            r10 = 0
        L_0x045e:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r13) goto L_0x046d
            int r13 = r7.optInt(r10)     // Catch:{ Exception -> 0x0586 }
            r9[r10] = r13     // Catch:{ Exception -> 0x0586 }
            int r10 = r10 + 1
            goto L_0x045e
        L_0x046d:
            r70 = r9
            goto L_0x0472
        L_0x0470:
            r70 = r29
        L_0x0472:
            com.ironsource.mediationsdk.model.c r41 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0586 }
            r59 = 0
            r58 = r41
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x0586 }
            if (r27 == 0) goto L_0x04eb
            java.lang.String r7 = "interstitial"
            r9 = r27
            org.json.JSONObject r7 = m51296d(r9, r7)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "auctionData"
            java.lang.String r59 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "auctioneerURL"
            java.lang.String r60 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "auctionTrials"
            r13 = 2
            int r61 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "auctionSavedHistory"
            r13 = 15
            int r62 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r9.optLong(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r78 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r80 = r9.optInt(r10, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "programmatic"
            boolean r65 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r7 = r7.optInt(r10, r13)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.b r10 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            long r13 = (long) r7     // Catch:{ Exception -> 0x0586 }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r81 = 0
            r58 = r10
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0586 }
            r42 = r10
            goto L_0x04f4
        L_0x04eb:
            r9 = r27
            com.ironsource.mediationsdk.utils.b r7 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r7.<init>()     // Catch:{ Exception -> 0x0586 }
            r42 = r7
        L_0x04f4:
            com.ironsource.mediationsdk.model.i r7 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x0586 }
            r37 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x0563
            r10 = 0
        L_0x04fe:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r13) goto L_0x0563
            org.json.JSONObject r13 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x0586 }
            if (r13 == 0) goto L_0x053d
            java.lang.String r14 = "placementId"
            r27 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r31 = r9
            java.lang.String r9 = "isDefault"
            r32 = r11
            r11 = 0
            boolean r9 = r13.optBoolean(r9, r11)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.l r11 = m51294b(r13)     // Catch:{ Exception -> 0x0586 }
            if (r14 < 0) goto L_0x0543
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0586 }
            if (r13 != 0) goto L_0x0543
            com.ironsource.mediationsdk.model.InterstitialPlacement r13 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x0586 }
            r13.<init>(r14, r4, r9, r11)     // Catch:{ Exception -> 0x0586 }
            if (r11 == 0) goto L_0x0545
            android.content.Context r4 = r6.f51725v1     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C11484c.m51232a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r13)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0545
        L_0x053d:
            r27 = r4
            r31 = r9
            r32 = r11
        L_0x0543:
            r13 = r29
        L_0x0545:
            if (r13 == 0) goto L_0x055a
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r7.f51382a     // Catch:{ Exception -> 0x0586 }
            r4.add(r13)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r7.f51391j     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x0553
        L_0x0550:
            r7.f51391j = r13     // Catch:{ Exception -> 0x0586 }
            goto L_0x055a
        L_0x0553:
            int r4 = r13.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x055a
            goto L_0x0550
        L_0x055a:
            int r10 = r10 + 1
            r4 = r27
            r9 = r31
            r11 = r32
            goto L_0x04fe
        L_0x0563:
            r31 = r9
            r32 = r11
            java.lang.String r4 = "backFill"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Exception -> 0x0586 }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0586 }
            if (r9 != 0) goto L_0x0575
            r7.f51388g = r4     // Catch:{ Exception -> 0x0586 }
        L_0x0575:
            java.lang.String r4 = "premium"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Exception -> 0x0586 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x0583
            r7.f51389h = r1     // Catch:{ Exception -> 0x0586 }
        L_0x0583:
            r37 = r7
            goto L_0x0595
        L_0x0586:
            r0 = move-exception
            goto L_0x0abf
        L_0x0589:
            r21 = r10
            r2 = r31
            r5 = r32
            r32 = r11
            r31 = r27
            r37 = r29
        L_0x0595:
            if (r26 == 0) goto L_0x07ae
            r1 = r26
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r7 = m51296d(r1, r5)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r10 = 1
            int r48 = m51293a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "atim"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x0586 }
            r13 = 0
            if (r10 == 0) goto L_0x05b7
            long r9 = r1.optLong(r9, r13)     // Catch:{ Exception -> 0x0586 }
            goto L_0x05c3
        L_0x05b7:
            boolean r10 = r3.has(r9)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x05c2
            long r9 = r3.optLong(r9, r13)     // Catch:{ Exception -> 0x0586 }
            goto L_0x05c3
        L_0x05c2:
            r9 = r13
        L_0x05c3:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x05ca
            r49 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05cc
        L_0x05ca:
            r49 = r9
        L_0x05cc:
            java.lang.String r9 = "delayLoadFailure"
            r10 = 3
            int r54 = m51293a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "bannerInterval"
            r10 = 60
            int r52 = m51293a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x0586 }
            r7 = 0
            boolean r60 = r1.optBoolean(r15, r7)     // Catch:{ Exception -> 0x0586 }
            boolean r61 = r1.optBoolean(r12, r7)     // Catch:{ Exception -> 0x0586 }
            r9 = r32
            r7 = r46
            java.lang.String r62 = r1.optString(r7, r9)     // Catch:{ Exception -> 0x0586 }
            r10 = r21
            java.lang.String r63 = r1.optString(r10, r9)     // Catch:{ Exception -> 0x0586 }
            r11 = r45
            r13 = -1
            int r64 = r1.optInt(r11, r13)     // Catch:{ Exception -> 0x0586 }
            r14 = r44
            int r65 = r1.optInt(r14, r13)     // Catch:{ Exception -> 0x0586 }
            r21 = r3
            r13 = r57
            r3 = 5000(0x1388, float:7.006E-42)
            int r66 = r1.optInt(r13, r3)     // Catch:{ Exception -> 0x0586 }
            r26 = r2
            r3 = r34
            org.json.JSONArray r2 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0636
            r34 = r3
            int r3 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x0586 }
            r57 = r13
            r44 = r14
            r13 = 0
        L_0x0624:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r13 >= r14) goto L_0x0633
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x0586 }
            r3[r13] = r14     // Catch:{ Exception -> 0x0586 }
            int r13 = r13 + 1
            goto L_0x0624
        L_0x0633:
            r67 = r3
            goto L_0x063e
        L_0x0636:
            r34 = r3
            r57 = r13
            r44 = r14
            r67 = r29
        L_0x063e:
            r2 = r30
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x0661
            int r13 = r3.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r30 = r2
            r14 = 0
        L_0x064f:
            int r2 = r3.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r2) goto L_0x065e
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r13[r14] = r2     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x064f
        L_0x065e:
            r68 = r13
            goto L_0x0665
        L_0x0661:
            r30 = r2
            r68 = r29
        L_0x0665:
            r2 = r28
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x0688
            int r13 = r3.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r28 = r2
            r14 = 0
        L_0x0676:
            int r2 = r3.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r2) goto L_0x0685
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r13[r14] = r2     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x0676
        L_0x0685:
            r69 = r13
            goto L_0x068c
        L_0x0688:
            r28 = r2
            r69 = r29
        L_0x068c:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x06ad
            int r2 = r1.length()     // Catch:{ Exception -> 0x0586 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0586 }
            r3 = 0
        L_0x069b:
            int r13 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r3 >= r13) goto L_0x06aa
            int r13 = r1.optInt(r3)     // Catch:{ Exception -> 0x0586 }
            r2[r3] = r13     // Catch:{ Exception -> 0x0586 }
            int r3 = r3 + 1
            goto L_0x069b
        L_0x06aa:
            r70 = r2
            goto L_0x06af
        L_0x06ad:
            r70 = r29
        L_0x06af:
            com.ironsource.mediationsdk.model.c r51 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0586 }
            r59 = 0
            r58 = r51
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x0586 }
            if (r31 == 0) goto L_0x072f
            java.lang.String r1 = "banner"
            r2 = r31
            org.json.JSONObject r1 = m51296d(r2, r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x0729
            java.lang.String r3 = "auctionData"
            java.lang.String r59 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "auctionTrials"
            r13 = 2
            int r61 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r3, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "programmatic"
            boolean r65 = r1.optBoolean(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = r1.optInt(r3, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r13 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r81 = r1.optBoolean(r13, r14)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.b r1 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            long r13 = (long) r3     // Catch:{ Exception -> 0x0586 }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r79 = 0
            r58 = r1
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0736
        L_0x0729:
            com.ironsource.mediationsdk.utils.b r1 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r1.<init>()     // Catch:{ Exception -> 0x0586 }
            goto L_0x0736
        L_0x072f:
            r2 = r31
            com.ironsource.mediationsdk.utils.b r1 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r1.<init>()     // Catch:{ Exception -> 0x0586 }
        L_0x0736:
            r53 = r1
            com.ironsource.mediationsdk.model.f r1 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x0586 }
            r47 = r1
            r47.<init>(r48, r49, r51, r52, r53, r54)     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x07a7
            r3 = 0
        L_0x0742:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0586 }
            if (r3 >= r13) goto L_0x07a7
            org.json.JSONObject r13 = r4.optJSONObject(r3)     // Catch:{ Exception -> 0x0586 }
            if (r13 == 0) goto L_0x0781
            java.lang.String r14 = "placementId"
            r23 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r9)     // Catch:{ Exception -> 0x0586 }
            r27 = r2
            java.lang.String r2 = "isDefault"
            r45 = r11
            r11 = 0
            boolean r2 = r13.optBoolean(r2, r11)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.l r11 = m51294b(r13)     // Catch:{ Exception -> 0x0586 }
            if (r14 < 0) goto L_0x0787
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0586 }
            if (r13 != 0) goto L_0x0787
            com.ironsource.mediationsdk.model.g r13 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x0586 }
            r13.<init>(r14, r4, r2, r11)     // Catch:{ Exception -> 0x0586 }
            if (r11 == 0) goto L_0x0789
            android.content.Context r2 = r6.f51725v1     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C11484c.m51234a((android.content.Context) r2, (com.ironsource.mediationsdk.model.C11421g) r13)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0789
        L_0x0781:
            r27 = r2
            r23 = r4
            r45 = r11
        L_0x0787:
            r13 = r29
        L_0x0789:
            if (r13 == 0) goto L_0x079e
            java.util.ArrayList<com.ironsource.mediationsdk.model.g> r2 = r1.f51371c     // Catch:{ Exception -> 0x0586 }
            r2.add(r13)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.g r2 = r1.f51372d     // Catch:{ Exception -> 0x0586 }
            if (r2 != 0) goto L_0x0797
        L_0x0794:
            r1.f51372d = r13     // Catch:{ Exception -> 0x0586 }
            goto L_0x079e
        L_0x0797:
            int r2 = r13.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r2 != 0) goto L_0x079e
            goto L_0x0794
        L_0x079e:
            int r3 = r3 + 1
            r4 = r23
            r2 = r27
            r11 = r45
            goto L_0x0742
        L_0x07a7:
            r27 = r2
            r45 = r11
            r39 = r1
            goto L_0x07bc
        L_0x07ae:
            r26 = r2
            r10 = r21
            r27 = r31
            r9 = r32
            r7 = r46
            r21 = r3
            r39 = r29
        L_0x07bc:
            if (r22 == 0) goto L_0x08dc
            r1 = r22
            org.json.JSONObject r2 = m51296d(r1, r5)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r8)     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            boolean r60 = r2.optBoolean(r15, r3)     // Catch:{ Exception -> 0x0586 }
            boolean r61 = r2.optBoolean(r12, r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r62 = r2.optString(r7, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r63 = r2.optString(r10, r9)     // Catch:{ Exception -> 0x0586 }
            r3 = r45
            r4 = -1
            int r64 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0586 }
            r3 = r44
            int r65 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0586 }
            r3 = r57
            r4 = 5000(0x1388, float:7.006E-42)
            int r66 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0586 }
            r3 = r34
            org.json.JSONArray r4 = r2.optJSONArray(r3)     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x080f
            int r7 = r4.length()     // Catch:{ Exception -> 0x0586 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x0586 }
            r10 = 0
        L_0x07fd:
            int r11 = r4.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r11) goto L_0x080c
            int r11 = r4.optInt(r10)     // Catch:{ Exception -> 0x0586 }
            r7[r10] = r11     // Catch:{ Exception -> 0x0586 }
            int r10 = r10 + 1
            goto L_0x07fd
        L_0x080c:
            r67 = r7
            goto L_0x0811
        L_0x080f:
            r67 = r29
        L_0x0811:
            r4 = r30
            org.json.JSONArray r7 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x0586 }
            if (r7 == 0) goto L_0x0832
            int r10 = r7.length()     // Catch:{ Exception -> 0x0586 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0586 }
            r11 = 0
        L_0x0820:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0586 }
            if (r11 >= r13) goto L_0x082f
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x0586 }
            r10[r11] = r13     // Catch:{ Exception -> 0x0586 }
            int r11 = r11 + 1
            goto L_0x0820
        L_0x082f:
            r68 = r10
            goto L_0x0834
        L_0x0832:
            r68 = r29
        L_0x0834:
            r7 = r28
            org.json.JSONArray r7 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x0586 }
            if (r7 == 0) goto L_0x0855
            int r10 = r7.length()     // Catch:{ Exception -> 0x0586 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0586 }
            r11 = 0
        L_0x0843:
            int r13 = r7.length()     // Catch:{ Exception -> 0x0586 }
            if (r11 >= r13) goto L_0x0852
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x0586 }
            r10[r11] = r13     // Catch:{ Exception -> 0x0586 }
            int r11 = r11 + 1
            goto L_0x0843
        L_0x0852:
            r69 = r10
            goto L_0x0857
        L_0x0855:
            r69 = r29
        L_0x0857:
            java.lang.String r7 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0878
            int r7 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x0586 }
            r10 = 0
        L_0x0866:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r11) goto L_0x0875
            int r11 = r2.optInt(r10)     // Catch:{ Exception -> 0x0586 }
            r7[r10] = r11     // Catch:{ Exception -> 0x0586 }
            int r10 = r10 + 1
            goto L_0x0866
        L_0x0875:
            r70 = r7
            goto L_0x087a
        L_0x0878:
            r70 = r29
        L_0x087a:
            com.ironsource.mediationsdk.model.c r2 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0586 }
            r59 = 0
            r58 = r2
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.j r7 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x0586 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0586 }
            r7.f51395d = r1     // Catch:{ Exception -> 0x0586 }
            r2 = r26
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x08d9
            r2 = 0
        L_0x0893:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r2 >= r10) goto L_0x08d9
            org.json.JSONObject r10 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x08c1
            java.lang.String r11 = "placementId"
            r13 = -1
            int r11 = r10.optInt(r11, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "placementName"
            java.lang.String r14 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r15 = "isDefault"
            r13 = 0
            boolean r10 = r10.optBoolean(r15, r13)     // Catch:{ Exception -> 0x0586 }
            if (r11 < 0) goto L_0x08c1
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0586 }
            if (r13 != 0) goto L_0x08c1
            com.ironsource.mediationsdk.model.k r13 = new com.ironsource.mediationsdk.model.k     // Catch:{ Exception -> 0x0586 }
            r13.<init>(r11, r14, r10)     // Catch:{ Exception -> 0x0586 }
            goto L_0x08c3
        L_0x08c1:
            r13 = r29
        L_0x08c3:
            if (r13 == 0) goto L_0x08d6
            java.util.ArrayList<com.ironsource.mediationsdk.model.k> r10 = r7.f51392a     // Catch:{ Exception -> 0x0586 }
            r10.add(r13)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.k r10 = r7.f51393b     // Catch:{ Exception -> 0x0586 }
            if (r10 != 0) goto L_0x08d1
        L_0x08ce:
            r7.f51393b = r13     // Catch:{ Exception -> 0x0586 }
            goto L_0x08d6
        L_0x08d1:
            int r10 = r13.f51396a     // Catch:{ Exception -> 0x0586 }
            if (r10 != 0) goto L_0x08d6
            goto L_0x08ce
        L_0x08d6:
            int r2 = r2 + 1
            goto L_0x0893
        L_0x08d9:
            r38 = r7
            goto L_0x08e2
        L_0x08dc:
            r4 = r30
            r3 = r34
            r38 = r29
        L_0x08e2:
            com.ironsource.mediationsdk.utils.o r1 = new com.ironsource.mediationsdk.utils.o     // Catch:{ Exception -> 0x0586 }
            r1.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r25 == 0) goto L_0x0928
            java.lang.String r2 = "optInKeys"
            r7 = r25
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x090c
            r10 = 0
        L_0x08f4:
            int r11 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r11) goto L_0x090c
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x0586 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0586 }
            if (r13 != 0) goto L_0x0909
            java.util.ArrayList<java.lang.String> r13 = r1.f51745a     // Catch:{ Exception -> 0x0586 }
            r13.add(r11)     // Catch:{ Exception -> 0x0586 }
        L_0x0909:
            int r10 = r10 + 1
            goto L_0x08f4
        L_0x090c:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0916
            r1.f51746b = r2     // Catch:{ Exception -> 0x0586 }
        L_0x0916:
            java.lang.String r2 = "oneToken"
            r10 = 0
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x0586 }
            r1.f51747c = r2     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = "compressToken"
            r10 = 1
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x0586 }
            r1.f51748d = r2     // Catch:{ Exception -> 0x0586 }
        L_0x0928:
            com.ironsource.mediationsdk.utils.j r2 = new com.ironsource.mediationsdk.utils.j     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r24 == 0) goto L_0x0948
            java.lang.String r7 = "pixelEventsUrl"
            java.lang.String r10 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r11 = r24
            java.lang.String r7 = r11.optString(r7, r10)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "pixelEventsEnabled"
            r13 = 1
            boolean r10 = r11.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "<set-?>"
            p303e8.C12691c.m53984c(r7, r11)     // Catch:{ Exception -> 0x0586 }
            r2.f51604b = r7     // Catch:{ Exception -> 0x0586 }
            goto L_0x0949
        L_0x0948:
            r10 = 1
        L_0x0949:
            r2.f51603a = r10     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x0960
            int[] r3 = m51295c(r8, r3)     // Catch:{ Exception -> 0x0586 }
            r2.f51606d = r3     // Catch:{ Exception -> 0x0586 }
            int[] r3 = m51295c(r8, r4)     // Catch:{ Exception -> 0x0586 }
            r2.f51607e = r3     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            boolean r4 = r8.optBoolean(r12, r3)     // Catch:{ Exception -> 0x0586 }
            r2.f51605c = r4     // Catch:{ Exception -> 0x0586 }
        L_0x0960:
            java.lang.String r3 = "server"
            r4 = r20
            r7 = 3
            int r3 = r4.optInt(r3, r7)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "publisher"
            int r10 = r4.optInt(r10, r7)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "console"
            int r4 = r4.optInt(r11, r7)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.e r7 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x0586 }
            r7.<init>(r3, r10, r4)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.sdk.g.d r3 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0586 }
            r3.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r19 == 0) goto L_0x09d7
            java.lang.String r4 = "enabled"
            r10 = r19
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r3.mo45004a((boolean) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "reporterURL"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0586 }
            r3.mo45005b((java.lang.String) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "reporterKeyword"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0586 }
            r3.mo45009c((java.lang.String) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "includeANR"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r3.mo45006b((boolean) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r4 = r10.optInt(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r3.mo45002a((int) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "setIgnoreDebugger"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r3.mo45010c((boolean) r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "keysToInclude"
            org.json.JSONArray r4 = r10.optJSONArray(r4)     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x09d7
            r10 = 0
        L_0x09c7:
            int r11 = r4.length()     // Catch:{ Exception -> 0x0586 }
            if (r10 >= r11) goto L_0x09d7
            java.lang.String r11 = r4.optString(r10)     // Catch:{ Exception -> 0x0586 }
            r3.mo45003a((java.lang.String) r11)     // Catch:{ Exception -> 0x0586 }
            int r10 = r10 + 1
            goto L_0x09c7
        L_0x09d7:
            if (r18 == 0) goto L_0x09f7
            java.lang.String r4 = "name"
            r10 = r18
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.q r11 = new com.ironsource.mediationsdk.model.q     // Catch:{ Exception -> 0x0586 }
            r11.<init>(r4, r9, r10)     // Catch:{ Exception -> 0x0586 }
            r42 = r11
            goto L_0x09f9
        L_0x09f7:
            r42 = r29
        L_0x09f9:
            com.ironsource.mediationsdk.utils.a r4 = new com.ironsource.mediationsdk.utils.a     // Catch:{ Exception -> 0x0586 }
            r4.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r17 == 0) goto L_0x0a20
            java.lang.String r4 = "isExternalArmEventsEnabled"
            r9 = r17
            r10 = 1
            boolean r4 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "externalArmEventsUrl"
            java.lang.String r11 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r10 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "sid"
            r12 = 1
            boolean r9 = r9.optBoolean(r11, r12)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.a r11 = new com.ironsource.mediationsdk.utils.a     // Catch:{ Exception -> 0x0586 }
            r11.<init>(r4, r10, r9)     // Catch:{ Exception -> 0x0586 }
            r46 = r11
            goto L_0x0a22
        L_0x0a20:
            r46 = r4
        L_0x0a22:
            com.ironsource.mediationsdk.model.d r4 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0586 }
            r4.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r16 == 0) goto L_0x0a47
            java.lang.String r4 = "mediationTypes"
            r9 = r16
            org.json.JSONObject r4 = r9.optJSONObject(r4)     // Catch:{ Exception -> 0x0586 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x0586 }
            r10.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x0a3c
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x0586 }
        L_0x0a3c:
            java.lang.String r4 = "compressExternalToken"
            r11 = 0
            r9.optBoolean(r4, r11)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.d r4 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0586 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x0586 }
        L_0x0a47:
            r47 = r4
            com.ironsource.mediationsdk.model.b r4 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0586 }
            r4.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r27 == 0) goto L_0x0a60
            java.lang.String r4 = "auctionData"
            r9 = r27
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0586 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0586 }
            r49 = r9
            goto L_0x0a62
        L_0x0a60:
            r49 = r4
        L_0x0a62:
            java.lang.String r4 = "integration"
            r9 = r21
            r10 = 0
            boolean r44 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.sdk.f.a r4 = new com.ironsource.sdk.f.a     // Catch:{ Exception -> 0x0586 }
            r40 = r4
            r41 = r7
            r43 = r1
            r45 = r3
            r48 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.h r1 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x0586 }
            r35 = r1
            r40 = r4
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0586 }
            r6.f51666c = r1     // Catch:{ Exception -> 0x0586 }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = m51296d(r8, r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x0aa8
            org.json.JSONObject r2 = m51296d(r1, r5)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0aa8
            r1.remove(r5)     // Catch:{ Exception -> 0x0586 }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p275a.C11296h.m50466e()     // Catch:{ Exception -> 0x0586 }
            r3.mo43981b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p275a.C11292d.m50446e()     // Catch:{ Exception -> 0x0586 }
            r3.mo43981b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0586 }
        L_0x0aa8:
            if (r1 == 0) goto L_0x0abc
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p275a.C11296h.m50466e()     // Catch:{ Exception -> 0x0586 }
            r2.mo43976a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p275a.C11292d.m50446e()     // Catch:{ Exception -> 0x0586 }
            r2.mo43976a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0586 }
        L_0x0abc:
            return
        L_0x0abd:
            r0 = move-exception
            r6 = r1
        L_0x0abf:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11495k.m51301i():void");
    }

    /* renamed from: a */
    public final boolean mo44559a() {
        JSONObject jSONObject = this.f51669d;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.f51660a != null) && this.f51663b != null) && this.f51666c != null) && m51298f();
    }

    /* renamed from: b */
    public final String mo44560b() {
        try {
            return this.f51660a.f51416b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo44561c() {
        try {
            return this.f51660a.f51417c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f51719t1);
            jSONObject.put(DataKeys.USER_ID, this.f51722u1);
            jSONObject.put("response", this.f51669d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
