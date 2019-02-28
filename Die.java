public class Die {

    protected Integer value;

    public Die(){
        this.value=(int) (Math.random() * 6) + 1;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

}