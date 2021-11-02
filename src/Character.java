public class Character {

    String name;
    int age;
    double wallet;

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void increaseWallet(double sum){
        this.wallet += sum;
    }
    public void decreaseWallet(double sum){
        this.wallet -= sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
