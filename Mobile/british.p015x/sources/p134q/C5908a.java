package p134q;

import android.os.Bundle;

/* renamed from: q.a */
/* compiled from: CustomTabColorSchemeParams */
public final class C5908a {

    /* renamed from: a */
    public final Integer f24756a;

    /* renamed from: b */
    public final Integer f24757b;

    /* renamed from: c */
    public final Integer f24758c;

    /* renamed from: d */
    public final Integer f24759d;

    /* renamed from: q.a$a */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C5909a {

        /* renamed from: a */
        private Integer f24760a;

        /* renamed from: b */
        private Integer f24761b;

        /* renamed from: c */
        private Integer f24762c;

        /* renamed from: d */
        private Integer f24763d;

        /* renamed from: a */
        public C5908a mo22899a() {
            return new C5908a(this.f24760a, this.f24761b, this.f24762c, this.f24763d);
        }

        /* renamed from: b */
        public C5909a mo22900b(int i) {
            this.f24760a = Integer.valueOf(i | -16777216);
            return this;
        }
    }

    C5908a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f24756a = num;
        this.f24757b = num2;
        this.f24758c = num3;
        this.f24759d = num4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo22898a() {
        Bundle bundle = new Bundle();
        Integer num = this.f24756a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f24757b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f24758c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f24759d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
