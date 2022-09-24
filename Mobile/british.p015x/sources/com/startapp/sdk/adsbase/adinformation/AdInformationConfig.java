package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.startapp.C11799b4;
import com.startapp.C11840d1;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationConfig implements Serializable {

    /* renamed from: b */
    public static final String f54502b = "https://funnel-assets.startappservice.com/consent/index.html";
    private static final long serialVersionUID = 8911501868319500986L;
    @C5010hb(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();
    @C5010hb(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    public HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();

    /* renamed from: a */
    public transient EnumMap<ImageResourceType, ImageResourceConfig> f54503a = new EnumMap<>(ImageResourceType.class);
    private Integer consentTypeInfo;
    private String dialogUrlSecured = f54502b;
    private boolean enabled = true;
    private String eulaUrlSecured = "https://www.startapp.com/policy/privacy-policy/";
    private float fatFingersFactor = 200.0f;

    /* compiled from: Sta */
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 21);
        
        private final int height;
        private final int width;

        private ImageResourceType(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                if (imageResourceType2.name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    private AdInformationConfig() {
    }

    /* renamed from: a */
    public static AdInformationConfig m53140a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        m53141a(adInformationConfig);
        return adInformationConfig;
    }

    /* renamed from: b */
    public Integer mo46112b() {
        return this.consentTypeInfo;
    }

    /* renamed from: c */
    public String mo46114c() {
        String str = this.dialogUrlSecured;
        return str != null ? str : f54502b;
    }

    /* renamed from: d */
    public String mo46115d() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? "https://www.startapp.com/policy/privacy-policy/" : this.eulaUrlSecured;
    }

    /* renamed from: e */
    public float mo46116e() {
        return this.fatFingersFactor / 100.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
        if (this.enabled != adInformationConfig.enabled || Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) != 0 || !C5015nb.m22922a(this.consentTypeInfo, adInformationConfig.consentTypeInfo) || !C5015nb.m22922a(this.dialogUrlSecured, adInformationConfig.dialogUrlSecured) || !C5015nb.m22922a(this.eulaUrlSecured, adInformationConfig.eulaUrlSecured) || !C5015nb.m22922a(this.Positions, adInformationConfig.Positions) || !C5015nb.m22922a(this.ImageResources, adInformationConfig.ImageResources)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: b */
    public boolean mo46113b(Context context) {
        if (ComponentLocator.m23305a(context).mo21217d().getBoolean("userDisabledAdInformation", false) || !this.enabled) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m53141a(AdInformationConfig adInformationConfig) {
        boolean z;
        adInformationConfig.getClass();
        int i = 0;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfig = adInformationConfig.f54503a.get(imageResourceType);
            if (imageResourceConfig == null) {
                imageResourceConfig = ImageResourceConfig.m53156a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = adInformationConfig.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().mo46140c()).equals(imageResourceType)) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                adInformationConfig.f54503a.put(imageResourceType, imageResourceConfig);
                if (z) {
                    adInformationConfig.ImageResources.add(imageResourceConfig);
                }
            }
            imageResourceConfig.mo46138b(imageResourceType.getDefaultWidth());
            imageResourceConfig.mo46136a(imageResourceType.getDefaultHeight());
            imageResourceConfig.mo46139b(imageResourceType.name().toLowerCase() + ".png");
        }
        ImageResourceType[] values = ImageResourceType.values();
        int length = values.length;
        while (i < length) {
            ImageResourceType imageResourceType2 = values[i];
            if (adInformationConfig.f54503a.get(imageResourceType2) != null) {
                i++;
            } else {
                throw new IllegalArgumentException(String.valueOf(imageResourceType2));
            }
        }
    }

    /* renamed from: a */
    public void mo46111a(Context context) {
        for (ImageResourceConfig next : this.ImageResources) {
            this.f54503a.put(ImageResourceType.getByName(next.mo46140c()), next);
            next.f54523a = null;
            new C11840d1(context, next.mo46137b(), new C11799b4(next), 0).mo45233a();
        }
    }
}
