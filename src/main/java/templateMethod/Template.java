package templateMethod;

public abstract class Template {


    protected abstract int calculate_value1();
    protected abstract int calculate_value2();


    public int calculate_result(){
        return calculate_value1()+calculate_value2();
    }


}
