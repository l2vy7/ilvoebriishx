package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0564c;
import androidx.constraintlayout.widget.C0571e;
import androidx.constraintlayout.widget.C0572f;
import androidx.constraintlayout.widget.C0573g;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p154u.C6164c;

/* renamed from: androidx.constraintlayout.motion.widget.q */
/* compiled from: MotionScene */
public class C0511q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MotionLayout f2166a;

    /* renamed from: b */
    C0573g f2167b = null;

    /* renamed from: c */
    C0513b f2168c = null;

    /* renamed from: d */
    private boolean f2169d = false;

    /* renamed from: e */
    private ArrayList<C0513b> f2170e = new ArrayList<>();

    /* renamed from: f */
    private C0513b f2171f = null;

    /* renamed from: g */
    private ArrayList<C0513b> f2172g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public SparseArray<C0564c> f2173h = new SparseArray<>();

    /* renamed from: i */
    private HashMap<String, Integer> f2174i = new HashMap<>();

    /* renamed from: j */
    private SparseIntArray f2175j = new SparseIntArray();

    /* renamed from: k */
    private boolean f2176k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f2177l = 400;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f2178m = 0;

    /* renamed from: n */
    private MotionEvent f2179n;

    /* renamed from: o */
    private boolean f2180o = false;

    /* renamed from: p */
    private MotionLayout.C0469f f2181p;

    /* renamed from: q */
    private boolean f2182q;

    /* renamed from: r */
    float f2183r;

    /* renamed from: s */
    float f2184s;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    /* compiled from: MotionScene */
    class C0512a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C6164c f2185a;

        C0512a(C6164c cVar) {
            this.f2185a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f2185a.mo23559a((double) f);
        }
    }

    C0511q(Context context, MotionLayout motionLayout, int i) {
        this.f2166a = motionLayout;
        m2831C(context, i);
        SparseArray<C0564c> sparseArray = this.f2173h;
        int i2 = C0571e.motion_base;
        sparseArray.put(i2, new C0564c());
        this.f2174i.put("motion_base", Integer.valueOf(i2));
    }

    /* renamed from: A */
    private boolean m2829A(int i) {
        int i2 = this.f2175j.get(i);
        int size = this.f2175j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f2175j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m2830B() {
        return this.f2181p != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2831C(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0151
            if (r2 == 0) goto L_0x013f
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x0142
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            boolean r5 = r8.f2176k     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r6 = -1
            java.lang.String r7 = "MotionScene"
            switch(r5) {
                case -1349929691: goto L_0x0079;
                case -1239391468: goto L_0x006f;
                case 269306229: goto L_0x0066;
                case 312750793: goto L_0x005c;
                case 327855227: goto L_0x0052;
                case 793277014: goto L_0x004a;
                case 1382829617: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0083
        L_0x0040:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 4
            goto L_0x0084
        L_0x004a:
            boolean r3 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 0
            goto L_0x0084
        L_0x0052:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 2
            goto L_0x0084
        L_0x005c:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 3
            goto L_0x0084
        L_0x0066:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r4 == 0) goto L_0x0083
            goto L_0x0084
        L_0x006f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 6
            goto L_0x0084
        L_0x0079:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r3 == 0) goto L_0x0083
            r3 = 5
            goto L_0x0084
        L_0x0083:
            r3 = -1
        L_0x0084:
            switch(r3) {
                case 0: goto L_0x0126;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009c;
                case 5: goto L_0x0097;
                case 6: goto L_0x0089;
                default: goto L_0x0087;
            }     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x0087:
            goto L_0x012a
        L_0x0089:
            androidx.constraintlayout.motion.widget.h r2 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.util.ArrayList r3 = r1.f2197k     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x0097:
            r8.m2832D(r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x009c:
            androidx.constraintlayout.widget.g r2 = new androidx.constraintlayout.widget.g     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r8.f2167b = r2     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x00a5:
            r1.mo2723t(r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x00aa:
            if (r1 != 0) goto L_0x00d9
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            android.util.Log.v(r7, r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x00d9:
            androidx.constraintlayout.motion.widget.t r2 = new androidx.constraintlayout.motion.widget.t     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f2166a     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.C0547t unused = r1.f2198l = r2     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x00e4:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f2170e     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.q$b r1 = r8.f2168c     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r1 != 0) goto L_0x010b
            boolean r1 = r2.f2188b     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r1 != 0) goto L_0x010b
            r8.f2168c = r2     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.t r1 = r2.f2198l     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r1 == 0) goto L_0x010b
            androidx.constraintlayout.motion.widget.q$b r1 = r8.f2168c     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            androidx.constraintlayout.motion.widget.t r1 = r1.f2198l     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            boolean r3 = r8.f2182q     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r1.mo2764p(r3)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x010b:
            boolean r1 = r2.f2188b     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r1 == 0) goto L_0x0124
            int r1 = r2.f2189c     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            if (r1 != r6) goto L_0x011a
            r8.f2171f = r2     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x011f
        L_0x011a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f2172g     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x011f:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r8.f2170e     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x0124:
            r1 = r2
            goto L_0x0142
        L_0x0126:
            r8.m2833E(r9, r0)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x012a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            android.util.Log.v(r7, r2)     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x0142
        L_0x013f:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
        L_0x0142:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x014d, IOException -> 0x0148 }
            goto L_0x000d
        L_0x0148:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x0151
        L_0x014d:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0511q.m2831C(android.content.Context, int):void");
    }

    /* renamed from: D */
    private void m2832D(Context context, XmlPullParser xmlPullParser) {
        C0564c cVar = new C0564c();
        cVar.mo2901C(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.f2176k) {
                PrintStream printStream = System.out;
                printStream.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = m2840o(context, attributeValue);
            } else if (attributeName.equals(TtmlNode.ATTR_ID)) {
                i = m2840o(context, attributeValue);
                this.f2174i.put(m2835P(attributeValue), Integer.valueOf(i));
            }
        }
        if (i != -1) {
            if (this.f2166a.f1884U != 0) {
                cVar.mo2902D(true);
            }
            cVar.mo2921x(context, xmlPullParser);
            if (i2 != -1) {
                this.f2175j.put(i, i2);
            }
            this.f2173h.put(i, cVar);
        }
    }

    /* renamed from: E */
    private void m2833E(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f2705O6);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0572f.f2714P6) {
                this.f2177l = obtainStyledAttributes.getInt(index, this.f2177l);
            } else if (index == C0572f.f2723Q6) {
                this.f2178m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    private void m2834I(int i) {
        int i2 = this.f2175j.get(i);
        if (i2 > 0) {
            m2834I(this.f2175j.get(i));
            C0564c cVar = this.f2173h.get(i);
            C0564c cVar2 = this.f2173h.get(i2);
            if (cVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C0474a.m2600b(this.f2166a.getContext(), i2));
                return;
            }
            cVar.mo2900B(cVar2);
            this.f2175j.put(i, -1);
        }
    }

    /* renamed from: P */
    public static String m2835P(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: o */
    private int m2840o(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName());
            if (this.f2176k) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo2934c(r3, -1, -1);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2841v(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.g r0 = r2.f2167b
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.mo2934c(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0511q.m2841v(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo2687F(float f, float f2) {
        C0513b bVar = this.f2168c;
        if (bVar != null && bVar.f2198l != null) {
            this.f2168c.f2198l.mo2761m(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2688G(float f, float f2) {
        C0513b bVar = this.f2168c;
        if (bVar != null && bVar.f2198l != null) {
            this.f2168c.f2198l.mo2762n(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo2689H(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.C0469f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2181p == null) {
            this.f2181p = this.f2166a.mo2553k0();
        }
        this.f2181p.mo2603b(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f2183r = motionEvent.getRawX();
                this.f2184s = motionEvent.getRawY();
                this.f2179n = motionEvent;
                if (this.f2168c.f2198l != null) {
                    RectF e = this.f2168c.f2198l.mo2753e(this.f2166a, rectF);
                    if (e == null || e.contains(this.f2179n.getX(), this.f2179n.getY())) {
                        RectF j = this.f2168c.f2198l.mo2758j(this.f2166a, rectF);
                        if (j == null || j.contains(this.f2179n.getX(), this.f2179n.getY())) {
                            this.f2180o = false;
                        } else {
                            this.f2180o = true;
                        }
                        this.f2168c.f2198l.mo2763o(this.f2183r, this.f2184s);
                        return;
                    }
                    this.f2179n = null;
                    return;
                }
                return;
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f2184s;
                float rawX = motionEvent.getRawX() - this.f2183r;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f2179n) != null) {
                    C0513b g = mo2699g(i, rawX, rawY, motionEvent2);
                    if (g != null) {
                        motionLayout.setTransition(g);
                        RectF j2 = this.f2168c.f2198l.mo2758j(this.f2166a, rectF);
                        if (j2 != null && !j2.contains(this.f2179n.getX(), this.f2179n.getY())) {
                            z = true;
                        }
                        this.f2180o = z;
                        this.f2168c.f2198l.mo2765q(this.f2183r, this.f2184s);
                    }
                } else {
                    return;
                }
            }
        }
        C0513b bVar = this.f2168c;
        if (!(bVar == null || bVar.f2198l == null || this.f2180o)) {
            this.f2168c.f2198l.mo2760l(motionEvent, this.f2181p, i, this);
        }
        this.f2183r = motionEvent.getRawX();
        this.f2184s = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (fVar = this.f2181p) != null) {
            fVar.mo2602a();
            this.f2181p = null;
            int i2 = motionLayout.f1848C;
            if (i2 != -1) {
                mo2698f(motionLayout, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo2690J(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.f2173h.size()) {
            int keyAt = this.f2173h.keyAt(i);
            if (m2829A(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                m2834I(keyAt);
                i++;
            }
        }
        for (int i2 = 0; i2 < this.f2173h.size(); i2++) {
            this.f2173h.valueAt(i2).mo2899A(motionLayout);
        }
    }

    /* renamed from: K */
    public void mo2691K(int i) {
        C0513b bVar = this.f2168c;
        if (bVar != null) {
            bVar.mo2722E(i);
        } else {
            this.f2177l = i;
        }
    }

    /* renamed from: L */
    public void mo2692L(boolean z) {
        this.f2182q = z;
        C0513b bVar = this.f2168c;
        if (bVar != null && bVar.f2198l != null) {
            this.f2168c.f2198l.mo2764p(this.f2182q);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2693M(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.g r0 = r6.f2167b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo2934c(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.g r2 = r6.f2167b
            int r2 = r2.mo2934c(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f2170e
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0511q.C0513b) r4
            int r5 = r4.f2189c
            if (r5 != r2) goto L_0x0036
            int r5 = r4.f2190d
            if (r5 == r0) goto L_0x0042
        L_0x0036:
            int r5 = r4.f2189c
            if (r5 != r8) goto L_0x001e
            int r5 = r4.f2190d
            if (r5 != r7) goto L_0x001e
        L_0x0042:
            r6.f2168c = r4
            if (r4 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.t r7 = r4.f2198l
            if (r7 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f2168c
            androidx.constraintlayout.motion.widget.t r7 = r7.f2198l
            boolean r8 = r6.f2182q
            r7.mo2764p(r8)
        L_0x0057:
            return
        L_0x0058:
            androidx.constraintlayout.motion.widget.q$b r7 = r6.f2171f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r6.f2172g
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C0511q.C0513b) r4
            int r5 = r4.f2189c
            if (r5 != r8) goto L_0x0060
            r7 = r4
            goto L_0x0060
        L_0x0074:
            androidx.constraintlayout.motion.widget.q$b r8 = new androidx.constraintlayout.motion.widget.q$b
            r8.<init>(r6, r7)
            int unused = r8.f2190d = r0
            int unused = r8.f2189c = r2
            if (r0 == r1) goto L_0x0086
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r6.f2170e
            r7.add(r8)
        L_0x0086:
            r6.f2168c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0511q.mo2693M(int, int):void");
    }

    /* renamed from: N */
    public void mo2694N(C0513b bVar) {
        this.f2168c = bVar;
        if (bVar != null && bVar.f2198l != null) {
            this.f2168c.f2198l.mo2764p(this.f2182q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo2695O() {
        C0513b bVar = this.f2168c;
        if (bVar != null && bVar.f2198l != null) {
            this.f2168c.f2198l.mo2766r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo2696Q() {
        Iterator<C0513b> it = this.f2170e.iterator();
        while (it.hasNext()) {
            if (it.next().f2198l != null) {
                return true;
            }
        }
        C0513b bVar = this.f2168c;
        if (bVar == null || bVar.f2198l == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo2697e(MotionLayout motionLayout, int i) {
        Iterator<C0513b> it = this.f2170e.iterator();
        while (it.hasNext()) {
            C0513b next = it.next();
            if (next.f2199m.size() > 0) {
                Iterator it2 = next.f2199m.iterator();
                while (it2.hasNext()) {
                    ((C0513b.C0514a) it2.next()).mo2730c(motionLayout);
                }
            }
        }
        Iterator<C0513b> it3 = this.f2172g.iterator();
        while (it3.hasNext()) {
            C0513b next2 = it3.next();
            if (next2.f2199m.size() > 0) {
                Iterator it4 = next2.f2199m.iterator();
                while (it4.hasNext()) {
                    ((C0513b.C0514a) it4.next()).mo2730c(motionLayout);
                }
            }
        }
        Iterator<C0513b> it5 = this.f2170e.iterator();
        while (it5.hasNext()) {
            C0513b next3 = it5.next();
            if (next3.f2199m.size() > 0) {
                Iterator it6 = next3.f2199m.iterator();
                while (it6.hasNext()) {
                    ((C0513b.C0514a) it6.next()).mo2728a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C0513b> it7 = this.f2172g.iterator();
        while (it7.hasNext()) {
            C0513b next4 = it7.next();
            if (next4.f2199m.size() > 0) {
                Iterator it8 = next4.f2199m.iterator();
                while (it8.hasNext()) {
                    ((C0513b.C0514a) it8.next()).mo2728a(motionLayout, i, next4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2698f(MotionLayout motionLayout, int i) {
        if (m2830B() || this.f2169d) {
            return false;
        }
        Iterator<C0513b> it = this.f2170e.iterator();
        while (it.hasNext()) {
            C0513b next = it.next();
            if (next.f2200n != 0) {
                if (i == next.f2190d && (next.f2200n == 4 || next.f2200n == 2)) {
                    MotionLayout.C0473j jVar = MotionLayout.C0473j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(next);
                    if (next.f2200n == 4) {
                        motionLayout.mo2582t0();
                        motionLayout.setState(MotionLayout.C0473j.SETUP);
                        motionLayout.setState(MotionLayout.C0473j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mo2532Z(true);
                        motionLayout.setState(MotionLayout.C0473j.SETUP);
                        motionLayout.setState(MotionLayout.C0473j.MOVING);
                        motionLayout.setState(jVar);
                    }
                    return true;
                } else if (i == next.f2189c && (next.f2200n == 3 || next.f2200n == 1)) {
                    MotionLayout.C0473j jVar2 = MotionLayout.C0473j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(next);
                    if (next.f2200n == 3) {
                        motionLayout.mo2584u0();
                        motionLayout.setState(MotionLayout.C0473j.SETUP);
                        motionLayout.setState(MotionLayout.C0473j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.mo2532Z(true);
                        motionLayout.setState(MotionLayout.C0473j.SETUP);
                        motionLayout.setState(MotionLayout.C0473j.MOVING);
                        motionLayout.setState(jVar2);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public C0513b mo2699g(int i, float f, float f2, MotionEvent motionEvent) {
        RectF j;
        if (i == -1) {
            return this.f2168c;
        }
        List<C0513b> z = mo2716z(i);
        float f3 = 0.0f;
        C0513b bVar = null;
        RectF rectF = new RectF();
        for (C0513b next : z) {
            if (!next.f2201o && next.f2198l != null) {
                next.f2198l.mo2764p(this.f2182q);
                RectF j2 = next.f2198l.mo2758j(this.f2166a, rectF);
                if ((j2 == null || motionEvent == null || j2.contains(motionEvent.getX(), motionEvent.getY())) && ((j = next.f2198l.mo2758j(this.f2166a, rectF)) == null || motionEvent == null || j.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a = next.f2198l.mo2751a(f, f2) * (next.f2189c == i ? -1.0f : 1.1f);
                    if (a > f3) {
                        bVar = next;
                        f3 = a;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: h */
    public int mo2700h() {
        C0513b bVar = this.f2168c;
        if (bVar != null) {
            return bVar.f2202p;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0564c mo2701i(int i) {
        return mo2702j(i, -1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0564c mo2702j(int i, int i2, int i3) {
        int c;
        if (this.f2176k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f2173h.size());
        }
        C0573g gVar = this.f2167b;
        if (!(gVar == null || (c = gVar.mo2934c(i, i2, i3)) == -1)) {
            i = c;
        }
        if (this.f2173h.get(i) != null) {
            return this.f2173h.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C0474a.m2600b(this.f2166a.getContext(), i) + " In MotionScene");
        SparseArray<C0564c> sparseArray = this.f2173h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: k */
    public int[] mo2703k() {
        int size = this.f2173h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f2173h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: l */
    public ArrayList<C0513b> mo2704l() {
        return this.f2170e;
    }

    /* renamed from: m */
    public int mo2705m() {
        C0513b bVar = this.f2168c;
        if (bVar != null) {
            return bVar.f2194h;
        }
        return this.f2177l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2706n() {
        C0513b bVar = this.f2168c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2189c;
    }

    /* renamed from: p */
    public Interpolator mo2707p() {
        int g = this.f2168c.f2191e;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.f2166a.getContext(), this.f2168c.f2193g);
        }
        if (g == -1) {
            return new C0512a(C6164c.m27053c(this.f2168c.f2192f));
        }
        if (g == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return new AccelerateInterpolator();
        }
        if (g == 2) {
            return new DecelerateInterpolator();
        }
        if (g == 4) {
            return new AnticipateInterpolator();
        }
        if (g != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* renamed from: q */
    public void mo2708q(C0508n nVar) {
        C0513b bVar = this.f2168c;
        if (bVar == null) {
            C0513b bVar2 = this.f2171f;
            if (bVar2 != null) {
                Iterator it = bVar2.f2197k.iterator();
                while (it.hasNext()) {
                    ((C0499h) it.next()).mo2640a(nVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f2197k.iterator();
        while (it2.hasNext()) {
            ((C0499h) it2.next()).mo2640a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public float mo2709r() {
        C0513b bVar = this.f2168c;
        if (bVar == null || bVar.f2198l == null) {
            return 0.0f;
        }
        return this.f2168c.f2198l.mo2754f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo2710s() {
        C0513b bVar = this.f2168c;
        if (bVar == null || bVar.f2198l == null) {
            return 0.0f;
        }
        return this.f2168c.f2198l.mo2755g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo2711t() {
        C0513b bVar = this.f2168c;
        if (bVar == null || bVar.f2198l == null) {
            return false;
        }
        return this.f2168c.f2198l.mo2756h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo2712u(float f, float f2) {
        C0513b bVar = this.f2168c;
        if (bVar == null || bVar.f2198l == null) {
            return 0.0f;
        }
        return this.f2168c.f2198l.mo2757i(f, f2);
    }

    /* renamed from: w */
    public float mo2713w() {
        C0513b bVar = this.f2168c;
        if (bVar != null) {
            return bVar.f2195i;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo2714x() {
        C0513b bVar = this.f2168c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2190d;
    }

    /* renamed from: y */
    public C0513b mo2715y(int i) {
        Iterator<C0513b> it = this.f2170e.iterator();
        while (it.hasNext()) {
            C0513b next = it.next();
            if (next.f2187a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: z */
    public List<C0513b> mo2716z(int i) {
        int v = m2841v(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C0513b> it = this.f2170e.iterator();
        while (it.hasNext()) {
            C0513b next = it.next();
            if (next.f2190d == v || next.f2189c == v) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    /* compiled from: MotionScene */
    public static class C0513b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f2187a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f2188b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f2189c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f2190d = -1;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f2191e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f2192f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f2193g = -1;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f2194h = 400;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f2195i = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C0511q f2196j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ArrayList<C0499h> f2197k = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C0547t f2198l = null;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public ArrayList<C0514a> f2199m = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f2200n = 0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f2201o = false;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f2202p = -1;

        /* renamed from: q */
        private int f2203q = 0;

        /* renamed from: r */
        private int f2204r = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.q$b$a */
        /* compiled from: MotionScene */
        static class C0514a implements View.OnClickListener {

            /* renamed from: b */
            private final C0513b f2205b;

            /* renamed from: c */
            int f2206c = -1;

            /* renamed from: d */
            int f2207d = 17;

            public C0514a(Context context, C0513b bVar, XmlPullParser xmlPullParser) {
                this.f2205b = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f2768V6);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0572f.f2786X6) {
                        this.f2206c = obtainStyledAttributes.getResourceId(index, this.f2206c);
                    } else if (index == C0572f.f2777W6) {
                        this.f2207d = obtainStyledAttributes.getInt(index, this.f2207d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public void mo2728a(MotionLayout motionLayout, int i, C0513b bVar) {
                int i2 = this.f2206c;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f2206c);
                    return;
                }
                int c = bVar.f2190d;
                int a = bVar.f2189c;
                if (c == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i3 = this.f2207d;
                boolean z = false;
                boolean z2 = ((i3 & 1) != 0 && i == c) | ((i3 & 1) != 0 && i == c) | ((i3 & 256) != 0 && i == c) | ((i3 & 16) != 0 && i == a);
                if ((i3 & 4096) != 0 && i == a) {
                    z = true;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo2729b(C0513b bVar, MotionLayout motionLayout) {
                C0513b bVar2 = this.f2205b;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = bVar2.f2189c;
                int c = this.f2205b.f2190d;
                if (c != -1) {
                    int i = motionLayout.f1848C;
                    if (i == c || i == a) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.f1848C != a) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: c */
            public void mo2730c(MotionLayout motionLayout) {
                int i = this.f2206c;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.f2206c);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public void onClick(View view) {
                MotionLayout c = this.f2205b.f2196j.f2166a;
                if (c.mo2552j0()) {
                    if (this.f2205b.f2190d == -1) {
                        int currentState = c.getCurrentState();
                        if (currentState == -1) {
                            c.mo2585v0(this.f2205b.f2189c);
                            return;
                        }
                        C0513b bVar = new C0513b(this.f2205b.f2196j, this.f2205b);
                        int unused = bVar.f2190d = currentState;
                        int unused2 = bVar.f2189c = this.f2205b.f2189c;
                        c.setTransition(bVar);
                        c.mo2582t0();
                        return;
                    }
                    C0513b bVar2 = this.f2205b.f2196j.f2168c;
                    int i = this.f2207d;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        C0513b bVar3 = this.f2205b.f2196j.f2168c;
                        C0513b bVar4 = this.f2205b;
                        if (bVar3 != bVar4) {
                            c.setTransition(bVar4);
                        }
                        if (c.getCurrentState() != c.getEndState() && c.getProgress() <= 0.5f) {
                            z = z2;
                            z3 = false;
                        }
                    } else {
                        z = z2;
                    }
                    if (!mo2729b(bVar2, c)) {
                        return;
                    }
                    if (z && (this.f2207d & 1) != 0) {
                        c.setTransition(this.f2205b);
                        c.mo2582t0();
                    } else if (z3 && (this.f2207d & 16) != 0) {
                        c.setTransition(this.f2205b);
                        c.mo2584u0();
                    } else if (z && (this.f2207d & 256) != 0) {
                        c.setTransition(this.f2205b);
                        c.setProgress(1.0f);
                    } else if (z3 && (this.f2207d & 4096) != 0) {
                        c.setTransition(this.f2205b);
                        c.setProgress(0.0f);
                    }
                }
            }
        }

        C0513b(C0511q qVar, C0513b bVar) {
            this.f2196j = qVar;
            if (bVar != null) {
                this.f2202p = bVar.f2202p;
                this.f2191e = bVar.f2191e;
                this.f2192f = bVar.f2192f;
                this.f2193g = bVar.f2193g;
                this.f2194h = bVar.f2194h;
                this.f2197k = bVar.f2197k;
                this.f2195i = bVar.f2195i;
                this.f2203q = bVar.f2203q;
            }
        }

        /* renamed from: v */
        private void m2891v(C0511q qVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C0572f.f2760U7) {
                    this.f2189c = typedArray.getResourceId(index, this.f2189c);
                    if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.f2189c))) {
                        C0564c cVar = new C0564c();
                        cVar.mo2920w(context, this.f2189c);
                        qVar.f2173h.append(this.f2189c, cVar);
                    }
                } else if (index == C0572f.f2769V7) {
                    this.f2190d = typedArray.getResourceId(index, this.f2190d);
                    if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.f2190d))) {
                        C0564c cVar2 = new C0564c();
                        cVar2.mo2920w(context, this.f2190d);
                        qVar.f2173h.append(this.f2190d, cVar2);
                    }
                } else if (index == C0572f.f2796Y7) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2193g = resourceId;
                        if (resourceId != -1) {
                            this.f2191e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f2192f = string;
                        if (string.indexOf("/") > 0) {
                            this.f2193g = typedArray.getResourceId(index, -1);
                            this.f2191e = -2;
                        } else {
                            this.f2191e = -1;
                        }
                    } else {
                        this.f2191e = typedArray.getInteger(index, this.f2191e);
                    }
                } else if (index == C0572f.f2778W7) {
                    this.f2194h = typedArray.getInt(index, this.f2194h);
                } else if (index == C0572f.f2815a8) {
                    this.f2195i = typedArray.getFloat(index, this.f2195i);
                } else if (index == C0572f.f2751T7) {
                    this.f2200n = typedArray.getInteger(index, this.f2200n);
                } else if (index == C0572f.f2742S7) {
                    this.f2187a = typedArray.getResourceId(index, this.f2187a);
                } else if (index == C0572f.f2825b8) {
                    this.f2201o = typedArray.getBoolean(index, this.f2201o);
                } else if (index == C0572f.f2805Z7) {
                    this.f2202p = typedArray.getInteger(index, -1);
                } else if (index == C0572f.f2787X7) {
                    this.f2203q = typedArray.getInteger(index, 0);
                } else if (index == C0572f.f2835c8) {
                    this.f2204r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2190d == -1) {
                this.f2188b = true;
            }
        }

        /* renamed from: w */
        private void m2892w(C0511q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2733R7);
            m2891v(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: A */
        public int mo2718A() {
            return this.f2190d;
        }

        /* renamed from: B */
        public C0547t mo2719B() {
            return this.f2198l;
        }

        /* renamed from: C */
        public boolean mo2720C() {
            return !this.f2201o;
        }

        /* renamed from: D */
        public boolean mo2721D(int i) {
            return (i & this.f2204r) != 0;
        }

        /* renamed from: E */
        public void mo2722E(int i) {
            this.f2194h = i;
        }

        /* renamed from: t */
        public void mo2723t(Context context, XmlPullParser xmlPullParser) {
            this.f2199m.add(new C0514a(context, this, xmlPullParser));
        }

        /* renamed from: u */
        public String mo2724u(Context context) {
            String str;
            if (this.f2190d == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.f2190d);
            }
            if (this.f2189c == -1) {
                return str + " -> null";
            }
            return str + " -> " + context.getResources().getResourceEntryName(this.f2189c);
        }

        /* renamed from: x */
        public int mo2725x() {
            return this.f2194h;
        }

        /* renamed from: y */
        public int mo2726y() {
            return this.f2189c;
        }

        /* renamed from: z */
        public int mo2727z() {
            return this.f2203q;
        }

        C0513b(C0511q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f2194h = qVar.f2177l;
            this.f2203q = qVar.f2178m;
            this.f2196j = qVar;
            m2892w(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
