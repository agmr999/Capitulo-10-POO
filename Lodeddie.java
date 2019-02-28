
public class Lodeddie{
    protected Integer value;

    public Lodeddie(){
        this.value=((int)(Math.random()*100)%6+2);
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }
}