package com.cock.latte.ec.main;

import android.graphics.Color;

import com.cock.latte.core.delegates.bottom.BaseBottomDelegate;
import com.cock.latte.core.delegates.bottom.BottomItemDelegate;
import com.cock.latte.core.delegates.bottom.BottomTabBean;
import com.cock.latte.core.delegates.bottom.ItemBuilder;
import com.cock.latte.ec.main.cart.ShopCartDelegate;
import com.cock.latte.ec.main.discover.DiscoverDelegate;
import com.cock.latte.ec.main.index.IndexDelegate;
import com.cock.latte.ec.main.personal.PersonalDelegate;
import com.cock.latte.ec.main.sort.SortDelegate;

import java.util.LinkedHashMap;

public class EcBottomDelegate extends BaseBottomDelegate {

    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "主页"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}", "分类"), new SortDelegate());
        items.put(new BottomTabBean("{fa-compass}", "发现"), new DiscoverDelegate());
        items.put(new BottomTabBean("{fa-shopping-cart}", "购物车"), new ShopCartDelegate());
        items.put(new BottomTabBean("{fa-user}", "我的"), new PersonalDelegate());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    //
    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }
}
