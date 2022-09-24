package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.ironsource.environment.C4979h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11362c0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.adunit.p279c.C11335g;
import com.ironsource.mediationsdk.adunit.p279c.C11336h;
import com.ironsource.mediationsdk.impressionData.C11396a;
import com.ironsource.mediationsdk.logger.C11410b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.C11420f;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.model.C11422h;
import com.ironsource.mediationsdk.model.C11423i;
import com.ironsource.mediationsdk.model.C11425k;
import com.ironsource.mediationsdk.model.C11431p;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p276a.C11292d;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.p286c.C11361b;
import com.ironsource.mediationsdk.sdk.C11446f;
import com.ironsource.mediationsdk.sdk.C11450j;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.server.C11478b;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11484c;
import com.ironsource.mediationsdk.utils.C11491g;
import com.ironsource.mediationsdk.utils.C11493i;
import com.ironsource.mediationsdk.utils.C11495k;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p056c.C4946a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.E */
public final class C11232E implements C11493i {

    /* renamed from: m0 */
    private static boolean f50372m0 = false;

    /* renamed from: A */
    private Set<IronSource.AD_UNIT> f50373A;

    /* renamed from: B */
    private Set<IronSource.AD_UNIT> f50374B;

    /* renamed from: C */
    private boolean f50375C;

    /* renamed from: D */
    IronSourceSegment f50376D;

    /* renamed from: E */
    private final String f50377E;

    /* renamed from: F */
    int f50378F;

    /* renamed from: G */
    boolean f50379G;

    /* renamed from: H */
    boolean f50380H;

    /* renamed from: I */
    private boolean f50381I;

    /* renamed from: J */
    private boolean f50382J;

    /* renamed from: K */
    boolean f50383K;

    /* renamed from: L */
    private boolean f50384L;

    /* renamed from: M */
    private Boolean f50385M;

    /* renamed from: N */
    private IronSourceBannerLayout f50386N;

    /* renamed from: O */
    private String f50387O;

    /* renamed from: P */
    Boolean f50388P;

    /* renamed from: Q */
    C11507y f50389Q;

    /* renamed from: R */
    C11373e0 f50390R;

    /* renamed from: S */
    C11243M f50391S;

    /* renamed from: T */
    C11335g f50392T;

    /* renamed from: U */
    private C11336h f50393U;

    /* renamed from: V */
    private C11446f f50394V;

    /* renamed from: W */
    boolean f50395W;

    /* renamed from: X */
    private boolean f50396X;

    /* renamed from: Y */
    private boolean f50397Y;

    /* renamed from: Z */
    boolean f50398Z;

    /* renamed from: a */
    final String f50399a;

    /* renamed from: a0 */
    boolean f50400a0;

    /* renamed from: b */
    private final String f50401b;

    /* renamed from: b0 */
    boolean f50402b0;

    /* renamed from: c */
    private final String f50403c;

    /* renamed from: c0 */
    boolean f50404c0;

    /* renamed from: d */
    private AbstractAdapter f50405d;

    /* renamed from: d0 */
    int f50406d0;

    /* renamed from: e */
    C11387g0 f50407e;

    /* renamed from: e0 */
    private CopyOnWriteArraySet<String> f50408e0;

    /* renamed from: f */
    C11299a0 f50409f;

    /* renamed from: f0 */
    private CopyOnWriteArraySet<String> f50410f0;

    /* renamed from: g */
    C11371d0 f50411g;

    /* renamed from: g0 */
    private CopyOnWriteArraySet<String> f50412g0;

    /* renamed from: h */
    C11402k f50413h;

    /* renamed from: h0 */
    C11401j0 f50414h0;

    /* renamed from: i */
    IronSourceLoggerManager f50415i;

    /* renamed from: i0 */
    private C11405k0 f50416i0;

    /* renamed from: j */
    public String f50417j;

    /* renamed from: j0 */
    C11436p f50418j0;

    /* renamed from: k */
    public String f50419k;

    /* renamed from: k0 */
    C11396a f50420k0;

    /* renamed from: l */
    C11450j f50421l;

    /* renamed from: l0 */
    private C4946a f50422l0;

    /* renamed from: m */
    public String f50423m;

    /* renamed from: n */
    public Map<String, String> f50424n;

    /* renamed from: o */
    public String f50425o;

    /* renamed from: p */
    public String f50426p;

    /* renamed from: q */
    C11410b f50427q;

    /* renamed from: r */
    private AtomicBoolean f50428r;

    /* renamed from: s */
    private final Object f50429s;

    /* renamed from: t */
    C11495k f50430t;

    /* renamed from: u */
    String f50431u;

    /* renamed from: v */
    private AtomicBoolean f50432v;

    /* renamed from: w */
    private boolean f50433w;

    /* renamed from: x */
    private List<IronSource.AD_UNIT> f50434x;

    /* renamed from: y */
    Context f50435y;

    /* renamed from: z */
    Boolean f50436z;

