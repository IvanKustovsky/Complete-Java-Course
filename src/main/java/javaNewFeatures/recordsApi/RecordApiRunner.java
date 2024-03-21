package javaNewFeatures.recordsApi;

public class RecordApiRunner {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord(7, "Ivan", "email@gmail.com");
        PersonRecord personRecord2 = new PersonRecord(8, "Eugene", "emailEugene@gmail.com");
        PersonRecord personRecord3 = new PersonRecord(8, "Eugene", "emailEugene@gmail.com");
        System.out.println(personRecord.equals(personRecord2));
        System.out.println(personRecord2.equals(personRecord3));
        System.out.println(personRecord);
        System.out.println(personRecord.name());
        System.out.println(personRecord2.email());
    }
}
