package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p039v3.api.AdError;
import com.google.ads.interactivemedia.p039v3.api.AdEvent;
import com.google.ads.interactivemedia.p039v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p039v3.impl.data.C3779as;
import com.google.ads.interactivemedia.p039v3.impl.data.C3781au;
import com.google.ads.interactivemedia.p039v3.impl.data.C3788ba;
import com.google.ads.interactivemedia.p039v3.impl.data.C3803c;
import com.google.ads.interactivemedia.p039v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.p039v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ee */
/* compiled from: IMASDK */
public final class C3958ee implements C3962ei, C3963ej {

    /* renamed from: a */
    private final Map<String, C3952dz> f16964a = new HashMap();

    /* renamed from: b */
    private final Set<String> f16965b = new HashSet();

    /* renamed from: c */
    private final Map<String, BaseDisplayContainer> f16966c = new HashMap();

    /* renamed from: d */
    private final Map<String, C3954ea> f16967d = new HashMap();

    /* renamed from: e */
    private final Map<String, C3956ec> f16968e = new HashMap();

    /* renamed from: f */
    private final Map<String, C3983fc> f16969f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f16970g;

    /* renamed from: h */
    private final String f16971h;

    /* renamed from: i */
    private final C3964ek f16972i;

    /* renamed from: j */
    private final Queue<C3949dw> f16973j = new ConcurrentLinkedQueue();

    /* renamed from: k */
    private final TestingConfiguration f16974k;

    /* renamed from: l */
    private final aqv<C3997fq> f16975l;

    /* renamed from: m */
    private final aqv<C3788ba> f16976m;

    /* renamed from: n */
    private C3971er f16977n;

    /* renamed from: o */
    private C3957ed f16978o;

    /* renamed from: p */
    private long f16979p;

    /* renamed from: q */
    private boolean f16980q;

