package cn.victorplus.vehicle.tools;

import java.util.Collection;

public class ListUtil {
    public ListUtil() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }
}
