package model;

import visitor.VisitorI;

public interface ProductI {
    void accept(VisitorI visitor);
}