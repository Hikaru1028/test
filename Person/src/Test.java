

public class Test {
	public static void main(String[]args){


		Person taro=new Person();
		taro.name="山田太郎";
				taro.age=20;
                taro.phoneNumber="090-1111-1111";
                taro.address="東京";
                taro.talk();
                taro.walk();
                taro.run();
		System.out.println(taro.name);
		System.out.println(taro.age);
        System.out.println(taro.phoneNumber);

		Person jiro=new Person();
		jiro.name="木村次郎";
				jiro.age=18;
                jiro.phoneNumber="090-1234-5678";
                jiro.address="茨城";
                jiro.talk();
                jiro.walk();
                jiro.run();

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.address);
        System.out.println(jiro.phoneNumber);

		Person hanako=new Person();
		hanako.name="鈴木花子";
				hanako.age=16;
                hanako.address="新潟";
                hanako.phoneNumber="123-456-789";
                hanako.talk();
                hanako.walk();
                hanako.run();
        System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.address);
        System.out.println(hanako.phoneNumber);

		Person hikaru=new Person();
		hikaru.name="岸田光";
				hikaru.age=23;
				hikaru.address="新潟";
                hikaru.phoneNumber="123-456-789";
                hikaru.talk();
                hikaru.walk();
                hikaru.run();
		System.out.println(hikaru.name);
		System.out.println(hikaru.age);
		System.out.println(hikaru.address);
        System.out.println(hikaru.phoneNumber);

        Robot asimo=new Robot();
		asimo.name="asimo";

                asimo.talk();
                asimo.walk();
                asimo.run();


                Robot pepper=new Robot();
        		pepper.name="pepper";

                        pepper.talk();
                        pepper.walk();
                        pepper.run();


                        Robot aibo=new Robot();
                		aibo.name="aibo";

                                aibo.talk();
                                aibo.walk();
                                aibo.run();




	}





	}
