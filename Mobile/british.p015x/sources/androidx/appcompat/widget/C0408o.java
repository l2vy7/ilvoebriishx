package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0287e;
import androidx.appcompat.view.menu.C0296j;
import p111m0.C5740y;

/* renamed from: androidx.appcompat.widget.o */
/* compiled from: DecorToolbar */
public interface C0408o {
    /* renamed from: a */
    void mo2120a(Menu menu, C0296j.C0297a aVar);

    /* renamed from: b */
    boolean mo2121b();

    /* renamed from: c */
    void mo2122c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo2124d();

    /* renamed from: e */
    boolean mo2125e();

    /* renamed from: f */
    boolean mo2126f();

    /* renamed from: g */
    boolean mo2127g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo2130h();

    /* renamed from: i */
    void mo2131i(C0431y yVar);

    /* renamed from: j */
    boolean mo2132j();

    /* renamed from: k */
    void mo2133k(int i);

    /* renamed from: l */
    void mo2134l(CharSequence charSequence);

    /* renamed from: m */
    Menu mo2135m();

    /* renamed from: n */
    void mo2136n(int i);

    /* renamed from: o */
    int mo2137o();

    /* renamed from: p */
    C5740y mo2138p(int i, long j);

    /* renamed from: q */
    void mo2139q(int i);

    /* renamed from: r */
    void mo2140r(C0296j.C0297a aVar, C0287e.C0288a aVar2);

    /* renamed from: s */
    ViewGroup mo2141s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo2148t(boolean z);

    /* renamed from: u */
    int mo2149u();

    /* renamed from: v */
    void mo2150v();

    /* renamed from: w */
    void mo2151w();

    /* renamed from: x */
    void mo2152x(boolean z);
}
