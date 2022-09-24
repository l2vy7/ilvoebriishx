package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.startapp.C11905f9;
import com.startapp.C11921g6;
import com.startapp.C12109o7;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Sta */
public abstract class HtmlAd extends C5041Ad {

    /* renamed from: c */
    public static String f22243c = null;
    private static final long serialVersionUID = 1;
    private List<AppPresenceDetails> apps;
    private String[] closingUrl = {""};
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid = "";
    public boolean[] inAppBrowserEnabled = {true};
    private boolean isMraidAd = false;
    private int orientation = 0;
    private String[] packageNames = {""};
    private int rewardDuration = 0;
    private boolean rewardedHideTimer = false;
    private Boolean[] sendRedirectHops = null;
    public boolean[] smartRedirect = {false};
    private String[] trackingClickUrls = {""};
    public String[] trackingUrls = {""};
    private int width;

    public HtmlAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        if (f22243c == null) {
            mo20936q();
        }
    }

    /* renamed from: a */
    public void mo20919a(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* renamed from: b */
    public void mo20924b(String str) {
        Long l = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l == null || parseLong < l.longValue())) {
                        l = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
    }

    /* renamed from: c */
    public void mo20925c(String str) {
        if (Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(new StringBuffer(str)).find()) {
            if (Build.VERSION.SDK_INT < 11) {
                StringBuffer stringBuffer = new StringBuffer(str);
                String property = System.getProperty("line.separator");
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(stringBuffer);
                if (matcher.find()) {
                    stringBuffer.delete(matcher.start(), matcher.end());
                }
                Matcher matcher2 = Pattern.compile("<head[^>]*>", 2).matcher(stringBuffer);
                for (int i = 0; matcher2.find(i); i = matcher2.end()) {
                    stringBuffer.insert(matcher2.end(), property + "<script>" + property + C11921g6.m52343a() + property + "</script>");
                }
                str = stringBuffer.toString();
            }
            this.isMraidAd = true;
        }
        if (MetaData.f22407k.mo21175Q()) {
            try {
                str = C11905f9.m52314a(C12109o7.m52702a(), str);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
        Map<Activity, Integer> map = C5015nb.f22145a;
        C5059d dVar = C5059d.f22346h;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        dVar.f22348b.put(uuid, str);
        this.htmlUuid = uuid;
        String a = C5015nb.m22910a(str, "@smartRedirect@", "@smartRedirect@");
        if (a != null) {
            String[] split = a.split(",");
            this.smartRedirect = new boolean[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                if (split[i2].compareTo("true") == 0) {
                    this.smartRedirect[i2] = true;
                } else {
                    this.smartRedirect[i2] = false;
                }
            }
        }
        String a2 = C5015nb.m22910a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a2 != null) {
            this.trackingClickUrls = a2.split(",");
        }
        String a3 = C5015nb.m22910a(str, "@closeUrl@", "@closeUrl@");
        if (a3 != null) {
            this.closingUrl = a3.split(",");
        }
        String a4 = C5015nb.m22910a(str, "@tracking@", "@tracking@");
        if (a4 != null) {
            this.trackingUrls = a4.split(",");
        }
        String a5 = C5015nb.m22910a(str, "@packageName@", "@packageName@");
        if (a5 != null) {
            this.packageNames = a5.split(",");
        }
        String a6 = C5015nb.m22910a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a6 != null) {
            String[] split2 = a6.split(",");
            this.inAppBrowserEnabled = new boolean[split2.length];
            for (int i3 = 0; i3 < split2.length; i3++) {
                if (split2[i3].compareTo("false") == 0) {
                    this.inAppBrowserEnabled[i3] = false;
                } else {
                    this.inAppBrowserEnabled[i3] = true;
                }
            }
        }
        String a7 = C5015nb.m22910a(str, "@orientation@", "@orientation@");
        if (a7 != null) {
            Map<Activity, Integer> map2 = C5015nb.f22145a;
            mo20920a(SplashConfig.Orientation.getByName(a7));
        }
        String a8 = C5015nb.m22910a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a8 != null) {
            getAdInfoOverride().mo21013a(Boolean.parseBoolean(a8));
        }
        String a9 = C5015nb.m22910a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a9 != null) {
            getAdInfoOverride().mo21012a(AdInformationPositions.Position.getByName(a9));
        }
        String a10 = C5015nb.m22910a(str, "@ttl@", "@ttl@");
        if (a10 != null) {
            mo20924b(a10);
        }
        String a11 = C5015nb.m22910a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a11 != null) {
            if (Arrays.asList(a11.split(",")).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a12 = C5015nb.m22910a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a12 != null && !a12.equals("")) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(a12));
            } catch (NumberFormatException unused) {
            }
        }
        String a13 = C5015nb.m22910a(str, "@rewardDuration@", "@rewardDuration@");
        if (a13 != null) {
            try {
                this.rewardDuration = Integer.parseInt(a13);
            } catch (Throwable th2) {
                C5004d4.m22887a(th2);
            }
        }
        String a14 = C5015nb.m22910a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a14 != null) {
            try {
                this.rewardedHideTimer = Boolean.parseBoolean(a14);
            } catch (Throwable th3) {
                C5004d4.m22887a(th3);
            }
        }
        String a15 = C5015nb.m22910a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a15 != null && !a15.equals("")) {
            String[] split3 = a15.split(",");
            this.sendRedirectHops = new Boolean[split3.length];
            for (int i4 = 0; i4 < split3.length; i4++) {
                if (split3[i4].compareTo("true") == 0) {
                    this.sendRedirectHops[i4] = Boolean.TRUE;
                } else if (split3[i4].compareTo("false") == 0) {
                    this.sendRedirectHops[i4] = Boolean.FALSE;
                } else {
                    this.sendRedirectHops[i4] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.mo21067b(C5015nb.m22910a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.mo21069c(C5015nb.m22910a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.mo21065a(C5015nb.m22910a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a16 = C5015nb.m22910a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a16)) {
                this.consentData.mo21063a(Integer.valueOf(Integer.parseInt(a16)));
            }
        } catch (Throwable th4) {
            C5004d4.m22887a(th4);
        }
        try {
            String a17 = C5015nb.m22910a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a17)) {
                this.consentData.mo21064a(Long.valueOf(Long.parseLong(a17)));
            }
        } catch (Throwable th5) {
            C5004d4.m22887a(th5);
        }
        try {
            String a18 = C5015nb.m22910a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a18)) {
                this.consentData.mo21062a(Boolean.valueOf(Boolean.parseBoolean(a18)));
            }
        } catch (Throwable th6) {
            C5004d4.m22887a(th6);
        }
        int length = this.smartRedirect.length;
        String[] strArr = this.trackingUrls;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i5 = 0;
            while (true) {
                boolean[] zArr2 = this.smartRedirect;
                if (i5 >= zArr2.length) {
                    break;
                }
                zArr[i5] = zArr2[i5];
                i5++;
            }
            while (i5 < this.trackingUrls.length) {
                zArr[i5] = false;
                i5++;
            }
            this.smartRedirect = zArr;
        }
    }

    /* renamed from: g */
    public String[] mo20926g() {
        return this.closingUrl;
    }

    public String getAdId() {
        return C5015nb.m22910a(mo20929j(), "@adId@", "@adId@");
    }

    public String getBidToken() {
        return C5015nb.m22910a(mo20929j(), "@bidToken@", "@bidToken@");
    }

    /* renamed from: h */
    public Long mo20927h() {
        return this.delayImpressionInSeconds;
    }

    /* renamed from: i */
    public int mo20928i() {
        return this.height;
    }

    /* renamed from: j */
    public String mo20929j() {
        C5059d dVar = C5059d.f22346h;
        return dVar.f22348b.get(this.htmlUuid);
    }

    /* renamed from: k */
    public String mo20930k() {
        return this.htmlUuid;
    }

    /* renamed from: l */
    public int mo20931l() {
        return this.orientation;
    }

    /* renamed from: m */
    public String[] mo20932m() {
        return this.packageNames;
    }

    /* renamed from: n */
    public int mo20933n() {
        return this.rewardDuration;
    }

    /* renamed from: o */
    public String[] mo20934o() {
        return this.trackingClickUrls;
    }

    /* renamed from: p */
    public int mo20935p() {
        return this.width;
    }

    /* renamed from: q */
    public final void mo20936q() {
        f22243c = C5015nb.m22905a(getContext());
    }

    /* renamed from: r */
    public boolean mo20937r() {
        return this.isMraidAd;
    }

    /* renamed from: s */
    public boolean mo20938s() {
        return this.rewardedHideTimer;
    }

    /* renamed from: t */
    public Boolean[] mo20939t() {
        return this.sendRedirectHops;
    }

    /* renamed from: a */
    public void mo20920a(SplashConfig.Orientation orientation2) {
        this.orientation = 0;
        Map<Activity, Integer> map = C5015nb.f22145a;
        if (orientation2 == null) {
            return;
        }
        if (orientation2.equals(SplashConfig.Orientation.PORTRAIT)) {
            this.orientation = 1;
        } else if (orientation2.equals(SplashConfig.Orientation.LANDSCAPE)) {
            this.orientation = 2;
        }
    }

    /* renamed from: b */
    public Boolean mo20923b(int i) {
        Boolean[] boolArr = this.sendRedirectHops;
        if (boolArr == null || i < 0 || i >= boolArr.length) {
            return null;
        }
        return boolArr[i];
    }

    /* renamed from: a */
    public boolean mo20922a(int i) {
        boolean[] zArr = this.inAppBrowserEnabled;
        if (zArr == null || i < 0 || i >= zArr.length) {
            return true;
        }
        return zArr[i];
    }

    /* renamed from: a */
    public void mo20921a(List<AppPresenceDetails> list) {
        this.apps = list;
    }
}
