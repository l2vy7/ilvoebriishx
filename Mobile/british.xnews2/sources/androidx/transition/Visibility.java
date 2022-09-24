package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1287a;
import androidx.transition.Transition;
import p010b0.C1532g;
import p111m1.C5746b;

public abstract class Visibility extends Transition {

    /* renamed from: M */
    private static final String[] f5828M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L */
    private int f5829L = 3;

    /* renamed from: androidx.transition.Visibility$a */
    class C1284a extends C1330r {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5830a;

        /* renamed from: b */
        final /* synthetic */ View f5831b;

        /* renamed from: c */
        final /* synthetic */ View f5832c;

        C1284a(ViewGroup viewGroup, View view, View view2) {
            this.f5830a = viewGroup;
            this.f5831b = view;
            this.f5832c = view2;
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
            C1289a0.m7004b(this.f5830a).mo6390d(this.f5831b);
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            this.f5832c.setTag(C5746b.save_overlay_view, (Object) null);
            C1289a0.m7004b(this.f5830a).mo6390d(this.f5831b);
            transition.mo6246i0(this);
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
            if (this.f5831b.getParent() == null) {
                C1289a0.m7004b(this.f5830a).mo6389c(this.f5831b);
            } else {
                Visibility.this.mo6245i();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    private static class C1285b extends AnimatorListenerAdapter implements Transition.C1281f, C1287a.C1288a {

        /* renamed from: a */
        private final View f5834a;

        /* renamed from: b */
        private final int f5835b;

        /* renamed from: c */
        private final ViewGroup f5836c;

        /* renamed from: d */
        private final boolean f5837d;

        /* renamed from: e */
        private boolean f5838e;

        /* renamed from: f */
        boolean f5839f = false;

        C1285b(View view, int i, boolean z) {
            this.f5834a = view;
            this.f5835b = i;
            this.f5836c = (ViewGroup) view.getParent();
            this.f5837d = z;
            m6994g(true);
        }

        /* renamed from: f */
        private void m6993f() {
            if (!this.f5839f) {
                C1305f0.m7068i(this.f5834a, this.f5835b);
                ViewGroup viewGroup = this.f5836c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6994g(false);
        }

        /* renamed from: g */
        private void m6994g(boolean z) {
            ViewGroup viewGroup;
            if (this.f5837d && this.f5838e != z && (viewGroup = this.f5836c) != null) {
                this.f5838e = z;
                C1289a0.m7006d(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo6269a(Transition transition) {
        }

        /* renamed from: b */
        public void mo6183b(Transition transition) {
            m6994g(false);
        }

        /* renamed from: c */
        public void mo6184c(Transition transition) {
            m6993f();
            transition.mo6246i0(this);
        }

        /* renamed from: d */
        public void mo6185d(Transition transition) {
        }

        /* renamed from: e */
        public void mo6186e(Transition transition) {
            m6994g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5839f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m6993f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f5839f) {
                C1305f0.m7068i(this.f5834a, this.f5835b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f5839f) {
                C1305f0.m7068i(this.f5834a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    private static class C1286c {

        /* renamed from: a */
        boolean f5840a;

        /* renamed from: b */
        boolean f5841b;

        /* renamed from: c */
        int f5842c;

        /* renamed from: d */
        int f5843d;

        /* renamed from: e */
        ViewGroup f5844e;

        /* renamed from: f */
        ViewGroup f5845f;

        C1286c() {
        }
    }

    public Visibility() {
    }

    /* renamed from: w0 */
    private void m6977w0(C1336u uVar) {
        uVar.f5949a.put("android:visibility:visibility", Integer.valueOf(uVar.f5950b.getVisibility()));
        uVar.f5949a.put("android:visibility:parent", uVar.f5950b.getParent());
        int[] iArr = new int[2];
        uVar.f5950b.getLocationOnScreen(iArr);
        uVar.f5949a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: y0 */
    private C1286c m6978y0(C1336u uVar, C1336u uVar2) {
        C1286c cVar = new C1286c();
        cVar.f5840a = false;
        cVar.f5841b = false;
        if (uVar == null || !uVar.f5949a.containsKey("android:visibility:visibility")) {
            cVar.f5842c = -1;
            cVar.f5844e = null;
        } else {
            cVar.f5842c = ((Integer) uVar.f5949a.get("android:visibility:visibility")).intValue();
            cVar.f5844e = (ViewGroup) uVar.f5949a.get("android:visibility:parent");
        }
        if (uVar2 == null || !uVar2.f5949a.containsKey("android:visibility:visibility")) {
            cVar.f5843d = -1;
            cVar.f5845f = null;
        } else {
            cVar.f5843d = ((Integer) uVar2.f5949a.get("android:visibility:visibility")).intValue();
            cVar.f5845f = (ViewGroup) uVar2.f5949a.get("android:visibility:parent");
        }
        if (uVar != null && uVar2 != null) {
            int i = cVar.f5842c;
            int i2 = cVar.f5843d;
            if (i == i2 && cVar.f5844e == cVar.f5845f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f5841b = false;
                    cVar.f5840a = true;
                } else if (i2 == 0) {
                    cVar.f5841b = true;
                    cVar.f5840a = true;
                }
            } else if (cVar.f5845f == null) {
                cVar.f5841b = false;
                cVar.f5840a = true;
            } else if (cVar.f5844e == null) {
                cVar.f5841b = true;
                cVar.f5840a = true;
            }
        } else if (uVar == null && cVar.f5843d == 0) {
            cVar.f5841b = true;
            cVar.f5840a = true;
        } else if (uVar2 == null && cVar.f5842c == 0) {
            cVar.f5841b = false;
            cVar.f5840a = true;
        }
        return cVar;
    }

    /* renamed from: A0 */
    public Animator mo6281A0(ViewGroup viewGroup, C1336u uVar, int i, C1336u uVar2, int i2) {
        if ((this.f5829L & 1) != 1 || uVar2 == null) {
            return null;
        }
        if (uVar == null) {
            View view = (View) uVar2.f5950b.getParent();
            if (m6978y0(mo6227K(view, false), mo6236V(view, false)).f5840a) {
                return null;
            }
        }
        return mo6215z0(viewGroup, uVar2.f5950b, uVar, uVar2);
    }

    /* renamed from: B0 */
    public Animator mo6214B0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f5809x != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6282C0(android.view.ViewGroup r18, androidx.transition.C1336u r19, int r20, androidx.transition.C1336u r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f5829L
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f5950b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f5950b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p111m1.C5746b.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            androidx.transition.u r14 = r0.mo6236V(r13, r12)
            androidx.transition.u r15 = r0.mo6227K(r13, r12)
            androidx.transition.Visibility$c r14 = r0.m6978y0(r14, r15)
            boolean r14 = r14.f5840a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.C1334t.m7139a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f5809x
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f5949a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            androidx.transition.z r4 = androidx.transition.C1289a0.m7004b(r18)
            r4.mo6389c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo6214B0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            androidx.transition.z r1 = androidx.transition.C1289a0.m7004b(r18)
            r1.mo6390d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.Visibility$a r3 = new androidx.transition.Visibility$a
            r3.<init>(r1, r10, r5)
            r0.mo6239a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            androidx.transition.C1305f0.m7068i(r8, r11)
            android.animation.Animator r1 = r0.mo6214B0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.Visibility$b r2 = new androidx.transition.Visibility$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            androidx.transition.C1287a.m7000a(r1, r2)
            r0.mo6239a(r2)
            goto L_0x0106
        L_0x0103:
            androidx.transition.C1305f0.m7068i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo6282C0(android.view.ViewGroup, androidx.transition.u, int, androidx.transition.u, int):android.animation.Animator");
    }

    /* renamed from: D0 */
    public void mo6283D0(int i) {
        if ((i & -4) == 0) {
            this.f5829L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return f5828M;
    }

    /* renamed from: W */
    public boolean mo6237W(C1336u uVar, C1336u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f5949a.containsKey("android:visibility:visibility") != uVar.f5949a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1286c y0 = m6978y0(uVar, uVar2);
        if (!y0.f5840a) {
            return false;
        }
        if (y0.f5842c == 0 || y0.f5843d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo6152k(C1336u uVar) {
        m6977w0(uVar);
    }

    /* renamed from: n */
    public void mo6153n(C1336u uVar) {
        m6977w0(uVar);
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        C1286c y0 = m6978y0(uVar, uVar2);
        if (!y0.f5840a) {
            return null;
        }
        if (y0.f5844e == null && y0.f5845f == null) {
            return null;
        }
        if (y0.f5841b) {
            return mo6281A0(viewGroup, uVar, y0.f5842c, uVar2, y0.f5843d);
        }
        return mo6282C0(viewGroup, uVar, y0.f5842c, uVar2, y0.f5843d);
    }

    /* renamed from: x0 */
    public int mo6284x0() {
        return this.f5829L;
    }

    /* renamed from: z0 */
    public Animator mo6215z0(ViewGroup viewGroup, View view, C1336u uVar, C1336u uVar2) {
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5929e);
        int k = C1532g.m7913k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            mo6283D0(k);
        }
    }
}
