public class Node {
    //This is the only field you need for your implementation
    private Integer value;

    public Node(int value){
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}