package p010b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: b0.b */
/* compiled from: ComplexColorCompat */
public final class C1514b {

    /* renamed from: a */
    private final Shader f6532a;

    /* renamed from: b */
    private final ColorStateList f6533b;

    /* renamed from: c */
    private int f6534c;

    private C1514b(Shader shader, ColorStateList colorStateList, int i) {
        this.f6532a = shader;
        this.f6533b = colorStateList;
        this.f6534c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p010b0.C1514b m7844a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = p010b0.C1513a.m7837b(r4, r5, r0, r6)
            b0.b r4 = m7846c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = p010b0.C1520d.m7876b(r4, r5, r0, r6)
            b0.b r4 = m7847d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            goto L_0x0065
        L_0x0064:
            throw r4
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1514b.m7844a(android.content.res.Resources, int, android.content.res.Resources$Theme):b0.b");
    }

    /* renamed from: b */
    static C1514b m7845b(int i) {
        return new C1514b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C1514b m7846c(ColorStateList colorStateList) {
        return new C1514b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C1514b m7847d(Shader shader) {
        return new C1514b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C1514b m7848g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m7844a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo7062e() {
        return this.f6534c;
    }

    /* renamed from: f */
    public Shader mo7063f() {
        return this.f6532a;
    }

    /* renamed from: h */
    public boolean mo7064h() {
        return this.f6532a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6533b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7065i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f6532a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f6533b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b0.C1514b.mo7065i():boolean");
    }

    /* renamed from: j */
    public boolean mo7066j(int[] iArr) {
        if (mo7065i()) {
            ColorStateList colorStateList = this.f6533b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f6534c) {
                this.f6534c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo7067k(int i) {
        this.f6534c = i;
    }

    /* renamed from: l */
    public boolean mo7068l() {
        return mo7064h() || this.f6534c != 0;
    }
}
