package train.fai.console.FaiNoonBatch;

public class AccessTerrin {
    public static void main(String[] args) {
        Terrin te=new Terrin();
        te.view();// public
        te.differ();// default
        System.out.println("MAx value is "+te.findMax());// protected
        te.fibo();// final
        //te.view();
    }
}
