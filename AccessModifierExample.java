class AccessModifiersExample {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30;
    private int privateVariable = 40;
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    public void display() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Protected Variable: " + protectedVariable);
        System.out.println("Default Variable: " + defaultVariable);
        System.out.println("Private Variable: " + privateVariable);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println("Public Variable: " + example.publicVariable);
        example.publicMethod();
        System.out.println("Protected Variable: " + example.protectedVariable);
        example.protectedMethod();
        System.out.println("Default Variable: " + example.defaultVariable);
        example.defaultMethod();
        example.display();
    }
}
