package com.startapp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;

/* renamed from: com.startapp.y8 */
/* compiled from: Sta */
public class C12450y8<V> implements Callable<V> {

    /* renamed from: a */
    private final Callable<V> f55157a;

    public C12450y8(Callable<V> callable) {
        this.f55157a = callable;
    }

    /* renamed from: a */
    public static <T> Collection<? extends Callable<T>> m53794a(Collection<? extends Callable<T>> collection) {
        LinkedList linkedList = new LinkedList();
        for (Callable y8Var : collection) {
            linkedList.add(new C12450y8(y8Var));
        }
        return linkedList;
    }

    public V call() {
        try {
            return this.f55157a.call();
        } catch (Throwable th) {
            C12356u2.m53525c(th);
            return null;
        }
    }
}
