
class ExceptionChaining {
    
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                // Create a new exception with the original exception as the cause
                throw new Exception("New Exception: Division failed", e);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}
