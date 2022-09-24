package p242p6;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C10227s;

/* renamed from: p6.i */
/* compiled from: MaterialShapeUtils */
public class C10893i {
    /* renamed from: a */
    static C10885d m48982a(int i) {
        if (i == 0) {
            return new C10896l();
        }
        if (i != 1) {
            return m48983b();
        }
        return new C10886e();
    }

    /* renamed from: b */
    static C10885d m48983b() {
        return new C10896l();
    }

    /* renamed from: c */
    static C10887f m48984c() {
        return new C10887f();
    }

    /* renamed from: d */
    public static void m48985d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C10889h) {
            ((C10889h) background).mo43090Z(f);
        }
    }

    /* renamed from: e */
    public static void m48986e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C10889h) {
            m48987f(view, (C10889h) background);
        }
    }

    /* renamed from: f */
    public static void m48987f(View view, C10889h hVar) {
        if (hVar.mo43085R()) {
            hVar.mo43095e0(C10227s.m47139g(view));
        }
    }
}
