package p116n0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p089i0.C5420a;
import p116n0.C5781f;
import p180z.C6420d;

/* renamed from: n0.c */
/* compiled from: AccessibilityNodeInfoCompat */
public class C5771c {

    /* renamed from: d */
    private static int f24451d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f24452a;

    /* renamed from: b */
    public int f24453b = -1;

    /* renamed from: c */
    private int f24454c = -1;

    /* renamed from: n0.c$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5772a {

        /* renamed from: A */
        public static final C5772a f24455A;

        /* renamed from: B */
        public static final C5772a f24456B;

        /* renamed from: C */
        public static final C5772a f24457C;

        /* renamed from: D */
        public static final C5772a f24458D;

        /* renamed from: E */
        public static final C5772a f24459E;

        /* renamed from: F */
        public static final C5772a f24460F;

        /* renamed from: G */
        public static final C5772a f24461G;

        /* renamed from: H */
        public static final C5772a f24462H;

        /* renamed from: I */
        public static final C5772a f24463I;

        /* renamed from: J */
        public static final C5772a f24464J;

        /* renamed from: K */
        public static final C5772a f24465K;

        /* renamed from: L */
        public static final C5772a f24466L;

        /* renamed from: M */
        public static final C5772a f24467M;

        /* renamed from: N */
        public static final C5772a f24468N;

        /* renamed from: O */
        public static final C5772a f24469O;

        /* renamed from: P */
        public static final C5772a f24470P;

        /* renamed from: Q */
        public static final C5772a f24471Q;

        /* renamed from: e */
        public static final C5772a f24472e = new C5772a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C5772a f24473f = new C5772a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C5772a f24474g = new C5772a(4, (CharSequence) null);

        /* renamed from: h */
        public static final C5772a f24475h = new C5772a(8, (CharSequence) null);

        /* renamed from: i */
        public static final C5772a f24476i = new C5772a(16, (CharSequence) null);

        /* renamed from: j */
        public static final C5772a f24477j = new C5772a(32, (CharSequence) null);

        /* renamed from: k */
        public static final C5772a f24478k = new C5772a(64, (CharSequence) null);

        /* renamed from: l */
        public static final C5772a f24479l = new C5772a(128, (CharSequence) null);

        /* renamed from: m */
        public static final C5772a f24480m;

        /* renamed from: n */
        public static final C5772a f24481n;

        /* renamed from: o */
        public static final C5772a f24482o;

        /* renamed from: p */
        public static final C5772a f24483p;

        /* renamed from: q */
        public static final C5772a f24484q = new C5772a(4096, (CharSequence) null);

        /* renamed from: r */
        public static final C5772a f24485r = new C5772a(8192, (CharSequence) null);

        /* renamed from: s */
        public static final C5772a f24486s = new C5772a(16384, (CharSequence) null);

        /* renamed from: t */
        public static final C5772a f24487t = new C5772a(32768, (CharSequence) null);

        /* renamed from: u */
        public static final C5772a f24488u = new C5772a(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE, (CharSequence) null);

        /* renamed from: v */
        public static final C5772a f24489v = new C5772a(131072, (CharSequence) null, (Class<? extends C5781f.C5782a>) C5781f.C5788g.class);

        /* renamed from: w */
        public static final C5772a f24490w = new C5772a(262144, (CharSequence) null);

        /* renamed from: x */
        public static final C5772a f24491x = new C5772a(524288, (CharSequence) null);

        /* renamed from: y */
        public static final C5772a f24492y = new C5772a(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, (CharSequence) null);

        /* renamed from: z */
        public static final C5772a f24493z = new C5772a(2097152, (CharSequence) null, (Class<? extends C5781f.C5782a>) C5781f.C5789h.class);

        /* renamed from: a */
        final Object f24494a;

        /* renamed from: b */
        private final int f24495b;

        /* renamed from: c */
        private final Class<? extends C5781f.C5782a> f24496c;

        /* renamed from: d */
        protected final C5781f f24497d;

