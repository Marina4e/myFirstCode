package prog;

public class SwitchStatement {
    public static void main(String...args){
        switchSt("Nik");
        switchSt("Alice");
        switchSt("Me");
    }

    public static void switchSt(String sSwitch) {
        switch (sSwitch){
            case "Nik":
                System.out.println("this is Nik");
                break;
            case "Alice":
                System.out.println("this is Alice");
                break;
            case "Me":
                System.out.println("this is Me");
            default:
                System.out.println("this is a passengers");

        }
    }


}
