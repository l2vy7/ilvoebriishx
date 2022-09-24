package p010b0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p094j0.C5477d;
import p180z.C6423g;

/* renamed from: b0.c */
/* compiled from: FontResourcesParserCompat */
public class C1515c {

    /* renamed from: b0.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C1516a {
    }

    /* renamed from: b0.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C1517b implements C1516a {

        /* renamed from: a */
        private final C1518c[] f6535a;

        public C1517b(C1518c[] cVarArr) {
            this.f6535a = cVarArr;
        }

        /* renamed from: a */
        public C1518c[] mo7069a() {
            return this.f6535a;
        }
    }

    /* renamed from: b0.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C1518c {

        /* renamed from: a */
        private final String f6536a;

        /* renamed from: b */
        private int f6537b;

        /* renamed from: c */
        private boolean f6538c;

        /* renamed from: d */
        private String f6539d;

        /* renamed from: e */
        private int f6540e;

        /* renamed from: f */
        private int f6541f;

        public C1518c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f6536a = str;
            this.f6537b = i;
            this.f6538c = z;
            this.f6539d = str2;
            this.f6540e = i2;
            this.f6541f = i3;
        }

        /* renamed from: a */
        public String mo7070a() {
            return this.f6536a;
        }

        /* renamed from: b */
        public int mo7071b() {
            return this.f6541f;
        }

        /* renamed from: c */
        public int mo7072c() {
            return this.f6540e;
        }

        /* renamed from: d */
        public String mo7073d() {
            return this.f6539d;
        }

        /* renamed from: e */
        public int mo7074e() {
            return this.f6537b;
        }

        /* renamed from: f */
        public boolean mo7075f() {
            return this.f6538c;
        }
    }

    /* renamed from: b0.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C1519d implements C1516a {

        /* renamed from: a */
        private final C5477d f6542a;

        /* renamed from: b */
        private final int f6543b;

        /* renamed from: c */
        private final int f6544c;

        /* renamed from: d */
        private final String f6545d;

        public C1519d(C5477d dVar, int i, int i2, String str) {
            this.f6542a = dVar;
            this.f6544c = i;
            this.f6543b = i2;
            this.f6545d = str;
        }

        /* renamed from: a */
        public int mo7076a() {
            return this.f6544c;
        }

        /* renamed from: b */
        public C5477d mo7077b() {
            return this.f6542a;
        }

        /* renamed from: c */
        public String mo7078c() {
            return this.f6545d;
        }

        /* renamed from: d */
        public int mo7079d() {
            return this.f6543b;
        }
    }

    /* renamed from: a */
    private static int m7856a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static p010b0.C1515c.C1516a m7857b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            b0.c$a r3 = m7859d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1515c.m7857b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):b0.c$a");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m7858c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m7856a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m7863h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m7863h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C1516a m7859d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m7860e(xmlPullParser, resources);
        }
        m7862g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C1516a m7860e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C6423g.f26437f);
        String string = obtainAttributes.getString(C6423g.f26438g);
        String string2 = obtainAttributes.getString(C6423g.f26442k);
        String string3 = obtainAttributes.getString(C6423g.f26443l);
        int resourceId = obtainAttributes.getResourceId(C6423g.f26439h, 0);
        int integer = obtainAttributes.getInteger(C6423g.f26440i, 1);
        int integer2 = obtainAttributes.getInteger(C6423g.f26441j, 500);
        String string4 = obtainAttributes.getString(C6423g.f26444m);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m7861f(xmlPullParser, resources));
                    } else {
                        m7862g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1517b((C1518c[]) arrayList.toArray(new C1518c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m7862g(xmlPullParser);
        }
        return new C1519d(new C5477d(string, string2, string3, m7858c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C1518c m7861f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C6423g.f26445n);
        int i = C6423g.f26454w;
        if (!obtainAttributes.hasValue(i)) {
            i = C6423g.f26447p;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C6423g.f26452u;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C6423g.f26448q;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C6423g.f26455x;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C6423g.f26449r;
        }
        int i5 = C6423g.f26453v;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C6423g.f26450s;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C6423g.f26451t;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C6423g.f26446o;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m7862g(xmlPullParser);
        }
        return new C1518c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m7862g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m7863h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
