package netology;


public class Main {

    public static void main(String[] args) {
        Person me = new PersonBuilder().
                setName("Nikita").
                setSurname("H4iko").
                setAge(23).
                setAddress("Derevnya").
                build();

        Person you = new PersonBuilder().
                setName("Lina").
                setSurname("Makarova").
                setAge(-9).
                build();

        System.out.println(you);

        me.happyBirthday();

        System.out.println(me);

        Person son = me.newChildBuilder().
                setName("Nastya").
                build();

        System.out.println(son);
    }

}
