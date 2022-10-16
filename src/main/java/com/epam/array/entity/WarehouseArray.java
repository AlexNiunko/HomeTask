package com.epam.array.entity;

import java.util.HashMap;
import java.util.Map;

public class WarehouseArray {

    private static WarehouseArray warehouseArrayInstance;
    private Map<Long,MathParams> params=new HashMap<>();

    private WarehouseArray() {
    }

    public static WarehouseArray getInstance() {
        if (warehouseArrayInstance == null) {
            warehouseArrayInstance = new WarehouseArray();
        }
        return warehouseArrayInstance;
    }

    public MathParams get(Long key) {
        return params.get(key);
    }

    public MathParams put(Long key, MathParams value) {
        return params.put(key, value);
    }

    public void putAll(Map< Long,MathParams> m) {
        params.putAll(m);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WarehouseArray{");
        sb.append("params=").append(params);
        sb.append('}');
        return sb.toString();
    }
}