    public C3958ee(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration) {
        aqv<C3997fq> aqv = new aqv<>();
        this.f16975l = aqv;
        aqv<C3788ba> aqv2 = new aqv<>();
        this.f16976m = aqv2;
        this.f16980q = false;
        this.f16970g = context;
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.23.0").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", C3839aj.m13820b()).appendQueryParameter("app", context.getApplicationContext().getPackageName());
        if (testingConfiguration != null) {
            beu beu = new beu();
            beu.mo14976c(new arl());
            beu.mo14977d(new arq());
            appendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, beu.mo14974a().mo14968e(testingConfiguration));
        }
        this.f16971h = appendQueryParameter.build().toString();
        this.f16972i = new C3964ek(new Handler(Looper.getMainLooper()), new WebView(context), this);
        this.f16974k = testingConfiguration;
        arh.m14597d(Arrays.asList(new aqs[]{aqv2.mo14230a(), aqv.mo14230a()})).mo14225h(new C3950dx(this));
    }

    /* renamed from: s */
    private final void m17016s(C3947du duVar, C3948dv dvVar, String str, C3788ba baVar) {
        C3983fc fcVar = this.f16969f.get(str);
        if (fcVar == null) {
            String valueOf = String.valueOf(duVar);
            String valueOf2 = String.valueOf(dvVar);
            int length = valueOf.length();
            StringBuilder sb = new StringBuilder(length + 44 + valueOf2.length() + String.valueOf(str).length());
            sb.append("Received ");
            sb.append(valueOf);
            sb.append(" message: ");
            sb.append(valueOf2);
            sb.append(" for invalid session id: ");
            sb.append(str);
            C4257pg.m18526e(sb.toString());
            return;
        }
        fcVar.mo15734d(duVar, dvVar, baVar);
    }

    /* renamed from: t */
    private static String m17017t(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + str2.length());
        sb.append(str);
        sb.append(" Caused by: ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: u */
    private static final void m17018u(String str, C3948dv dvVar) {
        String valueOf = String.valueOf(dvVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 43 + String.valueOf(str).length());
        sb.append("Illegal message type ");
        sb.append(valueOf);
        sb.append(" received for ");
        sb.append(str);
        sb.append(" channel");
        C4257pg.m18525d(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15703a(C3997fq fqVar) {
        this.f16975l.mo14232c(fqVar);
    }

    /* renamed from: b */
    public final void mo15704b() {
        this.f16979p = SystemClock.elapsedRealtime();
        this.f16972i.mo15727b(this.f16971h);
    }

    /* renamed from: c */
    public final WebView mo15705c() {
        return this.f16972i.mo15726a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final TestingConfiguration mo15706d() {
        return this.f16974k;
    }

    /* renamed from: e */
    public final void mo15707e(C3949dw dwVar) {
        C3803c cVar;
        Map<String, CompanionData> map;
        C3934dh dhVar;
        C3937dk dkVar;
        String str;
        String str2;
        String str3;
        C3788ba baVar = (C3788ba) dwVar.mo15692d();
        String e = dwVar.mo15693e();
        C3948dv c = dwVar.mo15691c();
        String name = dwVar.mo15690b().name();
        String name2 = c.name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + String.valueOf(name2).length());
        sb.append("Received js message: ");
        sb.append(name);
        sb.append(" [");
        sb.append(name2);
        sb.append("]");
        C4257pg.m18525d(sb.toString());
        C3779as asVar = C3779as.Html;
        int i = 1;
        switch (dwVar.mo15690b().ordinal()) {
            case 0:
                if (!this.f16965b.contains(e)) {
                    C3952dz dzVar = this.f16964a.get(e);
                    if (dzVar == null) {
                        String valueOf = String.valueOf(c);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(e).length());
                        sb2.append("Received monitor message: ");
                        sb2.append(valueOf);
                        sb2.append(" for invalid session id: ");
                        sb2.append(e);
                        C4257pg.m18526e(sb2.toString());
                        return;
                    } else if (baVar == null) {
                        String valueOf2 = String.valueOf(c);
                        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 56 + String.valueOf(e).length());
                        sb3.append("Received monitor message: ");
                        sb3.append(valueOf2);
                        sb3.append(" for session id: ");
                        sb3.append(e);
                        sb3.append(" with no data");
                        C4257pg.m18526e(sb3.toString());
                        return;
                    } else if (c.ordinal() != 36) {
                        m17018u(C3947du.activityMonitor.toString(), c);
                        return;
                    } else {
                        dzVar.mo15624g(baVar.queryId, baVar.eventId);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                C3954ea eaVar = this.f16967d.get(e);
                if (eaVar == null) {
                    String valueOf3 = String.valueOf(c);
                    StringBuilder sb4 = new StringBuilder(valueOf3.length() + 51 + String.valueOf(e).length());
                    sb4.append("Received request message: ");
                    sb4.append(valueOf3);
                    sb4.append(" for invalid session id: ");
                    sb4.append(e);
                    C4257pg.m18528g(sb4.toString());
                    return;
                }
                int ordinal = c.ordinal();
                if (ordinal != 11) {
                    if (ordinal == 30) {
                        eaVar.mo15634c(e, AdError.AdErrorType.LOAD, baVar.errorCode, m17017t(baVar.errorMessage, baVar.innerError));
                        return;
                    } else if (ordinal != 67) {
                        m17018u(C3947du.adsLoader.toString(), c);
                        return;
                    } else {
                        eaVar.mo15633b(e, baVar.streamId, baVar.monitorAppLifecycle);
                        String valueOf4 = String.valueOf(baVar.streamId);
                        C4257pg.m18525d(valueOf4.length() != 0 ? "Stream initialized with streamId: ".concat(valueOf4) : new String("Stream initialized with streamId: "));
                        return;
                    }
                } else if (baVar == null) {
                    eaVar.mo15635d(e, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR);
                    return;
                } else {
                    eaVar.mo15632a(e, baVar.adCuePoints, baVar.internalCuePoints, baVar.monitorAppLifecycle);
                    return;
                }
            case 2:
                C3956ec ecVar = this.f16968e.get(e);
                if (ecVar == null) {
                    String valueOf5 = String.valueOf(c);
                    StringBuilder sb5 = new StringBuilder(valueOf5.length() + 51 + String.valueOf(e).length());
                    sb5.append("Received manager message: ");
                    sb5.append(valueOf5);
                    sb5.append(" for invalid session id: ");
                    sb5.append(e);
                    C4257pg.m18526e(sb5.toString());
                    return;
                }
                if (baVar == null || (cVar = baVar.adData) == null) {
                    cVar = null;
                }
                int ordinal2 = c.ordinal();
                if (ordinal2 == 12) {
                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.ALL_ADS_COMPLETED, (C3803c) null));
                    return;
                } else if (ordinal2 == 16) {
                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.CLICKED, cVar));
                    return;
                } else if (ordinal2 == 18) {
                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.COMPLETED, cVar));
                    return;
                } else if (ordinal2 == 24) {
                    C3955eb ebVar = new C3955eb(AdEvent.AdEventType.CUEPOINTS_CHANGED, (C3803c) null);
                    ebVar.f16961d = new ArrayList();
                    for (C3781au next : baVar.cuepoints) {
                        ebVar.f16961d.add(new C3939dm(next.start(), next.end(), next.played()));
                    }
                    ecVar.mo15645b(ebVar);
                    return;
                } else if (ordinal2 != 43) {
                    if (ordinal2 == 51) {
                        ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.PAUSED, cVar));
                        return;
                    } else if (ordinal2 == 60) {
                        ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.RESUMED, cVar));
                        return;
                    } else if (ordinal2 == 68) {
                        ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.THIRD_QUARTILE, cVar));
                        return;
                    } else if (ordinal2 == 76) {
                        return;
                    } else {
                        if (ordinal2 == 20) {
                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, (C3803c) null));
                            return;
                        } else if (ordinal2 == 21) {
                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, (C3803c) null));
                            return;
                        } else if (ordinal2 == 30) {
                            ecVar.mo15672i(AdError.AdErrorType.PLAY, baVar.errorCode, m17017t(baVar.errorMessage, baVar.innerError));
                            return;
                        } else if (ordinal2 == 31) {
                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.FIRST_QUARTILE, cVar));
                            return;
                        } else if (ordinal2 == 38) {
                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, (C3803c) null));
                            return;
                        } else if (ordinal2 != 39) {
                            switch (ordinal2) {
                                case 1:
                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.AD_BREAK_ENDED, cVar));
                                    return;
                                case 2:
                                    C3955eb ebVar2 = new C3955eb(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, (C3803c) null);
                                    ebVar2.f16960c = aue.m14839k(baVar.adBreakTime);
                                    ecVar.mo15645b(ebVar2);
                                    return;
                                case 3:
                                    C3955eb ebVar3 = new C3955eb(AdEvent.AdEventType.AD_BREAK_READY, (C3803c) null);
                                    ebVar3.f16960c = aue.m14839k(baVar.adBreakTime);
                                    ecVar.mo15645b(ebVar3);
                                    return;
                                case 4:
                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.AD_BREAK_STARTED, cVar));
                                    return;
                                case 5:
                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.AD_BUFFERING, (C3803c) null));
                                    return;
                                case 6:
                                case 7:
                                    return;
                                case 8:
                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.AD_PERIOD_ENDED, (C3803c) null));
                                    return;
                                case 9:
                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.AD_PERIOD_STARTED, (C3803c) null));
                                    return;
                                case 10:
                                    C3955eb ebVar4 = new C3955eb(AdEvent.AdEventType.AD_PROGRESS, cVar);
                                    ebVar4.f16962e = new C3913cn(baVar.currentTime, baVar.duration, baVar.adPosition, baVar.totalAds, baVar.adBreakDuration, baVar.adPeriodDuration);
                                    ecVar.mo15645b(ebVar4);
                                    return;
                                default:
                                    switch (ordinal2) {
                                        case 45:
                                            C3955eb ebVar5 = new C3955eb(AdEvent.AdEventType.LOG, cVar);
                                            ebVar5.f16960c = baVar.logData.constructMap();
                                            ecVar.mo15645b(ebVar5);
                                            return;
                                        case 46:
                                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.MIDPOINT, cVar));
                                            return;
                                        case 47:
                                            return;
                                        case 48:
                                            mo15718p(baVar.url);
                                            return;
                                        default:
                                            switch (ordinal2) {
                                                case 62:
                                                    C3955eb ebVar6 = new C3955eb(AdEvent.AdEventType.SKIPPED, (C3803c) null);
                                                    ebVar6.f16963f = baVar.seekTime;
                                                    ecVar.mo15645b(ebVar6);
                                                    return;
                                                case 63:
                                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, cVar));
                                                    return;
                                                case 64:
                                                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.STARTED, cVar));
                                                    return;
                                                default:
                                                    switch (ordinal2) {
                                                        case 72:
                                                            return;
                                                        case 73:
                                                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.TAPPED, cVar));
                                                            return;
                                                        case 74:
                                                            ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.ICON_TAPPED, (C3803c) null));
                                                            return;
                                                        default:
                                                            m17018u(C3947du.adsManager.toString(), c);
                                                            return;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            return;
                        }
                    }
                } else if (cVar != null) {
                    ecVar.mo15645b(new C3955eb(AdEvent.AdEventType.LOADED, cVar));
                    return;
                } else {
                    C4257pg.m18528g("Ad loaded message requires adData");
                    ecVar.mo15673j(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                    return;
                }
            case 4:
                C3932df dfVar = (C3932df) this.f16966c.get(e);
                C3956ec ecVar2 = this.f16968e.get(e);
                C3983fc fcVar = this.f16969f.get(e);
                if (dfVar == null || ecVar2 == null || fcVar == null) {
                    String valueOf6 = String.valueOf(c);
                    StringBuilder sb6 = new StringBuilder(valueOf6.length() + 60 + String.valueOf(e).length());
                    sb6.append("Received displayContainer message: ");
                    sb6.append(valueOf6);
                    sb6.append(" for invalid session id: ");
                    sb6.append(e);
                    C4257pg.m18528g(sb6.toString());
                    return;
                }
                int ordinal3 = c.ordinal();
                if (ordinal3 != 27) {
                    if (ordinal3 != 37 && ordinal3 != 61) {
                        if (ordinal3 == 58) {
                            ecVar2.mo15666c(baVar.resizeAndPositionVideo);
                            return;
                        } else if (ordinal3 != 59) {
                            m17018u(C3947du.displayContainer.toString(), c);
                            return;
                        } else {
                            ecVar2.mo15667d();
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (baVar == null || (map = baVar.companions) == null) {
                    ecVar2.mo15673j(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
                    return;
                } else {
                    Set<String> keySet = map.keySet();
                    HashMap i2 = avr.m14967i(keySet.size());
                    for (String next2 : keySet) {
                        CompanionAdSlot companionAdSlot = dfVar.mo15663a().get(next2);
                        if (companionAdSlot.getContainer() != null) {
                            i2.put(next2, companionAdSlot.getContainer());
                        } else {
                            ecVar2.mo15673j(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
                        }
                    }
                    for (String str4 : i2.keySet()) {
                        ViewGroup viewGroup = (ViewGroup) i2.get(str4);
                        CompanionData companionData = baVar.companions.get(str4);
                        viewGroup.removeAllViews();
                        C3934dh dhVar2 = (C3934dh) dfVar.mo15663a().get(str4);
                        List<CompanionAdSlot.ClickListener> b = dhVar2.mo15677b();
                        int ordinal4 = companionData.type().ordinal();
                        if (ordinal4 != 0) {
                            if (ordinal4 == i) {
                                C3945ds dsVar = r0;
                                dhVar = dhVar2;
                                C3945ds dsVar2 = new C3945ds(viewGroup.getContext(), this, companionData, e, b);
                                new C3943dq(dsVar).execute(new Void[0]);
                                dkVar = dsVar;
                            } else if (ordinal4 != 2) {
                                dhVar = dhVar2;
                                dkVar = null;
                            }
                            dkVar.setTag(e);
                            dhVar.mo15676a(e);
                            viewGroup.addView(dkVar);
                            i = 1;
                        }
                        dhVar = dhVar2;
                        dkVar = new C3937dk(viewGroup.getContext(), this, companionData, b);
                        dkVar.setTag(e);
                        dhVar.mo15676a(e);
                        viewGroup.addView(dkVar);
                        i = 1;
                    }
                    return;
                }
            case 5:
            case 11:
                int ordinal5 = c.ordinal();
                if (ordinal5 == 41) {
                    this.f16976m.mo14232c(baVar);
                    this.f16980q = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.f16979p;
                    HashMap i3 = avr.m14967i(1);
                    i3.put("webViewLoadingTime", Long.valueOf(elapsedRealtime - j));
                    mo15717o(new C3949dw(C3947du.webViewLoaded, C3948dv.csi, e, i3));
                    return;
                } else if (ordinal5 != 45) {
                    m17018u("other", c);
                    return;
                } else if (baVar.f13896ln == null || (str = baVar.f13898n) == null || (str2 = baVar.f13897m) == null) {
                    String valueOf7 = String.valueOf(baVar);
                    StringBuilder sb7 = new StringBuilder(valueOf7.length() + 30);
                    sb7.append("Invalid logging message data: ");
                    sb7.append(valueOf7);
                    C4257pg.m18528g(sb7.toString());
                    return;
                } else {
                    StringBuilder sb8 = new StringBuilder(str.length() + 14 + str2.length());
                    sb8.append("JsMessage (");
                    sb8.append(str);
                    sb8.append("): ");
                    sb8.append(str2);
                    String sb9 = sb8.toString();
                    char charAt = baVar.f13896ln.charAt(0);
                    if (charAt != 'D') {
                        if (charAt != 'E') {
                            if (charAt != 'I') {
                                if (charAt != 'S') {
                                    if (charAt != 'V') {
                                        if (charAt != 'W') {
                                            String valueOf8 = String.valueOf(baVar.f13896ln);
                                            if (valueOf8.length() != 0) {
                                                str3 = "Unrecognized log level: ".concat(valueOf8);
                                            } else {
                                                str3 = new String("Unrecognized log level: ");
                                            }
                                            C4257pg.m18526e(str3);
                                            C4257pg.m18526e(sb9);
                                            return;
                                        }
                                        C4257pg.m18526e(sb9);
                                        return;
                                    }
                                }
                            }
                        }
                        C4257pg.m18528g(sb9);
                        return;
                    }
                    C4257pg.m18525d(sb9);
                    return;
                }
            case 6:
                C3971er erVar = this.f16977n;
                if (erVar != null) {
                    erVar.mo15742a(c, e, baVar.networkRequest);
                    return;
                } else {
                    C4257pg.m18528g("Native network handler not initialized.");
                    return;
                }
            case 7:
                int ordinal6 = c.ordinal();
                if (ordinal6 == 49) {
                    this.f16978o.mo15701a();
                    return;
                } else if (ordinal6 == 50) {
                    this.f16978o.mo15702b();
                    return;
                } else {
                    return;
                }
            case 9:
                m17016s(C3947du.videoDisplay1, c, e, baVar);
                return;
            case 10:
                m17016s(C3947du.videoDisplay2, c, e, baVar);
                return;
            default:
                String valueOf9 = String.valueOf(dwVar.mo15690b());
                StringBuilder sb10 = new StringBuilder(valueOf9.length() + 25);
                sb10.append("Unknown message channel: ");
                sb10.append(valueOf9);
                C4257pg.m18528g(sb10.toString());
                return;
        }
    }

    /* renamed from: f */
    public final void mo15708f(C3954ea eaVar, String str) {
        this.f16967d.put(str, eaVar);
    }

    /* renamed from: g */
    public final void mo15709g(C3956ec ecVar, String str) {
        this.f16968e.put(str, ecVar);
    }

    /* renamed from: h */
    public final void mo15710h(C3957ed edVar) {
        this.f16978o = edVar;
    }

    /* renamed from: i */
    public final void mo15711i(C3952dz dzVar, String str) {
        this.f16964a.put(str, dzVar);
    }

    /* renamed from: j */
    public final void mo15712j(String str) {
        this.f16964a.remove(str);
        this.f16965b.add(str);
    }

    /* renamed from: k */
    public final void mo15713k(C3983fc fcVar, String str) {
        this.f16969f.put(str, fcVar);
    }

    /* renamed from: l */
    public final void mo15714l(BaseDisplayContainer baseDisplayContainer, String str) {
        this.f16966c.put(str, baseDisplayContainer);
    }

    /* renamed from: m */
    public final void mo15715m(String str) {
        this.f16967d.remove(str);
        this.f16968e.remove(str);
        this.f16966c.remove(str);
        this.f16969f.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo15716n() {
        this.f16972i.mo15730e();
    }

    /* renamed from: o */
    public final void mo15717o(C3949dw dwVar) {
        String name = dwVar.mo15690b().name();
        String name2 = dwVar.mo15691c().name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23 + String.valueOf(name2).length());
        sb.append("Sending js message: ");
        sb.append(name);
        sb.append(" [");
        sb.append(name2);
        sb.append("]");
        C4257pg.m18525d(sb.toString());
        this.f16973j.add(dwVar);
        if (this.f16980q) {
            C3949dw poll = this.f16973j.poll();
            while (poll != null) {
                this.f16972i.mo15728c(poll);
                poll = this.f16973j.poll();
            }
        }
    }

    /* renamed from: p */
    public final void mo15718p(String str) {
        if (str != null && str.length() > 0) {
            new C3951dy(this, str).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo15719r() {
        C3969ep epVar;
        C3997fq d = this.f16975l.mo14230a().mo14221d();
        Context context = this.f16970g;
        boolean z = this.f16976m.mo14230a().mo14221d().enableGks;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        if (z) {
            epVar = new C3970eq(context, d);
        } else {
            epVar = new C3968eo((byte[]) null);
        }
        this.f16977n = new C3971er(this, newCachedThreadPool, epVar);
    }
}
