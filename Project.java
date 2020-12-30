package com.company.Session10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Project {
    static Country[] country;
    static int totalCountries;
    public static void main(String[] args) {
        System.out.println("We are creating countries templates");
        totalCountries= getNumberOfCountries("Enter Country sum");
        country= new Country[totalCountries];
        int count=0;
        while(count < totalCountries){
            addCountry(count);
            count ++;
        }
        displayItemDetails();
        getCountryAtIndex(2);
    }
    private static void displayItemDetails(){
        for (int i = 0; i < totalCountries; i++) {
            showCountry(i);
        }
    }

    private static int getNumberOfCountries(String m){
        System.out.println(m);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static void addCountry(int index){
        country[index]= new Country();
        country[index].setName("Country name");
        country[index].setPopulation("Country population");
    }
    private static void showCountry(int index){
        String name= country[index].getName();
        int population= country[index].getPopulation();
        System.out.println(name +   "     "+ population);
    }
    private static void getCountryAtIndex(int index){
        String name= country[index].getName();
        int population= country[index].getPopulation();
        System.out.println(name +   "     "+ population);
    }
}
class Country{
    private String name;
    private int population;


    public String getName() {
        return name;
    }

    public String setName(String m) {
        System.out.println(m);
        Scanner scan= new Scanner(System.in);
        this.name= scan.nextLine();
        return this.name;
    }

    public int getPopulation() {
        return population;
    }

    public int setPopulation(String m) {
        System.out.println(m);
        Scanner scan= new Scanner(System.in);
        this.population= scan.nextInt();
        return this.population;
    }

}