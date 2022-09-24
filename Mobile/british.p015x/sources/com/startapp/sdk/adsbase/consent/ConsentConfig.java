package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentConfig implements Serializable {
    private static final long serialVersionUID = 8363121715420063423L;
    private boolean allowCT;
    private String clickUrl;
    private Integer consentType;
    @C5010hb(complex = true)
    private ConsentTypeInfoConfig consentTypeInfo;
    private String dParam;
    private boolean detectConsentCovering;
    private String impressionUrl;
    private String template;
    private Integer templateId;
    private Integer templateName;
    private long timeStamp = 0;

    /* renamed from: a */
    public String mo46193a() {
        return this.clickUrl;
    }

    /* renamed from: b */
    public Integer mo46194b() {
        return this.consentType;
    }

    /* renamed from: c */
    public ConsentTypeInfoConfig mo46195c() {
        return this.consentTypeInfo;
    }

    /* renamed from: d */
    public String mo46196d() {
        return this.dParam;
    }

    /* renamed from: e */
    public String mo46197e() {
        return this.impressionUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentConfig.class != obj.getClass()) {
            return false;
        }
        ConsentConfig consentConfig = (ConsentConfig) obj;
        if (this.allowCT != consentConfig.allowCT || this.detectConsentCovering != consentConfig.detectConsentCovering || this.timeStamp != consentConfig.timeStamp || !C5015nb.m22922a(this.template, consentConfig.template) || !C5015nb.m22922a(this.impressionUrl, consentConfig.impressionUrl) || !C5015nb.m22922a(this.clickUrl, consentConfig.clickUrl) || !C5015nb.m22922a(this.templateName, consentConfig.templateName) || !C5015nb.m22922a(this.templateId, consentConfig.templateId) || !C5015nb.m22922a(this.dParam, consentConfig.dParam) || !C5015nb.m22922a(this.consentTypeInfo, consentConfig.consentTypeInfo)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo46199f() {
        return this.template;
    }

    /* renamed from: g */
    public Integer mo46200g() {
        return this.templateId;
    }

    /* renamed from: h */
    public Integer mo46201h() {
        return this.templateName;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.allowCT), Boolean.valueOf(this.detectConsentCovering), this.template, Long.valueOf(this.timeStamp), this.impressionUrl, this.clickUrl, this.templateName, this.templateId, this.dParam, this.consentTypeInfo};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public long mo46203i() {
        return this.timeStamp;
    }

    /* renamed from: j */
    public boolean mo46204j() {
        return this.detectConsentCovering;
    }

    /* renamed from: k */
    public boolean mo46205k() {
        return this.allowCT;
    }
}
