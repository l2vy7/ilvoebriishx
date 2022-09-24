package p303d9;

import java.util.ArrayList;
import p308g8.C12718d;
import p308g8.C12738v;
import p308g8.C12740x;
import p311h9.C12764c;
import p311h9.C12773l;
import p311h9.C12782u;
import p315j9.C12810d;
import p317k9.C12821b;

/* renamed from: d9.u */
/* compiled from: NetscapeDraftHeaderParser */
public class C12680u {

    /* renamed from: a */
    public static final C12680u f55317a = new C12680u();

    /* renamed from: b */
    private C12738v m53959b(C12821b bVar, C12782u uVar) {
        boolean z;
        boolean z2;
        String str;
        char i;
        int b = uVar.mo47921b();
        int b2 = uVar.mo47921b();
        int c = uVar.mo47922c();
        while (true) {
            z = true;
            if (b >= c || (i = bVar.mo47972i(b)) == '=') {
                z2 = false;
            } else if (i == ';') {
                z2 = true;
                break;
            } else {
                b++;
            }
        }
        z2 = false;
        if (b == c) {
            str = bVar.mo47980r(b2, c);
            z2 = true;
        } else {
            str = bVar.mo47980r(b2, b);
            b++;
        }
        if (z2) {
            uVar.mo47923d(b);
            return new C12773l(str, (String) null);
        }
        int i2 = b;
        while (true) {
            if (i2 >= c) {
                z = z2;
                break;
            } else if (bVar.mo47972i(i2) == ';') {
                break;
            } else {
                i2++;
            }
        }
        while (b < i2 && C12810d.m54317a(bVar.mo47972i(b))) {
            b++;
        }
        int i3 = i2;
        while (i3 > b && C12810d.m54317a(bVar.mo47972i(i3 - 1))) {
            i3--;
        }
        String q = bVar.mo47979q(b, i3);
        if (z) {
            i2++;
        }
        uVar.mo47923d(i2);
        return new C12773l(str, q);
    }

    /* renamed from: a */
    public C12718d mo47690a(C12821b bVar, C12782u uVar) throws C12740x {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (uVar != null) {
            C12738v b = m53959b(bVar, uVar);
            ArrayList arrayList = new ArrayList();
            while (!uVar.mo47920a()) {
                arrayList.add(m53959b(bVar, uVar));
            }
            return new C12764c(b.getName(), b.getValue(), (C12738v[]) arrayList.toArray(new C12738v[arrayList.size()]));
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
