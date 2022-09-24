package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C12385v4;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.enums.AnonymizationLevel;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.startapp.w4 */
/* compiled from: Sta */
public class C12408w4 {

    /* renamed from: A */
    private static final String f55036A = "P3INS_PFK_LAST_EXPORT_TIME";

    /* renamed from: B */
    private static final String f55037B = "P3INS_PFK_QOE_MANAGER_ENABLED";

    /* renamed from: C */
    private static final String f55038C = "P3INS_PFK_REGISTRATION_TIMESTAMP";

    /* renamed from: D */
    private static final String f55039D = "P3INS_PFK_IS_ALREADY_REGISTERED";

    /* renamed from: E */
    private static final String f55040E = "P3INS_PFK_SEND_REGISTRATION_TIMESTAMP_ENABLED";

    /* renamed from: F */
    private static final String f55041F = "P3INS_PFK_UPLOAD_EXTRA";

    /* renamed from: G */
    private static final String f55042G = "P3INS_PFK_VOWIFI_TEST_MANAGER_ENABLED";

    /* renamed from: H */
    private static final String f55043H = "P3INS_PFK_CT_CRITERIA_SERVER_LIST";

    /* renamed from: I */
    private static final String f55044I = "P3INS_PFK_LTR_CRITERIA_SERVER_LIST";

    /* renamed from: J */
    private static final String f55045J = "P3INS_PFK_CDN_CT_SERVER_LIST";

    /* renamed from: K */
    private static final String f55046K = "P3INS_PFK_CDN_CT_CRITERIA";

    /* renamed from: L */
    private static final String f55047L = "P3INS_PFK_CDN_LTR_SERVER_LIST";

    /* renamed from: M */
    private static final String f55048M = "P3INS_PFK_CDN_LTR_CRITERIA";

    /* renamed from: N */
    private static final String f55049N = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_MODIFIED";

    /* renamed from: O */
    private static final String f55050O = "P3INS_PFK_CONNECTIVITY_TEST_CDNCONFIG_LAST_CHECK";

    /* renamed from: P */
    private static final String f55051P = "P3INS_PFK_WIFI_SCAN_TIMESTAMP";

    /* renamed from: Q */
    private static final String f55052Q = "P3INS_PFK_WIFI_SCAN_ENABLED";

    /* renamed from: R */
    private static final String f55053R = "p3inspreferences";

    /* renamed from: b */
    private static final String f55054b = "p3ins_pfk_ul_params";

    /* renamed from: c */
    private static final String f55055c = "p3ins_pfk_ul_paramsetid";

    /* renamed from: d */
    private static final String f55056d = "p3ins_pfk_ul_allowed";

    /* renamed from: e */
    private static final String f55057e = "p3ins_pfk_db_retry";

    /* renamed from: f */
    private static final String f55058f = "p3ins_pfk_last_upload_time";

    /* renamed from: g */
    private static final String f55059g = "p3ins_pfk_guid";

    /* renamed from: h */
    private static final String f55060h = "P3INS_PFK_GUID_TIMESTAMP";

    /* renamed from: i */
    private static final String f55061i = "P3INS_PFK_CONNECTIVITY_TEST_ENABLED";

    /* renamed from: j */
    private static final String f55062j = "P3INS_PFK_CONNECTIVITY_KEEPALIVE_ENABLED";

    /* renamed from: k */
    private static final String f55063k = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_CHECK";

    /* renamed from: l */
    private static final String f55064l = "P3INS_PFK_CONNECTIVITY_TEST_TRUSTSTORE_LAST_MODIFIED";

    /* renamed from: m */
    private static final String f55065m = "P3INS_PFK_CONNECTIVITY_TEST_TIMESTAMP";

    /* renamed from: n */
    private static final String f55066n = "P3INS_PFK_APPUSAGE_SERVICE_ENABLED";

    /* renamed from: o */
    private static final String f55067o = "P3INS_PFK_APPUSAGE_LAST_SCREEN_SESSION_COUNTER";

