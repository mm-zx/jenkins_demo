package ren.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxiang
 * @since 2020/3/10
 * description:
 */
public class TestSwitch {
    public static void main(String[] args) {
        List<Item> aList = new ArrayList<>();
        aList.add(new Item(1));
        aList.add(new Item(2));
        aList.add(new Item(3));
        aList.add(new Item(4));
        aList.add(new Item(5));
        aList.add(new Item(6));
        aList.add(new Item(7));
        aList.add(new Item(8));
        aList.add(new Item(9));
        aList.add(new Item(10));

        List<Item> operateList1 = new ArrayList<>(aList);
        List<Item> bList = new ArrayList<>();
        bList.add(new Item(7));
        bList.add(new Item(8));
        bList.add(new Item(9));
        bList.add(new Item(10));
        bList.add(new Item(11));
        bList.add(new Item(12));
        bList.add(new Item(13));
        bList.add(new Item(14));
        bList.add(new Item(1));
        bList.add(new Item(2));

        List<Item> operateList2 = new ArrayList<>(bList);
        operateList1.removeAll(bList);
        operateList2.removeAll(aList);
        operateList1.addAll(operateList2);
        System.out.println(operateList1);
    }
}