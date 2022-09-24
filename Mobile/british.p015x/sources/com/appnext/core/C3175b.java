package com.appnext.core;

import com.appnext.base.C3117a;

/* renamed from: com.appnext.core.b */
public final class C3175b {

    /* renamed from: cD */
    private String f12286cD = "";

    /* renamed from: cE */
    private String f12287cE = "";

    /* renamed from: cF */
    private int f12288cF;

    /* renamed from: cG */
    private int f12289cG;
    private String cat = "";
    private int cnt;
    private String pbk = "";

    public C3175b(C3148Ad ad) {
        try {
            this.f12286cD = ad.getPlacementID();
            this.cat = ad.getCategories();
            this.f12287cE = ad.getSpecificCategories();
            this.pbk = ad.getPostback();
            this.f12288cF = ad.getMinVideoLength();
            this.f12289cG = ad.getMaxVideoLength();
            this.cnt = ad.getCount();
        } catch (Throwable th) {
            C3117a.m10553a("AdKey$AdKey", th);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (!C3175b.class.isInstance(obj) && !obj.getClass().isInstance(this)) {
                return false;
            }
            if (obj instanceof C3175b) {
                return ((C3175b) obj).f12286cD.equals(this.f12286cD) && ((C3175b) obj).cat.equals(this.cat) && ((C3175b) obj).f12287cE.equals(this.f12287cE) && ((C3175b) obj).pbk.equals(this.pbk) && ((C3175b) obj).f12288cF == this.f12288cF && ((C3175b) obj).f12289cG == this.f12289cG && ((C3175b) obj).cnt == this.cnt;
            }
            return super.equals(obj);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final int hashCode() {
        return (((((((((((this.f12286cD.hashCode() * 31) + this.cat.hashCode()) * 31) + this.f12287cE.hashCode()) * 31) + this.pbk.hashCode()) * 31) + this.f12288cF) * 31) + this.f12289cG) * 31) + this.cnt;
    }
}
