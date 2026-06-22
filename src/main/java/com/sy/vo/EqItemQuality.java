package com.sy.vo;

public enum EqItemQuality {
    COMMON("5", 40),     // 权重40（最高）
    ELITE("4", 30),      // 新增中间品质，权重25
    UNCOMMON("3", 25),   // 权重20
    RARE("2", 2),       // 权重10
    LEGENDARY("1", 15);  // 权重5（最低）

    private final String qualityName;  // 对应商城表的quality字段
    private final int weight;          // 权重值

    EqItemQuality(String qualityName, int weight) {
        this.qualityName = qualityName;
        this.weight = weight;
    }

    public String getQualityName() {
        return qualityName;
    }

    public int getWeight() {
        return weight;
    }

    // 根据品质名称获取枚举（用于匹配商城表数据）
    public static EqItemQuality fromQualityName(String name) {
        for (EqItemQuality q : values()) {
            if (q.qualityName.equals(name)) return q;
        }
        return null;
    }
}
