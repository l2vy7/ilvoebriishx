package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class MetaDataStyle implements Serializable {

    /* renamed from: a */
    public static final Integer f54659a = 18;

    /* renamed from: b */
    public static final Integer f54660b = -1;

    /* renamed from: c */
    public static final Set<String> f54661c = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: d */
    public static final Integer f54662d = 14;

    /* renamed from: e */
    public static final Integer f54663e = -1;

    /* renamed from: f */
    public static final Set<String> f54664f = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private Integer itemDescriptionTextColor = f54663e;
    @C5010hb(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f54664f;
    private Integer itemDescriptionTextSize = f54662d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = f54660b;
    @C5010hb(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f54661c;
    private Integer itemTitleTextSize = f54659a;
    private String name = "";

    /* renamed from: a */
    public Integer mo46337a() {
        return this.itemDescriptionTextColor;
    }

    /* renamed from: b */
    public Set<String> mo46338b() {
        return this.itemDescriptionTextDecoration;
    }

    /* renamed from: c */
    public Integer mo46339c() {
        return this.itemDescriptionTextSize;
    }

    /* renamed from: d */
    public Integer mo46340d() {
        return this.itemGradientBottom;
    }

    /* renamed from: e */
    public Integer mo46341e() {
        return this.itemGradientTop;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
        if (!C5015nb.m22922a(this.name, metaDataStyle.name) || !C5015nb.m22922a(this.itemGradientTop, metaDataStyle.itemGradientTop) || !C5015nb.m22922a(this.itemGradientBottom, metaDataStyle.itemGradientBottom) || !C5015nb.m22922a(this.itemTitleTextSize, metaDataStyle.itemTitleTextSize) || !C5015nb.m22922a(this.itemTitleTextColor, metaDataStyle.itemTitleTextColor) || !C5015nb.m22922a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) || !C5015nb.m22922a(this.itemDescriptionTextSize, metaDataStyle.itemDescriptionTextSize) || !C5015nb.m22922a(this.itemDescriptionTextColor, metaDataStyle.itemDescriptionTextColor) || !C5015nb.m22922a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Integer mo46343f() {
        return this.itemTitleTextColor;
    }

    /* renamed from: g */
    public Set<String> mo46344g() {
        return this.itemTitleTextDecoration;
    }

    /* renamed from: h */
    public Integer mo46345h() {
        return this.itemTitleTextSize;
    }

    public int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
