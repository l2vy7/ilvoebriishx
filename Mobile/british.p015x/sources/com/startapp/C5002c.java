package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* renamed from: com.startapp.c */
/* compiled from: Sta */
public class C5002c implements Comparable<C5002c> {

    /* renamed from: a */
    public long f22116a = System.currentTimeMillis();

    /* renamed from: b */
    public AdPreferences.Placement f22117b;

    /* renamed from: c */
    public String f22118c;

    public C5002c(AdPreferences.Placement placement, String str) {
        this.f22117b = placement;
        this.f22118c = str == null ? "" : str;
    }

    public int compareTo(Object obj) {
        int i = ((this.f22116a - ((C5002c) obj).f22116a) > 0 ? 1 : ((this.f22116a - ((C5002c) obj).f22116a) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    public String toString() {
        StringBuilder a = C12458z0.m53804a("AdDisplayEvent [displayTime=");
        a.append(this.f22116a);
        a.append(", placement=");
        a.append(this.f22117b);
        a.append(", adTag=");
        a.append(this.f22118c);
        a.append("]");
        return a.toString();
    }
}
