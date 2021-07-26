package generics;

import java.util.Optional;

public class GenTest<T> {
    T obj;
    public GenTest(){
        //this.obj=obj;
    }
    T getObj(){
        return obj;
    }
    void setObj(T Obj){
        this.obj=obj;
    }
}
class Test{
    public static void main(String[] args) {
        GenTest<String> test=new GenTest<String>();
        test.setObj("sadasiva");

        /*GenTest<Integer> test1=new GenTest<Integer>();
        test.setObj(123);*/
    }
}
