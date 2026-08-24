package com.snpsu.oop.pillars.abstraction.partial;

abstract class RBI {
    abstract int ROI();//intrest is hided becoz it is abstarcted
    void welcome(){ //but here welcome is not hide
        System.out.println("Welcome to RBI");
    }
    static void termsandconditions(){//static function,,static method cannot made be hide and also cannot be override by child
        System.out.println("Terms and Conditions");
    }
}
class HDFC extends RBI{
    int ROI(){
        return 8;
    }
    void welcome(){
        System.out.println("Welcome to HDFC");
    }

}
class SBI extends RBI{
    int ROI(){
        return 9;
    }
    void welcome(){
        System.out.println("Welcome to SBI");
    }
}
class DriverCode1{
    public static void main(String[] args){
        HDFC hdfc = new HDFC();
        System.out.println(hdfc.ROI());
        hdfc.welcome();
        RBI.termsandconditions();
        SBI sbi = new SBI();
        System.out.println(sbi.ROI());
        sbi.welcome();
        RBI.termsandconditions();
    }
}



