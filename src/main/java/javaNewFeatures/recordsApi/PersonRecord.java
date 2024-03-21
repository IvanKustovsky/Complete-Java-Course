package javaNewFeatures.recordsApi;

public record PersonRecord(long id, String name, String email) {
    static int number = 5; // only static is allowed

    @Override
    public String email() { // only public access modifier
        System.out.println("Email is valid.");
        return email;
    }
}
