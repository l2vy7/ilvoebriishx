package p010b0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p180z.C6423g;

/* renamed from: b0.d */
/* compiled from: GradientColorInflaterCompat */
final class C1520d {
    /* renamed from: a */
    private static C1521a m7875a(C1521a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C1521a(i, i3, i2);
        }
        return new C1521a(i, i2);
    }

    /* renamed from: b */
    static Shader m7876b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = C1532g.m7921s(resources, theme2, attributeSet, C6423g.f26456y);
            float j = C1532g.m7912j(s, xmlPullParser2, "startX", C6423g.f26425H, 0.0f);
            float j2 = C1532g.m7912j(s, xmlPullParser2, "startY", C6423g.f26426I, 0.0f);
            float j3 = C1532g.m7912j(s, xmlPullParser2, "endX", C6423g.f26427J, 0.0f);
            float j4 = C1532g.m7912j(s, xmlPullParser2, "endY", C6423g.f26428K, 0.0f);
            float j5 = C1532g.m7912j(s, xmlPullParser2, "centerX", C6423g.f26420C, 0.0f);
            float j6 = C1532g.m7912j(s, xmlPullParser2, "centerY", C6423g.f26421D, 0.0f);
            int k = C1532g.m7913k(s, xmlPullParser2, SessionDescription.ATTR_TYPE, C6423g.f26419B, 0);
            int f = C1532g.m7908f(s, xmlPullParser2, "startColor", C6423g.f26457z, 0);
            boolean r = C1532g.m7920r(xmlPullParser2, "centerColor");
            int f2 = C1532g.m7908f(s, xmlPullParser2, "centerColor", C6423g.f26424G, 0);
            int f3 = C1532g.m7908f(s, xmlPullParser2, "endColor", C6423g.f26418A, 0);
            int k2 = C1532g.m7913k(s, xmlPullParser2, "tileMode", C6423g.f26423F, 0);
            float f4 = j5;
            float j7 = C1532g.m7912j(s, xmlPullParser2, "gradientRadius", C6423g.f26422E, 0.0f);
            s.recycle();
            C1521a a = m7875a(m7877c(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > 0.0f) {
                    int[] iArr = a.f6546a;
                    return new RadialGradient(f5, j6, j7, iArr, a.f6547b, m7878d(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a.f6546a, a.f6547b, m7878d(k2));
            } else {
                return new SweepGradient(f4, j6, a.f6546a, a.f6547b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p010b0.C1520d.C1521a m7877c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p180z.C6423g.f26429L
            android.content.res.TypedArray r3 = p010b0.C1532g.m7921s(r9, r12, r11, r3)
            int r5 = p180z.C6423g.f26430M
            boolean r6 = r3.hasValue(r5)
            int r7 = p180z.C6423g.f26431N
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            b0.d$a r9 = new b0.d$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1520d.m7877c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b0.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m7878d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: b0.d$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class C1521a {

        /* renamed from: a */
        final int[] f6546a;

        /* renamed from: b */
        final float[] f6547b;

        C1521a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f6546a = new int[size];
            this.f6547b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f6546a[i] = list.get(i).intValue();
                this.f6547b[i] = list2.get(i).floatValue();
            }
        }

        C1521a(int i, int i2) {
            this.f6546a = new int[]{i, i2};
            this.f6547b = new float[]{0.0f, 1.0f};
        }

        C1521a(int i, int i2, int i3) {
            this.f6546a = new int[]{i, i2, i3};
            this.f6547b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
