 class A{
        void display()
        {
            System.out.println("hello");
        }   

    }
    class B extends A
    {
        void dfgh()
        {
            System.out.println("world");
        }
        public static void main(String args[])
        {
            B a=new B();
            a.display();
            a.dfgh();

        }
    }
 