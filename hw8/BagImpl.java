package com.shop.bag;

import com.shop.Shelf.AppleShelf;
import com.shop.position.Position;
import com.shop.position.impl.Apple;
import com.shop.position.impl.Pen;
import com.shop.position.impl.abst.AbstractPosition;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * Created by cube on 21.02.2018.
 */
public class BagImpl implements Bag {
    private static final int SIZE = 10;

    private Position[] positions = new Position[SIZE];

    private int realIndex = 0;

    private int iteratorIndex = 0;


    public Position[] getPositions() {
        return positions;
    }

    public void setPositions(Position[] positions) {
        this.positions = positions;
    }

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public boolean add(Position position) {
        positions[realIndex++] = position;
        return true;
    }

    public boolean haveNext() {
        return iteratorIndex < realIndex;
    }

    public Position next() {
        return positions[iteratorIndex++];
    }

    public void initIterator() {
        iteratorIndex = 0;
    }


    public void sort() {

        Arrays.sort(positions, new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                if (o1 == null || o2 == null) {
                    next();
                } else {
                    if (o1.getPrice() < o2.getPrice()) {
                        return -1;
                    } else if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
                return -1;

            }

        });
    }
}
