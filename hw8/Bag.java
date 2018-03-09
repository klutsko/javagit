package com.shop.bag;

import com.shop.position.Position;

/**
 * Created by cube on 21.02.2018.
 */
public interface Bag {
    int getNotUsedSize();

    boolean add(Position position);

    boolean haveNext();

    Position next();

    void initIterator();

}
