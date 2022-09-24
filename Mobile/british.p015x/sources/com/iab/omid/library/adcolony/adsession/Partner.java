package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p045d.C4847e;

public class Partner {

    /* renamed from: a */
    private final String f21653a;

    /* renamed from: b */
    private final String f21654b;

    private Partner(String str, String str2) {
        this.f21653a = str;
        this.f21654b = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C4847e.m22347a(str, "Name is null or empty");
        C4847e.m22347a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.f21653a;
    }

    public String getVersion() {
        return this.f21654b;
    }
}
