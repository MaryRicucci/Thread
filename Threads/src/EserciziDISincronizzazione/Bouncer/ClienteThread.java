package EserciziDISincronizzazione.Bouncer;

public class ClienteThread extends Thread{
    private int age;
    private  Buttafuori b ;
    public ClienteThread(int age, Buttafuori b,String name) {
        this.age = age;
        this.b = b;
        setName(name);
    }

    public int getAge() {
        return age;
    }

    @Override
    public void run () {
        b.Entra(age);
    }

}
