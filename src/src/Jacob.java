package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 07/10/2021
 */

public class Jacob {

   private int age;
   private String hobby;

    public Jacob(int age) {
        this.age = age;
    }

    public Jacob() {
    }

    public Jacob(int age, String hobby) {
        this.age = age;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
