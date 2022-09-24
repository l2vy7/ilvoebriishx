package com.startapp;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.startapp.kd */
/* compiled from: Sta */
public class C12018kd {

    /* renamed from: a */
    public final HashMap<View, String> f53215a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, C12019a> f53216b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, View> f53217c = new HashMap<>();

    /* renamed from: d */
    public final HashSet<View> f53218d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f53219e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f53220f = new HashSet<>();

    /* renamed from: g */
    public final HashMap<String, String> f53221g = new HashMap<>();

    /* renamed from: h */
    public final Map<View, Boolean> f53222h = new WeakHashMap();

    /* renamed from: i */
    public boolean f53223i;

    /* renamed from: com.startapp.kd$a */
    /* compiled from: Sta */
    public static class C12019a {

        /* renamed from: a */
        public final C12456yd f53224a;

        /* renamed from: b */
        public final ArrayList<String> f53225b = new ArrayList<>();

        public C12019a(C12456yd ydVar, String str) {
            this.f53224a = ydVar;
            mo45512a(str);
        }

        /* renamed from: a */
        public void mo45512a(String str) {
            this.f53225b.add(str);
        }
    }
}
