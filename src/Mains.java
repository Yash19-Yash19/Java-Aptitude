//code for overloading and overriding in java

    class poly
    {
        void display()
        {
            System.out.println("This is the parent class");
        }
    }

    class poly1 extends poly
    {
        void display()
        {
            System.out.println("This is the child class");
        }
    }

    public class Mains
    {
        public static void main(String[] args)
        {
            poly obj = new poly1();
            obj.display();
        }
    }

    //Output: This is the child class