import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    private int state= SOLD_OUT;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case  HAS_QUARTER:
                System.out.println("dont need another quarter");
                break;
            case SOLD_OUT:
                System.out.println("no candy now ");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("success");
                break;
            case SOLD:
                System.out.println("dont hurry, i am giving you a candy");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case  HAS_QUARTER:
                System.out.println("here is your money");
                state = NO_QUARTER;
                break;
            case SOLD_OUT:
                System.out.println("hhhhhh sold out and no money ");
                break;
            case NO_QUARTER:
                System.out.println("you haven't put a money yet");
                break;
            case SOLD:
                System.out.println("you got the candy cant have your money back");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case  HAS_QUARTER:
                System.out.println("selling");
                state = SOLD;
                dispense();
                break;
            case SOLD_OUT:
                System.out.println("no candy here ");
                break;
            case NO_QUARTER:
                System.out.println("you haven't put a money yet");
                break;
            case SOLD:
                System.out.println("you got the candy cant get another util you put money again");
                break;
        }
    }

    public void dispense() {
        switch (state) {
            case  HAS_QUARTER:
                System.out.println("no candy dispensed");
                break;
            case SOLD_OUT:
                System.out.println("no candy dispensed ");
                break;
            case NO_QUARTER:
                System.out.println("you haven't put a money yet");
                break;
            case SOLD:
                System.out.println("we are giving you the candy");
                count--;
                if (count == 0) {
                    System.out.println("sorry,the last one");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
                break;
        }

    }
}
