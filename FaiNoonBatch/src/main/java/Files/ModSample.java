package Files;

import train.fai.console.FaiNoonBatch.Terrin;

public class ModSample extends Terrin {
    public void view(){
        System.out.println("Overridden from terrin");
        super.view();
    }
    // final method can't override
//    public void fibo(){
//        System.out.println("Overridden from terrin");
//    }
    public static void main(String[] args) {
        ModSample ter=new ModSample();
        ter.view();// public
        System.out.println("MAx is "+ter.findMax());// protected
        ter.fibo();// final
        //ter.differ();// default
    }
}
