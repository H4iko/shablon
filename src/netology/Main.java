package netology;


public class Main {

    public static void main(String[] args) {
        Person me = new PersonBuilder().
                setName("Nikita").
                setSurname("H4iko").
                setAge(23).
                setAddress("Derevnya").
                build();
        me.happyBirthday();

        try {
            Person son = me.newChildBuilder().
                    setName("Nastya").
                    build();

            System.out.println(son);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person you = new PersonBuilder().
                    setName("Lina").
                    setSurname("Makarova").
                    setAge(-9).
                    build();

            System.out.println(you);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        System.out.println(me);
    }

}