    /* renamed from: com.ironsource.mediationsdk.E$a */
    public interface C11233a {
        /* renamed from: a */
        void mo43782a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.E$b */
    static /* synthetic */ class C11234b {

        /* renamed from: a */
        static final /* synthetic */ int[] f50437a;

        /* renamed from: b */
        static final /* synthetic */ int[] f50438b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.C11484c.C11485a.m51255a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50438b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.C11484c.C11485a.f51553a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f50438b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.C11484c.C11485a.f51554b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = f50438b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.C11484c.C11485a.f51555c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = f50438b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.C11484c.C11485a.f51556d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f50437a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f50437a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = f50437a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f50437a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.C11234b.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.E$c */
    static class C11235c {

        /* renamed from: a */
        static volatile C11232E f50439a = new C11232E((byte) 0);
    }

    private C11232E() {
        this.f50399a = C11232E.class.getName();
        this.f50401b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.1.12.2";
        this.f50403c = "Activity=";
        this.f50429s = new Object();
        this.f50430t = null;
        this.f50417j = null;
        this.f50419k = null;
        this.f50431u = null;
        this.f50423m = null;
        this.f50424n = null;
        this.f50425o = null;
        this.f50433w = false;
        this.f50426p = null;
        this.f50436z = null;
        this.f50375C = true;
        this.f50377E = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f50388P = null;
        this.f50415i = IronSourceLoggerManager.getLogger(0);
        C11410b bVar = new C11410b((LogListener) null, 1);
        this.f50427q = bVar;
        this.f50415i.addLogger(bVar);
        this.f50421l = new C11450j();
        C11387g0 g0Var = new C11387g0();
        this.f50407e = g0Var;
        g0Var.f51162t = this.f50421l;
        C11299a0 a0Var = new C11299a0();
        this.f50409f = a0Var;
        C11450j jVar = this.f50421l;
        a0Var.f50739t = jVar;
        a0Var.f50744y.f51443c = jVar;
        C11371d0 d0Var = new C11371d0();
        this.f50411g = d0Var;
        d0Var.f51064c = this.f50421l;
        this.f50428r = new AtomicBoolean();
        this.f50373A = new HashSet();
        this.f50374B = new HashSet();
        this.f50380H = false;
        this.f50379G = false;
        this.f50381I = false;
        this.f50432v = new AtomicBoolean(true);
        this.f50378F = 0;
        this.f50382J = false;
        this.f50383K = false;
        this.f50384L = false;
        this.f50426p = UUID.randomUUID().toString();
        this.f50385M = Boolean.FALSE;
        this.f50402b0 = false;
        this.f50387O = null;
        this.f50389Q = null;
        this.f50390R = null;
        this.f50394V = null;
        this.f50391S = null;
        this.f50395W = false;
        this.f50396X = false;
        this.f50398Z = false;
        this.f50404c0 = false;
        this.f50408e0 = new CopyOnWriteArraySet<>();
        this.f50410f0 = new CopyOnWriteArraySet<>();
        this.f50412g0 = new CopyOnWriteArraySet<>();
        this.f50414h0 = null;
        this.f50416i0 = null;
        this.f50418j0 = null;
        this.f50413h = null;
        this.f50406d0 = 1;
        this.f50420k0 = new C11396a();
        this.f50422l0 = new C4946a();
    }

    /* synthetic */ C11232E(byte b) {
        this();
    }

    /* renamed from: A */
    private C11495k m50085A(Context context, String str, C11233a aVar) {
        Vector vector;
        C11495k kVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a = m50104a(context);
            if (TextUtils.isEmpty(a)) {
                a = C4979h.m22833y(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a;
            IronSourceSegment ironSourceSegment = this.f50376D;
            if (ironSourceSegment != null) {
                Vector vector2 = new Vector();
                if (ironSourceSegment.f50478f != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ironSourceSegment.f50478f);
                    vector2.add(new Pair(IronSourceSegment.AGE, sb.toString()));
                }
                if (!TextUtils.isEmpty(ironSourceSegment.f50479g)) {
                    vector2.add(new Pair(IronSourceSegment.GENDER, ironSourceSegment.f50479g));
                }
                if (ironSourceSegment.f50480h != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ironSourceSegment.f50480h);
                    vector2.add(new Pair(IronSourceSegment.LEVEL, sb2.toString()));
                }
                if (ironSourceSegment.f50481i != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ironSourceSegment.f50481i);
                    vector2.add(new Pair(IronSourceSegment.PAYING, sb3.toString()));
                }
                if (ironSourceSegment.f50482j != -1.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(ironSourceSegment.f50482j);
                    vector2.add(new Pair(IronSourceSegment.IAPT, sb4.toString()));
                }
                if (ironSourceSegment.f50483k != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(ironSourceSegment.f50483k);
                    vector2.add(new Pair(IronSourceSegment.USER_CREATION_DATE, sb5.toString()));
                }
                if (!TextUtils.isEmpty(ironSourceSegment.f50473a)) {
                    vector2.add(new Pair("segName", ironSourceSegment.f50473a));
                }
                vector2.addAll(ironSourceSegment.f50484l);
                vector = vector2;
            } else {
                vector = null;
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f50417j, str, str2, this.f50425o, false, vector), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(C11491g.m51272a().mo44552b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    ironLog.warning("encoded response invalid - return null");
                    if (!f50372m0) {
                        f50372m0 = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_STATUS, "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C11296h.m50466e().mo43979b(new C11308a(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            C11495k kVar2 = new C11495k(context, this.f50417j, str, stringFromURL);
            try {
                if (kVar2.mo44559a()) {
                    return kVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                kVar = kVar2;
                IronLog.INTERNAL.warning("exception = " + e);
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e3) {
            e = e3;
            IronLog.INTERNAL.warning("exception = " + e);
            e.printStackTrace();
            return kVar;
        }
    }

    /* renamed from: B */
    private static void m50086B(int i, JSONObject jSONObject) {
        C11292d.m50446e().mo43979b(new C11308a(i, jSONObject));
    }

    /* renamed from: C */
    private void m50087C(IronSource.AD_UNIT ad_unit) {
        int i = C11234b.f50437a[ad_unit.ordinal()];
        if (i == 1) {
            m50092P();
        } else if (i == 2) {
            m50115f0();
        } else if (i == 3) {
            this.f50411g.mo44235a(this.f50417j, this.f50419k);
        } else if (i == 4) {
            m50116g0();
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.ironsource.mediationsdk.y] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.f0] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50088J() {
        /*
            r10 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r10.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.List r5 = r10.m50097U()
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x006a
            com.ironsource.mediationsdk.utils.k r0 = r10.f50430t
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c
            com.ironsource.mediationsdk.model.p r6 = r0.f51377a
            com.ironsource.mediationsdk.utils.b r0 = r6.f51435l
            boolean r0 = r0.f51545n
            if (r0 == 0) goto L_0x0035
            com.ironsource.mediationsdk.b0 r0 = new com.ironsource.mediationsdk.b0
            java.lang.String r7 = r10.f50417j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.c.b r1 = com.ironsource.mediationsdk.p286c.C11361b.m50766a()
            java.util.HashSet r9 = r1.mo44209b()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0049
        L_0x0035:
            com.ironsource.mediationsdk.f0 r0 = new com.ironsource.mediationsdk.f0
            java.lang.String r7 = r10.f50417j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.c.b r1 = com.ironsource.mediationsdk.p286c.C11361b.m50766a()
            java.util.HashSet r9 = r1.mo44209b()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0049:
            r10.f50389Q = r0
            java.lang.Boolean r0 = r10.f50436z
            if (r0 == 0) goto L_0x0092
            com.ironsource.mediationsdk.y r1 = r10.f50389Q
            android.content.Context r2 = r10.f50435y
            boolean r0 = r0.booleanValue()
            r1.mo44197a(r2, r0)
            java.lang.Boolean r0 = r10.f50436z
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0092
            com.ironsource.mediationsdk.g0 r0 = r10.f50407e
            android.content.Context r1 = r10.f50435y
            r0.mo44283m(r1, r3)
            return
        L_0x006a:
            int r0 = r10.f50406d0
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            m50127u(r0, r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            m50121m(r1, r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r10.m50123p(r0, r3)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50088J():void");
    }

    /* renamed from: M */
    private void m50089M() {
        this.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f50430t.f51660a.f51415a.size(); i++) {
            String str = this.f50430t.f51660a.f51415a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f50430t.f51663b.mo44442a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f50410f0) {
                this.f50416i0 = new C11405k0(arrayList, this.f50430t.f51666c.f51377a, this.f50417j, this.f50419k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                m50123p(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.f50410f0.iterator();
            while (it.hasNext()) {
                this.f50416i0.mo44348a(it.next(), (String) null, false);
            }
            this.f50410f0.clear();
            return;
        }
        m50123p(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: N */
    private Placement m50090N(String str) {
        C11431p pVar = this.f50430t.f51666c.f51377a;
        if (pVar != null) {
            Iterator<Placement> it = pVar.f51424a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: O */
    private void m50091O() {
        NetworkSettings a;
        NetworkSettings a2;
        NetworkSettings a3;
        C11431p pVar = this.f50430t.f51666c.f51377a;
        int i = pVar.f51428e;
        for (int i2 = 0; i2 < this.f50430t.f51660a.f51415a.size(); i2++) {
            String str = this.f50430t.f51660a.f51415a.get(i2);
            if (!TextUtils.isEmpty(str) && (a3 = this.f50430t.f51663b.mo44442a(str)) != null) {
                C11281Z z = new C11281Z(a3, i);
                if (m50129w(z)) {
                    C11387g0 g0Var = this.f50407e;
                    z.f50646y = g0Var;
                    z.f50942n = i2 + 1;
                    g0Var.mo44291a(z);
                }
            }
        }
        if (this.f50407e.f51202i.size() > 0) {
            boolean z2 = pVar.f51425b.f51353a;
            C11387g0 g0Var2 = this.f50407e;
            g0Var2.f51164v = z2;
            g0Var2.f51201h = pVar.f51426c;
            g0Var2.f51168z = pVar.f51431h;
            String b = this.f50430t.mo44560b();
            if (!TextUtils.isEmpty(b) && (a2 = this.f50430t.f51663b.mo44442a(b)) != null) {
                C11281Z z3 = new C11281Z(a2, i);
                if (m50129w(z3)) {
                    C11387g0 g0Var3 = this.f50407e;
                    z3.f50646y = g0Var3;
                    IronSourceLoggerManager ironSourceLoggerManager = g0Var3.f51207n;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    ironSourceLoggerManager.log(ironSourceTag, z3.f50933e + " is set as backfill", 0);
                    g0Var3.f51203j = z3;
                }
            }
            String c = this.f50430t.mo44561c();
            if (!TextUtils.isEmpty(c) && (a = this.f50430t.f51663b.mo44442a(c)) != null) {
                C11281Z z4 = new C11281Z(a, i);
                if (m50129w(z4)) {
                    C11387g0 g0Var4 = this.f50407e;
                    z4.f50646y = g0Var4;
                    IronSourceLoggerManager ironSourceLoggerManager2 = g0Var4.f51207n;
                    IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
                    ironSourceLoggerManager2.log(ironSourceTag2, z4.f50933e + " is set as premium", 0);
                    g0Var4.f51204k = z4;
                }
            }
            C11387g0 g0Var5 = this.f50407e;
            g0Var5.f51160E = new C11504w(pVar.f51432i, g0Var5);
            this.f50407e.mo44272a(this.f50417j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.f50406d0);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50121m(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: P */
    private void m50092P() {
        if (this.f50379G) {
            m50089M();
            return;
        }
        C11431p pVar = this.f50430t.f51666c.f51377a;
        C11483b bVar = pVar.f51435l;
        this.f50395W = bVar.f51532a;
        this.f50397Y = bVar.f51533b;
        int i = m50118i(pVar);
        this.f50406d0 = i;
        m50121m(IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f50395W, i));
        if (this.f50397Y) {
            m50095S();
        } else if (this.f50395W) {
            m50088J();
        } else {
            m50091O();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50093Q(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.Placement r5 = r4.m50090N(r5)     // Catch:{ Exception -> 0x0026 }
            if (r5 != 0) goto L_0x000d
            com.ironsource.mediationsdk.model.Placement r5 = r4.mo43781z()     // Catch:{ Exception -> 0x000b }
            goto L_0x000d
        L_0x000b:
            r0 = move-exception
            goto L_0x0028
        L_0x000d:
            if (r5 != 0) goto L_0x0031
            java.lang.String r0 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f50415i     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000b }
            r3 = 3
            r1.log(r2, r0, r3)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000b }
            r2 = 1021(0x3fd, float:1.431E-42)
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.sdk.j r0 = r4.f50421l     // Catch:{ Exception -> 0x000b }
            r0.onRewardedVideoAdShowFailed(r1)     // Catch:{ Exception -> 0x000b }
            return
        L_0x0026:
            r0 = move-exception
            r5 = 0
        L_0x0028:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticRewardedVideo()"
            r1.logException(r2, r3, r0)
        L_0x0031:
            boolean r0 = r4.f50397Y
            if (r0 == 0) goto L_0x003b
            com.ironsource.mediationsdk.adunit.c.h r0 = r4.f50393U
            r0.mo44136a((com.ironsource.mediationsdk.model.Placement) r5)
            return
        L_0x003b:
            com.ironsource.mediationsdk.y r0 = r4.f50389Q
            r0.mo44198a((com.ironsource.mediationsdk.model.Placement) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50093Q(java.lang.String):void");
    }

    /* renamed from: R */
    private Placement m50094R(String str) {
        Placement N = m50090N(str);
        if (N == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            N = mo43781z();
            if (N == null) {
                this.f50415i.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String l = m50120l(N.getPlacementName(), C11484c.m51238b(ContextProvider.getInstance().getApplicationContext(), N));
        if (TextUtils.isEmpty(l)) {
            return N;
        }
        this.f50415i.log(IronSourceLogger.IronSourceTag.API, l, 1);
        this.f50421l.onRewardedVideoAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(l));
        return null;
    }

    /* renamed from: S */
    private void m50095S() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> U = m50097U();
        if (U.size() > 0) {
            C11336h hVar = new C11336h(U, this.f50430t.f51666c.f51377a, IronSourceUtils.getUserIdForNetworks(), false, C11361b.m50766a().mo44209b());
            this.f50393U = hVar;
            Boolean bool = this.f50436z;
            if (bool != null) {
                hVar.mo44141b(bool.booleanValue());
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f50406d0);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50121m(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: T */
    private InterstitialPlacement m50096T(String str) {
        C11423i iVar = this.f50430t.f51666c.f51378b;
        if (iVar != null) {
            Iterator<InterstitialPlacement> it = iVar.f51382a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: U */
    private List<NetworkSettings> m50097U() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f50430t.f51660a.f51415a.size(); i++) {
            String str = this.f50430t.f51660a.f51415a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f50430t.f51663b.mo44442a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    private List<NetworkSettings> m50098V() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f50430t.f51660a.f51418d.size(); i++) {
            String str = this.f50430t.f51660a.f51418d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f50430t.f51663b.mo44442a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50099W(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.m50096T(r5)     // Catch:{ Exception -> 0x0026 }
            if (r5 != 0) goto L_0x000d
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.mo43742E()     // Catch:{ Exception -> 0x000b }
            goto L_0x000d
        L_0x000b:
            r0 = move-exception
            goto L_0x0028
        L_0x000d:
            if (r5 != 0) goto L_0x0031
            java.lang.String r0 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f50415i     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000b }
            r3 = 3
            r1.log(r2, r0, r3)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000b }
            r2 = 1020(0x3fc, float:1.43E-42)
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.sdk.j r0 = r4.f50421l     // Catch:{ Exception -> 0x000b }
            r0.onInterstitialAdShowFailed(r1)     // Catch:{ Exception -> 0x000b }
            return
        L_0x0026:
            r0 = move-exception
            r5 = 0
        L_0x0028:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L_0x0031:
            boolean r0 = r4.f50400a0
            if (r0 == 0) goto L_0x0040
            com.ironsource.mediationsdk.adunit.c.g r0 = r4.f50392T
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r5)
            r0.mo44136a((com.ironsource.mediationsdk.model.Placement) r1)
            return
        L_0x0040:
            com.ironsource.mediationsdk.e0 r0 = r4.f50390R
            java.lang.String r5 = r5.getPlacementName()
            r0.mo44247a((java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50099W(java.lang.String):void");
    }

    /* renamed from: X */
    private InterstitialPlacement m50100X(String str) {
        InterstitialPlacement T = m50096T(str);
        if (T == null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            T = mo43742E();
            if (T == null) {
                this.f50415i.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String l = m50120l(T.getPlacementName(), m50109b0(T.getPlacementName()));
        if (TextUtils.isEmpty(l)) {
            return T;
        }
        this.f50415i.log(IronSourceLogger.IronSourceTag.API, l, 1);
        C11450j jVar = this.f50421l;
        jVar.f51470e = T;
        jVar.onInterstitialAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(l));
        return null;
    }

    /* renamed from: Y */
    private void m50101Y() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> V = m50098V();
        if (V.size() > 0) {
            C11335g gVar = new C11335g(V, this.f50430t.f51666c.f51378b, IronSourceUtils.getUserIdForNetworks(), C11361b.m50766a().mo44209b());
            this.f50392T = gVar;
            Boolean bool = this.f50436z;
            if (bool != null) {
                gVar.mo44141b(bool.booleanValue());
            }
            if (this.f50402b0) {
                this.f50402b0 = false;
                this.f50392T.mo44144e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50086B(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: Z */
    private void m50102Z() {
        this.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> V = m50098V();
        if (V.size() > 0) {
            C11373e0 e0Var = new C11373e0(V, this.f50430t.f51666c.f51378b, this.f50417j, IronSourceUtils.getUserIdForNetworks(), this.f50430t.f51666c.f51378b.f51387f, C11361b.m50766a().mo44209b());
            this.f50390R = e0Var;
            Boolean bool = this.f50436z;
            if (bool != null) {
                e0Var.mo44248a(bool.booleanValue());
                if (this.f50436z.booleanValue()) {
                    this.f50409f.mo44027o(this.f50435y, false);
                }
            }
            if (this.f50402b0) {
                this.f50402b0 = false;
                this.f50390R.mo44249d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50086B(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: a */
    public static C11232E m50103a() {
        return C11235c.f50439a;
    }

    /* renamed from: a */
    public static String m50104a(Context context) {
        try {
            String[] a = C4979h.m22787a(context);
            if (a[0] != null) {
                return a[0];
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static void m50105a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C11508z.m51348a().f51772a = iSDemandOnlyInterstitialListener;
    }

    /* renamed from: a */
    public static void m50106a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C11369d.m50788a().mo44233b(z);
    }

    /* renamed from: a0 */
    private static boolean m50107a0(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: b */
    private void m50108b() {
        this.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f50430t.f51660a.f51419e.size(); i++) {
            String str = this.f50430t.f51660a.f51419e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f50430t.f51663b.mo44442a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f50412g0) {
                this.f50418j0 = new C11436p(arrayList, this.f50430t.f51666c.f51380d, this.f50417j, this.f50419k);
            }
            this.f50412g0.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50086B(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.BANNER, false);
    }

    /* renamed from: b0 */
    private int m50109b0(String str) {
        C11422h hVar;
        C11495k kVar = this.f50430t;
        if (kVar == null || (hVar = kVar.f51666c) == null || hVar.f51378b == null) {
            return C11484c.C11485a.f51556d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m50096T(str);
            if (interstitialPlacement == null && (interstitialPlacement = mo43742E()) == null) {
                this.f50415i.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? C11484c.C11485a.f51556d : C11484c.m51237b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    /* renamed from: c0 */
    private void m50110c0() {
        NetworkSettings a;
        C11423i iVar = this.f50430t.f51666c.f51378b;
        int i = iVar.f51386e;
        this.f50409f.f50744y.mo44451a(IronSource.AD_UNIT.INTERSTITIAL, iVar.f51387f);
        for (int i2 = 0; i2 < this.f50430t.f51660a.f51418d.size(); i2++) {
            String str = this.f50430t.f51660a.f51418d.get(i2);
            if (!TextUtils.isEmpty(str) && (a = this.f50430t.f51663b.mo44442a(str)) != null) {
                C11228C c = new C11228C(a, i);
                if (m50129w(c)) {
                    C11299a0 a0Var = this.f50409f;
                    c.f50366y = a0Var;
                    c.f50942n = i2 + 1;
                    a0Var.mo44291a(c);
                }
            }
        }
        if (this.f50409f.f51202i.size() > 0) {
            int i3 = iVar.f51384c;
            C11299a0 a0Var2 = this.f50409f;
            a0Var2.f51201h = i3;
            a0Var2.mo44016a(this.f50417j, IronSourceUtils.getUserIdForNetworks());
            if (this.f50402b0) {
                this.f50402b0 = false;
                this.f50409f.mo44019c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50086B(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: d */
    private void m50111d() {
        if (this.f50385M.booleanValue()) {
            this.f50385M = Boolean.FALSE;
            mo43753a(this.f50386N, this.f50387O);
            this.f50386N = null;
            this.f50387O = null;
        }
    }

    /* renamed from: d0 */
    private C11421g m50112d0(String str) {
        C11420f fVar = this.f50430t.f51666c.f51380d;
        if (fVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return fVar.mo44430a();
        }
        C11421g a = fVar.mo44431a(str);
        return a != null ? a : fVar.mo44430a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f51666c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m50113e() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f50430t
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.f r0 = r0.f51380d
            if (r0 == 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50113e():boolean");
    }

    /* renamed from: e0 */
    private void m50114e0() {
        this.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f50430t.f51660a.f51418d.size(); i++) {
            String str = this.f50430t.f51660a.f51418d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f50430t.f51663b.mo44442a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f50408e0) {
                this.f50414h0 = new C11401j0(arrayList, this.f50430t.f51666c.f51378b, this.f50417j, this.f50419k);
            }
            Iterator<String> it = this.f50408e0.iterator();
            while (it.hasNext()) {
                this.f50414h0.mo44327a(it.next(), (String) null, false);
            }
            this.f50408e0.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m50127u(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m50086B(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m50123p(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: f0 */
    private void m50115f0() {
        if (this.f50380H) {
            m50114e0();
            return;
        }
        C11483b bVar = this.f50430t.f51666c.f51378b.f51390i;
        boolean z = bVar.f51532a;
        this.f50398Z = z;
        this.f50400a0 = bVar.f51533b;
        m50086B(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, z, 1));
        if (!this.f50398Z) {
            m50110c0();
        } else if (this.f50400a0) {
            m50101Y();
        } else {
            m50102Z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d6, code lost:
        return;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50116g0() {
        /*
            r13 = this;
            boolean r0 = r13.f50381I
            if (r0 == 0) goto L_0x0008
            r13.m50108b()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.f50385M
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.k r1 = r13.f50430t     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.h r1 = r1.f51666c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.f r1 = r1.f51380d     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.utils.b r1 = r1.f51375g     // Catch:{ all -> 0x00d7 }
            boolean r1 = r1.f51532a     // Catch:{ all -> 0x00d7 }
            r13.f50404c0 = r1     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00d7 }
            boolean r3 = r13.f50404c0     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r1.verbose(r2)     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r3 = r13.f50385M     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r1.verbose(r2)     // Catch:{ all -> 0x00d7 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.f50404c0     // Catch:{ all -> 0x00d7 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00d7 }
            m50086B(r1, r2)     // Catch:{ all -> 0x00d7 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00d7 }
            r6.<init>()     // Catch:{ all -> 0x00d7 }
            r1 = 0
        L_0x0053:
            com.ironsource.mediationsdk.utils.k r2 = r13.f50430t     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.n r2 = r2.f51660a     // Catch:{ all -> 0x00d7 }
            java.util.ArrayList<java.lang.String> r2 = r2.f51419e     // Catch:{ all -> 0x00d7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d7 }
            if (r1 >= r2) goto L_0x0081
            com.ironsource.mediationsdk.utils.k r2 = r13.f50430t     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.n r2 = r2.f51660a     // Catch:{ all -> 0x00d7 }
            java.util.ArrayList<java.lang.String> r2 = r2.f51419e     // Catch:{ all -> 0x00d7 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d7 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00d7 }
            if (r5 != 0) goto L_0x007e
            com.ironsource.mediationsdk.utils.k r5 = r13.f50430t     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.o r5 = r5.f51663b     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.mo44442a((java.lang.String) r2)     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x007e
            r6.add(r2)     // Catch:{ all -> 0x00d7 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x0081:
            int r1 = r6.size()     // Catch:{ all -> 0x00d7 }
            if (r1 <= 0) goto L_0x00ae
            boolean r1 = r13.f50404c0     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x0090
            r13.m50126t(r6)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            return
        L_0x0090:
            com.ironsource.mediationsdk.utils.k r1 = r13.f50430t     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.h r1 = r1.f51666c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.f r1 = r1.f51380d     // Catch:{ all -> 0x00d7 }
            long r9 = r1.f51370b     // Catch:{ all -> 0x00d7 }
            int r11 = r1.f51373e     // Catch:{ all -> 0x00d7 }
            int r12 = r1.f51374f     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.k r1 = new com.ironsource.mediationsdk.k     // Catch:{ all -> 0x00d7 }
            java.lang.String r7 = r13.f50417j     // Catch:{ all -> 0x00d7 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00d7 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00d7 }
            r13.f50413h = r1     // Catch:{ all -> 0x00d7 }
            r13.m50111d()     // Catch:{ all -> 0x00d7 }
            goto L_0x00d5
        L_0x00ae:
            boolean r1 = r13.f50404c0     // Catch:{ all -> 0x00d7 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00d7 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00d7 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00d7 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00d7 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00d7 }
            r5[r3] = r6     // Catch:{ all -> 0x00d7 }
            r2[r4] = r5     // Catch:{ all -> 0x00d7 }
            m50127u(r1, r2)     // Catch:{ all -> 0x00d7 }
            r2 = 83314(0x14572, float:1.16748E-40)
            m50086B(r2, r1)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00d7 }
            r13.m50123p(r1, r4)     // Catch:{ all -> 0x00d7 }
        L_0x00d5:
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            return
        L_0x00d7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            goto L_0x00db
        L_0x00da:
            throw r1
        L_0x00db:
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50116g0():void");
    }

    /* renamed from: h */
    private static boolean m50117h() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    /* renamed from: i */
    private int m50118i(C11431p pVar) {
        return !this.f50397Y && pVar.f51435l.f51545n ? 2 : 1;
    }

    /* renamed from: j */
    private C11495k m50119j(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "appKey");
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.f50417j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                return new C11495k(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
            }
        }
        return null;
    }

    /* renamed from: l */
    private static String m50120l(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = C11234b.f50438b[i - 1];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    /* renamed from: m */
    static void m50121m(int i, JSONObject jSONObject) {
        C11296h.m50466e().mo43979b(new C11308a(i, jSONObject));
    }

    /* renamed from: o */
    private void m50122o(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f50415i.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: p */
    private void m50123p(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = C11234b.f50437a[ad_unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        synchronized (this.f50385M) {
                            if (this.f50385M.booleanValue()) {
                                this.f50385M = Boolean.FALSE;
                                C11399j.m50992a().mo44318a(this.f50386N, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "Init had failed"));
                                this.f50386N = null;
                                this.f50387O = null;
                            }
                        }
                    }
                } else if (z || mo43744G() || this.f50374B.contains(ad_unit)) {
                    this.f50421l.onOfferwallAvailable(false);
                }
            } else if (this.f50380H) {
                Iterator<String> it = this.f50408e0.iterator();
                while (it.hasNext()) {
                    C11508z.m51348a().mo44589a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.f50408e0.clear();
            } else if (this.f50402b0) {
                this.f50402b0 = false;
                C11434o.m51097a().mo44452a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.f50379G) {
            Iterator<String> it2 = this.f50410f0.iterator();
            while (it2.hasNext()) {
                C11262W.m50363a().mo43932a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f50410f0.clear();
        } else if (z || mo43741D() || this.f50374B.contains(ad_unit)) {
            this.f50421l.onRewardedVideoAvailabilityChanged(false);
        }
    }

    /* renamed from: q */
    static void m50124q(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C11262W.m50363a().f50606a = iSDemandOnlyRewardedVideoListener;
    }

    /* renamed from: r */
    static void m50125r(String str, C11484c cVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    cVar.mo44541a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                cVar.mo44541a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    /* renamed from: t */
    private void m50126t(ArrayList<NetworkSettings> arrayList) {
        this.f50415i.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.f50391S = new C11243M(arrayList, new C11478b(this.f50417j, IronSourceUtils.getUserIdForNetworks(), this.f50430t.f51666c.f51380d), C11361b.m50766a().mo44209b());
        m50111d();
    }

    /* renamed from: u */
    static void m50127u(JSONObject jSONObject, Object[][] objArr) {
        int i = 0;
        while (i <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i++;
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m50128v(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r1 = 0
            r2 = 0
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01d8 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x0014
            r9.f50383K = r3     // Catch:{ all -> 0x01d8 }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01d8 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x001f
            r9.f50384L = r3     // Catch:{ all -> 0x01d8 }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01d8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x0029
            r9.f50382J = r3     // Catch:{ all -> 0x01d8 }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.c0$c r0 = r0.mo44215b()     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ all -> 0x01d8 }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.j r10 = r9.f50421l     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.f50373A     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.m50123p(r0, r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01d8 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.f50433w     // Catch:{ all -> 0x01d8 }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01d8 }
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r4 = 0
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.f50373A     // Catch:{ all -> 0x01d8 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01d8 }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f50373A     // Catch:{ all -> 0x01d8 }
            r4.add(r5)     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f50374B     // Catch:{ all -> 0x01d8 }
            r4.add(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x0085:
            r4 = 1
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f50415i     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01d8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r8.<init>()     // Catch:{ all -> 0x01d8 }
            r8.append(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01d8 }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01d8 }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = m50117h()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.C4952a.C49531.m22731d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.C4952a.C49531.m22728c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.mo43745H()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f50378F     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.f50378F = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x0108:
            com.ironsource.mediationsdk.adunit.a.a r11 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x01d8 }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x01d8 }
            r10.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r11)     // Catch:{ all -> 0x01d8 }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.c0 r0 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x01d8 }
            r0.mo44217b((boolean) r10)     // Catch:{ all -> 0x01d8 }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f50434x     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01d8 }
            int r0 = r11.length     // Catch:{ all -> 0x01d8 }
            r4 = 0
            r5 = 0
        L_0x012a:
            if (r4 >= r0) goto L_0x0165
            r6 = r11[r4]     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.f50373A     // Catch:{ all -> 0x01d8 }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01d8 }
            if (r7 != 0) goto L_0x015f
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f50373A     // Catch:{ all -> 0x01d8 }
            r5.add(r6)     // Catch:{ all -> 0x01d8 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f50374B     // Catch:{ all -> 0x01d8 }
            r5.add(r6)     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f50434x     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x015a
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x015a
            r9.m50087C(r6)     // Catch:{ all -> 0x01d8 }
            goto L_0x015d
        L_0x015a:
            r9.m50123p(r6, r1)     // Catch:{ all -> 0x01d8 }
        L_0x015d:
            r5 = 1
            goto L_0x0162
        L_0x015f:
            r9.m50122o(r6)     // Catch:{ all -> 0x01d8 }
        L_0x0162:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0165:
            if (r5 == 0) goto L_0x01d6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            r11.<init>()     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c6 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c6 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c6 }
            boolean r4 = m50117h()     // Catch:{ Exception -> 0x01c6 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c6 }
            boolean r4 = com.ironsource.environment.C4952a.C49531.m22731d()     // Catch:{ Exception -> 0x01c6 }
            if (r4 == 0) goto L_0x01a3
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = com.ironsource.environment.C4952a.C49531.m22728c()     // Catch:{ Exception -> 0x01c6 }
        L_0x019f:
            r11.append(r4)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01a6
        L_0x01a3:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x019f
        L_0x01a6:
            r11.append(r0)     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r9.mo43745H()     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x01b2
            r11.append(r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x01b2:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c6 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f50378F     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0 + r3
            r9.f50378F = r0     // Catch:{ Exception -> 0x01c6 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01ca
        L_0x01c6:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x01ca:
            com.ironsource.mediationsdk.adunit.a.a r11 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x01d8 }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01d8 }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x01d8 }
            r10.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r11)     // Catch:{ all -> 0x01d8 }
        L_0x01d6:
            monitor-exit(r9)
            return
        L_0x01d8:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x01dc
        L_0x01db:
            throw r10
        L_0x01dc:
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.m50128v(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* renamed from: w */
    private static boolean m50129w(C11347b bVar) {
        return bVar.f50943o > 0 && bVar.f50944p > 0;
    }

    /* renamed from: x */
    private static boolean m50130x(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f51666c;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43741D() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f50430t
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.p r0 = r0.f51377a
            if (r0 == 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43741D():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public InterstitialPlacement mo43742E() {
        C11423i iVar = this.f50430t.f51666c.f51378b;
        if (iVar != null) {
            return iVar.mo44433a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f51666c;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43743F() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f50430t
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.i r0 = r0.f51378b
            if (r0 == 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43743F():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f51666c;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43744G() {
        /*
            r1 = this;
            com.ironsource.mediationsdk.utils.k r0 = r1.f50430t
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c
            if (r0 == 0) goto L_0x000e
            com.ironsource.mediationsdk.model.j r0 = r0.f51379c
            if (r0 == 0) goto L_0x000e
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43744G():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo43745H() {
        return this.f50379G || this.f50380H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo43746I(String str) {
        boolean z = false;
        if (this.f50380H) {
            return false;
        }
        if (m50109b0(str) != C11484c.C11485a.f51556d) {
            z = true;
        }
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f50380H, this.f50398Z, 1);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
                if (this.f50398Z) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            C11292d.m50446e().mo43979b(new C11308a(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo43747K(String str) {
        if (!m50113e()) {
            return false;
        }
        C11421g gVar = null;
        try {
            gVar = this.f50430t.f51666c.f51380d.mo44431a(str);
            if (gVar == null && (gVar = this.f50430t.f51666c.f51380d.mo44430a()) == null) {
                this.f50415i.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (gVar == null) {
            return false;
        }
        return C11484c.m51241b(ContextProvider.getInstance().getApplicationContext(), gVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo43748L(String str) {
        C11422h hVar;
        C11495k kVar = this.f50430t;
        if (kVar == null || (hVar = kVar.f51666c) == null || hVar.f51377a == null) {
            return C11484c.C11485a.f51556d;
        }
        Placement placement = null;
        try {
            placement = m50090N(str);
            if (placement == null && (placement = mo43781z()) == null) {
                this.f50415i.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? C11484c.C11485a.f51556d : C11484c.m51238b(ContextProvider.getInstance().getApplicationContext(), placement);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo43749a(android.app.Activity r9, com.ironsource.mediationsdk.IronSourceBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 3
            if (r12 != 0) goto L_0x0012
            java.lang.String r9 = "adm cannot be null"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r8.f50415i     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            r10.log(r11, r9, r0)     // Catch:{ all -> 0x000f }
            monitor-exit(r8)
            return
        L_0x000f:
            r9 = move-exception
            goto L_0x022d
        L_0x0012:
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r8.f50384L     // Catch:{ all -> 0x0215 }
            if (r2 != 0) goto L_0x002b
            java.lang.String r9 = "initISDemandOnly() must be called before loadISDemandOnlyBannerWithAdm()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0215 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r11)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x002b:
            boolean r2 = r8.f50381I     // Catch:{ all -> 0x0215 }
            if (r2 != 0) goto L_0x0042
            java.lang.String r9 = "Banner was initialized in mediation mode. Use loadBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0215 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r11)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x0042:
            r2 = 1
            if (r9 == 0) goto L_0x004d
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0215 }
            r3.updateActivity(r9)     // Catch:{ all -> 0x0215 }
            goto L_0x0076
        L_0x004d:
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0215 }
            android.app.Activity r9 = r9.getCurrentActiveActivity()     // Catch:{ all -> 0x0215 }
            if (r9 != 0) goto L_0x0076
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r2, r2)     // Catch:{ all -> 0x0215 }
            r11 = 83321(0x14579, float:1.16758E-40)
            m50086B(r11, r9)     // Catch:{ all -> 0x0215 }
            java.lang.String r9 = "Banner was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0215 }
            r12 = 1062(0x426, float:1.488E-42)
            r11.<init>(r12, r9)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r11)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x0076:
            com.ironsource.mediationsdk.c0 r9 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.c0$c r9 = r9.mo44215b()     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.c0$c r3 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ all -> 0x0215 }
            if (r9 != r3) goto L_0x0098
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r9)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x0098:
            com.ironsource.mediationsdk.c0$c r3 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_IN_PROGRESS     // Catch:{ all -> 0x0215 }
            r4 = 83004(0x1443c, float:1.16313E-40)
            if (r9 != r3) goto L_0x00d4
            com.ironsource.mediationsdk.c0 r9 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0215 }
            boolean r9 = r9.mo44218c()     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x00bf
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r9)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x00bf:
            java.lang.Boolean r9 = r8.f50385M     // Catch:{ all -> 0x0215 }
            monitor-enter(r9)     // Catch:{ all -> 0x0215 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r12 = r8.f50412g0     // Catch:{ all -> 0x00d1 }
            r12.add(r11)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r2, r2)     // Catch:{ all -> 0x0215 }
            m50086B(r4, r9)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x00d1:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x0215 }
        L_0x00d4:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r9 = r8.f50412g0     // Catch:{ all -> 0x0215 }
            monitor-enter(r9)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.p r3 = r8.f50418j0     // Catch:{ all -> 0x0212 }
            if (r3 != 0) goto L_0x00ea
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r12 = r8.f50412g0     // Catch:{ all -> 0x0212 }
            r12.add(r11)     // Catch:{ all -> 0x0212 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r2, r2)     // Catch:{ all -> 0x0212 }
            m50086B(r4, r11)     // Catch:{ all -> 0x0212 }
            monitor-exit(r9)     // Catch:{ all -> 0x0212 }
            monitor-exit(r8)
            return
        L_0x00ea:
            monitor-exit(r9)     // Catch:{ all -> 0x0212 }
            boolean r9 = r8.m50113e()     // Catch:{ all -> 0x0215 }
            if (r9 != 0) goto L_0x0107
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f50415i     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0215 }
            java.lang.String r12 = "No Banner configurations found"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r9 = "the server response does not contain Banner data"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0215 }
            r10.mo20630d(r9)     // Catch:{ all -> 0x0215 }
            monitor-exit(r8)
            return
        L_0x0107:
            com.ironsource.mediationsdk.p r9 = r8.f50418j0     // Catch:{ all -> 0x0215 }
            r9.f51453c = r10     // Catch:{ all -> 0x0215 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.q> r0 = r9.f51454d     // Catch:{ all -> 0x0215 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x0215 }
            if (r0 != 0) goto L_0x0127
            r12 = 3503(0xdaf, float:4.909E-42)
            com.ironsource.mediationsdk.C11436p.m51105c(r12, r11)     // Catch:{ all -> 0x0215 }
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x01f6
        L_0x0122:
            r9.mo20630d(r11)     // Catch:{ all -> 0x0215 }
            goto L_0x01f6
        L_0x0127:
            r0 = 0
            r3 = 3504(0xdb0, float:4.91E-42)
            if (r10 != 0) goto L_0x0131
        L_0x012c:
            com.ironsource.mediationsdk.C11436p.m51105c(r3, r11)     // Catch:{ all -> 0x0215 }
            r2 = 0
            goto L_0x0138
        L_0x0131:
            boolean r4 = r10.isDestroyed()     // Catch:{ all -> 0x0215 }
            if (r4 == 0) goto L_0x0138
            goto L_0x012c
        L_0x0138:
            if (r2 != 0) goto L_0x0145
            java.lang.String r11 = "validateBannerLayout fail"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildGenericError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x01f6
            goto L_0x0122
        L_0x0145:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.q> r0 = r9.f51454d     // Catch:{ all -> 0x0215 }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ all -> 0x0215 }
            r2 = r11
            com.ironsource.mediationsdk.q r2 = (com.ironsource.mediationsdk.C11437q) r2     // Catch:{ all -> 0x0215 }
            r9.f51452b = r2     // Catch:{ all -> 0x0215 }
            if (r2 != 0) goto L_0x0166
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm smash is no exist"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = r11.getErrorMessage()     // Catch:{ all -> 0x0215 }
            r12.error(r0)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x01f6
            goto L_0x0122
        L_0x0166:
            boolean r11 = r2.mo44582i()     // Catch:{ all -> 0x0215 }
            r0 = 3300(0xce4, float:4.624E-42)
            if (r11 != 0) goto L_0x0186
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm in IAB flow must be called by bidder instances"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0215 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0215 }
            r12.error(r3)     // Catch:{ all -> 0x0215 }
            r12 = 0
            com.ironsource.mediationsdk.C11436p.m51104b(r0, r2, r12)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x01f6
            goto L_0x0122
        L_0x0186:
            com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ all -> 0x0215 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.C11377f.m50862e(r12)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.f$a r12 = new com.ironsource.mediationsdk.f$a     // Catch:{ all -> 0x0215 }
            r12.<init>()     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ Exception -> 0x019a }
            com.ironsource.mediationsdk.f$a r12 = com.ironsource.mediationsdk.C11377f.m50858b((org.json.JSONObject) r11)     // Catch:{ Exception -> 0x019a }
            goto L_0x01c1
        L_0x019a:
            r11 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0215 }
            java.lang.String r4 = "loadISDemandOnlyBannerWithAdm: unable to get auction data from response. Exception="
            r3.<init>(r4)     // Catch:{ all -> 0x0215 }
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x0215 }
            r3.append(r11)     // Catch:{ all -> 0x0215 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0215 }
            java.lang.String r4 = r11.getErrorMessage()     // Catch:{ all -> 0x0215 }
            r3.error(r4)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r3 == 0) goto L_0x01c1
            r3.mo20630d(r11)     // Catch:{ all -> 0x0215 }
        L_0x01c1:
            com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ all -> 0x0215 }
            java.lang.String r11 = r2.mo44576d()     // Catch:{ all -> 0x0215 }
            java.util.List<com.ironsource.mediationsdk.a.c> r3 = r12.f51106b     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.a.c r11 = com.ironsource.mediationsdk.C11377f.m50855a(r11, r3)     // Catch:{ all -> 0x0215 }
            if (r11 == 0) goto L_0x01f8
            java.lang.String r0 = r11.mo44005b()     // Catch:{ all -> 0x0215 }
            r2.mo44571a((java.lang.String) r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = r12.f51105a     // Catch:{ all -> 0x0215 }
            r2.mo44574b((java.lang.String) r0)     // Catch:{ all -> 0x0215 }
            org.json.JSONObject r0 = r12.f51108d     // Catch:{ all -> 0x0215 }
            r2.mo44572a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0215 }
            r0 = 3002(0xbba, float:4.207E-42)
            r9.mo44455a(r0, r2)     // Catch:{ all -> 0x0215 }
            java.lang.String r4 = r11.mo44005b()     // Catch:{ all -> 0x0215 }
            java.lang.String r5 = r12.f51105a     // Catch:{ all -> 0x0215 }
            org.json.JSONObject r6 = r12.f51108d     // Catch:{ all -> 0x0215 }
            java.util.List r7 = r11.mo44007d()     // Catch:{ all -> 0x0215 }
            r3 = r10
            r2.mo44465a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0215 }
        L_0x01f6:
            monitor-exit(r8)
            return
        L_0x01f8:
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm invalid enriched adm"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0215 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0215 }
            r12.error(r3)     // Catch:{ all -> 0x0215 }
            r9.mo44455a(r0, r2)     // Catch:{ all -> 0x0215 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f51453c     // Catch:{ all -> 0x0215 }
            if (r9 == 0) goto L_0x022b
            r9.mo20630d(r11)     // Catch:{ all -> 0x0215 }
            goto L_0x022b
        L_0x0212:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0212 }
            throw r11     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r9 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f50415i     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            java.lang.String r0 = "loadDemandOnlyBanner"
            r11.logException(r12, r0, r9)     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x000f }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x000f }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x000f }
            r10.mo20630d(r11)     // Catch:{ all -> 0x000f }
        L_0x022b:
            monitor-exit(r8)
            return
        L_0x022d:
            monitor-exit(r8)
            goto L_0x0230
        L_0x022f:
            throw r9
        L_0x0230:
            goto L_0x022f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43749a(android.app.Activity, com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo43750a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f50415i.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C11262W.m50363a().mo43932a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo43757b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43751a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.C11446f r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f50415i     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.f50383K     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.m50122o(r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.f50380H = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.f50382J     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.m50122o(r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.f50379G = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.f50384L     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.m50122o(r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.f50381I = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.f50382J     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.m50122o(r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.f50379G = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.f50383K     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.m50122o(r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.f50380H = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.f50384L     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.m50122o(r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.f50381I = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo43752a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00f9
        L_0x00f8:
            throw r8
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43751a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123 A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0165 A[Catch:{ Exception -> 0x023a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a1 A[SYNTHETIC, Splitter:B:67:0x01a1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43752a(android.content.Context r10, java.lang.String r11, boolean r12, com.ironsource.mediationsdk.sdk.C11446f r13, com.ironsource.mediationsdk.IronSource.AD_UNIT... r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x028f }
            java.lang.String r1 = ""
            r0.verbose(r1)     // Catch:{ all -> 0x028f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f50432v     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x027c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x027c
            r9.f50394V = r13     // Catch:{ all -> 0x028f }
            if (r14 == 0) goto L_0x004d
            int r13 = r14.length     // Catch:{ all -> 0x028f }
            if (r13 != 0) goto L_0x001c
            goto L_0x004d
        L_0x001c:
            int r13 = r14.length     // Catch:{ all -> 0x028f }
            r0 = 0
        L_0x001e:
            if (r0 >= r13) goto L_0x0065
            r3 = r14[r0]     // Catch:{ all -> 0x028f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f50373A     // Catch:{ all -> 0x028f }
            r4.add(r3)     // Catch:{ all -> 0x028f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f50374B     // Catch:{ all -> 0x028f }
            r4.add(r3)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x028f }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x028f }
            if (r4 == 0) goto L_0x0036
            r9.f50383K = r2     // Catch:{ all -> 0x028f }
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x028f }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x028f }
            if (r4 == 0) goto L_0x0040
            r9.f50384L = r2     // Catch:{ all -> 0x028f }
        L_0x0040:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x028f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x004a
            r9.f50382J = r2     // Catch:{ all -> 0x028f }
        L_0x004a:
            int r0 = r0 + 1
            goto L_0x001e
        L_0x004d:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r13 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x028f }
            int r0 = r13.length     // Catch:{ all -> 0x028f }
            r3 = 0
        L_0x0053:
            if (r3 >= r0) goto L_0x005f
            r4 = r13[r3]     // Catch:{ all -> 0x028f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f50373A     // Catch:{ all -> 0x028f }
            r5.add(r4)     // Catch:{ all -> 0x028f }
            int r3 = r3 + 1
            goto L_0x0053
        L_0x005f:
            r9.f50382J = r2     // Catch:{ all -> 0x028f }
            r9.f50383K = r2     // Catch:{ all -> 0x028f }
            r9.f50384L = r2     // Catch:{ all -> 0x028f }
        L_0x0065:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = r9.f50415i     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x028f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x028f }
            java.lang.String r4 = "init(appKey:"
            r3.<init>(r4)     // Catch:{ all -> 0x028f }
            r3.append(r11)     // Catch:{ all -> 0x028f }
            java.lang.String r4 = ")"
            r3.append(r4)     // Catch:{ all -> 0x028f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x028f }
            r13.log(r0, r3, r2)     // Catch:{ all -> 0x028f }
            boolean r13 = r10 instanceof android.app.Activity     // Catch:{ all -> 0x028f }
            if (r13 == 0) goto L_0x008d
            com.ironsource.environment.ContextProvider r13 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x028f }
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x028f }
            r13.updateActivity(r3)     // Catch:{ all -> 0x028f }
        L_0x008d:
            com.ironsource.environment.ContextProvider r13 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x028f }
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ all -> 0x028f }
            r13.updateAppContext(r3)     // Catch:{ all -> 0x028f }
            com.ironsource.environment.C4979h.m22823q()     // Catch:{ all -> 0x028f }
            com.ironsource.c.a r13 = r9.f50422l0     // Catch:{ all -> 0x028f }
            java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x028f }
            r13.mo20545b((java.lang.String) r3)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.utils.c r13 = new com.ironsource.mediationsdk.utils.c     // Catch:{ all -> 0x028f }
            r13.<init>()     // Catch:{ all -> 0x028f }
            if (r11 == 0) goto L_0x00cf
            r3 = 5
            r4 = 10
            boolean r3 = m50130x(r11, r3, r4)     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x00c6
            boolean r3 = m50107a0(r11)     // Catch:{ all -> 0x028f }
            if (r3 != 0) goto L_0x00d9
            java.lang.String r3 = "appKey"
            java.lang.String r4 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r3, r11, r4)     // Catch:{ all -> 0x028f }
        L_0x00c2:
            r13.mo44541a(r3)     // Catch:{ all -> 0x028f }
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r3 = "appKey"
            java.lang.String r4 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r3 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r3, r11, r4)     // Catch:{ all -> 0x028f }
            goto L_0x00c2
        L_0x00cf:
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x028f }
            r4 = 506(0x1fa, float:7.09E-43)
            java.lang.String r5 = "Init Fail - appKey is missing"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x028f }
            goto L_0x00c2
        L_0x00d9:
            boolean r3 = r13.mo44542a()     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x00e1
            r9.f50417j = r11     // Catch:{ all -> 0x028f }
        L_0x00e1:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x028f }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x028f }
            boolean r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r3)     // Catch:{ all -> 0x028f }
            long r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r3)     // Catch:{ all -> 0x028f }
            if (r4 != 0) goto L_0x0113
            r7 = -1
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0113
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x028f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x028f }
            java.lang.String r8 = "get first session timestamp = "
            r7.<init>(r8)     // Catch:{ all -> 0x028f }
            r7.append(r4)     // Catch:{ all -> 0x028f }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x028f }
            r6.verbose(r7)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r3, r4)     // Catch:{ all -> 0x028f }
        L_0x0113:
            com.ironsource.environment.ContextProvider r3 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x028f }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x028f }
            java.lang.String r4 = r9.f50419k     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.utils.k r3 = r9.m50119j(r3, r4)     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x0132
            com.ironsource.environment.g r4 = com.ironsource.environment.C4978g.f22048a     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.model.h r3 = r3.f51666c     // Catch:{ all -> 0x028f }
            com.ironsource.sdk.f.a r3 = r3.f51381e     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.utils.a r3 = r3.mo44989f()     // Catch:{ all -> 0x028f }
            boolean r3 = r3.f51531c     // Catch:{ all -> 0x028f }
            com.ironsource.environment.C4978g.m22778a(r3)     // Catch:{ all -> 0x028f }
        L_0x0132:
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.f50428r     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x0161
            boolean r3 = r3.compareAndSet(r1, r2)     // Catch:{ all -> 0x028f }
            if (r3 == 0) goto L_0x0161
            com.ironsource.mediationsdk.a.i r3 = com.ironsource.mediationsdk.p276a.C11297i.m50472a()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.utils.h r4 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x028f }
            r4.<init>(r10)     // Catch:{ all -> 0x028f }
            r3.mo44011a(r4)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f50376D     // Catch:{ all -> 0x028f }
            r3.mo43973a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f50376D     // Catch:{ all -> 0x028f }
            r3.mo43973a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.a.g r3 = com.ironsource.mediationsdk.p276a.C11295g.f50727v     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSourceSegment r4 = r9.f50376D     // Catch:{ all -> 0x028f }
            r3.mo43973a((android.content.Context) r10, (com.ironsource.mediationsdk.IronSourceSegment) r4)     // Catch:{ all -> 0x028f }
        L_0x0161:
            java.lang.String r3 = r9.f50417j     // Catch:{ all -> 0x028f }
            if (r3 != 0) goto L_0x01a1
            com.ironsource.mediationsdk.c0 r10 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.c0$c r11 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ all -> 0x028f }
            r10.mo44216b((com.ironsource.mediationsdk.C11362c0.C11366c) r11)     // Catch:{ all -> 0x028f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r10 = r9.f50373A     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x028f }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x028f }
            if (r10 == 0) goto L_0x017d
            com.ironsource.mediationsdk.sdk.j r10 = r9.f50421l     // Catch:{ all -> 0x028f }
            r10.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x028f }
        L_0x017d:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r10 = r9.f50373A     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x028f }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x028f }
            if (r10 == 0) goto L_0x0190
            com.ironsource.mediationsdk.sdk.j r10 = r9.f50421l     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r13.mo44543b()     // Catch:{ all -> 0x028f }
            r10.mo44236a((boolean) r1, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x028f }
        L_0x0190:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r13.mo44543b()     // Catch:{ all -> 0x028f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x028f }
            r10.log(r0, r11, r2)     // Catch:{ all -> 0x028f }
            monitor-exit(r9)
            return
        L_0x01a1:
            com.ironsource.c.a r13 = r9.f50422l0     // Catch:{ all -> 0x028f }
            r13.mo20547d((android.content.Context) r10)     // Catch:{ all -> 0x028f }
            com.ironsource.c.a r13 = r9.f50422l0     // Catch:{ all -> 0x028f }
            java.lang.String r0 = r9.f50417j     // Catch:{ all -> 0x028f }
            r13.mo20542a((java.lang.String) r0)     // Catch:{ all -> 0x028f }
            com.ironsource.c.a r13 = r9.f50422l0     // Catch:{ all -> 0x028f }
            java.lang.String r0 = r9.f50426p     // Catch:{ all -> 0x028f }
            r13.mo20546c((java.lang.String) r0)     // Catch:{ all -> 0x028f }
            com.ironsource.c.a r13 = r9.f50422l0     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.config.ConfigFile r0 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x028f }
            java.lang.String r0 = r0.getPluginType()     // Catch:{ all -> 0x028f }
            r13.mo20548d((java.lang.String) r0)     // Catch:{ all -> 0x028f }
            boolean r13 = r9.f50375C     // Catch:{ all -> 0x028f }
            if (r13 == 0) goto L_0x024e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x028f }
            r13.<init>()     // Catch:{ all -> 0x028f }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r12)     // Catch:{ all -> 0x028f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023a }
            java.lang.String r3 = ",androidx="
            r0.<init>(r3)     // Catch:{ Exception -> 0x023a }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x023a }
            r0.append(r3)     // Catch:{ Exception -> 0x023a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x023a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023a }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x023a }
            boolean r4 = m50117h()     // Catch:{ Exception -> 0x023a }
            r3.append(r4)     // Catch:{ Exception -> 0x023a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x023a }
            boolean r4 = com.ironsource.environment.C4952a.C49531.m22731d()     // Catch:{ Exception -> 0x023a }
            if (r4 == 0) goto L_0x0205
            java.lang.String r4 = "appLanguage=Kotlin"
            r13.append(r4)     // Catch:{ Exception -> 0x023a }
            java.lang.String r4 = com.ironsource.environment.C4952a.C49531.m22728c()     // Catch:{ Exception -> 0x023a }
        L_0x0201:
            r13.append(r4)     // Catch:{ Exception -> 0x023a }
            goto L_0x0208
        L_0x0205:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x0201
        L_0x0208:
            r13.append(r0)     // Catch:{ Exception -> 0x023a }
            boolean r0 = r9.mo43745H()     // Catch:{ Exception -> 0x023a }
            if (r0 == 0) goto L_0x0214
            r13.append(r3)     // Catch:{ Exception -> 0x023a }
        L_0x0214:
            java.lang.String r0 = "ext1"
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x023a }
            r12.put(r0, r13)     // Catch:{ Exception -> 0x023a }
            if (r14 == 0) goto L_0x022f
            int r13 = r14.length     // Catch:{ Exception -> 0x023a }
            r0 = 0
        L_0x0221:
            if (r0 >= r13) goto L_0x022f
            r3 = r14[r0]     // Catch:{ Exception -> 0x023a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x023a }
            r12.put(r3, r2)     // Catch:{ Exception -> 0x023a }
            int r0 = r0 + 1
            goto L_0x0221
        L_0x022f:
            java.lang.String r13 = "sessionDepth"
            int r14 = r9.f50378F     // Catch:{ Exception -> 0x023a }
            int r14 = r14 + r2
            r9.f50378F = r14     // Catch:{ Exception -> 0x023a }
            r12.put(r13, r14)     // Catch:{ Exception -> 0x023a }
            goto L_0x023e
        L_0x023a:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ all -> 0x028f }
        L_0x023e:
            com.ironsource.mediationsdk.adunit.a.a r13 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x028f }
            r14 = 14
            r13.<init>(r14, r12)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x028f }
            r12.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r13)     // Catch:{ all -> 0x028f }
            r9.f50375C = r1     // Catch:{ all -> 0x028f }
        L_0x024e:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r12 = r9.f50373A     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r13 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x028f }
            boolean r12 = r12.contains(r13)     // Catch:{ all -> 0x028f }
            if (r12 == 0) goto L_0x0261
            com.ironsource.mediationsdk.c0 r12 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.a0 r13 = r9.f50409f     // Catch:{ all -> 0x028f }
            r12.mo44214a((com.ironsource.mediationsdk.utils.C11493i) r13)     // Catch:{ all -> 0x028f }
        L_0x0261:
            com.ironsource.mediationsdk.c0 r12 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x028f }
            r12.mo44214a((com.ironsource.mediationsdk.utils.C11493i) r9)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.c0 r12 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.impressionData.a r13 = r9.f50420k0     // Catch:{ all -> 0x028f }
            r12.mo44214a((com.ironsource.mediationsdk.utils.C11493i) r13)     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.c0 r12 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x028f }
            java.lang.String r13 = r9.f50419k     // Catch:{ all -> 0x028f }
            r12.mo44213a(r10, r11, r13)     // Catch:{ all -> 0x028f }
            monitor-exit(r9)
            return
        L_0x027c:
            if (r14 == 0) goto L_0x0283
            r9.m50128v(r12, r14)     // Catch:{ all -> 0x028f }
            monitor-exit(r9)
            return
        L_0x0283:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r9.f50415i     // Catch:{ all -> 0x028f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x028f }
            java.lang.String r12 = "Multiple calls to init without ad units are not allowed"
            r13 = 3
            r10.log(r11, r12, r13)     // Catch:{ all -> 0x028f }
            monitor-exit(r9)
            return
        L_0x028f:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0293
        L_0x0292:
            throw r10
        L_0x0293:
            goto L_0x0292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43752a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (m50113e() != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r3.f50415i.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
        com.ironsource.mediationsdk.C11399j.m50992a().mo44318a(r4, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "No banner configurations found"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r3.f50404c0 != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r3.f50413h.mo44332a(r4, m50112d0(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010d, code lost:
        r3.f50391S.mo43851a(r4, m50112d0(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43753a(com.ironsource.mediationsdk.IronSourceBannerLayout r4, java.lang.String r5) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            r0 = 3
            if (r4 == 0) goto L_0x011a
            boolean r1 = r4.isDestroyed()
            if (r1 == 0) goto L_0x001e
            goto L_0x011a
        L_0x001e:
            boolean r1 = r3.f50384L
            if (r1 != 0) goto L_0x0037
            java.lang.String r5 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.j r0 = com.ironsource.mediationsdk.C11399j.m50992a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo44318a(r4, r5)
            return
        L_0x0037:
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            java.lang.String r1 = r1.getDescription()
            java.lang.String r2 = "CUSTOM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0072
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getWidth()
            if (r1 <= 0) goto L_0x005b
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getHeight()
            if (r1 > 0) goto L_0x0072
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C11399j.m50992a()
            java.lang.String r0 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r0)
            r5.mo44318a(r4, r0)
            return
        L_0x0072:
            com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.m50779a()
            com.ironsource.mediationsdk.c0$c r1 = r1.mo44215b()
            com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED
            if (r1 != r2) goto L_0x0098
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C11399j.m50992a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 600(0x258, float:8.41E-43)
            java.lang.String r2 = "Init() had failed"
            r0.<init>(r1, r2)
            r5.mo44318a(r4, r0)
            return
        L_0x0098:
            com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_IN_PROGRESS
            if (r1 != r2) goto L_0x00c9
            com.ironsource.mediationsdk.c0 r1 = com.ironsource.mediationsdk.C11362c0.m50779a()
            boolean r1 = r1.mo44218c()
            if (r1 == 0) goto L_0x00c0
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C11399j.m50992a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 601(0x259, float:8.42E-43)
            java.lang.String r2 = "Init had failed"
            r0.<init>(r1, r2)
            r5.mo44318a(r4, r0)
            return
        L_0x00c0:
            r3.f50386N = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f50385M = r4
            r3.f50387O = r5
            return
        L_0x00c9:
            java.lang.Boolean r1 = r3.f50385M
            monitor-enter(r1)
            com.ironsource.mediationsdk.k r2 = r3.f50413h     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x00de
            com.ironsource.mediationsdk.M r2 = r3.f50391S     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x00de
            r3.f50386N = r4     // Catch:{ all -> 0x0117 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0117 }
            r3.f50385M = r4     // Catch:{ all -> 0x0117 }
            r3.f50387O = r5     // Catch:{ all -> 0x0117 }
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            return
        L_0x00de:
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            boolean r1 = r3.m50113e()
            if (r1 != 0) goto L_0x00ff
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "No banner configurations found"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C11399j.m50992a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 615(0x267, float:8.62E-43)
            java.lang.String r2 = "No banner configurations found"
            r0.<init>(r1, r2)
            r5.mo44318a(r4, r0)
            return
        L_0x00ff:
            boolean r0 = r3.f50404c0
            if (r0 != 0) goto L_0x010d
            com.ironsource.mediationsdk.k r0 = r3.f50413h
            com.ironsource.mediationsdk.model.g r5 = r3.m50112d0(r5)
            r0.mo44332a(r4, r5)
            return
        L_0x010d:
            com.ironsource.mediationsdk.M r0 = r3.f50391S
            com.ironsource.mediationsdk.model.g r5 = r3.m50112d0(r5)
            r0.mo43851a((com.ironsource.mediationsdk.IronSourceBannerLayout) r4, (com.ironsource.mediationsdk.model.C11421g) r5)
            return
        L_0x0117:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r4
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "loadBanner can't be called - "
            r5.<init>(r1)
            if (r4 != 0) goto L_0x0126
            java.lang.String r1 = "banner layout is null "
            goto L_0x0128
        L_0x0126:
            java.lang.String r1 = "banner layout is destroyed"
        L_0x0128:
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.j r0 = com.ironsource.mediationsdk.C11399j.m50992a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo44318a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43753a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo43754a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f50421l != null) {
                for (IronSource.AD_UNIT p : this.f50373A) {
                    m50123p(p, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo43755a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C11361b.m50766a().mo44208a(metaDataKey, metaDataValue);
            } else {
                C11369d.m50788a().mo44230a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C11369d.m50788a().f51059g;
                concurrentHashMap.putAll(C11361b.m50766a().mo44212d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.f50422l0.mo20543a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            C11296h.m50466e().mo43979b(new C11308a(C11362c0.m50779a().mo44215b() == C11362c0.C11366c.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* renamed from: a */
    public final void mo43756a(List<IronSource.AD_UNIT> list, boolean z, C11422h hVar) {
        IronLog.INTERNAL.verbose("");
        try {
            this.f50434x = list;
            this.f50433w = true;
            this.f50415i.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C11296h.m50466e().mo43979b(new C11308a(114, mediationAdditionalData));
            }
            C11292d.m50446e().mo43986d();
            C11296h.m50466e().mo43986d();
            C11369d a = C11369d.m50788a();
            String str = this.f50417j;
            String str2 = this.f50419k;
            a.f51055c = str;
            a.f51056d = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f50373A.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m50087C(ad_unit);
                    } else {
                        m50123p(ad_unit, false);
                    }
                }
            }
            if (this.f50394V != null) {
                IronLog.CALLBACK.verbose("onInitializationCompleted");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo43757b(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f50415i     // Catch:{ all -> 0x0156 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0156 }
            r2.append(r8)     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0156 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0156 }
            boolean r0 = r6.f50382J     // Catch:{ all -> 0x0138 }
            r2 = 508(0x1fc, float:7.12E-43)
            r4 = 3
            if (r0 != 0) goto L_0x0033
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f50415i     // Catch:{ all -> 0x0138 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r9 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0138 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0138 }
            r9.mo43932a(r8, r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x0033:
            boolean r0 = r6.f50379G     // Catch:{ all -> 0x0138 }
            if (r0 != 0) goto L_0x004c
            java.lang.String r7 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f50415i     // Catch:{ all -> 0x0138 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r9 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0138 }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x0138 }
            r9.mo43932a(r8, r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x004c:
            r0 = 0
            if (r7 == 0) goto L_0x0057
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0138 }
            r2.updateActivity(r7)     // Catch:{ all -> 0x0138 }
            goto L_0x0086
        L_0x0057:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0138 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x0086
            if (r9 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0138 }
            r9 = 81321(0x13da9, float:1.13955E-40)
            m50121m(r9, r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f50415i     // Catch:{ all -> 0x0138 }
            r9.log(r1, r7, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r9 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0138 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0138 }
            r9.mo43932a(r8, r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x0086:
            com.ironsource.mediationsdk.c0 r7 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.c0$c r7 = r7.mo44215b()     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ all -> 0x0138 }
            if (r7 != r2) goto L_0x00aa
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f50415i     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "init() had failed"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0138 }
            r7.mo43932a(r8, r9)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x00aa:
            com.ironsource.mediationsdk.c0$c r2 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_IN_PROGRESS     // Catch:{ all -> 0x0138 }
            r5 = 83002(0x1443a, float:1.1631E-40)
            if (r7 != r2) goto L_0x00ec
            com.ironsource.mediationsdk.c0 r7 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0138 }
            boolean r7 = r7.mo44218c()     // Catch:{ all -> 0x0138 }
            if (r7 == 0) goto L_0x00d3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f50415i     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "init() had failed"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0138 }
            r7.mo43932a(r8, r9)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x00d3:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f50410f0     // Catch:{ all -> 0x0138 }
            monitor-enter(r7)     // Catch:{ all -> 0x0138 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r6.f50410f0     // Catch:{ all -> 0x00e9 }
            r0.add(r8)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e9 }
            if (r9 == 0) goto L_0x00e7
            int r7 = r6.f50406d0     // Catch:{ all -> 0x0138 }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r7)     // Catch:{ all -> 0x0138 }
            m50121m(r5, r7)     // Catch:{ all -> 0x0138 }
        L_0x00e7:
            monitor-exit(r6)
            return
        L_0x00e9:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e9 }
            throw r9     // Catch:{ all -> 0x0138 }
        L_0x00ec:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f50410f0     // Catch:{ all -> 0x0138 }
            monitor-enter(r7)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.k0 r2 = r6.f50416i0     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x0106
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r6.f50410f0     // Catch:{ all -> 0x0135 }
            r0.add(r8)     // Catch:{ all -> 0x0135 }
            if (r9 == 0) goto L_0x0103
            int r9 = r6.f50406d0     // Catch:{ all -> 0x0135 }
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r9)     // Catch:{ all -> 0x0135 }
            m50121m(r5, r9)     // Catch:{ all -> 0x0135 }
        L_0x0103:
            monitor-exit(r7)     // Catch:{ all -> 0x0135 }
            monitor-exit(r6)
            return
        L_0x0106:
            monitor-exit(r7)     // Catch:{ all -> 0x0135 }
            boolean r7 = r6.mo43741D()     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x0125
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f50415i     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "No rewarded video configurations found"
            r7.log(r1, r9, r4)     // Catch:{ all -> 0x0138 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r0)     // Catch:{ all -> 0x0138 }
            r7.mo43932a(r8, r9)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x0125:
            if (r9 != 0) goto L_0x012e
            com.ironsource.mediationsdk.k0 r7 = r6.f50416i0     // Catch:{ all -> 0x0138 }
            r9 = 0
            r7.mo44348a((java.lang.String) r8, (java.lang.String) r9, (boolean) r0)     // Catch:{ all -> 0x0138 }
            goto L_0x0154
        L_0x012e:
            com.ironsource.mediationsdk.k0 r7 = r6.f50416i0     // Catch:{ all -> 0x0138 }
            r7.mo44348a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x0138 }
            monitor-exit(r6)
            return
        L_0x0135:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0135 }
            throw r9     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f50415i     // Catch:{ all -> 0x0156 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r9.logException(r0, r1, r7)     // Catch:{ all -> 0x0156 }
            com.ironsource.mediationsdk.W r9 = com.ironsource.mediationsdk.C11262W.m50363a()     // Catch:{ all -> 0x0156 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0156 }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0156 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0156 }
            r9.mo43932a(r8, r0)     // Catch:{ all -> 0x0156 }
        L_0x0154:
            monitor-exit(r6)
            return
        L_0x0156:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43757b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo43758b(boolean z) {
        this.f50388P = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C11369d.m50788a().mo44231a(z);
        if (this.f50405d != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f50405d.setConsent(z);
        }
        int i = 40;
        if (!z) {
            i = 41;
        }
        this.f50422l0.mo20544a(z);
        C11296h.m50466e().mo43979b(new C11308a(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: c */
    public final synchronized void mo43759c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f50415i.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C11508z.m51348a().mo44589a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo43762d(activity, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3.mo44137b() != false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[Catch:{ all -> 0x0080 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43760c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f50379G     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f50415i     // Catch:{ all -> 0x0085 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0085 }
            return r2
        L_0x0013:
            boolean r3 = r9.f50397Y     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0025
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f50393U     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.mo44137b()     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x003a
        L_0x0023:
            r3 = 0
            goto L_0x003a
        L_0x0025:
            boolean r3 = r9.f50395W     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0034
            com.ironsource.mediationsdk.y r3 = r9.f50389Q     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.mo44199a_()     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0023
            goto L_0x0021
        L_0x0034:
            com.ironsource.mediationsdk.g0 r3 = r9.f50407e     // Catch:{ all -> 0x0085 }
            boolean r3 = r3.mo44276c()     // Catch:{ all -> 0x0085 }
        L_0x003a:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x0080 }
            boolean r5 = r9.f50395W     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0058
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x0080 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x0080 }
            int r7 = r9.f50406d0     // Catch:{ all -> 0x0080 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0080 }
            r6[r1] = r7     // Catch:{ all -> 0x0080 }
            r5[r2] = r6     // Catch:{ all -> 0x0080 }
            m50127u(r4, r5)     // Catch:{ all -> 0x0080 }
        L_0x0058:
            com.ironsource.mediationsdk.adunit.a.a r5 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x005f
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x0061
        L_0x005f:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x0061:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x0080 }
            r4.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r5)     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f50415i     // Catch:{ all -> 0x0080 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r6.<init>(r0)     // Catch:{ all -> 0x0080 }
            r6.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0080 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0080 }
            r2 = r3
            goto L_0x00a1
        L_0x0080:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0087
        L_0x0085:
            r3 = move-exception
            r4 = 0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f50415i
            java.lang.String r1 = "isRewardedVideoAvailable()"
            r0.logException(r6, r1, r3)
        L_0x00a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43760c():boolean");
    }

    /* renamed from: c */
    public final boolean mo43761c(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, this.f50399a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            C11484c cVar = new C11484c();
            if (!m50130x(str, 1, 128)) {
                cVar.mo44541a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (cVar.mo44542a()) {
                this.f50423m = str;
                C11296h.m50466e().mo43979b(new C11308a(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(ironSourceTag, cVar.mo44543b().toString(), 2);
            return false;
        } catch (Exception e) {
            this.f50415i.logException(IronSourceLogger.IronSourceTag.API, this.f50399a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo43762d(android.app.Activity r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f50415i     // Catch:{ all -> 0x0150 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0150 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0150 }
            r2.append(r9)     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0150 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0150 }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r7.f50383K     // Catch:{ all -> 0x0134 }
            r4 = 3
            if (r2 != 0) goto L_0x0033
            java.lang.String r8 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r7.f50415i     // Catch:{ all -> 0x0134 }
            r10.log(r1, r8, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r10 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0134 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0134 }
            r10.mo44589a(r9, r1)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x0033:
            boolean r2 = r7.f50380H     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x004c
            java.lang.String r8 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r7.f50415i     // Catch:{ all -> 0x0134 }
            r10.log(r1, r8, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r10 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0134 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0134 }
            r10.mo44589a(r9, r1)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x004c:
            r2 = 0
            if (r8 == 0) goto L_0x0057
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0134 }
            r5.updateActivity(r8)     // Catch:{ all -> 0x0134 }
            goto L_0x0086
        L_0x0057:
            com.ironsource.environment.ContextProvider r8 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0134 }
            android.app.Activity r8 = r8.getCurrentActiveActivity()     // Catch:{ all -> 0x0134 }
            if (r8 != 0) goto L_0x0086
            if (r10 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r2 = 1
        L_0x0065:
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r2, r3)     // Catch:{ all -> 0x0134 }
            r10 = 82321(0x14191, float:1.15356E-40)
            m50086B(r10, r8)     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r7.f50415i     // Catch:{ all -> 0x0134 }
            r10.log(r1, r8, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r10 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0134 }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r8)     // Catch:{ all -> 0x0134 }
            r10.mo44589a(r9, r1)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x0086:
            com.ironsource.mediationsdk.c0 r8 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.c0$c r8 = r8.mo44215b()     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.c0$c r5 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_FAILED     // Catch:{ all -> 0x0134 }
            if (r8 != r5) goto L_0x00aa
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r7.f50415i     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "init() had failed"
            r8.log(r1, r10, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r8 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r10 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r10, r1)     // Catch:{ all -> 0x0134 }
            r8.mo44589a(r9, r10)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x00aa:
            com.ironsource.mediationsdk.c0$c r5 = com.ironsource.mediationsdk.C11362c0.C11366c.INIT_IN_PROGRESS     // Catch:{ all -> 0x0134 }
            r6 = 83003(0x1443b, float:1.16312E-40)
            if (r8 != r5) goto L_0x00ea
            com.ironsource.mediationsdk.c0 r8 = com.ironsource.mediationsdk.C11362c0.m50779a()     // Catch:{ all -> 0x0134 }
            boolean r8 = r8.mo44218c()     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x00d3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r7.f50415i     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "init() had failed"
            r8.log(r1, r10, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r8 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r10 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r10, r1)     // Catch:{ all -> 0x0134 }
            r8.mo44589a(r9, r10)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x00d3:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r8 = r7.f50408e0     // Catch:{ all -> 0x0134 }
            monitor-enter(r8)     // Catch:{ all -> 0x0134 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r7.f50408e0     // Catch:{ all -> 0x00e7 }
            r1.add(r9)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e7 }
            if (r10 == 0) goto L_0x00e5
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0134 }
            m50086B(r6, r8)     // Catch:{ all -> 0x0134 }
        L_0x00e5:
            monitor-exit(r7)
            return
        L_0x00e7:
            r10 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e7 }
            throw r10     // Catch:{ all -> 0x0134 }
        L_0x00ea:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r8 = r7.f50408e0     // Catch:{ all -> 0x0134 }
            monitor-enter(r8)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.j0 r5 = r7.f50414h0     // Catch:{ all -> 0x0131 }
            if (r5 != 0) goto L_0x0102
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r7.f50408e0     // Catch:{ all -> 0x0131 }
            r1.add(r9)     // Catch:{ all -> 0x0131 }
            if (r10 == 0) goto L_0x00ff
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0131 }
            m50086B(r6, r10)     // Catch:{ all -> 0x0131 }
        L_0x00ff:
            monitor-exit(r8)     // Catch:{ all -> 0x0131 }
            monitor-exit(r7)
            return
        L_0x0102:
            monitor-exit(r8)     // Catch:{ all -> 0x0131 }
            boolean r8 = r7.mo43743F()     // Catch:{ all -> 0x0134 }
            if (r8 != 0) goto L_0x0121
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r7.f50415i     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "No interstitial configurations found"
            r8.log(r1, r10, r4)     // Catch:{ all -> 0x0134 }
            com.ironsource.mediationsdk.z r8 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r10 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r10, r1)     // Catch:{ all -> 0x0134 }
            r8.mo44589a(r9, r10)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x0121:
            if (r10 != 0) goto L_0x012a
            com.ironsource.mediationsdk.j0 r8 = r7.f50414h0     // Catch:{ all -> 0x0134 }
            r10 = 0
            r8.mo44327a((java.lang.String) r9, (java.lang.String) r10, (boolean) r2)     // Catch:{ all -> 0x0134 }
            goto L_0x014e
        L_0x012a:
            com.ironsource.mediationsdk.j0 r8 = r7.f50414h0     // Catch:{ all -> 0x0134 }
            r8.mo44327a((java.lang.String) r9, (java.lang.String) r10, (boolean) r3)     // Catch:{ all -> 0x0134 }
            monitor-exit(r7)
            return
        L_0x0131:
            r10 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0131 }
            throw r10     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r7.f50415i     // Catch:{ all -> 0x0150 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r10.logException(r1, r2, r8)     // Catch:{ all -> 0x0150 }
            com.ironsource.mediationsdk.z r10 = com.ironsource.mediationsdk.C11508z.m51348a()     // Catch:{ all -> 0x0150 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0150 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0150 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0150 }
            r10.mo44589a(r9, r1)     // Catch:{ all -> 0x0150 }
        L_0x014e:
            monitor-exit(r7)
            return
        L_0x0150:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43762d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo43763d(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f50399a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!m50130x(str, 1, 64) || !m50107a0(str)) {
                this.f50415i.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f50425o = str;
            }
        } catch (Exception e) {
            this.f50415i.logException(IronSourceLogger.IronSourceTag.API, this.f50399a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* renamed from: e */
    public final void mo43764e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.f50379G) {
                this.f50415i.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                this.f50421l.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!mo43741D()) {
                this.f50421l.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (this.f50395W) {
                m50093Q(str);
            } else {
                Placement R = m50094R(str);
                if (R != null) {
                    this.f50407e.mo44284o(R);
                    this.f50407e.mo44271a(R.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.f50415i.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f50421l.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
    }

    /* renamed from: f */
    public final void mo43765f() {
        synchronized (this.f50385M) {
            if (this.f50385M.booleanValue()) {
                this.f50385M = Boolean.FALSE;
                C11399j.m50992a().mo44318a(this.f50386N, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init had failed"));
                this.f50386N = null;
                this.f50387O = null;
            }
        }
        if (this.f50402b0) {
            this.f50402b0 = false;
            C11434o.m51097a().mo44452a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        synchronized (this.f50408e0) {
            Iterator<String> it = this.f50408e0.iterator();
            while (it.hasNext()) {
                C11508z.m51348a().mo44589a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.f50408e0.clear();
        }
        synchronized (this.f50410f0) {
            Iterator<String> it2 = this.f50410f0.iterator();
            while (it2.hasNext()) {
                C11262W.m50363a().mo43932a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f50410f0.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo43766f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.f50379G) {
                this.f50415i.log(ironSourceTag, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                C11262W.m50363a().mo43933b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            C11405k0 k0Var = this.f50416i0;
            if (k0Var == null) {
                this.f50415i.log(ironSourceTag, "Rewarded video was not initiated", 3);
                C11262W.m50363a().mo43933b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
                return;
            } else if (!k0Var.f51287a.containsKey(str)) {
                C11405k0.m51038c(IronSourceConstants.RV_INSTANCE_NOT_FOUND, str);
                C11262W.m50363a().mo43933b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                C11480u uVar = k0Var.f51287a.get(str);
                k0Var.mo44343a((int) IronSourceConstants.RV_INSTANCE_SHOW, uVar);
                uVar.mo44534a();
                return;
            }
        } catch (Exception e) {
            this.f50415i.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            C11262W.m50363a().mo43933b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r3.mo44137b() != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r3.mo44024e() != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049 A[Catch:{ all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[Catch:{ all -> 0x006d }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43767g() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f50380H     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f50415i     // Catch:{ all -> 0x0072 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x0013:
            boolean r3 = r9.f50398Z     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0034
            boolean r3 = r9.f50400a0     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f50392T     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.mo44137b()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
        L_0x0025:
            r3 = 1
            goto L_0x003f
        L_0x0027:
            r3 = 0
            goto L_0x003f
        L_0x0029:
            com.ironsource.mediationsdk.e0 r3 = r9.f50390R     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.mo44250e()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0025
        L_0x0034:
            com.ironsource.mediationsdk.a0 r3 = r9.f50409f     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.mo44024e()     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0027
            goto L_0x0025
        L_0x003f:
            boolean r4 = r9.f50398Z     // Catch:{ all -> 0x006d }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.adunit.a.a r5 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x004c
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x004e
        L_0x004c:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x004e:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x006d }
            r4.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r5)     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f50415i     // Catch:{ all -> 0x006d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r6.<init>(r0)     // Catch:{ all -> 0x006d }
            r6.append(r3)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006d }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x006d }
            r2 = r3
            goto L_0x008e
        L_0x006d:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0074
        L_0x0072:
            r3 = move-exception
            r4 = 0
        L_0x0074:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f50415i
            java.lang.String r1 = "isInterstitialReady()"
            r0.logException(r6, r1, r3)
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43767g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[DONT_GENERATE] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo43768g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.k0 r0 = r4.f50416i0     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.u> r2 = r0.f51287a     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C11405k0.m51038c(r0, r5)     // Catch:{ all -> 0x0038 }
        L_0x0014:
            r5 = 0
            goto L_0x0032
        L_0x0016:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.u> r0 = r0.f51287a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.u r5 = (com.ironsource.mediationsdk.C11480u) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.mo44536b()     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C11405k0.m51037b(r0, r5, r2)     // Catch:{ all -> 0x0038 }
            r5 = 1
            goto L_0x0032
        L_0x002c:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C11405k0.m51037b(r0, r5, r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            monitor-exit(r4)
            return r3
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x003c
        L_0x003b:
            throw r5
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43768g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0061;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43769h(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r3 = r6.f50380H     // Catch:{ Exception -> 0x008e }
            if (r3 == 0) goto L_0x0034
            java.lang.String r7 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f50415i     // Catch:{ Exception -> 0x008e }
            r4 = 3
            r3.log(r2, r7, r4)     // Catch:{ Exception -> 0x008e }
            com.ironsource.mediationsdk.sdk.j r2 = r6.f50421l     // Catch:{ Exception -> 0x008e }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x008e }
            r3.<init>(r1, r7)     // Catch:{ Exception -> 0x008e }
            r2.onInterstitialAdShowFailed(r3)     // Catch:{ Exception -> 0x008e }
            return
        L_0x0034:
            boolean r2 = r6.mo43743F()     // Catch:{ Exception -> 0x008e }
            if (r2 != 0) goto L_0x0048
            com.ironsource.mediationsdk.sdk.j r7 = r6.f50421l     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r3 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r3)     // Catch:{ Exception -> 0x008e }
            r7.onInterstitialAdShowFailed(r2)     // Catch:{ Exception -> 0x008e }
            return
        L_0x0048:
            boolean r2 = r6.f50398Z     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x0050
            r6.m50099W(r7)     // Catch:{ Exception -> 0x008e }
            return
        L_0x0050:
            com.ironsource.mediationsdk.model.InterstitialPlacement r2 = r6.m50100X(r7)     // Catch:{ Exception -> 0x008e }
            r3 = 0
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch:{ Exception -> 0x008e }
            java.lang.String r4 = "placement"
            if (r2 == 0) goto L_0x0065
            java.lang.String r7 = r2.getPlacementName()     // Catch:{ JSONException -> 0x006c }
        L_0x0061:
            r3.put(r4, r7)     // Catch:{ JSONException -> 0x006c }
            goto L_0x0070
        L_0x0065:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x006c }
            if (r5 != 0) goto L_0x0070
            goto L_0x0061
        L_0x006c:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ Exception -> 0x008e }
        L_0x0070:
            com.ironsource.mediationsdk.adunit.a.a r7 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ Exception -> 0x008e }
            r4 = 2100(0x834, float:2.943E-42)
            r7.<init>(r4, r3)     // Catch:{ Exception -> 0x008e }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ Exception -> 0x008e }
            r3.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r7)     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x008d
            com.ironsource.mediationsdk.a0 r7 = r6.f50409f     // Catch:{ Exception -> 0x008e }
            r7.mo44028p(r2)     // Catch:{ Exception -> 0x008e }
            com.ironsource.mediationsdk.a0 r7 = r6.f50409f     // Catch:{ Exception -> 0x008e }
            r2.getPlacementName()     // Catch:{ Exception -> 0x008e }
            r7.mo44021d()     // Catch:{ Exception -> 0x008e }
        L_0x008d:
            return
        L_0x008e:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f50415i
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.logException(r3, r0, r7)
            com.ironsource.mediationsdk.sdk.j r0 = r6.f50421l
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r7 = r7.getMessage()
            r2.<init>(r1, r7)
            r0.onInterstitialAdShowFailed(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43769h(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo43770i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.j0 r0 = r4.f50414h0     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.s> r2 = r0.f51262a     // Catch:{ all -> 0x0038 }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x0038 }
            r3 = 1
            if (r2 != 0) goto L_0x0016
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C11401j0.m50997c(r0, r5)     // Catch:{ all -> 0x0038 }
        L_0x0014:
            r5 = 0
            goto L_0x0032
        L_0x0016:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.s> r0 = r0.f51262a     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0038 }
            com.ironsource.mediationsdk.s r5 = (com.ironsource.mediationsdk.C11439s) r5     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.mo44471b()     // Catch:{ all -> 0x0038 }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C11401j0.m50996b(r0, r5, r2)     // Catch:{ all -> 0x0038 }
            r5 = 1
            goto L_0x0032
        L_0x002c:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C11401j0.m50996b(r0, r5, r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            monitor-exit(r4)
            return r3
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x003c
        L_0x003b:
            throw r5
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43770i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final void mo43771j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (!mo43744G()) {
                this.f50421l.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C11425k a = this.f50430t.f51666c.f51379c.mo44435a(str);
            if (a == null) {
                this.f50415i.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f50430t.f51666c.f51379c.mo44434a();
                if (a == null) {
                    this.f50415i.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f50411g.mo44234a(a.f51397b);
        } catch (Exception e) {
            this.f50415i.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f50421l.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* renamed from: j */
    public final boolean mo43772j() {
        try {
            C11371d0 d0Var = this.f50411g;
            if (d0Var != null) {
                return d0Var.mo44237a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final InterstitialPlacement mo43773k(String str) {
        try {
            InterstitialPlacement T = m50096T(str);
            if (T == null) {
                try {
                    this.f50415i.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    T = mo43742E();
                } catch (Exception unused) {
                    return T;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + T, 1);
            return T;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02d1, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02af  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.C11495k mo43774k(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.C11232E.C11233a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f50429s
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.k r1 = r10.f50430t     // Catch:{ all -> 0x02d2 }
            if (r1 == 0) goto L_0x000e
            com.ironsource.mediationsdk.utils.k r11 = new com.ironsource.mediationsdk.utils.k     // Catch:{ all -> 0x02d2 }
            r11.<init>(r1)     // Catch:{ all -> 0x02d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x02d2 }
            return r11
        L_0x000e:
            com.ironsource.mediationsdk.utils.k r13 = r10.m50085A(r11, r12, r13)     // Catch:{ all -> 0x02d2 }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001c
            boolean r3 = r13.mo44559a()     // Catch:{ all -> 0x02d2 }
            if (r3 != 0) goto L_0x0066
        L_0x001c:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.utils.k r13 = r10.m50119j(r11, r12)     // Catch:{ all -> 0x02d2 }
            if (r13 == 0) goto L_0x0066
            java.lang.String r4 = r10.f50417j     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r4, r12)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r10.f50415i     // Catch:{ all -> 0x02d2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d2 }
            r5.<init>()     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02d2 }
            r5.append(r12)     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02d2 }
            r5.append(r12)     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x02d2 }
            r4.log(r3, r12, r1)     // Catch:{ all -> 0x02d2 }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.adunit.a.a r3 = new com.ironsource.mediationsdk.adunit.a.a     // Catch:{ all -> 0x02d2 }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            r12.mo43979b((com.ironsource.mediationsdk.adunit.p277a.C11308a) r3)     // Catch:{ all -> 0x02d2 }
        L_0x0066:
            if (r13 == 0) goto L_0x02d0
            r10.f50430t = r13     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.utils.k r12 = r10.f50430t     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.logger.b r3 = r10.f50427q     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.h r4 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r4 = r4.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.e r4 = r4.mo44984a()     // Catch:{ all -> 0x02d2 }
            int r4 = r4.f51366a     // Catch:{ all -> 0x02d2 }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f50415i     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.h r5 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r5 = r5.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.e r5 = r5.mo44984a()     // Catch:{ all -> 0x02d2 }
            int r5 = r5.f51367b     // Catch:{ all -> 0x02d2 }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x02d2 }
            boolean r3 = r10.mo43741D()     // Catch:{ all -> 0x02d2 }
            if (r3 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.model.h r3 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.p r3 = r3.f51377a     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r3 = r3.f51425b     // Catch:{ all -> 0x02d2 }
            boolean r3 = r3.f51354b     // Catch:{ all -> 0x02d2 }
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            boolean r4 = r10.mo43743F()     // Catch:{ all -> 0x02d2 }
            if (r4 == 0) goto L_0x00b2
            com.ironsource.mediationsdk.model.h r4 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.i r4 = r4.f51378b     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r4 = r4.f51383b     // Catch:{ all -> 0x02d2 }
            boolean r4 = r4.f51354b     // Catch:{ all -> 0x02d2 }
            goto L_0x00b3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r10.m50113e()     // Catch:{ all -> 0x02d2 }
            if (r5 == 0) goto L_0x00c2
            com.ironsource.mediationsdk.model.h r5 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.f r5 = r5.f51380d     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r5 = r5.f51369a     // Catch:{ all -> 0x02d2 }
            boolean r5 = r5.f51354b     // Catch:{ all -> 0x02d2 }
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            boolean r6 = r10.mo43744G()     // Catch:{ all -> 0x02d2 }
            if (r6 == 0) goto L_0x00d2
            com.ironsource.mediationsdk.model.h r6 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.j r6 = r6.f51379c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r6 = r6.f51394c     // Catch:{ all -> 0x02d2 }
            boolean r6 = r6.f51354b     // Catch:{ all -> 0x02d2 }
            goto L_0x00d3
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            com.ironsource.mediationsdk.model.h r7 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r7 = r7.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.utils.j r7 = r7.mo44991h()     // Catch:{ all -> 0x02d2 }
            boolean r8 = r7.f51603a     // Catch:{ all -> 0x02d2 }
            if (r3 == 0) goto L_0x014e
            com.ironsource.mediationsdk.model.h r3 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.p r3 = r3.f51377a     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r3 = r3.f51425b     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r9 = r3.f51357e     // Catch:{ all -> 0x02d2 }
            r6.mo43980b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r9 = r3.f51356d     // Catch:{ all -> 0x02d2 }
            r6.mo43975a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51359g     // Catch:{ all -> 0x02d2 }
            r6.mo43978b((int) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51360h     // Catch:{ all -> 0x02d2 }
            r6.mo43984c(r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51358f     // Catch:{ all -> 0x02d2 }
            r6.mo43972a((int) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51361i     // Catch:{ all -> 0x02d2 }
            r6.mo43977a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51362j     // Catch:{ all -> 0x02d2 }
            r6.mo43982b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51363k     // Catch:{ all -> 0x02d2 }
            r6.mo43985c(r9, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51364l     // Catch:{ all -> 0x02d2 }
            r6.mo43987d(r9, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.h r9 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r9 = r9.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.q r9 = r9.mo44985b()     // Catch:{ all -> 0x02d2 }
            r6.mo43974a((com.ironsource.mediationsdk.model.C11432q) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            boolean r3 = r3.f51355c     // Catch:{ all -> 0x02d2 }
        L_0x014b:
            r6.f50673c = r3     // Catch:{ all -> 0x02d2 }
            goto L_0x01c3
        L_0x014e:
            if (r6 == 0) goto L_0x01bd
            com.ironsource.mediationsdk.model.h r3 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.j r3 = r3.f51379c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r3 = r3.f51394c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r9 = r3.f51357e     // Catch:{ all -> 0x02d2 }
            r6.mo43980b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r9 = r3.f51356d     // Catch:{ all -> 0x02d2 }
            r6.mo43975a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51359g     // Catch:{ all -> 0x02d2 }
            r6.mo43978b((int) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51360h     // Catch:{ all -> 0x02d2 }
            r6.mo43984c(r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int r9 = r3.f51358f     // Catch:{ all -> 0x02d2 }
            r6.mo43972a((int) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51361i     // Catch:{ all -> 0x02d2 }
            r6.mo43977a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51362j     // Catch:{ all -> 0x02d2 }
            r6.mo43982b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51363k     // Catch:{ all -> 0x02d2 }
            r6.mo43985c(r9, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            int[] r9 = r3.f51364l     // Catch:{ all -> 0x02d2 }
            r6.mo43987d(r9, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.h r9 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r9 = r9.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.q r9 = r9.mo44985b()     // Catch:{ all -> 0x02d2 }
            r6.mo43974a((com.ironsource.mediationsdk.model.C11432q) r9)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            boolean r3 = r3.f51355c     // Catch:{ all -> 0x02d2 }
            goto L_0x014b
        L_0x01bd:
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            r3.f50676f = r2     // Catch:{ all -> 0x02d2 }
        L_0x01c3:
            if (r4 == 0) goto L_0x0234
            com.ironsource.mediationsdk.model.h r2 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.i r2 = r2.f51378b     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r2 = r2.f51383b     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = r2.f51357e     // Catch:{ all -> 0x02d2 }
            r3.mo43980b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = r2.f51356d     // Catch:{ all -> 0x02d2 }
            r3.mo43975a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51359g     // Catch:{ all -> 0x02d2 }
            r3.mo43978b((int) r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51360h     // Catch:{ all -> 0x02d2 }
            r3.mo43984c(r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51358f     // Catch:{ all -> 0x02d2 }
            r3.mo43972a((int) r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51361i     // Catch:{ all -> 0x02d2 }
            r3.mo43977a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51362j     // Catch:{ all -> 0x02d2 }
            r3.mo43982b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51363k     // Catch:{ all -> 0x02d2 }
            r3.mo43985c(r4, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51364l     // Catch:{ all -> 0x02d2 }
            r3.mo43987d(r4, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.h r12 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r12 = r12.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.q r12 = r12.mo44985b()     // Catch:{ all -> 0x02d2 }
            r3.mo43974a((com.ironsource.mediationsdk.model.C11432q) r12)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            boolean r2 = r2.f51355c     // Catch:{ all -> 0x02d2 }
        L_0x0231:
            r12.f50673c = r2     // Catch:{ all -> 0x02d2 }
            goto L_0x02a9
        L_0x0234:
            if (r5 == 0) goto L_0x02a3
            com.ironsource.mediationsdk.model.h r2 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.f r2 = r2.f51380d     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.c r2 = r2.f51369a     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = r2.f51357e     // Catch:{ all -> 0x02d2 }
            r3.mo43980b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = r2.f51356d     // Catch:{ all -> 0x02d2 }
            r3.mo43975a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51359g     // Catch:{ all -> 0x02d2 }
            r3.mo43978b((int) r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51360h     // Catch:{ all -> 0x02d2 }
            r3.mo43984c(r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int r4 = r2.f51358f     // Catch:{ all -> 0x02d2 }
            r3.mo43972a((int) r4)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51361i     // Catch:{ all -> 0x02d2 }
            r3.mo43977a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51362j     // Catch:{ all -> 0x02d2 }
            r3.mo43982b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51363k     // Catch:{ all -> 0x02d2 }
            r3.mo43985c(r4, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            int[] r4 = r2.f51364l     // Catch:{ all -> 0x02d2 }
            r3.mo43987d(r4, r11)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.h r12 = r12.f51666c     // Catch:{ all -> 0x02d2 }
            com.ironsource.sdk.f.a r12 = r12.f51381e     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.model.q r12 = r12.mo44985b()     // Catch:{ all -> 0x02d2 }
            r3.mo43974a((com.ironsource.mediationsdk.model.C11432q) r12)     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            boolean r2 = r2.f51355c     // Catch:{ all -> 0x02d2 }
            goto L_0x0231
        L_0x02a3:
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            r12.f50676f = r2     // Catch:{ all -> 0x02d2 }
        L_0x02a9:
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p276a.C11295g.f50727v     // Catch:{ all -> 0x02d2 }
            r12.f50676f = r8     // Catch:{ all -> 0x02d2 }
            if (r8 == 0) goto L_0x02c2
            java.lang.String r2 = r7.f51604b     // Catch:{ all -> 0x02d2 }
            r12.mo43975a((java.lang.String) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            int[] r2 = r7.f51606d     // Catch:{ all -> 0x02d2 }
            r12.mo43977a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            int[] r2 = r7.f51607e     // Catch:{ all -> 0x02d2 }
            r12.mo43982b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x02d2 }
            boolean r11 = r7.f51605c     // Catch:{ all -> 0x02d2 }
            r12.f50673c = r11     // Catch:{ all -> 0x02d2 }
        L_0x02c2:
            com.ironsource.mediationsdk.a.d r11 = com.ironsource.mediationsdk.p276a.C11292d.m50446e()     // Catch:{ all -> 0x02d2 }
            r11.f50671a = r1     // Catch:{ all -> 0x02d2 }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p276a.C11296h.m50466e()     // Catch:{ all -> 0x02d2 }
            r11.f50671a = r1     // Catch:{ all -> 0x02d2 }
            r12.f50671a = r1     // Catch:{ all -> 0x02d2 }
        L_0x02d0:
            monitor-exit(r0)     // Catch:{ all -> 0x02d2 }
            return r13
        L_0x02d2:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02d2 }
            goto L_0x02d6
        L_0x02d5:
            throw r11
        L_0x02d6:
            goto L_0x02d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43774k(android.content.Context, java.lang.String, com.ironsource.mediationsdk.E$a):com.ironsource.mediationsdk.utils.k");
    }

    /* renamed from: k */
    public final String mo43775k() {
        return this.f50417j;
    }

    /* renamed from: l */
    public final Placement mo43776l(String str) {
        try {
            Placement N = m50090N(str);
            if (N == null) {
                try {
                    this.f50415i.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    N = mo43781z();
                } catch (Exception unused) {
                    return N;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + N, 1);
            return N;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43777l() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            m50121m(r0, r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = ""
            r0.info(r2)
            com.ironsource.mediationsdk.utils.k r0 = r8.f50430t
            if (r0 != 0) goto L_0x001b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00e2
        L_0x001b:
            com.ironsource.mediationsdk.model.o r0 = r0.f51663b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.mo44442a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00e2
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C11369d.m50788a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 1
            r6 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.mo44228a(r0, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00c1 }
        L_0x003e:
            com.ironsource.mediationsdk.utils.k r0 = r8.f50430t     // Catch:{ Exception -> 0x00c1 }
            com.ironsource.mediationsdk.model.h r0 = r0.f51666c     // Catch:{ Exception -> 0x00c1 }
            com.ironsource.sdk.f.a r0 = r0.f51381e     // Catch:{ Exception -> 0x00c1 }
            com.ironsource.mediationsdk.utils.o r0 = r0.mo44986c()     // Catch:{ Exception -> 0x00c1 }
            boolean r3 = r0.f51747c     // Catch:{ Exception -> 0x00c1 }
            if (r3 == 0) goto L_0x0056
            com.ironsource.environment.e.b r2 = new com.ironsource.environment.e.b     // Catch:{ Exception -> 0x00c1 }
            r2.<init>()     // Catch:{ Exception -> 0x00c1 }
            org.json.JSONObject r2 = r2.mo20588a()     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0062
        L_0x0056:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ Exception -> 0x00c1 }
            org.json.JSONObject r4 = r0.f51746b     // Catch:{ Exception -> 0x00c1 }
            java.util.ArrayList<java.lang.String> r5 = r0.f51745a     // Catch:{ Exception -> 0x00c1 }
            org.json.JSONObject r2 = r3.mo44257h(r2, r4, r5)     // Catch:{ Exception -> 0x00c1 }
        L_0x0062:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00c1 }
            r4.append(r2)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c1 }
            r3.info(r4)     // Catch:{ Exception -> 0x00c1 }
            if (r2 == 0) goto L_0x00e2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00c1 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00c1 }
            r4.append(r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c1 }
            r3.info(r4)     // Catch:{ Exception -> 0x00c1 }
            boolean r0 = r0.f51748d     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00a4
        L_0x009d:
            com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r0 = com.ironsource.mediationsdk.C11377f.m50867l(r2)     // Catch:{ Exception -> 0x00c1 }
        L_0x00a4:
            if (r0 == 0) goto L_0x00e3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            java.lang.String r4 = "biddingData length: "
            r2.<init>(r4)     // Catch:{ Exception -> 0x00bc }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00bc }
            r2.append(r4)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bc }
            r3.info(r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00e3
        L_0x00bc:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00c3
        L_0x00c1:
            r0 = move-exception
            r2 = r1
        L_0x00c3:
            r3 = 83007(0x1443f, float:1.16318E-40)
            m50121m(r3, r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00e3
        L_0x00e2:
            r0 = r1
        L_0x00e3:
            if (r0 != 0) goto L_0x00eb
            r2 = 83006(0x1443e, float:1.16316E-40)
            m50121m(r2, r1)
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11232E.mo43777l():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo43778n(AbstractAdapter abstractAdapter) {
        this.f50405d = abstractAdapter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo43779s(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.f50419k = str;
        if (z) {
            C11296h.m50466e().mo43979b(new C11308a(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final synchronized AbstractAdapter mo43780y(String str) {
        try {
            AbstractAdapter abstractAdapter = this.f50405d;
            if (abstractAdapter != null && abstractAdapter.getProviderName().equals(str)) {
                return this.f50405d;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f50415i;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Placement mo43781z() {
        C11431p pVar = this.f50430t.f51666c.f51377a;
        if (pVar != null) {
            return pVar.mo44446a();
        }
        return null;
    }
}