    /* renamed from: p */
    private static final String f55068p = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_ENABLED";

    /* renamed from: q */
    private static final String f55069q = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_INTERVAL";

    /* renamed from: r */
    private static final String f55070r = "P3INS_PFK_APPUSAGE_INSTALLED_APP_SNAPSHOT_LAST_TIMESTAMP";

    /* renamed from: s */
    private static final String f55071s = "P3INS_PFK_APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED";

    /* renamed from: t */
    private static final String f55072t = "P3INS_PFK_VOICEMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: u */
    private static final String f55073u = "P3INS_PFK_VOICE_SERVICE_ENABLED";

    /* renamed from: v */
    private static final String f55074v = "P3INS_PFK_MESSAGING_SERVICE_ENABLED";

    /* renamed from: w */
    private static final String f55075w = "P3INS_PFK_MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE";

    /* renamed from: x */
    private static final String f55076x = "P3INS_PFK_COVERAGE_SERVICE_ENABLED";

    /* renamed from: y */
    private static final String f55077y = "P3INS_PFK_COVERAGE_SERVICE_TRIGGER_PROVIDER_MODE";

    /* renamed from: z */
    private static final String f55078z = "P3INS_PFK_TRAFFIC_ANALYZER_ENABLED";

    /* renamed from: a */
    private SharedPreferences f55079a;

    /* renamed from: com.startapp.w4$a */
    /* compiled from: Sta */
    public class C12409a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f55080a;

        public C12409a(String str) {
            this.f55080a = str;
        }

