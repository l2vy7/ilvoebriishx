package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0558a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
/* compiled from: KeyFrames */
public class C0499h {

    /* renamed from: b */
    static HashMap<String, Constructor<? extends C0476c>> f2038b;

    /* renamed from: a */
    private HashMap<Integer, ArrayList<C0476c>> f2039a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C0476c>> hashMap = new HashMap<>();
        f2038b = hashMap;
        try {
            hashMap.put("KeyAttribute", C0477d.class.getConstructor(new Class[0]));
            f2038b.put("KeyPosition", C0500i.class.getConstructor(new Class[0]));
            f2038b.put("KeyCycle", C0480f.class.getConstructor(new Class[0]));
            f2038b.put("KeyTimeCycle", C0503k.class.getConstructor(new Class[0]));
            f2038b.put("KeyTrigger", C0505l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C0499h(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, C0558a> hashMap;
        C0476c cVar;
        Exception e;
        C0476c cVar2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f2038b.containsKey(name)) {
                        try {
                            cVar = (C0476c) f2038b.get(name).newInstance(new Object[0]);
                            try {
                                cVar.mo2617c(context, Xml.asAttributeSet(xmlPullParser));
                                m2717b(cVar);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            Exception exc = e3;
                            cVar = cVar2;
                            e = exc;
                            Log.e("KeyFrames", "unable to create ", e);
                            cVar2 = cVar;
                            eventType = xmlPullParser.next();
                        }
                        cVar2 = cVar;
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || cVar2 == null || (hashMap = cVar2.f1972e) == null)) {
                        C0558a.m3054g(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2717b(C0476c cVar) {
        if (!this.f2039a.containsKey(Integer.valueOf(cVar.f1969b))) {
            this.f2039a.put(Integer.valueOf(cVar.f1969b), new ArrayList());
        }
        this.f2039a.get(Integer.valueOf(cVar.f1969b)).add(cVar);
    }

    /* renamed from: a */
    public void mo2640a(C0508n nVar) {
        ArrayList arrayList = this.f2039a.get(Integer.valueOf(nVar.f2125b));
        if (arrayList != null) {
            nVar.mo2653b(arrayList);
        }
        ArrayList arrayList2 = this.f2039a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0476c cVar = (C0476c) it.next();
                if (cVar.mo2618d(((ConstraintLayout.LayoutParams) nVar.f2124a.getLayoutParams()).f2363V)) {
                    nVar.mo2652a(cVar);
                }
            }
        }
    }
}
