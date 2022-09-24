package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public abstract class JsonAd extends C5041Ad {
    private static final long serialVersionUID = 1;
    private List<AdDetails> adsDetails = null;

    public JsonAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* renamed from: a */
    public void mo46102a(List<AdDetails> list) {
        this.adsDetails = list;
        Long l = null;
        for (AdDetails next : list) {
            if (!(next == null || next.mo46270x() == null)) {
                if (l == null || next.mo46270x().longValue() < l.longValue()) {
                    l = next.mo46270x();
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
        boolean z = true;
        Iterator<AdDetails> it = this.adsDetails.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().mo46258n()) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        this.belowMinCPM = z;
    }

    /* renamed from: g */
    public List<AdDetails> mo46103g() {
        return this.adsDetails;
    }

    public String getAdId() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).mo46244a();
    }

    public String getBidToken() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).mo46247d();
    }
}
