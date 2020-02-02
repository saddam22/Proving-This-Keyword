
package ProvingThisKeyword;

public class ProvingThisKeyword {
    
    void m(){
        System.out.println(this);//prints same reference ID
    }
    public static void main(String[] args) {
        
        ProvingThisKeyword ptk = new ProvingThisKeyword();
        System.out.println(ptk);//prints the reference ID
        
        ptk.m();
    }
}