        static {
            Class<C5781f.C5784c> cls = C5781f.C5784c.class;
            Class<C5781f.C5783b> cls2 = C5781f.C5783b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f24480m = new C5772a(256, (CharSequence) null, (Class<? extends C5781f.C5782a>) cls2);
            f24481n = new C5772a(512, (CharSequence) null, (Class<? extends C5781f.C5782a>) cls2);
            f24482o = new C5772a(1024, (CharSequence) null, (Class<? extends C5781f.C5782a>) cls);
            f24483p = new C5772a(2048, (CharSequence) null, (Class<? extends C5781f.C5782a>) cls);
            int i = Build.VERSION.SDK_INT;
            f24455A = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24456B = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C5781f) null, C5781f.C5786e.class);
            f24457C = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24458D = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24459E = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24460F = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24461G = new C5772a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24462H = new C5772a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24463I = new C5772a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24464J = new C5772a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24465K = new C5772a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24466L = new C5772a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C5781f) null, C5781f.C5787f.class);
            f24467M = new C5772a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C5781f) null, C5781f.C5785d.class);
            f24468N = new C5772a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24469O = new C5772a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            f24470P = new C5772a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f24471Q = new C5772a(accessibilityAction, 16908372, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
        }

        public C5772a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
        }

        /* renamed from: a */
        public C5772a mo22668a(CharSequence charSequence, C5781f fVar) {
            return new C5772a((Object) null, this.f24495b, charSequence, fVar, this.f24496c);
        }

        /* renamed from: b */
        public int mo22669b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f24494a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo22670c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f24494a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo22671d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                n0.f r0 = r4.f24497d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends n0.f$a> r2 = r4.f24496c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                n0.f$a r1 = (p116n0.C5781f.C5782a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo22685a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends n0.f$a> r1 = r4.f24496c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                n0.f r6 = r4.f24497d
                boolean r5 = r6.mo6785a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p116n0.C5771c.C5772a.mo22671d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C5772a)) {
                return false;
            }
            C5772a aVar = (C5772a) obj;
            Object obj2 = this.f24494a;
            if (obj2 == null) {
                if (aVar.f24494a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f24494a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f24494a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C5772a(int i, CharSequence charSequence, C5781f fVar) {
            this((Object) null, i, charSequence, fVar, (Class<? extends C5781f.C5782a>) null);
        }

        C5772a(Object obj) {
            this(obj, 0, (CharSequence) null, (C5781f) null, (Class<? extends C5781f.C5782a>) null);
        }

        private C5772a(int i, CharSequence charSequence, Class<? extends C5781f.C5782a> cls) {
            this((Object) null, i, charSequence, (C5781f) null, cls);
        }

        C5772a(Object obj, int i, CharSequence charSequence, C5781f fVar, Class<? extends C5781f.C5782a> cls) {
            this.f24495b = i;
            this.f24497d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f24494a = obj;
            } else {
                this.f24494a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f24496c = cls;
        }
    }

    /* renamed from: n0.c$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5773b {

        /* renamed from: a */
        final Object f24498a;

        C5773b(Object obj) {
            this.f24498a = obj;
        }

        /* renamed from: a */
        public static C5773b m25621a(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C5773b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C5773b((Object) null);
        }

        /* renamed from: b */
        public static C5773b m25622b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C5773b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C5773b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C5773b((Object) null);
        }
    }

    /* renamed from: n0.c$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5774c {

        /* renamed from: a */
        final Object f24499a;

        C5774c(Object obj) {
            this.f24499a = obj;
        }

        /* renamed from: a */
        public static C5774c m25623a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C5774c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C5774c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C5774c((Object) null);
        }
    }

    /* renamed from: n0.c$d */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C5775d {

        /* renamed from: a */
        final Object f24500a;

        C5775d(Object obj) {
            this.f24500a = obj;
        }

        /* renamed from: a */
        public static C5775d m25624a(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C5775d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new C5775d((Object) null);
        }
    }

    private C5771c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f24452a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private int m25531A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f24451d;
        f24451d = i2 + 1;
        return i2;
    }

    /* renamed from: H0 */
    public static C5771c m25532H0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C5771c(accessibilityNodeInfo);
    }

    /* renamed from: O */
    public static C5771c m25533O() {
        return m25532H0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: P */
    public static C5771c m25534P(View view) {
        return m25532H0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: Q */
    public static C5771c m25535Q(C5771c cVar) {
        return m25532H0(AccessibilityNodeInfo.obtain(cVar.f24452a));
    }

    /* renamed from: U */
    private void m25536U(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m25545w(view);
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < w.size(); i++) {
                if (w.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                w.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: W */
    private void m25537W(int i, boolean z) {
        Bundle s = mo22654s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m25538e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m25539g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f24452a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f24452a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f24452a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f24452a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m25540h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f24452a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f24452a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m25541j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C6540C.DEFAULT_BUFFER_SEGMENT_SIZE /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m25542l(int i) {
        Bundle s = mo22654s();
        if (s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static ClickableSpan[] m25543q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m25544u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m25545w(view);
        if (w != null) {
            return w;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C6420d.f26379Q, sparseArray);
        return sparseArray;
    }

    /* renamed from: w */
    private SparseArray<WeakReference<ClickableSpan>> m25545w(View view) {
        return (SparseArray) view.getTag(C6420d.f26379Q);
    }

    /* renamed from: z */
    private boolean m25546z() {
        return !m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: A0 */
    public void mo22595A0(View view) {
        this.f24454c = -1;
        this.f24452a.setSource(view);
    }

    /* renamed from: B */
    public boolean mo22596B() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f24452a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: B0 */
    public void mo22597B0(View view, int i) {
        this.f24454c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.setSource(view, i);
        }
    }

    /* renamed from: C */
    public boolean mo22598C() {
        return this.f24452a.isCheckable();
    }

    /* renamed from: C0 */
    public void mo22599C0(CharSequence charSequence) {
        if (C5420a.m24368b()) {
            this.f24452a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f24452a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: D */
    public boolean mo22600D() {
        return this.f24452a.isChecked();
    }

    /* renamed from: D0 */
    public void mo22601D0(CharSequence charSequence) {
        this.f24452a.setText(charSequence);
    }

    /* renamed from: E */
    public boolean mo22602E() {
        return this.f24452a.isClickable();
    }

    /* renamed from: E0 */
    public void mo22603E0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f24452a.setTraversalAfter(view);
        }
    }

    /* renamed from: F */
    public boolean mo22604F() {
        return this.f24452a.isEnabled();
    }

    /* renamed from: F0 */
    public void mo22605F0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.setVisibleToUser(z);
        }
    }

    /* renamed from: G */
    public boolean mo22606G() {
        return this.f24452a.isFocusable();
    }

    /* renamed from: G0 */
    public AccessibilityNodeInfo mo22607G0() {
        return this.f24452a;
    }

    /* renamed from: H */
    public boolean mo22608H() {
        return this.f24452a.isFocused();
    }

    /* renamed from: I */
    public boolean mo22609I() {
        return this.f24452a.isLongClickable();
    }

    /* renamed from: J */
    public boolean mo22610J() {
        return this.f24452a.isPassword();
    }

    /* renamed from: K */
    public boolean mo22611K() {
        return this.f24452a.isScrollable();
    }

    /* renamed from: L */
    public boolean mo22612L() {
        return this.f24452a.isSelected();
    }

    /* renamed from: M */
    public boolean mo22613M() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f24452a.isShowingHintText();
        }
        return m25542l(4);
    }

    /* renamed from: N */
    public boolean mo22614N() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f24452a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: R */
    public boolean mo22615R(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f24452a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: S */
    public void mo22616S() {
        this.f24452a.recycle();
    }

    /* renamed from: T */
    public boolean mo22617T(C5772a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f24452a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f24494a);
        }
        return false;
    }

    /* renamed from: V */
    public void mo22618V(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: X */
    public void mo22619X(Rect rect) {
        this.f24452a.setBoundsInParent(rect);
    }

    /* renamed from: Y */
    public void mo22620Y(Rect rect) {
        this.f24452a.setBoundsInScreen(rect);
    }

    /* renamed from: Z */
    public void mo22621Z(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f24452a.setCanOpenPopup(z);
        }
    }

    /* renamed from: a */
    public void mo22622a(int i) {
        this.f24452a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo22623a0(boolean z) {
        this.f24452a.setCheckable(z);
    }

    /* renamed from: b */
    public void mo22624b(C5772a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24452a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f24494a);
        }
    }

    /* renamed from: b0 */
    public void mo22625b0(boolean z) {
        this.f24452a.setChecked(z);
    }

    /* renamed from: c */
    public void mo22626c(View view) {
        this.f24452a.addChild(view);
    }

    /* renamed from: c0 */
    public void mo22627c0(CharSequence charSequence) {
        this.f24452a.setClassName(charSequence);
    }

    /* renamed from: d */
    public void mo22628d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void mo22629d0(boolean z) {
        this.f24452a.setClickable(z);
    }

    /* renamed from: e0 */
    public void mo22630e0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f24452a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C5773b) obj).f24498a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5771c)) {
            return false;
        }
        C5771c cVar = (C5771c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24452a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f24452a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f24452a)) {
            return false;
        }
        return this.f24454c == cVar.f24454c && this.f24453b == cVar.f24453b;
    }

    /* renamed from: f */
    public void mo22632f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m25539g();
            m25536U(view);
            ClickableSpan[] q = m25543q(charSequence);
            if (q != null && q.length > 0) {
                mo22654s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C6420d.f26386a);
                SparseArray<WeakReference<ClickableSpan>> u = m25544u(view);
                for (int i2 = 0; i2 < q.length; i2++) {
                    int A = m25531A(q[i2], u);
                    u.put(A, new WeakReference(q[i2]));
                    m25538e(q[i2], (Spanned) charSequence, A);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo22633f0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f24452a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C5774c) obj).f24499a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: g0 */
    public void mo22634g0(CharSequence charSequence) {
        this.f24452a.setContentDescription(charSequence);
    }

    /* renamed from: h0 */
    public void mo22635h0(boolean z) {
        this.f24452a.setEnabled(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24452a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C5772a> mo22637i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f24452a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5772a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo22638i0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24452a.setError(charSequence);
        }
    }

    /* renamed from: j0 */
    public void mo22639j0(boolean z) {
        this.f24452a.setFocusable(z);
    }

    /* renamed from: k */
    public int mo22640k() {
        return this.f24452a.getActions();
    }

    /* renamed from: k0 */
    public void mo22641k0(boolean z) {
        this.f24452a.setFocused(z);
    }

    /* renamed from: l0 */
    public void mo22642l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24452a.setHeading(z);
        } else {
            m25537W(2, z);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void mo22643m(Rect rect) {
        this.f24452a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo22644m0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f24452a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f24452a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: n */
    public void mo22645n(Rect rect) {
        this.f24452a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo22646n0(boolean z) {
        this.f24452a.setLongClickable(z);
    }

    /* renamed from: o */
    public int mo22647o() {
        return this.f24452a.getChildCount();
    }

    /* renamed from: o0 */
    public void mo22648o0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24452a.setMaxTextLength(i);
        }
    }

    /* renamed from: p */
    public CharSequence mo22649p() {
        return this.f24452a.getClassName();
    }

    /* renamed from: p0 */
    public void mo22650p0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.setMovementGranularities(i);
        }
    }

    /* renamed from: q0 */
    public void mo22651q0(CharSequence charSequence) {
        this.f24452a.setPackageName(charSequence);
    }

    /* renamed from: r */
    public CharSequence mo22652r() {
        return this.f24452a.getContentDescription();
    }

    /* renamed from: r0 */
    public void mo22653r0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f24452a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f24452a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: s */
    public Bundle mo22654s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f24452a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: s0 */
    public void mo22655s0(View view) {
        this.f24453b = -1;
        this.f24452a.setParent(view);
    }

    /* renamed from: t */
    public int mo22656t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f24452a.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void mo22657t0(View view, int i) {
        this.f24453b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24452a.setParent(view, i);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo22643m(rect);
        sb.append("; boundsInParent: " + rect);
        mo22645n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo22660v());
        sb.append("; className: ");
        sb.append(mo22649p());
        sb.append("; text: ");
        sb.append(mo22663x());
        sb.append("; contentDescription: ");
        sb.append(mo22652r());
        sb.append("; viewId: ");
        sb.append(mo22665y());
        sb.append("; checkable: ");
        sb.append(mo22598C());
        sb.append("; checked: ");
        sb.append(mo22600D());
        sb.append("; focusable: ");
        sb.append(mo22606G());
        sb.append("; focused: ");
        sb.append(mo22608H());
        sb.append("; selected: ");
        sb.append(mo22612L());
        sb.append("; clickable: ");
        sb.append(mo22602E());
        sb.append("; longClickable: ");
        sb.append(mo22609I());
        sb.append("; enabled: ");
        sb.append(mo22604F());
        sb.append("; password: ");
        sb.append(mo22610J());
        sb.append("; scrollable: " + mo22611K());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C5772a> i = mo22637i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C5772a aVar = i.get(i2);
                String j = m25541j(aVar.mo22669b());
                if (j.equals("ACTION_UNKNOWN") && aVar.mo22670c() != null) {
                    j = aVar.mo22670c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = mo22640k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= numberOfTrailingZeros ^ -1;
                sb.append(m25541j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void mo22659u0(C5775d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f24452a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f24500a);
        }
    }

    /* renamed from: v */
    public CharSequence mo22660v() {
        return this.f24452a.getPackageName();
    }

    /* renamed from: v0 */
    public void mo22661v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f24452a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: w0 */
    public void mo22662w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24452a.setScreenReaderFocusable(z);
        } else {
            m25537W(1, z);
        }
    }

    /* renamed from: x */
    public CharSequence mo22663x() {
        if (!m25546z()) {
            return this.f24452a.getText();
        }
        List<Integer> h = m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m25540h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f24452a.getText(), 0, this.f24452a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C5769a(h4.get(i).intValue(), this, mo22654s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: x0 */
    public void mo22664x0(boolean z) {
        this.f24452a.setScrollable(z);
    }

    /* renamed from: y */
    public String mo22665y() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f24452a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: y0 */
    public void mo22666y0(boolean z) {
        this.f24452a.setSelected(z);
    }

    /* renamed from: z0 */
    public void mo22667z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24452a.setShowingHintText(z);
        } else {
            m25537W(4, z);
        }
    }
}
