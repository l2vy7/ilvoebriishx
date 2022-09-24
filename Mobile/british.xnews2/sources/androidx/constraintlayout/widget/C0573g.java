package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.g */
/* compiled from: StateSet */
public class C0573g {

    /* renamed from: a */
    int f3052a = -1;

    /* renamed from: b */
    int f3053b = -1;

    /* renamed from: c */
    int f3054c = -1;

    /* renamed from: d */
    private SparseArray<C0574a> f3055d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0564c> f3056e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.g$a */
    /* compiled from: StateSet */
    static class C0574a {

        /* renamed from: a */
        int f3057a;

        /* renamed from: b */
        ArrayList<C0575b> f3058b = new ArrayList<>();

        /* renamed from: c */
        int f3059c = -1;

        /* renamed from: d */
        boolean f3060d;

        public C0574a(Context context, XmlPullParser xmlPullParser) {
            this.f3060d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f3015v7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f3024w7) {
                    this.f3057a = obtainStyledAttributes.getResourceId(index, this.f3057a);
                } else if (index == C0572f.f3033x7) {
                    this.f3059c = obtainStyledAttributes.getResourceId(index, this.f3059c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3059c);
                    context.getResources().getResourceName(this.f3059c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f3060d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2936a(C0575b bVar) {
            this.f3058b.add(bVar);
        }

        /* renamed from: b */
        public int mo2937b(float f, float f2) {
            for (int i = 0; i < this.f3058b.size(); i++) {
                if (this.f3058b.get(i).mo2938a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.g$b */
    /* compiled from: StateSet */
    static class C0575b {

        /* renamed from: a */
        float f3061a = Float.NaN;

        /* renamed from: b */
        float f3062b = Float.NaN;

        /* renamed from: c */
        float f3063c = Float.NaN;

        /* renamed from: d */
        float f3064d = Float.NaN;

        /* renamed from: e */
        int f3065e = -1;

        /* renamed from: f */
        boolean f3066f;

        public C0575b(Context context, XmlPullParser xmlPullParser) {
            this.f3066f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f2845d8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2855e8) {
                    this.f3065e = obtainStyledAttributes.getResourceId(index, this.f3065e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3065e);
                    context.getResources().getResourceName(this.f3065e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f3066f = true;
                    }
                } else if (index == C0572f.f2865f8) {
                    this.f3064d = obtainStyledAttributes.getDimension(index, this.f3064d);
                } else if (index == C0572f.f2875g8) {
                    this.f3062b = obtainStyledAttributes.getDimension(index, this.f3062b);
                } else if (index == C0572f.f2885h8) {
                    this.f3063c = obtainStyledAttributes.getDimension(index, this.f3063c);
                } else if (index == C0572f.f2895i8) {
                    this.f3061a = obtainStyledAttributes.getDimension(index, this.f3061a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2938a(float f, float f2) {
            if (!Float.isNaN(this.f3061a) && f < this.f3061a) {
                return false;
            }
            if (!Float.isNaN(this.f3062b) && f2 < this.f3062b) {
                return false;
            }
            if (!Float.isNaN(this.f3063c) && f > this.f3063c) {
                return false;
            }
            if (Float.isNaN(this.f3064d) || f2 <= this.f3064d) {
                return true;
            }
            return false;
        }
    }

    public C0573g(Context context, XmlPullParser xmlPullParser) {
        m3115b(context, xmlPullParser);
    }

    /* renamed from: b */
    private void m3115b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f2580A7);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0572f.f2589B7) {
                this.f3052a = obtainStyledAttributes.getResourceId(index, this.f3052a);
            }
        }
        C0574a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0574a(context, xmlPullParser);
                            this.f3055d.put(aVar.f3057a, aVar);
                        } else if (c != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            C0575b bVar = new C0575b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.mo2936a(bVar);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo2933a(int i, int i2, float f, float f2) {
        C0574a aVar = this.f3055d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            C0575b bVar = null;
            Iterator<C0575b> it = aVar.f3058b.iterator();
            while (it.hasNext()) {
                C0575b next = it.next();
                if (next.mo2938a(f, f2)) {
                    if (i == next.f3065e) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f3065e;
            }
            return aVar.f3059c;
        } else if (aVar.f3059c == i) {
            return i;
        } else {
            Iterator<C0575b> it2 = aVar.f3058b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f3065e) {
                    return i;
                }
            }
            return aVar.f3059c;
        }
    }

    /* renamed from: c */
    public int mo2934c(int i, int i2, int i3) {
        return mo2935d(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: d */
    public int mo2935d(int i, int i2, float f, float f2) {
        C0574a aVar;
        int b;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.f3055d.valueAt(0);
            } else {
                aVar = this.f3055d.get(this.f3053b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f3054c == -1 || !aVar.f3058b.get(i).mo2938a(f, f2)) && i != (b = aVar.mo2937b(f, f2))) {
                return b == -1 ? aVar.f3059c : aVar.f3058b.get(b).f3065e;
            }
            return i;
        }
        C0574a aVar2 = this.f3055d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b2 = aVar2.mo2937b(f, f2);
        return b2 == -1 ? aVar2.f3059c : aVar2.f3058b.get(b2).f3065e;
    }
}
