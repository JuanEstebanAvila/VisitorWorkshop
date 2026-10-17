package visitor;

import model.ComputerT;
import model.Laptop;
import model.TV;
import model.Tablet;

 public interface VisitorI {
     void visit(Laptop laptop);
    
     void visit(TV tv);

    void visit(Tablet tablet);

    void visit(ComputerT computer);
}
