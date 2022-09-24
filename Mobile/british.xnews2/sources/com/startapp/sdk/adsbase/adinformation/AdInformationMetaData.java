package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.startapp.C11882e4;
import com.startapp.C5004d4;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a */
    public static volatile AdInformationMetaData f54504a = new AdInformationMetaData();

    /* renamed from: b */
    public static final Object f54505b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;
    @C5010hb(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.m53140a();
    private String adInformationMetadataUpdateVersion = "4.10.2";

    /* renamed from: a */
    public AdInformationConfig mo46121a() {
        return this.AdInformation;
    }

    /* renamed from: b */
    public String mo46122b() {
        return this.AdInformation.mo46115d();
    }

    /* renamed from: c */
    public String mo46123c() {
        AdInformationConfig adInformationConfig = this.AdInformation;
        EnumMap<AdInformationConfig.ImageResourceType, ImageResourceConfig> enumMap = adInformationConfig.f54503a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || adInformationConfig.f54503a.get(imageResourceType).mo46137b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : adInformationConfig.f54503a.get(imageResourceType).mo46137b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
        if (!C5015nb.m22922a(this.AdInformation, adInformationMetaData.AdInformation) || !C5015nb.m22922a(this.adInformationMetadataUpdateVersion, adInformationMetaData.adInformationMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m53148a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) C5126w2.m23386a(context, "StartappAdInfoMetadata", AdInformationMetaData.class);
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean b = C5015nb.m22930b(adInformationMetaData, adInformationMetaData2);
            if (!(!"4.10.2".equals(adInformationMetaData.adInformationMetadataUpdateVersion)) && b) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "metadata_null";
                d4Var.mo20661a();
            }
            AdInformationConfig adInformationConfig = adInformationMetaData.AdInformation;
            adInformationConfig.getClass();
            adInformationConfig.f54503a = new EnumMap<>(AdInformationConfig.ImageResourceType.class);
            f54504a = adInformationMetaData;
        } else {
            f54504a = adInformationMetaData2;
        }
        f54504a.AdInformation.mo46111a(context);
    }

    /* renamed from: a */
    public static void m53149a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f54505b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "4.10.2";
            f54504a = adInformationMetaData;
            AdInformationConfig.m53141a(f54504a.AdInformation);
            f54504a.AdInformation.mo46111a(context);
            C5126w2.m23389a(context, "StartappAdInfoMetadata", (Serializable) adInformationMetaData);
        }
    }
}
