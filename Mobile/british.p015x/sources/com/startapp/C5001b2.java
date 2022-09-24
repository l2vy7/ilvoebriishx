package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.exoplayer2.C6540C;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.b2 */
/* compiled from: Sta */
public final class C5001b2 implements C5073c {

    /* renamed from: a */
    public final Context f22111a;

    /* renamed from: b */
    public final C5069e f22112b;

    /* renamed from: c */
    public Intent f22113c;

    /* renamed from: d */
    public boolean f22114d = false;

    /* renamed from: e */
    public boolean f22115e = true;

    public C5001b2(Context context, C5069e eVar) {
        this.f22111a = context;
        this.f22112b = eVar;
    }

    /* renamed from: a */
    public void mo20652a(Integer num, Long l, Boolean bool, boolean z, boolean z2) {
        if (mo20656d()) {
            long j = this.f22112b.getLong("consentTimestamp", 0);
            int i = this.f22112b.getInt("consentType", -1);
            boolean contains = this.f22112b.contains("consentApc");
            boolean z3 = true;
            boolean z4 = (num == null || i == num.intValue()) ? false : true;
            boolean z5 = bool != null && (!contains || this.f22112b.getBoolean("consentApc", false) != bool.booleanValue());
            if (l == null || l.longValue() <= j) {
                z3 = false;
            }
            if (!z && !z3) {
                return;
            }
            if (z4 || z5) {
                C5069e.C5070a a = this.f22112b.edit();
                if (z4) {
                    int intValue = num.intValue();
                    a.mo21101a("consentType", Integer.valueOf(intValue));
                    a.f22385a.putInt("consentType", intValue);
                }
                if (z5) {
                    boolean booleanValue = bool.booleanValue();
                    a.mo21101a("consentApc", Boolean.valueOf(booleanValue));
                    a.f22385a.putBoolean("consentApc", booleanValue);
                }
                if (z3) {
                    long longValue = l.longValue();
                    a.mo21101a("consentTimestamp", Long.valueOf(longValue));
                    a.f22385a.putLong("consentTimestamp", longValue);
                }
                a.apply();
                if (z2) {
                    MetaData.f22407k.mo21185a(this.f22111a, new AdPreferences(), MetaDataRequest.RequestReason.CONSENT, false, (C5073c) null, true);
                }
            }
        }
    }

    /* renamed from: b */
    public Integer mo20654b() {
        if (mo20656d()) {
            int hashCode = ComponentLocator.m23305a(this.f22111a).mo21214a().mo46442a().f54121a.hashCode();
            if (!this.f22112b.contains("advIdHash") || this.f22112b.getInt("advIdHash", 0) != hashCode) {
                C5069e.C5070a a = this.f22112b.edit().remove("consentType").remove("consentTimestamp");
                a.mo21101a("advIdHash", Integer.valueOf(hashCode));
                a.f22385a.putInt("advIdHash", hashCode);
                a.apply();
            }
        }
        if (!mo20656d() || !this.f22112b.contains("consentType")) {
            return null;
        }
        return Integer.valueOf(this.f22112b.getInt("consentType", -1));
    }

    /* renamed from: c */
    public boolean mo20655c() {
        Boolean a = mo20649a();
        return a != null && a.booleanValue();
    }

    /* renamed from: d */
    public final boolean mo20656d() {
        ConsentConfig l = MetaData.f22407k.mo21200l();
        return this.f22115e && l != null && l.mo46205k();
    }

    /* renamed from: a */
    public Boolean mo20649a() {
        if (!mo20656d() || !this.f22112b.contains("consentApc")) {
            return null;
        }
        return Boolean.valueOf(this.f22112b.getBoolean("consentApc", false));
    }

    /* renamed from: a */
    public final void mo20653a(boolean z, String str, String str2, String str3) {
        ConsentConfig l;
        String str4;
        int i;
        int i2;
        Integer b;
        if ((!z && !StartAppSDKInternal.m23101c()) || (l = MetaData.f22407k.mo21200l()) == null) {
            return;
        }
        if ((!mo20656d() && !z) || this.f22114d || !C5015nb.m22938g(this.f22111a) || !C5015nb.m22936e(this.f22111a)) {
            return;
        }
        if (z || !(l.mo46201h() == null || l.mo46200g() == null || this.f22112b.contains("consentApc"))) {
            if (z) {
                str4 = AdInformationMetaData.f54504a.mo46121a().mo46114c();
            } else {
                str4 = l.mo46199f();
            }
            if (str4 != null) {
                Intent intent = new Intent(this.f22111a, ConsentActivity.class);
                intent.setFlags(C6540C.ENCODING_PCM_32BIT);
                intent.setData(Uri.parse(str4));
                intent.putExtra("allowCT", l.mo46205k());
                intent.putExtra("timestamp", l.mo46203i());
                if (z) {
                    i = 4;
                } else {
                    i = l.mo46201h().intValue();
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    intent.putExtra("templateName", valueOf);
                }
                if (z) {
                    i2 = 7;
                } else {
                    i2 = l.mo46200g().intValue();
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (valueOf2 != null) {
                    intent.putExtra("templateId", valueOf2);
                }
                if (!z) {
                    str = l.mo46196d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z) {
                    str2 = l.mo46197e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z) {
                    str3 = l.mo46193a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z) {
                    intent.putExtra("advertisingId", ComponentLocator.m23305a(this.f22111a).mo21214a().mo46442a().f54121a);
                    if (this.f22112b.contains("consentType")) {
                        intent.putExtra("consentType", this.f22112b.getInt("consentType", -1));
                    }
                }
                ConsentTypeInfoConfig c = l.mo46195c();
                if (c != null) {
                    if (c.mo46207b() != null) {
                        intent.putExtra(AdSDKNotificationListener.IMPRESSION_EVENT, c.mo46207b());
                    }
                    if (c.mo46206a() != null) {
                        intent.putExtra("falseClick", c.mo46206a());
                    }
                    if (c.mo46208c() != null) {
                        intent.putExtra("trueClick", c.mo46208c());
                    }
                }
                if (z && (b = AdInformationMetaData.f54504a.mo46121a().mo46112b()) != null) {
                    intent.putExtra("trueClick", b);
                }
                try {
                    this.f22111a.startActivity(intent);
                    this.f22114d = true;
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20650a(MetaDataRequest.RequestReason requestReason) {
        MetaData.f22407k.mo21186a((C5073c) this);
    }

    /* renamed from: a */
    public void mo20651a(MetaDataRequest.RequestReason requestReason, boolean z) {
        MetaData.f22407k.mo21186a((C5073c) this);
        ConsentConfig l = MetaData.f22407k.mo21200l();
        if (l != null && mo20656d()) {
            Integer b = l.mo46194b();
            if (b != null) {
                mo20652a(b, Long.valueOf(l.mo46203i()), (Boolean) null, false, false);
            }
            if (requestReason == MetaDataRequest.RequestReason.CONSENT) {
                C5069e.C5070a a = this.f22112b.edit();
                long i = l.mo46203i();
                a.mo21101a("consentTimestamp", Long.valueOf(i));
                a.f22385a.putLong("consentTimestamp", i);
                a.apply();
            } else if (requestReason == MetaDataRequest.RequestReason.LAUNCH) {
                mo20653a(false, (String) null, (String) null, (String) null);
            }
        }
    }
}
