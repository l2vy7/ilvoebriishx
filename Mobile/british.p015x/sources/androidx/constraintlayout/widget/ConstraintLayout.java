package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p166w.C6246e;
import p166w.C6249f;
import p166w.C6252h;
import p171x.C6317b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    SparseArray<View> f2319b = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayList<ConstraintHelper> f2320c = new ArrayList<>(4);
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public C6249f f2321d = new C6249f();

    /* renamed from: e */
    private int f2322e = 0;

    /* renamed from: f */
    private int f2323f = 0;

    /* renamed from: g */
    private int f2324g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f2325h = Integer.MAX_VALUE;

    /* renamed from: i */
    protected boolean f2326i = true;

    /* renamed from: j */
    private int f2327j = 263;

    /* renamed from: k */
    private C0564c f2328k = null;

    /* renamed from: l */
    protected C0561b f2329l = null;

    /* renamed from: m */
    private int f2330m = -1;

    /* renamed from: n */
    private HashMap<String, Integer> f2331n = new HashMap<>();

    /* renamed from: o */
    private int f2332o = -1;

    /* renamed from: p */
    private int f2333p = -1;

    /* renamed from: q */
    int f2334q = -1;

    /* renamed from: r */
    int f2335r = -1;

    /* renamed from: s */
    int f2336s = 0;

    /* renamed from: t */
    int f2337t = 0;

    /* renamed from: u */
    private SparseArray<C6246e> f2338u = new SparseArray<>();

    /* renamed from: v */
    C0557b f2339v = new C0557b(this);

    /* renamed from: w */
    private int f2340w = 0;

    /* renamed from: x */
    private int f2341x = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0556a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2410a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                w.e$b[] r0 = p166w.C6246e.C6248b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2410a = r0
                w.e$b r1 = p166w.C6246e.C6248b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2410a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.e$b r1 = p166w.C6246e.C6248b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2410a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.e$b r1 = p166w.C6246e.C6248b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2410a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w.e$b r1 = p166w.C6246e.C6248b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0556a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    class C0557b implements C6317b.C6319b {

        /* renamed from: a */
        ConstraintLayout f2411a;

        /* renamed from: b */
        int f2412b;

        /* renamed from: c */
        int f2413c;

        /* renamed from: d */
        int f2414d;

        /* renamed from: e */
        int f2415e;

        /* renamed from: f */
        int f2416f;

        /* renamed from: g */
        int f2417g;

        public C0557b(ConstraintLayout constraintLayout) {
            this.f2411a = constraintLayout;
        }

        /* renamed from: a */
        public final void mo2861a() {
            int childCount = this.f2411a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2411a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo2879b(this.f2411a);
                }
            }
            int size = this.f2411a.f2320c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f2411a.f2320c.get(i2)).mo2819q(this.f2411a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x016c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01d2  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x020e A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0140  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0161  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2862b(p166w.C6246e r20, p171x.C6317b.C6318a r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r20.mo23807P()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r20.mo23814X()
                if (r3 != 0) goto L_0x001f
                r2.f26085e = r5
                r2.f26086f = r5
                r2.f26087g = r5
                return
            L_0x001f:
                w.e$b r3 = r2.f26081a
                w.e$b r4 = r2.f26082b
                int r6 = r2.f26083c
                int r7 = r2.f26084d
                int r8 = r0.f2412b
                int r9 = r0.f2413c
                int r8 = r8 + r9
                int r9 = r0.f2414d
                java.lang.Object r10 = r20.mo23843r()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0556a.f2410a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r5 = 2
                r15 = 1
                if (r12 == r15) goto L_0x00a5
                if (r12 == r5) goto L_0x0098
                if (r12 == r14) goto L_0x0087
                if (r12 == r13) goto L_0x004b
                r6 = 0
            L_0x0049:
                r9 = 0
                goto L_0x00b1
            L_0x004b:
                int r6 = r0.f2416f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f25781l
                if (r9 != r15) goto L_0x0058
                r9 = 1
                goto L_0x0059
            L_0x0058:
                r9 = 0
            L_0x0059:
                int[] r12 = r1.f25773h
                r16 = 0
                r12[r5] = r16
                boolean r13 = r2.f26090j
                if (r13 == 0) goto L_0x00a3
                if (r9 == 0) goto L_0x0071
                r13 = r12[r14]
                if (r13 == 0) goto L_0x0071
                r12 = r12[r16]
                int r13 = r20.mo23808Q()
                if (r12 != r13) goto L_0x0075
            L_0x0071:
                boolean r12 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r12 == 0) goto L_0x0077
            L_0x0075:
                r12 = 1
                goto L_0x0078
            L_0x0077:
                r12 = 0
            L_0x0078:
                if (r9 == 0) goto L_0x007c
                if (r12 == 0) goto L_0x00a3
            L_0x007c:
                int r6 = r20.mo23808Q()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x0049
            L_0x0087:
                int r6 = r0.f2416f
                int r12 = r20.mo23781A()
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f25773h
                r9[r5] = r12
                goto L_0x0049
            L_0x0098:
                int r6 = r0.f2416f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f25773h
                r9[r5] = r12
            L_0x00a3:
                r9 = 1
                goto L_0x00b1
            L_0x00a5:
                r9 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                int[] r9 = r1.f25773h
                r9[r5] = r6
                r6 = r12
                goto L_0x0049
            L_0x00b1:
                int r12 = r4.ordinal()
                r11 = r11[r12]
                if (r11 == r15) goto L_0x011e
                if (r11 == r5) goto L_0x0110
                if (r11 == r14) goto L_0x00fe
                r7 = 4
                if (r11 == r7) goto L_0x00c3
                r7 = 0
                r11 = 0
                goto L_0x0129
            L_0x00c3:
                int r7 = r0.f2417g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int r8 = r1.f25783m
                if (r8 != r15) goto L_0x00d0
                r8 = 1
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                int[] r11 = r1.f25773h
                r12 = 0
                r11[r14] = r12
                boolean r12 = r2.f26090j
                if (r12 == 0) goto L_0x011b
                if (r8 == 0) goto L_0x00e8
                r12 = r11[r5]
                if (r12 == 0) goto L_0x00e8
                r11 = r11[r15]
                int r12 = r20.mo23853w()
                if (r11 != r12) goto L_0x00ec
            L_0x00e8:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r11 == 0) goto L_0x00ee
            L_0x00ec:
                r11 = 1
                goto L_0x00ef
            L_0x00ee:
                r11 = 0
            L_0x00ef:
                if (r8 == 0) goto L_0x00f3
                if (r11 == 0) goto L_0x011b
            L_0x00f3:
                int r7 = r20.mo23853w()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x010e
            L_0x00fe:
                int r7 = r0.f2417g
                int r11 = r20.mo23806O()
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f25773h
                r8[r14] = r11
            L_0x010e:
                r11 = r7
                goto L_0x0128
            L_0x0110:
                int r7 = r0.f2417g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f25773h
                r8[r14] = r11
            L_0x011b:
                r11 = r7
                r7 = 1
                goto L_0x0129
            L_0x011e:
                r8 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                int[] r8 = r1.f25773h
                r8[r14] = r7
            L_0x0128:
                r7 = 0
            L_0x0129:
                w.e$b r8 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x012f
                r12 = 1
                goto L_0x0130
            L_0x012f:
                r12 = 0
            L_0x0130:
                if (r4 != r8) goto L_0x0134
                r8 = 1
                goto L_0x0135
            L_0x0134:
                r8 = 0
            L_0x0135:
                w.e$b r13 = p166w.C6246e.C6248b.MATCH_PARENT
                if (r4 == r13) goto L_0x0140
                w.e$b r14 = p166w.C6246e.C6248b.FIXED
                if (r4 != r14) goto L_0x013e
                goto L_0x0140
            L_0x013e:
                r4 = 0
                goto L_0x0141
            L_0x0140:
                r4 = 1
            L_0x0141:
                if (r3 == r13) goto L_0x014a
                w.e$b r13 = p166w.C6246e.C6248b.FIXED
                if (r3 != r13) goto L_0x0148
                goto L_0x014a
            L_0x0148:
                r3 = 0
                goto L_0x014b
            L_0x014a:
                r3 = 1
            L_0x014b:
                r13 = 0
                if (r12 == 0) goto L_0x0156
                float r14 = r1.f25751S
                int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
                if (r14 <= 0) goto L_0x0156
                r14 = 1
                goto L_0x0157
            L_0x0156:
                r14 = 0
            L_0x0157:
                if (r8 == 0) goto L_0x0161
                float r15 = r1.f25751S
                int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r13 <= 0) goto L_0x0161
                r13 = 1
                goto L_0x0162
            L_0x0161:
                r13 = 0
            L_0x0162:
                android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r15 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r15
                boolean r5 = r2.f26090j
                if (r5 != 0) goto L_0x0181
                if (r12 == 0) goto L_0x0181
                int r5 = r1.f25781l
                if (r5 != 0) goto L_0x0181
                if (r8 == 0) goto L_0x0181
                int r5 = r1.f25783m
                if (r5 == 0) goto L_0x0179
                goto L_0x0181
            L_0x0179:
                r0 = 0
                r3 = 0
                r4 = 0
                r5 = -1
                r16 = 0
                goto L_0x0234
            L_0x0181:
                boolean r5 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r5 == 0) goto L_0x0193
                boolean r5 = r1 instanceof p166w.C6257l
                if (r5 == 0) goto L_0x0193
                r5 = r1
                w.l r5 = (p166w.C6257l) r5
                r8 = r10
                androidx.constraintlayout.widget.VirtualLayout r8 = (androidx.constraintlayout.widget.VirtualLayout) r8
                r8.mo2508v(r5, r6, r11)
                goto L_0x0196
            L_0x0193:
                r10.measure(r6, r11)
            L_0x0196:
                int r5 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                if (r9 == 0) goto L_0x01af
                int[] r9 = r1.f25773h
                r16 = 0
                r9[r16] = r5
                r18 = 2
                r9[r18] = r8
                goto L_0x01b9
            L_0x01af:
                r16 = 0
                r18 = 2
                int[] r9 = r1.f25773h
                r9[r16] = r16
                r9[r18] = r16
            L_0x01b9:
                if (r7 == 0) goto L_0x01c5
                int[] r7 = r1.f25773h
                r9 = 1
                r7[r9] = r8
                r17 = 3
                r7[r17] = r5
                goto L_0x01ce
            L_0x01c5:
                r9 = 1
                r17 = 3
                int[] r7 = r1.f25773h
                r7[r9] = r16
                r7[r17] = r16
            L_0x01ce:
                int r7 = r1.f25787o
                if (r7 <= 0) goto L_0x01d7
                int r7 = java.lang.Math.max(r7, r5)
                goto L_0x01d8
            L_0x01d7:
                r7 = r5
            L_0x01d8:
                int r9 = r1.f25789p
                if (r9 <= 0) goto L_0x01e0
                int r7 = java.lang.Math.min(r9, r7)
            L_0x01e0:
                int r9 = r1.f25793r
                if (r9 <= 0) goto L_0x01e9
                int r9 = java.lang.Math.max(r9, r8)
                goto L_0x01ea
            L_0x01e9:
                r9 = r8
            L_0x01ea:
                int r0 = r1.f25795s
                if (r0 <= 0) goto L_0x01f2
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01f2:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r14 == 0) goto L_0x0201
                if (r4 == 0) goto L_0x0201
                float r3 = r1.f25751S
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r7 = r0
                goto L_0x020c
            L_0x0201:
                if (r13 == 0) goto L_0x020c
                if (r3 == 0) goto L_0x020c
                float r3 = r1.f25751S
                float r4 = (float) r7
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r9 = r0
            L_0x020c:
                if (r5 != r7) goto L_0x0216
                if (r8 == r9) goto L_0x0211
                goto L_0x0216
            L_0x0211:
                r0 = r7
                r3 = r9
                r4 = r12
            L_0x0214:
                r5 = -1
                goto L_0x0234
            L_0x0216:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r7) goto L_0x021e
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            L_0x021e:
                if (r8 == r9) goto L_0x0224
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x0224:
                r10.measure(r6, r11)
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                goto L_0x0214
            L_0x0234:
                if (r4 == r5) goto L_0x0238
                r5 = 1
                goto L_0x0239
            L_0x0238:
                r5 = 0
            L_0x0239:
                int r6 = r2.f26083c
                if (r0 != r6) goto L_0x0244
                int r6 = r2.f26084d
                if (r3 == r6) goto L_0x0242
                goto L_0x0244
            L_0x0242:
                r6 = 0
                goto L_0x0245
            L_0x0244:
                r6 = 1
            L_0x0245:
                r2.f26089i = r6
                boolean r6 = r15.f2366Y
                if (r6 == 0) goto L_0x024d
                r9 = 1
                goto L_0x024e
            L_0x024d:
                r9 = r5
            L_0x024e:
                if (r9 == 0) goto L_0x025c
                r5 = -1
                if (r4 == r5) goto L_0x025c
                int r1 = r20.mo23837o()
                if (r1 == r4) goto L_0x025c
                r1 = 1
                r2.f26089i = r1
            L_0x025c:
                r2.f26085e = r0
                r2.f26086f = r3
                r2.f26088h = r9
                r2.f26087g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0557b.mo2862b(w.e, x.b$a):void");
        }

        /* renamed from: c */
        public void mo2863c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2412b = i3;
            this.f2413c = i4;
            this.f2414d = i5;
            this.f2415e = i6;
            this.f2416f = i;
            this.f2417g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3020p(attributeSet, 0, 0);
    }

    /* renamed from: g */
    private final C6246e m3019g(int i) {
        if (i == 0) {
            return this.f2321d;
        }
        View view = this.f2319b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2321d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2395n0;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    /* renamed from: p */
    private void m3020p(AttributeSet attributeSet, int i, int i2) {
        this.f2321d.mo23820d0(this);
        this.f2321d.mo23877h1(this.f2339v);
        this.f2319b.put(getId(), this);
        this.f2328k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0572f.f2908k1) {
                    this.f2322e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2322e);
                } else if (index == C0572f.f2918l1) {
                    this.f2323f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2323f);
                } else if (index == C0572f.f2888i1) {
                    this.f2324g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2324g);
                } else if (index == C0572f.f2898j1) {
                    this.f2325h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2325h);
                } else if (index == C0572f.f2674L2) {
                    this.f2327j = obtainStyledAttributes.getInt(index, this.f2327j);
                } else if (index == C0572f.f2682M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2567s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2329l = null;
                        }
                    }
                } else if (index == C0572f.f2982s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0564c cVar = new C0564c();
                        this.f2328k = cVar;
                        cVar.mo2920w(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2328k = null;
                    }
                    this.f2330m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2321d.mo23878i1(this.f2327j);
    }

    /* renamed from: r */
    private void m3021r() {
        this.f2326i = true;
        this.f2332o = -1;
        this.f2333p = -1;
        this.f2334q = -1;
        this.f2335r = -1;
        this.f2336s = 0;
        this.f2337t = 0;
    }

    /* renamed from: v */
    private void m3022v() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C6246e i2 = mo2841i(getChildAt(i));
            if (i2 != null) {
                i2.mo23816Z();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2855w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m3019g(childAt.getId()).mo23822e0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2330m != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f2330m && (childAt2 instanceof Constraints)) {
                    this.f2328k = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0564c cVar = this.f2328k;
        if (cVar != null) {
            cVar.mo2906f(this, true);
        }
        this.f2321d.mo23943O0();
        int size = this.f2320c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f2320c.get(i5).mo2820s(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo2880c(this);
            }
        }
        this.f2338u.clear();
        this.f2338u.put(0, this.f2321d);
        this.f2338u.put(getId(), this.f2321d);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.f2338u.put(childAt4.getId(), mo2841i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            C6246e i9 = mo2841i(childAt5);
            if (i9 != null) {
                this.f2321d.mo23944c(i9);
                mo2826c(isInEditMode, childAt5, i9, (LayoutParams) childAt5.getLayoutParams(), this.f2338u);
            }
        }
    }

    /* renamed from: y */
    private boolean m3023y() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m3022v();
        }
        return z;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2826c(boolean r20, android.view.View r21, p166w.C6246e r22, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r23, android.util.SparseArray<p166w.C6246e> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.mo2859c()
            r10 = 0
            r8.f2397o0 = r10
            int r2 = r21.getVisibility()
            r7.mo23790E0(r2)
            boolean r2 = r8.f2371b0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo23842q0(r11)
            r2 = 8
            r7.mo23790E0(r2)
        L_0x0024:
            r7.mo23820d0(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            w.f r2 = r0.f2321d
            boolean r2 = r2.mo23873c1()
            r1.mo2486o(r7, r2)
        L_0x0036:
            boolean r1 = r8.f2367Z
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0069
            r1 = r7
            w.h r1 = (p166w.C6252h) r1
            int r3 = r8.f2389k0
            int r4 = r8.f2391l0
            float r5 = r8.f2393m0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x0050
            int r3 = r8.f2368a
            int r4 = r8.f2370b
            float r5 = r8.f2372c
        L_0x0050:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            r1.mo23916R0(r5)
            goto L_0x02cd
        L_0x005b:
            if (r3 == r12) goto L_0x0062
            r1.mo23914P0(r3)
            goto L_0x02cd
        L_0x0062:
            if (r4 == r12) goto L_0x02cd
            r1.mo23915Q0(r4)
            goto L_0x02cd
        L_0x0069:
            int r1 = r8.f2375d0
            int r3 = r8.f2377e0
            int r4 = r8.f2379f0
            int r5 = r8.f2381g0
            int r6 = r8.f2383h0
            int r13 = r8.f2385i0
            float r14 = r8.f2387j0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00b1
            int r1 = r8.f2374d
            int r2 = r8.f2376e
            int r4 = r8.f2378f
            int r5 = r8.f2380g
            int r3 = r8.f2402t
            int r6 = r8.f2404v
            float r14 = r8.f2408z
            if (r1 != r12) goto L_0x0098
            if (r2 != r12) goto L_0x0098
            int r13 = r8.f2399q
            if (r13 == r12) goto L_0x0093
            r1 = r13
            goto L_0x0098
        L_0x0093:
            int r13 = r8.f2398p
            if (r13 == r12) goto L_0x0098
            r2 = r13
        L_0x0098:
            if (r4 != r12) goto L_0x00ac
            if (r5 != r12) goto L_0x00ac
            int r13 = r8.f2400r
            if (r13 == r12) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            int r13 = r8.f2401s
            if (r13 == r12) goto L_0x00ac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00b8
        L_0x00ac:
            r13 = r4
        L_0x00ad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00b3
        L_0x00b1:
            r15 = r13
            r13 = r4
        L_0x00b3:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00b8:
            int r2 = r8.f2392m
            if (r2 == r12) goto L_0x00cd
            java.lang.Object r1 = r9.get(r2)
            w.e r1 = (p166w.C6246e) r1
            if (r1 == 0) goto L_0x01fe
            float r2 = r8.f2396o
            int r3 = r8.f2394n
            r7.mo23830k(r1, r2, r3)
            goto L_0x01fe
        L_0x00cd:
            if (r1 == r12) goto L_0x00ec
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x00e9
            w.d$b r4 = p166w.C6243d.C6245b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            r1.mo23812U(r2, r3, r4, r5, r6)
            goto L_0x0104
        L_0x00e9:
            r17 = r5
            goto L_0x0104
        L_0x00ec:
            r17 = r5
            if (r3 == r12) goto L_0x0104
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x0104
            w.d$b r2 = p166w.C6243d.C6245b.LEFT
            w.d$b r4 = p166w.C6243d.C6245b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
            r1.mo23812U(r2, r3, r4, r5, r6)
        L_0x0104:
            if (r13 == r12) goto L_0x011c
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x0132
            w.d$b r2 = p166w.C6243d.C6245b.RIGHT
            w.d$b r4 = p166w.C6243d.C6245b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            r6 = r15
            r1.mo23812U(r2, r3, r4, r5, r6)
            goto L_0x0132
        L_0x011c:
            if (r14 == r12) goto L_0x0132
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x0132
            w.d$b r4 = p166w.C6243d.C6245b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
            r6 = r15
            r1.mo23812U(r2, r3, r4, r5, r6)
        L_0x0132:
            int r1 = r8.f2382h
            if (r1 == r12) goto L_0x014c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x0166
            w.d$b r4 = p166w.C6243d.C6245b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f2403u
            r1 = r22
            r2 = r4
            r1.mo23812U(r2, r3, r4, r5, r6)
            goto L_0x0166
        L_0x014c:
            int r1 = r8.f2384i
            if (r1 == r12) goto L_0x0166
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x0166
            w.d$b r2 = p166w.C6243d.C6245b.TOP
            w.d$b r4 = p166w.C6243d.C6245b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f2403u
            r1 = r22
            r1.mo23812U(r2, r3, r4, r5, r6)
        L_0x0166:
            int r1 = r8.f2386j
            if (r1 == r12) goto L_0x0181
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x019a
            w.d$b r2 = p166w.C6243d.C6245b.BOTTOM
            w.d$b r4 = p166w.C6243d.C6245b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f2405w
            r1 = r22
            r1.mo23812U(r2, r3, r4, r5, r6)
            goto L_0x019a
        L_0x0181:
            int r1 = r8.f2388k
            if (r1 == r12) goto L_0x019a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            w.e r3 = (p166w.C6246e) r3
            if (r3 == 0) goto L_0x019a
            w.d$b r4 = p166w.C6243d.C6245b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f2405w
            r1 = r22
            r2 = r4
            r1.mo23812U(r2, r3, r4, r5, r6)
        L_0x019a:
            int r1 = r8.f2390l
            if (r1 == r12) goto L_0x01eb
            android.util.SparseArray<android.view.View> r2 = r0.f2319b
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f2390l
            java.lang.Object r2 = r9.get(r2)
            w.e r2 = (p166w.C6246e) r2
            if (r2 == 0) goto L_0x01eb
            if (r1 == 0) goto L_0x01eb
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x01eb
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r8.f2366Y = r11
            r1.f2366Y = r11
            w.d$b r3 = p166w.C6243d.C6245b.BASELINE
            w.d r4 = r7.mo23835n(r3)
            w.d r2 = r2.mo23835n(r3)
            r4.mo23767b(r2, r10, r12, r11)
            r7.mo23825h0(r11)
            w.e r1 = r1.f2395n0
            r1.mo23825h0(r11)
            w.d$b r1 = p166w.C6243d.C6245b.TOP
            w.d r1 = r7.mo23835n(r1)
            r1.mo23777l()
            w.d$b r1 = p166w.C6243d.C6245b.BOTTOM
            w.d r1 = r7.mo23835n(r1)
            r1.mo23777l()
        L_0x01eb:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01f5
            r7.mo23829j0(r14)
        L_0x01f5:
            float r2 = r8.f2342A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01fe
            r7.mo23858y0(r2)
        L_0x01fe:
            if (r20 == 0) goto L_0x020d
            int r1 = r8.f2358Q
            if (r1 != r12) goto L_0x0208
            int r2 = r8.f2359R
            if (r2 == r12) goto L_0x020d
        L_0x0208:
            int r2 = r8.f2359R
            r7.mo23854w0(r1, r2)
        L_0x020d:
            boolean r1 = r8.f2364W
            r2 = -2
            if (r1 != 0) goto L_0x0243
            int r1 = r8.width
            if (r1 != r12) goto L_0x023a
            boolean r1 = r8.f2361T
            if (r1 == 0) goto L_0x0220
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            r7.mo23834m0(r1)
            goto L_0x0225
        L_0x0220:
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_PARENT
            r7.mo23834m0(r1)
        L_0x0225:
            w.d$b r1 = p166w.C6243d.C6245b.LEFT
            w.d r1 = r7.mo23835n(r1)
            int r3 = r8.leftMargin
            r1.f25713e = r3
            w.d$b r1 = p166w.C6243d.C6245b.RIGHT
            w.d r1 = r7.mo23835n(r1)
            int r3 = r8.rightMargin
            r1.f25713e = r3
            goto L_0x0256
        L_0x023a:
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            r7.mo23834m0(r1)
            r7.mo23792F0(r10)
            goto L_0x0256
        L_0x0243:
            w.e$b r1 = p166w.C6246e.C6248b.FIXED
            r7.mo23834m0(r1)
            int r1 = r8.width
            r7.mo23792F0(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0256
            w.e$b r1 = p166w.C6246e.C6248b.WRAP_CONTENT
            r7.mo23834m0(r1)
        L_0x0256:
            boolean r1 = r8.f2365X
            if (r1 != 0) goto L_0x028b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0282
            boolean r1 = r8.f2362U
            if (r1 == 0) goto L_0x0268
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            r7.mo23784B0(r1)
            goto L_0x026d
        L_0x0268:
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_PARENT
            r7.mo23784B0(r1)
        L_0x026d:
            w.d$b r1 = p166w.C6243d.C6245b.TOP
            w.d r1 = r7.mo23835n(r1)
            int r2 = r8.topMargin
            r1.f25713e = r2
            w.d$b r1 = p166w.C6243d.C6245b.BOTTOM
            w.d r1 = r7.mo23835n(r1)
            int r2 = r8.bottomMargin
            r1.f25713e = r2
            goto L_0x029e
        L_0x0282:
            w.e$b r1 = p166w.C6246e.C6248b.MATCH_CONSTRAINT
            r7.mo23784B0(r1)
            r7.mo23827i0(r10)
            goto L_0x029e
        L_0x028b:
            w.e$b r1 = p166w.C6246e.C6248b.FIXED
            r7.mo23784B0(r1)
            int r1 = r8.height
            r7.mo23827i0(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x029e
            w.e$b r1 = p166w.C6246e.C6248b.WRAP_CONTENT
            r7.mo23784B0(r1)
        L_0x029e:
            java.lang.String r1 = r8.f2343B
            r7.mo23823f0(r1)
            float r1 = r8.f2346E
            r7.mo23838o0(r1)
            float r1 = r8.f2347F
            r7.mo23788D0(r1)
            int r1 = r8.f2348G
            r7.mo23831k0(r1)
            int r1 = r8.f2349H
            r7.mo23860z0(r1)
            int r1 = r8.f2350I
            int r2 = r8.f2352K
            int r3 = r8.f2354M
            float r4 = r8.f2356O
            r7.mo23836n0(r1, r2, r3, r4)
            int r1 = r8.f2351J
            int r2 = r8.f2353L
            int r3 = r8.f2355N
            float r4 = r8.f2357P
            r7.mo23786C0(r1, r2, r3, r4)
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2826c(boolean, android.view.View, w.e, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2320c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2320c.get(i).mo2511r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: f */
    public Object mo2830f(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2331n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2331n.get(str);
    }

    public void forceLayout() {
        m3021r();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f2325h;
    }

    public int getMaxWidth() {
        return this.f2324g;
    }

    public int getMinHeight() {
        return this.f2323f;
    }

    public int getMinWidth() {
        return this.f2322e;
    }

    public int getOptimizationLevel() {
        return this.f2321d.mo23868X0();
    }

    /* renamed from: h */
    public View mo2840h(int i) {
        return this.f2319b.get(i);
    }

    /* renamed from: i */
    public final C6246e mo2841i(View view) {
        if (view == this) {
            return this.f2321d;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2395n0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C6246e eVar = layoutParams.f2395n0;
            if ((childAt.getVisibility() != 8 || layoutParams.f2367Z || layoutParams.f2369a0 || layoutParams.f2373c0 || isInEditMode) && !layoutParams.f2371b0) {
                int R = eVar.mo23809R();
                int S = eVar.mo23810S();
                int Q = eVar.mo23808Q() + R;
                int w = eVar.mo23853w() + S;
                childAt.layout(R, S, Q, w);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(R, S, Q, w);
                }
            }
        }
        int size = this.f2320c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2320c.get(i6).mo2510p(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f2340w = i;
        this.f2341x = i2;
        this.f2321d.mo23879j1(mo2842q());
        if (this.f2326i) {
            this.f2326i = false;
            if (m3023y()) {
                this.f2321d.mo23881l1();
            }
        }
        mo2854u(this.f2321d, this.f2327j, i, i2);
        mo2853t(i, i2, this.f2321d.mo23808Q(), this.f2321d.mo23853w(), this.f2321d.mo23874d1(), this.f2321d.mo23872b1());
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C6246e i = mo2841i(view);
        if ((view instanceof Guideline) && !(i instanceof C6252h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C6252h hVar = new C6252h();
            layoutParams.f2395n0 = hVar;
            layoutParams.f2367Z = true;
            hVar.mo23917S0(layoutParams.f2360S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo2824u();
            ((LayoutParams) view.getLayoutParams()).f2369a0 = true;
            if (!this.f2320c.contains(constraintHelper)) {
                this.f2320c.add(constraintHelper);
            }
        }
        this.f2319b.put(view.getId(), view);
        this.f2326i = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2319b.remove(view.getId());
        this.f2321d.mo23942N0(mo2841i(view));
        this.f2320c.remove(view);
        this.f2326i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo2842q() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        m3021r();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo2567s(int i) {
        this.f2329l = new C0561b(getContext(), this, i);
    }

    public void setConstraintSet(C0564c cVar) {
        this.f2328k = cVar;
    }

    public void setId(int i) {
        this.f2319b.remove(getId());
        super.setId(i);
        this.f2319b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2325h) {
            this.f2325h = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2324g) {
            this.f2324g = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2323f) {
            this.f2323f = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2322e) {
            this.f2322e = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0570d dVar) {
        C0561b bVar = this.f2329l;
        if (bVar != null) {
            bVar.mo2894c(dVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2327j = i;
        this.f2321d.mo23878i1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo2853t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0557b bVar = this.f2339v;
        int i5 = bVar.f2415e;
        int i6 = i3 + bVar.f2414d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.f2324g, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f2325h, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f2332o = min;
            this.f2333p = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.f2332o = i6;
        this.f2333p = i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo2854u(C6249f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2339v.mo2863c(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo2842q()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo2856x(fVar, mode, i6, mode2, i7);
        fVar.mo23875e1(i, mode, i6, mode2, i7, this.f2332o, this.f2333p, i4, max);
    }

    /* renamed from: w */
    public void mo2855w(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2331n == null) {
                this.f2331n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2331n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo2856x(C6249f fVar, int i, int i2, int i3, int i4) {
        C6246e.C6248b bVar;
        C0557b bVar2 = this.f2339v;
        int i5 = bVar2.f2415e;
        int i6 = bVar2.f2414d;
        C6246e.C6248b bVar3 = C6246e.C6248b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C6246e.C6248b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f2322e);
                }
            } else if (i != 1073741824) {
                bVar = bVar3;
            } else {
                i2 = Math.min(this.f2324g - i6, i2);
                bVar = bVar3;
            }
            i2 = 0;
        } else {
            bVar = C6246e.C6248b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f2322e);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar3 = C6246e.C6248b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f2323f);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f2325h - i5, i4);
            }
            i4 = 0;
        } else {
            bVar3 = C6246e.C6248b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f2323f);
            }
        }
        if (!(i2 == fVar.mo23808Q() && i4 == fVar.mo23853w())) {
            fVar.mo23871a1();
        }
        fVar.mo23794G0(0);
        fVar.mo23796H0(0);
        fVar.mo23848t0(this.f2324g - i6);
        fVar.mo23846s0(this.f2325h - i5);
        fVar.mo23852v0(0);
        fVar.mo23850u0(0);
        fVar.mo23834m0(bVar);
        fVar.mo23792F0(i2);
        fVar.mo23784B0(bVar3);
        fVar.mo23827i0(i4);
        fVar.mo23852v0(this.f2322e - i6);
        fVar.mo23850u0(this.f2323f - i5);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3020p(attributeSet, i, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2342A = 0.5f;

        /* renamed from: B */
        public String f2343B = null;

        /* renamed from: C */
        float f2344C = 0.0f;

        /* renamed from: D */
        int f2345D = 1;

        /* renamed from: E */
        public float f2346E = -1.0f;

        /* renamed from: F */
        public float f2347F = -1.0f;

        /* renamed from: G */
        public int f2348G = 0;

        /* renamed from: H */
        public int f2349H = 0;

        /* renamed from: I */
        public int f2350I = 0;

        /* renamed from: J */
        public int f2351J = 0;

        /* renamed from: K */
        public int f2352K = 0;

        /* renamed from: L */
        public int f2353L = 0;

        /* renamed from: M */
        public int f2354M = 0;

        /* renamed from: N */
        public int f2355N = 0;

        /* renamed from: O */
        public float f2356O = 1.0f;

        /* renamed from: P */
        public float f2357P = 1.0f;

        /* renamed from: Q */
        public int f2358Q = -1;

        /* renamed from: R */
        public int f2359R = -1;

        /* renamed from: S */
        public int f2360S = -1;

        /* renamed from: T */
        public boolean f2361T = false;

        /* renamed from: U */
        public boolean f2362U = false;

        /* renamed from: V */
        public String f2363V = null;

        /* renamed from: W */
        boolean f2364W = true;

        /* renamed from: X */
        boolean f2365X = true;

        /* renamed from: Y */
        boolean f2366Y = false;

        /* renamed from: Z */
        boolean f2367Z = false;

        /* renamed from: a */
        public int f2368a = -1;

        /* renamed from: a0 */
        boolean f2369a0 = false;

        /* renamed from: b */
        public int f2370b = -1;

        /* renamed from: b0 */
        boolean f2371b0 = false;

        /* renamed from: c */
        public float f2372c = -1.0f;

        /* renamed from: c0 */
        boolean f2373c0 = false;

        /* renamed from: d */
        public int f2374d = -1;

        /* renamed from: d0 */
        int f2375d0 = -1;

        /* renamed from: e */
        public int f2376e = -1;

        /* renamed from: e0 */
        int f2377e0 = -1;

        /* renamed from: f */
        public int f2378f = -1;

        /* renamed from: f0 */
        int f2379f0 = -1;

        /* renamed from: g */
        public int f2380g = -1;

        /* renamed from: g0 */
        int f2381g0 = -1;

        /* renamed from: h */
        public int f2382h = -1;

        /* renamed from: h0 */
        int f2383h0 = -1;

        /* renamed from: i */
        public int f2384i = -1;

        /* renamed from: i0 */
        int f2385i0 = -1;

        /* renamed from: j */
        public int f2386j = -1;

        /* renamed from: j0 */
        float f2387j0 = 0.5f;

        /* renamed from: k */
        public int f2388k = -1;

        /* renamed from: k0 */
        int f2389k0;

        /* renamed from: l */
        public int f2390l = -1;

        /* renamed from: l0 */
        int f2391l0;

        /* renamed from: m */
        public int f2392m = -1;

        /* renamed from: m0 */
        float f2393m0;

        /* renamed from: n */
        public int f2394n = 0;

        /* renamed from: n0 */
        C6246e f2395n0 = new C6246e();

        /* renamed from: o */
        public float f2396o = 0.0f;

        /* renamed from: o0 */
        public boolean f2397o0 = false;

        /* renamed from: p */
        public int f2398p = -1;

        /* renamed from: q */
        public int f2399q = -1;

        /* renamed from: r */
        public int f2400r = -1;

        /* renamed from: s */
        public int f2401s = -1;

        /* renamed from: t */
        public int f2402t = -1;

        /* renamed from: u */
        public int f2403u = -1;

        /* renamed from: v */
        public int f2404v = -1;

        /* renamed from: w */
        public int f2405w = -1;

        /* renamed from: x */
        public int f2406x = -1;

        /* renamed from: y */
        public int f2407y = -1;

        /* renamed from: z */
        public float f2408z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        private static class C0555a {

            /* renamed from: a */
            public static final SparseIntArray f2409a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2409a = sparseIntArray;
                sparseIntArray.append(C0572f.f2919l2, 8);
                sparseIntArray.append(C0572f.f2929m2, 9);
                sparseIntArray.append(C0572f.f2947o2, 10);
                sparseIntArray.append(C0572f.f2956p2, 11);
                sparseIntArray.append(C0572f.f3010v2, 12);
                sparseIntArray.append(C0572f.f3001u2, 13);
                sparseIntArray.append(C0572f.f2745T1, 14);
                sparseIntArray.append(C0572f.f2736S1, 15);
                sparseIntArray.append(C0572f.f2718Q1, 16);
                sparseIntArray.append(C0572f.f2754U1, 2);
                sparseIntArray.append(C0572f.f2772W1, 3);
                sparseIntArray.append(C0572f.f2763V1, 4);
                sparseIntArray.append(C0572f.f2602D2, 49);
                sparseIntArray.append(C0572f.f2611E2, 50);
                sparseIntArray.append(C0572f.f2809a2, 5);
                sparseIntArray.append(C0572f.f2819b2, 6);
                sparseIntArray.append(C0572f.f2829c2, 7);
                sparseIntArray.append(C0572f.f2818b1, 1);
                sparseIntArray.append(C0572f.f2965q2, 17);
                sparseIntArray.append(C0572f.f2974r2, 18);
                sparseIntArray.append(C0572f.f2799Z1, 19);
                sparseIntArray.append(C0572f.f2790Y1, 20);
                sparseIntArray.append(C0572f.f2638H2, 21);
                sparseIntArray.append(C0572f.f2665K2, 22);
                sparseIntArray.append(C0572f.f2647I2, 23);
                sparseIntArray.append(C0572f.f2620F2, 24);
                sparseIntArray.append(C0572f.f2656J2, 25);
                sparseIntArray.append(C0572f.f2629G2, 26);
                sparseIntArray.append(C0572f.f2879h2, 29);
                sparseIntArray.append(C0572f.f3019w2, 30);
                sparseIntArray.append(C0572f.f2781X1, 44);
                sparseIntArray.append(C0572f.f2899j2, 45);
                sparseIntArray.append(C0572f.f3037y2, 46);
                sparseIntArray.append(C0572f.f2889i2, 47);
                sparseIntArray.append(C0572f.f3028x2, 48);
                sparseIntArray.append(C0572f.f2700O1, 27);
                sparseIntArray.append(C0572f.f2691N1, 28);
                sparseIntArray.append(C0572f.f3046z2, 31);
                sparseIntArray.append(C0572f.f2839d2, 32);
                sparseIntArray.append(C0572f.f2584B2, 33);
                sparseIntArray.append(C0572f.f2575A2, 34);
                sparseIntArray.append(C0572f.f2593C2, 35);
                sparseIntArray.append(C0572f.f2859f2, 36);
                sparseIntArray.append(C0572f.f2849e2, 37);
                sparseIntArray.append(C0572f.f2869g2, 38);
                sparseIntArray.append(C0572f.f2909k2, 39);
                sparseIntArray.append(C0572f.f2992t2, 40);
                sparseIntArray.append(C0572f.f2938n2, 41);
                sparseIntArray.append(C0572f.f2727R1, 42);
                sparseIntArray.append(C0572f.f2709P1, 43);
                sparseIntArray.append(C0572f.f2983s2, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0555a.f2409a.get(index);
                switch (i3) {
                    case 1:
                        this.f2360S = obtainStyledAttributes.getInt(index, this.f2360S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2392m);
                        this.f2392m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f2392m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f2394n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2394n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2396o) % 360.0f;
                        this.f2396o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f2396o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f2368a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2368a);
                        break;
                    case 6:
                        this.f2370b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2370b);
                        break;
                    case 7:
                        this.f2372c = obtainStyledAttributes.getFloat(index, this.f2372c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2374d);
                        this.f2374d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f2374d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2376e);
                        this.f2376e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f2376e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2378f);
                        this.f2378f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f2378f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2380g);
                        this.f2380g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f2380g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2382h);
                        this.f2382h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f2382h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2384i);
                        this.f2384i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f2384i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2386j);
                        this.f2386j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f2386j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2388k);
                        this.f2388k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f2388k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2390l);
                        this.f2390l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f2390l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2398p);
                        this.f2398p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f2398p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2399q);
                        this.f2399q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f2399q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2400r);
                        this.f2400r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f2400r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2401s);
                        this.f2401s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f2401s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f2402t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2402t);
                        break;
                    case 22:
                        this.f2403u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2403u);
                        break;
                    case 23:
                        this.f2404v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2404v);
                        break;
                    case 24:
                        this.f2405w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2405w);
                        break;
                    case 25:
                        this.f2406x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2406x);
                        break;
                    case 26:
                        this.f2407y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2407y);
                        break;
                    case 27:
                        this.f2361T = obtainStyledAttributes.getBoolean(index, this.f2361T);
                        break;
                    case 28:
                        this.f2362U = obtainStyledAttributes.getBoolean(index, this.f2362U);
                        break;
                    case 29:
                        this.f2408z = obtainStyledAttributes.getFloat(index, this.f2408z);
                        break;
                    case 30:
                        this.f2342A = obtainStyledAttributes.getFloat(index, this.f2342A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2350I = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2351J = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f2352K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2352K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2352K) != -2) {
                                break;
                            } else {
                                this.f2352K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2354M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2354M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2354M) != -2) {
                                break;
                            } else {
                                this.f2354M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f2356O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2356O));
                        this.f2350I = 2;
                        break;
                    case 36:
                        try {
                            this.f2353L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2353L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2353L) != -2) {
                                break;
                            } else {
                                this.f2353L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2355N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2355N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2355N) != -2) {
                                break;
                            } else {
                                this.f2355N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f2357P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2357P));
                        this.f2351J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2343B = string;
                                this.f2344C = Float.NaN;
                                this.f2345D = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f2343B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2343B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2345D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2345D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2343B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f2343B.substring(i, indexOf2);
                                        String substring3 = this.f2343B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2345D != 1) {
                                                        this.f2344C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.f2344C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f2343B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.f2344C = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f2346E = obtainStyledAttributes.getFloat(index, this.f2346E);
                                break;
                            case 46:
                                this.f2347F = obtainStyledAttributes.getFloat(index, this.f2347F);
                                break;
                            case 47:
                                this.f2348G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2349H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f2358Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2358Q);
                                break;
                            case 50:
                                this.f2359R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2359R);
                                break;
                            case 51:
                                this.f2363V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo2859c();
        }

        /* renamed from: a */
        public String mo2857a() {
            return this.f2363V;
        }

        /* renamed from: b */
        public C6246e mo2858b() {
            return this.f2395n0;
        }

        /* renamed from: c */
        public void mo2859c() {
            this.f2367Z = false;
            this.f2364W = true;
            this.f2365X = true;
            int i = this.width;
            if (i == -2 && this.f2361T) {
                this.f2364W = false;
                if (this.f2350I == 0) {
                    this.f2350I = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f2362U) {
                this.f2365X = false;
                if (this.f2351J == 0) {
                    this.f2351J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2364W = false;
                if (i == 0 && this.f2350I == 1) {
                    this.width = -2;
                    this.f2361T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2365X = false;
                if (i2 == 0 && this.f2351J == 1) {
                    this.height = -2;
                    this.f2362U = true;
                }
            }
            if (this.f2372c != -1.0f || this.f2368a != -1 || this.f2370b != -1) {
                this.f2367Z = true;
                this.f2364W = true;
                this.f2365X = true;
                if (!(this.f2395n0 instanceof C6252h)) {
                    this.f2395n0 = new C6252h();
                }
                ((C6252h) this.f2395n0).mo23917S0(this.f2360S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                if (r4 != r10) goto L_0x0017
                r10 = 1
                goto L_0x0018
            L_0x0017:
                r10 = 0
            L_0x0018:
                r2 = -1
                r9.f2379f0 = r2
                r9.f2381g0 = r2
                r9.f2375d0 = r2
                r9.f2377e0 = r2
                r9.f2383h0 = r2
                r9.f2385i0 = r2
                int r5 = r9.f2402t
                r9.f2383h0 = r5
                int r5 = r9.f2404v
                r9.f2385i0 = r5
                float r5 = r9.f2408z
                r9.f2387j0 = r5
                int r6 = r9.f2368a
                r9.f2389k0 = r6
                int r7 = r9.f2370b
                r9.f2391l0 = r7
                float r8 = r9.f2372c
                r9.f2393m0 = r8
                if (r10 == 0) goto L_0x0098
                int r10 = r9.f2398p
                if (r10 == r2) goto L_0x0047
                r9.f2379f0 = r10
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r10 = r9.f2399q
                if (r10 == r2) goto L_0x004e
                r9.f2381g0 = r10
                goto L_0x0045
            L_0x004e:
                int r10 = r9.f2400r
                if (r10 == r2) goto L_0x0055
                r9.f2377e0 = r10
                r3 = 1
            L_0x0055:
                int r10 = r9.f2401s
                if (r10 == r2) goto L_0x005c
                r9.f2375d0 = r10
                r3 = 1
            L_0x005c:
                int r10 = r9.f2406x
                if (r10 == r2) goto L_0x0062
                r9.f2385i0 = r10
            L_0x0062:
                int r10 = r9.f2407y
                if (r10 == r2) goto L_0x0068
                r9.f2383h0 = r10
            L_0x0068:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0070
                float r3 = r10 - r5
                r9.f2387j0 = r3
            L_0x0070:
                boolean r3 = r9.f2367Z
                if (r3 == 0) goto L_0x00bc
                int r3 = r9.f2360S
                if (r3 != r4) goto L_0x00bc
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x0086
                float r10 = r10 - r8
                r9.f2393m0 = r10
                r9.f2389k0 = r2
                r9.f2391l0 = r2
                goto L_0x00bc
            L_0x0086:
                if (r6 == r2) goto L_0x008f
                r9.f2391l0 = r6
                r9.f2389k0 = r2
                r9.f2393m0 = r3
                goto L_0x00bc
            L_0x008f:
                if (r7 == r2) goto L_0x00bc
                r9.f2389k0 = r7
                r9.f2391l0 = r2
                r9.f2393m0 = r3
                goto L_0x00bc
            L_0x0098:
                int r10 = r9.f2398p
                if (r10 == r2) goto L_0x009e
                r9.f2377e0 = r10
            L_0x009e:
                int r10 = r9.f2399q
                if (r10 == r2) goto L_0x00a4
                r9.f2375d0 = r10
            L_0x00a4:
                int r10 = r9.f2400r
                if (r10 == r2) goto L_0x00aa
                r9.f2379f0 = r10
            L_0x00aa:
                int r10 = r9.f2401s
                if (r10 == r2) goto L_0x00b0
                r9.f2381g0 = r10
            L_0x00b0:
                int r10 = r9.f2406x
                if (r10 == r2) goto L_0x00b6
                r9.f2383h0 = r10
            L_0x00b6:
                int r10 = r9.f2407y
                if (r10 == r2) goto L_0x00bc
                r9.f2385i0 = r10
            L_0x00bc:
                int r10 = r9.f2400r
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f2401s
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f2399q
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f2398p
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f2378f
                if (r10 == r2) goto L_0x00db
                r9.f2379f0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r9.rightMargin = r1
                goto L_0x00e9
            L_0x00db:
                int r10 = r9.f2380g
                if (r10 == r2) goto L_0x00e9
                r9.f2381g0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r9.rightMargin = r1
            L_0x00e9:
                int r10 = r9.f2374d
                if (r10 == r2) goto L_0x00f8
                r9.f2375d0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r9.leftMargin = r0
                goto L_0x0106
            L_0x00f8:
                int r10 = r9.f2376e
                if (r10 == r2) goto L_0x0106
                r9.f2377e0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r9.leftMargin = r0
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
