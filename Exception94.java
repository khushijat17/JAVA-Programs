class Exception94 {
    static void two() throws Exception {
        System.out.println("Expcetion from two()");
        throw new Exception("Exception thrown by method2");
    }
    
    static void one() throws Exception {
        try {
            two();
        } catch(Exception e) {
            System.out.println("Expcetion from one()");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            one();
        } catch(Exception e) {
            System.out.println(" Rethrown Exception ");
        }
        System.out.println("Rest of the program continues...");
    }
}

