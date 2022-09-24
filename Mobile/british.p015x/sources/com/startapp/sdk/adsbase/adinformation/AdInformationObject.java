package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.C5001b2;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class AdInformationObject implements View.OnClickListener {

    /* renamed from: a */
    public final WeakReference<Context> f54506a;

    /* renamed from: b */
    public final AdInformationView f54507b;

    /* renamed from: c */
    public final AdPreferences.Placement f54508c;

    /* renamed from: d */
    public final ConsentData f54509d;

    /* renamed from: e */
    public final AdInformationOverrides f54510e;

    /* compiled from: Sta */
    public enum Size {
        SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
        LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        
        private final AdInformationConfig.ImageResourceType infoExtendedType;
        private final AdInformationConfig.ImageResourceType infoType;

        /* access modifiers changed from: public */
        Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        /* renamed from: a */
        public AdInformationConfig.ImageResourceType mo46128a() {
            return this.infoType;
        }
    }

    public AdInformationObject(Context context, Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData) {
        this.f54506a = new WeakReference<>(context);
        this.f54508c = placement;
        this.f54510e = adInformationOverrides;
        this.f54509d = consentData;
        this.f54507b = new AdInformationView(context, size, placement, adInformationOverrides, this);
    }

    /* renamed from: a */
    public void mo46126a(RelativeLayout relativeLayout) {
        boolean z;
        AdInformationConfig a = AdInformationMetaData.f54504a.mo46121a();
        AdInformationOverrides adInformationOverrides = this.f54510e;
        if (adInformationOverrides == null || !adInformationOverrides.mo21016d()) {
            z = a.mo46113b((Context) this.f54506a.get());
        } else {
            z = this.f54510e.mo21015c();
        }
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f54510e;
            if (adInformationOverrides2 == null || !adInformationOverrides2.mo21017e()) {
                AdPreferences.Placement placement = this.f54508c;
                AdInformationPositions.Position position = a.Positions.get(placement);
                if (position == null) {
                    position = AdInformationPositions.Position.BOTTOM_LEFT;
                    a.Positions.put(placement, position);
                }
                position.addRules(layoutParams);
            } else {
                this.f54510e.mo21014b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f54507b, layoutParams);
        }
    }

    public void onClick(View view) {
        Context context = (Context) this.f54506a.get();
        if (context != null) {
            C5001b2 f = ComponentLocator.m23305a(context).mo21219f();
            ConsentData consentData = this.f54509d;
            String str = null;
            String c = consentData != null ? consentData.mo21068c() : null;
            ConsentData consentData2 = this.f54509d;
            String d = consentData2 != null ? consentData2.mo21070d() : null;
            ConsentData consentData3 = this.f54509d;
            if (consentData3 != null) {
                str = consentData3.mo21066b();
            }
            f.mo20653a(true, c, d, str);
        }
    }
}
