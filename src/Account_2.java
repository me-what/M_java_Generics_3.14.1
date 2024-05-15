class Account_2 implements Accountable<String>{

    private String id;
    private int sum;

    Account_2(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}