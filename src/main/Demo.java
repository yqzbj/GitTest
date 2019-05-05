public class Demo {


    private Deli de;

    public Demo(){
        de = new Deli();
    }

    private int age;




    public int getAge() {
        return age;
    }


    public void setAge(int age) {

        if(age > 0)
//        de.setAges(age);
        de.getName();
        System.out.println(de.getAge());


        this.age = age;
    }


//	public static void main(String[] args) {
//
//		Deli demo = new Deli();
//
//		int ss= demo.getAge();
//		System.out.println("     "+ss);
//			}
//

}

class Deli{

    private String name;
    private int ages;


    public String getName() {
        if(ages > 0)
            System.out.println(ages);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {

        System.out.println("------"+ages);
        return ages;

    }
    public void setAges(int age) {
        ages = age;
    }




}
