class Simple{}
interface My{}

class ReflectionTest{

    //Using Class.forName()
//    public static void main(String args[]){
//        Class c= null;
//        try {
//            c = Class.forName("Simple");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(c.getName());
//
//
//    }

    //Using getName()
//    void printName(Object obj){
//        Class c=obj.getClass();
//        System.out.println(c.getName());
//    }
//    public static void main(String args[]){
//        Simple s=new Simple();
//
//        ReflectionTest t=new ReflectionTest();
//        t.printName(s);
//    }

    //Using .class
//    public static void main(String args[]){
//        Class c = boolean.class;
//        System.out.println(c.getName());
//
//        Class c2 = ReflectionTest.class;
//        System.out.println(c2.getName());
//    }

    //Using isInterface() isClass()
    public static void main(String args[]){
        try{
            Class c=Class.forName("Simple");
            System.out.println(c.isInterface());

            Class c2=Class.forName("My");
            System.out.println(c2.isInterface());

        }catch(Exception e){System.out.println(e);}

    }
}
