package com.startapp.sdk.adsbase;

import com.startapp.C12458z0;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class AdsConstants {

    /* renamed from: a */
    public static final String f54490a;

    /* renamed from: b */
    public static final String f54491b;

    /* renamed from: c */
    public static final String f54492c = "trackdownload";

    /* renamed from: d */
    public static final String f54493d;

    /* renamed from: e */
    public static final String f54494e = "https://imp.startappservice.com/tracking/adImpression";

    /* renamed from: f */
    public static final Boolean f54495f;

    /* renamed from: g */
    public static final Boolean f54496g;

    /* renamed from: h */
    public static final String[] f54497h = {"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};

    /* renamed from: i */
    public static final String[] f54498i = {"empty_star", "filled_star", "half_star"};

    /* compiled from: Sta */
    public enum AdApiType {
        HTML,
        JSON
    }

    static {
        String str = "get";
        StringBuilder a = C12458z0.m53804a(str);
        a.append("ads");
        f54490a = a.toString();
        StringBuilder a2 = C12458z0.m53804a(str);
        a2.append("htmlad");
        f54491b = a2.toString();
        StringBuilder a3 = C12458z0.m53804a(str);
        a3.append("adsmetadata");
        f54493d = a3.toString();
        Boolean bool = Boolean.FALSE;
        f54495f = bool;
        f54496g = bool;
    }

    /* renamed from: a */
    public static String m53135a(AdApiType adApiType, AdPreferences.Placement placement) {
        String str;
        String str2;
        String str3;
        int ordinal = adApiType.ordinal();
        String str4 = null;
        if (ordinal == 0) {
            str3 = f54491b;
            str2 = MetaData.f22407k.mo21182a(placement);
        } else if (ordinal != 1) {
            str = null;
            return str4 + str;
        } else {
            str3 = f54490a;
            str2 = MetaData.f22407k.mo21182a(placement);
        }
        String str5 = str3;
        str4 = str2;
        str = str5;
        return str4 + str;
    }
}
