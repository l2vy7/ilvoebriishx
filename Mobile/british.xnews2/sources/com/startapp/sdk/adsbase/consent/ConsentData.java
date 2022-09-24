package com.startapp.sdk.adsbase.consent;

import java.io.Serializable;

/* compiled from: Sta */
public final class ConsentData implements Serializable {
    private static final long serialVersionUID = 4245437752472461229L;
    private Boolean apc;
    private String infoDialogClickUrl;
    private String infoDialogDParam;
    private String infoDialogImpressionUrl;
    private Long timeStamp;
    private Integer type;

    /* renamed from: a */
    public void mo21063a(Integer num) {
        this.type = num;
    }

    /* renamed from: b */
    public void mo21067b(String str) {
        this.infoDialogDParam = str;
    }

    /* renamed from: c */
    public String mo21068c() {
        return this.infoDialogDParam;
    }

    /* renamed from: d */
    public String mo21070d() {
        return this.infoDialogImpressionUrl;
    }

    /* renamed from: e */
    public Long mo21071e() {
        return this.timeStamp;
    }

    /* renamed from: f */
    public Integer mo21072f() {
        return this.type;
    }

    /* renamed from: a */
    public void mo21064a(Long l) {
        this.timeStamp = l;
    }

    /* renamed from: b */
    public String mo21066b() {
        return this.infoDialogClickUrl;
    }

    /* renamed from: c */
    public void mo21069c(String str) {
        this.infoDialogImpressionUrl = str;
    }

    /* renamed from: a */
    public Boolean mo21061a() {
        return this.apc;
    }

    /* renamed from: a */
    public void mo21062a(Boolean bool) {
        this.apc = bool;
    }

    /* renamed from: a */
    public void mo21065a(String str) {
        this.infoDialogClickUrl = str;
    }
}
