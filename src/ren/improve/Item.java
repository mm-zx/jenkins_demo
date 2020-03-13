package ren.improve;

/**
 * @author zhouxiang
 * @since 2020/3/10
 * description:
 */
public class Item {
    private Integer a;

    Item(Integer a) {
        this.a = a;
    }

    public Integer getA() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return a.equals(((Item) obj).getA());
        }

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return a + "";
    }
}
