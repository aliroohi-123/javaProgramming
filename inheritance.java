
class parent {
    public void dad() {
        System.out.println("i am your dad");
    }

}

class child extends parent {
    public void son() {
        System.out.println("i am your baby");
    }
}

class grandson extends child {

    public void show() {
        System.out.println("who the hell i am then");
    }
}

public class inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.son();
        c.dad();

    }
}
