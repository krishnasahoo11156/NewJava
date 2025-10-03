package ConditionALoops;

import java.util.Scanner;
public class VolumeCone {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float height = sc.nextFloat();

        float volume = (3.14f * radius * radius * height) / 3f;
        System.out.println(volume);
    }
}
