package com.ironsource.sdk.p286a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.sdk.a.f */
public final class C11522f {

    /* renamed from: a */
    public static C11523a f51802a = new C11523a(2001, m51366a("initsdk"));

    /* renamed from: b */
    public static C11523a f51803b = new C11523a(2002, m51366a("createcontrollerweb"));

    /* renamed from: c */
    public static C11523a f51804c = new C11523a(2003, m51366a("createcontrollernative"));

    /* renamed from: d */
    public static C11523a f51805d = new C11523a(2004, m51366a("controllerstageready"));

    /* renamed from: e */
    public static C11523a f51806e = new C11523a(IronSourceConstants.IS_INSTANCE_OPENED, m51366a("loadad"));

    /* renamed from: f */
    public static C11523a f51807f = new C11523a(2006, m51366a("loadadfailed"));

    /* renamed from: g */
    public static C11523a f51808g = new C11523a(2007, m51366a("initproduct"));

    /* renamed from: h */
    public static C11523a f51809h = new C11523a(AdError.REMOTE_ADS_SERVICE_ERROR, m51366a("initproductfailed"));

    /* renamed from: i */
    public static C11523a f51810i = new C11523a(AdError.INTERSTITIAL_AD_TIMEOUT, m51366a("loadproduct"));

    /* renamed from: j */
    public static C11523a f51811j = new C11523a(2010, m51366a("parseadmfailed"));

    /* renamed from: k */
    public static C11523a f51812k = new C11523a(2011, m51366a("loadadsuccess"));

    /* renamed from: l */
    public static C11523a f51813l = new C11523a(2013, m51366a("controllerfailed"));

    /* renamed from: m */
    public static C11523a f51814m = new C11523a(2014, m51366a("extractinstalledpackagesfailed"));

    /* renamed from: n */
    public static C11523a f51815n = new C11523a(2015, m51366a("appendnativefeaturesdatafailed"));

    /* renamed from: o */
    public static C11523a f51816o = new C11523a(2016, m51366a("adunitcouldnotloadtowebview"));

    /* renamed from: p */
    public static C11523a f51817p = new C11523a(2017, m51366a("webviewcleanupfailed"));

    /* renamed from: q */
    public static C11523a f51818q = new C11523a(2018, m51366a("removewebviewfailed"));

    /* renamed from: r */
    public static C11523a f51819r = new C11523a(2021, m51366a("fialedregactlifecycle"));

    /* renamed from: s */
    public static C11523a f51820s = new C11523a(2022, m51366a("loadcontrollerhtml"));

    /* renamed from: t */
    public static C11523a f51821t = new C11523a(2023, m51366a("controllerhtmlsuccess"));

    /* renamed from: u */
    public static C11523a f51822u = new C11523a(2024, m51366a("controllerhtmlfailed"));

    /* renamed from: v */
    public static C11523a f51823v = new C11523a(2025, m51366a("webviewcrashrpg"));

    /* renamed from: com.ironsource.sdk.a.f$a */
    public static class C11523a {

        /* renamed from: a */
        String f51824a;

        /* renamed from: b */
        int f51825b;

        C11523a(int i, String str) {
            this.f51825b = i;
            this.f51824a = str;
        }
    }

    static {
        new C11523a(2019, m51366a("adunitcouldnotloadtowebviewbanners"));
        new C11523a(2020, m51366a("banneralreadydestroyed"));
    }

    /* renamed from: a */
    private static String m51366a(String str) {
        return "n_" + str;
    }
}
