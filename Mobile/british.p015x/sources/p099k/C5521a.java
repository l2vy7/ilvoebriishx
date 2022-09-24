package p099k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p073f.C5238a;
import p073f.C5239b;
import p073f.C5241d;
import p073f.C5247j;

/* renamed from: k.a */
/* compiled from: ActionBarPolicy */
public class C5521a {

    /* renamed from: a */
    private Context f23960a;

    private C5521a(Context context) {
        this.f23960a = context;
    }

    /* renamed from: b */
    public static C5521a m24610b(Context context) {
        return new C5521a(context);
    }

    /* renamed from: a */
    public boolean mo22005a() {
        return this.f23960a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo22006c() {
        return this.f23960a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo22007d() {
        Configuration configuration = this.f23960a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo22008e() {
        return this.f23960a.getResources().getDimensionPixelSize(C5241d.f22841b);
    }

    /* renamed from: f */
    public int mo22009f() {
        TypedArray obtainStyledAttributes = this.f23960a.obtainStyledAttributes((AttributeSet) null, C5247j.f23110a, C5238a.f22807c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C5247j.f23156j, 0);
        Resources resources = this.f23960a.getResources();
        if (!mo22010g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C5241d.f22840a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo22010g() {
        return this.f23960a.getResources().getBoolean(C5239b.f22831a);
    }

    /* renamed from: h */
    public boolean mo22011h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f23960a).hasPermanentMenuKey();
    }
}
