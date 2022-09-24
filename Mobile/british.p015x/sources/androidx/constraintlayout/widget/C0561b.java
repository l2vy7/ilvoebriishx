package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: ConstraintLayoutStates */
public class C0561b {

    /* renamed from: a */
    private final ConstraintLayout f2454a;

    /* renamed from: b */
    C0564c f2455b;

    /* renamed from: c */
    int f2456c = -1;

    /* renamed from: d */
    int f2457d = -1;

    /* renamed from: e */
    private SparseArray<C0562a> f2458e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0564c> f2459f = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* compiled from: ConstraintLayoutStates */
    static class C0562a {

        /* renamed from: a */
        int f2460a;

        /* renamed from: b */
        ArrayList<C0563b> f2461b = new ArrayList<>();

        /* renamed from: c */
        int f2462c = -1;

        /* renamed from: d */
        C0564c f2463d;

        public C0562a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f3015v7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f3024w7) {
                    this.f2460a = obtainStyledAttributes.getResourceId(index, this.f2460a);
                } else if (index == C0572f.f3033x7) {
                    this.f2462c = obtainStyledAttributes.getResourceId(index, this.f2462c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2462c);
                    context.getResources().getResourceName(this.f2462c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        C0564c cVar = new C0564c();
                        this.f2463d = cVar;
                        cVar.mo2909i(context, this.f2462c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2896a(C0563b bVar) {
            this.f2461b.add(bVar);
        }

        /* renamed from: b */
        public int mo2897b(float f, float f2) {
            for (int i = 0; i < this.f2461b.size(); i++) {
                if (this.f2461b.get(i).mo2898a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* compiled from: ConstraintLayoutStates */
    static class C0563b {

        /* renamed from: a */
        float f2464a = Float.NaN;

        /* renamed from: b */
        float f2465b = Float.NaN;

        /* renamed from: c */
        float f2466c = Float.NaN;

        /* renamed from: d */
        float f2467d = Float.NaN;

        /* renamed from: e */
        int f2468e = -1;

        /* renamed from: f */
        C0564c f2469f;

        public C0563b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0572f.f2845d8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2855e8) {
                    this.f2468e = obtainStyledAttributes.getResourceId(index, this.f2468e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2468e);
                    context.getResources().getResourceName(this.f2468e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        C0564c cVar = new C0564c();
                        this.f2469f = cVar;
                        cVar.mo2909i(context, this.f2468e);
                    }
                } else if (index == C0572f.f2865f8) {
                    this.f2467d = obtainStyledAttributes.getDimension(index, this.f2467d);
                } else if (index == C0572f.f2875g8) {
                    this.f2465b = obtainStyledAttributes.getDimension(index, this.f2465b);
                } else if (index == C0572f.f2885h8) {
                    this.f2466c = obtainStyledAttributes.getDimension(index, this.f2466c);
                } else if (index == C0572f.f2895i8) {
                    this.f2464a = obtainStyledAttributes.getDimension(index, this.f2464a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2898a(float f, float f2) {
            if (!Float.isNaN(this.f2464a) && f < this.f2464a) {
                return false;
            }
            if (!Float.isNaN(this.f2465b) && f2 < this.f2465b) {
                return false;
            }
            if (!Float.isNaN(this.f2466c) && f > this.f2466c) {
                return false;
            }
            if (Float.isNaN(this.f2467d) || f2 <= this.f2467d) {
                return true;
            }
            return false;
        }
    }

    C0561b(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2454a = constraintLayout;
        m3062a(context, i);
    }

    /* renamed from: a */
    private void m3062a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0562a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
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
                            aVar = new C0562a(context, xml);
                            this.f2458e.put(aVar.f2460a, aVar);
                        } else if (c == 3) {
                            C0563b bVar = new C0563b(context, xml);
                            if (aVar != null) {
                                aVar.mo2896a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m3063b(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m3063b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0564c cVar = new C0564c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (TtmlNode.ATTR_ID.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.mo2921x(context, xmlPullParser);
                this.f2459f.put(i, cVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2894c(C0570d dVar) {
    }

    /* renamed from: d */
    public void mo2895d(int i, float f, float f2) {
        C0564c cVar;
        C0562a aVar;
        int b;
        C0564c cVar2;
        int i2 = this.f2456c;
        if (i2 == i) {
            if (i == -1) {
                aVar = this.f2458e.valueAt(0);
            } else {
                aVar = this.f2458e.get(i2);
            }
            int i3 = this.f2457d;
            if ((i3 == -1 || !aVar.f2461b.get(i3).mo2898a(f, f2)) && this.f2457d != (b = aVar.mo2897b(f, f2))) {
                if (b == -1) {
                    cVar2 = this.f2455b;
                } else {
                    cVar2 = aVar.f2461b.get(b).f2469f;
                }
                if (b != -1) {
                    int i4 = aVar.f2461b.get(b).f2468e;
                }
                if (cVar2 != null) {
                    this.f2457d = b;
                    cVar2.mo2904d(this.f2454a);
                    return;
                }
                return;
            }
            return;
        }
        this.f2456c = i;
        C0562a aVar2 = this.f2458e.get(i);
        int b2 = aVar2.mo2897b(f, f2);
        if (b2 == -1) {
            cVar = aVar2.f2463d;
        } else {
            cVar = aVar2.f2461b.get(b2).f2469f;
        }
        if (b2 != -1) {
            int i5 = aVar2.f2461b.get(b2).f2468e;
        }
        if (cVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2457d = b2;
        cVar.mo2904d(this.f2454a);
    }
}
