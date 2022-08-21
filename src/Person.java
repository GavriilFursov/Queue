public class Person {
    protected String name;
    protected int age;
    protected int ticket;

    public Person(String name, int age, int ticket) {
        this.name = name;
        this.age = age;
        this.ticket = ticket;
    }
    public int spendingTicket(){
        if (ticket > 0){
            ticket--;
        } return ticket;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ticket=" + ticket +
                '}';
    }
}
