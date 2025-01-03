package demo;

import java.math.BigDecimal;


public class Student{

    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this. marks = marks;
    }
    public int getNumberOfMarks(){
        return marks.length;

    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int mark: marks ){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int maximumMark = 0;
        for(int mark: marks ){
            if(mark > maximumMark){
                maximumMark = mark;
                }
        }
        return maximumMark;
    }

    public int getMinimumMark(){
        int minimumMark = 0;
        for(int mark: marks ){
            if(mark < minimumMark){
                minimumMark = mark;
                }
        }
        return minimumMark;
    }

    public BigDecimal getAverageMarks(){
        double average = (double) getTotalSumOfMarks() / getNumberOfMarks();
    return BigDecimal.valueOf(average);
    }

    public void printStudentResult(){
        
        System.out.println("Number of Exams: " +  getNumberOfMarks());
        System.out.println("Total Marks: " +  getTotalSumOfMarks());
        System.out.println("Maximum Mark: " + getMaximumMark());
        System.out.println("Minimum Mark: " + getMinimumMark());
        System.out.println("Average Mark: " + getAverageMarks());
    }




}