package Interfaces;

import Visitors.Visitor;

public interface ITicketed {

    double defaultprice();

    double priceFor(Visitor visitor);

}
