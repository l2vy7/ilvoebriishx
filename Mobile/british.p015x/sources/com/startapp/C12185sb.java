package com.startapp;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.startapp.sb */
/* compiled from: Sta */
public class C12185sb {

    /* renamed from: a */
    public final Node f54148a;

    /* renamed from: b */
    public final boolean f54149b = true;

    public C12185sb(Node node) {
        this.f54148a = node;
    }

    /* renamed from: a */
    public final List<C12185sb> mo45760a(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C11909fd.m52325a(this.f54148a, str, str2, list)).iterator();
        while (it.hasNext()) {
            arrayList.add(new C12185sb((Node) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C12185sb mo45761b(String str, String str2, List<String> list) {
        ArrayList arrayList = (ArrayList) C11909fd.m52325a(this.f54148a, str, str2, (List<String>) null);
        Node node = arrayList.isEmpty() ? null : (Node) arrayList.get(0);
        if (node != null) {
            return new C12185sb(node);
        }
        return null;
    }

    /* renamed from: c */
    public final List<String> mo45766c(String str) {
        List<C12185sb> a = mo45760a(str, (String) null, (List<String>) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) a).iterator();
        while (it.hasNext()) {
            String d = ((C12185sb) it.next()).mo45767d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo45767d() {
        Node node = this.f54148a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    /* renamed from: e */
    public List<String> mo45769e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo45768d(str)).iterator();
        while (it.hasNext()) {
            String d = ((C12185sb) it.next()).mo45767d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final String mo45770f(String str) {
        C12185sb b = mo45761b(str, (String) null, (List<String>) null);
        if (b == null) {
            return null;
        }
        return b.mo45767d();
    }

    public C12185sb(String str) throws ParserConfigurationException, SAXException, IOException {
        String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        newInstance.setExpandEntityReferences(false);
        this.f54148a = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst))).getFirstChild();
    }

    /* renamed from: d */
    public final List<C12185sb> mo45768d(String str) {
        return mo45759a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    /* renamed from: a */
    public final List<C12185sb> mo45759a(String str, String str2, String str3, List<String> list) {
        ArrayList arrayList = new ArrayList();
        C12185sb b = mo45761b(str2, (String) null, (List<String>) null);
        if (b == null) {
            return arrayList;
        }
        return b.mo45760a(str, str3, list);
    }

    /* renamed from: b */
    public final Integer mo45762b(String str) {
        try {
            String a = mo45756a(str);
            if (a != null) {
                return Integer.valueOf(Integer.parseInt(a));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final List<String> mo45764b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo45759a(str, str2, (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            String d = ((C12185sb) it.next()).mo45767d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C12185sb> mo45765c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo45759a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            C12185sb b = ((C12185sb) it.next()).mo45761b("Linear", (String) null, (List<String>) null);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo45756a(String str) {
        Node namedItem = this.f54148a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo45757a(String str, String str2) {
        C12185sb b;
        C12185sb b2 = mo45761b(str2, (String) null, (List<String>) null);
        if (b2 == null || (b = b2.mo45761b(str, (String) null, (List<String>) null)) == null) {
            return null;
        }
        return b.mo45767d();
    }

    /* renamed from: b */
    public List<String> mo45763b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo45768d("creativeView")).iterator();
        while (it.hasNext()) {
            String d = ((C12185sb) it.next()).mo45767d();
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C12185sb> mo45758a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mo45759a("Creative", "Creatives", (String) null, (List<String>) null)).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C12185sb) it.next()).mo45759a("Companion", "CompanionAds", (String) null, (List<String>) null));
        }
        return arrayList;
    }
}
