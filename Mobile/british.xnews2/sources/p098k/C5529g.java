package p098k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0291g;
import androidx.appcompat.widget.C0384f0;
import androidx.appcompat.widget.C0409p;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p072f.C5247j;
import p073f0.C5248a;
import p103l.C5632c;
import p110m0.C5685b;
import p110m0.C5710h;

/* renamed from: k.g */
/* compiled from: SupportMenuInflater */
public class C5529g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f23981e;

    /* renamed from: f */
    static final Class<?>[] f23982f;

    /* renamed from: a */
    final Object[] f23983a;

    /* renamed from: b */
    final Object[] f23984b;

    /* renamed from: c */
    Context f23985c;

    /* renamed from: d */
    private Object f23986d;

    /* renamed from: k.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C5530a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f23987c = {MenuItem.class};

        /* renamed from: a */
        private Object f23988a;

        /* renamed from: b */
        private Method f23989b;

        public C5530a(Object obj, String str) {
            this.f23988a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f23989b = cls.getMethod(str, f23987c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f23989b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f23989b.invoke(this.f23988a, new Object[]{menuItem})).booleanValue();
                }
                this.f23989b.invoke(this.f23988a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: k.g$b */
    /* compiled from: SupportMenuInflater */
    private class C5531b {

        /* renamed from: A */
        C5685b f23990A;

        /* renamed from: B */
        private CharSequence f23991B;

        /* renamed from: C */
        private CharSequence f23992C;

        /* renamed from: D */
        private ColorStateList f23993D = null;

        /* renamed from: E */
        private PorterDuff.Mode f23994E = null;

        /* renamed from: a */
        private Menu f23996a;

        /* renamed from: b */
        private int f23997b;

        /* renamed from: c */
        private int f23998c;

        /* renamed from: d */
        private int f23999d;

        /* renamed from: e */
        private int f24000e;

        /* renamed from: f */
        private boolean f24001f;

        /* renamed from: g */
        private boolean f24002g;

        /* renamed from: h */
        private boolean f24003h;

        /* renamed from: i */
        private int f24004i;

        /* renamed from: j */
        private int f24005j;

        /* renamed from: k */
        private CharSequence f24006k;

        /* renamed from: l */
        private CharSequence f24007l;

        /* renamed from: m */
        private int f24008m;

        /* renamed from: n */
        private char f24009n;

        /* renamed from: o */
        private int f24010o;

        /* renamed from: p */
        private char f24011p;

        /* renamed from: q */
        private int f24012q;

        /* renamed from: r */
        private int f24013r;

        /* renamed from: s */
        private boolean f24014s;

        /* renamed from: t */
        private boolean f24015t;

        /* renamed from: u */
        private boolean f24016u;

        /* renamed from: v */
        private int f24017v;

        /* renamed from: w */
        private int f24018w;

        /* renamed from: x */
        private String f24019x;

        /* renamed from: y */
        private String f24020y;

        /* renamed from: z */
        private String f24021z;

        public C5531b(Menu menu) {
            this.f23996a = menu;
            mo22050h();
        }

        /* renamed from: c */
        private char m24671c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m24672e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C5529g.this.f23985c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m24673i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f24014s).setVisible(this.f24015t).setEnabled(this.f24016u).setCheckable(this.f24013r >= 1).setTitleCondensed(this.f24007l).setIcon(this.f24008m);
            int i = this.f24017v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f24021z != null) {
                if (!C5529g.this.f23985c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C5530a(C5529g.this.mo22042b(), this.f24021z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f24013r >= 2) {
                if (menuItem instanceof C0291g) {
                    ((C0291g) menuItem).mo1244t(true);
                } else if (menuItem instanceof C5632c) {
                    ((C5632c) menuItem).mo22254h(true);
                }
            }
            String str = this.f24019x;
            if (str != null) {
                menuItem.setActionView((View) m24672e(str, C5529g.f23981e, C5529g.this.f23983a));
                z = true;
            }
            int i2 = this.f24018w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C5685b bVar = this.f23990A;
            if (bVar != null) {
                C5710h.m25221b(menuItem, bVar);
            }
            C5710h.m25223d(menuItem, this.f23991B);
            C5710h.m25227h(menuItem, this.f23992C);
            C5710h.m25222c(menuItem, this.f24009n, this.f24010o);
            C5710h.m25226g(menuItem, this.f24011p, this.f24012q);
            PorterDuff.Mode mode = this.f23994E;
            if (mode != null) {
                C5710h.m25225f(menuItem, mode);
            }
            ColorStateList colorStateList = this.f23993D;
            if (colorStateList != null) {
                C5710h.m25224e(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo22045a() {
            this.f24003h = true;
            m24673i(this.f23996a.add(this.f23997b, this.f24004i, this.f24005j, this.f24006k));
        }

        /* renamed from: b */
        public SubMenu mo22046b() {
            this.f24003h = true;
            SubMenu addSubMenu = this.f23996a.addSubMenu(this.f23997b, this.f24004i, this.f24005j, this.f24006k);
            m24673i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo22047d() {
            return this.f24003h;
        }

        /* renamed from: f */
        public void mo22048f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C5529g.this.f23985c.obtainStyledAttributes(attributeSet, C5247j.f23208t1);
            this.f23997b = obtainStyledAttributes.getResourceId(C5247j.f23218v1, 0);
            this.f23998c = obtainStyledAttributes.getInt(C5247j.f23228x1, 0);
            this.f23999d = obtainStyledAttributes.getInt(C5247j.f23233y1, 0);
            this.f24000e = obtainStyledAttributes.getInt(C5247j.f23238z1, 0);
            this.f24001f = obtainStyledAttributes.getBoolean(C5247j.f23223w1, true);
            this.f24002g = obtainStyledAttributes.getBoolean(C5247j.f23213u1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo22049g(AttributeSet attributeSet) {
            C0384f0 u = C0384f0.m1993u(C5529g.this.f23985c, attributeSet, C5247j.f22982A1);
            this.f24004i = u.mo2108n(C5247j.f22997D1, 0);
            this.f24005j = (u.mo2105k(C5247j.f23012G1, this.f23998c) & -65536) | (u.mo2105k(C5247j.f23017H1, this.f23999d) & RtpPacket.MAX_SEQUENCE_NUMBER);
            this.f24006k = u.mo2110p(C5247j.f23022I1);
            this.f24007l = u.mo2110p(C5247j.f23027J1);
            this.f24008m = u.mo2108n(C5247j.f22987B1, 0);
            this.f24009n = m24671c(u.mo2109o(C5247j.f23032K1));
            this.f24010o = u.mo2105k(C5247j.f23067R1, 4096);
            this.f24011p = m24671c(u.mo2109o(C5247j.f23037L1));
            this.f24012q = u.mo2105k(C5247j.f23087V1, 4096);
            int i = C5247j.f23042M1;
            if (u.mo2113s(i)) {
                this.f24013r = u.mo2095a(i, false) ? 1 : 0;
            } else {
                this.f24013r = this.f24000e;
            }
            this.f24014s = u.mo2095a(C5247j.f23002E1, false);
            this.f24015t = u.mo2095a(C5247j.f23007F1, this.f24001f);
            this.f24016u = u.mo2095a(C5247j.f22992C1, this.f24002g);
            this.f24017v = u.mo2105k(C5247j.f23092W1, -1);
            this.f24021z = u.mo2109o(C5247j.f23047N1);
            this.f24018w = u.mo2108n(C5247j.f23052O1, 0);
            this.f24019x = u.mo2109o(C5247j.f23062Q1);
            String o = u.mo2109o(C5247j.f23057P1);
            this.f24020y = o;
            boolean z = o != null;
            if (z && this.f24018w == 0 && this.f24019x == null) {
                this.f23990A = (C5685b) m24672e(o, C5529g.f23982f, C5529g.this.f23984b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f23990A = null;
            }
            this.f23991B = u.mo2110p(C5247j.f23072S1);
            this.f23992C = u.mo2110p(C5247j.f23097X1);
            int i2 = C5247j.f23082U1;
            if (u.mo2113s(i2)) {
                this.f23994E = C0409p.m2201e(u.mo2105k(i2, -1), this.f23994E);
            } else {
                this.f23994E = null;
            }
            int i3 = C5247j.f23077T1;
            if (u.mo2113s(i3)) {
                this.f23993D = u.mo2097c(i3);
            } else {
                this.f23993D = null;
            }
            u.mo2114w();
            this.f24003h = false;
        }

        /* renamed from: h */
        public void mo22050h() {
            this.f23997b = 0;
            this.f23998c = 0;
            this.f23999d = 0;
            this.f24000e = 0;
            this.f24001f = true;
            this.f24002g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f23981e = r0
            f23982f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p098k.C5529g.<clinit>():void");
    }

    public C5529g(Context context) {
        super(context);
        this.f23985c = context;
        Object[] objArr = {context};
        this.f23983a = objArr;
        this.f23984b = objArr;
    }

    /* renamed from: a */
    private Object m24668a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m24668a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m24669c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C5531b bVar = new C5531b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo22050h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo22047d()) {
                                C5685b bVar2 = bVar.f23990A;
                                if (bVar2 == null || !bVar2.hasSubMenu()) {
                                    bVar.mo22045a();
                                } else {
                                    bVar.mo22046b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo22048f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo22049g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m24669c(xmlPullParser, attributeSet, bVar.mo22046b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo22042b() {
        if (this.f23986d == null) {
            this.f23986d = m24668a(this.f23985c);
        }
        return this.f23986d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C5248a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f23985c.getResources().getLayout(i);
            m24669c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
