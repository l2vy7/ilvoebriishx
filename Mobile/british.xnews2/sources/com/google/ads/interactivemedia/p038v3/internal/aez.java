package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aez */
/* compiled from: IMASDK */
public abstract class aez {

    /* renamed from: a */
    private final aew f14485a;

    /* renamed from: b */
    public final C4120ke f14486b;

    /* renamed from: c */
    public final String f14487c;

    /* renamed from: d */
    public final long f14488d;

    /* renamed from: e */
    public final List<aes> f14489e;

    /* synthetic */ aez(C4120ke keVar, String str, aff aff, List list) {
        this.f14486b = keVar;
        this.f14487c = str;
        this.f14489e = Collections.unmodifiableList(list);
        this.f14485a = aff.mo13598i(this);
        this.f14488d = amm.m14196M(aff.f14509j, 1000000, aff.f14508i);
    }

    /* renamed from: k */
    public abstract aew mo13586k();

    /* renamed from: l */
    public abstract aed mo13587l();

    /* renamed from: m */
    public abstract void mo13588m();

    /* renamed from: n */
    public final aew mo13589n() {
        return this.f14485a;
    }
}
