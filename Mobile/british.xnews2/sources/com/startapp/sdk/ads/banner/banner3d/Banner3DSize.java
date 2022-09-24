package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.C11970ib;
import com.startapp.C12119p0;
import com.startapp.C5004d4;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerOptions;

/* compiled from: Sta */
public class Banner3DSize {

    /* compiled from: Sta */
    public enum Size {
        XXSMALL(new C12119p0(280, 50)),
        XSMALL(new C12119p0(300, 50)),
        SMALL(new C12119p0(320, 50)),
        MEDIUM(new C12119p0(468, 60)),
        LARGE(new C12119p0(728, 90)),
        XLARGE(new C12119p0(1024, 90));
        
        private C12119p0 size;

        private Size(C12119p0 p0Var) {
            this.size = p0Var;
        }

        public C12119p0 getSize() {
            return this.size;
        }
    }

    /* renamed from: a */
    public static boolean m52889a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, C12119p0 p0Var) {
        Point point = new Point();
        point.x = bannerOptions.mo45794o();
        point.y = bannerOptions.mo45781d();
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = Math.round(((float) (banner3D.getLayoutParams().width + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = Math.round(((float) (banner3D.getLayoutParams().height + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        view = (View) view.getParent();
                    }
                    boolean z = false;
                    boolean z2 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z) {
                            m52891c(context, point, view);
                            z = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z2) {
                            m52890b(context, point, view);
                            z2 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        m52888a(context, point, decorView);
                    } else {
                        if (!z) {
                            m52891c(context, point, view);
                        }
                        if (!z2) {
                            m52890b(context, point, view);
                        }
                    }
                } catch (Throwable th) {
                    m52888a(context, point, decorView);
                    C5004d4.m22887a(th);
                }
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        C11970ib.m52471a(context, windowManager, point);
                    }
                } catch (Throwable th2) {
                    C5004d4.m22887a(th2);
                }
            }
        }
        C12119p0 p0Var2 = new C12119p0(point.x, point.y);
        Point point2 = p0Var2.f53990a;
        p0Var.mo45650a(point2.x, point2.y);
        boolean z3 = false;
        for (Size size : Size.values()) {
            if (size.getSize().f53990a.x <= p0Var2.f53990a.x && size.getSize().f53990a.y <= p0Var2.f53990a.y) {
                bannerOptions.mo45778a(size.getSize().f53990a.x, size.getSize().f53990a.y);
                z3 = true;
            }
        }
        if (!z3) {
            bannerOptions.mo45778a(0, 0);
        }
        return z3;
    }

    /* renamed from: b */
    public static void m52890b(Context context, Point point, View view) {
        point.y = Math.round(((float) ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop())) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static void m52891c(Context context, Point point, View view) {
        point.x = Math.round(((float) ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight())) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static void m52888a(Context context, Point point, View view) {
        point.x = Math.round(((float) view.getMeasuredWidth()) / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(((float) view.getMeasuredHeight()) / context.getResources().getDisplayMetrics().density);
    }
}
