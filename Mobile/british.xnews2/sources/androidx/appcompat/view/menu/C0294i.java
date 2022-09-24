package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0296j;
import p110m0.C5705d;
import p110m0.C5723u;

/* renamed from: androidx.appcompat.view.menu.i */
/* compiled from: MenuPopupHelper */
public class C0294i {

    /* renamed from: a */
    private final Context f1026a;

    /* renamed from: b */
    private final C0287e f1027b;

    /* renamed from: c */
    private final boolean f1028c;

    /* renamed from: d */
    private final int f1029d;

    /* renamed from: e */
    private final int f1030e;

    /* renamed from: f */
    private View f1031f;

    /* renamed from: g */
    private int f1032g;

    /* renamed from: h */
    private boolean f1033h;

    /* renamed from: i */
    private C0296j.C0297a f1034i;

    /* renamed from: j */
    private C0293h f1035j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1036k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1037l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* compiled from: MenuPopupHelper */
    class C0295a implements PopupWindow.OnDismissListener {
        C0295a() {
        }

        public void onDismiss() {
            C0294i.this.mo1259e();
        }
    }

    public C0294i(Context context, C0287e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0293h m1515a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1026a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1026a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p072f.C5241d.f22842c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f1026a
            android.view.View r3 = r14.f1031f
            int r4 = r14.f1029d
            int r5 = r14.f1030e
            boolean r6 = r14.f1028c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f1026a
            androidx.appcompat.view.menu.e r9 = r14.f1027b
            android.view.View r10 = r14.f1031f
            int r11 = r14.f1029d
            int r12 = r14.f1030e
            boolean r13 = r14.f1028c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.e r1 = r14.f1027b
            r0.mo1050m(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1037l
            r0.mo1059v(r1)
            android.view.View r1 = r14.f1031f
            r0.mo1054q(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f1034i
            r0.mo1031g(r1)
            boolean r1 = r14.f1033h
            r0.mo1055s(r1)
            int r1 = r14.f1032g
            r0.mo1057t(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0294i.m1515a():androidx.appcompat.view.menu.h");
    }

    /* renamed from: l */
    private void m1516l(int i, int i2, boolean z, boolean z2) {
        C0293h c = mo1257c();
        c.mo1060w(z2);
        if (z) {
            if ((C5705d.m25206b(this.f1032g, C5723u.m25265B(this.f1031f)) & 7) == 5) {
                i -= this.f1031f.getWidth();
            }
            c.mo1058u(i);
            c.mo1061x(i2);
            int i3 = (int) ((this.f1026a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1255r(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.show();
    }

    /* renamed from: b */
    public void mo1256b() {
        if (mo1258d()) {
            this.f1035j.dismiss();
        }
    }

    /* renamed from: c */
    public C0293h mo1257c() {
        if (this.f1035j == null) {
            this.f1035j = m1515a();
        }
        return this.f1035j;
    }

    /* renamed from: d */
    public boolean mo1258d() {
        C0293h hVar = this.f1035j;
        return hVar != null && hVar.mo1044a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1259e() {
        this.f1035j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1036k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1260f(View view) {
        this.f1031f = view;
    }

    /* renamed from: g */
    public void mo1261g(boolean z) {
        this.f1033h = z;
        C0293h hVar = this.f1035j;
        if (hVar != null) {
            hVar.mo1055s(z);
        }
    }

    /* renamed from: h */
    public void mo1262h(int i) {
        this.f1032g = i;
    }

    /* renamed from: i */
    public void mo1263i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1036k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1264j(C0296j.C0297a aVar) {
        this.f1034i = aVar;
        C0293h hVar = this.f1035j;
        if (hVar != null) {
            hVar.mo1031g(aVar);
        }
    }

    /* renamed from: k */
    public void mo1265k() {
        if (!mo1266m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1266m() {
        if (mo1258d()) {
            return true;
        }
        if (this.f1031f == null) {
            return false;
        }
        m1516l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1267n(int i, int i2) {
        if (mo1258d()) {
            return true;
        }
        if (this.f1031f == null) {
            return false;
        }
        m1516l(i, i2, true, true);
        return true;
    }

    public C0294i(Context context, C0287e eVar, View view, boolean z, int i, int i2) {
        this.f1032g = 8388611;
        this.f1037l = new C0295a();
        this.f1026a = context;
        this.f1027b = eVar;
        this.f1031f = view;
        this.f1028c = z;
        this.f1029d = i;
        this.f1030e = i2;
    }
}
