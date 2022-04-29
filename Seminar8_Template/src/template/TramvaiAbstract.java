package template;

public abstract class TramvaiAbstract {

    abstract void opriereStatie1();

    abstract void opriereStatie2();

    abstract void opriereStatie3();

    abstract void opriereStatie4();

    abstract void opriereStatie5();

    abstract void opriereStatie6();

    public final void parcurgeSensNormal(){
        opriereStatie1();
        opriereStatie2();
        opriereStatie3();
        opriereStatie4();
        opriereStatie5();
        opriereStatie6();
    }

    public final void parcurgereSensInvers(){
        opriereStatie6();
        opriereStatie5();
        opriereStatie4();
        opriereStatie3();
        opriereStatie2();
        opriereStatie1();
    }
}
