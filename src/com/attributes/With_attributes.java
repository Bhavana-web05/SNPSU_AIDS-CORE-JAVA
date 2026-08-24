package com.attributes;

public class With_attributes {
        //take car for example
        //the 2 things below are attributes called as instance variable
        String brand ;
        int manudate ;

        // this is constructor it should have same name has class
        With_attributes(String b, int mdate) {
            // if we give the name for constructor attributes and  the attributes in starting same then we should use "this"
            // ex if String b is named String brand same as starting then
            // below it should be "this.brand=brand  and in main also it should be brand=BMW
            brand = b;
            manudate = mdate;
        }

        public static void main(String[] args) {
            With_attributes c1=new With_attributes("BMW",2000 );
            With_attributes c2=new With_attributes("Audi",2006 );

            c1.printDetails();
            c2.printDetails();

            /**
             * here
             * with_attribute = class
             * c1 = object
             * the with_attributes after new is constructor call
             * the next brand gives cal to the brand in constructor which gives call to the brand present at the starting
             */
        }

        void printDetails()
        {
            System.out.println("Brand: "+brand + " , " + "Manudate: "+manudate);

        }

    }

