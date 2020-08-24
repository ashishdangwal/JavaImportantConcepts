class SimpleNew{
    void message(){System.out.println("Hello Java");}
}

class NewInstance{
    public static void main(String args[]){
        try{
            Class c=Class.forName("SimpleNew");
            SimpleNew s=(SimpleNew)c.newInstance();
            s.message();

        }catch(Exception e){System.out.println(e);}

    }
}