        public void run() {
            C12385v4.C12386a d = C12385v4.m53563d();
            if (d != null) {
                d.mo46673a(this.f55080a);
            }
        }
    }

    public C12408w4(Context context) {
        this.f55079a = context.getSharedPreferences(f55053R, 0);
    }

    /* renamed from: O */
    private boolean m53628O() {
        return this.f55079a.getBoolean(f55039D, false);
    }

    /* renamed from: A */
    public boolean mo46708A() {
        return this.f55079a.getBoolean(f55074v, C12385v4.m53561b().MESSAGING_SERVICE_ENABLED());
    }

    /* renamed from: B */
    public boolean mo46709B() {
        return this.f55079a.getBoolean(f55037B, C12385v4.m53561b().QOE_MANAGER_ENABLED());
    }

    /* renamed from: C */
    public long mo46710C() {
        return this.f55079a.getLong(f55038C, 0);
    }

    /* renamed from: D */
    public boolean mo46711D() {
        return this.f55079a.getBoolean(f55040E, C12385v4.m53561b().SEND_REGISTRATION_TIMESTAMP_ENABLED());
    }

    /* renamed from: E */
    public boolean mo46712E() {
        return this.f55079a.getBoolean(f55078z, C12385v4.m53561b().TRAFFIC_ANALYZER_ENABLED());
    }

    /* renamed from: F */
    public long mo46713F() {
        return this.f55079a.getLong(f55064l, 0);
    }

    /* renamed from: G */
    public String mo46714G() {
        return this.f55079a.getString(f55041F, "");
    }

    /* renamed from: H */
    public String mo46715H() {
        return this.f55079a.getString(f55055c, "");
    }

    /* renamed from: I */
    public String mo46716I() {
        return this.f55079a.getString(f55054b, "");
    }

    /* renamed from: J */
    public long mo46717J() {
        return this.f55079a.getLong(f55057e, 0);
    }

    /* renamed from: K */
    public boolean mo46718K() {
        return this.f55079a.getBoolean(f55042G, C12385v4.m53561b().VOWIFI_TEST_MANAGER_ENABLED());
    }

    /* renamed from: L */
    public AnonymizationLevel mo46719L() {
        return m53629a(this.f55079a.getString(f55072t, C12385v4.m53561b().VOICEMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    /* renamed from: M */
    public boolean mo46720M() {
        return this.f55079a.getBoolean(f55073u, C12385v4.m53561b().VOICE_SERVICE_ENABLED());
    }

    /* renamed from: N */
    public boolean mo46721N() {
        return this.f55079a.getBoolean(f55052Q, C12385v4.m53561b().WIFI_SCAN_ENABLED());
    }

    /* renamed from: P */
    public boolean mo46722P() {
        return this.f55079a.getBoolean(f55056d, true);
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public void mo46724a(long j) {
        this.f55079a.edit().putLong(f55069q, j).commit();
    }

    /* renamed from: b */
    public boolean mo46730b() {
        return this.f55079a.getBoolean(f55071s, C12385v4.m53561b().APPUSAGE_BROWSER_SESSION_TRACKING_ENABLED());
    }

    /* renamed from: c */
    public boolean mo46735c() {
        return this.f55079a.getBoolean(f55068p, C12385v4.m53561b().APPUSAGE_MANAGER_INSTALLED_APP_SNAPSHOT_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: d */
    public void mo46740d(boolean z) {
        this.f55079a.edit().putBoolean(f55068p, z).commit();
    }

    /* renamed from: e */
    public boolean mo46744e() {
        return this.f55079a.getBoolean(f55066n, C12385v4.m53561b().APPUSAGE_SERVICE_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: f */
    public void mo46748f(boolean z) {
        this.f55079a.edit().putBoolean(f55062j, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: g */
    public void mo46750g(long j) {
        this.f55079a.edit().putLong(f55036A, j).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    public void mo46755h(boolean z) {
        this.f55079a.edit().putBoolean(f55076x, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: i */
    public void mo46756i(long j) {
        this.f55079a.edit().putLong(f55058f, j).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: j */
    public void mo46761j(boolean z) {
        this.f55079a.edit().putBoolean(f55037B, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: k */
    public void mo46762k(long j) {
        this.f55079a.edit().putLong(f55038C, j).commit();
    }

    /* renamed from: l */
    public boolean mo46767l() {
        return this.f55079a.getBoolean(f55062j, C12385v4.m53561b().CONNECTIVITY_KEEPALIVE_ENABLED());
    }

    /* renamed from: m */
    public boolean mo46770m() {
        return this.f55079a.getBoolean(f55061i, C12385v4.m53561b().CONNECTIVITY_TEST_ENABLED());
    }

    /* renamed from: n */
    public boolean mo46772n() {
        return this.f55079a.getBoolean(f55076x, C12385v4.m53561b().COVERAGE_MAPPER_SERVICE_ENABLED());
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: o */
    public void mo46774o(boolean z) {
        this.f55079a.edit().putBoolean(f55073u, z).commit();
    }

    /* renamed from: p */
    public String mo46775p() {
        return mo46723a(false);
    }

    /* renamed from: q */
    public Set<String> mo46777q() {
        return this.f55079a.getStringSet(f55044I, (Set) null);
    }

    /* renamed from: r */
    public long mo46778r() {
        return this.f55079a.getLong(f55070r, 0);
    }

    /* renamed from: s */
    public long mo46779s() {
        return this.f55079a.getLong(f55067o, 1);
    }

    /* renamed from: t */
    public long mo46780t() {
        return this.f55079a.getLong(f55050O, 0);
    }

    /* renamed from: u */
    public long mo46781u() {
        return this.f55079a.getLong(f55065m, 2147483647L);
    }

    /* renamed from: v */
    public long mo46782v() {
        return this.f55079a.getLong(f55036A, 0);
    }

    /* renamed from: w */
    public long mo46783w() {
        return this.f55079a.getLong(f55063k, 0);
    }

    /* renamed from: x */
    public long mo46784x() {
        return this.f55079a.getLong(f55058f, 0);
    }

    /* renamed from: y */
    public long mo46785y() {
        return this.f55079a.getLong(f55051P, 2147483647L);
    }

    /* renamed from: z */
    public AnonymizationLevel mo46786z() {
        return m53629a(this.f55079a.getString(f55075w, C12385v4.m53561b().MESSAGINGMANAGER_PHONENUMBER_RECORD_TYPE().toString()));
    }

    /* renamed from: a */
    public String mo46723a(boolean z) {
        String string = this.f55079a.getString(f55059g, "");
        boolean z2 = true;
        if (string == null || string.length() == 0) {
            string = m53630a();
        } else {
            long d = C12112oa.m52716d();
            long j = this.f55079a.getLong(f55060h, 0);
            long GUID_MAX_AGE = C12385v4.m53561b().GUID_MAX_AGE();
            if ((GUID_MAX_AGE != -1 || z) && (d - j > GUID_MAX_AGE || z)) {
                string = m53630a();
            } else {
                z2 = false;
            }
        }
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new C11787a9(new C12409a(string)));
            if (mo46711D()) {
                m53628O();
            }
        }
        return string;
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    public void mo46728b(AnonymizationLevel anonymizationLevel) {
        this.f55079a.edit().putString(f55072t, anonymizationLevel.toString()).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: c */
    public void mo46731c(long j) {
        this.f55079a.edit().putLong(f55070r, j).commit();
    }

    /* renamed from: d */
    public long mo46736d() {
        return this.f55079a.getLong(f55069q, 86400000);
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: e */
    public void mo46743e(boolean z) {
        this.f55079a.edit().putBoolean(f55066n, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: f */
    public void mo46746f(long j) {
        this.f55079a.edit().putLong(f55065m, j).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: g */
    public void mo46752g(boolean z) {
        this.f55079a.edit().putBoolean(f55061i, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    public void mo46754h(long j) {
        this.f55079a.edit().putLong(f55063k, j).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: i */
    public void mo46757i(boolean z) {
        this.f55079a.edit().putBoolean(f55074v, z).commit();
    }

    /* renamed from: j */
    public String mo46759j() {
        return this.f55079a.getString(f55048M, C12385v4.m53561b().LATENCY_TEST_CRITERIA().name());
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: k */
    public void mo46763k(boolean z) {
        this.f55079a.edit().putBoolean(f55040E, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: l */
    public void mo46766l(boolean z) {
        this.f55079a.edit().putBoolean(f55078z, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: m */
    public void mo46769m(boolean z) {
        this.f55079a.edit().putBoolean(f55056d, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: n */
    public void mo46771n(boolean z) {
        this.f55079a.edit().putBoolean(f55042G, z).commit();
    }

    /* renamed from: o */
    public LocationController.ProviderMode mo46773o() {
        return m53631b(this.f55079a.getString(f55077y, C12385v4.m53561b().COVERAGE_MAPPER_SERVICE_TRIGGER_PROVIDER_MODE().toString()));
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: p */
    public void mo46776p(boolean z) {
        this.f55079a.edit().putBoolean(f55052Q, z).commit();
    }

    /* renamed from: b */
    private LocationController.ProviderMode m53631b(String str) {
        LocationController.ProviderMode providerMode = LocationController.ProviderMode.Gps;
        if (str.equals(providerMode.toString())) {
            return providerMode;
        }
        LocationController.ProviderMode providerMode2 = LocationController.ProviderMode.GpsAndNetwork;
        if (str.equals(providerMode2.toString())) {
            return providerMode2;
        }
        LocationController.ProviderMode providerMode3 = LocationController.ProviderMode.Network;
        if (str.equals(providerMode3.toString())) {
            return providerMode3;
        }
        LocationController.ProviderMode providerMode4 = LocationController.ProviderMode.Passive;
        if (str.equals(providerMode4.toString())) {
            return providerMode4;
        }
        LocationController.ProviderMode providerMode5 = LocationController.ProviderMode.RailNet;
        if (str.equals(providerMode5.toString())) {
            return providerMode5;
        }
        return null;
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: c */
    public void mo46734c(boolean z) {
        this.f55079a.edit().putBoolean(f55071s, z).commit();
    }

    /* renamed from: d */
    public void mo46737d(long j) {
        this.f55079a.edit().putLong(f55067o, j).apply();
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    /* renamed from: e */
    public void mo46742e(String str) {
        this.f55079a.edit().putString(f55041F, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: f */
    public void mo46747f(String str) {
        this.f55079a.edit().putString(f55055c, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: g */
    public void mo46751g(String str) {
        this.f55079a.edit().putString(f55054b, str).commit();
    }

    /* renamed from: h */
    public String mo46753h() {
        return this.f55079a.getString(f55046K, C12385v4.m53561b().CONNECTIVITY_TEST_CRITERIA().name());
    }

    /* renamed from: i */
    public String[] mo46758i() {
        Set<String> stringSet = this.f55079a.getStringSet(f55045J, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return C12385v4.m53561b().CONNECTIVITY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: j */
    public void mo46760j(long j) {
        this.f55079a.edit().putLong(f55051P, j).commit();
    }

    /* renamed from: k */
    public String[] mo46764k() {
        Set<String> stringSet = this.f55079a.getStringSet(f55047L, (Set) null);
        if (stringSet == null || stringSet.isEmpty()) {
            return C12385v4.m53561b().LATENCY_TEST_HOSTNAME_ARRAY();
        }
        return (String[]) stringSet.toArray(new String[stringSet.size()]);
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: l */
    public void mo46765l(long j) {
        this.f55079a.edit().putLong(f55064l, j).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: m */
    public void mo46768m(long j) {
        this.f55079a.edit().putLong(f55057e, j).commit();
    }

    /* renamed from: c */
    public void mo46732c(String str) {
        this.f55079a.edit().putString(f55046K, str).commit();
    }

    /* renamed from: d */
    public void mo46739d(Set<String> set) {
        this.f55079a.edit().putStringSet(f55044I, set).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: e */
    public void mo46741e(long j) {
        this.f55079a.edit().putLong(f55050O, j).commit();
    }

    /* renamed from: f */
    public Set<String> mo46745f() {
        return this.f55079a.getStringSet(f55043H, (Set) null);
    }

    /* renamed from: g */
    public long mo46749g() {
        return this.f55079a.getLong(f55049N, 0);
    }

    /* renamed from: c */
    public void mo46733c(Set<String> set) {
        this.f55079a.edit().putStringSet(f55047L, set).commit();
    }

    /* renamed from: d */
    public void mo46738d(String str) {
        this.f55079a.edit().putString(f55048M, str).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    private void m53632b(boolean z) {
        this.f55079a.edit().putBoolean(f55039D, z).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    public void mo46727b(long j) {
        this.f55079a.edit().putLong(f55049N, j).commit();
    }

    /* renamed from: b */
    public void mo46729b(Set<String> set) {
        this.f55079a.edit().putStringSet(f55045J, set).commit();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    private String m53630a() {
        String replace = UUID.randomUUID().toString().replace("-", "");
        SharedPreferences.Editor edit = this.f55079a.edit();
        edit.putString(f55059g, replace);
        edit.putLong(f55060h, C12112oa.m52716d());
        edit.commit();
        return replace;
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public void mo46725a(AnonymizationLevel anonymizationLevel) {
        this.f55079a.edit().putString(f55075w, anonymizationLevel.toString()).commit();
    }

    /* renamed from: a */
    private AnonymizationLevel m53629a(String str) {
        AnonymizationLevel anonymizationLevel = AnonymizationLevel.Anonymized;
        if (str.equals(anonymizationLevel.toString())) {
            return anonymizationLevel;
        }
        AnonymizationLevel anonymizationLevel2 = AnonymizationLevel.Full;
        if (str.equals(anonymizationLevel2.toString())) {
            return anonymizationLevel2;
        }
        AnonymizationLevel anonymizationLevel3 = AnonymizationLevel.None;
        str.equals(anonymizationLevel3.toString());
        return anonymizationLevel3;
    }

    /* renamed from: a */
    public void mo46726a(Set<String> set) {
        this.f55079a.edit().putStringSet(f55043H, set).commit();
    }
}
