package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.startapp.C11995jb;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class RscMetadata implements Serializable {
    private static final long serialVersionUID = -5424519918396264553L;
    private boolean enabled;
    private int ief;
    @C5010hb(parser = ItemsParser.class, type = ArrayList.class, value = RscMetadataItem.class)
    private List<RscMetadataItem> items;
    private String triggers;

    @Keep
    /* compiled from: Sta */
    public static class ItemsParser extends C11995jb<RscMetadataItem> {
        public ItemsParser() {
            super(RscMetadataItem.class);
        }
    }

    /* renamed from: a */
    public int mo46386a() {
        return this.ief;
    }

    /* renamed from: b */
    public List<RscMetadataItem> mo46388b() {
        return this.items;
    }

    /* renamed from: c */
    public String mo46389c() {
        return this.triggers;
    }

    /* renamed from: d */
    public boolean mo46390d() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadata rscMetadata = (RscMetadata) obj;
        if (this.enabled != rscMetadata.enabled || this.ief != rscMetadata.ief || !C5015nb.m22922a(this.triggers, rscMetadata.triggers) || !C5015nb.m22922a(this.items, rscMetadata.items)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.triggers, this.items, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public int mo46387a(RscMetadataItem rscMetadataItem) {
        return rscMetadataItem.mo46394b() != null ? rscMetadataItem.mo46394b().intValue() : this.ief;
    }
}
