public class Character {

    static String name;
    int age;
    double wallet;
    Casino casino;

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

    public void walletEmpty(){
        this.wallet = 0;
            System.out.println("You are all out of cash.. Now get out of here!");
            casino.quit();
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
